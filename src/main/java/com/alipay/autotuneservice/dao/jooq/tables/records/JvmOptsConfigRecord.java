/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.JvmOptsConfig;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JvmOptsConfigRecord extends UpdatableRecordImpl<JvmOptsConfigRecord> implements Record4<Long, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.ID</code>.
     */
    public JvmOptsConfigRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.JVM_OPT</code>.
     */
    public JvmOptsConfigRecord setJvmOpt(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.JVM_OPT</code>.
     */
    public String getJvmOpt() {
        return (String) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.CREATE_TIME</code>.
     */
    public JvmOptsConfigRecord setCreateTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.UPDATE_TIME</code>.
     */
    public JvmOptsConfigRecord setUpdateTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JVM_OPTS_CONFIG.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JvmOptsConfig.JVM_OPTS_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return JvmOptsConfig.JVM_OPTS_CONFIG.JVM_OPT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return JvmOptsConfig.JVM_OPTS_CONFIG.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return JvmOptsConfig.JVM_OPTS_CONFIG.UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getJvmOpt();
    }

    @Override
    public LocalDateTime component3() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component4() {
        return getUpdateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getJvmOpt();
    }

    @Override
    public LocalDateTime value3() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value4() {
        return getUpdateTime();
    }

    @Override
    public JvmOptsConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public JvmOptsConfigRecord value2(String value) {
        setJvmOpt(value);
        return this;
    }

    @Override
    public JvmOptsConfigRecord value3(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public JvmOptsConfigRecord value4(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public JvmOptsConfigRecord values(Long value1, String value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JvmOptsConfigRecord
     */
    public JvmOptsConfigRecord() {
        super(JvmOptsConfig.JVM_OPTS_CONFIG);
    }

    /**
     * Create a detached, initialised JvmOptsConfigRecord
     */
    public JvmOptsConfigRecord(Long id, String jvmOpt, LocalDateTime createTime, LocalDateTime updateTime) {
        super(JvmOptsConfig.JVM_OPTS_CONFIG);

        setId(id);
        setJvmOpt(jvmOpt);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
    }
}
