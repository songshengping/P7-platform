package com.song.p7.platform.ui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

/**
 * @Description TODO
 * @Date 2020/5/12 23:10
 * @Created by Jeremy
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UiApplication {
    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
}
