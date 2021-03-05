package p000a.p013b.p014a.p016b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p000a.p013b.C0240h;
import p000a.p013b.p014a.p015a.C0156a;

/* renamed from: a.b.a.b.a */
/* compiled from: AndroidSchedulers */
public final class C0157a {

    /* renamed from: a */
    private static final C0240h f348a = C0156a.m452a((Callable<C0240h>) new Callable<C0240h>() {
        /* renamed from: a */
        public C0240h call() {
            return C0159a.f349a;
        }
    });

    /* renamed from: a.b.a.b.a$a */
    /* compiled from: AndroidSchedulers */
    private static final class C0159a {

        /* renamed from: a */
        static final C0240h f349a = new C0160b(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static C0240h m455a() {
        return C0156a.m451a(f348a);
    }
}
