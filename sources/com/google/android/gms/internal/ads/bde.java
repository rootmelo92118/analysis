package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class bde extends bdd {

    /* renamed from: aP */
    public final long f3740aP;

    /* renamed from: aQ */
    public final List<bdf> f3741aQ = new ArrayList();

    /* renamed from: aR */
    public final List<bde> f3742aR = new ArrayList();

    public bde(int i, long j) {
        super(i);
        this.f3740aP = j;
    }

    /* renamed from: a */
    public final void mo11720a(bdf bdf) {
        this.f3741aQ.add(bdf);
    }

    /* renamed from: a */
    public final void mo11719a(bde bde) {
        this.f3742aR.add(bde);
    }

    /* renamed from: d */
    public final bdf mo11721d(int i) {
        int size = this.f3741aQ.size();
        for (int i2 = 0; i2 < size; i2++) {
            bdf bdf = this.f3741aQ.get(i2);
            if (bdf.f3739aO == i) {
                return bdf;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final bde mo11722e(int i) {
        int size = this.f3742aR.size();
        for (int i2 = 0; i2 < size; i2++) {
            bde bde = this.f3742aR.get(i2);
            if (bde.f3739aO == i) {
                return bde;
            }
        }
        return null;
    }

    public final String toString() {
        String c = m5027c(this.f3739aO);
        String arrays = Arrays.toString(this.f3741aQ.toArray());
        String arrays2 = Arrays.toString(this.f3742aR.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
