package com.ljl.demo.springcloud.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@EnableEurekaClient
@SpringBootApplication
public class Demo1ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo1ProviderApplication.class, args);
    }
}
