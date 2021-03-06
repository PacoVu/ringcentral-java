package com.ringcentral.definitions;

public class ExtensionInfo_Request_StatusInfo {
    // Required extension status
    public String status;
    // Extension status information, only for the 'Disabled' status
    public StatusInfo statusInfo;

    public ExtensionInfo_Request_StatusInfo status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionInfo_Request_StatusInfo statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
}
