package com.p051vm.p062vo.invite;

import com.p051vm.p062vo.BaseResp;

/* renamed from: com.vm.vo.invite.CouponResp */
public class CouponResp extends BaseResp {
    private String activateStatus;
    private String activatedStatus;
    private String couponCode;

    public String getCouponCode() {
        return this.couponCode;
    }

    public void setCouponCode(String str) {
        this.couponCode = str;
    }

    public String getActivatedStatus() {
        return this.activatedStatus;
    }

    public void setActivatedStatus(String str) {
        this.activatedStatus = str;
    }

    public String getActivateStatus() {
        return this.activateStatus;
    }

    public void setActivateStatus(String str) {
        this.activateStatus = str;
    }
}
