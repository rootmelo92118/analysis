package com.p051vm.constants;

import com.p051vm.shadowsocks.sockhome.C2545R;

/* renamed from: com.vm.constants.MemberType */
public enum MemberType {
    MEMBER_COMMON_VIP(2, C2545R.string.member_common_type),
    MEMBER_TEMPERORY_VIP(3, C2545R.string.member_trial_type),
    MEMBER_PERMANENT_VIP(4, C2545R.string.member_vip_type);
    
    private int msgId;
    private int type;

    private MemberType(int i, int i2) {
        this.type = i;
        this.msgId = i2;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getMsgId() {
        return this.msgId;
    }

    public void setMsgId(int i) {
        this.msgId = i;
    }

    public static MemberType getMemberType(int i) {
        for (MemberType memberType : values()) {
            if (memberType.getType() == i) {
                return memberType;
            }
        }
        return null;
    }
}
