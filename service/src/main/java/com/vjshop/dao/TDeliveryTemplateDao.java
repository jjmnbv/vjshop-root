/*
 * This file is generated by jOOQ.
*/
package com.vjshop.dao;


import com.vjshop.generated.db.tables.TDeliveryTemplate;
import com.vjshop.generated.db.tables.records.TDeliveryTemplateRecord;
import org.apache.commons.collections.CollectionUtils;
import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Generated;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TDeliveryTemplateDao extends JooqBaseDao<TDeliveryTemplateRecord, com.vjshop.entity.TDeliveryTemplate, Long> {

    /**
     * Create a new TDeliveryTemplateDao without any configuration
     */
    public TDeliveryTemplateDao() {
        super(TDeliveryTemplate.T_DELIVERY_TEMPLATE, com.vjshop.entity.TDeliveryTemplate.class);
    }

    /**
     * Create a new TDeliveryTemplateDao with an attached configuration
     */
    @Autowired
    public TDeliveryTemplateDao(Configuration configuration) {
        super(TDeliveryTemplate.T_DELIVERY_TEMPLATE, com.vjshop.entity.TDeliveryTemplate.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.vjshop.entity.TDeliveryTemplate object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchById(Long... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.vjshop.entity.TDeliveryTemplate fetchOneById(Long value) {
        return fetchOne(TDeliveryTemplate.T_DELIVERY_TEMPLATE.ID, value);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByCreateDate(Timestamp... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>modify_date IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByModifyDate(Timestamp... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.MODIFY_DATE, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByVersion(Long... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.VERSION, values);
    }

    /**
     * Fetch records that have <code>background IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByBackground(String... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.BACKGROUND, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByContent(String... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.CONTENT, values);
    }

    /**
     * Fetch records that have <code>height IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByHeight(Integer... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.HEIGHT, values);
    }

    /**
     * Fetch records that have <code>is_default IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByIsDefault(Boolean... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.IS_DEFAULT, values);
    }

    /**
     * Fetch records that have <code>memo IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByMemo(String... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.MEMO, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByName(String... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.NAME, values);
    }

    /**
     * Fetch records that have <code>offsetx IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByOffsetx(Integer... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.OFFSETX, values);
    }

    /**
     * Fetch records that have <code>offsety IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByOffsety(Integer... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.OFFSETY, values);
    }

    /**
     * Fetch records that have <code>width IN (values)</code>
     */
    public List<com.vjshop.entity.TDeliveryTemplate> fetchByWidth(Integer... values) {
        return fetch(TDeliveryTemplate.T_DELIVERY_TEMPLATE.WIDTH, values);
    }

    public com.vjshop.entity.TDeliveryTemplate findDefault(){
        ResultSet res = this.getDslContext().selectFrom(this.getTable()).where(TDeliveryTemplate.T_DELIVERY_TEMPLATE.IS_DEFAULT.eq(Boolean.TRUE)).fetchResultSet();
        List<com.vjshop.entity.TDeliveryTemplate> tDeliveryTemplates = super.resultSet2List(res);
        return CollectionUtils.isEmpty(tDeliveryTemplates) ? null : tDeliveryTemplates.get(0);
    }
}
