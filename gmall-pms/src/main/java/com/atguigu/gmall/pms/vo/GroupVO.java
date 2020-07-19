package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * @author yhj
 * @classDesc 功能描述: todo
 * @date 2020/7/19 10:36
 * @copyright 众阳健康
 */
@Data
public class GroupVO extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;


    private List<AttrAttrgroupRelationEntity> relations;
}
