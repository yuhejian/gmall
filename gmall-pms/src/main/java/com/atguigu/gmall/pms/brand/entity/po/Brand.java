package com.atguigu.gmall.pms.brand.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 品牌(Brand)实体类
 *
 * @author yhj
 * @since 2020-07-14 22:00:45
 */

@Data
@TableName("pms_brand")
public class Brand implements Serializable {
    private static final long serialVersionUID = 644823835921281848L;


    /**
     * 品牌id
     */
    @TableId
    private Long brandId;


    /**
     * 品牌名
     */
    private String name;


    /**
     * 品牌logo地址
     */
    private String logo;


    /**
     * 介绍
     */
    private Object descript;


    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Object showStatus;


    /**
     * 检索首字母
     */
    private String firstLetter;


    /**
     * 排序
     */
    private Integer sort;

}