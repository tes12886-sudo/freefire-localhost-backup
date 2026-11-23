package com.facebook.internal.m0.h;

import android.util.Log;
import com.facebook.internal.h0;
import com.facebook.internal.m0.b;
import com.facebook.r;
import com.facebook.u;
import com.facebook.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l.t.z;
import l.y.c.f;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {
    private static a c;
    private final Thread.UncaughtExceptionHandler a;
    public static final C0062a d = new C0062a(null);
    private static final String b = a.class.getCanonicalName();

    /* JADX INFO: renamed from: com.facebook.internal.m0.h.a$a, reason: collision with other inner class name */
    public static final class C0062a {

        /* JADX INFO: renamed from: com.facebook.internal.m0.h.a$a$a, reason: collision with other inner class name */
        static final class C0063a implements u.b {
            final /* synthetic */ List a;

            C0063a(List list) {
                this.a = list;
            }

            @Override // com.facebook.u.b
            public final void b(x xVar) {
                JSONObject jSONObjectD;
                i.e(xVar, "response");
                try {
                    if (xVar.b() == null && (jSONObjectD = xVar.d()) != null && jSONObjectD.getBoolean("success")) {
                        Iterator it = this.a.iterator();
                        while (it.hasNext()) {
                            ((com.facebook.internal.m0.b) it.next()).a();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.internal.m0.h.a$a$b */
        static final class b<T> implements Comparator {
            public static final b a = new b();

            b() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.facebook.internal.m0.b bVar, com.facebook.internal.m0.b bVar2) {
                i.d(bVar2, "o2");
                return bVar.b(bVar2);
            }
        }

        private C0062a() {
        }

        public /* synthetic */ C0062a(f fVar) {
            this();
        }

        private final void b() {
            if (h0.V()) {
                return;
            }
            File[] fileArrJ = com.facebook.internal.m0.f.j();
            ArrayList arrayList = new ArrayList(fileArrJ.length);
            for (File file : fileArrJ) {
                arrayList.add(com.facebook.internal.m0.b.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((com.facebook.internal.m0.b) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            List listM = l.t.u.M(arrayList2, b.a);
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = l.a0.i.i(0, Math.min(listM.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listM.get(((z) it).a()));
            }
            com.facebook.internal.m0.f.l("crash_reports", jSONArray, new C0063a(listM));
        }

        public final synchronized void a() {
            if (r.j()) {
                b();
            }
            if (a.c != null) {
                Log.w(a.b, "Already enabled!");
            } else {
                a.c = new a(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(a.c);
            }
        }
    }

    private a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public /* synthetic */ a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, f fVar) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        i.e(thread, "t");
        i.e(th, "e");
        if (com.facebook.internal.m0.f.f(th)) {
            com.facebook.internal.m0.a.b(th);
            b.a.b(th, b.c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
