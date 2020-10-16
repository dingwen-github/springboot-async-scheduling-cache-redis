package com.dw.sascr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync//只能注释在SpringBoot启动类或者@Configuration标注的配置类上表示开启SpringBoot异步
@SpringBootApplication
public class SpringbootAsyncSchedulingCacheRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAsyncSchedulingCacheRedisApplication.class, args);
    }

}
