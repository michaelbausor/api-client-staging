<?php

return [
    'interfaces' => [
        'google.devtools.resultstore.v2.ResultStoreFileDownload' => [
            'GetFileTail' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{uri=file/tail/*}',
                'placeholders' => [
                    'uri' => [
                        'getters' => [
                            'getUri',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
