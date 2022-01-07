package com.example.demo.service;

import com.example.demo.entity.Ship;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rsy
 * @since 2021-08-12
 */
public interface IShipService extends IService<Ship> {
    List<Ship> selectAll();
}
