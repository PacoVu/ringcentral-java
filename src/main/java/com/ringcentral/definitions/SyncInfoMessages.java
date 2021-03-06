package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SyncInfoMessages
{
    // Type of synchronization
    public String syncType;
    public SyncInfoMessages syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    // Synchronization token
    public String syncToken;
    public SyncInfoMessages syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
    // Last synchronization datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String syncTime;
    public SyncInfoMessages syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
}
