# frozen_string_literal: true
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Subcriber.proto

require 'google/protobuf'


descriptor_data = "\n\x0fSubcriber.proto\"\x91\x01\n\nSubscriber\x12\"\n\x06status\x18\x01 \x01(\x0e\x32\x12.Subscriber.Status\x12\x14\n\x0cname_surname\x18\x02 \x01(\t\x12\n\n\x02id\x18\x03 \x01(\x05\x12\x15\n\rlast_accessed\x18\x04 \x01(\x03\"&\n\x06Status\x12\x08\n\x04SUBS\x10\x00\x12\x08\n\x04ONLN\x10\x01\x12\x08\n\x04OFFL\x10\x02\x62\x06proto3"

pool = Google::Protobuf::DescriptorPool.generated_pool
pool.add_serialized_file(descriptor_data)

Subscriber = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("Subscriber").msgclass
Subscriber::Status = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("Subscriber.Status").enummodule