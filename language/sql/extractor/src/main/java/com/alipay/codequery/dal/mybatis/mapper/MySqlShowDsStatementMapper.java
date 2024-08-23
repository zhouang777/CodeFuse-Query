package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlShowDsStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlShowDsStatement;
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
public interface MySqlShowDsStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, limitOid, orderByOid, whereOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlShowDsStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlShowDsStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlShowDsStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="where_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlShowDsStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlShowDsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlShowDsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int insert(MySqlShowDsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowDsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(limitOid).toProperty("limitOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int insertMultiple(Collection<MySqlShowDsStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlShowDsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(limitOid).toProperty("limitOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(whereOid).toProperty("whereOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int insertSelective(MySqlShowDsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowDsStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(whereOid).toPropertyWhenPresent("whereOid", record::getWhereOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default Optional<MySqlShowDsStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlShowDsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default List<MySqlShowDsStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlShowDsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default List<MySqlShowDsStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlShowDsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default Optional<MySqlShowDsStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlShowDsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlShowDsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(whereOid).equalTo(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlShowDsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(whereOid).equalToWhenPresent(record::getWhereOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int updateByPrimaryKey(MySqlShowDsStatement record) {
        return update(c ->
            c.set(limitOid).equalTo(record::getLimitOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(whereOid).equalTo(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ds_statement")
    default int updateByPrimaryKeySelective(MySqlShowDsStatement record) {
        return update(c ->
            c.set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(whereOid).equalToWhenPresent(record::getWhereOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}