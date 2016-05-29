/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.Coupon;
import moe.src.leyline.infrastructure.persistence.tables.Discount;
import moe.src.leyline.infrastructure.persistence.tables.DiscountRule;
import moe.src.leyline.infrastructure.persistence.tables.OrderDetail;
import moe.src.leyline.infrastructure.persistence.tables.OrderParent;
import moe.src.leyline.infrastructure.persistence.tables.Product;
import moe.src.leyline.infrastructure.persistence.tables.User;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Leyline extends SchemaImpl {

    private static final long serialVersionUID = 1738055920;

    /**
     * The reference instance of <code>leyline</code>
     */
    public static final Leyline LEYLINE = new Leyline();

    /**
     * The table <code>leyline.coupon</code>.
     */
    public final Coupon COUPON = moe.src.leyline.infrastructure.persistence.tables.Coupon.COUPON;

    /**
     * The table <code>leyline.discount</code>.
     */
    public final Discount DISCOUNT = moe.src.leyline.infrastructure.persistence.tables.Discount.DISCOUNT;

    /**
     * The table <code>leyline.discount_rule</code>.
     */
    public final DiscountRule DISCOUNT_RULE = moe.src.leyline.infrastructure.persistence.tables.DiscountRule.DISCOUNT_RULE;

    /**
     * The table <code>leyline.order_detail</code>.
     */
    public final OrderDetail ORDER_DETAIL = moe.src.leyline.infrastructure.persistence.tables.OrderDetail.ORDER_DETAIL;

    /**
     * The table <code>leyline.order_parent</code>.
     */
    public final OrderParent ORDER_PARENT = moe.src.leyline.infrastructure.persistence.tables.OrderParent.ORDER_PARENT;

    /**
     * The table <code>leyline.product</code>.
     */
    public final Product PRODUCT = moe.src.leyline.infrastructure.persistence.tables.Product.PRODUCT;

    /**
     * The table <code>leyline.user</code>.
     */
    public final User USER = moe.src.leyline.infrastructure.persistence.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Leyline() {
        super("leyline", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Coupon.COUPON,
            Discount.DISCOUNT,
            DiscountRule.DISCOUNT_RULE,
            OrderDetail.ORDER_DETAIL,
            OrderParent.ORDER_PARENT,
            Product.PRODUCT,
            User.USER);
    }
}
