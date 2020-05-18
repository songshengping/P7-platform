package com.song.p7.platform.transform;

import com.song.p7.platform.bo.TestBO;
import com.song.p7.platform.pojo.Test;
import com.song.p7.platform.transform.base.StringToDateTrans;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TestTransMapper {
    TestTransMapper INSTANCE = Mappers.getMapper(TestTransMapper.class);

    Test toModel(TestBO testBO);

    void toModelTaget(@MappingTarget Test test, TestBO testBO);
}
