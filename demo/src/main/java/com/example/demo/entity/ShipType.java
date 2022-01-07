package com.example.demo.entity;

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
public class ShipType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 船只类型ID
     */
    @TableId(value = "st_id", type = IdType.AUTO)
    private Integer stId;

    /**
     * 船只类型名称
     */
    private String stName;


}
