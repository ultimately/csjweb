package com.csj.csjweb.util;

import com.csj.csjweb.config.BaseRequest;

import java.util.Date;

public class SmsMessageRequest extends BaseRequest{

    private String sendNO;

    private Date sendTime;

    private String SmsBody;

    private String SimFingerprint;

    public String getSendNO() {
        return sendNO;
    }

    public void setSendNO(String sendNO) {
        this.sendNO = sendNO;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSmsBody() {
        return SmsBody;
    }

    public void setSmsBody(String smsBody) {
        SmsBody = smsBody;
    }

    public String getSimFingerprint() {
        return SimFingerprint;
    }

    public void setSimFingerprint(String simFingerprint) {
        SimFingerprint = simFingerprint;
    }
}
