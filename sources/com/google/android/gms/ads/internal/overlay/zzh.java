package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1805ye;

@C1598qn
final class zzh extends RelativeLayout {
    private C1805ye zzbue;
    boolean zzdro;

    public zzh(Context context, String str, String str2) {
        super(context);
        this.zzbue = new C1805ye(context, str);
        this.zzbue.mo13254b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdro) {
            return false;
        }
        this.zzbue.mo13250a(motionEvent);
        return false;
    }
}
