package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlTableDataTypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlTableDataType;
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
public interface SqlTableDataTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    BasicColumn[] selectList = BasicColumn.columnList(oid, isInt, isNumberic, isString, isWithLocalTimeZone, name, withTimeZone);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlTableDataType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlTableDataType> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_int", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_numberic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_string", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlTableDataType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="is_int", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_numberic", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_string", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_with_local_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="with_time_zone", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlTableDataType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlTableDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlTableDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int insert(SqlTableDataType record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableDataType, c ->
            c.map(oid).toProperty("oid")
            .map(isInt).toProperty("isInt")
            .map(isNumberic).toProperty("isNumberic")
            .map(isString).toProperty("isString")
            .map(isWithLocalTimeZone).toProperty("isWithLocalTimeZone")
            .map(name).toProperty("name")
            .map(withTimeZone).toProperty("withTimeZone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int insertMultiple(Collection<SqlTableDataType> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlTableDataType, c ->
            c.map(oid).toProperty("oid")
            .map(isInt).toProperty("isInt")
            .map(isNumberic).toProperty("isNumberic")
            .map(isString).toProperty("isString")
            .map(isWithLocalTimeZone).toProperty("isWithLocalTimeZone")
            .map(name).toProperty("name")
            .map(withTimeZone).toProperty("withTimeZone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int insertSelective(SqlTableDataType record) {
        return MyBatis3Utils.insert(this::insert, record, sqlTableDataType, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(isInt).toPropertyWhenPresent("isInt", record::getIsInt)
            .map(isNumberic).toPropertyWhenPresent("isNumberic", record::getIsNumberic)
            .map(isString).toPropertyWhenPresent("isString", record::getIsString)
            .map(isWithLocalTimeZone).toPropertyWhenPresent("isWithLocalTimeZone", record::getIsWithLocalTimeZone)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(withTimeZone).toPropertyWhenPresent("withTimeZone", record::getWithTimeZone)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default Optional<SqlTableDataType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlTableDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default List<SqlTableDataType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlTableDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default List<SqlTableDataType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlTableDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default Optional<SqlTableDataType> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlTableDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlTableDataType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(isInt).equalTo(record::getIsInt)
                .set(isNumberic).equalTo(record::getIsNumberic)
                .set(isString).equalTo(record::getIsString)
                .set(isWithLocalTimeZone).equalTo(record::getIsWithLocalTimeZone)
                .set(name).equalTo(record::getName)
                .set(withTimeZone).equalTo(record::getWithTimeZone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlTableDataType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(isInt).equalToWhenPresent(record::getIsInt)
                .set(isNumberic).equalToWhenPresent(record::getIsNumberic)
                .set(isString).equalToWhenPresent(record::getIsString)
                .set(isWithLocalTimeZone).equalToWhenPresent(record::getIsWithLocalTimeZone)
                .set(name).equalToWhenPresent(record::getName)
                .set(withTimeZone).equalToWhenPresent(record::getWithTimeZone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int updateByPrimaryKey(SqlTableDataType record) {
        return update(c ->
            c.set(isInt).equalTo(record::getIsInt)
            .set(isNumberic).equalTo(record::getIsNumberic)
            .set(isString).equalTo(record::getIsString)
            .set(isWithLocalTimeZone).equalTo(record::getIsWithLocalTimeZone)
            .set(name).equalTo(record::getName)
            .set(withTimeZone).equalTo(record::getWithTimeZone)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_data_type")
    default int updateByPrimaryKeySelective(SqlTableDataType record) {
        return update(c ->
            c.set(isInt).equalToWhenPresent(record::getIsInt)
            .set(isNumberic).equalToWhenPresent(record::getIsNumberic)
            .set(isString).equalToWhenPresent(record::getIsString)
            .set(isWithLocalTimeZone).equalToWhenPresent(record::getIsWithLocalTimeZone)
            .set(name).equalToWhenPresent(record::getName)
            .set(withTimeZone).equalToWhenPresent(record::getWithTimeZone)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}