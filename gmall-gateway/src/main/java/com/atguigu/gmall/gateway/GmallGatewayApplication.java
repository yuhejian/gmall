package com.atguigu.gmall.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class GmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallGatewayApplication.class, args);
        log.info("网关服务启动成功");
    }

}
