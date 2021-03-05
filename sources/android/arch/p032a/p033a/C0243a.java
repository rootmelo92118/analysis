package android.arch.p032a.p033a;

import android.arch.p032a.p033a.C0244b;
import android.support.annotation.RestrictTo;
import java.util.HashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.arch.a.a.a */
/* compiled from: FastSafeIterableMap */
public class C0243a<K, V> extends C0244b<K, V> {

    /* renamed from: a */
    private HashMap<K, C0244b.C0248c<K, V>> f495a = new HashMap<>();

    /* renamed from: a */
    public boolean mo438a(K k) {
        return this.f495a.containsKey(k);
    }
}
