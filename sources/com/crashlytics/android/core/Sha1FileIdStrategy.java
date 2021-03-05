package com.crashlytics.android.core;

import com.crashlytics.android.core.BinaryImagesConverter;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

class Sha1FileIdStrategy implements BinaryImagesConverter.FileIdStrategy {
    Sha1FileIdStrategy() {
    }

    public String createId(File file) {
        return getFileSHA(file.getPath());
    }

    private static String getFileSHA(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String b = C0020i.m66b((InputStream) bufferedInputStream2);
                C0020i.m57a((Closeable) bufferedInputStream2);
                return b;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C0020i.m57a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C0020i.m57a((Closeable) bufferedInputStream);
            throw th;
        }
    }
}
