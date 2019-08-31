package com.spring.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-08-29
 */
@RestController
public class AdminTestAlibabaProviderController {

    @RequestMapping(value = "/testAlibabaProvider.shtml")
    public String testAlibabaProvider(){
        System.out.println("testAlibabaProvider");
        return "testAlibabaProvider";
    }
}
