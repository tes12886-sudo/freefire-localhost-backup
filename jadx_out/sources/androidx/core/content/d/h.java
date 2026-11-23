package androidx.core.content.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<c, SparseArray<b>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    static class a {
        static ColorStateList a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }
    }

    private static class b {
        final ColorStateList a;
        final Configuration b;

        b(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    private static final class c {
        final Resources a;
        final Resources.Theme b;

        c(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && h.h.k.c.a(this.b, cVar.b);
        }

        public int hashCode() {
            return h.h.k.c.b(this.a, this.b);
        }
    }

    public static abstract class d {

        class a implements Runnable {
            final /* synthetic */ Typeface a;

            a(Typeface typeface) {
                this.a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.a);
            }
        }

        class b implements Runnable {
            final /* synthetic */ int a;

            b(int i2) {
                this.a = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d(this.a);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    public static final class e {

        static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            /* JADX WARN: Code duplicated, block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            static void a(Resources.Theme theme) {
                Method method;
                synchronized (a) {
                    if (c) {
                        method = b;
                        if (method != null) {
                            method.invoke(theme, new Object[0]);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        c = true;
                        method = b;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException e2) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                b.a(theme);
            } else if (i2 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(c cVar, int i2, ColorStateList colorStateList) {
        synchronized (c) {
            WeakHashMap<c, SparseArray<b>> weakHashMap = b;
            SparseArray<b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i2, new b(colorStateList, cVar.a.getConfiguration()));
        }
    }

    private static ColorStateList b(c cVar, int i2) {
        b bVar;
        synchronized (c) {
            SparseArray<b> sparseArray = b.get(cVar);
            if (sparseArray != null && sparseArray.size() > 0 && (bVar = sparseArray.get(i2)) != null) {
                if (bVar.b.equals(cVar.a.getConfiguration())) {
                    return bVar.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i2, Resources.Theme theme) {
        c cVar = new c(resources, theme);
        ColorStateList colorStateListB = b(cVar, i2);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListH = h(resources, i2, theme);
        if (colorStateListH == null) {
            return Build.VERSION.SDK_INT >= 23 ? a.a(resources, i2, theme) : resources.getColorStateList(i2);
        }
        a(cVar, i2, colorStateListH);
        return colorStateListH;
    }

    public static Drawable d(Resources resources, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    public static Drawable e(Resources resources, int i2, int i3, Resources.Theme theme) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
        return i4 >= 15 ? resources.getDrawableForDensity(i2, i3) : resources.getDrawable(i2);
    }

    public static Typeface f(Context context, int i2, TypedValue typedValue, int i3, d dVar) {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, i2, typedValue, i3, dVar, null, true, false);
    }

    private static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList h(Resources resources, int i2, Resources.Theme theme) {
        if (i(resources, i2)) {
            return null;
        }
        try {
            return androidx.core.content.d.c.a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean i(Resources resources, int i2) {
        TypedValue typedValueG = g();
        resources.getValue(i2, typedValueG, true);
        int i3 = typedValueG.type;
        return i3 >= 28 && i3 <= 31;
    }

    private static Typeface j(Context context, int i2, TypedValue typedValue, int i3, d dVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceK = k(context, resources, typedValue, i2, i3, dVar, handler, z, z2);
        if (typefaceK != null || dVar != null || z2) {
            return typefaceK;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    private static Typeface k(Context context, Resources resources, TypedValue typedValue, int i2, int i3, d dVar, Handler handler, boolean z, boolean z2) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (dVar != null) {
                dVar.a(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = h.h.e.e.f(resources, i2, i3);
        if (typefaceF != null) {
            if (dVar != null) {
                dVar.b(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z2) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceD = h.h.e.e.d(context, resources, i2, string, i3);
                if (dVar != null) {
                    if (typefaceD != null) {
                        dVar.b(typefaceD, handler);
                    } else {
                        dVar.a(-3, handler);
                    }
                }
                return typefaceD;
            }
            androidx.core.content.d.e.a aVarB = androidx.core.content.d.e.b(resources.getXml(i2), resources);
            if (aVarB != null) {
                return h.h.e.e.c(context, aVarB, resources, i2, i3, dVar, handler, z);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (dVar != null) {
                dVar.a(-3, handler);
            }
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to read xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (dVar != null) {
                dVar.a(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "Failed to parse xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (dVar != null) {
                dVar.a(-3, handler);
            }
            return null;
        }
    }
}
