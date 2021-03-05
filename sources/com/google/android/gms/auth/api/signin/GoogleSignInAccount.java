package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p034v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.common.util.C0972h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0728a();

    /* renamed from: a */
    private static C0969e f665a = C0972h.m1482d();

    /* renamed from: b */
    private final int f666b;

    /* renamed from: c */
    private String f667c;

    /* renamed from: d */
    private String f668d;

    /* renamed from: e */
    private String f669e;

    /* renamed from: f */
    private String f670f;

    /* renamed from: g */
    private Uri f671g;

    /* renamed from: h */
    private String f672h;

    /* renamed from: i */
    private long f673i;

    /* renamed from: j */
    private String f674j;

    /* renamed from: k */
    private List<Scope> f675k;

    /* renamed from: l */
    private String f676l;

    /* renamed from: m */
    private String f677m;

    /* renamed from: n */
    private Set<Scope> f678n = new HashSet();

    @Nullable
    /* renamed from: a */
    public static GoogleSignInAccount m773a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m774a(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f672h = jSONObject.optString("serverAuthCode", (String) null);
        return a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m774a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, (l == null ? Long.valueOf(f665a.mo9996a() / 1000) : l).longValue(), C0926p.m1308a(str7), new ArrayList((Collection) C0926p.m1306a(set)), str5, str6);
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f666b = i;
        this.f667c = str;
        this.f668d = str2;
        this.f669e = str3;
        this.f670f = str4;
        this.f671g = uri;
        this.f672h = str5;
        this.f673i = j;
        this.f674j = str6;
        this.f675k = list;
        this.f676l = str7;
        this.f677m = str8;
    }

    @Nullable
    /* renamed from: a */
    public String mo9427a() {
        return this.f667c;
    }

    @Nullable
    /* renamed from: b */
    public String mo9428b() {
        return this.f668d;
    }

    @Nullable
    /* renamed from: c */
    public String mo9429c() {
        return this.f669e;
    }

    @Nullable
    /* renamed from: d */
    public Account mo9430d() {
        if (this.f669e == null) {
            return null;
        }
        return new Account(this.f669e, "com.google");
    }

    @Nullable
    /* renamed from: e */
    public String mo9431e() {
        return this.f670f;
    }

    @Nullable
    /* renamed from: f */
    public String mo9433f() {
        return this.f676l;
    }

    @Nullable
    /* renamed from: g */
    public String mo9434g() {
        return this.f677m;
    }

    @Nullable
    /* renamed from: h */
    public Uri mo9435h() {
        return this.f671g;
    }

    @Nullable
    /* renamed from: i */
    public String mo9437i() {
        return this.f672h;
    }

    @NonNull
    /* renamed from: j */
    public Set<Scope> mo9438j() {
        HashSet hashSet = new HashSet(this.f675k);
        hashSet.addAll(this.f678n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f666b);
        C0932b.m1377a(parcel, 2, mo9427a(), false);
        C0932b.m1377a(parcel, 3, mo9428b(), false);
        C0932b.m1377a(parcel, 4, mo9429c(), false);
        C0932b.m1377a(parcel, 5, mo9431e(), false);
        C0932b.m1372a(parcel, 6, (Parcelable) mo9435h(), i, false);
        C0932b.m1377a(parcel, 7, mo9437i(), false);
        C0932b.m1368a(parcel, 8, this.f673i);
        C0932b.m1377a(parcel, 9, this.f674j, false);
        C0932b.m1388c(parcel, 10, this.f675k, false);
        C0932b.m1377a(parcel, 11, mo9433f(), false);
        C0932b.m1377a(parcel, 12, mo9434g(), false);
        C0932b.m1365a(parcel, a);
    }

    public int hashCode() {
        return ((this.f674j.hashCode() + 527) * 31) + mo9438j().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f674j.equals(this.f674j) && googleSignInAccount.mo9438j().equals(mo9438j());
    }
}
