/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.TuneParamInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 负责用户修改的调参参数的管理
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TuneParamInfo extends TableImpl<TuneParamInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tmaestro-lite.tune_param_info</code>
     */
    public static final TuneParamInfo TUNE_PARAM_INFO = new TuneParamInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TuneParamInfoRecord> getRecordType() {
        return TuneParamInfoRecord.class;
    }

    /**
     * The column <code>tmaestro-lite.tune_param_info.ID</code>.
     */
    public final TableField<TuneParamInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>tmaestro-lite.tune_param_info.CREATE_TIME</code>. 创建时间
     */
    public final TableField<TuneParamInfoRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "创建时间");

    /**
     * The column <code>tmaestro-lite.tune_param_info.UPDATED_TIME</code>. 更新时间
     */
    public final TableField<TuneParamInfoRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("UPDATED_TIME"), SQLDataType.LOCALDATETIME(0), this, "更新时间");

    /**
     * The column <code>tmaestro-lite.tune_param_info.APP_ID</code>. app id
     */
    public final TableField<TuneParamInfoRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER, this, "app id");

    /**
     * The column <code>tmaestro-lite.tune_param_info.PIPELINE_ID</code>. pipeline id
     */
    public final TableField<TuneParamInfoRecord, Integer> PIPELINE_ID = createField(DSL.name("PIPELINE_ID"), SQLDataType.INTEGER, this, "pipeline id");

    /**
     * The column <code>tmaestro-lite.tune_param_info.JVM_MARKET_ID</code>. jvm market id
     */
    public final TableField<TuneParamInfoRecord, Integer> JVM_MARKET_ID = createField(DSL.name("JVM_MARKET_ID"), SQLDataType.INTEGER, this, "jvm market id");

    /**
     * The column <code>tmaestro-lite.tune_param_info.DECISION_ID</code>. decision Id
     */
    public final TableField<TuneParamInfoRecord, String> DECISION_ID = createField(DSL.name("DECISION_ID"), SQLDataType.VARCHAR(128), this, "decision Id");

    /**
     * The column <code>tmaestro-lite.tune_param_info.UPDATE_STATUS</code>. 更新参数的状态
     */
    public final TableField<TuneParamInfoRecord, String> UPDATE_STATUS = createField(DSL.name("UPDATE_STATUS"), SQLDataType.VARCHAR(128), this, "更新参数的状态");

    /**
     * The column <code>tmaestro-lite.tune_param_info.ACCESS_TOKEN</code>. acess token
     */
    public final TableField<TuneParamInfoRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(256), this, "acess token");

    /**
     * The column <code>tmaestro-lite.tune_param_info.UPDATE_PARAMS</code>. 更新的JVM参数，以JSON形式存储
     */
    public final TableField<TuneParamInfoRecord, String> UPDATE_PARAMS = createField(DSL.name("UPDATE_PARAMS"), SQLDataType.VARCHAR(4096), this, "更新的JVM参数，以JSON形式存储");

    /**
     * The column <code>tmaestro-lite.tune_param_info.OPERATOR</code>. 操作员
     */
    public final TableField<TuneParamInfoRecord, String> OPERATOR = createField(DSL.name("OPERATOR"), SQLDataType.VARCHAR(128), this, "操作员");

    /**
     * The column <code>tmaestro-lite.tune_param_info.CHANGED_TUNE_GROUP</code>. 修改的调参分组信息，json形式
     */
    public final TableField<TuneParamInfoRecord, String> CHANGED_TUNE_GROUP = createField(DSL.name("CHANGED_TUNE_GROUP"), SQLDataType.VARCHAR(255), this, "修改的调参分组信息，json形式");

    /**
     * The column <code>tmaestro-lite.tune_param_info.DEFAULT_PARAM</code>. app默认启动参数
     */
    public final TableField<TuneParamInfoRecord, String> DEFAULT_PARAM = createField(DSL.name("DEFAULT_PARAM"), SQLDataType.VARCHAR(4096), this, "app默认启动参数");

    /**
     * The column <code>tmaestro-lite.tune_param_info.VERSION</code>.
     */
    public final TableField<TuneParamInfoRecord, Integer> VERSION = createField(DSL.name("VERSION"), SQLDataType.INTEGER, this, "");

    private TuneParamInfo(Name alias, Table<TuneParamInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TuneParamInfo(Name alias, Table<TuneParamInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("负责用户修改的调参参数的管理"), TableOptions.table());
    }

    /**
     * Create an aliased <code>tmaestro-lite.tune_param_info</code> table reference
     */
    public TuneParamInfo(String alias) {
        this(DSL.name(alias), TUNE_PARAM_INFO);
    }

    /**
     * Create an aliased <code>tmaestro-lite.tune_param_info</code> table reference
     */
    public TuneParamInfo(Name alias) {
        this(alias, TUNE_PARAM_INFO);
    }

    /**
     * Create a <code>tmaestro-lite.tune_param_info</code> table reference
     */
    public TuneParamInfo() {
        this(DSL.name("tune_param_info"), null);
    }

    public <O extends Record> TuneParamInfo(Table<O> child, ForeignKey<O, TuneParamInfoRecord> key) {
        super(child, key, TUNE_PARAM_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<TuneParamInfoRecord, Integer> getIdentity() {
        return (Identity<TuneParamInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TuneParamInfoRecord> getPrimaryKey() {
        return Keys.KEY_TUNE_PARAM_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TuneParamInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TuneParamInfoRecord>>asList(Keys.KEY_TUNE_PARAM_INFO_PRIMARY, Keys.KEY_TUNE_PARAM_INFO_TUNE_PARAM_INFO_ID_UINDEX);
    }

    @Override
    public TuneParamInfo as(String alias) {
        return new TuneParamInfo(DSL.name(alias), this);
    }

    @Override
    public TuneParamInfo as(Name alias) {
        return new TuneParamInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TuneParamInfo rename(String name) {
        return new TuneParamInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TuneParamInfo rename(Name name) {
        return new TuneParamInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, LocalDateTime, LocalDateTime, Integer, Integer, Integer, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}