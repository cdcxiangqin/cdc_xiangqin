package com.cdc.blinddate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Program: blinddate
 * @Description: 标准TESTful接口
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 02:03
 **/
@Configuration
@EnableSwagger2
public class SwaggerRESTful {
    @Bean
    public Docket createTestApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("中数通相亲平台项目接口文档")
                .description("CDC相亲V1.0 项目的接口文档，符合RESTful API.")
                .version("1.0")
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cdc.blinddate.interfaces"))
                .paths(PathSelectors.any())
                .build();
    }
}
