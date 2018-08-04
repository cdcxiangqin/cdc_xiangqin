package com.cdc.blinddate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cdc.blinddate.mapper"})
public class BlinddateApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlinddateApplication.class, args);
    }
}
