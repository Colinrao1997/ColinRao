package com.example.demo.service.impl;

import com.example.demo.entity.OrderItem;
import com.example.demo.mapper.OrderItemMapper;
import com.example.demo.service.IOrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
