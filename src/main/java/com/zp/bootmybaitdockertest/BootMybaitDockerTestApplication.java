package com.zp.bootmybaitdockertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zp.bootmybaitdockertest.user.mapper")
public class BootMybaitDockerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMybaitDockerTestApplication.class, args);
    }

}
