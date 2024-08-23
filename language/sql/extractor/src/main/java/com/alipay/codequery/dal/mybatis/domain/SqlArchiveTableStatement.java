package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlArchiveTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.type_oid")
    private Long typeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    public SqlArchiveTableStatement(Long oid, Long tableOid, Long typeOid) {
        this.oid = oid;
        this.tableOid = tableOid;
        this.typeOid = typeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    public SqlArchiveTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.type_oid")
    public Long getTypeOid() {
        return typeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.type_oid")
    public void setTypeOid(Long typeOid) {
        this.typeOid = typeOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
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
        SqlArchiveTableStatement other = (SqlArchiveTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getTypeOid() == null ? other.getTypeOid() == null : this.getTypeOid().equals(other.getTypeOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getTypeOid() == null) ? 0 : getTypeOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", typeOid=").append(typeOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}