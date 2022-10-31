/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.PodAttach;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PodAttachRecord extends UpdatableRecordImpl<PodAttachRecord> implements Record6<Integer, String, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.POD_ATTACH.ID</code>. p
rimary key
     */
    public PodAttachRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.POD_ATTACH.ID</code>. p
rimary key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.POD_ATTACH.ACCESS_TOKEN</code>. 关联的token
     */
    public PodAttachRecord setAccessToken(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.POD_ATTACH.ACCESS_TOKEN</code>. 关联的token
     */
    public String getAccessToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.POD_ATTACH.POD_ID</code>. pod id
     */
    public PodAttachRecord setPodId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.POD_ATTACH.POD_ID</code>. pod id
     */
    public Integer getPodId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.POD_ATTACH.ATTACH_STATUS</code>. attach status
     */
    public PodAttachRecord setAttachStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.POD_ATTACH.ATTACH_STATUS</code>. attach status
     */
    public String getAttachStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.POD_ATTACH.CREATED_TIME</code>. create time
     */
    public PodAttachRecord setCreatedTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.POD_ATTACH.CREATED_TIME</code>. create time
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.POD_ATTACH.UPDATED_TIME</code>. update time
     */
    public PodAttachRecord setUpdatedTime(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.POD_ATTACH.UPDATED_TIME</code>. update time
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PodAttach.POD_ATTACH.ID;
    }

    @Override
    public Field<String> field2() {
        return PodAttach.POD_ATTACH.ACCESS_TOKEN;
    }

    @Override
    public Field<Integer> field3() {
        return PodAttach.POD_ATTACH.POD_ID;
    }

    @Override
    public Field<String> field4() {
        return PodAttach.POD_ATTACH.ATTACH_STATUS;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return PodAttach.POD_ATTACH.CREATED_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return PodAttach.POD_ATTACH.UPDATED_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAccessToken();
    }

    @Override
    public Integer component3() {
        return getPodId();
    }

    @Override
    public String component4() {
        return getAttachStatus();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdatedTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAccessToken();
    }

    @Override
    public Integer value3() {
        return getPodId();
    }

    @Override
    public String value4() {
        return getAttachStatus();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedTime();
    }

    @Override
    public PodAttachRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PodAttachRecord value2(String value) {
        setAccessToken(value);
        return this;
    }

    @Override
    public PodAttachRecord value3(Integer value) {
        setPodId(value);
        return this;
    }

    @Override
    public PodAttachRecord value4(String value) {
        setAttachStatus(value);
        return this;
    }

    @Override
    public PodAttachRecord value5(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public PodAttachRecord value6(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    @Override
    public PodAttachRecord values(Integer value1, String value2, Integer value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PodAttachRecord
     */
    public PodAttachRecord() {
        super(PodAttach.POD_ATTACH);
    }

    /**
     * Create a detached, initialised PodAttachRecord
     */
    public PodAttachRecord(Integer id, String accessToken, Integer podId, String attachStatus, LocalDateTime createdTime, LocalDateTime updatedTime) {
        super(PodAttach.POD_ATTACH);

        setId(id);
        setAccessToken(accessToken);
        setPodId(podId);
        setAttachStatus(attachStatus);
        setCreatedTime(createdTime);
        setUpdatedTime(updatedTime);
    }
}
