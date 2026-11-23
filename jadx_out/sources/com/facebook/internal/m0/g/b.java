package com.facebook.internal.m0.g;

import com.facebook.internal.h0;
import com.facebook.internal.m0.f;
import com.facebook.r;
import com.facebook.u;
import com.facebook.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.t.z;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    static final class a implements u.b {
        final /* synthetic */ List a;

        a(List list) {
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

    /* JADX INFO: renamed from: com.facebook.internal.m0.g.b$b, reason: collision with other inner class name */
    static final class C0061b<T> implements Comparator {
        public static final C0061b a = new C0061b();

        C0061b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(com.facebook.internal.m0.b bVar, com.facebook.internal.m0.b bVar2) {
            i.d(bVar2, "o2");
            return bVar.b(bVar2);
        }
    }

    private b() {
    }

    public static final synchronized void a() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            if (a.getAndSet(true)) {
                return;
            }
            if (r.j()) {
                b();
            }
            com.facebook.internal.m0.g.a.b();
            return;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return;
        }
        throw th;
    }

    public static final void b() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return;
        }
        try {
            if (h0.V()) {
                return;
            }
            File[] fileArrH = f.h();
            ArrayList arrayList = new ArrayList(fileArrH.length);
            for (File file : fileArrH) {
                arrayList.add(com.facebook.internal.m0.b.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((com.facebook.internal.m0.b) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            List listM = l.t.u.M(arrayList2, C0061b.a);
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = l.a0.i.i(0, Math.min(listM.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listM.get(((z) it).a()));
            }
            f.l("anr_reports", jSONArray, new a(listM));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
        }
    }
}
