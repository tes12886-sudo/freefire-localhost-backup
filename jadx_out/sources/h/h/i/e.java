package h.h.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.FF.voiceengine.FFVoiceConst;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
class e {
    static final h.f.e<String, Typeface> a = new h.f.e<>(16);
    private static final ExecutorService b = g.a("fonts-androidx", 10, FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
    static final Object c = new Object();
    static final h.f.g<String, ArrayList<h.h.k.a<C0194e>>> d = new h.f.g<>();

    class a implements Callable<C0194e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ h.h.i.d c;
        final /* synthetic */ int d;

        a(String str, Context context, h.h.i.d dVar, int i2) {
            this.a = str;
            this.b = context;
            this.c = dVar;
            this.d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0194e call() {
            return e.c(this.a, this.b, this.c, this.d);
        }
    }

    class b implements h.h.k.a<C0194e> {
        final /* synthetic */ h.h.i.a a;

        b(h.h.i.a aVar) {
            this.a = aVar;
        }

        @Override // h.h.k.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C0194e c0194e) {
            if (c0194e == null) {
                c0194e = new C0194e(-3);
            }
            this.a.b(c0194e);
        }
    }

    class c implements Callable<C0194e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ h.h.i.d c;
        final /* synthetic */ int d;

        c(String str, Context context, h.h.i.d dVar, int i2) {
            this.a = str;
            this.b = context;
            this.c = dVar;
            this.d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0194e call() {
            try {
                return e.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new C0194e(-3);
            }
        }
    }

    class d implements h.h.k.a<C0194e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // h.h.k.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C0194e c0194e) {
            synchronized (e.c) {
                h.f.g<String, ArrayList<h.h.k.a<C0194e>>> gVar = e.d;
                ArrayList<h.h.k.a<C0194e>> arrayList = gVar.get(this.a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).accept(c0194e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h.h.i.e$e, reason: collision with other inner class name */
    static final class C0194e {
        final Typeface a;
        final int b;

        C0194e(int i2) {
            this.a = null;
            this.b = i2;
        }

        @SuppressLint({"WrongConstant"})
        C0194e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.b == 0;
        }
    }

    private static String a(h.h.i.d dVar, int i2) {
        return dVar.d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(f.a aVar) {
        int i2 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i2 = 0;
            for (f.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i2;
    }

    static C0194e c(String str, Context context, h.h.i.d dVar, int i2) {
        h.f.e<String, Typeface> eVar = a;
        Typeface typefaceC = eVar.c(str);
        if (typefaceC != null) {
            return new C0194e(typefaceC);
        }
        try {
            f.a aVarD = h.h.i.c.d(context, dVar, null);
            int iB = b(aVarD);
            if (iB != 0) {
                return new C0194e(iB);
            }
            Typeface typefaceB = h.h.e.e.b(context, null, aVarD.b(), i2);
            if (typefaceB == null) {
                return new C0194e(-3);
            }
            eVar.d(str, typefaceB);
            return new C0194e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0194e(-1);
        }
    }

    static Typeface d(Context context, h.h.i.d dVar, int i2, Executor executor, h.h.i.a aVar) {
        String strA = a(dVar, i2);
        Typeface typefaceC = a.c(strA);
        if (typefaceC != null) {
            aVar.b(new C0194e(typefaceC));
            return typefaceC;
        }
        b bVar = new b(aVar);
        synchronized (c) {
            h.f.g<String, ArrayList<h.h.k.a<C0194e>>> gVar = d;
            ArrayList<h.h.k.a<C0194e>> arrayList = gVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<h.h.k.a<C0194e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(strA, arrayList2);
            c cVar = new c(strA, context, dVar, i2);
            if (executor == null) {
                executor = b;
            }
            g.b(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(Context context, h.h.i.d dVar, h.h.i.a aVar, int i2, int i3) {
        String strA = a(dVar, i2);
        Typeface typefaceC = a.c(strA);
        if (typefaceC != null) {
            aVar.b(new C0194e(typefaceC));
            return typefaceC;
        }
        if (i3 == -1) {
            C0194e c0194eC = c(strA, context, dVar, i2);
            aVar.b(c0194eC);
            return c0194eC.a;
        }
        try {
            C0194e c0194e = (C0194e) g.c(b, new a(strA, context, dVar, i2), i3);
            aVar.b(c0194e);
            return c0194e.a;
        } catch (InterruptedException unused) {
            aVar.b(new C0194e(-3));
            return null;
        }
    }
}
