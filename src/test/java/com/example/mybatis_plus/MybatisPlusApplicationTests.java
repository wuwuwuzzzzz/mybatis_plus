package com.example.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis_plus.domain.User;
import com.example.mybatis_plus.mapper.OrdersMapper;
import com.example.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private OrdersMapper ordersMapper;

    @Test
    void testQueryList() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setUserName("wxz222");
        user.setPassword("777");
        userMapper.insert(user);
    }

    @Test
    void testDeleteById() {
        userMapper.deleteById(1627302300654780418L);
    }

    @Test
    void testDeleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", "wxz");
        userMapper.deleteByMap(map);
    }

    @Test
    void testUpdateById() {
        User user = new User();
        user.setAge(100);
        user.setId(4L);
        userMapper.updateById(user);
    }

    @Test
    void testWrapper01() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 18);
        queryWrapper.eq("address", "狐山");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper02() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", 1, 2, 3);
        queryWrapper.between("age", 12, 29);
        queryWrapper.like("address", "山");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper03() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", 1, 2, 3);
        queryWrapper.gt("age", 10);
        queryWrapper.orderByDesc("age");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper04() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id", "name");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper05() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select(User.class, tableFieldInfo -> "user_name".equals(tableFieldInfo.getColumn()));
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper06() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(new User());
        queryWrapper.select(tableFieldInfo -> !"address".equals(tableFieldInfo.getColumn()));
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper07() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("age", 99);
        updateWrapper.ge("id", 1);
        userMapper.update(null, updateWrapper);
    }

    @Test
    void testWrapper08() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.gt(User::getAge, 18);
        lambdaQueryWrapper.eq(User::getAddress, "狐山");
        List<User> users = userMapper.selectList(lambdaQueryWrapper);
        System.out.println(users);
    }

    @Test
    void testWrapper09() {
        User user = userMapper.findUser(1L);
        System.out.println(user);
    }

    @Test
    void testWrapper10() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        userMapper.findUserByWrapper(queryWrapper);
    }

    @Test
    void testWrapper11() {
        IPage<User> page = new Page<>();
        page.setSize(2);
        page.setCurrent(1);
        IPage<User> userIPage = userMapper.selectPage(page, null);
        System.out.println(userIPage.getRecords());
    }

    @Test
    void testWrapper12() {

    }
}
