package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.akf;
import com.google.android.gms.internal.ads.akj;
import com.google.android.gms.internal.ads.akv;
import com.google.android.gms.internal.ads.alu;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class ajz implements anh {

    /* renamed from: a */
    private final String f1875a;

    /* renamed from: b */
    private final int f1876b;

    /* renamed from: c */
    private akv f1877c;

    /* renamed from: d */
    private akf f1878d;

    /* renamed from: e */
    private int f1879e;

    ajz(amg amg) {
        this.f1875a = amg.mo10687a();
        if (this.f1875a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                akx a = akx.m2604a(amg.mo10688b());
                this.f1877c = (akv) aje.m2411b(amg);
                this.f1876b = a.mo10643a();
            } catch (aqv e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f1875a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                akh a2 = akh.m2535a(amg.mo10688b());
                this.f1878d = (akf) aje.m2411b(amg);
                this.f1879e = a2.mo10619a().mo10628b();
                this.f1876b = this.f1879e + a2.mo10620b().mo10678b();
            } catch (aqv e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.f1875a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    /* renamed from: a */
    public final int mo10610a() {
        return this.f1876b;
    }

    /* renamed from: a */
    public final aio mo10611a(byte[] bArr) {
        if (bArr.length != this.f1876b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f1875a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (aio) aje.m2412b(this.f1875a, (akv) ((aqn) ((akv.C1036a) akv.m2597c().mo10758a(this.f1877c)).mo10642a(apc.m2987a(bArr, 0, this.f1876b)).mo11030f()));
        } else if (this.f1875a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f1879e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f1879e, this.f1876b);
            akf.C1028a a = akf.m2526d().mo10616a(this.f1878d.mo10612a()).mo10617a((akj) ((aqn) ((akj.C1030a) akj.m2547d().mo10758a(this.f1878d.mo10614b())).mo10626a(apc.m2986a(copyOfRange)).mo11030f()));
            return (aio) aje.m2412b(this.f1875a, (akf) ((aqn) a.mo10618a((alu) ((aqn) ((alu.C1046a) alu.m2696d().mo10758a(this.f1878d.mo10615c())).mo10676a(apc.m2986a(copyOfRange2)).mo11030f())).mo11030f()));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
