package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yhj
 * @email yhj@atguigu.com
 * @date 2020-07-16 21:28:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
