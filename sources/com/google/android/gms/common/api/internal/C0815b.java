package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import android.support.p034v4.util.ArraySet;
import android.util.Log;
import com.google.android.gms.common.C0849c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0791e;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.api.C0845k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0801a;
import com.google.android.gms.common.api.internal.C0822f;
import com.google.android.gms.common.internal.C0892c;
import com.google.android.gms.common.internal.C0913i;
import com.google.android.gms.common.internal.C0914j;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.C0928r;
import com.google.android.gms.common.util.C0966b;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.internal.base.C1864e;
import com.google.android.gms.p040b.C0742h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.b */
public class C0815b implements Handler.Callback {

    /* renamed from: a */
    public static final Status f852a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Status f853b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f854f = new Object();
    @GuardedBy("lock")

    /* renamed from: g */
    private static C0815b f855g;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f856c = 5000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f857d = 120000;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f858e = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f859h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0849c f860i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0913i f861j;

    /* renamed from: k */
    private final AtomicInteger f862k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f863l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C0807ae<?>, C0816a<?>> f864m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: n */
    public C0827j f865n = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: o */
    public final Set<C0807ae<?>> f866o = new ArraySet();

    /* renamed from: p */
    private final Set<C0807ae<?>> f867p = new ArraySet();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f868q;

    /* renamed from: a */
    public static C0815b m989a(Context context) {
        C0815b bVar;
        synchronized (f854f) {
            if (f855g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f855g = new C0815b(context.getApplicationContext(), handlerThread.getLooper(), C0849c.m1108a());
            }
            bVar = f855g;
        }
        return bVar;
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$b */
    private static class C0817b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C0807ae<?> f882a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f883b;

        private C0817b(C0807ae<?> aeVar, Feature feature) {
            this.f882a = aeVar;
            this.f883b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0817b)) {
                return false;
            }
            C0817b bVar = (C0817b) obj;
            if (!C0924o.m1303a(this.f882a, bVar.f882a) || !C0924o.m1303a(this.f883b, bVar.f883b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C0924o.m1301a(this.f882a, this.f883b);
        }

        public final String toString() {
            return C0924o.m1302a((Object) this).mo9911a("key", this.f882a).mo9911a("feature", this.f883b).toString();
        }

        /* synthetic */ C0817b(C0807ae aeVar, Feature feature, C0830m mVar) {
            this(aeVar, feature);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$c */
    private class C0818c implements C0843z, C0892c.C0895c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0772a.C0783f f885b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C0807ae<?> f886c;

        /* renamed from: d */
        private C0914j f887d = null;

        /* renamed from: e */
        private Set<Scope> f888e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f889f = false;

        public C0818c(C0772a.C0783f fVar, C0807ae<?> aeVar) {
            this.f885b = fVar;
            this.f886c = aeVar;
        }

        /* renamed from: a */
        public final void mo9671a(@NonNull ConnectionResult connectionResult) {
            C0815b.this.f868q.post(new C0835r(this, connectionResult));
        }

        @WorkerThread
        /* renamed from: b */
        public final void mo9673b(ConnectionResult connectionResult) {
            ((C0816a) C0815b.this.f864m.get(this.f886c)).mo9657b(connectionResult);
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo9672a(C0914j jVar, Set<Scope> set) {
            if (jVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo9673b(new ConnectionResult(4));
                return;
            }
            this.f887d = jVar;
            this.f888e = set;
            m1048a();
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: a */
        public final void m1048a() {
            if (this.f889f && this.f887d != null) {
                this.f885b.getRemoteService(this.f887d, this.f888e);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public class C0816a<O extends C0772a.C0776d> implements C0792f.C0793a, C0792f.C0794b, C0814al {

        /* renamed from: b */
        private final Queue<C0829l> f870b = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C0772a.C0783f f871c;

        /* renamed from: d */
        private final C0772a.C0774b f872d;

        /* renamed from: e */
        private final C0807ae<O> f873e;

        /* renamed from: f */
        private final C0826i f874f;

        /* renamed from: g */
        private final Set<C0808af> f875g = new HashSet();

        /* renamed from: h */
        private final Map<C0822f.C0823a<?>, C0838u> f876h = new HashMap();

        /* renamed from: i */
        private final int f877i;

        /* renamed from: j */
        private final C0840w f878j;

        /* renamed from: k */
        private boolean f879k;

        /* renamed from: l */
        private final List<C0817b> f880l = new ArrayList();

        /* renamed from: m */
        private ConnectionResult f881m = null;

        @WorkerThread
        public C0816a(C0791e<O> eVar) {
            this.f871c = eVar.mo9581a(C0815b.this.f868q.getLooper(), (C0816a<O>) this);
            if (this.f871c instanceof C0928r) {
                this.f872d = ((C0928r) this.f871c).mo9914a();
            } else {
                this.f872d = this.f871c;
            }
            this.f873e = eVar.mo9582a();
            this.f874f = new C0826i();
            this.f877i = eVar.mo9584b();
            if (this.f871c.requiresSignIn()) {
                this.f878j = eVar.mo9583a(C0815b.this.f859h, C0815b.this.f868q);
            } else {
                this.f878j = null;
            }
        }

        /* renamed from: a */
        public final void mo9589a(@Nullable Bundle bundle) {
            if (Looper.myLooper() == C0815b.this.f868q.getLooper()) {
                m1021m();
            } else {
                C0815b.this.f868q.post(new C0831n(this));
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: m */
        public final void m1021m() {
            mo9659d();
            m1020d(ConnectionResult.f759a);
            m1024p();
            Iterator<C0838u> it = this.f876h.values().iterator();
            while (it.hasNext()) {
                C0838u next = it.next();
                if (m1007a(next.f919a.mo9681b()) != null) {
                    it.remove();
                } else {
                    try {
                        next.f919a.mo9680a(this.f872d, new C0742h());
                    } catch (DeadObjectException unused) {
                        mo9588a(1);
                        this.f871c.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m1023o();
            m1025q();
        }

        /* renamed from: a */
        public final void mo9588a(int i) {
            if (Looper.myLooper() == C0815b.this.f868q.getLooper()) {
                m1022n();
            } else {
                C0815b.this.f868q.post(new C0832o(this));
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: n */
        public final void m1022n() {
            mo9659d();
            this.f879k = true;
            this.f874f.mo9686c();
            C0815b.this.f868q.sendMessageDelayed(Message.obtain(C0815b.this.f868q, 9, this.f873e), C0815b.this.f856c);
            C0815b.this.f868q.sendMessageDelayed(Message.obtain(C0815b.this.f868q, 11, this.f873e), C0815b.this.f857d);
            C0815b.this.f861j.mo9907a();
        }

        @WorkerThread
        /* renamed from: b */
        public final void mo9657b(@NonNull ConnectionResult connectionResult) {
            C0926p.m1311a(C0815b.this.f868q);
            this.f871c.disconnect();
            mo9590a(connectionResult);
        }

        @WorkerThread
        /* renamed from: c */
        private final boolean m1019c(@NonNull ConnectionResult connectionResult) {
            synchronized (C0815b.f854f) {
                if (C0815b.this.f865n == null || !C0815b.this.f866o.contains(this.f873e)) {
                    return false;
                }
                C0815b.this.f865n.mo9637b(connectionResult, this.f877i);
                return true;
            }
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo9590a(@NonNull ConnectionResult connectionResult) {
            C0926p.m1311a(C0815b.this.f868q);
            if (this.f878j != null) {
                this.f878j.mo9695a();
            }
            mo9659d();
            C0815b.this.f861j.mo9907a();
            m1020d(connectionResult);
            if (connectionResult.mo9510c() == 4) {
                mo9653a(C0815b.f853b);
            } else if (this.f870b.isEmpty()) {
                this.f881m = connectionResult;
            } else if (!m1019c(connectionResult) && !C0815b.this.mo9648a(connectionResult, this.f877i)) {
                if (connectionResult.mo9510c() == 18) {
                    this.f879k = true;
                }
                if (this.f879k) {
                    C0815b.this.f868q.sendMessageDelayed(Message.obtain(C0815b.this.f868q, 9, this.f873e), C0815b.this.f856c);
                    return;
                }
                String a = this.f873e.mo9631a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                sb.append("API: ");
                sb.append(a);
                sb.append(" is not available on this device.");
                mo9653a(new Status(17, sb.toString()));
            }
        }

        @WorkerThread
        /* renamed from: o */
        private final void m1023o() {
            ArrayList arrayList = new ArrayList(this.f870b);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C0829l lVar = (C0829l) obj;
                if (!this.f871c.isConnected()) {
                    return;
                }
                if (m1016b(lVar)) {
                    this.f870b.remove(lVar);
                }
            }
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo9655a(C0829l lVar) {
            C0926p.m1311a(C0815b.this.f868q);
            if (!this.f871c.isConnected()) {
                this.f870b.add(lVar);
                if (this.f881m == null || !this.f881m.mo9508a()) {
                    mo9664i();
                } else {
                    mo9590a(this.f881m);
                }
            } else if (m1016b(lVar)) {
                m1025q();
            } else {
                this.f870b.add(lVar);
            }
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo9652a() {
            C0926p.m1311a(C0815b.this.f868q);
            mo9653a(C0815b.f852a);
            this.f874f.mo9685b();
            for (C0822f.C0823a adVar : (C0822f.C0823a[]) this.f876h.keySet().toArray(new C0822f.C0823a[this.f876h.size()])) {
                mo9655a((C0829l) new C0806ad(adVar, new C0742h()));
            }
            m1020d(new ConnectionResult(4));
            if (this.f871c.isConnected()) {
                this.f871c.onUserSignOut(new C0833p(this));
            }
        }

        /* renamed from: b */
        public final C0772a.C0783f mo9656b() {
            return this.f871c;
        }

        /* renamed from: c */
        public final Map<C0822f.C0823a<?>, C0838u> mo9658c() {
            return this.f876h;
        }

        @WorkerThread
        /* renamed from: d */
        public final void mo9659d() {
            C0926p.m1311a(C0815b.this.f868q);
            this.f881m = null;
        }

        @WorkerThread
        /* renamed from: e */
        public final ConnectionResult mo9660e() {
            C0926p.m1311a(C0815b.this.f868q);
            return this.f881m;
        }

        @WorkerThread
        /* renamed from: b */
        private final boolean m1016b(C0829l lVar) {
            if (!(lVar instanceof C0839v)) {
                m1018c(lVar);
                return true;
            }
            C0839v vVar = (C0839v) lVar;
            Feature a = m1007a(vVar.mo9629b(this));
            if (a == null) {
                m1018c(lVar);
                return true;
            } else if (vVar.mo9630c(this)) {
                C0817b bVar = new C0817b(this.f873e, a, (C0830m) null);
                int indexOf = this.f880l.indexOf(bVar);
                if (indexOf >= 0) {
                    C0817b bVar2 = this.f880l.get(indexOf);
                    C0815b.this.f868q.removeMessages(15, bVar2);
                    C0815b.this.f868q.sendMessageDelayed(Message.obtain(C0815b.this.f868q, 15, bVar2), C0815b.this.f856c);
                    return false;
                }
                this.f880l.add(bVar);
                C0815b.this.f868q.sendMessageDelayed(Message.obtain(C0815b.this.f868q, 15, bVar), C0815b.this.f856c);
                C0815b.this.f868q.sendMessageDelayed(Message.obtain(C0815b.this.f868q, 16, bVar), C0815b.this.f857d);
                ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
                if (m1019c(connectionResult)) {
                    return false;
                }
                C0815b.this.mo9648a(connectionResult, this.f877i);
                return false;
            } else {
                vVar.mo9627a((RuntimeException) new C0845k(a));
                return false;
            }
        }

        @WorkerThread
        /* renamed from: c */
        private final void m1018c(C0829l lVar) {
            lVar.mo9626a(this.f874f, mo9666k());
            try {
                lVar.mo9625a((C0816a<?>) this);
            } catch (DeadObjectException unused) {
                mo9588a(1);
                this.f871c.disconnect();
            }
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo9653a(Status status) {
            C0926p.m1311a(C0815b.this.f868q);
            for (C0829l a : this.f870b) {
                a.mo9624a(status);
            }
            this.f870b.clear();
        }

        @WorkerThread
        /* renamed from: f */
        public final void mo9661f() {
            C0926p.m1311a(C0815b.this.f868q);
            if (this.f879k) {
                mo9664i();
            }
        }

        @WorkerThread
        /* renamed from: p */
        private final void m1024p() {
            if (this.f879k) {
                C0815b.this.f868q.removeMessages(11, this.f873e);
                C0815b.this.f868q.removeMessages(9, this.f873e);
                this.f879k = false;
            }
        }

        @WorkerThread
        /* renamed from: g */
        public final void mo9662g() {
            Status status;
            C0926p.m1311a(C0815b.this.f868q);
            if (this.f879k) {
                m1024p();
                if (C0815b.this.f860i.mo9712a(C0815b.this.f859h) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo9653a(status);
                this.f871c.disconnect();
            }
        }

        /* renamed from: q */
        private final void m1025q() {
            C0815b.this.f868q.removeMessages(12, this.f873e);
            C0815b.this.f868q.sendMessageDelayed(C0815b.this.f868q.obtainMessage(12, this.f873e), C0815b.this.f858e);
        }

        @WorkerThread
        /* renamed from: h */
        public final boolean mo9663h() {
            return m1012a(true);
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: a */
        public final boolean m1012a(boolean z) {
            C0926p.m1311a(C0815b.this.f868q);
            if (!this.f871c.isConnected() || this.f876h.size() != 0) {
                return false;
            }
            if (this.f874f.mo9684a()) {
                if (z) {
                    m1025q();
                }
                return false;
            }
            this.f871c.disconnect();
            return true;
        }

        @WorkerThread
        /* renamed from: i */
        public final void mo9664i() {
            C0926p.m1311a(C0815b.this.f868q);
            if (!this.f871c.isConnected() && !this.f871c.isConnecting()) {
                int a = C0815b.this.f861j.mo9906a(C0815b.this.f859h, this.f871c);
                if (a != 0) {
                    mo9590a(new ConnectionResult(a, (PendingIntent) null));
                    return;
                }
                C0818c cVar = new C0818c(this.f871c, this.f873e);
                if (this.f871c.requiresSignIn()) {
                    this.f878j.mo9696a((C0843z) cVar);
                }
                this.f871c.connect(cVar);
            }
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo9654a(C0808af afVar) {
            C0926p.m1311a(C0815b.this.f868q);
            this.f875g.add(afVar);
        }

        @WorkerThread
        /* renamed from: d */
        private final void m1020d(ConnectionResult connectionResult) {
            for (C0808af next : this.f875g) {
                String str = null;
                if (C0924o.m1303a(connectionResult, ConnectionResult.f759a)) {
                    str = this.f871c.getEndpointPackageName();
                }
                next.mo9635a(this.f873e, connectionResult, str);
            }
            this.f875g.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public final boolean mo9665j() {
            return this.f871c.isConnected();
        }

        /* renamed from: k */
        public final boolean mo9666k() {
            return this.f871c.requiresSignIn();
        }

        /* renamed from: l */
        public final int mo9667l() {
            return this.f877i;
        }

        @Nullable
        @WorkerThread
        /* renamed from: a */
        private final Feature m1007a(@Nullable Feature[] featureArr) {
            if (featureArr == null || featureArr.length == 0) {
                return null;
            }
            Feature[] availableFeatures = this.f871c.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                arrayMap.put(feature.mo9517a(), Long.valueOf(feature.mo9518b()));
            }
            for (Feature feature2 : featureArr) {
                if (!arrayMap.containsKey(feature2.mo9517a()) || ((Long) arrayMap.get(feature2.mo9517a())).longValue() < feature2.mo9518b()) {
                    return feature2;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: a */
        public final void m1010a(C0817b bVar) {
            if (!this.f880l.contains(bVar) || this.f879k) {
                return;
            }
            if (!this.f871c.isConnected()) {
                mo9664i();
            } else {
                m1023o();
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        /* renamed from: b */
        public final void m1015b(C0817b bVar) {
            Feature[] b;
            if (this.f880l.remove(bVar)) {
                C0815b.this.f868q.removeMessages(15, bVar);
                C0815b.this.f868q.removeMessages(16, bVar);
                Feature b2 = bVar.f883b;
                ArrayList arrayList = new ArrayList(this.f870b.size());
                for (C0829l lVar : this.f870b) {
                    if ((lVar instanceof C0839v) && (b = ((C0839v) lVar).mo9629b(this)) != null && C0966b.m1460a((T[]) b, b2)) {
                        arrayList.add(lVar);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C0829l lVar2 = (C0829l) obj;
                    this.f870b.remove(lVar2);
                    lVar2.mo9627a((RuntimeException) new C0845k(b2));
                }
            }
        }
    }

    private C0815b(Context context, Looper looper, C0849c cVar) {
        this.f859h = context;
        this.f868q = new C1864e(looper, this);
        this.f860i = cVar;
        this.f861j = new C0913i(cVar);
        this.f868q.sendMessage(this.f868q.obtainMessage(6));
    }

    @WorkerThread
    /* renamed from: a */
    private final void m990a(C0791e<?> eVar) {
        C0807ae<?> a = eVar.mo9582a();
        C0816a aVar = this.f864m.get(a);
        if (aVar == null) {
            aVar = new C0816a(eVar);
            this.f864m.put(a, aVar);
        }
        if (aVar.mo9666k()) {
            this.f867p.add(a);
        }
        aVar.mo9664i();
    }

    /* renamed from: a */
    public final void mo9647a(@NonNull C0827j jVar) {
        synchronized (f854f) {
            if (this.f865n != jVar) {
                this.f865n = jVar;
                this.f866o.clear();
            }
            this.f866o.addAll(jVar.mo9687g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9650b(@NonNull C0827j jVar) {
        synchronized (f854f) {
            if (this.f865n == jVar) {
                this.f865n = null;
                this.f866o.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo9646a() {
        this.f868q.sendMessage(this.f868q.obtainMessage(3));
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        C0816a aVar;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f858e = j;
                this.f868q.removeMessages(12);
                for (C0807ae<?> obtainMessage : this.f864m.keySet()) {
                    this.f868q.sendMessageDelayed(this.f868q.obtainMessage(12, obtainMessage), this.f858e);
                }
                break;
            case 2:
                C0808af afVar = (C0808af) message.obj;
                Iterator<C0807ae<?>> it = afVar.mo9634a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C0807ae next = it.next();
                        C0816a aVar2 = this.f864m.get(next);
                        if (aVar2 == null) {
                            afVar.mo9635a(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (aVar2.mo9665j()) {
                            afVar.mo9635a(next, ConnectionResult.f759a, aVar2.mo9656b().getEndpointPackageName());
                        } else if (aVar2.mo9660e() != null) {
                            afVar.mo9635a(next, aVar2.mo9660e(), (String) null);
                        } else {
                            aVar2.mo9654a(afVar);
                            aVar2.mo9664i();
                        }
                    }
                }
            case 3:
                for (C0816a next2 : this.f864m.values()) {
                    next2.mo9659d();
                    next2.mo9664i();
                }
                break;
            case 4:
            case 8:
            case 13:
                C0837t tVar = (C0837t) message.obj;
                C0816a aVar3 = this.f864m.get(tVar.f918c.mo9582a());
                if (aVar3 == null) {
                    m990a(tVar.f918c);
                    aVar3 = this.f864m.get(tVar.f918c.mo9582a());
                }
                if (aVar3.mo9666k() && this.f863l.get() != tVar.f917b) {
                    tVar.f916a.mo9624a(f852a);
                    aVar3.mo9652a();
                    break;
                } else {
                    aVar3.mo9655a(tVar.f916a);
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C0816a<?>> it2 = this.f864m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = it2.next();
                        if (aVar.mo9667l() == i) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String b = this.f860i.mo9723b(connectionResult.mo9510c());
                    String e = connectionResult.mo9512e();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 69 + String.valueOf(e).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b);
                    sb2.append(": ");
                    sb2.append(e);
                    aVar.mo9653a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C0979o.m1500a() && (this.f859h.getApplicationContext() instanceof Application)) {
                    C0801a.m954a((Application) this.f859h.getApplicationContext());
                    C0801a.m953a().mo9609a((C0801a.C0802a) new C0830m(this));
                    if (!C0801a.m953a().mo9610a(true)) {
                        this.f858e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m990a((C0791e<?>) (C0791e) message.obj);
                break;
            case 9:
                if (this.f864m.containsKey(message.obj)) {
                    this.f864m.get(message.obj).mo9661f();
                    break;
                }
                break;
            case 10:
                for (C0807ae<?> remove : this.f867p) {
                    this.f864m.remove(remove).mo9652a();
                }
                this.f867p.clear();
                break;
            case 11:
                if (this.f864m.containsKey(message.obj)) {
                    this.f864m.get(message.obj).mo9662g();
                    break;
                }
                break;
            case 12:
                if (this.f864m.containsKey(message.obj)) {
                    this.f864m.get(message.obj).mo9663h();
                    break;
                }
                break;
            case 14:
                C0828k kVar = (C0828k) message.obj;
                C0807ae<?> a = kVar.mo9688a();
                if (this.f864m.containsKey(a)) {
                    kVar.mo9689b().mo9487a(Boolean.valueOf(this.f864m.get(a).m1012a(false)));
                    break;
                } else {
                    kVar.mo9689b().mo9487a(false);
                    break;
                }
            case 15:
                C0817b bVar = (C0817b) message.obj;
                if (this.f864m.containsKey(bVar.f882a)) {
                    this.f864m.get(bVar.f882a).m1010a(bVar);
                    break;
                }
                break;
            case 16:
                C0817b bVar2 = (C0817b) message.obj;
                if (this.f864m.containsKey(bVar2.f882a)) {
                    this.f864m.get(bVar2.f882a).m1015b(bVar2);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9648a(ConnectionResult connectionResult, int i) {
        return this.f860i.mo9721a(this.f859h, connectionResult, i);
    }

    /* renamed from: b */
    public final void mo9649b(ConnectionResult connectionResult, int i) {
        if (!mo9648a(connectionResult, i)) {
            this.f868q.sendMessage(this.f868q.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
