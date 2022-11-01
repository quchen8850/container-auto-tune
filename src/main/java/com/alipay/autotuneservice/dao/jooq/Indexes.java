/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq;


import com.alipay.autotuneservice.dao.jooq.tables.AppInfo;
import com.alipay.autotuneservice.dao.jooq.tables.ContainerProcessInfo;
import com.alipay.autotuneservice.dao.jooq.tables.ContainerStatistics;
import com.alipay.autotuneservice.dao.jooq.tables.JvmMonitorMetricData;
import com.alipay.autotuneservice.dao.jooq.tables.JvmRiskStatisticProblem;
import com.alipay.autotuneservice.dao.jooq.tables.PodInfo;
import com.alipay.autotuneservice.dao.jooq.tables.RiskCheckControl;
import com.alipay.autotuneservice.dao.jooq.tables.RiskCheckTask;
import com.alipay.autotuneservice.dao.jooq.tables.RiskStatisticPreData;
import com.alipay.autotuneservice.dao.jooq.tables.TunePlan;
import com.alipay.autotuneservice.dao.jooq.tables.TwatchInfo;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in TMAESTRO-LITE.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index APP_INFO__INDEX_CLUSTER = Internal.createIndex(DSL.name("APP_INFO__INDEX_CLUSTER"), AppInfo.APP_INFO, new OrderField[] { AppInfo.APP_INFO.CLUSTER_NAME }, false);
    public static final Index APP_INFO_ACCESS_TOKEN_CLUSTER_NAME_STATUS_INDEX = Internal.createIndex(DSL.name("APP_INFO_ACCESS_TOKEN_CLUSTER_NAME_STATUS_INDEX"), AppInfo.APP_INFO, new OrderField[] { AppInfo.APP_INFO.ACCESS_TOKEN, AppInfo.APP_INFO.CLUSTER_NAME, AppInfo.APP_INFO.STATUS }, false);
    public static final Index APP_INFO_APP_NAME_ACCESS_TOKEN_STATUS_INDEX = Internal.createIndex(DSL.name("APP_INFO_APP_NAME_ACCESS_TOKEN_STATUS_INDEX"), AppInfo.APP_INFO, new OrderField[] { AppInfo.APP_INFO.APP_NAME, AppInfo.APP_INFO.ACCESS_TOKEN, AppInfo.APP_INFO.STATUS }, false);
    public static final Index APP_INFO_ID_STATUS_INDEX = Internal.createIndex(DSL.name("APP_INFO_ID_STATUS_INDEX"), AppInfo.APP_INFO, new OrderField[] { AppInfo.APP_INFO.ID, AppInfo.APP_INFO.STATUS }, false);
    public static final Index CONTAINER_PROCESS_INFO_APPID_INDEX = Internal.createIndex(DSL.name("CONTAINER_PROCESS_INFO_APPID_INDEX"), ContainerProcessInfo.CONTAINER_PROCESS_INFO, new OrderField[] { ContainerProcessInfo.CONTAINER_PROCESS_INFO.APP_ID }, false);
    public static final Index CONTAINER_PROCESS_INFO_CONTAINERID_INDEX = Internal.createIndex(DSL.name("CONTAINER_PROCESS_INFO_CONTAINERID_INDEX"), ContainerProcessInfo.CONTAINER_PROCESS_INFO, new OrderField[] { ContainerProcessInfo.CONTAINER_PROCESS_INFO.CONTAINER_ID }, false);
    public static final Index CONTAINER_PROCESS_INFO_GMTMODIFIED_INDEX = Internal.createIndex(DSL.name("CONTAINER_PROCESS_INFO_GMTMODIFIED_INDEX"), ContainerProcessInfo.CONTAINER_PROCESS_INFO, new OrderField[] { ContainerProcessInfo.CONTAINER_PROCESS_INFO.GMT_MODIFIED }, false);
    public static final Index CONTAINER_PROCESS_INFO_PODNAME_INDEX = Internal.createIndex(DSL.name("CONTAINER_PROCESS_INFO_PODNAME_INDEX"), ContainerProcessInfo.CONTAINER_PROCESS_INFO, new OrderField[] { ContainerProcessInfo.CONTAINER_PROCESS_INFO.POD_NAME }, false);
    public static final Index CONTAINER_STATISTICS_APPID_INDEX = Internal.createIndex(DSL.name("CONTAINER_STATISTICS_APPID_INDEX"), ContainerStatistics.CONTAINER_STATISTICS, new OrderField[] { ContainerStatistics.CONTAINER_STATISTICS.APP_ID }, false);
    public static final Index CONTAINER_STATISTICS_CONTAINERID_INDEX = Internal.createIndex(DSL.name("CONTAINER_STATISTICS_CONTAINERID_INDEX"), ContainerStatistics.CONTAINER_STATISTICS, new OrderField[] { ContainerStatistics.CONTAINER_STATISTICS.CONTAINER_ID }, false);
    public static final Index CONTAINER_STATISTICS_INFO_GMTMODIFIED_INDEX = Internal.createIndex(DSL.name("CONTAINER_STATISTICS_INFO_GMTMODIFIED_INDEX"), ContainerStatistics.CONTAINER_STATISTICS, new OrderField[] { ContainerStatistics.CONTAINER_STATISTICS.GMT_MODIFIED }, false);
    public static final Index CONTAINER_STATISTICS_INFO_PODNAME_INDEX = Internal.createIndex(DSL.name("CONTAINER_STATISTICS_INFO_PODNAME_INDEX"), ContainerStatistics.CONTAINER_STATISTICS, new OrderField[] { ContainerStatistics.CONTAINER_STATISTICS.POD_NAME }, false);
    public static final Index JVM_MONITOR_METRIC_DATA_APPNAME_INDEX = Internal.createIndex(DSL.name("JVM_MONITOR_METRIC_DATA_APPNAME_INDEX"), JvmMonitorMetricData.JVM_MONITOR_METRIC_DATA, new OrderField[] { JvmMonitorMetricData.JVM_MONITOR_METRIC_DATA.APP_NAME }, false);
    public static final Index JVM_MONITOR_METRIC_DATA_GMTMODIFIED_INDEX = Internal.createIndex(DSL.name("JVM_MONITOR_METRIC_DATA_GMTMODIFIED_INDEX"), JvmMonitorMetricData.JVM_MONITOR_METRIC_DATA, new OrderField[] { JvmMonitorMetricData.JVM_MONITOR_METRIC_DATA.GMT_MODIFIED }, false);
    public static final Index JVM_MONITOR_METRIC_DATA_PODNAME_INDEX = Internal.createIndex(DSL.name("JVM_MONITOR_METRIC_DATA_PODNAME_INDEX"), JvmMonitorMetricData.JVM_MONITOR_METRIC_DATA, new OrderField[] { JvmMonitorMetricData.JVM_MONITOR_METRIC_DATA.POD_NAME }, false);
    public static final Index JVM_RISK_STATISTIC_PROBLEM_APPID_TIMESTAMP_INDEX = Internal.createIndex(DSL.name("JVM_RISK_STATISTIC_PROBLEM_APPID_TIMESTAMP_INDEX"), JvmRiskStatisticProblem.JVM_RISK_STATISTIC_PROBLEM, new OrderField[] { JvmRiskStatisticProblem.JVM_RISK_STATISTIC_PROBLEM.APP_ID, JvmRiskStatisticProblem.JVM_RISK_STATISTIC_PROBLEM.DT }, false);
    public static final Index POD_INFO_APP_ID_AGENT_INSTALL_INDEX = Internal.createIndex(DSL.name("POD_INFO_APP_ID_AGENT_INSTALL_INDEX"), PodInfo.POD_INFO, new OrderField[] { PodInfo.POD_INFO.APP_ID, PodInfo.POD_INFO.AGENT_INSTALL }, false);
    public static final Index POD_INFO_APP_ID_POD_STATUS_INDEX = Internal.createIndex(DSL.name("POD_INFO_APP_ID_POD_STATUS_INDEX"), PodInfo.POD_INFO, new OrderField[] { PodInfo.POD_INFO.APP_ID, PodInfo.POD_INFO.POD_STATUS }, false);
    public static final Index RISK_CHECK_CONTROLLER_TRACE_ID_IDX = Internal.createIndex(DSL.name("RISK_CHECK_CONTROLLER_TRACE_ID_IDX"), RiskCheckControl.RISK_CHECK_CONTROL, new OrderField[] { RiskCheckControl.RISK_CHECK_CONTROL.TRACE_ID }, false);
    public static final Index RISK_CHECK_TASK_JOB_ID_IDX = Internal.createIndex(DSL.name("RISK_CHECK_TASK_JOB_ID_IDX"), RiskCheckTask.RISK_CHECK_TASK, new OrderField[] { RiskCheckTask.RISK_CHECK_TASK.JOB_ID }, false);
    public static final Index RISK_CHECK_TASK_TASK_TRACE_ID_IDX = Internal.createIndex(DSL.name("RISK_CHECK_TASK_TASK_TRACE_ID_IDX"), RiskCheckTask.RISK_CHECK_TASK, new OrderField[] { RiskCheckTask.RISK_CHECK_TASK.TASK_TRACE_ID }, false);
    public static final Index RISK_STATISTIC_PRE_DATA_APPID_TIMESTAMP_INDEX = Internal.createIndex(DSL.name("RISK_STATISTIC_PRE_DATA_APPID_TIMESTAMP_INDEX"), RiskStatisticPreData.RISK_STATISTIC_PRE_DATA, new OrderField[] { RiskStatisticPreData.RISK_STATISTIC_PRE_DATA.APP_ID, RiskStatisticPreData.RISK_STATISTIC_PRE_DATA.DT }, false);
    public static final Index TUNE_PLAN_APP_ID_INDEX = Internal.createIndex(DSL.name("TUNE_PLAN_APP_ID_INDEX"), TunePlan.TUNE_PLAN, new OrderField[] { TunePlan.TUNE_PLAN.APP_ID }, false);
    public static final Index TWATCH_INFO_AGENT_NAME_INDEX = Internal.createIndex(DSL.name("TWATCH_INFO_AGENT_NAME_INDEX"), TwatchInfo.TWATCH_INFO, new OrderField[] { TwatchInfo.TWATCH_INFO.AGENT_NAME }, false);
    public static final Index TWATCH_INFO_CONTAINERID_INDEX = Internal.createIndex(DSL.name("TWATCH_INFO_CONTAINERID_INDEX"), TwatchInfo.TWATCH_INFO, new OrderField[] { TwatchInfo.TWATCH_INFO.CONTAINER_ID }, false);
    public static final Index TWATCH_INFO_CONTAINERNAME_INDEX = Internal.createIndex(DSL.name("TWATCH_INFO_CONTAINERNAME_INDEX"), TwatchInfo.TWATCH_INFO, new OrderField[] { TwatchInfo.TWATCH_INFO.CONTAINER_NAME }, false);
}
