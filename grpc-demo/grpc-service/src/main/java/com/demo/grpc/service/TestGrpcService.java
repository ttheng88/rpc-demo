package com.demo.grpc.service;

import com.demo.grpc.dto.GeodeticCoordHDto;
import com.demo.grpc.dto.SpatialCoordDto;
import com.demo.grpc.gnss.GeodeticCoordHDtoGrpc;
import com.demo.grpc.gnss.GnssServiceGrpc;
import com.demo.grpc.gnss.SpatialCoordDtoGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liangsy
 * @desc
 * @date 2023/1/11
 */
@Component
@GrpcService
@Slf4j
public class TestGrpcService extends GnssServiceGrpc.GnssServiceImplBase {


    @Resource
    private BizService bizService;

    @Override
    public void geo2cart(GeodeticCoordHDtoGrpc request, StreamObserver<SpatialCoordDtoGrpc> responseObserver) {
        GeodeticCoordHDto geodeticCoordHDto = new GeodeticCoordHDto();
        BeanUtils.copyProperties(request, geodeticCoordHDto);
        log.info("grpc geo2cart request:{}",geodeticCoordHDto);

        SpatialCoordDto spatialCoordDto = bizService.geo2cart(geodeticCoordHDto);

//        BeanUtils.copyProperties(spatialCoordDto,spatialCoordDtoGrpc);
        SpatialCoordDtoGrpc spatialCoordDtoGrpc = SpatialCoordDtoGrpc.newBuilder()
                .setSpatialX(spatialCoordDto.getSpatialX())
                .setSpatialY(spatialCoordDto.getSpatialY())
                .setSpatialZ(spatialCoordDto.getSpatialZ())
                .setReferenceType(spatialCoordDto.getReferenceType())
                .build();

        log.info("grpc geo2cart response:{}", spatialCoordDtoGrpc);

        //返回的内容
        responseObserver.onNext(spatialCoordDtoGrpc);
        //完成处理
        responseObserver.onCompleted();
    }


}
