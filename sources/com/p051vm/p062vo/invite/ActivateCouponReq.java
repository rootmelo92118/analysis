package com.p051vm.p062vo.invite;

import com.p051vm.p058f.C2521a;
import com.p051vm.p062vo.BaseReq;

/* renamed from: com.vm.vo.invite.ActivateCouponReq */
public class ActivateCouponReq extends BaseReq {
    private String couponCode;

    public ActivateCouponReq(C2521a.C2522a aVar, String str) {
        super(aVar);
        this.couponCode = str;
    }

    public String getCouponCode() {
        return this.couponCode;
    }

    public void setCouponCode(String str) {
        this.couponCode = str;
    }
}
