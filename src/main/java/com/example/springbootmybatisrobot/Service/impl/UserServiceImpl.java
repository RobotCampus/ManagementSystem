package com.example.springbootmybatisrobot.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisrobot.Mapper.UserMapper;
import com.example.springbootmybatisrobot.po.User;
import com.example.springbootmybatisrobot.Service.UserService;
import org.springframework.stereotype.Service;

@Service
/**
 * @description:用户服务实现类
 * @author:zbzbzb
 * @create:2020--10--20
 */
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
