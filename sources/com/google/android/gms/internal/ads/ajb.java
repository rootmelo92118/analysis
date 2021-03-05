package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amk;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ajb<P> {

    /* renamed from: a */
    private static final Charset f1848a = Charset.forName("UTF-8");

    /* renamed from: b */
    private ConcurrentMap<String, List<ajd<P>>> f1849b = new ConcurrentHashMap();

    /* renamed from: c */
    private ajd<P> f1850c;

    /* renamed from: a */
    public final ajd<P> mo10604a() {
        return this.f1850c;
    }

    /* renamed from: b */
    public final Collection<List<ajd<P>>> mo10607b() {
        return this.f1849b.values();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10606a(ajd<P> ajd) {
        this.f1850c = ajd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ajd<P> mo10605a(P p, amk.C1055b bVar) {
        byte[] bArr;
        switch (ais.f1845a[bVar.mo10706e().ordinal()]) {
            case 1:
            case 2:
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.mo10705d()).array();
                break;
            case 3:
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.mo10705d()).array();
                break;
            case 4:
                bArr = air.f1844a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        ajd<P> ajd = new ajd<>(p, bArr, bVar.mo10704c(), bVar.mo10706e());
        ArrayList arrayList = new ArrayList();
        arrayList.add(ajd);
        String str = new String(ajd.mo10609b(), f1848a);
        List list = (List) this.f1849b.put(str, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(ajd);
            this.f1849b.put(str, Collections.unmodifiableList(arrayList2));
        }
        return ajd;
    }
}
