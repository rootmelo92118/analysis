package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p034v4.util.LruCache;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C0891b;
import com.google.android.gms.internal.base.zak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f977a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashSet<Uri> f978b = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f979c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f980d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ExecutorService f981e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0862b f982f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zak f983g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<C0865a, ImageReceiver> f984h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<Uri, ImageReceiver> f985i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<Uri, Long> f986j;

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    public interface C0861a {
        /* renamed from: a */
        void mo9745a(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private static final class C0862b extends LruCache<C0866b, Bitmap> {
        /* access modifiers changed from: protected */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            super.entryRemoved(z, (C0866b) obj, (Bitmap) obj2, (Bitmap) obj3);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C0863c implements Runnable {

        /* renamed from: a */
        private final Uri f990a;

        /* renamed from: b */
        private final ParcelFileDescriptor f991b;

        public C0863c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f990a = uri;
            this.f991b = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            C0891b.m1224b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (this.f991b != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(this.f991b.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f990a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e("ImageManager", sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.f991b.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.f980d.post(new C0864d(this.f990a, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String valueOf2 = String.valueOf(this.f990a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    private final class C0864d implements Runnable {

        /* renamed from: a */
        private final Uri f993a;

        /* renamed from: b */
        private final Bitmap f994b;

        /* renamed from: c */
        private final CountDownLatch f995c;

        /* renamed from: d */
        private boolean f996d;

        public C0864d(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f993a = uri;
            this.f994b = bitmap;
            this.f996d = z;
            this.f995c = countDownLatch;
        }

        public final void run() {
            C0891b.m1223a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f994b != null;
            if (ImageManager.this.f982f != null) {
                if (this.f996d) {
                    ImageManager.this.f982f.evictAll();
                    System.gc();
                    this.f996d = false;
                    ImageManager.this.f980d.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f982f.put(new C0866b(this.f993a), this.f994b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f985i.remove(this.f993a);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f988b;
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C0865a aVar = (C0865a) a.get(i);
                    if (z) {
                        aVar.mo9755a(ImageManager.this.f979c, this.f994b, false);
                    } else {
                        ImageManager.this.f986j.put(this.f993a, Long.valueOf(SystemClock.elapsedRealtime()));
                        aVar.mo9756a(ImageManager.this.f979c, ImageManager.this.f983g, false);
                    }
                    if (!(aVar instanceof C0867c)) {
                        ImageManager.this.f984h.remove(aVar);
                    }
                }
            }
            this.f995c.countDown();
            synchronized (ImageManager.f977a) {
                ImageManager.f978b.remove(this.f993a);
            }
        }
    }

    @KeepName
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f987a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList<C0865a> f988b;

        /* renamed from: c */
        private final /* synthetic */ ImageManager f989c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f989c.f981e.execute(new C0863c(this.f987a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
