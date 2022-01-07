package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class OrderHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    @TableId(value = "oh_id", type = IdType.AUTO)
    private Integer ohId;

    /**
     * 预订人
     */
    private String ohCusName;

    /**
     * 接待人
     */
    private String ohServName;

    /**
     * 收款账户
     */
    private String ohAccountNum;

    /**
     * 预订起始时间
     */
    private LocalDateTime ohTimeStart;

    /**
     * 预订结束时间
     */
    private LocalDateTime ohTimeEnd;

    /**
     * 支付状态
     */
    private String ohPayStatus;

    /**
     * 支付总金额
     */
    @TableField("oh_Tamount_paid")
    private BigDecimal ohTamountPaid;


}
