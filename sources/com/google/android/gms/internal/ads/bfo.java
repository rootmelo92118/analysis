package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

final class bfo {

    /* renamed from: a */
    private final bcg[] f4112a;

    /* renamed from: b */
    private final bcj f4113b;

    /* renamed from: c */
    private bcg f4114c;

    public bfo(bcg[] bcgArr, bcj bcj) {
        this.f4112a = bcgArr;
        this.f4113b = bcj;
    }

    /* renamed from: a */
    public final bcg mo11843a(bci bci, Uri uri) {
        if (this.f4114c != null) {
            return this.f4114c;
        }
        bcg[] bcgArr = this.f4112a;
        int length = bcgArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            bcg bcg = bcgArr[i];
            try {
                if (bcg.mo11686a(bci)) {
                    this.f4114c = bcg;
                    bci.mo11671a();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                bci.mo11671a();
            }
        }
        if (this.f4114c != null) {
            this.f4114c.mo11685a(this.f4113b);
            return this.f4114c;
        }
        String a = bkp.m5815a((Object[]) this.f4112a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a);
        sb.append(") could read the stream.");
        throw new bgi(sb.toString(), uri);
    }

    /* renamed from: a */
    public final void mo11844a() {
        if (this.f4114c != null) {
            this.f4114c.mo11687c();
            this.f4114c = null;
        }
    }
}
