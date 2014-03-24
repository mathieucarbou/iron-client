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

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-02-11
 */
class Message {

    MQueue queue

    String id

    /**
     * The message data
     */
    String body

    /**
     * After timeout (in seconds), item will be placed back onto queue. You must delete the message from the queue to ensure it does not go back onto the queue. Default is 60 seconds. Minimum is 30 seconds, and maximum is 86,400 seconds (24 hours).
     */
    long timeout = 60

    /**
     * The item will not be available on the queue until this many seconds have passed. Default is 0 seconds. Maximum is 604,800 seconds (7 days).
     */
    long delay = 0

    /**
     * How long in seconds to keep the item on the queue before it is deleted. Default is 604,800 seconds (7 days). Maximum is 2,592,000 seconds (30 days).
     */
    long expiration = 604800

    int reservedCount

    int retriesRemaining

    /**
     * Releasing a reserved message unreserves the message and puts it back on the queue as if the message had timed out.
     *
     * @param delay The item will not be available on the queue until this many seconds have passed. Default is 0 seconds. Maximum is 604,800 seconds (7 days).
     */
    void release(long delay = 0) {
        // POST /projects/{Project ID}/queues/{Queue Name}/messages/{Message ID}/release
    }

    /**
     * Touching a reserved message extends its timeout to the duration specified when the message was created. Default is 60 seconds.
     */
    void touch() {
        // POST /projects/{Project ID}/queues/{Queue Name}/messages/{Message ID}/touch
    }

    /**
     * This call will delete the message. Be sure you call this after you're done with a message or it will be placed back on the queue.
     */
    void delete() {
        queue.deleteMessages([id])
    }

    /**
     * Get Push Status for a Message
     * You can retrieve the push status for a particular message which will let you know which subscribers have received the message, which have failed, how many times it's tried to be delivered and the status code returned from the endpoint.
     */
    Collection<PushStatus> getPushStatus() {
        // GET /projects/{Project ID}/queues/{Queue Name}/messages/{Message ID}/subscribers
    }

}
