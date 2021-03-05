package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
@C1598qn
public abstract class zzbdi extends TextureView implements adh {

    /* renamed from: a */
    protected final acv f7156a = new acv();

    /* renamed from: b */
    protected final adg f7157b;

    public zzbdi(Context context) {
        super(context);
        this.f7157b = new adg(context, this);
    }

    /* renamed from: a */
    public abstract String mo13325a();

    /* renamed from: a */
    public abstract void mo13326a(float f, float f2);

    /* renamed from: a */
    public abstract void mo13327a(int i);

    /* renamed from: a */
    public abstract void mo13328a(acm acm);

    /* renamed from: b */
    public abstract void mo13329b();

    /* renamed from: c */
    public abstract void mo13331c();

    /* renamed from: c */
    public void mo13351c(int i) {
    }

    /* renamed from: d */
    public abstract void mo13332d();

    /* renamed from: d */
    public void mo13352d(int i) {
    }

    /* renamed from: e */
    public abstract void mo10200e();

    /* renamed from: e */
    public void mo13353e(int i) {
    }

    /* renamed from: f */
    public void mo13354f(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
