package com.song.p7.platform.service.impl;

import com.song.p7.platform.mapper.TestMapper;
import com.song.p7.platform.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description TODO
 * @Date 2020/5/10 20:23
 * @Created by Jeremy
 */
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Object getTestInfo(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
