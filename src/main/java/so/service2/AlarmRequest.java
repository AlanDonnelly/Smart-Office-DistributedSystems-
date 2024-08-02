// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package so.service2;

/**
 * Protobuf type {@code service2.AlarmRequest}
 */
public  final class AlarmRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2.AlarmRequest)
    AlarmRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmRequest.newBuilder() to construct.
  private AlarmRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmRequest() {
    operationType_ = "";
    alarmNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            operationType_ = s;
            break;
          }
          case 16: {

            alarmNumber_ = input.readInt32();
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
    return so.service2.Service2Impl.internal_static_service2_AlarmRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return so.service2.Service2Impl.internal_static_service2_AlarmRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            so.service2.AlarmRequest.class, so.service2.AlarmRequest.Builder.class);
  }

  public static final int OPERATIONTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object operationType_;
  /**
   * <pre>
   *"startAlarm" or "stopAlarm"
   * </pre>
   *
   * <code>string operationType = 1;</code>
   */
  public java.lang.String getOperationType() {
    java.lang.Object ref = operationType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *"startAlarm" or "stopAlarm"
   * </pre>
   *
   * <code>string operationType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOperationTypeBytes() {
    java.lang.Object ref = operationType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALARMNUMBER_FIELD_NUMBER = 2;
  private int alarmNumber_;
  /**
   * <pre>
   *Alarm number to start or stop
   * </pre>
   *
   * <code>int32 alarmNumber = 2;</code>
   */
  public int getAlarmNumber() {
    return alarmNumber_;
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
    if (!getOperationTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operationType_);
    }
    if (alarmNumber_ != 0) {
      output.writeInt32(2, alarmNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOperationTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operationType_);
    }
    if (alarmNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, alarmNumber_);
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
    if (!(obj instanceof so.service2.AlarmRequest)) {
      return super.equals(obj);
    }
    so.service2.AlarmRequest other = (so.service2.AlarmRequest) obj;

    boolean result = true;
    result = result && getOperationType()
        .equals(other.getOperationType());
    result = result && (getAlarmNumber()
        == other.getAlarmNumber());
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
    hash = (37 * hash) + OPERATIONTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getOperationType().hashCode();
    hash = (37 * hash) + ALARMNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getAlarmNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static so.service2.AlarmRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static so.service2.AlarmRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static so.service2.AlarmRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static so.service2.AlarmRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static so.service2.AlarmRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static so.service2.AlarmRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static so.service2.AlarmRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static so.service2.AlarmRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static so.service2.AlarmRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static so.service2.AlarmRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static so.service2.AlarmRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static so.service2.AlarmRequest parseFrom(
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
  public static Builder newBuilder(so.service2.AlarmRequest prototype) {
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
   * Protobuf type {@code service2.AlarmRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2.AlarmRequest)
      so.service2.AlarmRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return so.service2.Service2Impl.internal_static_service2_AlarmRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return so.service2.Service2Impl.internal_static_service2_AlarmRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              so.service2.AlarmRequest.class, so.service2.AlarmRequest.Builder.class);
    }

    // Construct using so.service2.AlarmRequest.newBuilder()
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
      operationType_ = "";

      alarmNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return so.service2.Service2Impl.internal_static_service2_AlarmRequest_descriptor;
    }

    @java.lang.Override
    public so.service2.AlarmRequest getDefaultInstanceForType() {
      return so.service2.AlarmRequest.getDefaultInstance();
    }

    @java.lang.Override
    public so.service2.AlarmRequest build() {
      so.service2.AlarmRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public so.service2.AlarmRequest buildPartial() {
      so.service2.AlarmRequest result = new so.service2.AlarmRequest(this);
      result.operationType_ = operationType_;
      result.alarmNumber_ = alarmNumber_;
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
      if (other instanceof so.service2.AlarmRequest) {
        return mergeFrom((so.service2.AlarmRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(so.service2.AlarmRequest other) {
      if (other == so.service2.AlarmRequest.getDefaultInstance()) return this;
      if (!other.getOperationType().isEmpty()) {
        operationType_ = other.operationType_;
        onChanged();
      }
      if (other.getAlarmNumber() != 0) {
        setAlarmNumber(other.getAlarmNumber());
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
      so.service2.AlarmRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (so.service2.AlarmRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object operationType_ = "";
    /**
     * <pre>
     *"startAlarm" or "stopAlarm"
     * </pre>
     *
     * <code>string operationType = 1;</code>
     */
    public java.lang.String getOperationType() {
      java.lang.Object ref = operationType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *"startAlarm" or "stopAlarm"
     * </pre>
     *
     * <code>string operationType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOperationTypeBytes() {
      java.lang.Object ref = operationType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *"startAlarm" or "stopAlarm"
     * </pre>
     *
     * <code>string operationType = 1;</code>
     */
    public Builder setOperationType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *"startAlarm" or "stopAlarm"
     * </pre>
     *
     * <code>string operationType = 1;</code>
     */
    public Builder clearOperationType() {
      
      operationType_ = getDefaultInstance().getOperationType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *"startAlarm" or "stopAlarm"
     * </pre>
     *
     * <code>string operationType = 1;</code>
     */
    public Builder setOperationTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationType_ = value;
      onChanged();
      return this;
    }

    private int alarmNumber_ ;
    /**
     * <pre>
     *Alarm number to start or stop
     * </pre>
     *
     * <code>int32 alarmNumber = 2;</code>
     */
    public int getAlarmNumber() {
      return alarmNumber_;
    }
    /**
     * <pre>
     *Alarm number to start or stop
     * </pre>
     *
     * <code>int32 alarmNumber = 2;</code>
     */
    public Builder setAlarmNumber(int value) {
      
      alarmNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Alarm number to start or stop
     * </pre>
     *
     * <code>int32 alarmNumber = 2;</code>
     */
    public Builder clearAlarmNumber() {
      
      alarmNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:service2.AlarmRequest)
  }

  // @@protoc_insertion_point(class_scope:service2.AlarmRequest)
  private static final so.service2.AlarmRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new so.service2.AlarmRequest();
  }

  public static so.service2.AlarmRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmRequest>
      PARSER = new com.google.protobuf.AbstractParser<AlarmRequest>() {
    @java.lang.Override
    public AlarmRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlarmRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlarmRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public so.service2.AlarmRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
