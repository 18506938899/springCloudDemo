package com.spring.cloud.alibaba.service.impl;

import com.spring.cloud.alibaba.service.TestAlibabaConsumerService;
import org.springframework.stereotype.Service;

/**
 * @author shaokai.zhang
 * @date 2019-08-29
 */
@Service
public class TestAlibabaConsumerServiceImpl implements TestAlibabaConsumerService {

    @Override
    public String testAlibabaConsumerByFeign() {
        return "testAlibabaProvider is fail";
    }
}
