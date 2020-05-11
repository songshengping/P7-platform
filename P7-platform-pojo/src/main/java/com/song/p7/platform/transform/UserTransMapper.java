package com.song.p7.platform.transform;

import com.song.p7.platform.bo.UserBO;
import com.song.p7.platform.pojo.Users;
import com.song.p7.platform.transform.base.StringToDateTrans;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy= NullValueCheckStrategy.ALWAYS, uses = StringToDateTrans.class)
public interface UserTransMapper {
    UserTransMapper INSTANCE = Mappers.getMapper(UserTransMapper.class);
    Users toPojo(UserBO userBO);
}
