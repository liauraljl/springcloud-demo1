package com.ljl.demo.springcloud.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@EnableEurekaServer
@SpringBootApplication
public class Demo1EurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(Demo1EurekaServer.class, args);
    }
}
