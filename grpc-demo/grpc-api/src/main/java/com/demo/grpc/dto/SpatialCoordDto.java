package com.demo.grpc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author liangsy
 * @desc 空间坐标DTO
 * @date 2021/7/8
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpatialCoordDto{



    /**
     * 笛卡尔空间坐标X
     */
    private Double spatialX;
    /**
     * 笛卡尔空间坐标Y
     */
    private Double spatialY;
    /**
     * 笛卡尔空间坐标Z
     */
    private Double spatialZ;
    /**
     * 空间参考系类型
     */
    private String referenceType = "CGCS2000";

}
