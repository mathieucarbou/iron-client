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
package io.iron.ironworker.client.builders;

public class TaskOptions {
    public static TaskOptionsObject priority(int priority) {
        return (new TaskOptionsObject()).priority(priority);
    }

    public static TaskOptionsObject timeout(int timeout) {
        return (new TaskOptionsObject()).timeout(timeout);
    }

    public static TaskOptionsObject delay(int delay) {
        return (new TaskOptionsObject()).delay(delay);
    }

    protected TaskOptions() {
    }
}
