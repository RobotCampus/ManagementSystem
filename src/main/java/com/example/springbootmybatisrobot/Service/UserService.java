package com.example.springbootmybatisrobot.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootmybatisrobot.po.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
* @Description: 用户服务类
* @Param:  * @Param: null
* @return:
* @Author: zbzbzb
* @Date: 2020/10/20
*/
@Service
@Component
public interface UserService extends IService<User> {
}
