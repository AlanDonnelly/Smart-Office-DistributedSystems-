// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package so.service2;

public interface AlarmResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service2.AlarmResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Current alarm state
   * </pre>
   *
   * <code>string currentAlarmState = 1;</code>
   */
  java.lang.String getCurrentAlarmState();
  /**
   * <pre>
   *Current alarm state
   * </pre>
   *
   * <code>string currentAlarmState = 1;</code>
   */
  com.google.protobuf.ByteString
      getCurrentAlarmStateBytes();

  /**
   * <pre>
   *New state of alarm after the operation
   * </pre>
   *
   * <code>string newAlarmState = 2;</code>
   */
  java.lang.String getNewAlarmState();
  /**
   * <pre>
   *New state of alarm after the operation
   * </pre>
   *
   * <code>string newAlarmState = 2;</code>
   */
  com.google.protobuf.ByteString
      getNewAlarmStateBytes();
}