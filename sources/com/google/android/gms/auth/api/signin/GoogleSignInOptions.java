package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.p034v4.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.C0731a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C0772a.C0776d.C0781e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C0730c();

    /* renamed from: a */
    public static final Scope f679a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f680b = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: c */
    public static final Scope f681c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f682d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public static final Scope f683e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f684f = new C0727a().mo9450a().mo9452b().mo9453c();

    /* renamed from: g */
    public static final GoogleSignInOptions f685g = new C0727a().mo9451a(f682d, new Scope[0]).mo9453c();

    /* renamed from: r */
    private static Comparator<Scope> f686r = new C0729b();

    /* renamed from: h */
    private final int f687h;

    /* renamed from: i */
    private final ArrayList<Scope> f688i;

    /* renamed from: j */
    private Account f689j;

    /* renamed from: k */
    private boolean f690k;

    /* renamed from: l */
    private final boolean f691l;

    /* renamed from: m */
    private final boolean f692m;

    /* renamed from: n */
    private String f693n;

    /* renamed from: o */
    private String f694o;

    /* renamed from: p */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f695p;

    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f696q;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C0727a {

        /* renamed from: a */
        private Set<Scope> f697a = new HashSet();

        /* renamed from: b */
        private boolean f698b;

        /* renamed from: c */
        private boolean f699c;

        /* renamed from: d */
        private boolean f700d;

        /* renamed from: e */
        private String f701e;

        /* renamed from: f */
        private Account f702f;

        /* renamed from: g */
        private String f703g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f704h = new HashMap();

        /* renamed from: a */
        public final C0727a mo9450a() {
            this.f697a.add(GoogleSignInOptions.f681c);
            return this;
        }

        /* renamed from: b */
        public final C0727a mo9452b() {
            this.f697a.add(GoogleSignInOptions.f679a);
            return this;
        }

        /* renamed from: a */
        public final C0727a mo9451a(Scope scope, Scope... scopeArr) {
            this.f697a.add(scope);
            this.f697a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: c */
        public final GoogleSignInOptions mo9453c() {
            if (this.f697a.contains(GoogleSignInOptions.f683e) && this.f697a.contains(GoogleSignInOptions.f682d)) {
                this.f697a.remove(GoogleSignInOptions.f682d);
            }
            if (this.f700d && (this.f702f == null || !this.f697a.isEmpty())) {
                mo9450a();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f697a), this.f702f, this.f700d, this.f698b, this.f699c, this.f701e, this.f703g, this.f704h, (C0729b) null);
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m785a(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f687h = i;
        this.f688i = arrayList;
        this.f689j = account;
        this.f690k = z;
        this.f691l = z2;
        this.f692m = z3;
        this.f693n = str;
        this.f694o = str2;
        this.f695p = new ArrayList<>(map.values());
        this.f696q = map;
    }

    /* renamed from: a */
    public ArrayList<Scope> mo9440a() {
        return new ArrayList<>(this.f688i);
    }

    /* renamed from: b */
    public Account mo9441b() {
        return this.f689j;
    }

    /* renamed from: c */
    public boolean mo9442c() {
        return this.f690k;
    }

    /* renamed from: d */
    public boolean mo9443d() {
        return this.f691l;
    }

    /* renamed from: e */
    public boolean mo9444e() {
        return this.f692m;
    }

    /* renamed from: f */
    public String mo9446f() {
        return this.f693n;
    }

    /* renamed from: g */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo9447g() {
        return this.f695p;
    }

    /* renamed from: a */
    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> m785a(@Nullable List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.mo9459a()), next);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f687h);
        C0932b.m1388c(parcel, 2, mo9440a(), false);
        C0932b.m1372a(parcel, 3, (Parcelable) mo9441b(), i, false);
        C0932b.m1379a(parcel, 4, mo9442c());
        C0932b.m1379a(parcel, 5, mo9443d());
        C0932b.m1379a(parcel, 6, mo9444e());
        C0932b.m1377a(parcel, 7, mo9446f(), false);
        C0932b.m1377a(parcel, 8, this.f694o, false);
        C0932b.m1388c(parcel, 9, mo9447g(), false);
        C0932b.m1365a(parcel, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f689j.equals(r4.mo9441b()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f693n.equals(r4.mo9446f()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0088 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f695p     // Catch:{ ClassCastException -> 0x0088 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 > 0) goto L_0x0087
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f695p     // Catch:{ ClassCastException -> 0x0088 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0087
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f688i     // Catch:{ ClassCastException -> 0x0088 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0088 }
            java.util.ArrayList r2 = r4.mo9440a()     // Catch:{ ClassCastException -> 0x0088 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r2) goto L_0x0086
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f688i     // Catch:{ ClassCastException -> 0x0088 }
            java.util.ArrayList r2 = r4.mo9440a()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0086
        L_0x0035:
            android.accounts.Account r1 = r3.f689j     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo9441b()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f689j     // Catch:{ ClassCastException -> 0x0088 }
            android.accounts.Account r2 = r4.mo9441b()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.f693n     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo9446f()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f693n     // Catch:{ ClassCastException -> 0x0088 }
            java.lang.String r2 = r4.mo9446f()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.f692m     // Catch:{ ClassCastException -> 0x0088 }
            boolean r2 = r4.mo9444e()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f690k     // Catch:{ ClassCastException -> 0x0088 }
            boolean r2 = r4.mo9442c()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f691l     // Catch:{ ClassCastException -> 0x0088 }
            boolean r4 = r4.mo9443d()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        L_0x0086:
            return r0
        L_0x0087:
            return r0
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f688i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo9546a());
        }
        Collections.sort(arrayList);
        return new C0731a().mo9462a((Object) arrayList).mo9462a((Object) this.f689j).mo9462a((Object) this.f693n).mo9463a(this.f692m).mo9463a(this.f690k).mo9463a(this.f691l).mo9461a();
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C0729b bVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }
}
