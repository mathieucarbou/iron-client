/**
 * Copyright (C) 2013 Mycila (mathieu@mycila.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycila.iron.client

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-02-12
 */
class IronEndpoint {

    static final IronEndpoint IRON_MQ_AWS_US_EAST = new IronEndpoint(
        host: 'mq-aws-us-east-1.iron.io',
        version: '1'
    )

    static final IronEndpoint IRON_MQ_AWS_EU_WEST = new IronEndpoint(
        host: 'mq-aws-eu-west-1.iron.io',
        version: '1'
    )

    static final IronEndpoint IRON_MQ_RACKSPACE_ORD = new IronEndpoint(
        host: 'mq-rackspace-ord.iron.io',
        version: '1'
    )

    static final IronEndpoint IRON_MQ_RACKSPACE_LON = new IronEndpoint(
        host: 'mq-rackspace-lon.iron.io',
        version: '1'
    )

    static final IronEndpoint IRON_WORKER_AWS_US_EAST = new IronEndpoint(
        host: 'worker-aws-us-east-1',
        version: '2'
    )

    String host
    String version
    int port = 443
    String scheme = 'https'

    @Override
    String toString() { baseUrl }

    String getBaseUrl() { "${scheme}://${host}:${port}/${version}" }

}
