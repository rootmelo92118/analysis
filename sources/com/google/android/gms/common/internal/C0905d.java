package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.p034v4.util.ArraySet;
import android.view.View;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C2304a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C0905d {

    /* renamed from: a */
    private final Account f1081a;

    /* renamed from: b */
    private final Set<Scope> f1082b;

    /* renamed from: c */
    private final Set<Scope> f1083c;

    /* renamed from: d */
    private final Map<C0772a<?>, C0907b> f1084d;

    /* renamed from: e */
    private final int f1085e;

    /* renamed from: f */
    private final View f1086f;

    /* renamed from: g */
    private final String f1087g;

    /* renamed from: h */
    private final String f1088h;

    /* renamed from: i */
    private final C2304a f1089i;

    /* renamed from: j */
    private Integer f1090j;

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C0907b {

        /* renamed from: a */
        public final Set<Scope> f1099a;
    }

    public C0905d(Account account, Set<Scope> set, Map<C0772a<?>, C0907b> map, int i, View view, String str, String str2, C2304a aVar) {
        this.f1081a = account;
        this.f1082b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f1084d = map == null ? Collections.EMPTY_MAP : map;
        this.f1086f = view;
        this.f1085e = i;
        this.f1087g = str;
        this.f1088h = str2;
        this.f1089i = aVar;
        HashSet hashSet = new HashSet(this.f1082b);
        for (C0907b bVar : this.f1084d.values()) {
            hashSet.addAll(bVar.f1099a);
        }
        this.f1083c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C0906a {

        /* renamed from: a */
        private Account f1091a;

        /* renamed from: b */
        private ArraySet<Scope> f1092b;

        /* renamed from: c */
        private Map<C0772a<?>, C0907b> f1093c;

        /* renamed from: d */
        private int f1094d = 0;

        /* renamed from: e */
        private View f1095e;

        /* renamed from: f */
        private String f1096f;

        /* renamed from: g */
        private String f1097g;

        /* renamed from: h */
        private C2304a f1098h = C2304a.f8690a;

        /* renamed from: a */
        public final C0906a mo9890a(Account account) {
            this.f1091a = account;
            return this;
        }

        /* renamed from: a */
        public final C0906a mo9892a(Collection<Scope> collection) {
            if (this.f1092b == null) {
                this.f1092b = new ArraySet<>();
            }
            this.f1092b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C0906a mo9891a(String str) {
            this.f1096f = str;
            return this;
        }

        /* renamed from: b */
        public final C0906a mo9894b(String str) {
            this.f1097g = str;
            return this;
        }

        /* renamed from: a */
        public final C0905d mo9893a() {
            return new C0905d(this.f1091a, this.f1092b, this.f1093c, this.f1094d, this.f1095e, this.f1096f, this.f1097g, this.f1098h);
        }
    }

    @Nullable
    /* renamed from: a */
    public final Account mo9881a() {
        return this.f1081a;
    }

    /* renamed from: b */
    public final Account mo9883b() {
        if (this.f1081a != null) {
            return this.f1081a;
        }
        return new Account(C0892c.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> mo9884c() {
        return this.f1082b;
    }

    /* renamed from: d */
    public final Set<Scope> mo9885d() {
        return this.f1083c;
    }

    @Nullable
    /* renamed from: e */
    public final String mo9886e() {
        return this.f1087g;
    }

    @Nullable
    /* renamed from: f */
    public final String mo9887f() {
        return this.f1088h;
    }

    @Nullable
    /* renamed from: g */
    public final C2304a mo9888g() {
        return this.f1089i;
    }

    @Nullable
    /* renamed from: h */
    public final Integer mo9889h() {
        return this.f1090j;
    }

    /* renamed from: a */
    public final void mo9882a(Integer num) {
        this.f1090j = num;
    }
}
