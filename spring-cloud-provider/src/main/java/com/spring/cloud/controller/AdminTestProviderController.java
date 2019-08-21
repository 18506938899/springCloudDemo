package com.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author shaokai
 * @date 2019/8/6
 */

@Slf4j
@RestController
public class AdminTestProviderController {

    @Value("${server.port}")
    private String port;

    /**
     * 测试方法
     *
     * @return java.lang.String
     * @author shaokai.zhang
     * @date 2019/8/6 16:42
     */
    @RequestMapping(value = "/testProvider.shtml")
    public String test() {
        log.error("test3");
        return "端口:" + port;
    }
}
