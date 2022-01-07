package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Ship implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 船只ID
     */
    @TableId(value = "s_id", type = IdType.AUTO)
    private Integer sId;

    /**
     * 船只类型ID
     */
    private Integer stId;

    /**
     * 船只租赁价格
     */
    private BigDecimal sRentprice;

    /**
     * 船只名称
     */
    private String sName;

    /**
     * 船只编号
     */
    private String sNumber;

    /**
     * 船只配套产品
     */
    private String sProduct;

    /**
     * 船只详细信息
     */
    private String sDetail;

    /**
     * 船只故事
     */
    private String sStory;

    /**
     * 船只状态
     */
    private String sState;


}
