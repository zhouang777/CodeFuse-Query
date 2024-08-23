package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlFetchStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.cursor_name_oid")
    private Long cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.is_bulk_collect")
    private Integer isBulkCollect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    public SqlFetchStatement(Long oid, Long cursorNameOid, Integer isBulkCollect, Long limitOid) {
        this.oid = oid;
        this.cursorNameOid = cursorNameOid;
        this.isBulkCollect = isBulkCollect;
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    public SqlFetchStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.cursor_name_oid")
    public Long getCursorNameOid() {
        return cursorNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.cursor_name_oid")
    public void setCursorNameOid(Long cursorNameOid) {
        this.cursorNameOid = cursorNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.is_bulk_collect")
    public Integer getIsBulkCollect() {
        return isBulkCollect;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.is_bulk_collect")
    public void setIsBulkCollect(Integer isBulkCollect) {
        this.isBulkCollect = isBulkCollect;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
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
        SqlFetchStatement other = (SqlFetchStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCursorNameOid() == null ? other.getCursorNameOid() == null : this.getCursorNameOid().equals(other.getCursorNameOid()))
            && (this.getIsBulkCollect() == null ? other.getIsBulkCollect() == null : this.getIsBulkCollect().equals(other.getIsBulkCollect()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCursorNameOid() == null) ? 0 : getCursorNameOid().hashCode());
        result = prime * result + ((getIsBulkCollect() == null) ? 0 : getIsBulkCollect().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cursorNameOid=").append(cursorNameOid);
        sb.append(", isBulkCollect=").append(isBulkCollect);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}