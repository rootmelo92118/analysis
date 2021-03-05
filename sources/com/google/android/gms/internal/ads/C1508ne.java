package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.ne */
final class C1508ne implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ String f5768a;

    /* renamed from: b */
    private final /* synthetic */ String f5769b;

    /* renamed from: c */
    private final /* synthetic */ C1507nd f5770c;

    C1508ne(C1507nd ndVar, String str, String str2) {
        this.f5770c = ndVar;
        this.f5768a = str;
        this.f5769b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f5770c.f5767b.getSystemService("download");
        try {
            String str = this.f5768a;
            String str2 = this.f5769b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzbv.zzlh().mo13231a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f5770c.mo12828a("Could not store picture.");
        }
    }
}
