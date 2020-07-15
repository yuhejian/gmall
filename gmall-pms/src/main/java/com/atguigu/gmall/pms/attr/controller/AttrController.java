package com.atguigu.gmall.pms.attr.controller;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.pms.attr.entity.dto.AttrPageDTO;
import com.atguigu.gmall.pms.attr.entity.po.Attr;
import com.atguigu.gmall.pms.attr.service.AttrService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品属性(Attr)表控制层
 *
 * @author yhj
 * @since 2020-07-14 16:56:21
 */

@Api(value = "AttrController", tags = {"商品属性(Attr)表控制层"})
@RestController
@RequestMapping("/pms/attr")
public class AttrController {
    /**
     * 服务对象
     */
    @Resource
    private AttrService attrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @GetMapping("/getById")
    public Resp getById(Long id) {
        Attr attr = attrService.getById(id);
        return Resp.ok(attr);
    }

    /**
     * 分页查询
     *
     * @param attrPageDTO 分页查询对象
     * @author: yhj
     * @return: PageInfo<Attr>
     */
    @ApiOperation(value = "分页查询")
    @PostMapping("/findByPage")
    public Resp findByPage(@RequestBody AttrPageDTO attrPageDTO) {
        return Resp.ok(attrService.findByPage(attrPageDTO));
    }

}