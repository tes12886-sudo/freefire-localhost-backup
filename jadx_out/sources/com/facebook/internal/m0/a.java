package com.facebook.internal.m0;

import com.facebook.internal.h0;
import com.facebook.internal.p;
import com.facebook.r;
import com.facebook.u;
import com.facebook.w;
import com.facebook.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static boolean a;
    public static final a b = new a();

    /* JADX INFO: renamed from: com.facebook.internal.m0.a$a, reason: collision with other inner class name */
    static final class C0058a implements u.b {
        final /* synthetic */ b a;

        C0058a(b bVar) {
            this.a = bVar;
        }

        @Override // com.facebook.u.b
        public final void b(x xVar) {
            JSONObject jSONObjectD;
            i.e(xVar, "response");
            try {
                if (xVar.b() == null && (jSONObjectD = xVar.d()) != null && jSONObjectD.getBoolean("success")) {
                    this.a.a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    private a() {
    }

    public static final void a() {
        a = true;
        if (r.j()) {
            b.d();
        }
    }

    public static final void b(Throwable th) {
        if (!a || c() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        i.d(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            i.d(stackTraceElement, "it");
            String className = stackTraceElement.getClassName();
            i.d(className, "it.className");
            p.b bVarD = p.d(className);
            if (bVarD != p.b.Unknown) {
                p.c(bVarD);
                hashSet.add(bVarD.toString());
            }
        }
        if (r.j() && (!hashSet.isEmpty())) {
            b.a.c(new JSONArray((Collection) hashSet)).g();
        }
    }

    public static final boolean c() {
        return false;
    }

    public final void d() {
        if (h0.V()) {
            return;
        }
        File[] fileArrI = f.i();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrI) {
            b bVarD = b.a.d(file);
            if (bVarD.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", bVarD.toString());
                    u.c cVar = u.t;
                    o oVar = o.a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{r.g()}, 1));
                    i.d(str, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.x(null, str, jSONObject, new C0058a(bVarD)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new w(arrayList).l();
    }
}
