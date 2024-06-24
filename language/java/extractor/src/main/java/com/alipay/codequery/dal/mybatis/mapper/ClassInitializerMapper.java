package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ClassInitializerDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.ClassInitializer;
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
public interface ClassInitializerMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, debugMessage, parentHashId, locationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ClassInitializer> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ClassInitializer> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<ClassInitializer> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="debug_message", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ClassInitializer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, classInitializer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, classInitializer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default int insert(ClassInitializer record) {
        return MyBatis3Utils.insert(this::insert, record, classInitializer, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default int insertMultiple(Collection<ClassInitializer> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, classInitializer, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(debugMessage).toProperty("debugMessage")
            .map(parentHashId).toProperty("parentHashId")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default int insertSelective(ClassInitializer record) {
        return MyBatis3Utils.insert(this::insert, record, classInitializer, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(debugMessage).toPropertyWhenPresent("debugMessage", record::getDebugMessage)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default Optional<ClassInitializer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, classInitializer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default List<ClassInitializer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, classInitializer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default List<ClassInitializer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, classInitializer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, classInitializer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    static UpdateDSL<UpdateModel> updateAllColumns(ClassInitializer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(debugMessage).equalTo(record::getDebugMessage)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(locationHashId).equalTo(record::getLocationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_initializer")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ClassInitializer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(debugMessage).equalToWhenPresent(record::getDebugMessage)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId);
    }
}