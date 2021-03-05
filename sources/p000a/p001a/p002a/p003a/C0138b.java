package p000a.p001a.p002a.p003a;

import android.util.Log;

/* renamed from: a.a.a.a.b */
/* compiled from: DefaultLogger */
public class C0138b implements C0153l {

    /* renamed from: a */
    private int f299a;

    public C0138b(int i) {
        this.f299a = i;
    }

    public C0138b() {
        this.f299a = 4;
    }

    /* renamed from: a */
    public boolean mo283a(String str, int i) {
        return this.f299a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: a */
    public void mo282a(String str, String str2, Throwable th) {
        if (mo283a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: b */
    public void mo285b(String str, String str2, Throwable th) {
        if (mo283a(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo287c(String str, String str2, Throwable th) {
        if (mo283a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo289d(String str, String str2, Throwable th) {
        if (mo283a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo291e(String str, String str2, Throwable th) {
        if (mo283a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: a */
    public void mo281a(String str, String str2) {
        mo282a(str, str2, (Throwable) null);
    }

    /* renamed from: b */
    public void mo284b(String str, String str2) {
        mo285b(str, str2, (Throwable) null);
    }

    /* renamed from: c */
    public void mo286c(String str, String str2) {
        mo287c(str, str2, (Throwable) null);
    }

    /* renamed from: d */
    public void mo288d(String str, String str2) {
        mo289d(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo290e(String str, String str2) {
        mo291e(str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public void mo279a(int i, String str, String str2) {
        mo280a(i, str, str2, false);
    }

    /* renamed from: a */
    public void mo280a(int i, String str, String str2, boolean z) {
        if (z || mo283a(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
