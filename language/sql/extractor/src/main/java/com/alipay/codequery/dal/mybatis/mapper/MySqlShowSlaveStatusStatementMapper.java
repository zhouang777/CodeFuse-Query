package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlShowSlaveStatusStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlShowSlaveStatusStatement;
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
public interface MySqlShowSlaveStatusStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlShowSlaveStatusStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlShowSlaveStatusStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    Optional<MySqlShowSlaveStatusStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<MySqlShowSlaveStatusStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlShowSlaveStatusStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlShowSlaveStatusStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default int insert(MySqlShowSlaveStatusStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowSlaveStatusStatement, c ->
            c.map(oid).toProperty("oid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default int insertMultiple(Collection<MySqlShowSlaveStatusStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlShowSlaveStatusStatement, c ->
            c.map(oid).toProperty("oid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default int insertSelective(MySqlShowSlaveStatusStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlShowSlaveStatusStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default Optional<MySqlShowSlaveStatusStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlShowSlaveStatusStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default List<MySqlShowSlaveStatusStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlShowSlaveStatusStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default List<MySqlShowSlaveStatusStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlShowSlaveStatusStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlShowSlaveStatusStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlShowSlaveStatusStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_slave_status_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlShowSlaveStatusStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid);
    }
}