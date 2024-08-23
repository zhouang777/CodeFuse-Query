package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDateTimeExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDateTimeExpr;
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
public interface SqlDateTimeExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, literalOid, value);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDateTimeExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDateTimeExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="literal_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlDateTimeExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="literal_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlDateTimeExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDateTimeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDateTimeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int insert(SqlDateTimeExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDateTimeExpr, c ->
            c.map(oid).toProperty("oid")
            .map(literalOid).toProperty("literalOid")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int insertMultiple(Collection<SqlDateTimeExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDateTimeExpr, c ->
            c.map(oid).toProperty("oid")
            .map(literalOid).toProperty("literalOid")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int insertSelective(SqlDateTimeExpr record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDateTimeExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(literalOid).toPropertyWhenPresent("literalOid", record::getLiteralOid)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default Optional<SqlDateTimeExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDateTimeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default List<SqlDateTimeExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDateTimeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default List<SqlDateTimeExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDateTimeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default Optional<SqlDateTimeExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDateTimeExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDateTimeExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(literalOid).equalTo(record::getLiteralOid)
                .set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDateTimeExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(literalOid).equalToWhenPresent(record::getLiteralOid)
                .set(value).equalToWhenPresent(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int updateByPrimaryKey(SqlDateTimeExpr record) {
        return update(c ->
            c.set(literalOid).equalTo(record::getLiteralOid)
            .set(value).equalTo(record::getValue)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_date_time_expr")
    default int updateByPrimaryKeySelective(SqlDateTimeExpr record) {
        return update(c ->
            c.set(literalOid).equalToWhenPresent(record::getLiteralOid)
            .set(value).equalToWhenPresent(record::getValue)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}