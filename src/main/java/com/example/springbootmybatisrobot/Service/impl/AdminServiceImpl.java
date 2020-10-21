package com.example.springbootmybatisrobot.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisrobot.Mapper.AdminMapper;
import com.example.springbootmybatisrobot.Service.AdminService;
import com.example.springbootmybatisrobot.po.Admin;
import org.springframework.stereotype.Service;

@Service
/**
 * @description:管理员服务实现类
 * @author:zbzbzb
 * @create:2020--10--20
 */
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
