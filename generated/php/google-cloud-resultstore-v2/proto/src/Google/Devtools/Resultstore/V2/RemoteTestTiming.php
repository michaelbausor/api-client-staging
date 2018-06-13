<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/action.proto

namespace Google\Devtools\Resultstore\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Timing data for the part of the test execution that is done remotely.
 *
 * Generated from protobuf message <code>google.devtools.resultstore.v2.RemoteTestTiming</code>
 */
class RemoteTestTiming extends \Google\Protobuf\Internal\Message
{
    /**
     * Time taken locally to determine what to do.
     *
     * Generated from protobuf field <code>.google.protobuf.Duration local_analysis_duration = 1;</code>
     */
    private $local_analysis_duration = null;
    /**
     * Normally there is only one attempt, but the system may retry on internal
     * errors, leading to multiple attempts.
     *
     * Generated from protobuf field <code>repeated .google.devtools.resultstore.v2.RemoteTestAttemptTiming attempts = 2;</code>
     */
    private $attempts;

    public function __construct() {
        \GPBMetadata\Google\Devtools\Resultstore\V2\Action::initOnce();
        parent::__construct();
    }

    /**
     * Time taken locally to determine what to do.
     *
     * Generated from protobuf field <code>.google.protobuf.Duration local_analysis_duration = 1;</code>
     * @return \Google\Protobuf\Duration
     */
    public function getLocalAnalysisDuration()
    {
        return $this->local_analysis_duration;
    }

    /**
     * Time taken locally to determine what to do.
     *
     * Generated from protobuf field <code>.google.protobuf.Duration local_analysis_duration = 1;</code>
     * @param \Google\Protobuf\Duration $var
     * @return $this
     */
    public function setLocalAnalysisDuration($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Duration::class);
        $this->local_analysis_duration = $var;

        return $this;
    }

    /**
     * Normally there is only one attempt, but the system may retry on internal
     * errors, leading to multiple attempts.
     *
     * Generated from protobuf field <code>repeated .google.devtools.resultstore.v2.RemoteTestAttemptTiming attempts = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getAttempts()
    {
        return $this->attempts;
    }

    /**
     * Normally there is only one attempt, but the system may retry on internal
     * errors, leading to multiple attempts.
     *
     * Generated from protobuf field <code>repeated .google.devtools.resultstore.v2.RemoteTestAttemptTiming attempts = 2;</code>
     * @param \Google\Devtools\Resultstore\V2\RemoteTestAttemptTiming[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setAttempts($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Resultstore\V2\RemoteTestAttemptTiming::class);
        $this->attempts = $arr;

        return $this;
    }

}

