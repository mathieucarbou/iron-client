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

import io.iron.ironworker.client.APIException;

import java.util.HashMap;
import java.util.Map;

public class Params {
    public static Map<String, Object> create(Object... os) throws APIException {
        if (os.length % 2 != 0) {
            throw new APIException("Odd params number", null);
        }

        Map<String, Object> params = new HashMap<String, Object>();

        for (int i = 0; i < os.length; i += 2) {
            params.put(os[i].toString(), os[i + 1]);
        }

        return params;
    }

    public static ParamsObject add(String key, Object value) {
        return (new ParamsObject()).add(key, value);
    }

    protected Params() {
    }
}
