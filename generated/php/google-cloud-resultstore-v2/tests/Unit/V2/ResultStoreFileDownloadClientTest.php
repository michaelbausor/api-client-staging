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
 * This file was automatically generated - do not edit!
 */

namespace Google\Cloud\Devtools\Resultstore\Tests\Unit\V2;

use Google\Cloud\Devtools\Resultstore\V2\ResultStoreFileDownloadClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\ServerStream;
use Google\ApiCore\Testing\GeneratedTest;
use Google\ApiCore\Testing\MockTransport;
use Google\Devtools\Resultstore\V2\GetFileResponse;
use Google\Devtools\Resultstore\V2\GetFileTailResponse;
use Google\Protobuf\Any;
use Google\Rpc\Code;
use stdClass;

/**
 * @group resultstore
 * @group gapic
 */
class ResultStoreFileDownloadClientTest extends GeneratedTest
{
    /**
     * @return TransportInterface
     */
    private function createTransport($deserialize = null)
    {
        return new MockTransport($deserialize);
    }

    /**
     * @return ResultStoreFileDownloadClient
     */
    private function createClient(array $options = [])
    {
        $options += [
            'credentials' => $this->getMockBuilder(CredentialsWrapper::class)
                ->disableOriginalConstructor()
                ->getMock(),
        ];

        return new ResultStoreFileDownloadClient($options);
    }

    /**
     * @test
     */
    public function getFileTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $data = '-86';
        $expectedResponse = new GetFileResponse();
        $expectedResponse->setData($data);
        $transport->addResponse($expectedResponse);
        $data2 = '-35';
        $expectedResponse2 = new GetFileResponse();
        $expectedResponse2->setData($data2);
        $transport->addResponse($expectedResponse2);
        $data3 = '-34';
        $expectedResponse3 = new GetFileResponse();
        $expectedResponse3->setData($data3);
        $transport->addResponse($expectedResponse3);

        // Mock request
        $formattedUri = $client->fileName('[FILE]');

        $serverStream = $client->getFile($formattedUri);
        $this->assertInstanceOf(ServerStream::class, $serverStream);

        $responses = iterator_to_array($serverStream->readAll());

        $expectedResponses = [];
        $expectedResponses[] = $expectedResponse;
        $expectedResponses[] = $expectedResponse2;
        $expectedResponses[] = $expectedResponse3;
        $this->assertEquals($expectedResponses, $responses);

        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.resultstore.v2.ResultStoreFileDownload/GetFile', $actualFuncCall);

        $actualValue = $actualRequestObject->getUri();

        $this->assertProtobufEquals($formattedUri, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getFileExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);

        $transport->setStreamingStatus($status);

        $this->assertTrue($transport->isExhausted());

        // Mock request
        $formattedUri = $client->fileName('[FILE]');

        $serverStream = $client->getFile($formattedUri);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getFileTailTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $data = '-86';
        $expectedResponse = new GetFileTailResponse();
        $expectedResponse->setData($data);
        $transport->addResponse($expectedResponse);

        // Mock request
        $formattedUri = $client->tailName('[TAIL]');

        $response = $client->getFileTail($formattedUri);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.resultstore.v2.ResultStoreFileDownload/GetFileTail', $actualFuncCall);

        $actualValue = $actualRequestObject->getUri();

        $this->assertProtobufEquals($formattedUri, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getFileTailExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $formattedUri = $client->tailName('[TAIL]');

        try {
            $client->getFileTail($formattedUri);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }
}
