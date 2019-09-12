package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixDashboardApplication.class, args);
    }

}
