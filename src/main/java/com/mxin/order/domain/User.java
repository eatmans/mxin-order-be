package com.mxin.order.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/29
 */
@Data
public class User {

    private static final long serialVersionUID = 2L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String phone;

    private String password;

    private String salt;

    private String email;

    private String avatarUrl;

    private  String unionId;

    private Integer loginTime;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime = new Date();

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
