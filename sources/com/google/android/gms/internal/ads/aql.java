package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.apz;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class aql<T extends apz> {

    /* renamed from: a */
    private static final Logger f2323a = Logger.getLogger(apt.class.getName());

    /* renamed from: b */
    private static String f2324b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    aql() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo11013a();

    /* renamed from: a */
    static <T extends apz> T m3446a(Class<T> cls) {
        String str;
        ClassLoader classLoader = aql.class.getClassLoader();
        if (cls.equals(apz.class)) {
            str = f2324b;
        } else if (cls.getPackage().equals(aql.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (apz) cls.cast(((aql) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo11013a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(aql.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((apz) cls.cast(((aql) it.next()).mo11013a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f2323a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (apz) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (apz) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
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
