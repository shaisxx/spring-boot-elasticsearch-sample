package com.fengwenyi.spring_boot_elasticsearch_sample.controller;

import com.fengwenyi.api_result.model.ResultModel;
import com.fengwenyi.spring_boot_elasticsearch_sample.service.GrabDataService;
import com.fengwenyi.spring_boot_elasticsearch_sample.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Erwin Feng
 * @since 2020/7/4
 */
@RestController
@RequestMapping(value = "/api/phone",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class PhoneController {

    @Autowired
    private GrabDataService grabDataService;

    // 抓取数据接口
    @GetMapping("/grab")
    public Mono<ResultModel<?>> grabData() {
        grabDataService.huawei();
        return Mono.just(ResponseUtils.success());
    }

    // 全局搜索

    // 高级搜索

    // 清除数据
    public void clearData() {

    }

}