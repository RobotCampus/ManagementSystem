package com.example.springbootmybatisrobot.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootmybatisrobot.po.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
/**
* @Description: 订单服务类
* @Param:  * @Param: null
* @return:
* @Author: zbzbzb
* @Date: 2020/10/20
*/
public interface OrderService extends IService<Order> {
}
