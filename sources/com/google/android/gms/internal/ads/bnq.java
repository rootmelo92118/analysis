package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@C1598qn
public final class bnq {

    /* renamed from: a */
    private final int f4870a;

    /* renamed from: b */
    private final int f4871b;

    /* renamed from: c */
    private final int f4872c;

    /* renamed from: d */
    private final bnp f4873d = new bnu();

    public bnq(int i) {
        this.f4871b = i;
        this.f4870a = 6;
        this.f4872c = 0;
    }

    /* renamed from: a */
    public final String mo12258a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return m6070a(sb.toString());
    }

    /* renamed from: a */
    private final String m6070a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        bns bns = new bns();
        PriorityQueue priorityQueue = new PriorityQueue(this.f4871b, new bnr(this));
        for (String a : split) {
            String[] a2 = bnt.m6074a(a, false);
            if (a2.length != 0) {
                bnw.m6082a(a2, this.f4871b, this.f4870a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                bns.mo12260a(this.f4873d.mo12257a(((bnx) it.next()).f4878b));
            } catch (IOException e) {
                C1772wz.m1625b("Error while writing hash to byteStream", e);
            }
        }
        return bns.toString();
    }
}
