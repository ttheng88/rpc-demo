package com.demo.grpc.service;

import com.alibaba.fastjson.JSON;
import com.demo.grpc.dto.DatumDto;
import com.demo.grpc.manager.ManagerServiceGrpc;
import com.demo.grpc.manager.UseDatumDtoGrpc;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liangsy
 * @desc
 * @date 2023/1/12
 */
@Component
@GrpcService
@Slf4j
public class TestGrpcService2 extends ManagerServiceGrpc.ManagerServiceImplBase {

    @Resource
    private BizService bizService;

    @Override
    public void useDatum(UseDatumDtoGrpc request, StreamObserver<Empty> responseObserver) {
        int id = request.getId();
        String datumDtoStr = request.getDatumDto();
        log.info("request:{}",request);

        DatumDto datumDto = JSON.parseObject(datumDtoStr, DatumDto.class);
        datumDto.setId(id);

        try {
            bizService.useDatum(datumDto);
        } catch (Exception e) {
            log.error("useDatum error:{}",e.getMessage(),e);
        }


        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
