package com.atguigu.core.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yhj
 * @classDesc 功能描述: 基础对象
 * @date 2020/7/14 16:25
 * @copyright 众阳健康
 */
@Data
@ApiModel
public class BasePageDTO {

    @ApiModelProperty(name = "pageNum",value = "页码",required = false)
    private Integer pageNum;

    @ApiModelProperty(name = "pageSize",value = "每页大小",required = false)
    private Integer pageSize;

}
