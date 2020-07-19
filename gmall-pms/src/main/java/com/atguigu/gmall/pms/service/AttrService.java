package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.dto.AttrDTO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品属性
 *
 * @author yhj
 * @email yhj@atguigu.com
 * @date 2020-07-16 21:16:18
 */
public interface AttrService extends IService<AttrEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo baseInfoByCidAndType(QueryCondition queryCondition, Integer type, Long cid);

    void saveAttr(AttrDTO attr);
}

