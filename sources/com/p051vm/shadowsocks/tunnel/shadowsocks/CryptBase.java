package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import org.p063a.p064a.C2562b;
import org.p063a.p064a.C2573i;
import org.p063a.p064a.p067c.C2566a;
import org.p063a.p064a.p067c.C2567b;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.CryptBase */
public abstract class CryptBase implements ICrypt {
    protected byte[] _decryptIV;
    protected boolean _decryptIVSet;
    protected byte[] _encryptIV;
    protected boolean _encryptIVSet;
    protected final int _ivLength;
    protected final SecretKey _key;
    protected final int _keyLength;
    protected final String _name;
    protected final ShadowSocksKey _ssKey;
    protected C2573i decCipher;
    protected final Lock decLock = new ReentrantLock();
    protected C2573i encCipher;
    protected final Lock encLock = new ReentrantLock();
    private Logger logger = Logger.getLogger(CryptBase.class.getName());

    /* access modifiers changed from: protected */
    public abstract void _decrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream);

    /* access modifiers changed from: protected */
    public abstract void _encrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream);

    /* access modifiers changed from: protected */
    public abstract C2573i getCipher(boolean z);

    /* access modifiers changed from: protected */
    public abstract SecretKey getKey();

    /* access modifiers changed from: protected */
    public C2562b getCipherParameters(byte[] bArr) {
        this._decryptIV = new byte[this._ivLength];
        System.arraycopy(bArr, 0, this._decryptIV, 0, this._ivLength);
        return new C2567b(new C2566a(this._key.getEncoded()), this._decryptIV);
    }

    public CryptBase(String str, String str2) {
        this._name = str.toLowerCase();
        this._ivLength = getIVLength();
        this._keyLength = getKeyLength();
        this._ssKey = new ShadowSocksKey(str2, this._keyLength);
        this._key = getKey();
    }

    /* access modifiers changed from: protected */
    public void setIV(byte[] bArr, boolean z) {
        if (this._ivLength != 0) {
            if (z) {
                C2562b cipherParameters = getCipherParameters(bArr);
                try {
                    this.encCipher = getCipher(z);
                } catch (InvalidAlgorithmParameterException e) {
                    this.logger.info(e.toString());
                }
                this.encCipher.mo15788a(z, cipherParameters);
                return;
            }
            this._decryptIV = new byte[this._ivLength];
            System.arraycopy(bArr, 0, this._decryptIV, 0, this._ivLength);
            C2562b cipherParameters2 = getCipherParameters(bArr);
            try {
                this.decCipher = getCipher(z);
            } catch (InvalidAlgorithmParameterException e2) {
                this.logger.info(e2.toString());
            }
            this.decCipher.mo15788a(z, cipherParameters2);
        }
    }

    public byte[] encrypt(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encrypt(bArr, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] decrypt(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decrypt(bArr, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void encrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        synchronized (this.encLock) {
            byteArrayOutputStream.reset();
            if (!this._encryptIVSet) {
                this._encryptIVSet = true;
                byte[] bArr2 = new byte[this._ivLength];
                new SecureRandom().nextBytes(bArr2);
                setIV(bArr2, true);
                try {
                    byteArrayOutputStream.write(bArr2);
                } catch (IOException e) {
                    this.logger.info(e.toString());
                }
            }
            _encrypt(bArr, byteArrayOutputStream);
        }
    }

    public void encrypt(byte[] bArr, int i, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        encrypt(bArr2, byteArrayOutputStream);
    }

    public void decrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        synchronized (this.decLock) {
            byteArrayOutputStream.reset();
            if (!this._decryptIVSet) {
                this._decryptIVSet = true;
                setIV(bArr, false);
                byte[] bArr2 = new byte[(bArr.length - this._ivLength)];
                System.arraycopy(bArr, this._ivLength, bArr2, 0, bArr.length - this._ivLength);
                bArr = bArr2;
            }
            _decrypt(bArr, byteArrayOutputStream);
        }
    }

    public void decrypt(byte[] bArr, int i, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        decrypt(bArr2, byteArrayOutputStream);
    }

    public static byte[] md5Digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
