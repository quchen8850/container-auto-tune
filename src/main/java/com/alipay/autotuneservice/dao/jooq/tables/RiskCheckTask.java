/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Indexes;
import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.RiskCheckTaskRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 风险识别任务表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskCheckTask extends TableImpl<RiskCheckTaskRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tmaestro-lite.risk_check_task</code>
     */
    public static final RiskCheckTask RISK_CHECK_TASK = new RiskCheckTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RiskCheckTaskRecord> getRecordType() {
        return RiskCheckTaskRecord.class;
    }

    /**
     * The column <code>tmaestro-lite.risk_check_task.ID</code>. 主键ID
     */
    public final TableField<RiskCheckTaskRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>tmaestro-lite.risk_check_task.JOB_ID</code>. 对应risk_check_controller的主键
     */
    public final TableField<RiskCheckTaskRecord, Integer> JOB_ID = createField(DSL.name("JOB_ID"), SQLDataType.INTEGER, this, "对应risk_check_controller的主键");

    /**
     * The column <code>tmaestro-lite.risk_check_task.EXECUTE_TIME</code>. 任务执行时间
     */
    public final TableField<RiskCheckTaskRecord, LocalDateTime> EXECUTE_TIME = createField(DSL.name("EXECUTE_TIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "任务执行时间");

    /**
     * The column <code>tmaestro-lite.risk_check_task.EXECUTE_PARAM</code>. 任务ID列表
     */
    public final TableField<RiskCheckTaskRecord, String> EXECUTE_PARAM = createField(DSL.name("EXECUTE_PARAM"), SQLDataType.VARCHAR(5000).nullable(false), this, "任务ID列表");

    /**
     * The column <code>tmaestro-lite.risk_check_task.TASK_STATUS</code>. 任务执行状态(READY,INTERUPTE,END)
     */
    public final TableField<RiskCheckTaskRecord, String> TASK_STATUS = createField(DSL.name("TASK_STATUS"), SQLDataType.VARCHAR(10), this, "任务执行状态(READY,INTERUPTE,END)");

    /**
     * The column <code>tmaestro-lite.risk_check_task.TASK_RESULT</code>. 任务检查结果
     */
    public final TableField<RiskCheckTaskRecord, String> TASK_RESULT = createField(DSL.name("TASK_RESULT"), SQLDataType.VARCHAR(10), this, "任务检查结果");

    /**
     * The column <code>tmaestro-lite.risk_check_task.TASK_TRACE_ID</code>. 任务唯一标识
     */
    public final TableField<RiskCheckTaskRecord, String> TASK_TRACE_ID = createField(DSL.name("TASK_TRACE_ID"), SQLDataType.VARCHAR(100), this, "任务唯一标识");

    /**
     * The column <code>tmaestro-lite.risk_check_task.TASK_RISK_MSG</code>. 风险详情
     */
    public final TableField<RiskCheckTaskRecord, String> TASK_RISK_MSG = createField(DSL.name("TASK_RISK_MSG"), SQLDataType.VARCHAR(5000), this, "风险详情");

    /**
     * The column <code>tmaestro-lite.risk_check_task.CREATE_TIME</code>. 创建时间
     */
    public final TableField<RiskCheckTaskRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "创建时间");

    private RiskCheckTask(Name alias, Table<RiskCheckTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private RiskCheckTask(Name alias, Table<RiskCheckTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("风险识别任务表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>tmaestro-lite.risk_check_task</code> table reference
     */
    public RiskCheckTask(String alias) {
        this(DSL.name(alias), RISK_CHECK_TASK);
    }

    /**
     * Create an aliased <code>tmaestro-lite.risk_check_task</code> table reference
     */
    public RiskCheckTask(Name alias) {
        this(alias, RISK_CHECK_TASK);
    }

    /**
     * Create a <code>tmaestro-lite.risk_check_task</code> table reference
     */
    public RiskCheckTask() {
        this(DSL.name("risk_check_task"), null);
    }

    public <O extends Record> RiskCheckTask(Table<O> child, ForeignKey<O, RiskCheckTaskRecord> key) {
        super(child, key, RISK_CHECK_TASK);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RISK_CHECK_TASK_RISK_CHECK_TASK_JOB_ID_IDX, Indexes.RISK_CHECK_TASK_RISK_CHECK_TASK_TASK_TRACE_ID_IDX);
    }

    @Override
    public Identity<RiskCheckTaskRecord, Integer> getIdentity() {
        return (Identity<RiskCheckTaskRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<RiskCheckTaskRecord> getPrimaryKey() {
        return Keys.KEY_RISK_CHECK_TASK_PRIMARY;
    }

    @Override
    public List<UniqueKey<RiskCheckTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<RiskCheckTaskRecord>>asList(Keys.KEY_RISK_CHECK_TASK_PRIMARY);
    }

    @Override
    public RiskCheckTask as(String alias) {
        return new RiskCheckTask(DSL.name(alias), this);
    }

    @Override
    public RiskCheckTask as(Name alias) {
        return new RiskCheckTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RiskCheckTask rename(String name) {
        return new RiskCheckTask(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RiskCheckTask rename(Name name) {
        return new RiskCheckTask(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, LocalDateTime, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}