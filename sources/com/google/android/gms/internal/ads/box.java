package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.boz;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class box {

    /* renamed from: a */
    private final bpc f4926a;
    @GuardedBy("this")

    /* renamed from: b */
    private final bqb f4927b;

    /* renamed from: c */
    private final boolean f4928c;

    /* renamed from: a */
    public static box m6117a() {
        return new box();
    }

    public box(bpc bpc) {
        this.f4926a = bpc;
        this.f4928c = ((Boolean) bre.m6321e().mo12778a(C1557p.f6045cu)).booleanValue();
        this.f4927b = new bqb();
        m6118b();
    }

    private box() {
        this.f4928c = false;
        this.f4926a = new bpc();
        this.f4927b = new bqb();
        m6118b();
    }

    /* renamed from: a */
    public final synchronized void mo12285a(boz.C1142a.C1144b bVar) {
        if (this.f4928c) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6046cv)).booleanValue()) {
                m6120c(bVar);
            } else {
                m6119b(bVar);
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m6119b(boz.C1142a.C1144b bVar) {
        this.f4927b.f5067b = m6121c();
        this.f4926a.mo12286a(aum.m4186a((aum) this.f4927b)).mo12289b(bVar.mo10648a()).mo12288a();
        String valueOf = String.valueOf(Integer.toString(bVar.mo10648a(), 10));
        C1772wz.m8287a(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    /* renamed from: c */
    private final synchronized void m6120c(boz.C1142a.C1144b bVar) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m6122d(bVar).getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C1772wz.m8287a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C1772wz.m8287a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C1772wz.m8287a("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C1772wz.m8287a("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C1772wz.m8287a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: d */
    private final synchronized String m6122d(boz.C1142a.C1144b bVar) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.f4927b.f5066a, Long.valueOf(zzbv.zzlm().mo9997b()), Integer.valueOf(bVar.mo10648a())});
    }

    /* renamed from: a */
    public final synchronized void mo12284a(boy boy) {
        if (this.f4928c) {
            try {
                boy.zza(this.f4927b);
            } catch (NullPointerException e) {
                zzbv.zzlj().mo13119a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m6118b() {
        this.f4927b.f5069d = new bpx();
        this.f4927b.f5069d.f5037b = new bpy();
        this.f4927b.f5068c = new bpz();
    }

    /* renamed from: c */
    private static long[] m6121c() {
        int i;
        List<String> b = C1557p.m7743b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    C1772wz.m8287a("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}
