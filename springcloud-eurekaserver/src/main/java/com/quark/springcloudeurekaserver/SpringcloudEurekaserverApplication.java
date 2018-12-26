package com.quark.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer/*标注此服务为eureka服务注册中心*/
public class SpringcloudEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaserverApplication.class, args);
    }

}

