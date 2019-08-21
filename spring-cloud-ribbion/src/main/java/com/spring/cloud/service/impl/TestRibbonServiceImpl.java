package com.spring.cloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.cloud.service.TestRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author shaokai.zhang
 * @date 2019/8/7
 */
@Service
public class TestRibbonServiceImpl implements TestRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "testRibbonError")
    public String testRibbon() {
        return restTemplate.getForObject("http://spring-cloud-provider/springCloudProvider/testProvider.shtml", String.class);
    }

    public String testRibbonError() {
        return "testRibbon is fail";
    }
}
