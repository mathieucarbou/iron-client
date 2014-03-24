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
package io.iron.ironmq;

import java.io.IOException;

/**
 * The HTTPException class represents an HTTP response status that is not 200 OK.
 */
public class HTTPException extends IOException {
    private int status;

    /**
    * Creates a new HTTPException.
    *
    * @param status The HTTP status code.
    * @param message The text of the HTTP status code.
    */
    public HTTPException(int status, String message) {
        super(message);
        this.status = status;
    }

    /**
    * Returns the HTTP response's status code.
    */
    public int getStatusCode() { return this.status; }
}
