package com.demo.grpc.dto;

import lombok.Data;


/**
 * @author liangsy
 * @desc 大地坐标DTO
 * @date 2021/7/8
 */
@Data
public class GeodeticCoordHDto {


    /**
     * 大地经度
     */
    private Double lon;
    /**
     * 大地纬度
     */
    private Double lat;

    /**
     * 空间参考系类型
     */
    private String referenceType;
    /**
     * 大地高
     */
    private Double h;


}
