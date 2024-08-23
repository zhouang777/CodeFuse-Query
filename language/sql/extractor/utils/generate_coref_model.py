#!python3

"""根据 coref_er_diagram.puml 生成 Java 相关文件

Author: 友恒 <zhengxunjin.zx@antgroup.com>

"""

import re
from pathlib import Path
from typing import Callable, List, Optional

from jinja2 import Environment, FileSystemLoader
from dataclasses import dataclass

sqlite_2_java_type_map = {
    "INTEGER": {
        "java_type": "java.lang.Integer",
        "jdbc_type": "BIGINT",
        "sql_type": "INTEGER",
    },
    "TEXT": {
        "java_type": "java.lang.String",
        "jdbc_type": "VARCHAR",
        "sql_type": "TEXT",
    },
}

JAVA_OID_TYPE = "java.lang.Long"
OID_SUFFIX = "oid"

@dataclass
class Column:
    name: str
    type: str
    java_type: str
    jdbc_type: str
    is_pk: bool = False


@dataclass
class Table:
    name: str
    column_list: List[Column]
    pk_index: int


def parse_puml_er(puml_er_str: str) -> List[Table]:
    """ 解析 puml ER 图的内容

    Format:
        entity location {
            oid: INTEGER
            file_oid: INTEGER
            start_line_number: INTEGER
            start_column_number: INTEGER
            end_line_number: INTEGER
            end_column_number: INTEGER
        }

    Returns: 
        table_list: 解析后的 Table 列表

    """

    table_list: List[Table] = []

    # 匹配每一个 ER 图中 entity 的内容
    entity_regex = r"(?<=\nentity ).+ \{[^\}]+\}"
    matches = re.finditer(entity_regex, puml_er_str, re.MULTILINE)
    for match in matches:
        entity_str = match.group()

        # 匹配表名
        table_name_regex = r".+(?= \{)"
        table_name_match = re.search(
            pattern=table_name_regex,
            string=entity_str
        )
        if table_name_match is None:
            continue
        table_name = table_name_match.group()

        # 匹配全部列的内容
        column_content_regex = r"(?<=\{).+(?=\})"
        column_content_match = re.search(
            pattern=column_content_regex,
            string=entity_str,
            flags=re.MULTILINE | re.DOTALL
        )
        if column_content_match is None:
            continue
        column_content = column_content_match.group().strip()

        # 获取每一个列名和类型
        column_desc_list = [x.strip() for x in column_content.splitlines()]
        column_desc_list = [x for x in column_desc_list if x]
        column_list: List[Column] = []
        pk_index = -1
        for column_desc in column_desc_list:
            if column_desc.startswith("'"):
                continue

            column_desc_list = [x.strip() for x in column_desc.split(" ")]
            column_desc_list = [x for x in column_desc_list if x]
            column_name = column_desc_list[0]
            if column_name.endswith(":"):
                column_name = column_name[:-1]

            column_type = column_desc_list[1]
            column_java_type = JAVA_OID_TYPE if column_name.endswith(OID_SUFFIX) else sqlite_2_java_type_map.get(column_type)['java_type']
            if column_java_type is None:
                raise RuntimeError(f"Cannot convert column type to java type: {column_type}")
            
            column_jdbc_type = sqlite_2_java_type_map.get(column_type)['jdbc_type']
            if column_jdbc_type is None:
                raise RuntimeError(f"Cannot convert column type to jdbc type: {column_type}")

            is_pk = len(column_desc_list) == 3 and column_desc_list[2] == "<<PK>>"
            if is_pk:
                pk_index = len(column_list)

            column = Column(
                name=column_name,
                type=column_type,
                java_type=column_java_type,
                jdbc_type=column_jdbc_type,
                is_pk=is_pk,
            )
            column_list.append(column)

        table = Table(
            name=table_name,
            column_list=column_list,
            pk_index=pk_index,
        )

        table_list.append(table)

    return sorted(table_list, key=lambda t: t.name)


def render_templates(env: Environment, table_list, filter_func: Optional[Callable[[str], bool]] = None):
    templates = env.list_templates(filter_func=filter_func) if filter_func else env.list_templates(extensions='j2')
    
    for template_name in templates:
        template = env.get_template(template_name)

        template_path = Path(template.filename)
        rendered_path = (template_path.parent / template_path.stem).resolve()
        print(f'Generated successfully to {rendered_path}')
        with open(rendered_path, 'w') as f:
            f.write(template.render(table_list=table_list))


if __name__ == '__main__':
    script_path = Path(__file__)

    dir_name = Path(script_path).parent
    with open(Path(dir_name, '..', 'coref_er_diagram.puml'), 'r', encoding='utf-8') as fp:
        puml_er_str = fp.read()

    table_list = parse_puml_er(puml_er_str=puml_er_str)

    env = Environment(loader=FileSystemLoader(dir_name.parent),
                      keep_trailing_newline=True)

    render_templates(env, table_list, lambda x: x in ('src/main/resources/dbschema.sql.j2', 'src/main/resources/generatorConfig.xml.j2'))
