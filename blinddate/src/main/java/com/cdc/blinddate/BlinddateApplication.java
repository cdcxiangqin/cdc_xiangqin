package com.cdc.blinddate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.cdc.blinddate.mapper"})
@ServletComponentScan//通过注解方式配置过滤器
//@ComponentScan("com.cdc.blinddate.service,com.cdc.blinddate.controller")//有boot的就不用了
public class BlinddateApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlinddateApplication.class, args);
    }
}
