package com.song.p7.platform.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Author songshengping
 * @Date 2020/4/9
 * @Version 1.0
 **/
@Configuration
@Slf4j
public class LanguageConfig implements WebMvcConfigurer {
    @Bean
    public LocaleResolver localeResolver() {
        log.info("LocaleResolver success");
        return new I18nConfig();
    }
}
