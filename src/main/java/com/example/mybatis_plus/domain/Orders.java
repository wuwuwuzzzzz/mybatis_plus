package com.example.mybatis_plus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 * @author wxz
 * @date 14:12 2023/2/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    /**
     * 主键
     */
    private Long id;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 删除标识（0 未删除 1 已删除）
     */
    private Integer delFlag;
}

