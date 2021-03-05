package com.google.android.gms.internal.ads;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ll */
public final class C1461ll implements MediationAdRequest {

    /* renamed from: a */
    private final Date f5666a;

    /* renamed from: b */
    private final int f5667b;

    /* renamed from: c */
    private final Set<String> f5668c;

    /* renamed from: d */
    private final boolean f5669d;

    /* renamed from: e */
    private final Location f5670e;

    /* renamed from: f */
    private final int f5671f;

    /* renamed from: g */
    private final boolean f5672g;

    public C1461ll(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, boolean z2) {
        this.f5666a = date;
        this.f5667b = i;
        this.f5668c = set;
        this.f5670e = location;
        this.f5669d = z;
        this.f5671f = i2;
        this.f5672g = z2;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f5666a;
    }

    @Deprecated
    public final int getGender() {
        return this.f5667b;
    }

    public final Set<String> getKeywords() {
        return this.f5668c;
    }

    public final Location getLocation() {
        return this.f5670e;
    }

    public final boolean isTesting() {
        return this.f5669d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f5671f;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f5672g;
    }
}
