package com.spring.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-09-05
 */
@RestController
public class AdminTestHystrixDashboardController {

    @RequestMapping(value = "/testHystrixDashboard.shtml")
    @HystrixCommand(fallbackMethod = "hiError")
    public String testHystrixDashboard() {
        return "testHystrixDashboard is success";
    }

    public String hiError(){
        return "testHystrixDashboard is fail";
    }
}
