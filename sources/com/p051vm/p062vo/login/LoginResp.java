package com.p051vm.p062vo.login;

import java.io.Serializable;

/* renamed from: com.vm.vo.login.LoginResp */
public class LoginResp implements Serializable {
    private String authKey;
    private Long memberId;
    private String token;

    public Long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Long l) {
        this.memberId = l;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String str) {
        this.authKey = str;
    }

    public String toString() {
        return "LoginResp{memberId=" + this.memberId + ", token='" + this.token + '\'' + ", authKey='" + this.authKey + '\'' + '}';
    }
}
