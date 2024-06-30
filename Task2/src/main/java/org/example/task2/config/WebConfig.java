package org.example.task2.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// @Configuration 注解告诉 Spring Boot，这个类是一个配置类，它会被用来配置应用程序上下文
@Configuration
public class WebConfig {
    // 将 RestTemplate Bean 注入到应用程序中
    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        System.out.println("获取RestTemplate bean ing");
        // 生成一个RestTemplate实例
        return builder.build();
    }
}
