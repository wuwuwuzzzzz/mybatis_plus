package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
     * @return java.util.List<com.example.mybatis_plus.domain.Orders>
     * @author wxz
     * @date 15:16 2023/2/20
     */
    List<Orders> findOrders();
}
