package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableEnableKeysDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableEnableKeys;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SqlAlterTableEnableKeysMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    BasicColumn[] selectList = BasicColumn.columnList(oid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableEnableKeys> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableEnableKeys> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    Optional<SqlAlterTableEnableKeys> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<SqlAlterTableEnableKeys> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableEnableKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableEnableKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default int insert(SqlAlterTableEnableKeys record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableEnableKeys, c ->
            c.map(oid).toProperty("oid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default int insertMultiple(Collection<SqlAlterTableEnableKeys> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableEnableKeys, c ->
            c.map(oid).toProperty("oid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default int insertSelective(SqlAlterTableEnableKeys record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableEnableKeys, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default Optional<SqlAlterTableEnableKeys> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableEnableKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default List<SqlAlterTableEnableKeys> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableEnableKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default List<SqlAlterTableEnableKeys> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableEnableKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableEnableKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableEnableKeys record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableEnableKeys record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid);
    }
}