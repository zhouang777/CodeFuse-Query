package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCopyFromStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCopyFromStatement;
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
public interface SqlCopyFromStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, accessKeyIdOid, accessKeySecretOid, fromOid, tableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCopyFromStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCopyFromStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="access_key_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="access_key_secret_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCopyFromStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="access_key_id_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="access_key_secret_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="from_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCopyFromStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCopyFromStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCopyFromStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int insert(SqlCopyFromStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCopyFromStatement, c ->
            c.map(oid).toProperty("oid")
            .map(accessKeyIdOid).toProperty("accessKeyIdOid")
            .map(accessKeySecretOid).toProperty("accessKeySecretOid")
            .map(fromOid).toProperty("fromOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int insertMultiple(Collection<SqlCopyFromStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCopyFromStatement, c ->
            c.map(oid).toProperty("oid")
            .map(accessKeyIdOid).toProperty("accessKeyIdOid")
            .map(accessKeySecretOid).toProperty("accessKeySecretOid")
            .map(fromOid).toProperty("fromOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int insertSelective(SqlCopyFromStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCopyFromStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(accessKeyIdOid).toPropertyWhenPresent("accessKeyIdOid", record::getAccessKeyIdOid)
            .map(accessKeySecretOid).toPropertyWhenPresent("accessKeySecretOid", record::getAccessKeySecretOid)
            .map(fromOid).toPropertyWhenPresent("fromOid", record::getFromOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default Optional<SqlCopyFromStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCopyFromStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default List<SqlCopyFromStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCopyFromStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default List<SqlCopyFromStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCopyFromStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default Optional<SqlCopyFromStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCopyFromStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCopyFromStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(accessKeyIdOid).equalTo(record::getAccessKeyIdOid)
                .set(accessKeySecretOid).equalTo(record::getAccessKeySecretOid)
                .set(fromOid).equalTo(record::getFromOid)
                .set(tableOid).equalTo(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCopyFromStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(accessKeyIdOid).equalToWhenPresent(record::getAccessKeyIdOid)
                .set(accessKeySecretOid).equalToWhenPresent(record::getAccessKeySecretOid)
                .set(fromOid).equalToWhenPresent(record::getFromOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int updateByPrimaryKey(SqlCopyFromStatement record) {
        return update(c ->
            c.set(accessKeyIdOid).equalTo(record::getAccessKeyIdOid)
            .set(accessKeySecretOid).equalTo(record::getAccessKeySecretOid)
            .set(fromOid).equalTo(record::getFromOid)
            .set(tableOid).equalTo(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    default int updateByPrimaryKeySelective(SqlCopyFromStatement record) {
        return update(c ->
            c.set(accessKeyIdOid).equalToWhenPresent(record::getAccessKeyIdOid)
            .set(accessKeySecretOid).equalToWhenPresent(record::getAccessKeySecretOid)
            .set(fromOid).equalToWhenPresent(record::getFromOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}