package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlRenameSequenceStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlRenameSequenceStatement;
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
public interface MySqlRenameSequenceStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, nameOid, toOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlRenameSequenceStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlRenameSequenceStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlRenameSequenceStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlRenameSequenceStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlRenameSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlRenameSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int insert(MySqlRenameSequenceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlRenameSequenceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(nameOid).toProperty("nameOid")
            .map(toOid).toProperty("toOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int insertMultiple(Collection<MySqlRenameSequenceStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlRenameSequenceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(nameOid).toProperty("nameOid")
            .map(toOid).toProperty("toOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int insertSelective(MySqlRenameSequenceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlRenameSequenceStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(toOid).toPropertyWhenPresent("toOid", record::getToOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default Optional<MySqlRenameSequenceStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlRenameSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default List<MySqlRenameSequenceStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlRenameSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default List<MySqlRenameSequenceStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlRenameSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default Optional<MySqlRenameSequenceStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlRenameSequenceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlRenameSequenceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(toOid).equalTo(record::getToOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlRenameSequenceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(toOid).equalToWhenPresent(record::getToOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int updateByPrimaryKey(MySqlRenameSequenceStatement record) {
        return update(c ->
            c.set(nameOid).equalTo(record::getNameOid)
            .set(toOid).equalTo(record::getToOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    default int updateByPrimaryKeySelective(MySqlRenameSequenceStatement record) {
        return update(c ->
            c.set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(toOid).equalToWhenPresent(record::getToOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}