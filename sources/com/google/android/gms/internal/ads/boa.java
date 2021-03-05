package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class boa implements Comparator<bno> {
    public boa(bnz bnz) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bno bno = (bno) obj;
        bno bno2 = (bno) obj2;
        if (bno.mo12252b() < bno2.mo12252b()) {
            return -1;
        }
        if (bno.mo12252b() > bno2.mo12252b()) {
            return 1;
        }
        if (bno.mo12251a() < bno2.mo12251a()) {
            return -1;
        }
        if (bno.mo12251a() > bno2.mo12251a()) {
            return 1;
        }
        float d = (bno.mo12254d() - bno.mo12252b()) * (bno.mo12253c() - bno.mo12251a());
        float d2 = (bno2.mo12254d() - bno2.mo12252b()) * (bno2.mo12253c() - bno2.mo12251a());
        if (d > d2) {
            return -1;
        }
        if (d < d2) {
            return 1;
        }
        return 0;
    }
}
