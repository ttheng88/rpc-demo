package com.demo.dubbo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liangsy
 * @desc 传感器消息DTO
 * @date 2021/5/7
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorMessageDto implements Serializable {

    //    private String sn;
    private int device_id;
    private String sensor;
    private String createTime;
    private String collectTime;
    private int msgType;
    private int nsat;
    /**
     * 测项字段
     */
    private Object item;

}