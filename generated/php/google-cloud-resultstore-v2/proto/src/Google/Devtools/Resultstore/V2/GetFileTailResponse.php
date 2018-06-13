<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/resultstore_file_download.proto

namespace Google\Devtools\Resultstore\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Response object for GetFileTail
 *
 * Generated from protobuf message <code>google.devtools.resultstore.v2.GetFileTailResponse</code>
 */
class GetFileTailResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * The file data, encoded with UTF-8.
     *
     * Generated from protobuf field <code>bytes data = 1;</code>
     */
    private $data = '';

    public function __construct() {
        \GPBMetadata\Google\Devtools\Resultstore\V2\ResultstoreFileDownload::initOnce();
        parent::__construct();
    }

    /**
     * The file data, encoded with UTF-8.
     *
     * Generated from protobuf field <code>bytes data = 1;</code>
     * @return string
     */
    public function getData()
    {
        return $this->data;
    }

    /**
     * The file data, encoded with UTF-8.
     *
     * Generated from protobuf field <code>bytes data = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setData($var)
    {
        GPBUtil::checkString($var, False);
        $this->data = $var;

        return $this;
    }

}

