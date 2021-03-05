package com.google.android.gms.internal.ads;

import java.io.IOException;

public class bjm extends IOException {

    /* renamed from: a */
    private final int f4492a;

    /* renamed from: b */
    private final bji f4493b;

    public bjm(String str, bji bji, int i) {
        super(str);
        this.f4493b = bji;
        this.f4492a = 1;
    }

    public bjm(IOException iOException, bji bji, int i) {
        super(iOException);
        this.f4493b = bji;
        this.f4492a = i;
    }

    public bjm(String str, IOException iOException, bji bji, int i) {
        super(str, iOException);
        this.f4493b = bji;
        this.f4492a = 1;
    }
}
