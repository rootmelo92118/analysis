package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import javax.annotation.Nonnull;

abstract class brd<T> {
    @Nullable

    /* renamed from: a */
    private static final bsh f5170a = m6310c();

    brd() {
    }

    /* access modifiers changed from: protected */
    @Nonnull
    /* renamed from: a */
    public abstract T mo12322a();

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public abstract T mo12323a(bsh bsh);

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b */
    public abstract T mo12324b();

    @Nullable
    /* renamed from: c */
    private static bsh m6310c() {
        try {
            Object newInstance = bqt.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return bsi.asInterface((IBinder) newInstance);
            }
            aai.m1630e("ClientApi class is not an instance of IBinder.");
            return null;
        } catch (Exception unused) {
            aai.m1630e("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    private final T m6311d() {
        if (f5170a == null) {
            aai.m1630e("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo12323a(f5170a);
        } catch (RemoteException e) {
            aai.m1627c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private final T m6312e() {
        try {
            return mo12324b();
        } catch (RemoteException e) {
            aai.m1627c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final T mo12325a(Context context, boolean z) {
        T t;
        boolean z2 = true;
        if (!z) {
            bre.m6317a();
            if (!C1851zx.m8599c(context, C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                aai.m1624b("Google Play Services is not available.");
                z = true;
            }
        }
        if (DynamiteModule.m1530a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m1537b(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        C1557p.m7741a(context);
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5999cA)).booleanValue()) {
            z = false;
        }
        if (z) {
            t = m6311d();
            if (t == null) {
                t = m6312e();
            }
        } else {
            T e = m6312e();
            int i = e == null ? 1 : 0;
            if (i != 0) {
                if (bre.m6324h().nextInt(((Integer) bre.m6321e().mo12778a(C1557p.f6015cQ)).intValue()) != 0) {
                    z2 = false;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    bre.m6317a().mo13301a(context, bre.m6323g().f7135a, "gmob-apps", bundle, true);
                }
            }
            t = e == null ? m6311d() : e;
        }
        return t == null ? mo12322a() : t;
    }
}
