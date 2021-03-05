package com.google.android.gms.internal.ads;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.va */
public class C1720va extends blj<String> {

    /* renamed from: a */
    private final Object f6624a = new Object();
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: b */
    private btl<String> f6625b;

    public C1720va(int i, String str, btl<String> btl, @Nullable bsl bsl) {
        super(i, str, bsl);
        this.f6625b = btl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12114a(String str) {
        btl<String> btl;
        synchronized (this.f6624a) {
            btl = this.f6625b;
        }
        if (btl != null) {
            btl.mo12424a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final brk<String> mo12110a(bjj bjj) {
        String str;
        try {
            byte[] bArr = bjj.f4461b;
            String str2 = "ISO-8859-1";
            String str3 = bjj.f4462c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bjj.f4461b);
        }
        return brk.m6331a(str, C1531oa.m7694a(bjj));
    }
}
