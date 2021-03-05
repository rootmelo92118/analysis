package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.C2332a;
import com.google.firebase.components.C2340a;
import com.google.firebase.components.C2345d;
import com.google.firebase.components.C2346e;
import com.google.firebase.p047a.C2331d;
import java.util.Collections;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements C2345d {
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C2340a<?>> getComponents() {
        return Collections.singletonList(C2340a.m11547a(C2332a.class).mo14930a(C2346e.m11571a(FirebaseApp.class)).mo14930a(C2346e.m11571a(Context.class)).mo14930a(C2346e.m11571a(C2331d.class)).mo14929a(C2336a.f8756a).mo14931b().mo14932c());
    }
}
