package com.spring.cloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.spring.cloud.alibaba.service.TestAlibabaSentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaokai.zhang
 * @date 2019-08-29
 */
@RestController
public class AdminTestAlibabaSentinelController {

    @Autowired
    private TestAlibabaSentinelService testAlibabaSentinelService;

    @RequestMapping(value = "testAlibabaSentinel.shtml")
    @SentinelResource(value = "testAlibabaSentinel")
    public String testAlibabaSentinel() {
        try {
            Thread.sleep(1000);
            return "testAlibabaSentinel";
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "testAlibabaSentinelByFeign.shtml")
    @SentinelResource(value = "testAlibabaSentinelByFeign")
    public String testAlibabaSentinelByFeign() {
        return testAlibabaSentinelService.testAlibabaSentinelByFeign();
    }
}
