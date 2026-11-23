package com.facebook.j0.t;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private h() {
    }

    public static final Class<?> a(String str) {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            i.e(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final Method b(Class<?> cls, String str, Class<?>... clsArr) {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            i.e(cls, "clazz");
            i.e(str, "methodName");
            i.e(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }

    public static final Object c(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (com.facebook.internal.m0.i.a.d(h.class)) {
            return null;
        }
        try {
            i.e(cls, "clazz");
            i.e(method, "method");
            i.e(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h.class);
            return null;
        }
    }
}
