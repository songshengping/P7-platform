package com.song.p7.platform.transform;

import com.song.p7.platform.bo.UserBO;
import com.song.p7.platform.pojo.Users;
import com.song.p7.platform.transform.base.StringToDateTrans;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-18T23:24:22+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class UserTransMapperImpl implements UserTransMapper {

    private final StringToDateTrans stringToDateTrans = new StringToDateTrans();

    @Override
    public Users toPojo(UserBO userBO) {
        if ( userBO == null ) {
            return null;
        }

        Users users = new Users();

        if ( userBO.getUsername() != null ) {
            users.setUsername( userBO.getUsername() );
        }
        if ( userBO.getPassword() != null ) {
            users.setPassword( userBO.getPassword() );
        }
        if ( userBO.getNickname() != null ) {
            users.setNickname( userBO.getNickname() );
        }
        if ( userBO.getRealname() != null ) {
            users.setRealname( userBO.getRealname() );
        }
        if ( userBO.getFace() != null ) {
            users.setFace( userBO.getFace() );
        }
        if ( userBO.getMobile() != null ) {
            users.setMobile( userBO.getMobile() );
        }
        if ( userBO.getEmail() != null ) {
            users.setEmail( userBO.getEmail() );
        }
        if ( userBO.getSex() != null ) {
            users.setSex( userBO.getSex() );
        }
        if ( userBO.getBirthday() != null ) {
            users.setBirthday( stringToDateTrans.stringToDate( userBO.getBirthday() ) );
        }

        return users;
    }
}
