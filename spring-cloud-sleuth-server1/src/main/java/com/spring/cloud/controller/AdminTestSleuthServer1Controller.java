package com.spring.cloud.controller;

import com.spring.cloud.service.TestSleuthServer1Service;
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
public class AdminTestSleuthServer1Controller {

    @Autowired
    private TestSleuthServer1Service testSleuthServer1Service;

    @RequestMapping(value = "/testSleuthServer1.shtml")
    public String testSleuthServer1() {
        return testSleuthServer1Service.testSleuthServer2Info();
    }

    @RequestMapping(value = "/testSleuthServer1Info.shtml")
    public String testSleuthServer1Info(){
        log.info(">>>>>>testSleuthServer1Info<<<<<<");
        return "testSleuthServer1 is success";
    }
}
