package p000a.p001a.p002a.p003a.p004a.p006b;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: a.a.a.a.a.b.w */
/* compiled from: TimingMetric */
public class C0047w {

    /* renamed from: a */
    private final String f95a;

    /* renamed from: b */
    private final String f96b;

    /* renamed from: c */
    private final boolean f97c;

    /* renamed from: d */
    private long f98d;

    /* renamed from: e */
    private long f99e;

    public C0047w(String str, String str2) {
        this.f95a = str;
        this.f96b = str2;
        this.f97c = !Log.isLoggable(str2, 2);
    }

    /* renamed from: a */
    public synchronized void mo91a() {
        if (!this.f97c) {
            this.f98d = SystemClock.elapsedRealtime();
            this.f99e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void mo92b() {
        if (!this.f97c) {
            if (this.f99e == 0) {
                this.f99e = SystemClock.elapsedRealtime() - this.f98d;
                m157c();
            }
        }
    }

    /* renamed from: c */
    private void m157c() {
        String str = this.f96b;
        Log.v(str, this.f95a + ": " + this.f99e + "ms");
    }
}
