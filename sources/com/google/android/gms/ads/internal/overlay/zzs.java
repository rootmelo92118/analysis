package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C1520nq;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.p039a.C0719a;

@C1598qn
public final class zzs extends C1520nq {
    private AdOverlayInfoParcel zzdsg;
    private boolean zzdsh = false;
    private boolean zzdsi = false;
    private Activity zzug;

    public zzs(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdsg = adOverlayInfoParcel;
        this.zzug = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
    }

    public final void onRestart() {
    }

    public final void onStart() {
    }

    public final void zzay() {
    }

    public final void zzq(C0719a aVar) {
    }

    public final boolean zzvq() {
        return false;
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        if (this.zzdsg == null) {
            this.zzug.finish();
        } else if (z) {
            this.zzug.finish();
        } else {
            if (bundle == null) {
                if (this.zzdsg.zzdrt != null) {
                    this.zzdsg.zzdrt.onAdClicked();
                }
                if (!(this.zzug.getIntent() == null || !this.zzug.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.zzdsg.zzdru == null)) {
                    this.zzdsg.zzdru.zziw();
                }
            }
            zzbv.zzlc();
            if (!zza.zza((Context) this.zzug, this.zzdsg.zzdrs, this.zzdsg.zzdrz)) {
                this.zzug.finish();
            }
        }
    }

    public final void onResume() {
        if (this.zzdsh) {
            this.zzug.finish();
            return;
        }
        this.zzdsh = true;
        if (this.zzdsg.zzdru != null) {
            this.zzdsg.zzdru.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdsh);
    }

    public final void onPause() {
        if (this.zzdsg.zzdru != null) {
            this.zzdsg.zzdru.onPause();
        }
        if (this.zzug.isFinishing()) {
            zzvy();
        }
    }

    public final void onStop() {
        if (this.zzug.isFinishing()) {
            zzvy();
        }
    }

    public final void onDestroy() {
        if (this.zzug.isFinishing()) {
            zzvy();
        }
    }

    private final synchronized void zzvy() {
        if (!this.zzdsi) {
            if (this.zzdsg.zzdru != null) {
                this.zzdsg.zzdru.zziv();
            }
            this.zzdsi = true;
        }
    }
}
