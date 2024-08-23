package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.PgDeleteStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.PgDeleteStatement;
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
public interface PgDeleteStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, isReturning);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PgDeleteStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<PgDeleteStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_returning", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<PgDeleteStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_returning", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<PgDeleteStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pgDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pgDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int insert(PgDeleteStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgDeleteStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(isReturning).toProperty("isReturning")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int insertMultiple(Collection<PgDeleteStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pgDeleteStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(isReturning).toProperty("isReturning")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int insertSelective(PgDeleteStatement record) {
        return MyBatis3Utils.insert(this::insert, record, pgDeleteStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(isReturning).toPropertyWhenPresent("isReturning", record::getIsReturning)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default Optional<PgDeleteStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pgDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default List<PgDeleteStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pgDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default List<PgDeleteStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pgDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default Optional<PgDeleteStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pgDeleteStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(PgDeleteStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(isReturning).equalTo(record::getIsReturning);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PgDeleteStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(isReturning).equalToWhenPresent(record::getIsReturning);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int updateByPrimaryKey(PgDeleteStatement record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(isReturning).equalTo(record::getIsReturning)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    default int updateByPrimaryKeySelective(PgDeleteStatement record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(isReturning).equalToWhenPresent(record::getIsReturning)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}