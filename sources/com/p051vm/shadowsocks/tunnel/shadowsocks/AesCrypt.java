package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.p063a.p064a.C2572h;
import org.p063a.p064a.p065a.C2554a;
import org.p063a.p064a.p066b.C2563a;
import org.p063a.p064a.p066b.C2564b;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.AesCrypt */
public class AesCrypt extends CryptBase {
    public static final String CIPHER_AES_128_CFB = "aes-128-cfb";
    public static final String CIPHER_AES_128_OFB = "aes-128-ofb";
    public static final String CIPHER_AES_192_CFB = "aes-192-cfb";
    public static final String CIPHER_AES_192_OFB = "aes-192-ofb";
    public static final String CIPHER_AES_256_CFB = "aes-256-cfb";
    public static final String CIPHER_AES_256_OFB = "aes-256-ofb";

    public int getIVLength() {
        return 16;
    }

    public static Map<String, String> getCiphers() {
        HashMap hashMap = new HashMap();
        hashMap.put(CIPHER_AES_128_CFB, AesCrypt.class.getName());
        hashMap.put(CIPHER_AES_192_CFB, AesCrypt.class.getName());
        hashMap.put(CIPHER_AES_256_CFB, AesCrypt.class.getName());
        hashMap.put(CIPHER_AES_128_OFB, AesCrypt.class.getName());
        hashMap.put(CIPHER_AES_192_OFB, AesCrypt.class.getName());
        hashMap.put(CIPHER_AES_256_OFB, AesCrypt.class.getName());
        return hashMap;
    }

    public AesCrypt(String str, String str2) {
        super(str, str2);
    }

    public int getKeyLength() {
        if (this._name.equals(CIPHER_AES_128_CFB) || this._name.equals(CIPHER_AES_128_OFB)) {
            return 16;
        }
        if (this._name.equals(CIPHER_AES_192_CFB) || this._name.equals(CIPHER_AES_192_OFB)) {
            return 24;
        }
        return (this._name.equals(CIPHER_AES_256_CFB) || this._name.equals(CIPHER_AES_256_OFB)) ? 32 : 0;
    }

    /* access modifiers changed from: protected */
    public C2572h getCipher(boolean z) {
        C2554a aVar = new C2554a();
        if (this._name.equals(CIPHER_AES_128_CFB)) {
            return new C2563a(aVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_AES_192_CFB)) {
            return new C2563a(aVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_AES_256_CFB)) {
            return new C2563a(aVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_AES_128_OFB)) {
            return new C2564b(aVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_AES_192_OFB)) {
            return new C2564b(aVar, getIVLength() * 8);
        }
        if (this._name.equals(CIPHER_AES_256_OFB)) {
            return new C2564b(aVar, getIVLength() * 8);
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
