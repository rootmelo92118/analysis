package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p034v4.app.Fragment;
import android.support.p034v4.app.FragmentActivity;
import android.support.p034v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements C0821e {

    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<zzc>> f934a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f935b = new ArrayMap();

    /* renamed from: c */
    private int f936c = 0;

    /* renamed from: d */
    private Bundle f937d;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f936c = 1;
        this.f937d = bundle;
        for (Map.Entry next : this.f935b.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo9602a(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f936c = 2;
        for (LifecycleCallback b : this.f935b.values()) {
            b.mo9604b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f936c = 3;
        for (LifecycleCallback c : this.f935b.values()) {
            c.mo9606c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f935b.values()) {
            a.mo9601a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f935b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo9605b(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f936c = 4;
        for (LifecycleCallback d : this.f935b.values()) {
            d.mo9607d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f936c = 5;
        for (LifecycleCallback e : this.f935b.values()) {
            e.mo9608e();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f935b.values()) {
            a.mo9603a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Activity mo9674a() {
        return getActivity();
    }
}
