package com.gamesafe.ano;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static Object a(Class cls, String str, Object obj, Class[] clsArr, Object[] objArr) {
        return cls.getMethod(str, clsArr).invoke(obj, objArr);
    }

    public static Object a(String str, Object obj, String str2) throws NoSuchFieldException {
        Field declaredField = Class.forName(str).getDeclaredField(str2);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object a(String str, String str2) throws NoSuchFieldException {
        Field declaredField = Class.forName(str).getDeclaredField(str2);
        declaredField.setAccessible(true);
        return declaredField.get(null);
    }

    public static Object a(String str, String str2, Object obj, Class[] clsArr, Object[] objArr) {
        return Class.forName(str).getMethod(str2, clsArr).invoke(obj, objArr);
    }

    public static Object a(String str, String str2, Class[] clsArr, Object[] objArr) {
        return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
    }

    public static void a(String str, String str2, Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = Class.forName(str).getDeclaredField(str2);
        declaredField.setAccessible(true);
        declaredField.set(null, obj);
    }

    public static void a(String str, String str2, Object obj, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = Class.forName(str).getDeclaredField(str2);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
