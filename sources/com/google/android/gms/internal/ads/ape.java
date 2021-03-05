package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class ape implements Comparator<apc> {
    ape() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        apc apc = (apc) obj;
        apc apc2 = (apc) obj2;
        apj apj = (apj) apc.iterator();
        apj apj2 = (apj) apc2.iterator();
        while (apj.hasNext() && apj2.hasNext()) {
            int compare = Integer.compare(apc.m2988b(apj.mo10807a()), apc.m2988b(apj2.mo10807a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(apc.mo10792a(), apc2.mo10792a());
    }
}
