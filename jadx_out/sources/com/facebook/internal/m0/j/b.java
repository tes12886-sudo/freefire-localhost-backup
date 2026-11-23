package com.facebook.internal.m0.j;

import com.facebook.internal.h0;
import com.facebook.r;
import com.facebook.u;
import com.facebook.x;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import l.d0.f;
import l.t.q;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static final class a implements FilenameFilter {
        public static final a a = new a();

        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            i.d(str, "name");
            o oVar = o.a;
            String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
            i.d(str2, "java.lang.String.format(format, *args)");
            return new f(str2).a(str);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.m0.j.b$b, reason: collision with other inner class name */
    static final class C0065b<T> implements Comparator {
        public static final C0065b a = new C0065b();

        C0065b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(com.facebook.internal.m0.j.a aVar, com.facebook.internal.m0.j.a aVar2) {
            i.d(aVar2, "o2");
            return aVar.b(aVar2);
        }
    }

    static final class c implements u.b {
        final /* synthetic */ ArrayList a;

        c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.u.b
        public final void b(x xVar) {
            JSONObject jSONObjectD;
            i.e(xVar, "response");
            try {
                if (xVar.b() == null && (jSONObjectD = xVar.d()) != null && jSONObjectD.getBoolean("success")) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((com.facebook.internal.m0.j.a) it.next()).a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static final void a() {
        if (r.j()) {
            d();
        }
    }

    public static final File[] b() {
        File fileC = com.facebook.internal.m0.f.c();
        if (fileC == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileC.listFiles(a.a);
        i.d(fileArrListFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    public static final void c(String str) {
        try {
            new com.facebook.internal.m0.j.a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void d() {
        if (h0.V()) {
            return;
        }
        File[] fileArrB = b();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrB) {
            com.facebook.internal.m0.j.a aVar = new com.facebook.internal.m0.j.a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        q.q(arrayList, C0065b.a);
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        com.facebook.internal.m0.f.l("error_reports", jSONArray, new c(arrayList));
    }
}
