package com.facebook.j0.w;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.h0;
import com.facebook.r;
import com.facebook.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.d0.p;
import l.d0.q;
import l.k;
import l.t.m;
import l.t.n;
import l.t.z;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d d = new d();
    private static final Map<String, b> a = new ConcurrentHashMap();
    private static final List<String> b = m.i("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    private static final List<String> c = m.i("none", "address", "health");

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String a() {
            int i2 = com.facebook.j0.w.c.a[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 == 2) {
                return "app_event_pred";
            }
            throw new k();
        }

        public final String c() {
            int i2 = com.facebook.j0.w.c.b[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new k();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f684i = new a(null);
        private File a;
        private com.facebook.j0.w.b b;
        private Runnable c;
        private String d;
        private String e;
        private String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float[] f686h;

        public static final class a {

            /* JADX INFO: renamed from: com.facebook.j0.w.d$b$a$a, reason: collision with other inner class name */
            static final class C0088a implements com.facebook.j0.v.f.a {
                final /* synthetic */ List a;

                /* JADX INFO: renamed from: com.facebook.j0.w.d$b$a$a$a, reason: collision with other inner class name */
                static final class C0089a implements com.facebook.j0.v.f.a {
                    final /* synthetic */ b a;
                    final /* synthetic */ com.facebook.j0.w.b b;

                    C0089a(b bVar, com.facebook.j0.w.b bVar2) {
                        this.a = bVar;
                        this.b = bVar2;
                    }

                    @Override // com.facebook.j0.v.f.a
                    public final void a(File file) {
                        i.e(file, "file");
                        this.a.i(this.b);
                        this.a.k(file);
                        Runnable runnable = this.a.c;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }

                C0088a(List list) {
                    this.a = list;
                }

                @Override // com.facebook.j0.v.f.a
                public final void a(File file) {
                    i.e(file, "file");
                    com.facebook.j0.w.b bVarA = com.facebook.j0.w.b.f677n.a(file);
                    if (bVarA != null) {
                        for (b bVar : this.a) {
                            b.f684i.d(bVar.e(), bVar.g() + "_" + bVar.h() + "_rule", new C0089a(bVar, bVarA));
                        }
                    }
                }
            }

            private a() {
            }

            public /* synthetic */ a(l.y.c.f fVar) {
                this();
            }

            private final void c(String str, int i2) {
                File[] fileArrListFiles;
                File fileA = g.a();
                if (fileA == null || (fileArrListFiles = fileA.listFiles()) == null) {
                    return;
                }
                if (fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + "_" + i2;
                for (File file : fileArrListFiles) {
                    i.d(file, "f");
                    String name = file.getName();
                    i.d(name, "name");
                    if (p.x(name, str, false, 2, null) && !p.x(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void d(String str, String str2, com.facebook.j0.v.f.a aVar) {
                File file = new File(g.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new com.facebook.j0.v.f(str, file, aVar).execute(new String[0]);
                }
            }

            public final b b(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i2 = jSONObject.getInt("version_id");
                    float[] fArrE = d.e(d.d, jSONObject.getJSONArray("thresholds"));
                    i.d(string, "useCase");
                    i.d(string2, "assetUri");
                    return new b(string, string2, strOptString, i2, fArrE);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void e(b bVar, List<b> list) {
                i.e(bVar, "master");
                i.e(list, "slaves");
                c(bVar.g(), bVar.h());
                d(bVar.b(), bVar.g() + "_" + bVar.h(), new C0088a(list));
            }
        }

        public b(String str, String str2, String str3, int i2, float[] fArr) {
            i.e(str, "useCase");
            i.e(str2, "assetUri");
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.f685g = i2;
            this.f686h = fArr;
        }

        public final String b() {
            return this.e;
        }

        public final com.facebook.j0.w.b c() {
            return this.b;
        }

        public final File d() {
            return this.a;
        }

        public final String e() {
            return this.f;
        }

        public final float[] f() {
            return this.f686h;
        }

        public final String g() {
            return this.d;
        }

        public final int h() {
            return this.f685g;
        }

        public final void i(com.facebook.j0.w.b bVar) {
            this.b = bVar;
        }

        public final b j(Runnable runnable) {
            this.c = runnable;
            return this;
        }

        public final void k(File file) {
            this.a = file;
        }
    }

    static final class c implements Runnable {
        public static final c a = new c();

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = r.f().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                String string = sharedPreferences.getString("models", null);
                if (string != null) {
                    jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
                }
                long j2 = sharedPreferences.getLong("model_request_timestamp", 0L);
                if (!com.facebook.internal.p.g(com.facebook.internal.p.b.ModelRequest) || jSONObject.length() == 0 || !d.d(d.d, j2)) {
                    jSONObject = d.c(d.d);
                    if (jSONObject == null) {
                        return;
                    } else {
                        sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                    }
                }
                d dVar = d.d;
                d.a(dVar, jSONObject);
                d.b(dVar);
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.w.d$d, reason: collision with other inner class name */
    static final class RunnableC0090d implements Runnable {
        public static final RunnableC0090d a = new RunnableC0090d();

        RunnableC0090d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                com.facebook.j0.z.d.c();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class e implements Runnable {
        public static final e a = new e();

        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                com.facebook.j0.u.a.a();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private d() {
    }

    public static final /* synthetic */ void a(d dVar, JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            dVar.f(jSONObject);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    public static final /* synthetic */ void b(d dVar) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            dVar.h();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    public static final /* synthetic */ JSONObject c(d dVar) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            return dVar.i();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean d(d dVar, long j2) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return false;
        }
        try {
            return dVar.l(j2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return false;
        }
    }

    public static final /* synthetic */ float[] e(d dVar, JSONArray jSONArray) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            return dVar.m(jSONArray);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    private final void f(JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    b bVarB = b.f684i.b(jSONObject.getJSONObject(itKeys.next()));
                    if (bVarB != null) {
                        a.put(bVarB.g(), bVarB);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final void g() {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            h0.y0(c.a);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    private final void h() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String strB = null;
            int iMax = 0;
            for (Map.Entry<String, b> entry : a.entrySet()) {
                String key = entry.getKey();
                b value = entry.getValue();
                if (i.a(key, a.MTML_APP_EVENT_PREDICTION.c())) {
                    strB = value.b();
                    iMax = Math.max(iMax, value.h());
                    if (com.facebook.internal.p.g(com.facebook.internal.p.b.SuggestedEvents) && k()) {
                        value.j(RunnableC0090d.a);
                        arrayList.add(value);
                    }
                }
                if (i.a(key, a.MTML_INTEGRITY_DETECT.c())) {
                    String strB2 = value.b();
                    int iMax2 = Math.max(iMax, value.h());
                    if (com.facebook.internal.p.g(com.facebook.internal.p.b.IntelligentIntegrity)) {
                        value.j(e.a);
                        arrayList.add(value);
                    }
                    strB = strB2;
                    iMax = iMax2;
                }
            }
            if (strB == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f684i.e(new b("MTML", strB, null, iMax, null), arrayList);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final JSONObject i() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            u.c cVar = u.t;
            o oVar = o.a;
            String str = String.format("%s/model_asset", Arrays.copyOf(new Object[]{r.g()}, 1));
            i.d(str, "java.lang.String.format(format, *args)");
            u uVarV = cVar.v(null, str, null);
            uVarV.H(true);
            uVarV.G(bundle);
            JSONObject jSONObjectC = uVarV.i().c();
            if (jSONObjectC != null) {
                return n(jSONObjectC);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final File j(a aVar) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(aVar, "task");
            b bVar = a.get(aVar.c());
            if (bVar != null) {
                return bVar.d();
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    private final boolean k() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            Locale localeI = h0.I();
            if (localeI != null) {
                String language = localeI.getLanguage();
                i.d(language, "locale.language");
                if (!q.C(language, "en", false, 2, null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean l(long j2) {
        if (com.facebook.internal.m0.i.a.d(this) || j2 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j2 < ((long) 259200000);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final float[] m(JSONArray jSONArray) {
        if (com.facebook.internal.m0.i.a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    i.d(string, "jsonArray.getString(i)");
                    fArr[i2] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final JSONObject n(JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final String[] o(a aVar, float[][] fArr, String[] strArr) {
        com.facebook.j0.w.b bVarC;
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(aVar, "task");
            i.e(fArr, "denses");
            i.e(strArr, "texts");
            b bVar = a.get(aVar.c());
            if (bVar == null || (bVarC = bVar.c()) == null) {
                return null;
            }
            float[] fArrF = bVar.f();
            int length = strArr.length;
            int length2 = fArr[0].length;
            com.facebook.j0.w.a aVar2 = new com.facebook.j0.w.a(new int[]{length, length2});
            for (int i2 = 0; i2 < length; i2++) {
                System.arraycopy(fArr[i2], 0, aVar2.a(), i2 * length2, length2);
            }
            com.facebook.j0.w.a aVarB = bVarC.b(aVar2, strArr, aVar.a());
            if (aVarB != null && fArrF != null) {
                if (!(aVarB.a().length == 0)) {
                    if (!(fArrF.length == 0)) {
                        int i3 = com.facebook.j0.w.e.a[aVar.ordinal()];
                        if (i3 == 1) {
                            return d.q(aVarB, fArrF);
                        }
                        if (i3 == 2) {
                            return d.p(aVarB, fArrF);
                        }
                        throw new k();
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    private final String[] p(com.facebook.j0.w.a aVar, float[] fArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            l.a0.f fVarI = l.a0.i.i(0, iB);
            ArrayList arrayList = new ArrayList(n.o(fVarI, 10));
            Iterator<Integer> it = fVarI.iterator();
            while (it.hasNext()) {
                int iA = ((z) it).a();
                String str = "none";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (fArrA[(iA * iB2) + i3] >= fArr[i2]) {
                        str = c.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final String[] q(com.facebook.j0.w.a aVar, float[] fArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            l.a0.f fVarI = l.a0.i.i(0, iB);
            ArrayList arrayList = new ArrayList(n.o(fVarI, 10));
            Iterator<Integer> it = fVarI.iterator();
            while (it.hasNext()) {
                int iA = ((z) it).a();
                String str = "other";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (fArrA[(iA * iB2) + i3] >= fArr[i2]) {
                        str = b.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
