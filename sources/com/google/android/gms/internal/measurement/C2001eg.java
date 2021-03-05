package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1988dv;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.eg */
abstract class C2001eg<T extends C1988dv> {

    /* renamed from: a */
    private static final Logger f7723a = Logger.getLogger(C1976do.class.getName());

    /* renamed from: b */
    private static String f7724b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C2001eg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo13810a();

    /* renamed from: a */
    static <T extends C1988dv> T m9516a(Class<T> cls) {
        String str;
        ClassLoader classLoader = C2001eg.class.getClassLoader();
        if (cls.equals(C1988dv.class)) {
            str = f7724b;
        } else if (cls.getPackage().equals(C2001eg.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C1988dv) cls.cast(((C2001eg) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo13810a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(C2001eg.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C1988dv) cls.cast(((C2001eg) it.next()).mo13810a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f7723a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C1988dv) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C1988dv) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
