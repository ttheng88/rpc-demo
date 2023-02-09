package com.demo.grpc.service;

import com.demo.grpc.dto.DatumDto;
import com.demo.grpc.dto.GeodeticCoordHDto;
import com.demo.grpc.dto.SpatialCoordDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liangsy
 * @desc
 * @date 2023/2/9
 */
@Component
@Slf4j
public class BizService {

    public SpatialCoordDto geo2cart(GeodeticCoordHDto geodeticCoordHDto) {
        return SpatialCoordDto.builder().spatialX(6.6)
                .spatialY(7.77)
                .spatialZ(geodeticCoordHDto.getH())
                .referenceType(geodeticCoordHDto.getReferenceType())
                .build();
    }

    public void useDatum(DatumDto datumDto) {
        log.info("datumDto:::{}",datumDto);
    }

}
