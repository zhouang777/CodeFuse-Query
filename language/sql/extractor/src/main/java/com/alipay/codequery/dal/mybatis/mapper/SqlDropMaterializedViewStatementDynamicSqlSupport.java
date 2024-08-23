package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropMaterializedViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_materialized_view_statement")
    public static final SqlDropMaterializedViewStatement sqlDropMaterializedViewStatement = new SqlDropMaterializedViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_materialized_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropMaterializedViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_materialized_view_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropMaterializedViewStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_materialized_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropMaterializedViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_materialized_view_statement")
    public static final class SqlDropMaterializedViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropMaterializedViewStatement() {
            super("sql_drop_materialized_view_statement");
        }
    }
}