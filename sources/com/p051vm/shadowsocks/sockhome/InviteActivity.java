package com.p051vm.shadowsocks.sockhome;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.p037v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.p051vm.p059g.C2523a;
import com.p051vm.p062vo.invite.CouponResp;

/* renamed from: com.vm.shadowsocks.sockhome.InviteActivity */
public class InviteActivity extends AppCompatActivity {
    private final int ACTIVATE_COUPON = 1;
    private final int GET_COUPON = 1;
    /* access modifiers changed from: private */
    public CouponResp couponResp;
    private Handler handler = new Handler() {
        public void handleMessage(Message message) {
            if (message.what == 1) {
                CouponResp unused = InviteActivity.this.couponResp = (CouponResp) message.obj;
                if (InviteActivity.this.couponResp == null) {
                    InviteActivity.this.invitationCode.setText(C2545R.string.invite_code_not_avalaible);
                } else {
                    InviteActivity.this.invitationCode.setText(InviteActivity.this.couponResp.getCouponCode());
                }
            }
            super.handleMessage(message);
        }
    };
    /* access modifiers changed from: private */
    public TextView invitationCode;

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2545R.layout.activity_invite);
        this.invitationCode = (TextView) findViewById(C2545R.C2547id.tv_invitation_code);
        this.invitationCode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String charSequence = InviteActivity.this.invitationCode.getText().toString();
                ClipboardManager clipboardManager = (ClipboardManager) InviteActivity.this.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText("label", charSequence);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                    if ("邀请码暂时获取不到!".equals(charSequence) || "Invite code is not avalible!Retry later!".equals(charSequence)) {
                        Toast.makeText(InviteActivity.this, C2545R.string.invite_code_not_avalaible, 1).show();
                    } else {
                        Toast.makeText(InviteActivity.this, C2545R.string.tips_invitecode_copy, 1).show();
                    }
                }
            }
        });
        C2523a.m11856b(this, this.handler, 1);
    }
}
