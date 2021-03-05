package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface avp extends Closeable {
    /* renamed from: a */
    int mo10274a(ByteBuffer byteBuffer);

    /* renamed from: a */
    long mo10275a();

    /* renamed from: a */
    ByteBuffer mo10276a(long j, long j2);

    /* renamed from: a */
    void mo10277a(long j);

    /* renamed from: b */
    long mo10278b();

    void close();
}
