package com.example.demo.mapper;

import com.example.demo.entity.Ship;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author rsy
 * @since 2021-08-12
 */
@Repository
@Mapper
public interface ShipMapper extends BaseMapper<Ship> {
    List<Ship>selectall();
}
