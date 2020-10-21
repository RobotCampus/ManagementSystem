package com.example.springbootmybatisrobot.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisrobot.Mapper.OrderMapper;
import com.example.springbootmybatisrobot.Service.OrderService;
import com.example.springbootmybatisrobot.po.Order;
import org.springframework.stereotype.Service;

@Service
/**
 * @description:订单服务实现类
 * @author:zbzbzb
 * @create:2020--10--20
 */
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
