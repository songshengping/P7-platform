package com.song.p7.platform.mapper;

import com.song.p7.platform.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> findUserByUsername(String username);
}