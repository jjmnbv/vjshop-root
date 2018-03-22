/*
 * This file is generated by jOOQ.
*/
package com.vjshop.dao;


import com.vjshop.generated.db.tables.TSn;
import com.vjshop.generated.db.tables.records.TSnRecord;
import com.vjshop.util.FreeMarkerUtils;
import freemarker.template.TemplateException;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.annotation.Generated;
import java.io.IOException;
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
public class TSnDao extends JooqBaseDao<TSnRecord, com.vjshop.entity.TSn, Long> implements InitializingBean {
    @Value("${sn.goods.prefix}")
    private String goodsPrefix;
    @Value("${sn.goods.maxLo}")
    private int goodsMaxLo;
    @Value("${sn.order.prefix}")
    private String orderPrefix;
    @Value("${sn.order.maxLo}")
    private int orderMaxLo;
    @Value("${sn.paymentLog.prefix}")
    private String paymentLogPrefix;
    @Value("${sn.paymentLog.maxLo}")
    private int paymentLogMaxLo;
    @Value("${sn.payment.prefix}")
    private String paymentPrefix;
    @Value("${sn.payment.maxLo}")
    private int paymentMaxLo;
    @Value("${sn.refunds.prefix}")
    private String refundsPrefix;
    @Value("${sn.refunds.maxLo}")
    private int refundsMaxLo;
    @Value("${sn.shipping.prefix}")
    private String shippingPrefix;
    @Value("${sn.shipping.maxLo}")
    private int shippingMaxLo;
    @Value("${sn.returns.prefix}")
    private String returnsPrefix;
    @Value("${sn.returns.maxLo}")
    private int returnsMaxLo;

    /** 货品编号生成器 */
    private HiloOptimizer goodsHiloOptimizer ;

    /** 订单编号生成器 */
    private HiloOptimizer orderHiloOptimizer ;

    /** 支付记录编号生成器 */
    private HiloOptimizer paymentLogHiloOptimizer ;

    /** 收款单编号生成器 */
    private HiloOptimizer paymentHiloOptimizer ;

    /** 退款单编号生成器 */
    private HiloOptimizer refundsHiloOptimizer ;

    /** 发货单编号生成器 */
    private HiloOptimizer shippingHiloOptimizer ;

    /** 退货单编号生成器 */
    private HiloOptimizer returnsHiloOptimizer ;



    /**
     * 初始化
     */
    public void afterPropertiesSet() throws Exception {
        goodsHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.goods, goodsPrefix, goodsMaxLo);
        orderHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.order, orderPrefix, orderMaxLo);
        paymentLogHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.paymentLog, paymentLogPrefix, paymentLogMaxLo);
        paymentHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.payment, paymentPrefix, paymentMaxLo);
        refundsHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.refunds, refundsPrefix, refundsMaxLo);
        shippingHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.shipping, shippingPrefix, shippingMaxLo);
        returnsHiloOptimizer = new HiloOptimizer(com.vjshop.entity.TSn.Type.returns, returnsPrefix, returnsMaxLo);
    }
    

    /**
     * Create a new TSnDao without any configuration
     */
    public TSnDao() {
        super(TSn.T_SN, com.vjshop.entity.TSn.class);
    }

    /**
     * Create a new TSnDao with an attached configuration
     */
    @Autowired
    public TSnDao(Configuration configuration) {
        super(TSn.T_SN, com.vjshop.entity.TSn.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.vjshop.entity.TSn object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.vjshop.entity.TSn> fetchById(Long... values) {
        return fetch(TSn.T_SN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.vjshop.entity.TSn fetchOneById(Long value) {
        return fetchOne(TSn.T_SN.ID, value);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.vjshop.entity.TSn> fetchByCreateDate(Timestamp... values) {
        return fetch(TSn.T_SN.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>modify_date IN (values)</code>
     */
    public List<com.vjshop.entity.TSn> fetchByModifyDate(Timestamp... values) {
        return fetch(TSn.T_SN.MODIFY_DATE, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.vjshop.entity.TSn> fetchByVersion(Long... values) {
        return fetch(TSn.T_SN.VERSION, values);
    }

    /**
     * Fetch records that have <code>last_value IN (values)</code>
     */
    public List<com.vjshop.entity.TSn> fetchByLastValue(Long... values) {
        return fetch(TSn.T_SN.LAST_VALUE, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.vjshop.entity.TSn> fetchByType(Integer... values) {
        return fetch(TSn.T_SN.TYPE, values);
    }

    /**
     * Fetch a unique record that has <code>type = value</code>
     */
    public com.vjshop.entity.TSn fetchOneByType(Integer value) {
        return fetchOne(TSn.T_SN.TYPE, value);
    }

    /**
     * 获取末值
     *
     * @param type
     *            类型
     * @return 末值
     */
    private long getLastValue(com.vjshop.entity.TSn.Type type) {
        com.vjshop.entity.TSn tSn = this.fetchOneByType(type.ordinal());
        long lastValue = tSn.getLastValue();
        tSn.setLastValue(lastValue + 1);
        tSn.setModifyDate(new Timestamp(System.currentTimeMillis()));
        updateSelective(tSn);
        return lastValue;
    }

    /**
     * 高低位算法生成器
     */
    private class HiloOptimizer {

        /** 类型 */
        private com.vjshop.entity.TSn.Type type;

        /** 前缀 */
        private String prefix;

        /** 最大低位值 */
        private int maxLo;

        /** 低位值 */
        private int lo;

        /** 高位值 */
        private long hi;

        /** 末值 */
        private long lastValue;

        /**
         * 构造方法
         *
         * @param type
         *            类型
         * @param prefix
         *            前缀
         * @param maxLo
         *            最大低位值
         */
        public HiloOptimizer(com.vjshop.entity.TSn.Type type, String prefix, int maxLo) {
            this.type = type;
            this.prefix = prefix != null ? prefix.replace("{", "${") : "";
            this.maxLo = maxLo;
            this.lo = maxLo + 1;
        }

        /**
         * 生成序列号
         *
         * @return 序列号
         */
        public synchronized String generate() {
            if (lo > maxLo) {
                lastValue = getLastValue(type);
                lo = lastValue == 0 ? 1 : 0;
                hi = lastValue * (maxLo + 1);
            }
            try {
                return FreeMarkerUtils.process(prefix) + (hi + lo++);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            } catch (TemplateException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
    }

    /**
     * 生成序列号
     *
     * @param type
     *            类型
     * @return 序列号
     */
    public String generate(com.vjshop.entity.TSn.Type type) {
        Assert.notNull(type);

        switch (type) {
            case goods:
                return goodsHiloOptimizer.generate();
            case order:
                return orderHiloOptimizer.generate();
            case paymentLog:
                return paymentLogHiloOptimizer.generate();
            case payment:
                return paymentHiloOptimizer.generate();
            case refunds:
                return refundsHiloOptimizer.generate();
            case shipping:
                return shippingHiloOptimizer.generate();
            case returns:
                return returnsHiloOptimizer.generate();
        }
        return null;
    }
}