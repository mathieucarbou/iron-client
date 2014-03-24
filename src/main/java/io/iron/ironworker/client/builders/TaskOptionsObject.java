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

import java.util.HashMap;
import java.util.Map;

public class TaskOptionsObject {
    private Map<String, Object> options;

    public TaskOptionsObject() {
        options = new HashMap<String, Object>();
    }

    public TaskOptionsObject priority(int priority) {
        options.put("priority", priority);

        return this;
    }

    public TaskOptionsObject timeout(int timeout) {
        options.put("timeout", timeout);

        return this;
    }

    public TaskOptionsObject delay(int delay) {
        options.put("delay", delay);

        return this;
    }

    public Map<String, Object> create() {
        return options;
    }
}
