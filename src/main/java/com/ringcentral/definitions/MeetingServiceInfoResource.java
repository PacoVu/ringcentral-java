package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingServiceInfoResource
{
    //
    public String uri;
    public MeetingServiceInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String supportUri;
    public MeetingServiceInfoResource supportUri(String supportUri) {
        this.supportUri = supportUri;
        return this;
    }
    //
    public String intlDialInNumbersUri;
    public MeetingServiceInfoResource intlDialInNumbersUri(String intlDialInNumbersUri) {
        this.intlDialInNumbersUri = intlDialInNumbersUri;
        return this;
    }
    //
    public MeetingExternalUserInfoResource externalUserInfo;
    public MeetingServiceInfoResource externalUserInfo(MeetingExternalUserInfoResource externalUserInfo) {
        this.externalUserInfo = externalUserInfo;
        return this;
    }
    //
    public DialInNumberResource[] dialInNumbers;
    public MeetingServiceInfoResource dialInNumbers(DialInNumberResource[] dialInNumbers) {
        this.dialInNumbers = dialInNumbers;
        return this;
    }
}
