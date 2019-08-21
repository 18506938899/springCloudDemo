package com.spring.cloud.controller;

import com.spring.cloud.service.TestSleuthServer2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-08-21
 */
@Slf4j
@RestController
public class AdminTestSleuthServer2Controller {

    @Autowired
    private TestSleuthServer2Service testSleuthServer2Service;

    @RequestMapping(value = "/testSleuthServer2.shtml")
    public String testSleuthServer2() {
        return testSleuthServer2Service.testSleuthServer1Info();
    }

    @RequestMapping(value = "/testSleuthServer2Info.shtml")
    public String testSleuthServer2Info() {
        log.info(">>>>>>testSleuthServer2Info<<<<<<");
        return "testSleuthServer2 is success";
    }
}
