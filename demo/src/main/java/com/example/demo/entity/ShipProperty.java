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
public class ShipProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 船只属性ID
     */
    private Integer spId;

    /**
     * 类型属性ID
     */
    private Integer stpId;

    /**
     * 属性值
     */
    private String spValue;


}
