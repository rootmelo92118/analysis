package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.annotation.Nullable;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.yu */
public final class C1821yu {

    /* renamed from: a */
    private static bpl f6913a;

    /* renamed from: b */
    private static final Object f6914b = new Object();
    @Deprecated

    /* renamed from: c */
    private static final C1828za<Void> f6915c = new C1822yv();

    public C1821yu(Context context) {
        m8530a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    @Deprecated
    /* renamed from: a */
    public final <T> abg<T> mo13280a(String str, C1828za<T> zaVar) {
        abq abq = new abq();
        f6913a.mo12290a(new C1832ze(str, abq));
        return aau.m1650a(aau.m1649a(abq, new C1824yx(this, zaVar), (Executor) C1780xg.f6833a), Throwable.class, new C1823yw(this, zaVar), abl.f1314b);
    }

    /* renamed from: a */
    public final abg<String> mo13279a(int i, String str, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        String str2 = str;
        C1829zb zbVar = new C1829zb((C1822yv) null);
        C1825yy yyVar = new C1825yy(this, str2, zbVar);
        aab aab = new aab((String) null);
        C1826yz yzVar = new C1826yz(this, i, str, zbVar, yyVar, bArr, map, aab);
        if (aab.m1602c()) {
            try {
                aab.mo10029a(str2, "GET", yzVar.mo12116b(), yzVar.mo12115a());
            } catch (C1015a e) {
                C1772wz.m1630e(e.getMessage());
            }
        }
        f6913a.mo12290a(yzVar);
        return zbVar;
    }

    /* renamed from: a */
    public final abg<String> mo13281a(String str, Map<String, String> map) {
        return mo13279a(0, str, map, (byte[]) null);
    }

    /* renamed from: a */
    private static bpl m8530a(Context context) {
        bpl bpl;
        bpl bpl2;
        synchronized (f6914b) {
            if (f6913a == null) {
                C1557p.m7741a(context);
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f6028cd)).booleanValue()) {
                    bpl2 = C1815yo.m8519a(context);
                } else {
                    bpl2 = new bpl(new C1458li(new File(context.getCacheDir(), "volley")), new C1374if((C1346he) new C1615rd()));
                    bpl2.mo12291a();
                }
                f6913a = bpl2;
            }
            bpl = f6913a;
        }
        return bpl;
    }
}
