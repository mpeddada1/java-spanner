// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/keys.proto

package com.google.spanner.v1;

public final class KeysProto {
  private KeysProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_KeyRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_KeyRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_KeySet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_KeySet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034google/spanner/v1/keys.proto\022\021google.s" +
      "panner.v1\032\034google/api/annotations.proto\032" +
      "\034google/protobuf/struct.proto\"\364\001\n\010KeyRan" +
      "ge\0222\n\014start_closed\030\001 \001(\0132\032.google.protob" +
      "uf.ListValueH\000\0220\n\nstart_open\030\002 \001(\0132\032.goo" +
      "gle.protobuf.ListValueH\000\0220\n\nend_closed\030\003" +
      " \001(\0132\032.google.protobuf.ListValueH\001\022.\n\010en" +
      "d_open\030\004 \001(\0132\032.google.protobuf.ListValue" +
      "H\001B\020\n\016start_key_typeB\016\n\014end_key_type\"l\n\006" +
      "KeySet\022(\n\004keys\030\001 \003(\0132\032.google.protobuf.L" +
      "istValue\022+\n\006ranges\030\002 \003(\0132\033.google.spanne" +
      "r.v1.KeyRange\022\013\n\003all\030\003 \001(\010B\257\001\n\025com.googl" +
      "e.spanner.v1B\tKeysProtoP\001Z8google.golang" +
      ".org/genproto/googleapis/spanner/v1;span" +
      "ner\252\002\027Google.Cloud.Spanner.V1\312\002\027Google\\C" +
      "loud\\Spanner\\V1\352\002\032Google::Cloud::Spanner" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_spanner_v1_KeyRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_KeyRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_KeyRange_descriptor,
        new java.lang.String[] { "StartClosed", "StartOpen", "EndClosed", "EndOpen", "StartKeyType", "EndKeyType", });
    internal_static_google_spanner_v1_KeySet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_KeySet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_KeySet_descriptor,
        new java.lang.String[] { "Keys", "Ranges", "All", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
