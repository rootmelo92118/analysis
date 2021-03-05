package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class bns {

    /* renamed from: a */
    private ByteArrayOutputStream f4874a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    private Base64OutputStream f4875b = new Base64OutputStream(this.f4874a, 10);

    /* renamed from: a */
    public final void mo12260a(byte[] bArr) {
        this.f4875b.write(bArr);
    }

    public final String toString() {
        try {
            this.f4875b.close();
        } catch (IOException e) {
            C1772wz.m1625b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f4874a.close();
            return this.f4874a.toString();
        } catch (IOException e2) {
            C1772wz.m1625b("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f4874a = null;
            this.f4875b = null;
        }
    }
}
