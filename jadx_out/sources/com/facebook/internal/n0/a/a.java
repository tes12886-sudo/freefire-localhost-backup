package com.facebook.internal.n0.a;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.l;
import l.t.h;
import l.t.m;
import l.t.u;
import l.y.c.i;
import l.y.c.o;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final String e;
    private boolean a;
    private Object b;
    private Field c;
    private Field d;

    /* JADX INFO: renamed from: com.facebook.internal.n0.a.a$a, reason: collision with other inner class name */
    public static final class C0066a {
        private final View a;
        private final WindowManager.LayoutParams b;

        public C0066a(View view, WindowManager.LayoutParams layoutParams) {
            i.e(view, "view");
            i.e(layoutParams, "param");
            this.a = view;
            this.b = layoutParams;
        }

        public final WindowManager.LayoutParams a() {
            return this.b;
        }

        public final View b() {
            return this.a;
        }
    }

    static {
        String simpleName = a.class.getSimpleName();
        i.d(simpleName, "AndroidRootResolver::class.java.simpleName");
        e = simpleName;
    }

    private final void a() {
        String str;
        String str2;
        Throwable e2;
        String str3;
        String str4;
        this.a = true;
        int i2 = Build.VERSION.SDK_INT;
        String str5 = i2 > 16 ? "android.view.WindowManagerGlobal" : "android.view.WindowManagerImpl";
        String str6 = i2 > 16 ? "getInstance" : "getDefault";
        try {
            Class<?> cls = Class.forName(str5);
            i.d(cls, "Class.forName(accessClass)");
            Method method = cls.getMethod(str6, new Class[0]);
            i.d(method, "clazz.getMethod(instanceMethod)");
            this.b = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            this.c = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField("mParams");
            this.d = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (ClassNotFoundException e3) {
            e2 = e3;
            str = e;
            o oVar = o.a;
            str2 = String.format("could not find class: %s", Arrays.copyOf(new Object[]{str5}, 1));
            i.d(str2, "java.lang.String.format(format, *args)");
            Log.d(str, str2, e2);
        } catch (IllegalAccessException e4) {
            e = e4;
            str3 = e;
            o oVar2 = o.a;
            str4 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{str5, str6, "mViews"}, 3));
            i.d(str4, "java.lang.String.format(format, *args)");
            Log.d(str3, str4, e);
        } catch (NoSuchFieldException e5) {
            String str7 = e;
            o oVar3 = o.a;
            String str8 = String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", str5}, 3));
            i.d(str8, "java.lang.String.format(format, *args)");
            Log.d(str7, str8, e5);
        } catch (NoSuchMethodException e6) {
            e2 = e6;
            str = e;
            o oVar4 = o.a;
            str2 = String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{str6, str5}, 2));
            i.d(str2, "java.lang.String.format(format, *args)");
            Log.d(str, str2, e2);
        } catch (RuntimeException e7) {
            e = e7;
            str3 = e;
            o oVar5 = o.a;
            str4 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{str5, str6, "mViews"}, 3));
            i.d(str4, "java.lang.String.format(format, *args)");
            Log.d(str3, str4, e);
        } catch (InvocationTargetException e8) {
            str = e;
            o oVar6 = o.a;
            str2 = String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{str6, str5}, 2));
            i.d(str2, "java.lang.String.format(format, *args)");
            e2 = e8.getCause();
            Log.d(str, str2, e2);
        }
    }

    public final List<C0066a> b() {
        List listG;
        if (!this.a) {
            a();
        }
        Object obj = this.b;
        List listG2 = null;
        if (obj == null) {
            Log.d(e, "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.c;
        if (field == null) {
            Log.d(e, "No reflective access to mViews");
            return null;
        }
        if (this.d == null) {
            Log.d(e, "No reflective access to mPArams");
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                View[] viewArr = (View[]) (field != null ? field.get(obj) : null);
                listG = viewArr != null ? h.t(viewArr) : null;
                Field field2 = this.d;
                WindowManager.LayoutParams[] layoutParamsArr = (WindowManager.LayoutParams[]) (field2 != null ? field2.get(this.b) : null);
                if (layoutParamsArr != null) {
                    listG2 = h.t(layoutParamsArr);
                }
            } else {
                listG = (List) (field != null ? field.get(obj) : null);
                Field field3 = this.d;
                listG2 = (List) (field3 != null ? field3.get(this.b) : null);
            }
            ArrayList arrayList = new ArrayList();
            if (listG == null) {
                listG = m.g();
            }
            if (listG2 == null) {
                listG2 = m.g();
            }
            for (l lVar : u.T(listG, listG2)) {
                arrayList.add(new C0066a((View) lVar.a(), (WindowManager.LayoutParams) lVar.b()));
            }
            return arrayList;
        } catch (IllegalAccessException e2) {
            String str = e;
            o oVar = o.a;
            String str2 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.c, this.d, this.b}, 3));
            i.d(str2, "java.lang.String.format(format, *args)");
            Log.d(str, str2, e2);
            return null;
        } catch (RuntimeException e3) {
            String str3 = e;
            o oVar2 = o.a;
            String str4 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.c, this.d, this.b}, 3));
            i.d(str4, "java.lang.String.format(format, *args)");
            Log.d(str3, str4, e3);
            return null;
        }
    }
}
