package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author yhj
 * @classDesc 功能描述: gateway跨域处理
 * @date 2020/7/16 20:22
 * @copyright 众阳健康
 */

@Configuration
public class GmallCrosConfig {


    @Bean
    public CorsWebFilter corsWebFilter() {

        //cors 配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //1. 允许跨域白名单
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        //2. 允许携带cookie
        corsConfiguration.setAllowCredentials(true);
        //3. 允许所有方法
        corsConfiguration.addAllowedMethod("*");
        //4. 允许所有头信息
        corsConfiguration.addAllowedHeader("*");

        //cors 配置源对象
        UrlBasedCorsConfigurationSource url = new UrlBasedCorsConfigurationSource();
        // /**拦截所有请求
        url.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsWebFilter(url);
    }
}
