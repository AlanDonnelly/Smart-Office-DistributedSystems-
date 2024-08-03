// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package so.service1;

/**
 * Protobuf type {@code service1.TempResponse}
 */
public  final class TempResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service1.TempResponse)
    TempResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TempResponse.newBuilder() to construct.
  private TempResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TempResponse() {
    currentTemp_ = 0F;
    newTempLevel_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TempResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 13: {

            currentTemp_ = input.readFloat();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            newTempLevel_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return so.service1.Service1Impl.internal_static_service1_TempResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return so.service1.Service1Impl.internal_static_service1_TempResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            so.service1.TempResponse.class, so.service1.TempResponse.Builder.class);
  }

  public static final int CURRENTTEMP_FIELD_NUMBER = 1;
  private float currentTemp_;
  /**
   * <pre>
   *Current Office Temp
   * </pre>
   *
   * <code>float currentTemp = 1;</code>
   */
  public float getCurrentTemp() {
    return currentTemp_;
  }

  public static final int NEWTEMPLEVEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object newTempLevel_;
  /**
   * <pre>
   *Confirming the newly set office temperature
   * </pre>
   *
   * <code>string newTempLevel = 2;</code>
   */
  public java.lang.String getNewTempLevel() {
    java.lang.Object ref = newTempLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newTempLevel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *Confirming the newly set office temperature
   * </pre>
   *
   * <code>string newTempLevel = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNewTempLevelBytes() {
    java.lang.Object ref = newTempLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newTempLevel_ = b;
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
    if (currentTemp_ != 0F) {
      output.writeFloat(1, currentTemp_);
    }
    if (!getNewTempLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newTempLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (currentTemp_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, currentTemp_);
    }
    if (!getNewTempLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newTempLevel_);
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
    if (!(obj instanceof so.service1.TempResponse)) {
      return super.equals(obj);
    }
    so.service1.TempResponse other = (so.service1.TempResponse) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getCurrentTemp())
        == java.lang.Float.floatToIntBits(
            other.getCurrentTemp()));
    result = result && getNewTempLevel()
        .equals(other.getNewTempLevel());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CURRENTTEMP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCurrentTemp());
    hash = (37 * hash) + NEWTEMPLEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getNewTempLevel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static so.service1.TempResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static so.service1.TempResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static so.service1.TempResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static so.service1.TempResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static so.service1.TempResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static so.service1.TempResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static so.service1.TempResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static so.service1.TempResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static so.service1.TempResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static so.service1.TempResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static so.service1.TempResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static so.service1.TempResponse parseFrom(
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
  public static Builder newBuilder(so.service1.TempResponse prototype) {
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
   * Protobuf type {@code service1.TempResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service1.TempResponse)
      so.service1.TempResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return so.service1.Service1Impl.internal_static_service1_TempResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return so.service1.Service1Impl.internal_static_service1_TempResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              so.service1.TempResponse.class, so.service1.TempResponse.Builder.class);
    }

    // Construct using so.service1.TempResponse.newBuilder()
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
      currentTemp_ = 0F;

      newTempLevel_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return so.service1.Service1Impl.internal_static_service1_TempResponse_descriptor;
    }

    @java.lang.Override
    public so.service1.TempResponse getDefaultInstanceForType() {
      return so.service1.TempResponse.getDefaultInstance();
    }

    @java.lang.Override
    public so.service1.TempResponse build() {
      so.service1.TempResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public so.service1.TempResponse buildPartial() {
      so.service1.TempResponse result = new so.service1.TempResponse(this);
      result.currentTemp_ = currentTemp_;
      result.newTempLevel_ = newTempLevel_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof so.service1.TempResponse) {
        return mergeFrom((so.service1.TempResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(so.service1.TempResponse other) {
      if (other == so.service1.TempResponse.getDefaultInstance()) return this;
      if (other.getCurrentTemp() != 0F) {
        setCurrentTemp(other.getCurrentTemp());
      }
      if (!other.getNewTempLevel().isEmpty()) {
        newTempLevel_ = other.newTempLevel_;
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
      so.service1.TempResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (so.service1.TempResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float currentTemp_ ;
    /**
     * <pre>
     *Current Office Temp
     * </pre>
     *
     * <code>float currentTemp = 1;</code>
     */
    public float getCurrentTemp() {
      return currentTemp_;
    }
    /**
     * <pre>
     *Current Office Temp
     * </pre>
     *
     * <code>float currentTemp = 1;</code>
     */
    public Builder setCurrentTemp(float value) {
      
      currentTemp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Current Office Temp
     * </pre>
     *
     * <code>float currentTemp = 1;</code>
     */
    public Builder clearCurrentTemp() {
      
      currentTemp_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object newTempLevel_ = "";
    /**
     * <pre>
     *Confirming the newly set office temperature
     * </pre>
     *
     * <code>string newTempLevel = 2;</code>
     */
    public java.lang.String getNewTempLevel() {
      java.lang.Object ref = newTempLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newTempLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *Confirming the newly set office temperature
     * </pre>
     *
     * <code>string newTempLevel = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNewTempLevelBytes() {
      java.lang.Object ref = newTempLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newTempLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *Confirming the newly set office temperature
     * </pre>
     *
     * <code>string newTempLevel = 2;</code>
     */
    public Builder setNewTempLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newTempLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Confirming the newly set office temperature
     * </pre>
     *
     * <code>string newTempLevel = 2;</code>
     */
    public Builder clearNewTempLevel() {
      
      newTempLevel_ = getDefaultInstance().getNewTempLevel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Confirming the newly set office temperature
     * </pre>
     *
     * <code>string newTempLevel = 2;</code>
     */
    public Builder setNewTempLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newTempLevel_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service1.TempResponse)
  }

  // @@protoc_insertion_point(class_scope:service1.TempResponse)
  private static final so.service1.TempResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new so.service1.TempResponse();
  }

  public static so.service1.TempResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TempResponse>
      PARSER = new com.google.protobuf.AbstractParser<TempResponse>() {
    @java.lang.Override
    public TempResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TempResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TempResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TempResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public so.service1.TempResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

