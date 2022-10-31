/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContainerStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    private String podName;
    private Long   gmtModified;
    private Long   appId;
    private String containerId;
    private String data;

    public ContainerStatistics() {}

    public ContainerStatistics(ContainerStatistics value) {
        this.podName = value.podName;
        this.gmtModified = value.gmtModified;
        this.appId = value.appId;
        this.containerId = value.containerId;
        this.data = value.data;
    }

    public ContainerStatistics(
        String podName,
        Long   gmtModified,
        Long   appId,
        String containerId,
        String data
    ) {
        this.podName = podName;
        this.gmtModified = gmtModified;
        this.appId = appId;
        this.containerId = containerId;
        this.data = data;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.POD_NAME</code>. pod name
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.POD_NAME</code>. pod name
     */
    public ContainerStatistics setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.GMT_MODIFIED</code>. 修改时间
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.GMT_MODIFIED</code>. 修改时间
     */
    public ContainerStatistics setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.APP_ID</code>. app id
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.APP_ID</code>. app id
     */
    public ContainerStatistics setAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.CONTAINER_ID</code>. container Id
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.CONTAINER_ID</code>. container Id
     */
    public ContainerStatistics setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.DATA</code>.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.CONTAINER_STATISTICS.DATA</code>.
     */
    public ContainerStatistics setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContainerStatistics (");

        sb.append(podName);
        sb.append(", ").append(gmtModified);
        sb.append(", ").append(appId);
        sb.append(", ").append(containerId);
        sb.append(", ").append(data);

        sb.append(")");
        return sb.toString();
    }
}
