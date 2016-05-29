/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables.records;


import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.Discount;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DiscountRecord extends UpdatableRecordImpl<DiscountRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1166002190;

    /**
     * Setter for <code>leyline.discount.id</code>.
     */
    public DiscountRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>leyline.discount.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>leyline.discount.discount_rule_id</code>.
     */
    public DiscountRecord setDiscountRuleId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>leyline.discount.discount_rule_id</code>.
     */
    public Integer getDiscountRuleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>leyline.discount.coupon_id</code>.
     */
    public DiscountRecord setCouponId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>leyline.discount.coupon_id</code>.
     */
    public Integer getCouponId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Discount.DISCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Discount.DISCOUNT.DISCOUNT_RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Discount.DISCOUNT.COUPON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDiscountRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiscountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiscountRecord value2(Integer value) {
        setDiscountRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiscountRecord value3(Integer value) {
        setCouponId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiscountRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DiscountRecord
     */
    public DiscountRecord() {
        super(Discount.DISCOUNT);
    }

    /**
     * Create a detached, initialised DiscountRecord
     */
    public DiscountRecord(Integer id, Integer discountRuleId, Integer couponId) {
        super(Discount.DISCOUNT);

        set(0, id);
        set(1, discountRuleId);
        set(2, couponId);
    }
}
