package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C0726R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.nd */
public final class C1507nd extends C1514nk {

    /* renamed from: a */
    private final Map<String, String> f5766a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f5767b;

    public C1507nd(afl afl, Map<String, String> map) {
        super(afl, "storePicture");
        this.f5766a = map;
        this.f5767b = afl.mo10174d();
    }

    /* renamed from: a */
    public final void mo12816a() {
        if (this.f5767b == null) {
            mo12828a("Activity context is not available");
            return;
        }
        zzbv.zzlf();
        if (!C1782xi.m8401f(this.f5767b).mo12487c()) {
            mo12828a("Feature is not supported by the device.");
            return;
        }
        String str = this.f5766a.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo12828a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            mo12828a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzbv.zzlf();
            if (!C1782xi.m8393c(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                mo12828a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources g = zzbv.zzlj().mo13127g();
            zzbv.zzlf();
            AlertDialog.Builder e = C1782xi.m8397e(this.f5767b);
            e.setTitle(g != null ? g.getString(C0726R.string.f658s1) : "Save image");
            e.setMessage(g != null ? g.getString(C0726R.string.f659s2) : "Allow Ad to store image in Picture gallery?");
            e.setPositiveButton(g != null ? g.getString(C0726R.string.f660s3) : C0008a.HEADER_ACCEPT, new C1508ne(this, str, lastPathSegment));
            e.setNegativeButton(g != null ? g.getString(C0726R.string.f661s4) : "Decline", new C1509nf(this));
            e.create().show();
        }
    }
}
