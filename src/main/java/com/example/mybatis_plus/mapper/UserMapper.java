package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis_plus.domain.User;

/**
 *
 * @author wxz
 * @date 21:28 2023/2/19
 */

public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询用户
     * @author wxz
     * @date 14:18 2023/2/20
     * @param id 用户ID
     * @return com.example.mybatis_plus.domain.User
     */
    User findUser(Long id);
}
