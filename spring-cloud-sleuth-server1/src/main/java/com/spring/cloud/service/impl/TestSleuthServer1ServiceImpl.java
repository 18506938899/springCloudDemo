package com.spring.cloud.service.impl;

import com.spring.cloud.service.TestSleuthServer1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Service
public class TestSleuthServer1ServiceImpl implements TestSleuthServer1Service {

    @Override
    public String testSleuthServer2Info() {
        return "testSleuthServer2Info is fail";
    }
}
