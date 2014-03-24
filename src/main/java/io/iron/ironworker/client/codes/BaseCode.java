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
package io.iron.ironworker.client.codes;

public class BaseCode {
    private String name;
    private String file;
    private String runtime;
    private String runner;

    public BaseCode(String name, String file, String runtime, String runner) {
        this.name = name;
        this.file = file;
        this.runtime = runtime;
        this.runner = runner;
    }

    public String getName() {
        return name;
    }

    public String getFile() {
        return file;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getRunner() {
        return runner;
    }
}
