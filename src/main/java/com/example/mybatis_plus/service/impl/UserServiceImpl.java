package com.example.mybatis_plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis_plus.domain.User;
import com.example.mybatis_plus.mapper.UserMapper;
import com.example.mybatis_plus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wxz
 * @d ate 15:33 2023/2/20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 获取用户信息
     *
     * @return com.example.mybatis_plus.domain.User
     * @author wxz
     * @date 15:42 2023/2/20
     */
    @Override
    public User getUser() {
        UserMapper userMapper = getBaseMapper();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        return userMapper.selectOne(queryWrapper);
    }
}
