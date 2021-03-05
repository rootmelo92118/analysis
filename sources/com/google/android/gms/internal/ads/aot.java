package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aot;
import com.google.android.gms.internal.ads.aou;
import java.io.IOException;

public abstract class aot<MessageType extends aot<MessageType, BuilderType>, BuilderType extends aou<MessageType, BuilderType>> implements arw {
    private static boolean zzfky = false;
    protected int zzfkx = 0;

    /* renamed from: h */
    public final apc mo10754h() {
        try {
            apk b = apc.m2991b(mo11020l());
            mo11016a(b.mo10815b());
            return b.mo10814a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: i */
    public final byte[] mo10755i() {
        try {
            byte[] bArr = new byte[mo11020l()];
            apt a = apt.m3149a(bArr);
            mo11016a(a);
            a.mo10916c();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("byte array").length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo10756j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10753a(int i) {
        throw new UnsupportedOperationException();
    }
}
