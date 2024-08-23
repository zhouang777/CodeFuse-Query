package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlExportTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.for_replication_oid")
    private Long forReplicationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.to_oid")
    private Long toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    public SqlExportTableStatement(Long oid, Long forReplicationOid, Long tableOid, Long toOid) {
        this.oid = oid;
        this.forReplicationOid = forReplicationOid;
        this.tableOid = tableOid;
        this.toOid = toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    public SqlExportTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.for_replication_oid")
    public Long getForReplicationOid() {
        return forReplicationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.for_replication_oid")
    public void setForReplicationOid(Long forReplicationOid) {
        this.forReplicationOid = forReplicationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.to_oid")
    public Long getToOid() {
        return toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.to_oid")
    public void setToOid(Long toOid) {
        this.toOid = toOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
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
        SqlExportTableStatement other = (SqlExportTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getForReplicationOid() == null ? other.getForReplicationOid() == null : this.getForReplicationOid().equals(other.getForReplicationOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getToOid() == null ? other.getToOid() == null : this.getToOid().equals(other.getToOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getForReplicationOid() == null) ? 0 : getForReplicationOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getToOid() == null) ? 0 : getToOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", forReplicationOid=").append(forReplicationOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", toOid=").append(toOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}