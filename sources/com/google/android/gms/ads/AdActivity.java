package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C1519np;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.p039a.C0722b;

public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private C1519np zzvh;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzvh = bre.m6318b().mo12321a((Activity) this);
        if (this.zzvh == null) {
            aai.m1629d("#007 Could not call remote method.", (Throwable) null);
            finish();
            return;
        }
        try {
            this.zzvh.onCreate(bundle);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.zzvh != null) {
                this.zzvh.onRestart();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.zzvh != null) {
                this.zzvh.onStart();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.zzvh != null) {
                this.zzvh.onResume();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.zzvh != null) {
                this.zzvh.onPause();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzvh != null) {
                this.zzvh.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.zzvh != null) {
                this.zzvh.onStop();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.zzvh != null) {
                this.zzvh.onDestroy();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    private final void zzay() {
        if (this.zzvh != null) {
            try {
                this.zzvh.zzay();
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        zzay();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        zzay();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzay();
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzvh != null) {
                z = this.zzvh.zzvq();
            }
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzvh.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzvh.zzq(C0722b.m769a(configuration));
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }
}
