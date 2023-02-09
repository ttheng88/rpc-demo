// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Manager.proto

package com.demo.grpc.manager;

/**
 * Protobuf type {@code UseDatumDtoGrpc}
 */
public final class UseDatumDtoGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UseDatumDtoGrpc)
    UseDatumDtoGrpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseDatumDtoGrpc.newBuilder() to construct.
  private UseDatumDtoGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseDatumDtoGrpc() {
    datumDto_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseDatumDtoGrpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseDatumDtoGrpc(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            datumDto_ = s;
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
    return com.demo.grpc.manager.ManagerProto.internal_static_UseDatumDtoGrpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.demo.grpc.manager.ManagerProto.internal_static_UseDatumDtoGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.demo.grpc.manager.UseDatumDtoGrpc.class, com.demo.grpc.manager.UseDatumDtoGrpc.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int DATUM_DTO_FIELD_NUMBER = 2;
  private volatile java.lang.Object datumDto_;
  /**
   * <code>string datum_dto = 2;</code>
   * @return The datumDto.
   */
  @java.lang.Override
  public java.lang.String getDatumDto() {
    java.lang.Object ref = datumDto_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datumDto_ = s;
      return s;
    }
  }
  /**
   * <code>string datum_dto = 2;</code>
   * @return The bytes for datumDto.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatumDtoBytes() {
    java.lang.Object ref = datumDto_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datumDto_ = b;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getDatumDtoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, datumDto_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getDatumDtoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, datumDto_);
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
    if (!(obj instanceof com.demo.grpc.manager.UseDatumDtoGrpc)) {
      return super.equals(obj);
    }
    com.demo.grpc.manager.UseDatumDtoGrpc other = (com.demo.grpc.manager.UseDatumDtoGrpc) obj;

    if (getId()
        != other.getId()) return false;
    if (!getDatumDto()
        .equals(other.getDatumDto())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + DATUM_DTO_FIELD_NUMBER;
    hash = (53 * hash) + getDatumDto().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.demo.grpc.manager.UseDatumDtoGrpc parseFrom(
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
  public static Builder newBuilder(com.demo.grpc.manager.UseDatumDtoGrpc prototype) {
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
   * Protobuf type {@code UseDatumDtoGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UseDatumDtoGrpc)
      com.demo.grpc.manager.UseDatumDtoGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.demo.grpc.manager.ManagerProto.internal_static_UseDatumDtoGrpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.demo.grpc.manager.ManagerProto.internal_static_UseDatumDtoGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.demo.grpc.manager.UseDatumDtoGrpc.class, com.demo.grpc.manager.UseDatumDtoGrpc.Builder.class);
    }

    // Construct using com.demo.grpc.manager.UseDatumDtoGrpc.newBuilder()
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
      id_ = 0;

      datumDto_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.demo.grpc.manager.ManagerProto.internal_static_UseDatumDtoGrpc_descriptor;
    }

    @java.lang.Override
    public com.demo.grpc.manager.UseDatumDtoGrpc getDefaultInstanceForType() {
      return com.demo.grpc.manager.UseDatumDtoGrpc.getDefaultInstance();
    }

    @java.lang.Override
    public com.demo.grpc.manager.UseDatumDtoGrpc build() {
      com.demo.grpc.manager.UseDatumDtoGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.demo.grpc.manager.UseDatumDtoGrpc buildPartial() {
      com.demo.grpc.manager.UseDatumDtoGrpc result = new com.demo.grpc.manager.UseDatumDtoGrpc(this);
      result.id_ = id_;
      result.datumDto_ = datumDto_;
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
      if (other instanceof com.demo.grpc.manager.UseDatumDtoGrpc) {
        return mergeFrom((com.demo.grpc.manager.UseDatumDtoGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.demo.grpc.manager.UseDatumDtoGrpc other) {
      if (other == com.demo.grpc.manager.UseDatumDtoGrpc.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getDatumDto().isEmpty()) {
        datumDto_ = other.datumDto_;
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
      com.demo.grpc.manager.UseDatumDtoGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.demo.grpc.manager.UseDatumDtoGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object datumDto_ = "";
    /**
     * <code>string datum_dto = 2;</code>
     * @return The datumDto.
     */
    public java.lang.String getDatumDto() {
      java.lang.Object ref = datumDto_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datumDto_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string datum_dto = 2;</code>
     * @return The bytes for datumDto.
     */
    public com.google.protobuf.ByteString
        getDatumDtoBytes() {
      java.lang.Object ref = datumDto_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datumDto_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string datum_dto = 2;</code>
     * @param value The datumDto to set.
     * @return This builder for chaining.
     */
    public Builder setDatumDto(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      datumDto_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string datum_dto = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatumDto() {
      
      datumDto_ = getDefaultInstance().getDatumDto();
      onChanged();
      return this;
    }
    /**
     * <code>string datum_dto = 2;</code>
     * @param value The bytes for datumDto to set.
     * @return This builder for chaining.
     */
    public Builder setDatumDtoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      datumDto_ = value;
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


    // @@protoc_insertion_point(builder_scope:UseDatumDtoGrpc)
  }

  // @@protoc_insertion_point(class_scope:UseDatumDtoGrpc)
  private static final com.demo.grpc.manager.UseDatumDtoGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.demo.grpc.manager.UseDatumDtoGrpc();
  }

  public static com.demo.grpc.manager.UseDatumDtoGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseDatumDtoGrpc>
      PARSER = new com.google.protobuf.AbstractParser<UseDatumDtoGrpc>() {
    @java.lang.Override
    public UseDatumDtoGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseDatumDtoGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseDatumDtoGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseDatumDtoGrpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.demo.grpc.manager.UseDatumDtoGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
