package com.atguigu.gmall.pms.attr.service.impl;

import com.atguigu.gmall.pms.attr.entity.dto.AttrPageDTO;
import com.atguigu.gmall.pms.attr.entity.po.Attr;
import com.atguigu.gmall.pms.attr.dao.AttrMapper;
import com.atguigu.gmall.pms.attr.service.AttrService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品属性(Attr)表服务实现类
 *
 * @author yhj
 * @since 2020-07-14 16:56:21
 */
@Service
public class AttrServiceImpl implements AttrService {
    @Resource
    private AttrMapper attrMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    @Override
    public Attr getById(Long attrId) {
        return attrMapper.selectById(attrId);
    }

    /**
     * 新增数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    @Override
    public Attr insert(Attr attr) {
        attrMapper.insert(attr);
        return attr;
    }

    /**
     * 修改数据
     *
     * @param attr 实例对象
     * @return 实例对象
     */
    @Override
    public Attr update(Attr attr) {
        attrMapper.updateById(attr);
        return getById(attr.getAttrId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrId) {
        return attrMapper.deleteById(attrId) > 0;
    }

    /**
     * 分页查询
     *
     * @param attrPageDTO 分页查询对象
     * @author: yhj
     * @return: PageInfo<Attr>
     */
    @Override
    public PageInfo<Attr> findByPage(AttrPageDTO attrPageDTO) {
        PageHelper.startPage(attrPageDTO.getPageNum(), attrPageDTO.getPageSize());
        List<Attr> attrs = attrMapper.findByPage(attrPageDTO.getAttrName());
        return new PageInfo<Attr>(attrs);
    }
}