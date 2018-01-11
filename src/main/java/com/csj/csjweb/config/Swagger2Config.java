package com.csj.csjweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    
    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.csj.csjweb.controller";
    public static final String VERSION = "1.0.0";

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot中使用Swagger2构建RESTfulAPI")
                .description("API接口文档")
                .termsOfServiceUrl("http://localhost:8088")
                .contact("LT")
                .version(VERSION).build();
    }
    
    
    /**
     * 创建默认分组的RestAPI
     * @return
     */
    @Bean
    public Docket createRestApiByDefault() {
        /**
         * apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。
         * select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，
         * 本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，并产生文档内容(除了被@ApiIgnore指定的请求)
         * groupName 在页面头部的下拉框里的显示值
         */
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .select().apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any()).build().groupName(Docket.DEFAULT_GROUP_NAME);
    }

}
