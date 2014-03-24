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
package com.mycila.iron.client.mq

import groovy.transform.ToString

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-02-12
 */
@ToString
class MQueueParameters {
    /**
     * How many times to retry on failure. Default is 3. Maximum is 100.
     */
    int retries = 3

    /**
     * Delay between each retry in seconds. Default is 60.
     */
    long delay = 60

    /**
     * Either multicast to push to all subscribers or unicast to push to one and only one subscriber. Default is multicast. To revert push queue to reqular pull queue set pull.
     */
    MQueueType type = MQueueType.PULL

    /**
     * The name of another queue where information about messages that can't be delivered after retrying retries number of times will be placed. Pass in an empty string to disable error queues. Default is disabled. See Push Queues to learn more.
     */
    String errorQueue

    /**
     * An array of subscriber hashes containing a required "url" field and an optional "headers" map for custom headers. This set of subscribers will replace the existing subscribers. See Push Queues to learn more about types of subscribers. To add or remove subscribers, see the add subscribers endpoint or the remove subscribers endpoint. The maximum is 64kb for JSON array of subscribers' hashes. See below for example JSON.
     */
    Collection<Subscriber> subscribers = []
}
