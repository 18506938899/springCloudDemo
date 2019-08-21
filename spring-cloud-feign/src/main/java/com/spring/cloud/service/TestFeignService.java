package com.spring.cloud.service;

import com.spring.cloud.service.impl.TestFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shaokai.zhang
 * @date 2019/8/7
 */
@FeignClient(value = "spring-cloud-provider", fallback = TestFeignServiceImpl.class)
public interface TestFeignService {

    /**
     * 通过feign调用spring-cloud-provider的方法
     *
     * @return java.lang.String
     * @author shaokai.zhang
     * @date 2019/8/7 14:01
     */
    @GetMapping(value = "/springCloudProvider/testProvider.shtml")
    String testFeign();
}
