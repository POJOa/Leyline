/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.domain;

import java.io.Serializable;

import lombok.Data;

@Data public class Discount implements Serializable {

    private static final long serialVersionUID = 984377785;

    private Integer id;
    private Integer discountRuleId;
    private Integer couponId;

}
