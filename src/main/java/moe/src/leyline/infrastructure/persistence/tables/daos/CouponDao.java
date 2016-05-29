/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.Coupon;
import moe.src.leyline.infrastructure.persistence.tables.records.CouponRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class CouponDao extends DAOImpl<CouponRecord, moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon, Integer> {

    /**
     * Create a new CouponDao without any configuration
     */
    public CouponDao() {
        super(Coupon.COUPON, moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon.class);
    }

    /**
     * Create a new CouponDao with an attached configuration
     */
    @Autowired
    public CouponDao(Configuration configuration) {
        super(Coupon.COUPON, moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon object) {
        return object.getDiscountRuleId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon> fetchById(Integer... values) {
        return fetch(Coupon.COUPON.ID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon> fetchByName(String... values) {
        return fetch(Coupon.COUPON.NAME, values);
    }

    /**
     * Fetch records that have <code>discount_rule_id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon> fetchByDiscountRuleId(Integer... values) {
        return fetch(Coupon.COUPON.DISCOUNT_RULE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>discount_rule_id = value</code>
     */
    public moe.src.leyline.infrastructure.persistence.tables.pojos.Coupon fetchOneByDiscountRuleId(Integer value) {
        return fetchOne(Coupon.COUPON.DISCOUNT_RULE_ID, value);
    }
}
