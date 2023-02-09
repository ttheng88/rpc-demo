package com.demo.dubbo.service;

import com.demo.dubbo.dto.DecodeTimeDto;
import com.demo.dubbo.dto.SensorMessageDto;
import com.demo.dubbo.api.TestDubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author liangsy
 * @desc
 * @date 2023/1/31
 */
@DubboService
@Slf4j
public class TestDubboServiceImpl implements TestDubboService {
    @Override
    public DecodeTimeDto test(SensorMessageDto sensorMessageDto) {
        log.info("dubbo:::"+sensorMessageDto);
        return DecodeTimeDto.builder().initTime(LocalDateTime.now()).build();
    }
}