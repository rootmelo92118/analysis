package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0790d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0911h;
import com.google.android.gms.common.internal.C0918l;
import com.google.android.gms.common.internal.C0920m;
import com.google.android.gms.internal.p044b.C1858e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C0892c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zzbs = new Feature[0];
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private int zzbt;
    private long zzbu;
    private long zzbv;
    private int zzbw;
    private long zzbx;
    private C0880ak zzby;
    private final Looper zzbz;
    private final C0911h zzca;
    private final C0851d zzcb;
    /* access modifiers changed from: private */
    public final Object zzcc;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")
    public C0920m zzcd;
    protected C0895c zzce;
    @GuardedBy("mLock")
    private T zzcf;
    /* access modifiers changed from: private */
    public final ArrayList<C0900h<?>> zzcg;
    @GuardedBy("mLock")
    private C0902j zzch;
    @GuardedBy("mLock")
    private int zzci;
    /* access modifiers changed from: private */
    public final C0893a zzcj;
    /* access modifiers changed from: private */
    public final C0894b zzck;
    private final int zzcl;
    private final String zzcm;
    /* access modifiers changed from: private */
    public ConnectionResult zzcn;
    /* access modifiers changed from: private */
    public boolean zzco;
    private volatile zzb zzcp;
    protected AtomicInteger zzcq;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface C0893a {
        /* renamed from: a */
        void mo9868a(int i);

        /* renamed from: a */
        void mo9869a(@Nullable Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface C0894b {
        /* renamed from: a */
        void mo9870a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface C0895c {
        /* renamed from: a */
        void mo9671a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class C0896d implements C0895c {
        public C0896d() {
        }

        /* renamed from: a */
        public void mo9671a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.mo9509b()) {
                C0892c.this.getRemoteService((C0914j) null, C0892c.this.getScopes());
            } else if (C0892c.this.zzck != null) {
                C0892c.this.zzck.mo9870a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface C0897e {
        /* renamed from: a */
        void mo9692a();
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract T createServiceInterface(IBinder iBinder);

    public Account getAccount() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public String getLocalStartServiceAction() {
        return null;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract String getServiceDescriptor();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: package-private */
    public void onSetConnectState(int i, T t) {
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    protected C0892c(Context context, Looper looper, int i, C0893a aVar, C0894b bVar, String str) {
        this(context, looper, C0911h.m1280a(context), C0851d.m1126b(), i, (C0893a) C0926p.m1306a(aVar), (C0894b) C0926p.m1306a(bVar), str);
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    final class C0899g extends C1858e {
        public C0899g(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.zzcq
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = m1236b(r8)
                if (r0 == 0) goto L_0x0015
                m1235a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002a
                int r0 = r8.what
                r4 = 7
                if (r0 == r4) goto L_0x002a
                int r0 = r8.what
                if (r0 == r1) goto L_0x002a
                int r0 = r8.what
                if (r0 != r3) goto L_0x0036
            L_0x002a:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                boolean r0 = r0.isConnecting()
                if (r0 != 0) goto L_0x0036
                m1235a(r8)
                return
            L_0x0036:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0081
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.ConnectionResult unused = r0.zzcn = r1
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                boolean r8 = r8.zzl()
                if (r8 == 0) goto L_0x0060
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                boolean r8 = r8.zzco
                if (r8 != 0) goto L_0x0060
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                r8.zza((int) r5, null)
                return
            L_0x0060:
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzcn
                if (r8 == 0) goto L_0x006f
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzcn
                goto L_0x0074
            L_0x006f:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0074:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.internal.c$c r0 = r0.zzce
                r0.mo9671a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                r0.onConnectionFailed(r8)
                return
            L_0x0081:
                int r0 = r8.what
                if (r0 != r3) goto L_0x00a6
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzcn
                if (r8 == 0) goto L_0x0094
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.ConnectionResult r8 = r8.zzcn
                goto L_0x0099
            L_0x0094:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0099:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.internal.c$c r0 = r0.zzce
                r0.mo9671a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                r0.onConnectionFailed(r8)
                return
            L_0x00a6:
                int r0 = r8.what
                if (r0 != r5) goto L_0x00c9
                java.lang.Object r0 = r8.obj
                boolean r0 = r0 instanceof android.app.PendingIntent
                if (r0 == 0) goto L_0x00b5
                java.lang.Object r0 = r8.obj
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b5:
                com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.internal.c$c r8 = r8.zzce
                r8.mo9671a(r0)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                r8.onConnectionFailed(r0)
                return
            L_0x00c9:
                int r0 = r8.what
                r1 = 6
                if (r0 != r1) goto L_0x00f3
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                r0.zza((int) r3, null)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.internal.c$a r0 = r0.zzcj
                if (r0 == 0) goto L_0x00e6
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                com.google.android.gms.common.internal.c$a r0 = r0.zzcj
                int r1 = r8.arg2
                r0.mo9868a((int) r1)
            L_0x00e6:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                int r8 = r8.arg2
                r0.onConnectionSuspended(r8)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0892c.this
                boolean unused = r8.zza((int) r3, (int) r2, r6)
                return
            L_0x00f3:
                int r0 = r8.what
                r1 = 2
                if (r0 != r1) goto L_0x0104
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0892c.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x0104
                m1235a(r8)
                return
            L_0x0104:
                boolean r0 = m1236b(r8)
                if (r0 == 0) goto L_0x0112
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.c$h r8 = (com.google.android.gms.common.internal.C0892c.C0900h) r8
                r8.mo9876c()
                return
            L_0x0112:
                java.lang.String r0 = "GmsClient"
                int r8 = r8.what
                r1 = 45
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Don't know how to handle message: "
                r2.append(r1)
                r2.append(r8)
                java.lang.String r8 = r2.toString()
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                android.util.Log.wtf(r0, r8, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0892c.C0899g.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        private static void m1235a(Message message) {
            C0900h hVar = (C0900h) message.obj;
            hVar.mo9874b();
            hVar.mo9877d();
        }

        /* renamed from: b */
        private static boolean m1236b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$l */
    protected final class C0904l extends C0898f {
        @BinderThread
        public C0904l(int i, Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo9871a(ConnectionResult connectionResult) {
            C0892c.this.zzce.mo9671a(connectionResult);
            C0892c.this.onConnectionFailed(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo9873a() {
            C0892c.this.zzce.mo9671a(ConnectionResult.f759a);
            return true;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    protected abstract class C0900h<TListener> {

        /* renamed from: a */
        private TListener f1071a;

        /* renamed from: b */
        private boolean f1072b = false;

        public C0900h(TListener tlistener) {
            this.f1071a = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo9872a(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo9874b();

        /* renamed from: c */
        public final void mo9876c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f1071a;
                if (this.f1072b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo9872a(tlistener);
                } catch (RuntimeException e) {
                    mo9874b();
                    throw e;
                }
            } else {
                mo9874b();
            }
            synchronized (this) {
                this.f1072b = true;
            }
            mo9877d();
        }

        /* renamed from: d */
        public final void mo9877d() {
            mo9878e();
            synchronized (C0892c.this.zzcg) {
                C0892c.this.zzcg.remove(this);
            }
        }

        /* renamed from: e */
        public final void mo9878e() {
            synchronized (this) {
                this.f1071a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class C0901i extends C0918l.C0919a {

        /* renamed from: a */
        private C0892c f1074a;

        /* renamed from: b */
        private final int f1075b;

        public C0901i(@NonNull C0892c cVar, int i) {
            this.f1074a = cVar;
            this.f1075b = i;
        }

        @BinderThread
        /* renamed from: a */
        public final void mo9823a(int i, @Nullable Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @BinderThread
        /* renamed from: a */
        public final void mo9824a(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
            C0926p.m1307a(this.f1074a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1074a.onPostInitHandler(i, iBinder, bundle, this.f1075b);
            this.f1074a = null;
        }

        @BinderThread
        /* renamed from: a */
        public final void mo9825a(int i, @NonNull IBinder iBinder, @NonNull zzb zzb) {
            C0926p.m1307a(this.f1074a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C0926p.m1306a(zzb);
            this.f1074a.zza(zzb);
            mo9824a(i, iBinder, zzb.f1130a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class C0902j implements ServiceConnection {

        /* renamed from: a */
        private final int f1076a;

        public C0902j(int i) {
            this.f1076a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0920m mVar;
            if (iBinder == null) {
                C0892c.this.zzb(16);
                return;
            }
            synchronized (C0892c.this.zzcc) {
                C0892c cVar = C0892c.this;
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C0920m)) {
                        mVar = new C0920m.C0921a.C0922a(iBinder);
                    } else {
                        mVar = (C0920m) queryLocalInterface;
                    }
                }
                C0920m unused = cVar.zzcd = mVar;
            }
            C0892c.this.zza(0, (Bundle) null, this.f1076a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C0892c.this.zzcc) {
                C0920m unused = C0892c.this.zzcd = null;
            }
            C0892c.this.mHandler.sendMessage(C0892c.this.mHandler.obtainMessage(6, this.f1076a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$k */
    protected final class C0903k extends C0898f {

        /* renamed from: a */
        private final IBinder f1078a;

        @BinderThread
        public C0903k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f1078a = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo9871a(ConnectionResult connectionResult) {
            if (C0892c.this.zzck != null) {
                C0892c.this.zzck.mo9870a(connectionResult);
            }
            C0892c.this.onConnectionFailed(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo9873a() {
            try {
                String interfaceDescriptor = this.f1078a.getInterfaceDescriptor();
                if (!C0892c.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    String serviceDescriptor = C0892c.this.getServiceDescriptor();
                    StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(serviceDescriptor);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface createServiceInterface = C0892c.this.createServiceInterface(this.f1078a);
                if (createServiceInterface == null || (!C0892c.this.zza(2, 4, createServiceInterface) && !C0892c.this.zza(3, 4, createServiceInterface))) {
                    return false;
                }
                ConnectionResult unused = C0892c.this.zzcn = null;
                Bundle connectionHint = C0892c.this.getConnectionHint();
                if (C0892c.this.zzcj == null) {
                    return true;
                }
                C0892c.this.zzcj.mo9869a(connectionHint);
                return true;
            } catch (RemoteException unused2) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    private abstract class C0898f extends C0900h<Boolean> {

        /* renamed from: a */
        private final int f1067a;

        /* renamed from: b */
        private final Bundle f1068b;

        @BinderThread
        protected C0898f(int i, Bundle bundle) {
            super(true);
            this.f1067a = i;
            this.f1068b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo9871a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo9873a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo9874b() {
        }

        /* JADX WARNING: type inference failed for: r5v12, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo9872a(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0892c.this
                r5.zza((int) r0, null)
                return
            L_0x000c:
                int r5 = r4.f1067a
                if (r5 == 0) goto L_0x0063
                r2 = 10
                if (r5 == r2) goto L_0x0033
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0892c.this
                r5.zza((int) r0, null)
                android.os.Bundle r5 = r4.f1068b
                if (r5 == 0) goto L_0x0028
                android.os.Bundle r5 = r4.f1068b
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0028:
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                int r0 = r4.f1067a
                r5.<init>(r0, r1)
                r4.mo9871a((com.google.android.gms.common.ConnectionResult) r5)
                goto L_0x0079
            L_0x0033:
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0892c.this
                r5.zza((int) r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.C0892c.this
                java.lang.String r2 = r2.getStartServiceAction()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.C0892c.this
                java.lang.String r2 = r2.getServiceDescriptor()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0063:
                boolean r5 = r4.mo9873a()
                if (r5 != 0) goto L_0x0079
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0892c.this
                r5.zza((int) r0, null)
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                r0 = 8
                r5.<init>(r0, r1)
                r4.mo9871a((com.google.android.gms.common.ConnectionResult) r5)
                return
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0892c.C0898f.mo9872a(java.lang.Object):void");
        }
    }

    protected C0892c(Context context, Looper looper, C0911h hVar, C0851d dVar, int i, C0893a aVar, C0894b bVar, String str) {
        this.mLock = new Object();
        this.zzcc = new Object();
        this.zzcg = new ArrayList<>();
        this.zzci = 1;
        this.zzcn = null;
        this.zzco = false;
        this.zzcp = null;
        this.zzcq = new AtomicInteger(0);
        this.mContext = (Context) C0926p.m1307a(context, (Object) "Context must not be null");
        this.zzbz = (Looper) C0926p.m1307a(looper, (Object) "Looper must not be null");
        this.zzca = (C0911h) C0926p.m1307a(hVar, (Object) "Supervisor must not be null");
        this.zzcb = (C0851d) C0926p.m1307a(dVar, (Object) "API availability must not be null");
        this.mHandler = new C0899g(looper);
        this.zzcl = i;
        this.zzcj = aVar;
        this.zzck = bVar;
        this.zzcm = str;
    }

    protected C0892c(Context context, Handler handler, C0911h hVar, C0851d dVar, int i, C0893a aVar, C0894b bVar) {
        this.mLock = new Object();
        this.zzcc = new Object();
        this.zzcg = new ArrayList<>();
        this.zzci = 1;
        this.zzcn = null;
        this.zzco = false;
        this.zzcp = null;
        this.zzcq = new AtomicInteger(0);
        this.mContext = (Context) C0926p.m1307a(context, (Object) "Context must not be null");
        this.mHandler = (Handler) C0926p.m1307a(handler, (Object) "Handler must not be null");
        this.zzbz = handler.getLooper();
        this.zzca = (C0911h) C0926p.m1307a(hVar, (Object) "Supervisor must not be null");
        this.zzcb = (C0851d) C0926p.m1307a(dVar, (Object) "API availability must not be null");
        this.zzcl = i;
        this.zzcj = aVar;
        this.zzck = bVar;
        this.zzcm = null;
    }

    @Nullable
    private final String zzj() {
        return this.zzcm == null ? this.mContext.getClass().getName() : this.zzcm;
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb) {
        this.zzcp = zzb;
    }

    @Nullable
    public final Feature[] getAvailableFeatures() {
        zzb zzb = this.zzcp;
        if (zzb == null) {
            return null;
        }
        return zzb.f1131b;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onConnectedLocked(@NonNull T t) {
        this.zzbv = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onConnectionSuspended(int i) {
        this.zzbt = i;
        this.zzbu = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbw = connectionResult.mo9510c();
        this.zzbx = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public final void zza(int i, T t) {
        C0880ak akVar;
        C0926p.m1316b((i == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzci = i;
            this.zzcf = t;
            onSetConnectState(i, t);
            switch (i) {
                case 1:
                    if (this.zzch != null) {
                        this.zzca.mo9898a(getStartServiceAction(), getStartServicePackage(), 129, this.zzch, zzj());
                        this.zzch = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.zzch == null || this.zzby == null)) {
                        String a = this.zzby.mo9817a();
                        String b = this.zzby.mo9818b();
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 70 + String.valueOf(b).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a);
                        sb.append(" on ");
                        sb.append(b);
                        Log.e("GmsClient", sb.toString());
                        this.zzca.mo9898a(this.zzby.mo9817a(), this.zzby.mo9818b(), this.zzby.mo9819c(), this.zzch, zzj());
                        this.zzcq.incrementAndGet();
                    }
                    this.zzch = new C0902j(this.zzcq.get());
                    if (this.zzci != 3 || getLocalStartServiceAction() == null) {
                        akVar = new C0880ak(getStartServicePackage(), getStartServiceAction(), false, 129);
                    } else {
                        akVar = new C0880ak(getContext().getPackageName(), getLocalStartServiceAction(), true, 129);
                    }
                    this.zzby = akVar;
                    if (!this.zzca.mo9802a(new C0911h.C0912a(this.zzby.mo9817a(), this.zzby.mo9818b(), this.zzby.mo9819c()), this.zzch, zzj())) {
                        String a2 = this.zzby.mo9817a();
                        String b2 = this.zzby.mo9818b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a2);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        zza(16, (Bundle) null, this.zzcq.get());
                        break;
                    }
                    break;
                case 4:
                    onConnectedLocked(t);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzci != i) {
                return false;
            }
            zza(i2, t);
            return true;
        }
    }

    public void checkAvailabilityAndConnect() {
        int b = this.zzcb.mo9722b(this.mContext, getMinApkVersion());
        if (b != 0) {
            zza(1, (IInterface) null);
            triggerNotAvailable(new C0896d(), b, (PendingIntent) null);
            return;
        }
        connect(new C0896d());
    }

    public void connect(@NonNull C0895c cVar) {
        this.zzce = (C0895c) C0926p.m1307a(cVar, (Object) "Connection progress callbacks cannot be null.");
        zza(2, (IInterface) null);
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzci == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            if (this.zzci != 2) {
                if (this.zzci != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private final boolean zzk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzci == 3;
        }
        return z;
    }

    public void disconnect() {
        this.zzcq.incrementAndGet();
        synchronized (this.zzcg) {
            int size = this.zzcg.size();
            for (int i = 0; i < size; i++) {
                this.zzcg.get(i).mo9878e();
            }
            this.zzcg.clear();
        }
        synchronized (this.zzcc) {
            this.zzcd = null;
        }
        zza(1, (IInterface) null);
    }

    public void triggerConnectionSuspended(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.zzcq.get(), i));
    }

    /* access modifiers changed from: private */
    public final void zzb(int i) {
        int i2;
        if (zzk()) {
            i2 = 5;
            this.zzco = true;
        } else {
            i2 = 4;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(i2, this.zzcq.get(), 16));
    }

    /* access modifiers changed from: protected */
    public void triggerNotAvailable(@NonNull C0895c cVar, int i, @Nullable PendingIntent pendingIntent) {
        this.zzce = (C0895c) C0926p.m1307a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzcq.get(), i, pendingIntent));
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzbz;
    }

    public Feature[] getApiFeatures() {
        return zzbs;
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, i2, -1, new C0903k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public final void zza(int i, @Nullable Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, i2, -1, new C0904l(i, (Bundle) null)));
    }

    /* access modifiers changed from: protected */
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T getService() {
        T t;
        synchronized (this.mLock) {
            if (this.zzci != 5) {
                checkConnected();
                C0926p.m1313a(this.zzcf != null, (Object) "Client is connected but service is null");
                t = this.zzcf;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    @WorkerThread
    public void getRemoteService(C0914j jVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.zzcl);
        getServiceRequest.f1019a = this.mContext.getPackageName();
        getServiceRequest.f1022d = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f1021c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.f1023e = getAccount() != null ? getAccount() : new Account(DEFAULT_ACCOUNT, "com.google");
            if (jVar != null) {
                getServiceRequest.f1020b = jVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f1023e = getAccount();
        }
        getServiceRequest.f1024f = zzbs;
        getServiceRequest.f1025g = getApiFeatures();
        try {
            synchronized (this.zzcc) {
                if (this.zzcd != null) {
                    this.zzcd.mo9908a(new C0901i(this, this.zzcq.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzcq.get());
        }
    }

    public void onUserSignOut(@NonNull C0897e eVar) {
        eVar.mo9692a();
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C0920m mVar;
        synchronized (this.mLock) {
            i = this.zzci;
            t = this.zzcf;
        }
        synchronized (this.zzcc) {
            mVar = this.zzcd;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzbv > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzbv;
            String format = simpleDateFormat.format(new Date(this.zzbv));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzbu > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.zzbt) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.zzbt));
                    break;
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzbu;
            String format2 = simpleDateFormat.format(new Date(this.zzbu));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzbx > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C0790d.m923a(this.zzbw));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzbx;
            String format3 = simpleDateFormat.format(new Date(this.zzbx));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    @Nullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzcc) {
            if (this.zzcd == null) {
                return null;
            }
            IBinder asBinder = this.zzcd.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: private */
    public final boolean zzl() {
        if (this.zzco || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public String getEndpointPackageName() {
        if (isConnected() && this.zzby != null) {
            return this.zzby.mo9818b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getMinApkVersion() {
        return C0851d.f948b;
    }
}
