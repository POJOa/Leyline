/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.domain;

import java.io.Serializable;

import lombok.Data;
import moe.src.leyline.infrastructure.tagging.DO;

@Data public class DiscountRule implements DO {

    private static final long serialVersionUID = -202101687;

    private Integer id;
    private Integer price;
    private Integer rate;

}
