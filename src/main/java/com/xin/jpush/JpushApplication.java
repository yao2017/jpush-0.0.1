package com.xin.jpush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class JpushApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JpushApplication.class);
    }

    ;

    public static void main(String[] args) {
        SpringApplication.run(JpushApplication.class, args);
    }

}
