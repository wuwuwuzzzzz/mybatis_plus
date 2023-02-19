package com.example.mybatis_plus;

import com.example.mybatis_plus.domain.User;
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
//        userMapper.updateById(user);
    }
}
