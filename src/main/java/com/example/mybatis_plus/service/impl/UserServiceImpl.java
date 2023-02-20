package com.example.mybatis_plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis_plus.domain.User;
import com.example.mybatis_plus.mapper.UserMapper;
import com.example.mybatis_plus.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 * @author wxz
 * @date 15:33 2023/2/20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {}
