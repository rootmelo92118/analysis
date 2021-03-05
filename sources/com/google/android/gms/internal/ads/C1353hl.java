package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.annotation.GuardedBy;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0980p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.hl */
public class C1353hl<ReferenceT> {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, CopyOnWriteArrayList<zzu<? super ReferenceT>>> f5436a = new HashMap();

    /* renamed from: b */
    private ReferenceT f5437b;

    /* renamed from: a */
    public final void mo12598a(ReferenceT referencet) {
        this.f5437b = referencet;
    }

    /* renamed from: a */
    public final boolean mo12601a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String path = uri.getPath();
        zzbv.zzlf();
        mo10443a(path, C1782xi.m8367a(uri));
        return true;
    }

    /* renamed from: a */
    private final synchronized void mo10443a(String str, Map<String, String> map) {
        if (C1772wz.m1623a(2)) {
            String valueOf = String.valueOf(str);
            C1772wz.m8287a(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                C1772wz.m8287a(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5436a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                abl.f1313a.execute(new C1354hm(this, (zzu) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo12599a(String str, zzu<? super ReferenceT> zzu) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5436a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f5436a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzu);
    }

    /* renamed from: b */
    public final synchronized void mo12602b(String str, zzu<? super ReferenceT> zzu) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5436a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(zzu);
        }
    }

    /* renamed from: a */
    public final synchronized void mo12600a(String str, C0980p<zzu<? super ReferenceT>> pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5436a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzu zzu = (zzu) it.next();
                if (pVar.mo9999a(zzu)) {
                    arrayList.add(zzu);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: d */
    public final synchronized void mo12603d() {
        this.f5436a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12597a(zzu zzu, Map map) {
        zzu.zza(this.f5437b, map);
    }
}
