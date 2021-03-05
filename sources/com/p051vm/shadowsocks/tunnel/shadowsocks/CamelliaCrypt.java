package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.p063a.p064a.C2572h;
import org.p063a.p064a.p065a.C2556c;
import org.p063a.p064a.p066b.C2563a;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.CamelliaCrypt */
public class CamelliaCrypt extends CryptBase {
    public static final String CIPHER_CAMELLIA_128_CFB = "camellia-128-cfb";
    public static final String CIPHER_CAMELLIA_192_CFB = "camellia-192-cfb";
    public static final String CIPHER_CAMELLIA_256_CFB = "camellia-256-cfb";

    public int getIVLength() {
        return 16;
    }

    public static Map<String, String> getCiphers() {
        HashMap hashMap = new HashMap();
        hashMap.put(CIPHER_CAMELLIA_128_CFB, CamelliaCrypt.class.getName());
        hashMap.put(CIPHER_CAMELLIA_192_CFB, CamelliaCrypt.class.getName());
        hashMap.put(CIPHER_CAMELLIA_256_CFB, CamelliaCrypt.class.getName());
        return hashMap;
    }

    public CamelliaCrypt(String str, String str2) {
        super(str, str2);
    }

    public int getKeyLength() {
        if (this._name.equals(CIPHER_CAMELLIA_128_CFB)) {
            return 16;
        }
        if (this._name.equals(CIPHER_CAMELLIA_192_CFB)) {
            return 24;
        }
        return this._name.equals(CIPHER_CAMELLIA_256_CFB) ? 32 : 0;
    }

    /* access modifiers changed from: protected */
    public C2572h getCipher(boolean z) {
        C2556c cVar = new C2556c();
        if (this._name.equals(CIPHER_CAMELLIA_128_CFB)) {
            return new C2563a(cVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_CAMELLIA_192_CFB)) {
            return new C2563a(cVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_CAMELLIA_256_CFB)) {
            return new C2563a(cVar, getIVLength() * 8);
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
