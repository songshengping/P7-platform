package com.song.p7.platform.service;

import com.song.p7.platform.bo.TestBO;
import com.song.p7.platform.mapper.TestMapper;
import com.song.p7.platform.pojo.Test;
import com.song.p7.platform.transform.TestTransMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/5/10 20:23
 * @Created by Jeremy
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public Test getTest(Integer id){
        return testMapper.selectByPrimaryKey(id);
    }

    public List<Test> getAllTest() {
        return testMapper.findAll();
    }

    public List<Test> getTestByName(String name) {
        return testMapper.findTestByName(name);
    }

    public List<Test> getTestByBO(TestBO testBO) {
        return testMapper.findTestBySlective(TestTransMapper.INSTANCE.toModel(testBO));
    }

    public List<Test> getTestByParam(Integer id, String name) {
        return testMapper.findTestByParam(id,name);
    }

    public int deleteTestById(Integer id) {
        return testMapper.deleteByPrimaryKey(id);
    }

    public int addTest(String name) {
        return testMapper.insert(new Test(name));
    }

    public int modifyByBO(TestBO testBO){

        return 0;
    }

    public int modifyByParam(Test test) {
        return testMapper.updateByPrimaryKeySelective(test);
    }
}
