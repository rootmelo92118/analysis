package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.np */
public interface C1519np extends IInterface {
    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onRestart();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void zzay();

    void zzq(C0719a aVar);

    boolean zzvq();
}
