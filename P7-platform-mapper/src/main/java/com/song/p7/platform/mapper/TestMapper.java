package com.song.p7.platform.mapper;

import com.song.p7.platform.pojo.Test;

import java.util.List;

public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    List<Test> findAll();

    List<Test> findTestByName(String name);

    List<Test> findTestBySlective(Test record);

    List<Test> findTestByParam(Integer id, String name);
}