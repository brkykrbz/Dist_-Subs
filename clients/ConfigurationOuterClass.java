// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Configuration.proto
// Protobuf Java Version: 4.29.3

public final class ConfigurationOuterClass {
  private ConfigurationOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ConfigurationOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConfigurationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Configuration)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 server_id = 1;</code>
     * @return The serverId.
     */
    int getServerId();

    /**
     * <code>int32 max_subscribers = 2;</code>
     * @return The maxSubscribers.
     */
    int getMaxSubscribers();

    /**
     * <code>bool enable_logging = 3;</code>
     * @return The enableLogging.
     */
    boolean getEnableLogging();

    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @return A list containing the allowedDomains.
     */
    java.util.List<java.lang.String>
        getAllowedDomainsList();
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @return The count of allowedDomains.
     */
    int getAllowedDomainsCount();
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @param index The index of the element to return.
     * @return The allowedDomains at the given index.
     */
    java.lang.String getAllowedDomains(int index);
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the allowedDomains at the given index.
     */
    com.google.protobuf.ByteString
        getAllowedDomainsBytes(int index);
  }
  /**
   * Protobuf type {@code Configuration}
   */
  public static final class Configuration extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Configuration)
      ConfigurationOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        Configuration.class.getName());
    }
    // Use Configuration.newBuilder() to construct.
    private Configuration(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Configuration() {
      allowedDomains_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ConfigurationOuterClass.internal_static_Configuration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ConfigurationOuterClass.internal_static_Configuration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConfigurationOuterClass.Configuration.class, ConfigurationOuterClass.Configuration.Builder.class);
    }

    public static final int SERVER_ID_FIELD_NUMBER = 1;
    private int serverId_ = 0;
    /**
     * <code>int32 server_id = 1;</code>
     * @return The serverId.
     */
    @java.lang.Override
    public int getServerId() {
      return serverId_;
    }

    public static final int MAX_SUBSCRIBERS_FIELD_NUMBER = 2;
    private int maxSubscribers_ = 0;
    /**
     * <code>int32 max_subscribers = 2;</code>
     * @return The maxSubscribers.
     */
    @java.lang.Override
    public int getMaxSubscribers() {
      return maxSubscribers_;
    }

    public static final int ENABLE_LOGGING_FIELD_NUMBER = 3;
    private boolean enableLogging_ = false;
    /**
     * <code>bool enable_logging = 3;</code>
     * @return The enableLogging.
     */
    @java.lang.Override
    public boolean getEnableLogging() {
      return enableLogging_;
    }

    public static final int ALLOWED_DOMAINS_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList allowedDomains_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @return A list containing the allowedDomains.
     */
    public com.google.protobuf.ProtocolStringList
        getAllowedDomainsList() {
      return allowedDomains_;
    }
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @return The count of allowedDomains.
     */
    public int getAllowedDomainsCount() {
      return allowedDomains_.size();
    }
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @param index The index of the element to return.
     * @return The allowedDomains at the given index.
     */
    public java.lang.String getAllowedDomains(int index) {
      return allowedDomains_.get(index);
    }
    /**
     * <code>repeated string allowed_domains = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the allowedDomains at the given index.
     */
    public com.google.protobuf.ByteString
        getAllowedDomainsBytes(int index) {
      return allowedDomains_.getByteString(index);
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
      if (serverId_ != 0) {
        output.writeInt32(1, serverId_);
      }
      if (maxSubscribers_ != 0) {
        output.writeInt32(2, maxSubscribers_);
      }
      if (enableLogging_ != false) {
        output.writeBool(3, enableLogging_);
      }
      for (int i = 0; i < allowedDomains_.size(); i++) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, allowedDomains_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, serverId_);
      }
      if (maxSubscribers_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, maxSubscribers_);
      }
      if (enableLogging_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, enableLogging_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < allowedDomains_.size(); i++) {
          dataSize += computeStringSizeNoTag(allowedDomains_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAllowedDomainsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ConfigurationOuterClass.Configuration)) {
        return super.equals(obj);
      }
      ConfigurationOuterClass.Configuration other = (ConfigurationOuterClass.Configuration) obj;

      if (getServerId()
          != other.getServerId()) return false;
      if (getMaxSubscribers()
          != other.getMaxSubscribers()) return false;
      if (getEnableLogging()
          != other.getEnableLogging()) return false;
      if (!getAllowedDomainsList()
          .equals(other.getAllowedDomainsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getServerId();
      hash = (37 * hash) + MAX_SUBSCRIBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxSubscribers();
      hash = (37 * hash) + ENABLE_LOGGING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnableLogging());
      if (getAllowedDomainsCount() > 0) {
        hash = (37 * hash) + ALLOWED_DOMAINS_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedDomainsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ConfigurationOuterClass.Configuration parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ConfigurationOuterClass.Configuration parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ConfigurationOuterClass.Configuration parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ConfigurationOuterClass.Configuration parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ConfigurationOuterClass.Configuration prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Configuration}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Configuration)
        ConfigurationOuterClass.ConfigurationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ConfigurationOuterClass.internal_static_Configuration_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ConfigurationOuterClass.internal_static_Configuration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ConfigurationOuterClass.Configuration.class, ConfigurationOuterClass.Configuration.Builder.class);
      }

      // Construct using ConfigurationOuterClass.Configuration.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        serverId_ = 0;
        maxSubscribers_ = 0;
        enableLogging_ = false;
        allowedDomains_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ConfigurationOuterClass.internal_static_Configuration_descriptor;
      }

      @java.lang.Override
      public ConfigurationOuterClass.Configuration getDefaultInstanceForType() {
        return ConfigurationOuterClass.Configuration.getDefaultInstance();
      }

      @java.lang.Override
      public ConfigurationOuterClass.Configuration build() {
        ConfigurationOuterClass.Configuration result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ConfigurationOuterClass.Configuration buildPartial() {
        ConfigurationOuterClass.Configuration result = new ConfigurationOuterClass.Configuration(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ConfigurationOuterClass.Configuration result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.serverId_ = serverId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.maxSubscribers_ = maxSubscribers_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.enableLogging_ = enableLogging_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          allowedDomains_.makeImmutable();
          result.allowedDomains_ = allowedDomains_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ConfigurationOuterClass.Configuration) {
          return mergeFrom((ConfigurationOuterClass.Configuration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ConfigurationOuterClass.Configuration other) {
        if (other == ConfigurationOuterClass.Configuration.getDefaultInstance()) return this;
        if (other.getServerId() != 0) {
          setServerId(other.getServerId());
        }
        if (other.getMaxSubscribers() != 0) {
          setMaxSubscribers(other.getMaxSubscribers());
        }
        if (other.getEnableLogging() != false) {
          setEnableLogging(other.getEnableLogging());
        }
        if (!other.allowedDomains_.isEmpty()) {
          if (allowedDomains_.isEmpty()) {
            allowedDomains_ = other.allowedDomains_;
            bitField0_ |= 0x00000008;
          } else {
            ensureAllowedDomainsIsMutable();
            allowedDomains_.addAll(other.allowedDomains_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                serverId_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                maxSubscribers_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                enableLogging_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAllowedDomainsIsMutable();
                allowedDomains_.add(s);
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int serverId_ ;
      /**
       * <code>int32 server_id = 1;</code>
       * @return The serverId.
       */
      @java.lang.Override
      public int getServerId() {
        return serverId_;
      }
      /**
       * <code>int32 server_id = 1;</code>
       * @param value The serverId to set.
       * @return This builder for chaining.
       */
      public Builder setServerId(int value) {

        serverId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 server_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = 0;
        onChanged();
        return this;
      }

      private int maxSubscribers_ ;
      /**
       * <code>int32 max_subscribers = 2;</code>
       * @return The maxSubscribers.
       */
      @java.lang.Override
      public int getMaxSubscribers() {
        return maxSubscribers_;
      }
      /**
       * <code>int32 max_subscribers = 2;</code>
       * @param value The maxSubscribers to set.
       * @return This builder for chaining.
       */
      public Builder setMaxSubscribers(int value) {

        maxSubscribers_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 max_subscribers = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxSubscribers() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maxSubscribers_ = 0;
        onChanged();
        return this;
      }

      private boolean enableLogging_ ;
      /**
       * <code>bool enable_logging = 3;</code>
       * @return The enableLogging.
       */
      @java.lang.Override
      public boolean getEnableLogging() {
        return enableLogging_;
      }
      /**
       * <code>bool enable_logging = 3;</code>
       * @param value The enableLogging to set.
       * @return This builder for chaining.
       */
      public Builder setEnableLogging(boolean value) {

        enableLogging_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool enable_logging = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnableLogging() {
        bitField0_ = (bitField0_ & ~0x00000004);
        enableLogging_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList allowedDomains_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureAllowedDomainsIsMutable() {
        if (!allowedDomains_.isModifiable()) {
          allowedDomains_ = new com.google.protobuf.LazyStringArrayList(allowedDomains_);
        }
        bitField0_ |= 0x00000008;
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @return A list containing the allowedDomains.
       */
      public com.google.protobuf.ProtocolStringList
          getAllowedDomainsList() {
        allowedDomains_.makeImmutable();
        return allowedDomains_;
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @return The count of allowedDomains.
       */
      public int getAllowedDomainsCount() {
        return allowedDomains_.size();
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @param index The index of the element to return.
       * @return The allowedDomains at the given index.
       */
      public java.lang.String getAllowedDomains(int index) {
        return allowedDomains_.get(index);
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @param index The index of the value to return.
       * @return The bytes of the allowedDomains at the given index.
       */
      public com.google.protobuf.ByteString
          getAllowedDomainsBytes(int index) {
        return allowedDomains_.getByteString(index);
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @param index The index to set the value at.
       * @param value The allowedDomains to set.
       * @return This builder for chaining.
       */
      public Builder setAllowedDomains(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAllowedDomainsIsMutable();
        allowedDomains_.set(index, value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @param value The allowedDomains to add.
       * @return This builder for chaining.
       */
      public Builder addAllowedDomains(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAllowedDomainsIsMutable();
        allowedDomains_.add(value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @param values The allowedDomains to add.
       * @return This builder for chaining.
       */
      public Builder addAllAllowedDomains(
          java.lang.Iterable<java.lang.String> values) {
        ensureAllowedDomainsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allowedDomains_);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllowedDomains() {
        allowedDomains_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string allowed_domains = 4;</code>
       * @param value The bytes of the allowedDomains to add.
       * @return This builder for chaining.
       */
      public Builder addAllowedDomainsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureAllowedDomainsIsMutable();
        allowedDomains_.add(value);
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Configuration)
    }

    // @@protoc_insertion_point(class_scope:Configuration)
    private static final ConfigurationOuterClass.Configuration DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ConfigurationOuterClass.Configuration();
    }

    public static ConfigurationOuterClass.Configuration getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Configuration>
        PARSER = new com.google.protobuf.AbstractParser<Configuration>() {
      @java.lang.Override
      public Configuration parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Configuration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Configuration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ConfigurationOuterClass.Configuration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Configuration_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Configuration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023Configuration.proto\"l\n\rConfiguration\022\021" +
      "\n\tserver_id\030\001 \001(\005\022\027\n\017max_subscribers\030\002 \001" +
      "(\005\022\026\n\016enable_logging\030\003 \001(\010\022\027\n\017allowed_do" +
      "mains\030\004 \003(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Configuration_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Configuration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Configuration_descriptor,
        new java.lang.String[] { "ServerId", "MaxSubscribers", "EnableLogging", "AllowedDomains", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
