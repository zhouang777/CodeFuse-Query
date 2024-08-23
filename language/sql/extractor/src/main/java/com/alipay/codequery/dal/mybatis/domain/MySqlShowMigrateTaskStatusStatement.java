package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlShowMigrateTaskStatusStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.where_oid")
    private Long whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    public MySqlShowMigrateTaskStatusStatement(Long oid, Long whereOid) {
        this.oid = oid;
        this.whereOid = whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    public MySqlShowMigrateTaskStatusStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.where_oid")
    public Long getWhereOid() {
        return whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_migrate_task_status_statement.where_oid")
    public void setWhereOid(Long whereOid) {
        this.whereOid = whereOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
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
        MySqlShowMigrateTaskStatusStatement other = (MySqlShowMigrateTaskStatusStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getWhereOid() == null ? other.getWhereOid() == null : this.getWhereOid().equals(other.getWhereOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getWhereOid() == null) ? 0 : getWhereOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_migrate_task_status_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", whereOid=").append(whereOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}