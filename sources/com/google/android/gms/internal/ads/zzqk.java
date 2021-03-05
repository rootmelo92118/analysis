package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
public final class zzqk extends Surface {

    /* renamed from: a */
    private static boolean f7255a;

    /* renamed from: b */
    private static boolean f7256b;

    /* renamed from: c */
    private final boolean f7257c;

    /* renamed from: d */
    private final bkv f7258d;

    /* renamed from: e */
    private boolean f7259e;

    /* renamed from: a */
    public static synchronized boolean m8821a(Context context) {
        boolean z;
        synchronized (zzqk.class) {
            if (!f7256b) {
                if (bkp.f4570a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(bkp.f4570a == 24 && (bkp.f4573d.startsWith("SM-G950") || bkp.f4573d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f7255a = z2;
                }
                f7256b = true;
            }
            z = f7255a;
        }
        return z;
    }

    /* renamed from: a */
    public static zzqk m8820a(Context context, boolean z) {
        if (bkp.f4570a >= 17) {
            bjy.m5691b(!z || m8821a(context));
            return new bkv().mo12083a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    private zzqk(bkv bkv, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f7258d = bkv;
        this.f7257c = z;
    }

    public final void release() {
        super.release();
        synchronized (this.f7258d) {
            if (!this.f7259e) {
                this.f7258d.mo12084a();
                this.f7259e = true;
            }
        }
    }
}
