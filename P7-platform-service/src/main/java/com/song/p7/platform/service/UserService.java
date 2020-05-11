package com.song.p7.platform.service;

import com.song.p7.platform.bo.UserBO;
import com.song.p7.platform.mapper.UsersMapper;
import com.song.p7.platform.pojo.Users;
import com.song.p7.platform.transform.UserTransMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @Description TODO
 * @Date 2020/5/10 22:11
 * @Created by Jeremy
 */
@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    public boolean usernameIsExist(String username){
        return usersMapper.findUserByUsername(username).isEmpty();
    }

    public boolean createUser(UserBO userBO){
        Users user = UserTransMapper.INSTANCE.toPojo(userBO);
        return usersMapper.insert(user) > 0;
    }
}
