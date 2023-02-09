package com.demo.dubbo.controller;

import com.demo.dubbo.dto.DecodeTimeDto;
import com.demo.dubbo.dto.SensorMessageDto;
import com.demo.dubbo.api.TestDubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangsy
 * @desc
 * @date 2023/1/31
 */
@RestController
@RequestMapping("/dubbo")
@Slf4j
public class TestController {

    @DubboReference
    private TestDubboService testDubboService;


    @RequestMapping(value = "/test")
    public DecodeTimeDto test() {
        SensorMessageDto sensorMessageDto = SensorMessageDto.builder().sensor("hello").device_id(123).item("nihao").build();
        DecodeTimeDto decodeTimeDto = testDubboService.test(sensorMessageDto);
        log.info("response::"+decodeTimeDto);
        return decodeTimeDto;
    }
}
