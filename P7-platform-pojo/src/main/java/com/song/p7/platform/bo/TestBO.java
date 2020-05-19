package com.song.p7.platform.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description 测试请求的请求累
 * @Date 2020/5/18 21:42
 * @Created by Jeremy
 */
@Getter
@Setter
public class TestBO {
    @ApiModelProperty(value = "id", name = "查询的ID")
    @JsonProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "name", name = "查询的名称")
    @JsonProperty(value = "name")
    private String name;
}
