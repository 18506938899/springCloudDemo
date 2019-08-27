package com.spring.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-08-26
 */
@RestController
public class AdminTestGatwayController {

    @RequestMapping(value = "/fallback")
    public String fallback() {
        return "fallback";
    }
}
