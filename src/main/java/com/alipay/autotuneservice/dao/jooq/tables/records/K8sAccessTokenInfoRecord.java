/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.K8sAccessTokenInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class K8sAccessTokenInfoRecord extends UpdatableRecordImpl<K8sAccessTokenInfoRecord> implements Record11<Integer, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ID</code>. 主键ID
     */
    public K8sAccessTokenInfoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ID</code>. 主键ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CREATE_TIME</code>. 创建时间
     */
    public K8sAccessTokenInfoRecord setCreateTime(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.UPDATED_TIME</code>. 修改时间
     */
    public K8sAccessTokenInfoRecord setUpdatedTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.UPDATED_TIME</code>. 修改时间
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_TOKEN</code>. access;token
     */
    public K8sAccessTokenInfoRecord setAccessToken(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_TOKEN</code>. access;token
     */
    public String getAccessToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_KEY_ID</code>. access;key id
     */
    public K8sAccessTokenInfoRecord setAccessKeyId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_KEY_ID</code>. access;key id
     */
    public String getAccessKeyId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.SECRET_ACCESS_KEY</code>. Secret;Access Key
     */
    public K8sAccessTokenInfoRecord setSecretAccessKey(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.SECRET_ACCESS_KEY</code>. Secret;Access Key
     */
    public String getSecretAccessKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CER</code>. 证书
     */
    public K8sAccessTokenInfoRecord setCer(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CER</code>. 证书
     */
    public String getCer() {
        return (String) get(6);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_NAME</code>. 集群名称
     */
    public K8sAccessTokenInfoRecord setClusterName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_NAME</code>. 集群名称
     */
    public String getClusterName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.REGION</code>. aws;region
     */
    public K8sAccessTokenInfoRecord setRegion(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.REGION</code>. aws;region
     */
    public String getRegion() {
        return (String) get(8);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ENDPOINT</code>. aws;endpoint url
     */
    public K8sAccessTokenInfoRecord setEndpoint(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ENDPOINT</code>. aws;endpoint url
     */
    public String getEndpoint() {
        return (String) get(9);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_ID</code>. 集群ID
     */
    public K8sAccessTokenInfoRecord setClusterId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_ID</code>. 集群ID
     */
    public String getClusterId() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.UPDATED_TIME;
    }

    @Override
    public Field<String> field4() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.ACCESS_TOKEN;
    }

    @Override
    public Field<String> field5() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.ACCESS_KEY_ID;
    }

    @Override
    public Field<String> field6() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.SECRET_ACCESS_KEY;
    }

    @Override
    public Field<String> field7() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.CER;
    }

    @Override
    public Field<String> field8() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.CLUSTER_NAME;
    }

    @Override
    public Field<String> field9() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.REGION;
    }

    @Override
    public Field<String> field10() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.ENDPOINT;
    }

    @Override
    public Field<String> field11() {
        return K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO.CLUSTER_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component3() {
        return getUpdatedTime();
    }

    @Override
    public String component4() {
        return getAccessToken();
    }

    @Override
    public String component5() {
        return getAccessKeyId();
    }

    @Override
    public String component6() {
        return getSecretAccessKey();
    }

    @Override
    public String component7() {
        return getCer();
    }

    @Override
    public String component8() {
        return getClusterName();
    }

    @Override
    public String component9() {
        return getRegion();
    }

    @Override
    public String component10() {
        return getEndpoint();
    }

    @Override
    public String component11() {
        return getClusterId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value3() {
        return getUpdatedTime();
    }

    @Override
    public String value4() {
        return getAccessToken();
    }

    @Override
    public String value5() {
        return getAccessKeyId();
    }

    @Override
    public String value6() {
        return getSecretAccessKey();
    }

    @Override
    public String value7() {
        return getCer();
    }

    @Override
    public String value8() {
        return getClusterName();
    }

    @Override
    public String value9() {
        return getRegion();
    }

    @Override
    public String value10() {
        return getEndpoint();
    }

    @Override
    public String value11() {
        return getClusterId();
    }

    @Override
    public K8sAccessTokenInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value2(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value3(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value4(String value) {
        setAccessToken(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value5(String value) {
        setAccessKeyId(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value6(String value) {
        setSecretAccessKey(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value7(String value) {
        setCer(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value8(String value) {
        setClusterName(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value9(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value10(String value) {
        setEndpoint(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord value11(String value) {
        setClusterId(value);
        return this;
    }

    @Override
    public K8sAccessTokenInfoRecord values(Integer value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached K8sAccessTokenInfoRecord
     */
    public K8sAccessTokenInfoRecord() {
        super(K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO);
    }

    /**
     * Create a detached, initialised K8sAccessTokenInfoRecord
     */
    public K8sAccessTokenInfoRecord(Integer id, LocalDateTime createTime, LocalDateTime updatedTime, String accessToken, String accessKeyId, String secretAccessKey, String cer, String clusterName, String region, String endpoint, String clusterId) {
        super(K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO);

        setId(id);
        setCreateTime(createTime);
        setUpdatedTime(updatedTime);
        setAccessToken(accessToken);
        setAccessKeyId(accessKeyId);
        setSecretAccessKey(secretAccessKey);
        setCer(cer);
        setClusterName(clusterName);
        setRegion(region);
        setEndpoint(endpoint);
        setClusterId(clusterId);
    }
}
