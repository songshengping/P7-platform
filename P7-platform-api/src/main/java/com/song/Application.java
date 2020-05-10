package com.song;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Description TODO
 * @Date 2020/5/10 12:40
 * @Created by Jeremy
 */
@SpringBootApplication
@MapperScan(basePackages = "com.song.p7.platform.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
