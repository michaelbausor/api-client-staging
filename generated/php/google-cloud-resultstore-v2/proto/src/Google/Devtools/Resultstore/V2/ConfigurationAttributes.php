<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/configuration.proto

namespace Google\Devtools\Resultstore\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Attributes that apply only to the configuration.
 *
 * Generated from protobuf message <code>google.devtools.resultstore.v2.ConfigurationAttributes</code>
 */
class ConfigurationAttributes extends \Google\Protobuf\Internal\Message
{
    /**
     * The type of cpu. (e.g. "x86", "powerpc")
     *
     * Generated from protobuf field <code>string cpu = 1;</code>
     */
    private $cpu = '';

    public function __construct() {
        \GPBMetadata\Google\Devtools\Resultstore\V2\Configuration::initOnce();
        parent::__construct();
    }

    /**
     * The type of cpu. (e.g. "x86", "powerpc")
     *
     * Generated from protobuf field <code>string cpu = 1;</code>
     * @return string
     */
    public function getCpu()
    {
        return $this->cpu;
    }

    /**
     * The type of cpu. (e.g. "x86", "powerpc")
     *
     * Generated from protobuf field <code>string cpu = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setCpu($var)
    {
        GPBUtil::checkString($var, True);
        $this->cpu = $var;

        return $this;
    }

}

