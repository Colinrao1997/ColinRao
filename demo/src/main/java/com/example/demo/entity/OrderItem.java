package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author rsy
 * @since 2021-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单详细ID
     */
    @TableId(value = "oi_Id", type = IdType.AUTO)
    private Integer oiId;

    /**
     * 船名
     */
    private String oiName;

    /**
     * 预订船只类型
     */
    private String oiType;

    /**
     * 船只编号
     */
    private String oiNumber;

    /**
     * 船只配套产品
     */
    private LocalDateTime oiProduct;

    /**
     * 船只租赁价格
     */
    private LocalDateTime oiRentprice;

    /**
     * 支付小计
     */
    private String oiSettleAccounts;

    /**
     * 预订id
     */
    private BigDecimal ohItemId;


}
