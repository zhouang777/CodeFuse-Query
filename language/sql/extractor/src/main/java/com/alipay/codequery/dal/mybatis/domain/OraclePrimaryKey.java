package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OraclePrimaryKey implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.deferrable")
    private Integer deferrable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.exceptions_into_oid")
    private Long exceptionsIntoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.initially")
    private String initially;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    public OraclePrimaryKey(Long oid, Integer deferrable, Integer enable, Long exceptionsIntoOid, String initially, Long usingOid) {
        this.oid = oid;
        this.deferrable = deferrable;
        this.enable = enable;
        this.exceptionsIntoOid = exceptionsIntoOid;
        this.initially = initially;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    public OraclePrimaryKey() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.deferrable")
    public Integer getDeferrable() {
        return deferrable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.deferrable")
    public void setDeferrable(Integer deferrable) {
        this.deferrable = deferrable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.exceptions_into_oid")
    public Long getExceptionsIntoOid() {
        return exceptionsIntoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.exceptions_into_oid")
    public void setExceptionsIntoOid(Long exceptionsIntoOid) {
        this.exceptionsIntoOid = exceptionsIntoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.initially")
    public String getInitially() {
        return initially;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.initially")
    public void setInitially(String initially) {
        this.initially = initially == null ? null : initially.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
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
        OraclePrimaryKey other = (OraclePrimaryKey) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDeferrable() == null ? other.getDeferrable() == null : this.getDeferrable().equals(other.getDeferrable()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getExceptionsIntoOid() == null ? other.getExceptionsIntoOid() == null : this.getExceptionsIntoOid().equals(other.getExceptionsIntoOid()))
            && (this.getInitially() == null ? other.getInitially() == null : this.getInitially().equals(other.getInitially()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDeferrable() == null) ? 0 : getDeferrable().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getExceptionsIntoOid() == null) ? 0 : getExceptionsIntoOid().hashCode());
        result = prime * result + ((getInitially() == null) ? 0 : getInitially().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", deferrable=").append(deferrable);
        sb.append(", enable=").append(enable);
        sb.append(", exceptionsIntoOid=").append(exceptionsIntoOid);
        sb.append(", initially=").append(initially);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}