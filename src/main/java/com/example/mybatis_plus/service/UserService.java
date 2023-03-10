package com.example.mybatis_plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatis_plus.domain.User;

/**
 * @author wxz
 * @date 15:32 2023/2/20
 */
public interface UserService extends IService<User> {

    /**
     * 获取用户信息
     *
     * @return com.example.mybatis_plus.domain.User
     * @author wxz
     * @date 15:41 2023/2/20
     */
    User getUser();
}
