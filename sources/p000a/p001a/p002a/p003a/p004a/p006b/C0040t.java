package p000a.p001a.p002a.p003a.p004a.p006b;

import android.support.p034v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.a.a.a.a.b.t */
/* compiled from: QueueFile */
public class C0040t implements Closeable {

    /* renamed from: b */
    private static final Logger f79b = Logger.getLogger(C0040t.class.getName());

    /* renamed from: a */
    int f80a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final RandomAccessFile f81c;

    /* renamed from: d */
    private int f82d;

    /* renamed from: e */
    private C0042a f83e;

    /* renamed from: f */
    private C0042a f84f;

    /* renamed from: g */
    private final byte[] f85g = new byte[16];

    /* renamed from: a.a.a.a.a.b.t$c */
    /* compiled from: QueueFile */
    public interface C0044c {
        void read(InputStream inputStream, int i);
    }

    public C0040t(File file) {
        if (!file.exists()) {
            m136a(file);
        }
        this.f81c = m139b(file);
        m145e();
    }

    /* renamed from: b */
    private static void m142b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private static void m137a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m142b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: a */
    private static int m129a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: e */
    private void m145e() {
        this.f81c.seek(0);
        this.f81c.readFully(this.f85g);
        this.f80a = m129a(this.f85g, 0);
        if (((long) this.f80a) <= this.f81c.length()) {
            this.f82d = m129a(this.f85g, 4);
            int a = m129a(this.f85g, 8);
            int a2 = m129a(this.f85g, 12);
            this.f83e = m130a(a);
            this.f84f = m130a(a2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f80a + ", Actual length: " + this.f81c.length());
    }

    /* renamed from: a */
    private void m133a(int i, int i2, int i3, int i4) {
        m137a(this.f85g, i, i2, i3, i4);
        this.f81c.seek(0);
        this.f81c.write(this.f85g);
    }

    /* renamed from: a */
    private C0042a m130a(int i) {
        if (i == 0) {
            return C0042a.f89a;
        }
        this.f81c.seek((long) i);
        return new C0042a(i, this.f81c.readInt());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m136a(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile b = m139b(file2);
        try {
            b.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            b.seek(0);
            byte[] bArr = new byte[16];
            m137a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* renamed from: b */
    private static RandomAccessFile m139b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m138b(int i) {
        return i < this.f80a ? i : (i + 16) - this.f80a;
    }

    /* renamed from: a */
    private void m134a(int i, byte[] bArr, int i2, int i3) {
        int b = m138b(i);
        if (b + i3 <= this.f80a) {
            this.f81c.seek((long) b);
            this.f81c.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f80a - b;
        this.f81c.seek((long) b);
        this.f81c.write(bArr, i2, i4);
        this.f81c.seek(16);
        this.f81c.write(bArr, i2 + i4, i3 - i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m141b(int i, byte[] bArr, int i2, int i3) {
        int b = m138b(i);
        if (b + i3 <= this.f80a) {
            this.f81c.seek((long) b);
            this.f81c.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f80a - b;
        this.f81c.seek((long) b);
        this.f81c.readFully(bArr, i2, i4);
        this.f81c.seek(16);
        this.f81c.readFully(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: a */
    public void mo79a(byte[] bArr) {
        mo80a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo80a(byte[] bArr, int i, int i2) {
        int i3;
        m140b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m143c(i2);
        boolean b = mo82b();
        if (b) {
            i3 = 16;
        } else {
            i3 = m138b(this.f84f.f90b + 4 + this.f84f.f91c);
        }
        C0042a aVar = new C0042a(i3, i2);
        m142b(this.f85g, 0, i2);
        m134a(aVar.f90b, this.f85g, 0, 4);
        m134a(aVar.f90b + 4, bArr, i, i2);
        m133a(this.f80a, this.f82d + 1, b ? aVar.f90b : this.f83e.f90b, aVar.f90b);
        this.f84f = aVar;
        this.f82d++;
        if (b) {
            this.f83e = this.f84f;
        }
    }

    /* renamed from: a */
    public int mo77a() {
        if (this.f82d == 0) {
            return 16;
        }
        if (this.f84f.f90b >= this.f83e.f90b) {
            return (this.f84f.f90b - this.f83e.f90b) + 4 + this.f84f.f91c + 16;
        }
        return (((this.f84f.f90b + 4) + this.f84f.f91c) + this.f80a) - this.f83e.f90b;
    }

    /* renamed from: f */
    private int m146f() {
        return this.f80a - mo77a();
    }

    /* renamed from: b */
    public synchronized boolean mo82b() {
        return this.f82d == 0;
    }

    /* renamed from: c */
    private void m143c(int i) {
        int i2 = i + 4;
        int f = m146f();
        if (f < i2) {
            int i3 = this.f80a;
            do {
                f += i3;
                i3 <<= 1;
            } while (f < i2);
            m144d(i3);
            int b = m138b(this.f84f.f90b + 4 + this.f84f.f91c);
            if (b < this.f83e.f90b) {
                FileChannel channel = this.f81c.getChannel();
                channel.position((long) this.f80a);
                long j = (long) (b - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f84f.f90b < this.f83e.f90b) {
                int i4 = (this.f80a + this.f84f.f90b) - 16;
                m133a(i3, this.f82d, this.f83e.f90b, i4);
                this.f84f = new C0042a(i4, this.f84f.f91c);
            } else {
                m133a(i3, this.f82d, this.f83e.f90b, this.f84f.f90b);
            }
            this.f80a = i3;
        }
    }

    /* renamed from: d */
    private void m144d(int i) {
        this.f81c.setLength((long) i);
        this.f81c.getChannel().force(true);
    }

    /* renamed from: a */
    public synchronized void mo78a(C0044c cVar) {
        int i = this.f83e.f90b;
        for (int i2 = 0; i2 < this.f82d; i2++) {
            C0042a a = m130a(i);
            cVar.read(new C0043b(a), a.f91c);
            i = m138b(a.f90b + 4 + a.f91c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m140b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a.a.a.a.a.b.t$b */
    /* compiled from: QueueFile */
    private final class C0043b extends InputStream {

        /* renamed from: b */
        private int f93b;

        /* renamed from: c */
        private int f94c;

        private C0043b(C0042a aVar) {
            this.f93b = C0040t.this.m138b(aVar.f90b + 4);
            this.f94c = aVar.f91c;
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C0040t.m140b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (this.f94c <= 0) {
                return -1;
            } else {
                if (i2 > this.f94c) {
                    i2 = this.f94c;
                }
                C0040t.this.m141b(this.f93b, bArr, i, i2);
                this.f93b = C0040t.this.m138b(this.f93b + i2);
                this.f94c -= i2;
                return i2;
            }
        }

        public int read() {
            if (this.f94c == 0) {
                return -1;
            }
            C0040t.this.f81c.seek((long) this.f93b);
            int read = C0040t.this.f81c.read();
            this.f93b = C0040t.this.m138b(this.f93b + 1);
            this.f94c--;
            return read;
        }
    }

    /* renamed from: c */
    public synchronized void mo83c() {
        if (mo82b()) {
            throw new NoSuchElementException();
        } else if (this.f82d == 1) {
            mo85d();
        } else {
            int b = m138b(this.f83e.f90b + 4 + this.f83e.f91c);
            m141b(b, this.f85g, 0, 4);
            int a = m129a(this.f85g, 0);
            m133a(this.f80a, this.f82d - 1, b, this.f84f.f90b);
            this.f82d--;
            this.f83e = new C0042a(b, a);
        }
    }

    /* renamed from: d */
    public synchronized void mo85d() {
        m133a(4096, 0, 0, 0);
        this.f82d = 0;
        this.f83e = C0042a.f89a;
        this.f84f = C0042a.f89a;
        if (this.f80a > 4096) {
            m144d(4096);
        }
        this.f80a = 4096;
    }

    public synchronized void close() {
        this.f81c.close();
    }

    /* renamed from: a */
    public boolean mo81a(int i, int i2) {
        return (mo77a() + 4) + i <= i2;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f80a);
        sb.append(", size=");
        sb.append(this.f82d);
        sb.append(", first=");
        sb.append(this.f83e);
        sb.append(", last=");
        sb.append(this.f84f);
        sb.append(", element lengths=[");
        try {
            mo78a((C0044c) new C0044c() {

                /* renamed from: a */
                boolean f86a = true;

                public void read(InputStream inputStream, int i) {
                    if (this.f86a) {
                        this.f86a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f79b.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a.a.a.a.a.b.t$a */
    /* compiled from: QueueFile */
    static class C0042a {

        /* renamed from: a */
        static final C0042a f89a = new C0042a(0, 0);

        /* renamed from: b */
        final int f90b;

        /* renamed from: c */
        final int f91c;

        C0042a(int i, int i2) {
            this.f90b = i;
            this.f91c = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f90b + ", length = " + this.f91c + "]";
        }
    }
}
