package com.atguigu.gmall.sms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class GmallSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallSmsApplication.class, args);
        log.info("启动完毕");
    }

}
