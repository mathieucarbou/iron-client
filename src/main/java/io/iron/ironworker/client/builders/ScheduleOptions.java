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

import java.util.Date;

public class ScheduleOptions {
    public static ScheduleOptionsObject priority(int priority) {
        return (new ScheduleOptionsObject()).priority(priority);
    }

    public static ScheduleOptionsObject startAt(Date startAt) {
        return (new ScheduleOptionsObject()).startAt(startAt);
    }

    public static ScheduleOptionsObject endAt(Date endAt) {
        return (new ScheduleOptionsObject()).endAt(endAt);
    }

    public static ScheduleOptionsObject delay(int delay) {
        return (new ScheduleOptionsObject()).delay(delay);
    }

    public static ScheduleOptionsObject runEvery(int runEvery) {
        return (new ScheduleOptionsObject()).runEvery(runEvery);
    }

    public static ScheduleOptionsObject runTimes(int runTimes) {
        return (new ScheduleOptionsObject()).runTimes(runTimes);
    }

    protected ScheduleOptions() {
    }
}
