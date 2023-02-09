package com.demo.grpc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: liangsy
 * @Desc:
 * @Date: 2021/09/10/15:43
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DatumDto {

    private Integer id;

    private String planeX;

    private String planeY;

    private String planeZ;

    /**
     * 坐标类型默认为平面坐标
     */
    private Integer coordinateType = 2;
}
