/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.ConfigInfoRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class ConfigInfo extends TableImpl<ConfigInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.CONFIG_INFO</code>
     */
    public static final ConfigInfo CONFIG_INFO = new ConfigInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigInfoRecord> getRecordType() {
        return ConfigInfoRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.ID</code>. 唯一ID;唯一ID
     */
    public final TableField<ConfigInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "唯一ID;唯一ID");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.APP_ID</code>. 关联的集群id
     */
    public final TableField<ConfigInfoRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER, this, "关联的集群id");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.AUTO_TUNE</code>. 自动调优开关 。true：开启；false关闭
     */
    public final TableField<ConfigInfoRecord, String> AUTO_TUNE = createField(DSL.name("AUTO_TUNE"), SQLDataType.VARCHAR(5).nullable(false), this, "自动调优开关 。true：开启；false关闭");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.TUNE_PRIMARY_TIME</code>. 调节约束时间
     */
    public final TableField<ConfigInfoRecord, String> TUNE_PRIMARY_TIME = createField(DSL.name("TUNE_PRIMARY_TIME"), SQLDataType.VARCHAR(500).nullable(false), this, "调节约束时间");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.TUNE_GROUP_CONFIG</code>. 调节分组配置
     */
    public final TableField<ConfigInfoRecord, String> TUNE_GROUP_CONFIG = createField(DSL.name("TUNE_GROUP_CONFIG"), SQLDataType.VARCHAR(500), this, "调节分组配置");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.RISK_SWITCH</code>. 智能防控开关。true:打开；false:关闭
     */
    public final TableField<ConfigInfoRecord, String> RISK_SWITCH = createField(DSL.name("RISK_SWITCH"), SQLDataType.VARCHAR(5), this, "智能防控开关。true:打开；false:关闭");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.AUTO_DISPATCH</code>. 托管标识。true：开启；false关闭。
     */
    public final TableField<ConfigInfoRecord, String> AUTO_DISPATCH = createField(DSL.name("AUTO_DISPATCH"), SQLDataType.VARCHAR(255).nullable(false), this, "托管标识。true：开启；false关闭。");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.ADVANCED_SETUP</code>. 高级设置：每批次条调参完成，会对这些配置进行检查
     */
    public final TableField<ConfigInfoRecord, String> ADVANCED_SETUP = createField(DSL.name("ADVANCED_SETUP"), SQLDataType.VARCHAR(500).nullable(false), this, "高级设置：每批次条调参完成，会对这些配置进行检查");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.TIME_ZONE</code>. 时区
     */
    public final TableField<ConfigInfoRecord, String> TIME_ZONE = createField(DSL.name("TIME_ZONE"), SQLDataType.VARCHAR(50).nullable(false), this, "时区");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.TUNE_TIME_TAG</code>. 调节时间标识。true代表可调有时间。false代表不可调有时间。与TUNE_PRIMARY_TIME结合使用
     */
    public final TableField<ConfigInfoRecord, String> TUNE_TIME_TAG = createField(DSL.name("TUNE_TIME_TAG"), SQLDataType.VARCHAR(5).nullable(false), this, "调节时间标识。true代表可调有时间。false代表不可调有时间。与TUNE_PRIMARY_TIME结合使用");

    /**
     * The column <code>TMAESTRO-LITE.CONFIG_INFO.OPERATE_TIME</code>. 操作时间
     */
    public final TableField<ConfigInfoRecord, String> OPERATE_TIME = createField(DSL.name("OPERATE_TIME"), SQLDataType.VARCHAR(25).nullable(false), this, "操作时间");

    private ConfigInfo(Name alias, Table<ConfigInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConfigInfo(Name alias, Table<ConfigInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.CONFIG_INFO</code> table reference
     */
    public ConfigInfo(String alias) {
        this(DSL.name(alias), CONFIG_INFO);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.CONFIG_INFO</code> table reference
     */
    public ConfigInfo(Name alias) {
        this(alias, CONFIG_INFO);
    }

    /**
     * Create a <code>TMAESTRO-LITE.CONFIG_INFO</code> table reference
     */
    public ConfigInfo() {
        this(DSL.name("CONFIG_INFO"), null);
    }

    public <O extends Record> ConfigInfo(Table<O> child, ForeignKey<O, ConfigInfoRecord> key) {
        super(child, key, CONFIG_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<ConfigInfoRecord, Integer> getIdentity() {
        return (Identity<ConfigInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ConfigInfoRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_8;
    }

    @Override
    public List<UniqueKey<ConfigInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigInfoRecord>>asList(Keys.CONSTRAINT_8, Keys.CONFIG_INFO_APP_ID_INDEX);
    }

    @Override
    public ConfigInfo as(String alias) {
        return new ConfigInfo(DSL.name(alias), this);
    }

    @Override
    public ConfigInfo as(Name alias) {
        return new ConfigInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConfigInfo rename(String name) {
        return new ConfigInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConfigInfo rename(Name name) {
        return new ConfigInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
