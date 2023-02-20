package com.example.mybatis_plus.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wxz
 * @date 14:38 2023/2/20
 */
@Configuration
public class PageConfig {

    /**
     * Mybatis-Plus分页(3.4.0之后的版本)
     *
     * @return com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
     * @author wxz
     * @date 14:40 2023/2/20
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}
