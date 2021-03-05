package com.google.android.gms.measurement.p046a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C2128r;
import com.google.android.gms.measurement.internal.C2196bz;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.a.a */
public class C2141a {

    /* renamed from: a */
    private final C2128r f8026a;

    /* renamed from: com.google.android.gms.measurement.a.a$a */
    public interface C2142a extends C2196bz {
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    /* renamed from: a */
    public static C2141a m10368a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3, Bundle bundle) {
        return C2128r.m10295a(context, str, str2, str3, bundle).mo14116a();
    }

    public C2141a(C2128r rVar) {
        this.f8026a = rVar;
    }

    /* renamed from: a */
    public void mo14201a(String str, String str2, Bundle bundle) {
        this.f8026a.mo14124a(str, str2, bundle);
    }

    /* renamed from: a */
    public void mo14202a(String str, String str2, Object obj) {
        this.f8026a.mo14125a(str, str2, obj, true);
    }

    @WorkerThread
    /* renamed from: a */
    public Map<String, Object> mo14197a(@Nullable String str, @Nullable @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f8026a.mo14118a(str, str2, z);
    }

    /* renamed from: a */
    public void mo14199a(@NonNull Bundle bundle) {
        this.f8026a.mo14121a(bundle);
    }

    /* renamed from: b */
    public void mo14206b(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f8026a.mo14129b(str, str2, bundle);
    }

    @WorkerThread
    /* renamed from: a */
    public List<Bundle> mo14196a(@Nullable String str, @Nullable @Size(max = 23, min = 1) String str2) {
        return this.f8026a.mo14117a(str, str2);
    }

    @Nullable
    /* renamed from: a */
    public String mo14195a() {
        return this.f8026a.mo14133e();
    }

    @Nullable
    /* renamed from: b */
    public String mo14204b() {
        return this.f8026a.mo14134f();
    }

    @Nullable
    /* renamed from: c */
    public String mo14208c() {
        return this.f8026a.mo14131c();
    }

    @Nullable
    /* renamed from: d */
    public String mo14210d() {
        return this.f8026a.mo14126b();
    }

    /* renamed from: e */
    public long mo14211e() {
        return this.f8026a.mo14132d();
    }

    /* renamed from: a */
    public void mo14200a(@Size(min = 1) @NonNull String str) {
        this.f8026a.mo14123a(str);
    }

    /* renamed from: b */
    public void mo14205b(@Size(min = 1) @NonNull String str) {
        this.f8026a.mo14128b(str);
    }

    public void registerOnMeasurementEventListener(C2142a aVar) {
        this.f8026a.mo14122a((C2196bz) aVar);
    }

    public void unregisterOnMeasurementEventListener(C2142a aVar) {
        this.f8026a.mo14127b((C2196bz) aVar);
    }

    /* renamed from: b */
    public Bundle mo14203b(Bundle bundle) {
        return this.f8026a.mo14114a(bundle, true);
    }

    /* renamed from: c */
    public void mo14209c(Bundle bundle) {
        this.f8026a.mo14114a(bundle, false);
    }

    @WorkerThread
    /* renamed from: c */
    public int mo14207c(@Size(min = 1) @NonNull String str) {
        return this.f8026a.mo14130c(str);
    }

    /* renamed from: a */
    public void mo14198a(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f8026a.mo14120a(activity, str, str2);
    }

    /* renamed from: f */
    public String mo14212f() {
        return this.f8026a.mo14135g();
    }
}
