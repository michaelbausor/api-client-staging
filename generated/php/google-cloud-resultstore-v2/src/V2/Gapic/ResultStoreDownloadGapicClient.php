<?php
/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * GENERATED CODE WARNING
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/devtools/resultstore/v2/resultstore_download.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * @experimental
 */

namespace Google\Cloud\Devtools\Resultstore\V2\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Devtools\Resultstore\V2\Action;
use Google\Devtools\Resultstore\V2\Configuration;
use Google\Devtools\Resultstore\V2\ConfiguredTarget;
use Google\Devtools\Resultstore\V2\FileSet;
use Google\Devtools\Resultstore\V2\GetActionRequest;
use Google\Devtools\Resultstore\V2\GetConfigurationRequest;
use Google\Devtools\Resultstore\V2\GetConfiguredTargetRequest;
use Google\Devtools\Resultstore\V2\GetFileSetRequest;
use Google\Devtools\Resultstore\V2\GetInvocationRequest;
use Google\Devtools\Resultstore\V2\GetTargetRequest;
use Google\Devtools\Resultstore\V2\Invocation;
use Google\Devtools\Resultstore\V2\ListActionsRequest;
use Google\Devtools\Resultstore\V2\ListActionsResponse;
use Google\Devtools\Resultstore\V2\ListConfigurationsRequest;
use Google\Devtools\Resultstore\V2\ListConfigurationsResponse;
use Google\Devtools\Resultstore\V2\ListConfiguredTargetsRequest;
use Google\Devtools\Resultstore\V2\ListConfiguredTargetsResponse;
use Google\Devtools\Resultstore\V2\ListFileSetsRequest;
use Google\Devtools\Resultstore\V2\ListFileSetsResponse;
use Google\Devtools\Resultstore\V2\ListTargetsRequest;
use Google\Devtools\Resultstore\V2\ListTargetsResponse;
use Google\Devtools\Resultstore\V2\SearchInvocationsRequest;
use Google\Devtools\Resultstore\V2\SearchInvocationsResponse;
use Google\Devtools\Resultstore\V2\Target;

/**
 * Service Description: This is the interface used to download information from the database.
 *
 * Every request supports setting a response FieldMask via the 'fields'
 * parameter.
 * Each resource in this interface carries a name field that
 * identifies the resource.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $resultStoreDownloadClient = new ResultStoreDownloadClient();
 * try {
 *     $formattedName = $resultStoreDownloadClient->invocationName('[INVOCATION]');
 *     $response = $resultStoreDownloadClient->getInvocation($formattedName);
 * } finally {
 *     $resultStoreDownloadClient->close();
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parseName method to extract the individual identifiers contained within formatted names
 * that are returned by the API.
 *
 * @experimental
 */
class ResultStoreDownloadGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.devtools.resultstore.v2.ResultStoreDownload';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'resultstore.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The default scopes required by the service.
     */
    public static $serviceScopes = [
        'https://www.googleapis.com/auth/cloud-platform',
    ];
    private static $invocationNameTemplate;
    private static $configNameTemplate;
    private static $fileSetNameTemplate;
    private static $targetNameTemplate;
    private static $configuredTargetNameTemplate;
    private static $actionNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/result_store_download_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/result_store_download_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/result_store_download_rest_client_config.php',
                ],
            ],
        ];
    }

    private static function getInvocationNameTemplate()
    {
        if (self::$invocationNameTemplate == null) {
            self::$invocationNameTemplate = new PathTemplate('invocations/{invocation}');
        }

        return self::$invocationNameTemplate;
    }

    private static function getConfigNameTemplate()
    {
        if (self::$configNameTemplate == null) {
            self::$configNameTemplate = new PathTemplate('invocations/{invocation}/configs/{config}');
        }

        return self::$configNameTemplate;
    }

    private static function getFileSetNameTemplate()
    {
        if (self::$fileSetNameTemplate == null) {
            self::$fileSetNameTemplate = new PathTemplate('invocations/{invocation}/fileSets/{file_set}');
        }

        return self::$fileSetNameTemplate;
    }

    private static function getTargetNameTemplate()
    {
        if (self::$targetNameTemplate == null) {
            self::$targetNameTemplate = new PathTemplate('invocations/{invocation}/targets/{target}');
        }

        return self::$targetNameTemplate;
    }

    private static function getConfiguredTargetNameTemplate()
    {
        if (self::$configuredTargetNameTemplate == null) {
            self::$configuredTargetNameTemplate = new PathTemplate('invocations/{invocation}/targets/{target}/configuredTargets/{configured_target}');
        }

        return self::$configuredTargetNameTemplate;
    }

    private static function getActionNameTemplate()
    {
        if (self::$actionNameTemplate == null) {
            self::$actionNameTemplate = new PathTemplate('invocations/{invocation}/targets/{target}/configuredTargets/{configured_target}/actions/{action}');
        }

        return self::$actionNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'invocation' => self::getInvocationNameTemplate(),
                'config' => self::getConfigNameTemplate(),
                'fileSet' => self::getFileSetNameTemplate(),
                'target' => self::getTargetNameTemplate(),
                'configuredTarget' => self::getConfiguredTargetNameTemplate(),
                'action' => self::getActionNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a invocation resource.
     *
     * @param string $invocation
     *
     * @return string The formatted invocation resource.
     * @experimental
     */
    public static function invocationName($invocation)
    {
        return self::getInvocationNameTemplate()->render([
            'invocation' => $invocation,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a config resource.
     *
     * @param string $invocation
     * @param string $config
     *
     * @return string The formatted config resource.
     * @experimental
     */
    public static function configName($invocation, $config)
    {
        return self::getConfigNameTemplate()->render([
            'invocation' => $invocation,
            'config' => $config,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a file_set resource.
     *
     * @param string $invocation
     * @param string $fileSet
     *
     * @return string The formatted file_set resource.
     * @experimental
     */
    public static function fileSetName($invocation, $fileSet)
    {
        return self::getFileSetNameTemplate()->render([
            'invocation' => $invocation,
            'file_set' => $fileSet,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a target resource.
     *
     * @param string $invocation
     * @param string $target
     *
     * @return string The formatted target resource.
     * @experimental
     */
    public static function targetName($invocation, $target)
    {
        return self::getTargetNameTemplate()->render([
            'invocation' => $invocation,
            'target' => $target,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a configured_target resource.
     *
     * @param string $invocation
     * @param string $target
     * @param string $configuredTarget
     *
     * @return string The formatted configured_target resource.
     * @experimental
     */
    public static function configuredTargetName($invocation, $target, $configuredTarget)
    {
        return self::getConfiguredTargetNameTemplate()->render([
            'invocation' => $invocation,
            'target' => $target,
            'configured_target' => $configuredTarget,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a action resource.
     *
     * @param string $invocation
     * @param string $target
     * @param string $configuredTarget
     * @param string $action
     *
     * @return string The formatted action resource.
     * @experimental
     */
    public static function actionName($invocation, $target, $configuredTarget, $action)
    {
        return self::getActionNameTemplate()->render([
            'invocation' => $invocation,
            'target' => $target,
            'configured_target' => $configuredTarget,
            'action' => $action,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - invocation: invocations/{invocation}
     * - config: invocations/{invocation}/configs/{config}
     * - fileSet: invocations/{invocation}/fileSets/{file_set}
     * - target: invocations/{invocation}/targets/{target}
     * - configuredTarget: invocations/{invocation}/targets/{target}/configuredTargets/{configured_target}
     * - action: invocations/{invocation}/targets/{target}/configuredTargets/{configured_target}/actions/{action}.
     *
     * The optional $template argument can be supplied to specify a particular pattern, and must
     * match one of the templates listed above. If no $template argument is provided, or if the
     * $template argument does not match one of the templates listed, then parseName will check
     * each of the supported templates, and return the first match.
     *
     * @param string $formattedName The formatted name string
     * @param string $template      Optional name of template to match
     *
     * @return array An associative array from name component IDs to component values.
     *
     * @throws ValidationException If $formattedName could not be matched.
     * @experimental
     */
    public static function parseName($formattedName, $template = null)
    {
        $templateMap = self::getPathTemplateMap();

        if ($template) {
            if (!isset($templateMap[$template])) {
                throw new ValidationException("Template name $template does not exist");
            }

            return $templateMap[$template]->match($formattedName);
        }

        foreach ($templateMap as $templateName => $pathTemplate) {
            try {
                return $pathTemplate->match($formattedName);
            } catch (ValidationException $ex) {
                // Swallow the exception to continue trying other path templates
            }
        }
        throw new ValidationException("Input did not match any known format. Input: $formattedName");
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress
     *           The address of the API remote host. May optionally include the port, formatted
     *           as "<uri>:<port>". Default 'resultstore.googleapis.com:443'.
     *     @type string|array|FetchAuthTokenInterface|CredentialsWrapper $credentials
     *           The credentials to be used by the client to authorize API calls. This option
     *           accepts either a path to a credentials file, or a decoded credentials file as a
     *           PHP array.
     *           *Advanced usage*: In addition, this option can also accept a pre-constructed
     *           {@see \Google\Auth\FetchAuthTokenInterface} object or
     *           {@see \Google\ApiCore\CredentialsWrapper} object. Note that when one of these
     *           objects are provided, any settings in $credentialsConfig will be ignored.
     *     @type array $credentialsConfig
     *           Options used to configure credentials, including auth token caching, for the client.
     *           For a full list of supporting configuration options, see
     *           {@see \Google\ApiCore\CredentialsWrapper::build()}.
     *     @type bool $disableRetries
     *           Determines whether or not retries defined by the client configuration should be
     *           disabled. Defaults to `false`.
     *     @type string|array $clientConfig
     *           Client method configuration, including retry settings. This option can be either a
     *           path to a JSON file, or a PHP array containing the decoded JSON data.
     *           By default this settings points to the default client config file, which is provided
     *           in the resources folder.
     *     @type string|TransportInterface $transport
     *           The transport used for executing network requests. May be either the string `rest`
     *           or `grpc`. Defaults to `grpc` if gRPC support is detected on the system.
     *           *Advanced usage*: Additionally, it is possible to pass in an already instantiated
     *           {@see \Google\ApiCore\Transport\TransportInterface} object. Note that when this
     *           object is provided, any settings in $transportConfig, and any $serviceAddress
     *           setting, will be ignored.
     *     @type array $transportConfig
     *           Configuration options that will be used to construct the transport. Options for
     *           each supported transport type should be passed in a key for that transport. For
     *           example:
     *           $transportConfig = [
     *               'grpc' => [...],
     *               'rest' => [...]
     *           ];
     *           See the {@see \Google\ApiCore\Transport\GrpcTransport::build()} and
     *           {@see \Google\ApiCore\Transport\RestTransport::build()} methods for the
     *           supported options.
     * }
     *
     * @throws ValidationException
     * @experimental
     */
    public function __construct(array $options = [])
    {
        $clientOptions = $this->buildClientOptions($options);
        $this->setClientOptions($clientOptions);
    }

    /**
     * Retrieves the invocation with the given name.
     *
     * An error will be reported in the following cases:
     * - If the invocation is not found.
     * - If the given invocation name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedName = $resultStoreDownloadClient->invocationName('[INVOCATION]');
     *     $response = $resultStoreDownloadClient->getInvocation($formattedName);
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the invocation to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}
     *                             where INVOCATION_ID must be an RFC 4122-compliant random UUID.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Resultstore\V2\Invocation
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getInvocation($name, array $optionalArgs = [])
    {
        $request = new GetInvocationRequest();
        $request->setName($name);

        return $this->startCall(
            'GetInvocation',
            Invocation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Searches for invocations matching the given query parameters.
     *
     *
     * An error will be reported in the following cases:
     * - If a query string is not provided
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $query = '';
     *     $projectId = '';
     *     // Iterate through all elements
     *     $pagedResponse = $resultStoreDownloadClient->searchInvocations($query, $projectId);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $resultStoreDownloadClient->searchInvocations($query, $projectId);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $query        A filtering query string.
     * @param string $projectId    The project id to search under.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $offset
     *          Absolute number of results to skip.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function searchInvocations($query, $projectId, array $optionalArgs = [])
    {
        $request = new SearchInvocationsRequest();
        $request->setQuery($query);
        $request->setProjectId($projectId);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['offset'])) {
            $request->setOffset($optionalArgs['offset']);
        }

        return $this->getPagedListResponse(
            'SearchInvocations',
            $optionalArgs,
            SearchInvocationsResponse::class,
            $request
        );
    }

    /**
     * Retrieves the configuration with the given name.
     *
     * An error will be reported in the following cases:
     * - If the configuration or its parent invocation is not found.
     * - If the given configuration name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedName = $resultStoreDownloadClient->configName('[INVOCATION]', '[CONFIG]');
     *     $response = $resultStoreDownloadClient->getConfiguration($formattedName);
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the configuration to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}/configs/${CONFIGURATION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Resultstore\V2\Configuration
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getConfiguration($name, array $optionalArgs = [])
    {
        $request = new GetConfigurationRequest();
        $request->setName($name);

        return $this->startCall(
            'GetConfiguration',
            Configuration::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Retrieves all configurations for a parent invocation.
     * This might be limited by user or server,
     * in which case a continuation token is provided.
     *
     * An error will be reported in the following cases:
     * - If the parent invocation is not found.
     * - If the given parent invocation name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedParent = $resultStoreDownloadClient->invocationName('[INVOCATION]');
     *     // Iterate through all elements
     *     $pagedResponse = $resultStoreDownloadClient->listConfigurations($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $resultStoreDownloadClient->listConfigurations($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $parent       The invocation name of the configurations to retrieve.
     *                             It must match this format: invocations/${INVOCATION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $offset
     *          Absolute number of results to skip.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listConfigurations($parent, array $optionalArgs = [])
    {
        $request = new ListConfigurationsRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['offset'])) {
            $request->setOffset($optionalArgs['offset']);
        }

        return $this->getPagedListResponse(
            'ListConfigurations',
            $optionalArgs,
            ListConfigurationsResponse::class,
            $request
        );
    }

    /**
     * Retrieves the target with the given name.
     *
     * An error will be reported in the following cases:
     * - If the target or its parent invocation is not found.
     * - If the given target name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedName = $resultStoreDownloadClient->targetName('[INVOCATION]', '[TARGET]');
     *     $response = $resultStoreDownloadClient->getTarget($formattedName);
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the target to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}/targets/${TARGET_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Resultstore\V2\Target
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getTarget($name, array $optionalArgs = [])
    {
        $request = new GetTargetRequest();
        $request->setName($name);

        return $this->startCall(
            'GetTarget',
            Target::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Retrieves all targets for a parent invocation.  This might be limited by
     * user or server, in which case a continuation token is provided.
     *
     * An error will be reported in the following cases:
     * - If the parent is not found.
     * - If the given parent name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedParent = $resultStoreDownloadClient->invocationName('[INVOCATION]');
     *     // Iterate through all elements
     *     $pagedResponse = $resultStoreDownloadClient->listTargets($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $resultStoreDownloadClient->listTargets($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $parent       The invocation name of the targets to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $offset
     *          Absolute number of results to skip.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listTargets($parent, array $optionalArgs = [])
    {
        $request = new ListTargetsRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['offset'])) {
            $request->setOffset($optionalArgs['offset']);
        }

        return $this->getPagedListResponse(
            'ListTargets',
            $optionalArgs,
            ListTargetsResponse::class,
            $request
        );
    }

    /**
     * Retrieves the configured target with the given name.
     *
     * An error will be reported in the following cases:
     * - If the configured target is not found.
     * - If the given name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedName = $resultStoreDownloadClient->configuredTargetName('[INVOCATION]', '[TARGET]', '[CONFIGURED_TARGET]');
     *     $response = $resultStoreDownloadClient->getConfiguredTarget($formattedName);
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the configured target to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}/targets/${TARGET_ID}/configuredTargets/${CONFIGURATION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Resultstore\V2\ConfiguredTarget
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getConfiguredTarget($name, array $optionalArgs = [])
    {
        $request = new GetConfiguredTargetRequest();
        $request->setName($name);

        return $this->startCall(
            'GetConfiguredTarget',
            ConfiguredTarget::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Retrieves all configured targets for a parent invocation/target.
     * This might be limited by user or server, in which case a continuation
     * token is provided.  Supports '-' for targetId meaning all targets.
     *
     * An error will be reported in the following cases:
     * - If the parent is not found.
     * - If the given parent name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedParent = $resultStoreDownloadClient->targetName('[INVOCATION]', '[TARGET]');
     *     // Iterate through all elements
     *     $pagedResponse = $resultStoreDownloadClient->listConfiguredTargets($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $resultStoreDownloadClient->listConfiguredTargets($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $parent       The invocation and target name of the configured targets to retrieve.
     *                             It must match this format:
     *                             invocations/${INVOCATION_ID}/targets/${TARGET_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $offset
     *          Absolute number of results to skip.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listConfiguredTargets($parent, array $optionalArgs = [])
    {
        $request = new ListConfiguredTargetsRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['offset'])) {
            $request->setOffset($optionalArgs['offset']);
        }

        return $this->getPagedListResponse(
            'ListConfiguredTargets',
            $optionalArgs,
            ListConfiguredTargetsResponse::class,
            $request
        );
    }

    /**
     * Retrieves the action with the given name.
     *
     * An error will be reported in the following cases:
     * - If the action is not found.
     * - If the given name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedName = $resultStoreDownloadClient->actionName('[INVOCATION]', '[TARGET]', '[CONFIGURED_TARGET]', '[ACTION]');
     *     $response = $resultStoreDownloadClient->getAction($formattedName);
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the action to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}/targets/${TARGET_ID}/configuredTargets/${CONFIGURATION_ID}/actions/${ACTION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Resultstore\V2\Action
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getAction($name, array $optionalArgs = [])
    {
        $request = new GetActionRequest();
        $request->setName($name);

        return $this->startCall(
            'GetAction',
            Action::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Retrieves all actions for a parent invocation/target/configuration.
     * This might be limited by user or server, in which case a continuation
     * token is provided.  Supports '-' for configurationId to mean all
     * actions for all configurations for a target, or '-' for targetId and
     * configurationId to mean all actions for all configurations and all targets.
     * Does not support targetId '-' with a specified configuration.
     *
     * An error will be reported in the following cases:
     * - If the parent is not found.
     * - If the given parent name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedParent = $resultStoreDownloadClient->configuredTargetName('[INVOCATION]', '[TARGET]', '[CONFIGURED_TARGET]');
     *     // Iterate through all elements
     *     $pagedResponse = $resultStoreDownloadClient->listActions($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $resultStoreDownloadClient->listActions($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $parent       The invocation, target, and configuration name of the action to retrieve.
     *                             It must match this format:
     *                             invocations/${INVOCATION_ID}/targets/${TARGET_ID}/configuredTargets/${CONFIGURATION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $offset
     *          Absolute number of results to skip.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listActions($parent, array $optionalArgs = [])
    {
        $request = new ListActionsRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['offset'])) {
            $request->setOffset($optionalArgs['offset']);
        }

        return $this->getPagedListResponse(
            'ListActions',
            $optionalArgs,
            ListActionsResponse::class,
            $request
        );
    }

    /**
     * Retrieves the file set with the given name.
     *
     * An error will be reported in the following cases:
     * - If the file set or its parent invocation is not found.
     * - If the given file set name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedName = $resultStoreDownloadClient->fileSetName('[INVOCATION]', '[FILE_SET]');
     *     $response = $resultStoreDownloadClient->getFileSet($formattedName);
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the file set to retrieve. It must match this format:
     *                             invocations/${INVOCATION_ID}/fileSets/${FILE_SET_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Resultstore\V2\FileSet
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getFileSet($name, array $optionalArgs = [])
    {
        $request = new GetFileSetRequest();
        $request->setName($name);

        return $this->startCall(
            'GetFileSet',
            FileSet::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Retrieves all file sets for a parent invocation.
     * This might be limited by user or server,
     * in which case a continuation token is provided.
     *
     * An error will be reported in the following cases:
     * - If the parent invocation is not found.
     * - If the given parent invocation name is badly formatted.
     *
     * Sample code:
     * ```
     * $resultStoreDownloadClient = new ResultStoreDownloadClient();
     * try {
     *     $formattedParent = $resultStoreDownloadClient->invocationName('[INVOCATION]');
     *     // Iterate through all elements
     *     $pagedResponse = $resultStoreDownloadClient->listFileSets($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $resultStoreDownloadClient->listFileSets($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $resultStoreDownloadClient->close();
     * }
     * ```
     *
     * @param string $parent       The invocation name of the file sets to retrieve.
     *                             It must match this format: invocations/${INVOCATION_ID}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $offset
     *          Absolute number of results to skip.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listFileSets($parent, array $optionalArgs = [])
    {
        $request = new ListFileSetsRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['offset'])) {
            $request->setOffset($optionalArgs['offset']);
        }

        return $this->getPagedListResponse(
            'ListFileSets',
            $optionalArgs,
            ListFileSetsResponse::class,
            $request
        );
    }
}
