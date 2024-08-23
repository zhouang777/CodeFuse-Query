package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlShowViewsStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlShowViewsStatement;
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
public interface SqlShowViewsStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, databaseOid, likeOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlShowViewsStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlShowViewsStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlShowViewsStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="like_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlShowViewsStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlShowViewsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlShowViewsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int insert(SqlShowViewsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlShowViewsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(likeOid).toProperty("likeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int insertMultiple(Collection<SqlShowViewsStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlShowViewsStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(likeOid).toProperty("likeOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int insertSelective(SqlShowViewsStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlShowViewsStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(databaseOid).toPropertyWhenPresent("databaseOid", record::getDatabaseOid)
            .map(likeOid).toPropertyWhenPresent("likeOid", record::getLikeOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default Optional<SqlShowViewsStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlShowViewsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default List<SqlShowViewsStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlShowViewsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default List<SqlShowViewsStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlShowViewsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default Optional<SqlShowViewsStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlShowViewsStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlShowViewsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(databaseOid).equalTo(record::getDatabaseOid)
                .set(likeOid).equalTo(record::getLikeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlShowViewsStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
                .set(likeOid).equalToWhenPresent(record::getLikeOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int updateByPrimaryKey(SqlShowViewsStatement record) {
        return update(c ->
            c.set(databaseOid).equalTo(record::getDatabaseOid)
            .set(likeOid).equalTo(record::getLikeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_views_statement")
    default int updateByPrimaryKeySelective(SqlShowViewsStatement record) {
        return update(c ->
            c.set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
            .set(likeOid).equalToWhenPresent(record::getLikeOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}