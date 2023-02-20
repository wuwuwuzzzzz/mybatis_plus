package com.example.mybatis_plus.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
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
     * 用户ID
     */
    private Integer userId;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 版本
     */
    @Version
    private Integer version;

    /**
     * 删除标识（0 未删除 1 已删除）
     */
    private Integer delFlag;

    /**
     * 用户名
     */
    @TableField(exist = false)
    private String userName;
}

