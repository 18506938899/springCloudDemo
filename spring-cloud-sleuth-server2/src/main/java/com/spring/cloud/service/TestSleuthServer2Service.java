package com.spring.cloud.service;

import com.spring.cloud.service.impl.TestSleuthServer2ServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-sleuth-server1", fallback = TestSleuthServer2ServiceImpl.class)
public interface TestSleuthServer2Service {

    @GetMapping(value = "/springCloudSleuthServer1/testSleuthServer1Info.shtml")
    String testSleuthServer1Info();
}
