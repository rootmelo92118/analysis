package org.apache.http.p072d;

import java.io.Serializable;
import java.nio.CharBuffer;

/* renamed from: org.apache.http.d.c */
/* compiled from: CharArrayBuffer */
public final class C2593c implements Serializable, CharSequence {
    private static final long serialVersionUID = -6208952725094867135L;

    /* renamed from: a */
    private char[] f9140a;

    /* renamed from: b */
    private int f9141b;

    public C2593c(int i) {
        C2591a.m12011a(i, "Buffer capacity");
        this.f9140a = new char[i];
    }

    /* renamed from: b */
    private void m12014b(int i) {
        char[] cArr = new char[Math.max(this.f9140a.length << 1, i)];
        System.arraycopy(this.f9140a, 0, cArr, 0, this.f9141b);
        this.f9140a = cArr;
    }

    /* renamed from: a */
    public void mo15834a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f9141b + length;
        if (i > this.f9140a.length) {
            m12014b(i);
        }
        str.getChars(0, length, this.f9140a, this.f9141b);
        this.f9141b = i;
    }

    /* renamed from: a */
    public void mo15832a(char c) {
        int i = this.f9141b + 1;
        if (i > this.f9140a.length) {
            m12014b(i);
        }
        this.f9140a[this.f9141b] = c;
        this.f9141b = i;
    }

    /* renamed from: a */
    public void mo15831a() {
        this.f9141b = 0;
    }

    public char charAt(int i) {
        return this.f9140a[i];
    }

    public int length() {
        return this.f9141b;
    }

    /* renamed from: a */
    public void mo15833a(int i) {
        if (i > 0 && i > this.f9140a.length - this.f9141b) {
            m12014b(this.f9141b + i);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i);
        } else if (i2 > this.f9141b) {
            throw new IndexOutOfBoundsException("endIndex: " + i2 + " > length: " + this.f9141b);
        } else if (i <= i2) {
            return CharBuffer.wrap(this.f9140a, i, i2);
        } else {
            throw new IndexOutOfBoundsException("beginIndex: " + i + " > endIndex: " + i2);
        }
    }

    public String toString() {
        return new String(this.f9140a, 0, this.f9141b);
    }
}
