package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.aa */
final class C2366aa implements Runnable {

    /* renamed from: a */
    private final long f8823a;

    /* renamed from: b */
    private final PowerManager.WakeLock f8824b = ((PowerManager) mo14976a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c */
    private final FirebaseInstanceId f8825c;

    /* renamed from: d */
    private final C2406p f8826d;

    /* renamed from: e */
    private final C2368ac f8827e;

    C2366aa(FirebaseInstanceId firebaseInstanceId, C2406p pVar, C2368ac acVar, long j) {
        this.f8825c = firebaseInstanceId;
        this.f8826d = pVar;
        this.f8827e = acVar;
        this.f8823a = j;
        this.f8824b.setReferenceCounted(false);
    }

    public final void run() {
        this.f8824b.acquire();
        try {
            this.f8825c.mo14959a(true);
            if (!this.f8825c.mo14966h()) {
                this.f8825c.mo14959a(false);
            } else if (!mo14977b()) {
                new C2367ab(this).mo14979a();
                this.f8824b.release();
            } else {
                if (!m11646c() || !m11647d() || !this.f8827e.mo14982a(this.f8825c)) {
                    this.f8825c.mo14955a(this.f8823a);
                } else {
                    this.f8825c.mo14959a(false);
                }
                this.f8824b.release();
            }
        } finally {
            this.f8824b.release();
        }
    }

    /* renamed from: c */
    private final boolean m11646c() {
        try {
            if (this.f8825c.mo14967i()) {
                return true;
            }
            this.f8825c.mo14968j();
            return true;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Build channel failed: ".concat(valueOf) : new String("Build channel failed: "));
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m11647d() {
        C2416z d = this.f8825c.mo14963d();
        if (d != null && !d.mo15048b(this.f8826d.mo15033b())) {
            return true;
        }
        try {
            String e = this.f8825c.mo14964e();
            if (e == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (d == null || (d != null && !e.equals(d.f8935a))) {
                Context a = mo14976a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", e);
                C2414x.m11762b(a, intent);
                C2414x.m11760a(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo14976a() {
        return this.f8825c.mo14960b().mo14890a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14977b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo14976a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
