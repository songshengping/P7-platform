package com.song.p7.platform.service;

import com.song.p7.platform.bo.UserBO;
import com.song.p7.platform.mapper.UsersMapper;
import com.song.p7.platform.pojo.Users;
import com.song.p7.platform.transform.UserTransMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

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
        return !usersMapper.findUserByUsername(username).isEmpty();
    }

    @Transactional
    public boolean createUser(UserBO userBO){
        Users user = UserTransMapper.INSTANCE.toPojo(userBO);
        return usersMapper.insert(user) > 0;
    }

    public Users findUserByUsername(String username) {
        List<Users> usersList = usersMapper.findUserByUsername(username);
        return usersList.isEmpty() ? null : usersList.iterator().next();
    }
}
