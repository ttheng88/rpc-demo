package com.demo.dubbo.api;

import com.demo.dubbo.dto.DecodeTimeDto;
import com.demo.dubbo.dto.SensorMessageDto;

/**
 * @author liangsy
 * @desc
 * @date 2023/2/7
 */
public interface TestDubboService {

    /**
     * 測試
     * @param sensorMessageDto
     * @return
     */
    DecodeTimeDto test(SensorMessageDto sensorMessageDto);
}
