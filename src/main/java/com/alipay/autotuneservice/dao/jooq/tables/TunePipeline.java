/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.TunePipelineRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TunePipeline extends TableImpl<TunePipelineRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.TUNE_PIPELINE</code>
     */
    public static final TunePipeline TUNE_PIPELINE = new TunePipeline();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TunePipelineRecord> getRecordType() {
        return TunePipelineRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.ID</code>. 主键
     */
    public final TableField<TunePipelineRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.PIPELINE_ID</code>. 流程id
     */
    public final TableField<TunePipelineRecord, Integer> PIPELINE_ID = createField(DSL.name("PIPELINE_ID"), SQLDataType.INTEGER, this, "流程id");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.ACCESS_TOKEN</code>. 关联的token
     */
    public final TableField<TunePipelineRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(255).nullable(false), this, "关联的token");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.APP_ID</code>. 应用ID
     */
    public final TableField<TunePipelineRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER.nullable(false), this, "应用ID");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.CREATED_TIME</code>. 创建时间
     */
    public final TableField<TunePipelineRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "创建时间");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.UPDATED_TIME</code>. 更新时间
     */
    public final TableField<TunePipelineRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("UPDATED_TIME"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "更新时间");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.STATUS</code>. 当前状态
     */
    public final TableField<TunePipelineRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(128).nullable(false), this, "当前状态");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.STAGE</code>. 当前阶段
     */
    public final TableField<TunePipelineRecord, String> STAGE = createField(DSL.name("STAGE"), SQLDataType.VARCHAR(128).nullable(false), this, "当前阶段");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.PRE_PHASE_ID</code>. 前一阶段id
     */
    public final TableField<TunePipelineRecord, Integer> PRE_PHASE_ID = createField(DSL.name("PRE_PHASE_ID"), SQLDataType.INTEGER, this, "前一阶段id");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.CURRENT_PHASE_ID</code>. 当前阶段id
     */
    public final TableField<TunePipelineRecord, Integer> CURRENT_PHASE_ID = createField(DSL.name("CURRENT_PHASE_ID"), SQLDataType.INTEGER, this, "当前阶段id");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.MACHINE_ID</code>. 状态机id
     */
    public final TableField<TunePipelineRecord, String> MACHINE_ID = createField(DSL.name("MACHINE_ID"), SQLDataType.VARCHAR(128).nullable(false), this, "状态机id");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.TUNE_PLAN_ID</code>. 对应的计划id
     */
    public final TableField<TunePipelineRecord, Integer> TUNE_PLAN_ID = createField(DSL.name("TUNE_PLAN_ID"), SQLDataType.INTEGER, this, "对应的计划id");

    /**
     * The column <code>TMAESTRO-LITE.TUNE_PIPELINE.TYPE</code>.
     */
    public final TableField<TunePipelineRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(50), this, "");

    private TunePipeline(Name alias, Table<TunePipelineRecord> aliased) {
        this(alias, aliased, null);
    }

    private TunePipeline(Name alias, Table<TunePipelineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.TUNE_PIPELINE</code> table reference
     */
    public TunePipeline(String alias) {
        this(DSL.name(alias), TUNE_PIPELINE);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.TUNE_PIPELINE</code> table reference
     */
    public TunePipeline(Name alias) {
        this(alias, TUNE_PIPELINE);
    }

    /**
     * Create a <code>TMAESTRO-LITE.TUNE_PIPELINE</code> table reference
     */
    public TunePipeline() {
        this(DSL.name("TUNE_PIPELINE"), null);
    }

    public <O extends Record> TunePipeline(Table<O> child, ForeignKey<O, TunePipelineRecord> key) {
        super(child, key, TUNE_PIPELINE);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<TunePipelineRecord, Integer> getIdentity() {
        return (Identity<TunePipelineRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TunePipelineRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_24;
    }

    @Override
    public List<UniqueKey<TunePipelineRecord>> getKeys() {
        return Arrays.<UniqueKey<TunePipelineRecord>>asList(Keys.CONSTRAINT_24);
    }

    @Override
    public TunePipeline as(String alias) {
        return new TunePipeline(DSL.name(alias), this);
    }

    @Override
    public TunePipeline as(Name alias) {
        return new TunePipeline(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TunePipeline rename(String name) {
        return new TunePipeline(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TunePipeline rename(Name name) {
        return new TunePipeline(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, String, Integer, LocalDateTime, LocalDateTime, String, String, Integer, Integer, String, Integer, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
