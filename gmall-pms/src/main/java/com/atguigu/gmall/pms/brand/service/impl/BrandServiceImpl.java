package com.atguigu.gmall.pms.brand.service.impl;

import com.atguigu.gmall.pms.brand.entity.po.Brand;
import com.atguigu.gmall.pms.brand.dao.BrandMapper;
import com.atguigu.gmall.pms.brand.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 品牌(Brand)表服务实现类
 *
 * @author yhj
 * @since 2020-07-14 22:00:45
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandMapper brandMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    @Override
    public Brand getById(Long brandId) {
        return brandMapper.selectById(brandId);
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        brandMapper.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        brandMapper.updateById(brand);
        return getById(brand.getBrandId());
    }

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long brandId) {
        return brandMapper.deleteById(brandId) > 0;
    }
}