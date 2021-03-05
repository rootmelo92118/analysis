package android.arch.lifecycle;

import android.arch.lifecycle.C0254b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReflectiveGenericLifecycleObserver implements C0253a {

    /* renamed from: a */
    static final Map<Class, C0251a> f509a = new HashMap();

    /* renamed from: b */
    private final Object f510b;

    /* renamed from: c */
    private final C0251a f511c = m663a(this.f510b.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f510b = obj;
    }

    /* renamed from: a */
    public void mo459a(C0257c cVar, C0254b.C0255a aVar) {
        m664a(this.f511c, cVar, aVar);
    }

    /* renamed from: a */
    private void m666a(List<C0252b> list, C0257c cVar, C0254b.C0255a aVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m665a(list.get(size), cVar, aVar);
            }
        }
    }

    /* renamed from: a */
    private void m664a(C0251a aVar, C0257c cVar, C0254b.C0255a aVar2) {
        m666a(aVar.f512a.get(aVar2), cVar, aVar2);
        m666a(aVar.f512a.get(C0254b.C0255a.ON_ANY), cVar, aVar2);
    }

    /* renamed from: a */
    private void m665a(C0252b bVar, C0257c cVar, C0254b.C0255a aVar) {
        try {
            switch (bVar.f514a) {
                case 0:
                    bVar.f515b.invoke(this.f510b, new Object[0]);
                    return;
                case 1:
                    bVar.f515b.invoke(this.f510b, new Object[]{cVar});
                    return;
                case 2:
                    bVar.f515b.invoke(this.f510b, new Object[]{cVar, aVar});
                    return;
                default:
                    return;
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Failed to call observer method", e.getCause());
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    private static C0251a m663a(Class cls) {
        C0251a aVar = f509a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m668b(cls);
    }

    /* renamed from: a */
    private static void m667a(Map<C0252b, C0254b.C0255a> map, C0252b bVar, C0254b.C0255a aVar, Class cls) {
        C0254b.C0255a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f515b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: b */
    private static C0251a m668b(Class cls) {
        int i;
        C0251a a;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a = m663a(superclass)) == null)) {
            hashMap.putAll(a.f513b);
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Class a2 : cls.getInterfaces()) {
            for (Map.Entry next : m663a(a2).f513b.entrySet()) {
                m667a(hashMap, (C0252b) next.getKey(), (C0254b.C0255a) next.getValue(), cls);
            }
        }
        for (Method method : declaredMethods) {
            C0262f fVar = (C0262f) method.getAnnotation(C0262f.class);
            if (fVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0257c.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0254b.C0255a a3 = fVar.mo467a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0254b.C0255a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a3 == C0254b.C0255a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m667a(hashMap, new C0252b(i, method), a3, cls);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0251a aVar = new C0251a(hashMap);
        f509a.put(cls, aVar);
        return aVar;
    }

    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a */
    static class C0251a {

        /* renamed from: a */
        final Map<C0254b.C0255a, List<C0252b>> f512a = new HashMap();

        /* renamed from: b */
        final Map<C0252b, C0254b.C0255a> f513b;

        C0251a(Map<C0252b, C0254b.C0255a> map) {
            this.f513b = map;
            for (Map.Entry next : map.entrySet()) {
                C0254b.C0255a aVar = (C0254b.C0255a) next.getValue();
                List list = this.f512a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f512a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }
    }

    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$b */
    static class C0252b {

        /* renamed from: a */
        final int f514a;

        /* renamed from: b */
        final Method f515b;

        C0252b(int i, Method method) {
            this.f514a = i;
            this.f515b = method;
            this.f515b.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0252b bVar = (C0252b) obj;
            if (this.f514a != bVar.f514a || !this.f515b.getName().equals(bVar.f515b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f514a * 31) + this.f515b.getName().hashCode();
        }
    }
}
