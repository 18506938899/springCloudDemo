package com.spring.cloud.alibaba.service;

import com.spring.cloud.alibaba.service.impl.TestAlibabaConsumerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-alibaba-provider",fallback = TestAlibabaConsumerServiceImpl.class)
public interface TestAlibabaConsumerService {

    /**
     * 获取spring-cloud-alibaba-provider服务接口信息
     *
     * @author shaokai.zhang
     * @date 2019-08-29 16:30
     * @return java.lang.String
     */
    @GetMapping(value = "/springCloudAlibabaProvider/testAlibabaProvider.shtml")
    String testAlibabaConsumerByFeign();
}
