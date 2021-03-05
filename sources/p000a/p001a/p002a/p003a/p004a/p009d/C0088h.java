package p000a.p001a.p002a.p003a.p004a.p009d;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0040t;

/* renamed from: a.a.a.a.a.d.h */
/* compiled from: QueueFileEventStorage */
public class C0088h implements C0083c {

    /* renamed from: a */
    private final Context f154a;

    /* renamed from: b */
    private final File f155b;

    /* renamed from: c */
    private final String f156c;

    /* renamed from: d */
    private final File f157d;

    /* renamed from: e */
    private C0040t f158e = new C0040t(this.f157d);

    /* renamed from: f */
    private File f159f;

    public C0088h(Context context, File file, String str, String str2) {
        this.f154a = context;
        this.f155b = file;
        this.f156c = str2;
        this.f157d = new File(this.f155b, str);
        m216e();
    }

    /* renamed from: e */
    private void m216e() {
        this.f159f = new File(this.f155b, this.f156c);
        if (!this.f159f.exists()) {
            this.f159f.mkdirs();
        }
    }

    /* renamed from: a */
    public void mo183a(byte[] bArr) {
        this.f158e.mo79a(bArr);
    }

    /* renamed from: a */
    public int mo179a() {
        return this.f158e.mo77a();
    }

    /* renamed from: a */
    public void mo181a(String str) {
        this.f158e.close();
        m215a(this.f157d, new File(this.f159f, str));
        this.f158e = new C0040t(this.f157d);
    }

    /* renamed from: a */
    private void m215a(File file, File file2) {
        FileInputStream fileInputStream;
        OutputStream a;
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a = mo192a(file2);
            } catch (Throwable th) {
                th = th;
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
                C0020i.m58a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
            try {
                C0020i.m60a((InputStream) fileInputStream, a, new byte[1024]);
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
                C0020i.m58a((Closeable) a, "Failed to close output stream");
                file.delete();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                outputStream = a;
                th = th3;
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
                C0020i.m58a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
            C0020i.m58a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public OutputStream mo192a(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: a */
    public List<File> mo180a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f159f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo182a(List<File> list) {
        for (File next : list) {
            C0020i.m55a(this.f154a, String.format("deleting sent analytics file %s", new Object[]{next.getName()}));
            next.delete();
        }
    }

    /* renamed from: c */
    public List<File> mo186c() {
        return Arrays.asList(this.f159f.listFiles());
    }

    /* renamed from: d */
    public void mo187d() {
        try {
            this.f158e.close();
        } catch (IOException unused) {
        }
        this.f157d.delete();
    }

    /* renamed from: b */
    public boolean mo185b() {
        return this.f158e.mo82b();
    }

    /* renamed from: a */
    public boolean mo184a(int i, int i2) {
        return this.f158e.mo81a(i, i2);
    }
}
