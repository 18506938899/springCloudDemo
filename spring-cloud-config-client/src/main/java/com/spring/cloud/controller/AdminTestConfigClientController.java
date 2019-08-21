package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-08-21
 */
@RefreshScope
@RestController
public class AdminTestConfigClientController {

    @Value("${foo}")
    private String foo;


    @RequestMapping(value = "testConfigClient.shtml")
    public String testConfigClient(){
        return foo;
    }
}
