package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OracleAlterTriggerStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OracleAlterTriggerStatement;
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
public interface OracleAlterTriggerStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, enable, isCompile, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OracleAlterTriggerStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OracleAlterTriggerStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OracleAlterTriggerStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="enable", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_compile", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OracleAlterTriggerStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, oracleAlterTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, oracleAlterTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int insert(OracleAlterTriggerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleAlterTriggerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(enable).toProperty("enable")
            .map(isCompile).toProperty("isCompile")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int insertMultiple(Collection<OracleAlterTriggerStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, oracleAlterTriggerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(enable).toProperty("enable")
            .map(isCompile).toProperty("isCompile")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int insertSelective(OracleAlterTriggerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, oracleAlterTriggerStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(enable).toPropertyWhenPresent("enable", record::getEnable)
            .map(isCompile).toPropertyWhenPresent("isCompile", record::getIsCompile)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default Optional<OracleAlterTriggerStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, oracleAlterTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default List<OracleAlterTriggerStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, oracleAlterTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default List<OracleAlterTriggerStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, oracleAlterTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default Optional<OracleAlterTriggerStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, oracleAlterTriggerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OracleAlterTriggerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(enable).equalTo(record::getEnable)
                .set(isCompile).equalTo(record::getIsCompile)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OracleAlterTriggerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(isCompile).equalToWhenPresent(record::getIsCompile)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int updateByPrimaryKey(OracleAlterTriggerStatement record) {
        return update(c ->
            c.set(enable).equalTo(record::getEnable)
            .set(isCompile).equalTo(record::getIsCompile)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    default int updateByPrimaryKeySelective(OracleAlterTriggerStatement record) {
        return update(c ->
            c.set(enable).equalToWhenPresent(record::getEnable)
            .set(isCompile).equalToWhenPresent(record::getIsCompile)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}