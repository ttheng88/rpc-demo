// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Gnss.proto

package com.demo.grpc.gnss;

/**
 * Protobuf type {@code SpatialCoordDtoGrpc}
 */
public final class SpatialCoordDtoGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SpatialCoordDtoGrpc)
    SpatialCoordDtoGrpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpatialCoordDtoGrpc.newBuilder() to construct.
  private SpatialCoordDtoGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpatialCoordDtoGrpc() {
    referenceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpatialCoordDtoGrpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpatialCoordDtoGrpc(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            spatialX_ = input.readDouble();
            break;
          }
          case 17: {

            spatialY_ = input.readDouble();
            break;
          }
          case 25: {

            spatialZ_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            referenceType_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.demo.grpc.gnss.GnssProto.internal_static_SpatialCoordDtoGrpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.demo.grpc.gnss.GnssProto.internal_static_SpatialCoordDtoGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.demo.grpc.gnss.SpatialCoordDtoGrpc.class, com.demo.grpc.gnss.SpatialCoordDtoGrpc.Builder.class);
  }

  public static final int SPATIAL_X_FIELD_NUMBER = 1;
  private double spatialX_;
  /**
   * <pre>
   **
   * 笛卡尔空间坐标X
   * </pre>
   *
   * <code>double spatial_x = 1;</code>
   * @return The spatialX.
   */
  @java.lang.Override
  public double getSpatialX() {
    return spatialX_;
  }

  public static final int SPATIAL_Y_FIELD_NUMBER = 2;
  private double spatialY_;
  /**
   * <code>double spatial_y = 2;</code>
   * @return The spatialY.
   */
  @java.lang.Override
  public double getSpatialY() {
    return spatialY_;
  }

  public static final int SPATIAL_Z_FIELD_NUMBER = 3;
  private double spatialZ_;
  /**
   * <pre>
   **
   * 笛卡尔空间坐标Z
   * </pre>
   *
   * <code>double spatial_z = 3;</code>
   * @return The spatialZ.
   */
  @java.lang.Override
  public double getSpatialZ() {
    return spatialZ_;
  }

  public static final int REFERENCE_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object referenceType_;
  /**
   * <pre>
   **
   * 空间参考系类型
   * </pre>
   *
   * <code>string reference_type = 4;</code>
   * @return The referenceType.
   */
  @java.lang.Override
  public java.lang.String getReferenceType() {
    java.lang.Object ref = referenceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   **
   * 空间参考系类型
   * </pre>
   *
   * <code>string reference_type = 4;</code>
   * @return The bytes for referenceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferenceTypeBytes() {
    java.lang.Object ref = referenceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (spatialX_ != 0D) {
      output.writeDouble(1, spatialX_);
    }
    if (spatialY_ != 0D) {
      output.writeDouble(2, spatialY_);
    }
    if (spatialZ_ != 0D) {
      output.writeDouble(3, spatialZ_);
    }
    if (!getReferenceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, referenceType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spatialX_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, spatialX_);
    }
    if (spatialY_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, spatialY_);
    }
    if (spatialZ_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, spatialZ_);
    }
    if (!getReferenceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, referenceType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.demo.grpc.gnss.SpatialCoordDtoGrpc)) {
      return super.equals(obj);
    }
    com.demo.grpc.gnss.SpatialCoordDtoGrpc other = (com.demo.grpc.gnss.SpatialCoordDtoGrpc) obj;

    if (java.lang.Double.doubleToLongBits(getSpatialX())
        != java.lang.Double.doubleToLongBits(
            other.getSpatialX())) return false;
    if (java.lang.Double.doubleToLongBits(getSpatialY())
        != java.lang.Double.doubleToLongBits(
            other.getSpatialY())) return false;
    if (java.lang.Double.doubleToLongBits(getSpatialZ())
        != java.lang.Double.doubleToLongBits(
            other.getSpatialZ())) return false;
    if (!getReferenceType()
        .equals(other.getReferenceType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SPATIAL_X_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSpatialX()));
    hash = (37 * hash) + SPATIAL_Y_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSpatialY()));
    hash = (37 * hash) + SPATIAL_Z_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSpatialZ()));
    hash = (37 * hash) + REFERENCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.demo.grpc.gnss.SpatialCoordDtoGrpc prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SpatialCoordDtoGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpatialCoordDtoGrpc)
      com.demo.grpc.gnss.SpatialCoordDtoGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.demo.grpc.gnss.GnssProto.internal_static_SpatialCoordDtoGrpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.demo.grpc.gnss.GnssProto.internal_static_SpatialCoordDtoGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.demo.grpc.gnss.SpatialCoordDtoGrpc.class, com.demo.grpc.gnss.SpatialCoordDtoGrpc.Builder.class);
    }

    // Construct using com.demo.grpc.gnss.SpatialCoordDtoGrpc.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      spatialX_ = 0D;

      spatialY_ = 0D;

      spatialZ_ = 0D;

      referenceType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.demo.grpc.gnss.GnssProto.internal_static_SpatialCoordDtoGrpc_descriptor;
    }

    @java.lang.Override
    public com.demo.grpc.gnss.SpatialCoordDtoGrpc getDefaultInstanceForType() {
      return com.demo.grpc.gnss.SpatialCoordDtoGrpc.getDefaultInstance();
    }

    @java.lang.Override
    public com.demo.grpc.gnss.SpatialCoordDtoGrpc build() {
      com.demo.grpc.gnss.SpatialCoordDtoGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.demo.grpc.gnss.SpatialCoordDtoGrpc buildPartial() {
      com.demo.grpc.gnss.SpatialCoordDtoGrpc result = new com.demo.grpc.gnss.SpatialCoordDtoGrpc(this);
      result.spatialX_ = spatialX_;
      result.spatialY_ = spatialY_;
      result.spatialZ_ = spatialZ_;
      result.referenceType_ = referenceType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.demo.grpc.gnss.SpatialCoordDtoGrpc) {
        return mergeFrom((com.demo.grpc.gnss.SpatialCoordDtoGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.demo.grpc.gnss.SpatialCoordDtoGrpc other) {
      if (other == com.demo.grpc.gnss.SpatialCoordDtoGrpc.getDefaultInstance()) return this;
      if (other.getSpatialX() != 0D) {
        setSpatialX(other.getSpatialX());
      }
      if (other.getSpatialY() != 0D) {
        setSpatialY(other.getSpatialY());
      }
      if (other.getSpatialZ() != 0D) {
        setSpatialZ(other.getSpatialZ());
      }
      if (!other.getReferenceType().isEmpty()) {
        referenceType_ = other.referenceType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.demo.grpc.gnss.SpatialCoordDtoGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.demo.grpc.gnss.SpatialCoordDtoGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double spatialX_ ;
    /**
     * <pre>
     **
     * 笛卡尔空间坐标X
     * </pre>
     *
     * <code>double spatial_x = 1;</code>
     * @return The spatialX.
     */
    @java.lang.Override
    public double getSpatialX() {
      return spatialX_;
    }
    /**
     * <pre>
     **
     * 笛卡尔空间坐标X
     * </pre>
     *
     * <code>double spatial_x = 1;</code>
     * @param value The spatialX to set.
     * @return This builder for chaining.
     */
    public Builder setSpatialX(double value) {
      
      spatialX_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * 笛卡尔空间坐标X
     * </pre>
     *
     * <code>double spatial_x = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpatialX() {
      
      spatialX_ = 0D;
      onChanged();
      return this;
    }

    private double spatialY_ ;
    /**
     * <code>double spatial_y = 2;</code>
     * @return The spatialY.
     */
    @java.lang.Override
    public double getSpatialY() {
      return spatialY_;
    }
    /**
     * <code>double spatial_y = 2;</code>
     * @param value The spatialY to set.
     * @return This builder for chaining.
     */
    public Builder setSpatialY(double value) {
      
      spatialY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double spatial_y = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpatialY() {
      
      spatialY_ = 0D;
      onChanged();
      return this;
    }

    private double spatialZ_ ;
    /**
     * <pre>
     **
     * 笛卡尔空间坐标Z
     * </pre>
     *
     * <code>double spatial_z = 3;</code>
     * @return The spatialZ.
     */
    @java.lang.Override
    public double getSpatialZ() {
      return spatialZ_;
    }
    /**
     * <pre>
     **
     * 笛卡尔空间坐标Z
     * </pre>
     *
     * <code>double spatial_z = 3;</code>
     * @param value The spatialZ to set.
     * @return This builder for chaining.
     */
    public Builder setSpatialZ(double value) {
      
      spatialZ_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * 笛卡尔空间坐标Z
     * </pre>
     *
     * <code>double spatial_z = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpatialZ() {
      
      spatialZ_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object referenceType_ = "";
    /**
     * <pre>
     **
     * 空间参考系类型
     * </pre>
     *
     * <code>string reference_type = 4;</code>
     * @return The referenceType.
     */
    public java.lang.String getReferenceType() {
      java.lang.Object ref = referenceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     **
     * 空间参考系类型
     * </pre>
     *
     * <code>string reference_type = 4;</code>
     * @return The bytes for referenceType.
     */
    public com.google.protobuf.ByteString
        getReferenceTypeBytes() {
      java.lang.Object ref = referenceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     **
     * 空间参考系类型
     * </pre>
     *
     * <code>string reference_type = 4;</code>
     * @param value The referenceType to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * 空间参考系类型
     * </pre>
     *
     * <code>string reference_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferenceType() {
      
      referenceType_ = getDefaultInstance().getReferenceType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     * 空间参考系类型
     * </pre>
     *
     * <code>string reference_type = 4;</code>
     * @param value The bytes for referenceType to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referenceType_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SpatialCoordDtoGrpc)
  }

  // @@protoc_insertion_point(class_scope:SpatialCoordDtoGrpc)
  private static final com.demo.grpc.gnss.SpatialCoordDtoGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.demo.grpc.gnss.SpatialCoordDtoGrpc();
  }

  public static com.demo.grpc.gnss.SpatialCoordDtoGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpatialCoordDtoGrpc>
      PARSER = new com.google.protobuf.AbstractParser<SpatialCoordDtoGrpc>() {
    @java.lang.Override
    public SpatialCoordDtoGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpatialCoordDtoGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpatialCoordDtoGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpatialCoordDtoGrpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.demo.grpc.gnss.SpatialCoordDtoGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
