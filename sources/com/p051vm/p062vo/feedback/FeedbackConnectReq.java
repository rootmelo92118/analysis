package com.p051vm.p062vo.feedback;

import com.p051vm.p058f.C2521a;
import com.p051vm.p062vo.BaseReq;

/* renamed from: com.vm.vo.feedback.FeedbackConnectReq */
public class FeedbackConnectReq extends BaseReq {
    private String destIp;

    public String getDestIp() {
        return this.destIp;
    }

    public void setDestIp(String str) {
        this.destIp = str;
    }

    public FeedbackConnectReq(C2521a.C2522a aVar, String str) {
        super(aVar);
        this.destIp = str;
    }
}
