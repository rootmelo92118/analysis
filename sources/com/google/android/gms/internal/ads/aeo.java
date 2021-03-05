package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.api.C0797h;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public abstract class aeo implements C0797h {

    /* renamed from: a */
    protected Context f1524a;

    /* renamed from: b */
    protected String f1525b;

    /* renamed from: c */
    protected WeakReference<adc> f1526c;

    public aeo(adc adc) {
        this.f1524a = adc.getContext();
        this.f1525b = zzbv.zzlf().mo13207b(this.f1524a, adc.mo10180i().f7135a);
        this.f1526c = new WeakReference<>(adc);
    }

    /* renamed from: a */
    public void mo9592a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10288a(int i) {
    }

    /* renamed from: a */
    public abstract boolean mo10293a(String str);

    /* renamed from: b */
    public abstract void mo10295b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10296c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10297d(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo10298e(int i) {
    }

    /* renamed from: a */
    public final void mo10291a(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        C1851zx.f6962a.post(new aeq(this, str, str2, j, j2, z, i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10289a(String str, String str2, int i) {
        C1851zx.f6962a.post(new aer(this, str, str2, i));
    }

    /* renamed from: a */
    public final void mo10290a(String str, String str2, long j) {
        C1851zx.f6962a.post(new aes(this, str, str2, j));
    }

    /* renamed from: a */
    public final void mo10292a(String str, String str2, String str3, @Nullable String str4) {
        C1851zx.f6962a.post(new aet(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo10294b(String str) {
        bre.m6317a();
        return C1851zx.m8585a(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1878c(java.lang.String r2) {
        /*
            java.lang.String r0 = "internal"
            int r1 = r2.hashCode()
            switch(r1) {
                case -1947652542: goto L_0x007f;
                case -1396664534: goto L_0x0074;
                case -1347010958: goto L_0x006a;
                case -918817863: goto L_0x005f;
                case -659376217: goto L_0x0055;
                case -642208130: goto L_0x004b;
                case -354048396: goto L_0x0040;
                case -32082395: goto L_0x0035;
                case 3387234: goto L_0x002b;
                case 96784904: goto L_0x0021;
                case 580119100: goto L_0x0016;
                case 725497484: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0089
        L_0x000b:
            java.lang.String r1 = "noCacheDir"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 7
            goto L_0x008a
        L_0x0016:
            java.lang.String r1 = "expireFailed"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 6
            goto L_0x008a
        L_0x0021:
            java.lang.String r1 = "error"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x002b:
            java.lang.String r1 = "noop"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 4
            goto L_0x008a
        L_0x0035:
            java.lang.String r1 = "externalAbort"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 10
            goto L_0x008a
        L_0x0040:
            java.lang.String r1 = "sizeExceeded"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 11
            goto L_0x008a
        L_0x004b:
            java.lang.String r1 = "playerFailed"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 5
            goto L_0x008a
        L_0x0055:
            java.lang.String r1 = "contentLengthMissing"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 0
            goto L_0x008a
        L_0x005f:
            java.lang.String r1 = "downloadTimeout"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 9
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = "inProgress"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 2
            goto L_0x008a
        L_0x0074:
            java.lang.String r1 = "badUrl"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 8
            goto L_0x008a
        L_0x007f:
            java.lang.String r1 = "interrupted"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 3
            goto L_0x008a
        L_0x0089:
            r2 = -1
        L_0x008a:
            switch(r2) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0097;
                case 2: goto L_0x0097;
                case 3: goto L_0x0097;
                case 4: goto L_0x0097;
                case 5: goto L_0x0097;
                case 6: goto L_0x0094;
                case 7: goto L_0x0094;
                case 8: goto L_0x0091;
                case 9: goto L_0x0091;
                case 10: goto L_0x008e;
                case 11: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0099
        L_0x008e:
            java.lang.String r0 = "policy"
            goto L_0x0099
        L_0x0091:
            java.lang.String r0 = "network"
            goto L_0x0099
        L_0x0094:
            java.lang.String r0 = "io"
            goto L_0x0099
        L_0x0097:
            java.lang.String r0 = "internal"
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aeo.m1878c(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m1877a(String str, Map<String, String> map) {
        adc adc = (adc) this.f1526c.get();
        if (adc != null) {
            adc.mo10443a(str, (Map<String, ?>) map);
        }
    }
}
