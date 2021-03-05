package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;

@TargetApi(9)
/* renamed from: com.google.android.gms.internal.ads.xs */
public class C1792xs extends C1790xq {
    public C1792xs() {
        super();
    }

    /* renamed from: a */
    public final int mo13222a() {
        return 6;
    }

    /* renamed from: b */
    public final int mo13235b() {
        return 7;
    }

    /* renamed from: a */
    public boolean mo13231a(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }
}
