package com.ljl.demo.springcloud.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class Demo1ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo1ConsumerApplication.class, args);
    }
}
