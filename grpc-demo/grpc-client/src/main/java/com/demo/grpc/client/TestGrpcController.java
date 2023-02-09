package com.demo.grpc.client;

import com.alibaba.fastjson.JSON;
import com.demo.grpc.dto.DatumDto;
import com.demo.grpc.dto.SpatialCoordDto;
import com.demo.grpc.gnss.GeodeticCoordHDtoGrpc;
import com.demo.grpc.gnss.GnssServiceGrpc;
import com.demo.grpc.gnss.SpatialCoordDtoGrpc;
import com.demo.grpc.manager.ManagerServiceGrpc;
import com.demo.grpc.manager.UseDatumDtoGrpc;
import com.google.protobuf.Empty;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author liangsy
 * @desc
 * @date 2023/1/11
 */
@RestController
@RequestMapping("/grpc")
@Slf4j
public class TestGrpcController {

    @GrpcClient("manager-service")
    private ManagerServiceGrpc.ManagerServiceBlockingStub managerService;

    @GetMapping(value = "/manager")
    public ResponseEntity<Object> manager(
            @RequestBody DatumDto datumDto) {

        String datumDtoStr = JSON.toJSONString(datumDto);
        UseDatumDtoGrpc useDatumDtoGrpc = UseDatumDtoGrpc.newBuilder().setId(datumDto.getId()).setDatumDto(datumDtoStr).build();

        Empty empty = managerService.useDatum(useDatumDtoGrpc);

        return new ResponseEntity("success",HttpStatus.OK);
    }



    @GrpcClient("gnss-service")
    private GnssServiceGrpc.GnssServiceBlockingStub gnssService;

    @GetMapping(value = "/gnss")
    public ResponseEntity<Object> gnss(
            @RequestParam(value = "lon") double lon,
            @RequestParam(value = "lat") double lat,
            @RequestParam(value = "h") double h,
            @RequestParam(value = "referenceType") String referenceType) {

        GeodeticCoordHDtoGrpc geodeticCoordHDtoGrpc = GeodeticCoordHDtoGrpc.newBuilder()
                .setLat(lat).setLon(lon).setH(h)
                .setReferenceType(referenceType)
                .build();

        SpatialCoordDtoGrpc spatialCoordDtoGrpc = gnssService.geo2cart(geodeticCoordHDtoGrpc);

        log.info("spatialCoordDtoGrpc:{}",spatialCoordDtoGrpc.toString());
        SpatialCoordDto spatialCoordDto = new SpatialCoordDto();
        BeanUtils.copyProperties(spatialCoordDtoGrpc,spatialCoordDto);

        return new ResponseEntity(spatialCoordDto,HttpStatus.OK);
    }
}
