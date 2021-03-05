package com.p051vm.p062vo.user;

import java.io.Serializable;

/* renamed from: com.vm.vo.user.UserInfoResp */
public class UserInfoResp implements Serializable {
    private long memberId;
    private Integer memberType;

    public long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(long j) {
        this.memberId = j;
    }

    public Integer getMemberType() {
        return this.memberType;
    }

    public void setMemberType(Integer num) {
        this.memberType = num;
    }
}
