package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.p063a.p064a.C2573i;
import org.p063a.p064a.p065a.C2557d;
import org.p063a.p064a.p065a.C2558e;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.Chacha20Crypt */
public class Chacha20Crypt extends CryptBase {
    public static final String CIPHER_CHACHA20 = "chacha20";
    public static final String CIPHER_CHACHA20_IETF = "chacha20-ietf";

    public static Map<String, String> getCiphers() {
        HashMap hashMap = new HashMap();
        hashMap.put(CIPHER_CHACHA20, Chacha20Crypt.class.getName());
        hashMap.put(CIPHER_CHACHA20_IETF, Chacha20Crypt.class.getName());
        return hashMap;
    }

    public Chacha20Crypt(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public C2573i getCipher(boolean z) {
        if (this._name.equals(CIPHER_CHACHA20)) {
            return new C2558e();
        }
        if (this._name.equals(CIPHER_CHACHA20_IETF)) {
            return new C2557d();
        }
        return null;
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

    public int getKeyLength() {
        return (this._name.equals(CIPHER_CHACHA20) || this._name.equals(CIPHER_CHACHA20_IETF)) ? 32 : 0;
    }

    public int getIVLength() {
        if (this._name.equals(CIPHER_CHACHA20)) {
            return 8;
        }
        return this._name.equals(CIPHER_CHACHA20_IETF) ? 12 : 0;
    }
}
