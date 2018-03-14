<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/storage.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Configuration of the timespan of the items to include in scanning.
 * Currently only supported when inspecting Google Cloud Storage and BigQuery.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.StorageConfig.TimespanConfig</code>
 */
class StorageConfig_TimespanConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Exclude files older than this value.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    private $start_time = null;
    /**
     * Exclude files newer than this value.
     * If set to zero, no upper time limit is applied.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    private $end_time = null;
    /**
     * Specification of the field containing the timestamp of scanned items.
     * Required for data sources like Datastore or BigQuery.
     * The valid data types of the timestamp field are:
     * for BigQuery - timestamp, date, datetime;
     * for Datastore - timestamp.
     * Datastore entity will be scanned if the timestamp property does not exist
     * or its value is empty or invalid.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId timestamp_field = 3;</code>
     */
    private $timestamp_field = null;
    /**
     * When the job is started by a JobTrigger we will automatically figure out
     * a valid start_time to avoid scanning files that have not been modified
     * since the last time the JobTrigger executed. This will be based on the
     * time of the execution of the last run of the JobTrigger.
     *
     * Generated from protobuf field <code>bool enable_auto_population_of_timespan_config = 4;</code>
     */
    private $enable_auto_population_of_timespan_config = false;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2\Storage::initOnce();
        parent::__construct();
    }

    /**
     * Exclude files older than this value.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 1;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getStartTime()
    {
        return $this->start_time;
    }

    /**
     * Exclude files older than this value.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 1;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setStartTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->start_time = $var;

        return $this;
    }

    /**
     * Exclude files newer than this value.
     * If set to zero, no upper time limit is applied.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getEndTime()
    {
        return $this->end_time;
    }

    /**
     * Exclude files newer than this value.
     * If set to zero, no upper time limit is applied.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setEndTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->end_time = $var;

        return $this;
    }

    /**
     * Specification of the field containing the timestamp of scanned items.
     * Required for data sources like Datastore or BigQuery.
     * The valid data types of the timestamp field are:
     * for BigQuery - timestamp, date, datetime;
     * for Datastore - timestamp.
     * Datastore entity will be scanned if the timestamp property does not exist
     * or its value is empty or invalid.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId timestamp_field = 3;</code>
     * @return \Google\Cloud\Dlp\V2\FieldId
     */
    public function getTimestampField()
    {
        return $this->timestamp_field;
    }

    /**
     * Specification of the field containing the timestamp of scanned items.
     * Required for data sources like Datastore or BigQuery.
     * The valid data types of the timestamp field are:
     * for BigQuery - timestamp, date, datetime;
     * for Datastore - timestamp.
     * Datastore entity will be scanned if the timestamp property does not exist
     * or its value is empty or invalid.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId timestamp_field = 3;</code>
     * @param \Google\Cloud\Dlp\V2\FieldId $var
     * @return $this
     */
    public function setTimestampField($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\FieldId::class);
        $this->timestamp_field = $var;

        return $this;
    }

    /**
     * When the job is started by a JobTrigger we will automatically figure out
     * a valid start_time to avoid scanning files that have not been modified
     * since the last time the JobTrigger executed. This will be based on the
     * time of the execution of the last run of the JobTrigger.
     *
     * Generated from protobuf field <code>bool enable_auto_population_of_timespan_config = 4;</code>
     * @return bool
     */
    public function getEnableAutoPopulationOfTimespanConfig()
    {
        return $this->enable_auto_population_of_timespan_config;
    }

    /**
     * When the job is started by a JobTrigger we will automatically figure out
     * a valid start_time to avoid scanning files that have not been modified
     * since the last time the JobTrigger executed. This will be based on the
     * time of the execution of the last run of the JobTrigger.
     *
     * Generated from protobuf field <code>bool enable_auto_population_of_timespan_config = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setEnableAutoPopulationOfTimespanConfig($var)
    {
        GPBUtil::checkBool($var);
        $this->enable_auto_population_of_timespan_config = $var;

        return $this;
    }

}

