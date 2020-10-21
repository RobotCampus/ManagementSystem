package com.example.springbootmybatisrobot.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisrobot.Mapper.RobotMapper;
import com.example.springbootmybatisrobot.Service.RobotService;
import com.example.springbootmybatisrobot.po.Robot;
import org.springframework.stereotype.Service;

@Service
/**
 * @description:机器人服务实现类
 * @author:zbzbzb
 * @create:2020--10--20
 */
public class RobotServiceImpl extends ServiceImpl<RobotMapper, Robot> implements RobotService {
}
