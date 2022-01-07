package com.example.demo.service.impl;

import com.example.demo.entity.Ship;
import com.example.demo.mapper.ShipMapper;
import com.example.demo.service.IShipService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rsy
 * @since 2021-08-12
 */
@Service
public class ShipServiceImpl extends ServiceImpl<ShipMapper, Ship> implements IShipService {

    @Autowired
private ShipMapper shipMapper;


    @Override
    public List<Ship> selectAll() {
        return shipMapper.selectall();
    }
}
