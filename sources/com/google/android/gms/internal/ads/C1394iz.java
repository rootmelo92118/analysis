package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.iz */
public final class C1394iz implements C1349hh, C1393iy {

    /* renamed from: a */
    private final C1392ix f5510a;

    /* renamed from: b */
    private final HashSet<AbstractMap.SimpleEntry<String, zzu<? super C1392ix>>> f5511b = new HashSet<>();

    public C1394iz(C1392ix ixVar) {
        this.f5510a = ixVar;
    }

    /* renamed from: a */
    public final void mo10524a(String str, String str2) {
        C1350hi.m6990a((C1349hh) this, str, str2);
    }

    /* renamed from: a */
    public final void mo10443a(String str, Map map) {
        C1350hi.m6991a((C1349hh) this, str, map);
    }

    /* renamed from: a */
    public final void mo10444a(String str, JSONObject jSONObject) {
        C1350hi.m6993b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo10448b(String str, JSONObject jSONObject) {
        C1350hi.m6992a((C1349hh) this, str, jSONObject);
    }

    /* renamed from: d */
    public final void mo10449d(String str) {
        this.f5510a.mo10449d(str);
    }

    /* renamed from: a */
    public final void mo12606a(String str, zzu<? super C1392ix> zzu) {
        this.f5510a.mo12606a(str, zzu);
        this.f5511b.add(new AbstractMap.SimpleEntry(str, zzu));
    }

    /* renamed from: b */
    public final void mo12607b(String str, zzu<? super C1392ix> zzu) {
        this.f5510a.mo12607b(str, zzu);
        this.f5511b.remove(new AbstractMap.SimpleEntry(str, zzu));
    }

    /* renamed from: a */
    public final void mo12629a() {
        Iterator<AbstractMap.SimpleEntry<String, zzu<? super C1392ix>>> it = this.f5511b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((zzu) next.getValue()).toString());
            C1772wz.m8287a(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f5510a.mo12607b((String) next.getKey(), (zzu) next.getValue());
        }
        this.f5511b.clear();
    }
}
