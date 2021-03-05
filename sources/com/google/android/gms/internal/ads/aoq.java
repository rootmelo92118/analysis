package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

final class aoq extends aon {

    /* renamed from: a */
    private final aoo f2147a = new aoo();

    aoq() {
    }

    /* renamed from: a */
    public final void mo10747a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f2147a.mo10749a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10748a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f2147a.mo10749a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
