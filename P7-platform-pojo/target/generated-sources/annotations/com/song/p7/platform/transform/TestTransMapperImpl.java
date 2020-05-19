package com.song.p7.platform.transform;

import com.song.p7.platform.bo.TestBO;
import com.song.p7.platform.pojo.Test;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-18T23:26:27+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class TestTransMapperImpl implements TestTransMapper {

    @Override
    public Test toModel(TestBO testBO) {
        if ( testBO == null ) {
            return null;
        }

        Test test = new Test();

        if ( testBO.getId() != null ) {
            test.setId( testBO.getId() );
        }
        if ( testBO.getName() != null ) {
            test.setName( testBO.getName() );
        }

        return test;
    }

    @Override
    public void toModelTaget(Test test, TestBO testBO) {
        if ( testBO == null ) {
            return;
        }

        if ( testBO.getId() != null ) {
            test.setId( testBO.getId() );
        }
        if ( testBO.getName() != null ) {
            test.setName( testBO.getName() );
        }
    }
}
