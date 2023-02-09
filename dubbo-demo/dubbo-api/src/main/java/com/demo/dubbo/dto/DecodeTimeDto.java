package com.demo.dubbo.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author liangsy
 * @desc gnss数据解析时间
 * @date 2022/10/17
 */
@Data
@Builder
public class DecodeTimeDto implements Serializable {

    /**
     * 第一次创建的时间
     */
    private LocalDateTime initTime;
    /**
     * 过期时间
     */
    private LocalDateTime expiredTime;
}
