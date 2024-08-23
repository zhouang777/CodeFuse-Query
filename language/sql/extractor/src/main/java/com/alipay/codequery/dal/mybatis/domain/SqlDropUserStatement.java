package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDropUserStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_user_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_user_statement.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_user_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_user_statement")
    public SqlDropUserStatement(Long oid, Integer isIfExists) {
        this.oid = oid;
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_user_statement")
    public SqlDropUserStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_user_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_user_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_user_statement.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_user_statement.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_user_statement")
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
        SqlDropUserStatement other = (SqlDropUserStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_user_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_user_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}