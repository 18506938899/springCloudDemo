package com.spring.cloud.controller;

import com.netflix.discovery.converters.Auto;
import com.spring.cloud.service.TestRibbonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shaokai.zhang
 * @date 2019/8/7
 */
@Slf4j
@Controller
public class AdminTestRibbonController {

    @Autowired
    private TestRibbonService testRibbonService;

    /**
     * 测试ribbon的负载均衡方法
     *
     * @return java.lang.String
     * @author shaokai.zhang
     * @date 2019/8/7 10:52
     */
    @RequestMapping(value = "/testRibbon.shtml")
    @ResponseBody
    public String testRibbon() {
        log.error(">>>>>>testRibbon<<<<<<");
        return testRibbonService.testRibbon();
    }
}
