/*
 * This file is generated by jOOQ.
*/
package com.vjshop.dao;


import com.vjshop.generated.db.tables.TRefunds;
import com.vjshop.generated.db.tables.records.TRefundsRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Generated;
import java.math.BigDecimal;
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
public class TRefundsDao extends JooqBaseDao<TRefundsRecord, com.vjshop.entity.TRefunds, Long> {

    /**
     * Create a new TRefundsDao without any configuration
     */
    public TRefundsDao() {
        super(TRefunds.T_REFUNDS, com.vjshop.entity.TRefunds.class);
    }

    /**
     * Create a new TRefundsDao with an attached configuration
     */
    @Autowired
    public TRefundsDao(Configuration configuration) {
        super(TRefunds.T_REFUNDS, com.vjshop.entity.TRefunds.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.vjshop.entity.TRefunds object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchById(Long... values) {
        return fetch(TRefunds.T_REFUNDS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.vjshop.entity.TRefunds fetchOneById(Long value) {
        return fetchOne(TRefunds.T_REFUNDS.ID, value);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByCreateDate(Timestamp... values) {
        return fetch(TRefunds.T_REFUNDS.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>modify_date IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByModifyDate(Timestamp... values) {
        return fetch(TRefunds.T_REFUNDS.MODIFY_DATE, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByVersion(Long... values) {
        return fetch(TRefunds.T_REFUNDS.VERSION, values);
    }

    /**
     * Fetch records that have <code>account IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByAccount(String... values) {
        return fetch(TRefunds.T_REFUNDS.ACCOUNT, values);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByAmount(BigDecimal... values) {
        return fetch(TRefunds.T_REFUNDS.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>bank IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByBank(String... values) {
        return fetch(TRefunds.T_REFUNDS.BANK, values);
    }

    /**
     * Fetch records that have <code>memo IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByMemo(String... values) {
        return fetch(TRefunds.T_REFUNDS.MEMO, values);
    }

    /**
     * Fetch records that have <code>method IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByMethod(Integer... values) {
        return fetch(TRefunds.T_REFUNDS.METHOD, values);
    }

    /**
     * Fetch records that have <code>operator IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByOperator(String... values) {
        return fetch(TRefunds.T_REFUNDS.OPERATOR, values);
    }

    /**
     * Fetch records that have <code>payee IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByPayee(String... values) {
        return fetch(TRefunds.T_REFUNDS.PAYEE, values);
    }

    /**
     * Fetch records that have <code>payment_method IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByPaymentMethod(String... values) {
        return fetch(TRefunds.T_REFUNDS.PAYMENT_METHOD, values);
    }

    /**
     * Fetch records that have <code>sn IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchBySn(String... values) {
        return fetch(TRefunds.T_REFUNDS.SN, values);
    }

    /**
     * Fetch a unique record that has <code>sn = value</code>
     */
    public com.vjshop.entity.TRefunds fetchOneBySn(String value) {
        return fetchOne(TRefunds.T_REFUNDS.SN, value);
    }

    /**
     * Fetch records that have <code>orders IN (values)</code>
     */
    public List<com.vjshop.entity.TRefunds> fetchByOrders(Long... values) {
        return fetch(TRefunds.T_REFUNDS.ORDERS, values);
    }
}
