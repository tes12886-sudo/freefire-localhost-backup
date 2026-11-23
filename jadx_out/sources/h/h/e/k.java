package h.h.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import com.appff.haptic.base.Utils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class k {

    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, androidx.core.content.d.e.b> a = new ConcurrentHashMap<>();

    class a implements c<h.h.i.f.b> {
        a(k kVar) {
        }

        @Override // h.h.e.k.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(h.h.i.f.b bVar) {
            return bVar.e();
        }

        @Override // h.h.e.k.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(h.h.i.f.b bVar) {
            return bVar.f();
        }
    }

    class b implements c<androidx.core.content.d.e.c> {
        b(k kVar) {
        }

        @Override // h.h.e.k.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(androidx.core.content.d.e.c cVar) {
            return cVar.e();
        }

        @Override // h.h.e.k.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(androidx.core.content.d.e.c cVar) {
            return cVar.f();
        }
    }

    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    k() {
    }

    private void a(Typeface typeface, androidx.core.content.d.e.b bVar) {
        long j2 = j(typeface);
        if (j2 != 0) {
            this.a.put(Long.valueOf(j2), bVar);
        }
    }

    private androidx.core.content.d.e.c f(androidx.core.content.d.e.b bVar, int i2) {
        return (androidx.core.content.d.e.c) g(bVar.a(), i2, new b(this));
    }

    private static <T> T g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? Utils.HE_DEFAULT_RELATIVE_TIME : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(cVar.a(t2) - i3) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > iAbs) {
                t = t2;
                i4 = iAbs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public Typeface b(Context context, androidx.core.content.d.e.b bVar, Resources resources, int i2) {
        androidx.core.content.d.e.c cVarF = f(bVar, i2);
        if (cVarF == null) {
            return null;
        }
        Typeface typefaceD = e.d(context, resources, cVarF.b(), cVarF.a(), i2);
        a(typefaceD, bVar);
        return typefaceD;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, h.h.i.f.b[] bVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(bVarArr, i2).d());
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                l.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                l.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                l.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.c(fileE, resources, i2)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected h.h.i.f.b h(h.h.i.f.b[] bVarArr, int i2) {
        return (h.h.i.f.b) g(bVarArr, i2, new a(this));
    }

    androidx.core.content.d.e.b i(Typeface typeface) {
        long j2 = j(typeface);
        if (j2 == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j2));
    }
}
