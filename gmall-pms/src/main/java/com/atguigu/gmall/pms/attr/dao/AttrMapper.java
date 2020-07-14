package com.atguigu.gmall.pms.attr.dao;

import com.atguigu.gmall.pms.attr.entity.po.Attr;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品属性(Attr)表数据库访问层
 *
 * @author yhj
 * @since 2020-07-14 16:56:21
 */
@Mapper
public interface AttrMapper extends BaseMapper<Attr> {


    List<Attr> findByPage(String attrName);
}