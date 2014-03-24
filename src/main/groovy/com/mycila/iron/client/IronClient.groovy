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

import com.mycila.hc.HttpClient
import com.mycila.iron.client.mq.MQueue
import com.mycila.iron.client.mq.MQueueNotFoundException
import com.mycila.iron.client.mq.MQueueParameters

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-02-11
 */
class IronClient {

    HttpClient httpClient = HttpClient.newBuilder().build()
    IronEndpoint endpoint
    String projectId
    String token

    @Override
    String toString() { "${endpoint.scheme}://${projectId}:${token}@${endpoint.host}:${endpoint.port}/${endpoint.version}" }

    /**
     * Get a list of all queues in a project. By default, 30 queues are listed at a time. To see more, use the page parameter or the per_page parameter. Up to 100 queues may be listed on a single page.
     */
    Collection<MQueue> getQueues(int page = 0, int count = 30) {
        // GET /projects/{Project ID}/queues
    }

    MQueue getQueue(String name) throws MQueueNotFoundException {
        // GET /projects/{Project ID}/queues/{Queue Name}
    }

    /**
     * Create or update a message queue
     * This allows you to change the properties of a queue including setting subscribers and the push type if you want it to be a push queue.
     */
    MQueue addQueue(String name, MQueueParameters parameters = null) {
        // POST /projects/{Project ID}/queues/{Queue Name}

    }

    /**
     * This call deletes a message queue and all its messages.
     */
    void deleteQueue(String name) {
        // DELETE /projects/{Project ID}/queues/{Queue Name}
    }

}
