package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class bnr implements Comparator<bnx> {
    bnr(bnq bnq) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bnx bnx = (bnx) obj;
        bnx bnx2 = (bnx) obj2;
        int i = bnx.f4879c - bnx2.f4879c;
        if (i != 0) {
            return i;
        }
        return (int) (bnx.f4877a - bnx2.f4877a);
    }
}
