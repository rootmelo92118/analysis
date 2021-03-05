package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C0979o;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.pe */
final class C1562pe implements C1828za<C1085at> {

    /* renamed from: a */
    private final /* synthetic */ boolean f6167a;

    /* renamed from: b */
    private final /* synthetic */ double f6168b;

    /* renamed from: c */
    private final /* synthetic */ boolean f6169c;

    /* renamed from: d */
    private final /* synthetic */ String f6170d;

    /* renamed from: e */
    private final /* synthetic */ C1554ox f6171e;

    C1562pe(C1554ox oxVar, boolean z, double d, boolean z2, String str) {
        this.f6171e = oxVar;
        this.f6167a = z;
        this.f6168b = d;
        this.f6169c = z2;
        this.f6170d = str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public final C1085at mo12873a(InputStream inputStream) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (this.f6168b * 160.0d);
        if (!this.f6169c) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        } catch (Exception e) {
            C1772wz.m1625b("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f6171e.mo12865a(2, this.f6167a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C0979o.m1505f() && C1772wz.m8288a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            C1772wz.m8287a(sb.toString());
        }
        return new C1085at(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f6170d), this.f6168b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12872a() {
        this.f6171e.mo12865a(2, this.f6167a);
        return null;
    }
}
