package com.quark.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient/*指定微服务为eureka注册管理的微服务*/
@RestController
public class SpringcloudEurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "hello world from port " + port;
    }
}

