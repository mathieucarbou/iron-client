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

import com.mycila.iron.client.IronClient

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-02-11
 */
class MQueue {

    String name
    IronClient client

    @Override
    String toString() { "ironmq://${client.projectId}:${client.token}@${client.endpoint.host}:${client.endpoint.port}/${name}" }

    int size() { info.size }

    /**
     * This call deletes a message queue and all its messages.
     */
    void delete() { client.deleteQueue(name) }

    /**
     * This call deletes all messages on a queue, whether they are reserved or not.
     */
    void clear() {
        // POST /projects/{Project ID}/queues/{Queue Name}/clear
    }

    /**
     * This call gets general information about the queue.
     */
    MQueueInfo getInfo() {
        // GET /projects/{Project ID}/queues/{Queue Name}
    }

    /**
     * This call gets general information about the queue.
     */
    MQueueParameters getParameters() {
        // GET /projects/{Project ID}/queues/{Queue Name}
    }

    /**
     * * This allows you to change the properties of a queue including setting subscribers and the push type if you want it to be a push queue.
     */
    void setParameters(MQueueParameters parameters) {
        client.addQueue(name, parameters)
    }

    /**
     * Add subscribers (HTTP endpoints) to a queue. This is for Push Queues only.
     */
    void addSubscribers(Collection<Subscriber> subscribers) {
        // POST /projects/{Project ID}/queues/{Queue Name}/subscribers
    }

    /**
     * Remove subscriber from a queue. This is for Push Queues only.
     */
    void removeSubscribers(Collection<String> subscriberUris) {
        // DELETE /projects/{Project ID}/queues/{Queue Name}/subscribers
    }

    /**
     * This call adds or pushes messages onto the queue.
     */
    void offer(Collection<Message> message) {
        // POST /projects/{Project ID}/queues/{Queue Name}/messages
        // set ids back
    }

    void offer(Message message) { offer([message]) }

    /**
     * This call gets/reserves messages from the queue. The messages will not be deleted, but will be reserved until the timeout expires. If the timeout expires before the messages are deleted, the messages will be placed back onto the queue. As a result, be sure to delete the messages after you're done with them.
     *
     * @param max The maximum number of messages to get. Default is 1. Maximum is 100. Note: You may not receive all n messages on every request, the more sparse the queue, the less likely you are to receive all n messages.
     * @param timeout After timeout (in seconds), item will be placed back onto queue. You must delete the message from the queue to ensure it does not go back onto the queue. If not set, value from POST is used. Default is 60 seconds, minimum is 30 seconds, and maximum is 86,400 seconds (24 hours).
     */
    Collection<Message> getMessages(int max = 1, timeout = 60) {
        // GET /projects/{Project ID}/queues/{Queue Name}/messages
    }

    Message get(long timeout = 60) throws NoSuchElementException {
        return getMessages(1, timeout).iterator().next()
    }

    /**
     * Peeking at a queue returns the next messages on the queue, but it does not reserve them.
     *
     * @param max The maximum number of messages to peek. Default is 1. Maximum is 100. Note: You may not receive all n messages on every request, the more sparse the queue, the less likely you are to receive all n messages.
     */
    Collection<Message> peekMessages(int max = 1) {
        // GET /projects/{Project ID}/queues/{Queue Name}/messages/peek
    }

    Message peek() {
        try {
            return peekMessages(1).iterator().next()
        } catch (NoSuchElementException ignored) {
            return null
        }
    }

    /**
     * Get a message by ID.
     */
    Message getMessage(String id) {
        // GET /projects/{Project ID}/queues/{Queue Name}/messages/{Message ID}
    }

    /**
     * This call will delete multiple messages in one call.
     */
    void deleteMessages(Collection<String> messageIds) {
        // DELETE /projects/{Project ID}/queues/{Queue Name}/messages
    }

    /**
     * Acknowledge / Delete Push Message for a Subscriber
     * This is only for use with long running processes that have previously returned a 202. Read Push Queues page for more information on Long Running Processes
     */
    void ack(String messageId, String subscriberId) {
        // ELETE /projects/{Project ID}/queues/{Queue Name}/messages/{Message ID}/subscribers/{Subscriber ID}
    }


}
