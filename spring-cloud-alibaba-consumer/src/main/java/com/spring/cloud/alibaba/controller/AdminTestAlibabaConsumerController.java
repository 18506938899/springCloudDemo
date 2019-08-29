package com.spring.cloud.alibaba.controller;

import com.spring.cloud.alibaba.service.TestAlibabaConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shaokai.zhang
 * @date 2019-08-29
 */
@RestController
public class AdminTestAlibabaConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestAlibabaConsumerService testAlibabaConsumerService;

    @RequestMapping(value = "/testAlibabaConsumer.shtml")
    public String testAlibabaConsumer(){
        String resutl = restTemplate.getForObject("http://spring-cloud-alibaba-provider:8775/springCloudAlibabaProvider/testAlibabaProvider.shtml",String.class);
        return resutl;
    }

    @RequestMapping(value = "/testAlibabaConsumerByFeign.shtml")
    public String testAlibabaConsumerByFeign(){
        String resutl = testAlibabaConsumerService.testAlibabaConsumerByFeign();
        return resutl;
    }
}
