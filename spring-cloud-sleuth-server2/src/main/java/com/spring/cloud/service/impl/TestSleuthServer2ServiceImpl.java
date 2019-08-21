package com.spring.cloud.service.impl;

import com.spring.cloud.service.TestSleuthServer2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author shaokai.zhang
 * @date 2019-08-21
 */
@Slf4j
@Service
public class TestSleuthServer2ServiceImpl implements TestSleuthServer2Service {

    @Override
    public String testSleuthServer1Info() {
        return "testSleuthServer1Info is fail";
    }
}
