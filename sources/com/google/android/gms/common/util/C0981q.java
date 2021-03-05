package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.util.q */
public class C0981q {

    /* renamed from: a */
    private static String f1227a;

    /* renamed from: b */
    private static int f1228b;

    @Nullable
    /* renamed from: a */
    public static String m1513a() {
        if (f1227a == null) {
            if (f1228b == 0) {
                f1228b = Process.myPid();
            }
            f1227a = m1514a(f1228b);
        }
        return f1227a;
    }

    @Nullable
    /* renamed from: a */
    private static String m1514a(int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = m1512a(sb.toString());
            try {
                String trim = bufferedReader.readLine().trim();
                C0975k.m1495a(bufferedReader);
                return trim;
            } catch (IOException unused) {
                C0975k.m1495a(bufferedReader);
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                bufferedReader2 = bufferedReader;
                th = th2;
                C0975k.m1495a(bufferedReader2);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            C0975k.m1495a(bufferedReader);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C0975k.m1495a(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    private static BufferedReader m1512a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
