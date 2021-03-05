package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class anl {

    /* renamed from: a */
    private ECPublicKey f2095a;

    public anl(ECPublicKey eCPublicKey) {
        this.f2095a = eCPublicKey;
    }

    /* renamed from: a */
    public final anm mo10737a(String str, byte[] bArr, byte[] bArr2, int i, anq anq) {
        byte[] bArr3;
        KeyPair a = ann.m2884a(this.f2095a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPublicKey eCPublicKey2 = this.f2095a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            byte[] a2 = ann.m2889a(eCPrivateKey, eCPublicKey2.getW());
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            ECPoint w = eCPublicKey.getW();
            ann.m2888a(w, curve);
            int a3 = ann.m2883a(curve);
            int i2 = 1;
            switch (ano.f2098a[anq.ordinal()]) {
                case 1:
                    int i3 = (a3 * 2) + 1;
                    bArr3 = new byte[i3];
                    byte[] byteArray = w.getAffineX().toByteArray();
                    byte[] byteArray2 = w.getAffineY().toByteArray();
                    System.arraycopy(byteArray2, 0, bArr3, i3 - byteArray2.length, byteArray2.length);
                    System.arraycopy(byteArray, 0, bArr3, (a3 + 1) - byteArray.length, byteArray.length);
                    bArr3[0] = 4;
                    break;
                case 2:
                    int i4 = a3 * 2;
                    bArr3 = new byte[i4];
                    byte[] byteArray3 = w.getAffineX().toByteArray();
                    if (byteArray3.length > a3) {
                        byteArray3 = Arrays.copyOfRange(byteArray3, byteArray3.length - a3, byteArray3.length);
                    }
                    byte[] byteArray4 = w.getAffineY().toByteArray();
                    if (byteArray4.length > a3) {
                        byteArray4 = Arrays.copyOfRange(byteArray4, byteArray4.length - a3, byteArray4.length);
                    }
                    System.arraycopy(byteArray4, 0, bArr3, i4 - byteArray4.length, byteArray4.length);
                    System.arraycopy(byteArray3, 0, bArr3, a3 - byteArray3.length, byteArray3.length);
                    break;
                case 3:
                    int i5 = a3 + 1;
                    byte[] bArr4 = new byte[i5];
                    byte[] byteArray5 = w.getAffineX().toByteArray();
                    System.arraycopy(byteArray5, 0, bArr4, i5 - byteArray5.length, byteArray5.length);
                    bArr4[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                    bArr3 = bArr4;
                    break;
                default:
                    String valueOf = String.valueOf(anq);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb.append("invalid format:");
                    sb.append(valueOf);
                    throw new GeneralSecurityException(sb.toString());
            }
            byte[] a4 = and.m2868a(bArr3, a2);
            Mac a5 = ans.f2112b.mo10740a(str);
            if (i <= a5.getMacLength() * 255) {
                if (bArr == null || bArr.length == 0) {
                    a5.init(new SecretKeySpec(new byte[a5.getMacLength()], str));
                } else {
                    a5.init(new SecretKeySpec(bArr, str));
                }
                byte[] doFinal = a5.doFinal(a4);
                byte[] bArr5 = new byte[i];
                a5.init(new SecretKeySpec(doFinal, str));
                byte[] bArr6 = new byte[0];
                int i6 = 0;
                while (true) {
                    a5.update(bArr6);
                    a5.update(bArr2);
                    a5.update((byte) i2);
                    bArr6 = a5.doFinal();
                    if (bArr6.length + i6 < i) {
                        System.arraycopy(bArr6, 0, bArr5, i6, bArr6.length);
                        i6 += bArr6.length;
                        i2++;
                    } else {
                        System.arraycopy(bArr6, 0, bArr5, i6, i - i6);
                        return new anm(bArr3, bArr5);
                    }
                }
            } else {
                throw new GeneralSecurityException("size too large");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }
}
