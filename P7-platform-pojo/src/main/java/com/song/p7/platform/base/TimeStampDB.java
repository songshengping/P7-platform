package com.song.p7.platform.base;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 数据库时间字段
 */
@Getter
@Setter
public class TimeStampDB {
	private Date updateTime;
    private Date createTime;
}
