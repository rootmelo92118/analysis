package org.apache.http.p070b;

import org.apache.http.C2578a;
import org.apache.http.C2581b;
import org.apache.http.C2598i;
import org.apache.http.C2600k;
import org.apache.http.p072d.C2591a;
import org.apache.http.p072d.C2593c;

/* renamed from: org.apache.http.b.d */
/* compiled from: BasicLineFormatter */
public class C2585d {
    @Deprecated

    /* renamed from: a */
    public static final C2585d f9133a = new C2585d();

    /* renamed from: b */
    public static final C2585d f9134b = new C2585d();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2593c mo15815a(C2593c cVar) {
        if (cVar == null) {
            return new C2593c(64);
        }
        cVar.mo15831a();
        return cVar;
    }

    /* renamed from: a */
    public C2593c mo15817a(C2593c cVar, C2598i iVar) {
        C2591a.m12012a(iVar, "Protocol version");
        int a = mo15814a(iVar);
        if (cVar == null) {
            cVar = new C2593c(a);
        } else {
            cVar.mo15833a(a);
        }
        cVar.mo15834a(iVar.mo15839a());
        cVar.mo15832a('/');
        cVar.mo15834a(Integer.toString(iVar.mo15840b()));
        cVar.mo15832a('.');
        cVar.mo15834a(Integer.toString(iVar.mo15841c()));
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15814a(C2598i iVar) {
        return iVar.mo15839a().length() + 4;
    }

    /* renamed from: a */
    public C2593c mo15818a(C2593c cVar, C2600k kVar) {
        C2591a.m12012a(kVar, "Status line");
        C2593c a = mo15815a(cVar);
        mo15820b(a, kVar);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15820b(C2593c cVar, C2600k kVar) {
        int a = mo15814a(kVar.mo15821a()) + 1 + 3 + 1;
        String c = kVar.mo15823c();
        if (c != null) {
            a += c.length();
        }
        cVar.mo15833a(a);
        mo15817a(cVar, kVar.mo15821a());
        cVar.mo15832a(' ');
        cVar.mo15834a(Integer.toString(kVar.mo15822b()));
        cVar.mo15832a(' ');
        if (c != null) {
            cVar.mo15834a(c);
        }
    }

    /* renamed from: a */
    public C2593c mo15816a(C2593c cVar, C2581b bVar) {
        C2591a.m12012a(bVar, "Header");
        if (bVar instanceof C2578a) {
            return ((C2578a) bVar).mo15797a();
        }
        C2593c a = mo15815a(cVar);
        mo15819b(a, bVar);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15819b(C2593c cVar, C2581b bVar) {
        String b = bVar.mo15805b();
        String c = bVar.mo15806c();
        int length = b.length() + 2;
        if (c != null) {
            length += c.length();
        }
        cVar.mo15833a(length);
        cVar.mo15834a(b);
        cVar.mo15834a(": ");
        if (c != null) {
            cVar.mo15833a(cVar.length() + c.length());
            for (int i = 0; i < c.length(); i++) {
                char charAt = c.charAt(i);
                if (charAt == 13 || charAt == 10 || charAt == 12 || charAt == 11) {
                    charAt = ' ';
                }
                cVar.mo15832a(charAt);
            }
        }
    }
}
