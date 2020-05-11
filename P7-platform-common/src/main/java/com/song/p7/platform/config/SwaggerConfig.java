package com.song.p7.platform.config;

import com.google.common.collect.Lists;
import com.song.p7.platform.constant.Constant;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * Swagger界面显示配置类
 * */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(
        prefix = "swagger-ui",
        name = {"enabled"},
        havingValue = "true"
)
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .forCodeGeneration(true)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.song.p7.platform.controller"))//自行修改为自己的包路径
                .paths(PathSelectors.any())//对所有路径进行监控
                .build()
                .securitySchemes(Lists.newArrayList(apiKey())) //配置输入认证
                .securityContexts(Lists.newArrayList(securityContext()));
    }

    private ApiKey apiKey() {
        return new ApiKey(Constant.HEADER_TOKEN, Constant.HEADER_TOKEN, "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.any())
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference(Constant.HEADER_TOKEN, authorizationScopes));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API 接口文档")
                .description("restful 风格接口")
                .version("1.0")
                .build();
    }
}