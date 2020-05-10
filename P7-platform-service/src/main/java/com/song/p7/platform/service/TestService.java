package com.song.p7.platform.service;

import com.song.p7.platform.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2020/5/10 20:23
 * @Created by Jeremy
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public Object getTestInfo(Integer id){
        return testMapper.selectByPrimaryKey(id);
    }
}
