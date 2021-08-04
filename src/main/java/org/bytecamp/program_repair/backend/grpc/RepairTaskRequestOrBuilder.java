// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.bytecamp.program_repair.backend.grpc;

public interface RepairTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RepairTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RepairTaskRequest.LocationType location_type = 1;</code>
   * @return The enum numeric value on the wire for locationType.
   */
  int getLocationTypeValue();
  /**
   * <code>.RepairTaskRequest.LocationType location_type = 1;</code>
   * @return The locationType.
   */
  RepairTaskRequest.LocationType getLocationType();

  /**
   * <code>string location = 2;</code>
   * @return The location.
   */
  String getLocation();
  /**
   * <code>string location = 2;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string project = 3;</code>
   * @return The project.
   */
  String getProject();
  /**
   * <code>string project = 3;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <code>string algorithm = 4;</code>
   * @return The algorithm.
   */
  String getAlgorithm();
  /**
   * <code>string algorithm = 4;</code>
   * @return The bytes for algorithm.
   */
  com.google.protobuf.ByteString
      getAlgorithmBytes();
}
