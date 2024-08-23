package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateUserStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.password_oid")
    private Long passwordOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.user_oid")
    private Long userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    public SqlCreateUserStatement(Long oid, Long passwordOid, Long userOid) {
        this.oid = oid;
        this.passwordOid = passwordOid;
        this.userOid = userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    public SqlCreateUserStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.password_oid")
    public Long getPasswordOid() {
        return passwordOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.password_oid")
    public void setPasswordOid(Long passwordOid) {
        this.passwordOid = passwordOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.user_oid")
    public Long getUserOid() {
        return userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_user_statement.user_oid")
    public void setUserOid(Long userOid) {
        this.userOid = userOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
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
        SqlCreateUserStatement other = (SqlCreateUserStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getPasswordOid() == null ? other.getPasswordOid() == null : this.getPasswordOid().equals(other.getPasswordOid()))
            && (this.getUserOid() == null ? other.getUserOid() == null : this.getUserOid().equals(other.getUserOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getPasswordOid() == null) ? 0 : getPasswordOid().hashCode());
        result = prime * result + ((getUserOid() == null) ? 0 : getUserOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_user_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", passwordOid=").append(passwordOid);
        sb.append(", userOid=").append(userOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}