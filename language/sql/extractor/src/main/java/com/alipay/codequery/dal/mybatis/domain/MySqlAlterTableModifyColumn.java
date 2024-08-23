package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterTableModifyColumn implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.after_column_oid")
    private Long afterColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.first_column_oid")
    private Long firstColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.is_first")
    private Integer isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.new_column_definition_oid")
    private Long newColumnDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public MySqlAlterTableModifyColumn(Long oid, Long afterColumnOid, Long firstColumnOid, Integer isFirst, Long newColumnDefinitionOid) {
        this.oid = oid;
        this.afterColumnOid = afterColumnOid;
        this.firstColumnOid = firstColumnOid;
        this.isFirst = isFirst;
        this.newColumnDefinitionOid = newColumnDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public MySqlAlterTableModifyColumn() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.after_column_oid")
    public Long getAfterColumnOid() {
        return afterColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.after_column_oid")
    public void setAfterColumnOid(Long afterColumnOid) {
        this.afterColumnOid = afterColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.first_column_oid")
    public Long getFirstColumnOid() {
        return firstColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.first_column_oid")
    public void setFirstColumnOid(Long firstColumnOid) {
        this.firstColumnOid = firstColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.is_first")
    public Integer getIsFirst() {
        return isFirst;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.is_first")
    public void setIsFirst(Integer isFirst) {
        this.isFirst = isFirst;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.new_column_definition_oid")
    public Long getNewColumnDefinitionOid() {
        return newColumnDefinitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.new_column_definition_oid")
    public void setNewColumnDefinitionOid(Long newColumnDefinitionOid) {
        this.newColumnDefinitionOid = newColumnDefinitionOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MySqlAlterTableModifyColumn other = (MySqlAlterTableModifyColumn) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAfterColumnOid() == null ? other.getAfterColumnOid() == null : this.getAfterColumnOid().equals(other.getAfterColumnOid()))
            && (this.getFirstColumnOid() == null ? other.getFirstColumnOid() == null : this.getFirstColumnOid().equals(other.getFirstColumnOid()))
            && (this.getIsFirst() == null ? other.getIsFirst() == null : this.getIsFirst().equals(other.getIsFirst()))
            && (this.getNewColumnDefinitionOid() == null ? other.getNewColumnDefinitionOid() == null : this.getNewColumnDefinitionOid().equals(other.getNewColumnDefinitionOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAfterColumnOid() == null) ? 0 : getAfterColumnOid().hashCode());
        result = prime * result + ((getFirstColumnOid() == null) ? 0 : getFirstColumnOid().hashCode());
        result = prime * result + ((getIsFirst() == null) ? 0 : getIsFirst().hashCode());
        result = prime * result + ((getNewColumnDefinitionOid() == null) ? 0 : getNewColumnDefinitionOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", afterColumnOid=").append(afterColumnOid);
        sb.append(", firstColumnOid=").append(firstColumnOid);
        sb.append(", isFirst=").append(isFirst);
        sb.append(", newColumnDefinitionOid=").append(newColumnDefinitionOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}