package com.p051vm.p062vo;

import java.io.Serializable;

/* renamed from: com.vm.vo.BaseResp */
public class BaseResp implements Serializable {
    private String msg;
    private Boolean success = true;

    public Boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
