package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.vz */
public abstract class C1745vz implements C1802yb {

    /* renamed from: a */
    private static Logger f6671a = Logger.getLogger(C1745vz.class.getName());

    /* renamed from: b */
    private ThreadLocal<ByteBuffer> f6672b = new C1774xa(this);

    /* renamed from: a */
    public abstract abe mo10282a(String str, byte[] bArr, String str2);

    /* renamed from: a */
    public final abe mo13089a(avp avp, ace ace) {
        int a;
        long j;
        avp avp2 = avp;
        ace ace2 = ace;
        long b = avp.mo10278b();
        this.f6672b.get().rewind().limit(8);
        do {
            a = avp2.mo10274a(this.f6672b.get());
            if (a == 8) {
                this.f6672b.get().rewind();
                long a2 = aae.m1612a(this.f6672b.get());
                byte[] bArr = null;
                if (a2 >= 8 || a2 <= 1) {
                    String f = aae.m1617f(this.f6672b.get());
                    if (a2 == 1) {
                        this.f6672b.get().limit(16);
                        avp2.mo10274a(this.f6672b.get());
                        this.f6672b.get().position(8);
                        j = aae.m1614c(this.f6672b.get()) - 16;
                    } else {
                        j = a2 == 0 ? avp.mo10275a() - avp.mo10278b() : a2 - 8;
                    }
                    if ("uuid".equals(f)) {
                        this.f6672b.get().limit(this.f6672b.get().limit() + 16);
                        avp2.mo10274a(this.f6672b.get());
                        bArr = new byte[16];
                        for (int position = this.f6672b.get().position() - 16; position < this.f6672b.get().position(); position++) {
                            bArr[position - (this.f6672b.get().position() - 16)] = this.f6672b.get().get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    abe a3 = mo10282a(f, bArr, ace2 instanceof abe ? ((abe) ace2).mo10065a() : "");
                    a3.mo10066a(ace2);
                    this.f6672b.get().rewind();
                    a3.mo10067a(avp, this.f6672b.get(), j2, this);
                    return a3;
                }
                Logger logger = f6671a;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a2);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (a >= 0);
        avp2.mo10277a(b);
        throw new EOFException();
    }
}
