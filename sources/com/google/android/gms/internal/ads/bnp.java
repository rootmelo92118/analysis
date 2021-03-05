package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public abstract class bnp {
    @Nullable

    /* renamed from: b */
    private static MessageDigest f4868b;

    /* renamed from: a */
    protected Object f4869a = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract byte[] mo12257a(String str);

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final MessageDigest mo12256a() {
        synchronized (this.f4869a) {
            if (f4868b != null) {
                MessageDigest messageDigest = f4868b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f4868b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f4868b;
            return messageDigest2;
        }
    }
}
