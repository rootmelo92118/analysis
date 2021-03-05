package com.p051vm.p062vo.feedback;

import java.io.Serializable;

/* renamed from: com.vm.vo.feedback.FeedbackConnectResp */
public class FeedbackConnectResp implements Serializable {
    private Boolean connect;
    private String proxyIp;

    public Boolean getConnect() {
        return this.connect;
    }

    public void setConnect(Boolean bool) {
        this.connect = bool;
    }

    public String getProxyIp() {
        return this.proxyIp;
    }

    public void setProxyIp(String str) {
        this.proxyIp = str;
    }

    public String toString() {
        return "FeedbackConnectResp{connect=" + this.connect + ", proxyIp='" + this.proxyIp + '\'' + '}';
    }
}
