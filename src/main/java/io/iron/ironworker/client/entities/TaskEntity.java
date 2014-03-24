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
package io.iron.ironworker.client.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class TaskEntity extends BaseEntity {
    @SerializedName("id")
    String id;
    @SerializedName("project_id")
    String projectId;
    @SerializedName("code_id")
    String codeId;
    @SerializedName("code_name")
    String codeName;
    @SerializedName("priority")
    int priority;
    @SerializedName("timeout")
    int timeout;
    @SerializedName("status")
    String status;
    @SerializedName("start_time")
    String startTime;
    @SerializedName("end_time")
    String endTime;
    @SerializedName("duration")
    int duration;
    @SerializedName("run_times")
    int runTimes;
    @SerializedName("payload")
    String payload;
    @SerializedName("percent")
    int percent;
    @SerializedName("msg")
    String msg;
    @SerializedName("created_at")
    String createdAt;
    @SerializedName("updated_at")
    String updatedAt;

    protected TaskEntity() {
    }

    public String getId() {
        return id;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getCodeId() {
        return codeId;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getPriority() {
        return priority;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getStatus() {
        return status;
    }

    public Date getStartTime() {
        return parseDate(startTime);
    }

    public Date getEndTime() {
        return parseDate(endTime);
    }

    public int getDuration() {
        return duration;
    }

    public int getRunTimes() {
        return runTimes;
    }

    public String getPayload() {
        return payload;
    }

    public int getPercent() {
        return percent;
    }

    public String getMsg() {
        return msg;
    }

    public Date getCreatedAt() {
        return parseDate(createdAt);
    }

    public Date getUpdatedAt() {
        return parseDate(updatedAt);
    }
}
