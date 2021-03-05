package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public class C2347f extends C2348g {

    /* renamed from: a */
    private final List<C2340a<?>> f8779a;

    public C2347f(List<C2340a<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f8779a = list;
    }
}
