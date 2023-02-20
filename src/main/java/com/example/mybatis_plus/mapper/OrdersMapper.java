package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis_plus.domain.Orders;

import java.util.List;

/**
 * @author wxz
 * @date 15:15 2023/2/20
 */
public interface OrdersMapper extends BaseMapper<Orders> {

    /**
     * 查询订单列表
     *
     * @param page page
     * @return com.baomidou.mybatisplus.core.metadata.IPage<com.example.mybatis_plus.domain.Orders>
     * @author wxz
     * @date 15:23 2023/2/20
     */
    IPage<Orders> findOrders(Page<Orders> page);
}
