package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.api.C0795g;
import com.google.android.gms.common.api.C0797h;
import com.google.android.gms.common.api.C0798i;
import com.google.android.gms.common.api.C0844j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0917k;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.base.C1864e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends C0798i> extends C0795g<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f807a = new C0813ak();

    /* renamed from: b */
    private final Object f808b = new Object();

    /* renamed from: c */
    private final C0799a<R> f809c = new C0799a<>(Looper.getMainLooper());

    /* renamed from: d */
    private final WeakReference<C0792f> f810d = new WeakReference<>((Object) null);

    /* renamed from: e */
    private final CountDownLatch f811e = new CountDownLatch(1);

    /* renamed from: f */
    private final ArrayList<C0795g.C0796a> f812f = new ArrayList<>();

    /* renamed from: g */
    private C0844j<? super R> f813g;

    /* renamed from: h */
    private final AtomicReference<C0804ab> f814h = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public R f815i;

    /* renamed from: j */
    private Status f816j;

    /* renamed from: k */
    private volatile boolean f817k;

    /* renamed from: l */
    private boolean f818l;

    /* renamed from: m */
    private boolean f819m;
    @KeepName
    private C0800b mResultGuardian;

    /* renamed from: n */
    private C0917k f820n;

    /* renamed from: o */
    private boolean f821o = false;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C0800b {
        private C0800b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m937b(BasePendingResult.this.f815i);
            super.finalize();
        }

        /* synthetic */ C0800b(BasePendingResult basePendingResult, C0813ak akVar) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: b */
    public abstract R mo9596b(Status status);

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C0799a<R extends C0798i> extends C1864e {
        public C0799a() {
            this(Looper.getMainLooper());
        }

        public C0799a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo9597a(C0844j<? super R> jVar, R r) {
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    C0844j jVar = (C0844j) pair.first;
                    C0798i iVar = (C0798i) pair.second;
                    try {
                        jVar.mo9703a(iVar);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m937b(iVar);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).mo9593a(Status.f786d);
                    return;
                default:
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9595a() {
        return this.f811e.getCount() == 0;
    }

    /* renamed from: a */
    public final void mo9594a(R r) {
        synchronized (this.f808b) {
            if (this.f819m || this.f818l) {
                m937b((C0798i) r);
                return;
            }
            mo9595a();
            C0926p.m1313a(!mo9595a(), (Object) "Results have already been set");
            C0926p.m1313a(!this.f817k, (Object) "Result has already been consumed");
            m938c(r);
        }
    }

    /* renamed from: a */
    public final void mo9593a(Status status) {
        synchronized (this.f808b) {
            if (!mo9595a()) {
                mo9594a(mo9596b(status));
                this.f819m = true;
            }
        }
    }

    /* renamed from: b */
    private final R m936b() {
        R r;
        synchronized (this.f808b) {
            C0926p.m1313a(!this.f817k, (Object) "Result has already been consumed.");
            C0926p.m1313a(mo9595a(), (Object) "Result is not ready.");
            r = this.f815i;
            this.f815i = null;
            this.f813g = null;
            this.f817k = true;
        }
        C0804ab andSet = this.f814h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo9623a(this);
        }
        return r;
    }

    /* renamed from: c */
    private final void m938c(R r) {
        this.f815i = r;
        this.f820n = null;
        this.f811e.countDown();
        this.f816j = this.f815i.mo9551a();
        if (this.f818l) {
            this.f813g = null;
        } else if (this.f813g != null) {
            this.f809c.removeMessages(2);
            this.f809c.mo9597a(this.f813g, m936b());
        } else if (this.f815i instanceof C0797h) {
            this.mResultGuardian = new C0800b(this, (C0813ak) null);
        }
        ArrayList arrayList = this.f812f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C0795g.C0796a) obj).mo9591a(this.f816j);
        }
        this.f812f.clear();
    }

    /* renamed from: b */
    public static void m937b(C0798i iVar) {
        if (iVar instanceof C0797h) {
            try {
                ((C0797h) iVar).mo9592a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
