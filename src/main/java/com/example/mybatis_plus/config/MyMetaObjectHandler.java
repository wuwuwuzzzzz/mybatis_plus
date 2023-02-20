package com.example.mybatis_plus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author wxz
 * @date 15:57 2023/2/20
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 添加时间
     *
     * @param metaObject metaObject
     * @author wxz
     * @date 15:59 2023/2/20
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }

    /**
     * 更新时间
     *
     * @param metaObject metaObject
     * @author wxz
     * @date 15:59 2023/2/20
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }
}
