/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.domain;

import java.io.Serializable;

import lombok.Data;

@Data public class OrderDetail implements Serializable {

    private static final long serialVersionUID = -325383597;

    private Integer id;
    private Integer productId;
    private Integer customerId;
    private String  quantity;
    private Integer parentOrderId;

}
