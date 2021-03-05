package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class bnw {
    /* renamed from: a */
    public static void m6082a(String[] strArr, int i, int i2, PriorityQueue<bnx> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m6081a(i, m6083b(strArr2, 0, strArr2.length), m6080a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m6083b(strArr2, 0, i3);
        m6081a(i, b, m6080a(strArr2, 0, i3), i2, priorityQueue);
        long a = m6079a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) bnt.m6073a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) bnt.m6073a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m6081a(i, b, m6080a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: a */
    private static void m6081a(int i, long j, String str, int i2, PriorityQueue<bnx> priorityQueue) {
        bnx bnx = new bnx(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f4879c <= bnx.f4879c && priorityQueue.peek().f4877a <= bnx.f4877a)) && !priorityQueue.contains(bnx)) {
            priorityQueue.add(bnx);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    private static String m6080a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C1772wz.m1626c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    private static long m6083b(String[] strArr, int i, int i2) {
        long a = (((long) bnt.m6073a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) bnt.m6073a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    /* renamed from: a */
    private static long m6079a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        if (i % 2 == 0) {
            return m6079a((j * j) % 1073807359, i / 2) % 1073807359;
        }
        return (j * (m6079a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }
}
