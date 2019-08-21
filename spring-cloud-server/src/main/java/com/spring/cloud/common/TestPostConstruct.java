package com.spring.cloud.common;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author shaokai.zhang
 * @date 2019/8/12
 */

@Component
public class TestPostConstruct {

    @PostConstruct
    public void postConstructTest() {
        System.out.println("postConstruct");
    }
}
