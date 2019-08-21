package com.spring.cloud.service.impl;

import com.spring.cloud.service.TestFeignService;
import org.springframework.stereotype.Service;

/**
 * @author shaokai.zhang
 * @date 2019/8/7
 */
@Service
public class TestFeignServiceImpl implements TestFeignService{

    @Override
    public String testFeign() {
        return "testFeign is fail";
    }
}
