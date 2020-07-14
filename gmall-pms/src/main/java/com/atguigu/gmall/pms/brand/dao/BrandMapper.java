package com.atguigu.gmall.pms.brand.dao;

import com.atguigu.gmall.pms.brand.entity.po.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌(Brand)表数据库访问层
 *
 * @author yhj
 * @since 2020-07-14 22:00:45
 */
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {

  
}