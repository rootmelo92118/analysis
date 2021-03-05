package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.p063a.p064a.C2572h;
import org.p063a.p064a.p065a.C2560g;
import org.p063a.p064a.p066b.C2563a;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.SeedCrypt */
public class SeedCrypt extends CryptBase {
    public static final String CIPHER_SEED_CFB = "seed-cfb";

    public int getIVLength() {
        return 16;
    }

    public int getKeyLength() {
        return 16;
    }

    public static Map<String, String> getCiphers() {
        HashMap hashMap = new HashMap();
        hashMap.put(CIPHER_SEED_CFB, SeedCrypt.class.getName());
        return hashMap;
    }

    public SeedCrypt(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public C2572h getCipher(boolean z) {
        C2560g gVar = new C2560g();
        if (this._name.equals(CIPHER_SEED_CFB)) {
            return new C2563a(gVar, getIVLength() * 8);
        }
        throw new InvalidAlgorithmParameterException(this._name);
    }

    /* access modifiers changed from: protected */
    public SecretKey getKey() {
        return new SecretKeySpec(this._ssKey.getEncoded(), "AES");
    }

    /* access modifiers changed from: protected */
    public void _encrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr2 = new byte[bArr.length];
        byteArrayOutputStream.write(bArr2, 0, this.encCipher.mo15787a(bArr, 0, bArr.length, bArr2, 0));
    }

    /* access modifiers changed from: protected */
    public void _decrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr2 = new byte[bArr.length];
        byteArrayOutputStream.write(bArr2, 0, this.decCipher.mo15787a(bArr, 0, bArr.length, bArr2, 0));
    }
}
