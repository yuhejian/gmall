package com.atguigu.gmall.pms.brand.service;

import com.atguigu.gmall.pms.brand.entity.po.Brand;

/**
 * 品牌(Brand)表服务接口
 *
 * @author yhj
 * @since 2020-07-14 22:00:45
 */
public interface BrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand getById(Long brandId);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    boolean deleteById(Long brandId);

}