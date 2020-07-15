package com.atguigu.gmall.pms.brand.controller;

import com.atguigu.gmall.pms.brand.entity.po.Brand;
import com.atguigu.gmall.pms.brand.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌(Brand)表控制层
 *
 * @author yhj
 * @since 2020-07-14 22:00:45
 */
 
@Api(value = "BrandController", tags = {"品牌(Brand)表控制层"})
@RestController
@RequestMapping("/pms/brand")
public class BrandController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @GetMapping("/getById")
    public Brand getById(Long id) {
        return brandService.getById(id);
    }

}