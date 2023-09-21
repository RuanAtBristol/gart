package com.pyfinart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pyfinart.*.mapper")
public class GartApplication {

    public static void main(String[] args) {
        SpringApplication.run(GartApplication.class, args);
    }

}
