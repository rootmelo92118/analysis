package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.util.logging.Logger;
import javax.crypto.SecretKey;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.ShadowSocksKey */
public class ShadowSocksKey implements SecretKey {
    private static final int KEY_LENGTH = 32;
    private byte[] _key;
    private int _length;
    private Logger logger;

    public String getAlgorithm() {
        return "shadowsocks";
    }

    public String getFormat() {
        return "RAW";
    }

    public ShadowSocksKey(String str) {
        this.logger = Logger.getLogger(ShadowSocksKey.class.getName());
        this._length = 32;
        this._key = init(str);
    }

    public ShadowSocksKey(String str, int i) {
        this.logger = Logger.getLogger(ShadowSocksKey.class.getName());
        this._length = i;
        this._key = init(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:1:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] init(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 32
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = 0
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ UnsupportedEncodingException -> 0x0017, Exception -> 0x0016 }
            java.lang.String r5 = "UTF-8"
            byte[] r9 = r9.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x0018, Exception -> 0x0016 }
            r5 = r2
            r6 = r5
            r2 = r9
            goto L_0x0021
        L_0x0016:
            return r2
        L_0x0017:
            r4 = r2
        L_0x0018:
            java.util.logging.Logger r9 = r8.logger
            java.lang.String r5 = "ShadowSocksKey: Unsupported string encoding"
            r9.info(r5)
            r5 = r2
            r6 = r5
        L_0x0021:
            r9 = 0
        L_0x0022:
            int r7 = r1.length
            if (r9 >= r7) goto L_0x0045
            if (r9 != 0) goto L_0x0031
            byte[] r5 = r4.digest(r2)
            int r6 = r2.length
            int r7 = r5.length
            int r6 = r6 + r7
            byte[] r6 = new byte[r6]
            goto L_0x003e
        L_0x0031:
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r3, r6, r3, r7)
            int r5 = r5.length
            int r7 = r2.length
            java.lang.System.arraycopy(r2, r3, r6, r5, r7)
            byte[] r5 = r4.digest(r6)
        L_0x003e:
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r3, r1, r9, r7)
            int r7 = r5.length
            int r9 = r9 + r7
            goto L_0x0022
        L_0x0045:
            int r9 = r8._length
            if (r9 == r0) goto L_0x0053
            int r9 = r8._length
            byte[] r9 = new byte[r9]
            int r0 = r8._length
            java.lang.System.arraycopy(r1, r3, r9, r3, r0)
            return r9
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051vm.shadowsocks.tunnel.shadowsocks.ShadowSocksKey.init(java.lang.String):byte[]");
    }

    public byte[] getEncoded() {
        return this._key;
    }
}
