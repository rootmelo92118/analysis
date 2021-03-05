package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.yo */
public final class C1815yo extends C1374if {

    /* renamed from: a */
    private final Context f6899a;

    /* renamed from: a */
    public static bpl m8519a(Context context) {
        bpl bpl = new bpl(new C1458li(new File(context.getCacheDir(), "admob_volley"), 20971520), new C1815yo(context, new C1615rd()));
        bpl.mo12291a();
        return bpl;
    }

    private C1815yo(Context context, C1587qc qcVar) {
        super(qcVar);
        this.f6899a = context;
    }

    /* renamed from: a */
    public final bjj mo11892a(blj<?> blj) {
        if (blj.mo12126i() && blj.mo12118c() == 0) {
            if (Pattern.matches((String) bre.m6321e().mo12778a(C1557p.f6029ce), blj.mo12122e())) {
                bre.m6317a();
                if (C1851zx.m8599c(this.f6899a, 13400000)) {
                    bjj a = new C1283ew(this.f6899a).mo11892a(blj);
                    if (a != null) {
                        String valueOf = String.valueOf(blj.mo12122e());
                        C1772wz.m8287a(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a;
                    }
                    String valueOf2 = String.valueOf(blj.mo12122e());
                    C1772wz.m8287a(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo11892a(blj);
    }
}
