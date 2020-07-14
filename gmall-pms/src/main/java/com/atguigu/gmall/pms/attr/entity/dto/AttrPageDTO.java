package com.atguigu.gmall.pms.attr.entity.dto;

import com.atguigu.core.bean.BasePageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分页入参对象
 *
 * @author yhj
 * @since 2020-07-14 16:56:21
 */
@Data
@ApiModel
public class AttrPageDTO extends BasePageDTO {

    /**
     * 属性名
     */
    @ApiModelProperty("属性名")
    private String attrName;

}