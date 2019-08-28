package com.spring.cloud.controller;

import com.spring.cloud.service.TestFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.LocalizedResourceHelper;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign测试
 *
 * @author shaokai.zhang
 * @date 2019/8/7
 */
@Slf4j
@RestController
public class AdminTestFeignController {

    @Autowired(required = false)
    private TestFeignService testFeignService;

    @GetMapping(value = "/testFeign.shtml")
    public String testFeign() throws Exception {
        log.error(">>>>>>testFeign<<<<<<");
        return testFeignService.testFeign();
    }
}
