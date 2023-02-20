package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.mybatis_plus.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author wxz
 * @date 21:28 2023/2/19
 */

public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询用户
     *
     * @param id 用户ID
     * @return com.example.mybatis_plus.domain.User
     * @author wxz
     * @date 14:18 2023/2/20
     */
    User findUser(Long id);

    /**
     * 查询用户
     *
     * @param wrapper wrapper
     * @return com.example.mybatis_plus.domain.User
     * @author wxz
     * @date 14:28 2023/2/20
     */
    User findUserByWrapper(@Param(Constants.WRAPPER) Wrapper<User> wrapper);
}
