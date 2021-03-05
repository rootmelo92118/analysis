package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
public final class bao {

    /* renamed from: a */
    private static final bao f3301a = new bao(new int[]{2}, 2);

    /* renamed from: b */
    private final int[] f3302b;

    /* renamed from: c */
    private final int f3303c = 2;

    private bao(int[] iArr, int i) {
        this.f3302b = Arrays.copyOf(iArr, iArr.length);
        Arrays.sort(this.f3302b);
    }

    /* renamed from: a */
    public final boolean mo11534a(int i) {
        return Arrays.binarySearch(this.f3302b, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bao)) {
            return false;
        }
        bao bao = (bao) obj;
        return Arrays.equals(this.f3302b, bao.f3302b) && this.f3303c == bao.f3303c;
    }

    public final int hashCode() {
        return this.f3303c + (Arrays.hashCode(this.f3302b) * 31);
    }

    public final String toString() {
        int i = this.f3303c;
        String arrays = Arrays.toString(this.f3302b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
