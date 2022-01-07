package com.example.demo.service.impl;

import com.example.demo.entity.OrderHeader;
import com.example.demo.mapper.OrderHeaderMapper;
import com.example.demo.service.IOrderHeaderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rsy
 * @since 2021-08-12
 */
@Service
public class OrderHeaderServiceImpl extends ServiceImpl<OrderHeaderMapper, OrderHeader> implements IOrderHeaderService {

}
