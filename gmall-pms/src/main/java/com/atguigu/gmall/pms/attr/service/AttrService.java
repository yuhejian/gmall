package com.atguigu.gmall.pms.attr.service;

import com.atguigu.gmall.pms.attr.entity.dto.AttrPageDTO;
import com.atguigu.gmall.pms.attr.entity.po.Attr;
import com.github.pagehelper.PageInfo;

/**
 * 商品属性(Attr)表服务接口
 *
 * @author yhj
 * @since 2020-07-14 16:56:21
 */
public interface AttrService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    Attr getById(Long attrId);

    /**
     * 新增数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    Attr insert(Attr attr);

    /**
     * 修改数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    Attr update(Attr attr);

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    boolean deleteById(Long attrId);


    /**
     * 分页查询
     *
     * @param attrPageDTO   分页查询对象
     * @author: yhj
     * @return: PageInfo<Attr>
     */
    PageInfo<Attr> findByPage(AttrPageDTO attrPageDTO);
}