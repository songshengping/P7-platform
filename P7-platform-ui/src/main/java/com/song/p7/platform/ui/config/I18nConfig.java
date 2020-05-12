package com.song.p7.platform.ui.config;

import com.song.p7.platform.constant.MemoryValue;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Description 国际化
 * @Author songshengping
 * @Date 2020/4/8
 * @Version 1.0
 **/
@Configuration
public class I18nConfig implements LocaleResolver {

    private static MessageSource messageSource;

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String[] tmp = MemoryValue.DEFAULT_LANGUAGE.split("_");
        String language = tmp[0];
        String country = tmp.length > 1 ? tmp[1] : "";
        return new Locale(language, country);
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }

    /**
     * 获取单个国际化翻译值
     */
    public static String get(String msgKey) {
        try {
            return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }
}
