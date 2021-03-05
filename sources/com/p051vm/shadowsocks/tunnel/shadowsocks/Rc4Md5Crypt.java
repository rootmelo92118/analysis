package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.p063a.p064a.C2562b;
import org.p063a.p064a.C2573i;
import org.p063a.p064a.p065a.C2559f;
import org.p063a.p064a.p067c.C2566a;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.Rc4Md5Crypt */
public class Rc4Md5Crypt extends CryptBase {
    public static String CIPHER_RC4_MD5 = "rc4-md5";

    public int getIVLength() {
        return 16;
    }

    public int getKeyLength() {
        return 16;
    }

    public static Map<String, String> getCiphers() {
        HashMap hashMap = new HashMap();
        hashMap.put(CIPHER_RC4_MD5, Rc4Md5Crypt.class.getName());
        return hashMap;
    }

    public Rc4Md5Crypt(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public C2573i getCipher(boolean z) {
        return new C2559f();
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

    /* access modifiers changed from: protected */
    public C2562b getCipherParameters(byte[] bArr) {
        byte[] bArr2 = new byte[(this._keyLength + this._ivLength)];
        System.arraycopy(this._key.getEncoded(), 0, bArr2, 0, this._keyLength);
        System.arraycopy(bArr, 0, bArr2, this._keyLength, this._ivLength);
        return new C2566a(md5Digest(bArr2));
    }
}
