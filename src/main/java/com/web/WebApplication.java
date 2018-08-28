package com.web;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.web.dao")
public class WebApplication {


    public static void main(String[] args) {
        System.out.println("Web Service Starting");
        SpringApplication.run(WebApplication.class, args);
        System.out.println("Web Service Starting end");


    }
}
