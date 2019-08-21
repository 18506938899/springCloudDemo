package com.spring.cloud.service;

import com.spring.cloud.service.impl.TestSleuthServer1ServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-sleuth-server2",fallback = TestSleuthServer1ServiceImpl.class)
public interface TestSleuthServer1Service {

    @GetMapping(value = "/springCloudSleuthServer2/testSleuthServer2Info.shtml")
    String testSleuthServer2Info();
}
