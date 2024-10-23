package com.panpan.thymleaf;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.panpan.thymleaf.mapper"})
public class ThymleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymleafApplication.class, args);
    }

}
