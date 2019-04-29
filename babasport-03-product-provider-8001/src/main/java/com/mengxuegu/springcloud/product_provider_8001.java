package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.mengxuegu.springcloud.dao")
@SpringBootApplication
public class product_provider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(product_provider_8001.class,args);
    }
}
