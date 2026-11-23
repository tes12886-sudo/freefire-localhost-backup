package h.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static final k a;
    private static final h.f.e<String, Typeface> b;

    public static class a extends h.h.i.f.c {
        private androidx.core.content.d.h.d a;

        public a(androidx.core.content.d.h.d dVar) {
            this.a = dVar;
        }

        @Override // h.h.i.f.c
        public void a(int i2) {
            androidx.core.content.d.h.d dVar = this.a;
            if (dVar != null) {
                dVar.d(i2);
            }
        }

        @Override // h.h.i.f.c
        public void b(Typeface typeface) {
            androidx.core.content.d.h.d dVar = this.a;
            if (dVar != null) {
                dVar.e(typeface);
            }
        }
    }

    static {
        k fVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            fVar = new j();
        } else if (i2 >= 28) {
            fVar = new i();
        } else if (i2 >= 26) {
            fVar = new h();
        } else if (i2 < 24 || !g.m()) {
            fVar = i2 >= 21 ? new f() : new k();
        } else {
            fVar = new g();
        }
        a = fVar;
        b = new h.f.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, h.h.i.f.b[] bVarArr, int i2) {
        return a.c(context, cancellationSignal, bVarArr, i2);
    }

    public static Typeface c(Context context, androidx.core.content.d.e.a aVar, Resources resources, int i2, int i3, androidx.core.content.d.h.d dVar, Handler handler, boolean z) {
        Typeface typefaceB;
        if (aVar instanceof androidx.core.content.d.e.d) {
            androidx.core.content.d.e.d dVar2 = (androidx.core.content.d.e.d) aVar;
            Typeface typefaceH = h(dVar2.c());
            if (typefaceH != null) {
                if (dVar != null) {
                    dVar.b(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceB = h.h.i.f.c(context, dVar2.b(), i3, !z ? dVar != null : dVar2.a() != 0, z ? dVar2.d() : -1, androidx.core.content.d.h.d.c(handler), new a(dVar));
        } else {
            typefaceB = a.b(context, (androidx.core.content.d.e.b) aVar, resources, i3);
            if (dVar != null) {
                if (typefaceB != null) {
                    dVar.b(typefaceB, handler);
                } else {
                    dVar.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            b.d(e(resources, i2, i3), typefaceB);
        }
        return typefaceB;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceE = a.e(context, resources, i2, str, i3);
        if (typefaceE != null) {
            b.d(e(resources, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    private static String e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface f(Resources resources, int i2, int i3) {
        return b.c(e(resources, i2, i3));
    }

    private static Typeface g(Context context, Typeface typeface, int i2) {
        k kVar = a;
        androidx.core.content.d.e.b bVarI = kVar.i(typeface);
        if (bVarI == null) {
            return null;
        }
        return kVar.b(context, bVarI, context.getResources(), i2);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
