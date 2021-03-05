package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.k */
public final class C1422k {

    /* renamed from: a */
    private final Collection<C1259e<?>> f5587a = new ArrayList();

    /* renamed from: b */
    private final Collection<C1259e<String>> f5588b = new ArrayList();

    /* renamed from: c */
    private final Collection<C1259e<String>> f5589c = new ArrayList();

    /* renamed from: a */
    public final void mo12646a(C1259e eVar) {
        this.f5587a.add(eVar);
    }

    /* renamed from: b */
    public final void mo12648b(C1259e<String> eVar) {
        this.f5588b.add(eVar);
    }

    /* renamed from: c */
    public final void mo12649c(C1259e<String> eVar) {
        this.f5589c.add(eVar);
    }

    /* renamed from: a */
    public final void mo12645a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (C1259e next : this.f5587a) {
            if (next.mo12513c() == 1) {
                next.mo12511a(editor, next.mo12509a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            aai.m1626c("Flag Json is null.");
        }
    }

    /* renamed from: a */
    public final List<String> mo12644a() {
        ArrayList arrayList = new ArrayList();
        for (C1259e<String> a : this.f5588b) {
            String str = (String) bre.m6321e().mo12778a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> mo12647b() {
        List<String> a = mo12644a();
        for (C1259e<String> a2 : this.f5589c) {
            String str = (String) bre.m6321e().mo12778a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }
}
