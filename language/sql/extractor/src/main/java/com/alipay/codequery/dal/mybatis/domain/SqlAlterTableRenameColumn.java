package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableRenameColumn implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.column_oid")
    private Long columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.to_oid")
    private Long toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    public SqlAlterTableRenameColumn(Long oid, Long columnOid, Long toOid) {
        this.oid = oid;
        this.columnOid = columnOid;
        this.toOid = toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    public SqlAlterTableRenameColumn() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.column_oid")
    public Long getColumnOid() {
        return columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.column_oid")
    public void setColumnOid(Long columnOid) {
        this.columnOid = columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.to_oid")
    public Long getToOid() {
        return toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.to_oid")
    public void setToOid(Long toOid) {
        this.toOid = toOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
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
        SqlAlterTableRenameColumn other = (SqlAlterTableRenameColumn) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getColumnOid() == null ? other.getColumnOid() == null : this.getColumnOid().equals(other.getColumnOid()))
            && (this.getToOid() == null ? other.getToOid() == null : this.getToOid().equals(other.getToOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getColumnOid() == null) ? 0 : getColumnOid().hashCode());
        result = prime * result + ((getToOid() == null) ? 0 : getToOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", columnOid=").append(columnOid);
        sb.append(", toOid=").append(toOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}