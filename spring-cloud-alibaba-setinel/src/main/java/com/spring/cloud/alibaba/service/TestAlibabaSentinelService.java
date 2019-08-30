package com.spring.cloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-alibaba-provider")
public interface TestAlibabaSentinelService {

    /**
     * 测试feign sentinel
     *
     * @author shaokai.zhang
     * @date 2019-08-30 10:25
     * @return java.lang.String
     */
    @GetMapping(value = "/springCloudAlibabaProvider/testAlibabaProvider.shtml")
    String testAlibabaSentinelByFeign();
}
