package com.p051vm.shadowsocks.tunnel.shadowsocks;

import java.io.ByteArrayOutputStream;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.ICrypt */
public interface ICrypt {
    void decrypt(byte[] bArr, int i, ByteArrayOutputStream byteArrayOutputStream);

    void decrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream);

    byte[] decrypt(byte[] bArr);

    void encrypt(byte[] bArr, int i, ByteArrayOutputStream byteArrayOutputStream);

    void encrypt(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream);

    byte[] encrypt(byte[] bArr);

    int getIVLength();

    int getKeyLength();
}
