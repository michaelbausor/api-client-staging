<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/configuration.proto

namespace Google\Devtools\Resultstore\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Represents a configuration within an Invocation associated with one or more
 * ConfiguredTargets. It captures the environment and other settings that
 * were used.
 *
 * Generated from protobuf message <code>google.devtools.resultstore.v2.Configuration</code>
 */
class Configuration extends \Google\Protobuf\Internal\Message
{
    /**
     * The format of this Configuration resource name must be:
     * invocations/${INVOCATION_ID}/configs/${CONFIG_ID}
     * The configuration ID of "default" should be preferred for the default
     * configuration in a single-config invocation.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * The resource ID components that identify the Configuration. They must match
     * the resource name after proper encoding.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.Configuration.Id id = 2;</code>
     */
    private $id = null;
    /**
     * The aggregate status for this configuration.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.StatusAttributes status_attributes = 3;</code>
     */
    private $status_attributes = null;
    /**
     * Attributes that apply only to this configuration.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.ConfigurationAttributes configuration_attributes = 5;</code>
     */
    private $configuration_attributes = null;
    /**
     * Arbitrary name-value pairs.
     * This is implemented as a multi-map. Multiple properties are allowed with
     * the same key. Properties will be returned in lexicographical order by key.
     *
     * Generated from protobuf field <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
     */
    private $properties;

    public function __construct() {
        \GPBMetadata\Google\Devtools\Resultstore\V2\Configuration::initOnce();
        parent::__construct();
    }

    /**
     * The format of this Configuration resource name must be:
     * invocations/${INVOCATION_ID}/configs/${CONFIG_ID}
     * The configuration ID of "default" should be preferred for the default
     * configuration in a single-config invocation.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The format of this Configuration resource name must be:
     * invocations/${INVOCATION_ID}/configs/${CONFIG_ID}
     * The configuration ID of "default" should be preferred for the default
     * configuration in a single-config invocation.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * The resource ID components that identify the Configuration. They must match
     * the resource name after proper encoding.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.Configuration.Id id = 2;</code>
     * @return \Google\Devtools\Resultstore\V2\Configuration_Id
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * The resource ID components that identify the Configuration. They must match
     * the resource name after proper encoding.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.Configuration.Id id = 2;</code>
     * @param \Google\Devtools\Resultstore\V2\Configuration_Id $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Resultstore\V2\Configuration_Id::class);
        $this->id = $var;

        return $this;
    }

    /**
     * The aggregate status for this configuration.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.StatusAttributes status_attributes = 3;</code>
     * @return \Google\Devtools\Resultstore\V2\StatusAttributes
     */
    public function getStatusAttributes()
    {
        return $this->status_attributes;
    }

    /**
     * The aggregate status for this configuration.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.StatusAttributes status_attributes = 3;</code>
     * @param \Google\Devtools\Resultstore\V2\StatusAttributes $var
     * @return $this
     */
    public function setStatusAttributes($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Resultstore\V2\StatusAttributes::class);
        $this->status_attributes = $var;

        return $this;
    }

    /**
     * Attributes that apply only to this configuration.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.ConfigurationAttributes configuration_attributes = 5;</code>
     * @return \Google\Devtools\Resultstore\V2\ConfigurationAttributes
     */
    public function getConfigurationAttributes()
    {
        return $this->configuration_attributes;
    }

    /**
     * Attributes that apply only to this configuration.
     *
     * Generated from protobuf field <code>.google.devtools.resultstore.v2.ConfigurationAttributes configuration_attributes = 5;</code>
     * @param \Google\Devtools\Resultstore\V2\ConfigurationAttributes $var
     * @return $this
     */
    public function setConfigurationAttributes($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Resultstore\V2\ConfigurationAttributes::class);
        $this->configuration_attributes = $var;

        return $this;
    }

    /**
     * Arbitrary name-value pairs.
     * This is implemented as a multi-map. Multiple properties are allowed with
     * the same key. Properties will be returned in lexicographical order by key.
     *
     * Generated from protobuf field <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getProperties()
    {
        return $this->properties;
    }

    /**
     * Arbitrary name-value pairs.
     * This is implemented as a multi-map. Multiple properties are allowed with
     * the same key. Properties will be returned in lexicographical order by key.
     *
     * Generated from protobuf field <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
     * @param \Google\Devtools\Resultstore\V2\Property[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setProperties($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Resultstore\V2\Property::class);
        $this->properties = $arr;

        return $this;
    }

}

