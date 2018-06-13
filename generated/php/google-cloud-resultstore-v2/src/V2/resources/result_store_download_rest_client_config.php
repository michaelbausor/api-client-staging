<?php

return [
    'interfaces' => [
        'google.devtools.resultstore.v2.ResultStoreDownload' => [
            'GetInvocation' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=invocations/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'SearchInvocations' => [
                'method' => 'get',
                'uriTemplate' => '/v2/invocations:search',
            ],
            'GetConfiguration' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=invocations/*/configs/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListConfigurations' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{parent=invocations/*}/configs',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'GetTarget' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=invocations/*/targets/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListTargets' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{parent=invocations/*}/targets',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'GetConfiguredTarget' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=invocations/*/targets/*/configuredTargets/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListConfiguredTargets' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{parent=invocations/*/targets/*}/configuredTargets',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'GetAction' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=invocations/*/targets/*/configuredTargets/*/actions/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListActions' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{parent=invocations/*/targets/*/configuredTargets/*}/actions',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'GetFileSet' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=invocations/*/fileSets/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListFileSets' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{parent=invocations/*}/fileSets',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
