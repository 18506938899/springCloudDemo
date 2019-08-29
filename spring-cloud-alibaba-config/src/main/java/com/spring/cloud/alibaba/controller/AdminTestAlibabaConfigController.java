package com.spring.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-08-29
 */
@RefreshScope
@RestController
public class AdminTestAlibabaConfigController {

    @Value("${username}")
    private String username;

    @RequestMapping(value = "/testAlibabaConfig.shtml")
    public String testAlibabaConfig() {
        return username;
    }
}
