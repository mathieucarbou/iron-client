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

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-02-12
 */
@RunWith(JUnit4)
class QueueTest {
/*

    IronClient client = new IronClient(
        endpoint: IronEndpoint.IRON_MQ_AWS_US_EAST,
        projectId: '52e7f05294cc4e0005000047',
        token: '4O09xkYfsHPOzY4xjUjlfGCOTR4'
    )
*/

    @Test
    void test() throws Exception {
        /*client.addQueue('test')

        client.addQueue('test2', new MQueueParameters(
            retries: 100,
            delay: 60,
            type: MQueueType.MULTICAST,
            errorQueue: 'err2',
            subscribers: [
                new Subscriber(
                    uri: 'http://qwerty',
                    headers: [
                        'Content-Type': 'application/json'
                    ]
                )
            ]
        ))

        MQueue testQueue = client.getQueue('test')
        println testQueue
        println testQueue.info
        println testQueue.parameters

        client.queues.each {
            println "$it\n$it.info\\n$it.parameters"
            it.delete()
        }*/
    }

}
