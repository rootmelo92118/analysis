package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0772a.C0776d;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.internal.C0892c;
import com.google.android.gms.common.internal.C0905d;
import com.google.android.gms.common.internal.C0914j;
import com.google.android.gms.common.internal.C0926p;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C0772a<O extends C0776d> {

    /* renamed from: a */
    private final C0773a<?, O> f794a;

    /* renamed from: b */
    private final C0786i<?, O> f795b = null;

    /* renamed from: c */
    private final C0784g<?> f796c;

    /* renamed from: d */
    private final C0787j<?> f797d;

    /* renamed from: e */
    private final String f798e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C0773a<T extends C0783f, O> extends C0782e<T, O> {
        /* renamed from: a */
        public abstract T mo9562a(Context context, Looper looper, C0905d dVar, O o, C0792f.C0793a aVar, C0792f.C0794b bVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C0774b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C0775c<C extends C0774b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C0776d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C0777a extends C0779c, C0780d {
            /* renamed from: a */
            Account mo9563a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C0778b extends C0779c {
            /* renamed from: a */
            GoogleSignInAccount mo9564a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C0779c extends C0776d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C0780d extends C0776d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C0781e extends C0779c, C0780d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C0782e<T extends C0774b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C0783f extends C0774b {
        void connect(C0892c.C0895c cVar);

        void disconnect();

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        int getMinApkVersion();

        void getRemoteService(C0914j jVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(C0892c.C0897e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C0784g<C extends C0783f> extends C0775c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C0785h<T extends IInterface> extends C0774b {
        /* renamed from: a */
        T mo9576a(IBinder iBinder);

        /* renamed from: a */
        String mo9577a();

        /* renamed from: a */
        void mo9578a(int i, T t);

        /* renamed from: b */
        String mo9579b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class C0786i<T extends C0785h, O> extends C0782e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C0787j<C extends C0785h> extends C0775c<C> {
    }

    public <C extends C0783f> C0772a(String str, C0773a<C, O> aVar, C0784g<C> gVar) {
        C0926p.m1307a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C0926p.m1307a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f798e = str;
        this.f794a = aVar;
        this.f796c = gVar;
        this.f797d = null;
    }

    /* renamed from: a */
    public final C0773a<?, O> mo9560a() {
        C0926p.m1313a(this.f794a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f794a;
    }

    /* renamed from: b */
    public final String mo9561b() {
        return this.f798e;
    }
}
