// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Gnss.proto

package com.demo.grpc.gnss;

public interface GeodeticCoordHDtoGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GeodeticCoordHDtoGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * 大地经度
   * </pre>
   *
   * <code>double lon = 1;</code>
   * @return The lon.
   */
  double getLon();

  /**
   * <pre>
   **
   * 大地纬度
   * </pre>
   *
   * <code>double lat = 2;</code>
   * @return The lat.
   */
  double getLat();

  /**
   * <pre>
   **
   * 空间参考系类型
   * </pre>
   *
   * <code>string reference_type = 3;</code>
   * @return The referenceType.
   */
  java.lang.String getReferenceType();
  /**
   * <pre>
   **
   * 空间参考系类型
   * </pre>
   *
   * <code>string reference_type = 3;</code>
   * @return The bytes for referenceType.
   */
  com.google.protobuf.ByteString
      getReferenceTypeBytes();

  /**
   * <pre>
   **
   * 大地高
   * </pre>
   *
   * <code>double h = 4;</code>
   * @return The h.
   */
  double getH();
}
