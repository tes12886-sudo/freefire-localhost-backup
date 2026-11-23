package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f630n = new a(null);
    private final boolean a;
    private final int b;
    private final EnumSet<g0> c;
    private final Map<String, Map<String, b>> d;
    private final boolean e;
    private final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JSONArray f633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f637m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final b a(String str, String str2, String str3) {
            t tVarJ;
            Map<String, b> map;
            l.y.c.i.e(str, "applicationId");
            l.y.c.i.e(str2, "actionName");
            l.y.c.i.e(str3, "featureName");
            if (h0.Y(str2) || h0.Y(str3) || (tVarJ = u.j(str)) == null || (map = tVarJ.c().get(str2)) == null) {
                return null;
            }
            return map.get(str3);
        }
    }

    public static final class b {
        public static final a d = new a(null);
        private final String a;
        private final String b;
        private final int[] c;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(l.y.c.f fVar) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = -1;
                    int iOptInt = jSONArray.optInt(i2, -1);
                    if (iOptInt == -1) {
                        String strOptString = jSONArray.optString(i2);
                        if (!h0.Y(strOptString)) {
                            try {
                                l.y.c.i.d(strOptString, "versionString");
                                i3 = Integer.parseInt(strOptString);
                            } catch (NumberFormatException e) {
                                h0.e0("FacebookSDK", e);
                            }
                            iOptInt = i3;
                        }
                    }
                    iArr[i2] = iOptInt;
                }
                return iArr;
            }

            public final b a(JSONObject jSONObject) {
                l.y.c.i.e(jSONObject, "dialogConfigJSON");
                String strOptString = jSONObject.optString("name");
                if (h0.Y(strOptString)) {
                    return null;
                }
                l.y.c.i.d(strOptString, "dialogNameWithFeature");
                List listI0 = l.d0.q.i0(strOptString, new String[]{"|"}, false, 0, 6, null);
                if (listI0.size() != 2) {
                    return null;
                }
                String str = (String) l.t.k.z(listI0);
                String str2 = (String) l.t.k.F(listI0);
                if (h0.Y(str) || h0.Y(str2)) {
                    return null;
                }
                String strOptString2 = jSONObject.optString("url");
                return new b(str, str2, h0.Y(strOptString2) ? null : Uri.parse(strOptString2), b(jSONObject.optJSONArray("versions")), null);
            }
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
            this.c = iArr;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, l.y.c.f fVar) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final int[] c() {
            return this.c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(boolean z, String str, boolean z2, int i2, EnumSet<g0> enumSet, Map<String, ? extends Map<String, b>> map, boolean z3, l lVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        l.y.c.i.e(str, "nuxContent");
        l.y.c.i.e(enumSet, "smartLoginOptions");
        l.y.c.i.e(map, "dialogConfigurations");
        l.y.c.i.e(lVar, "errorClassification");
        l.y.c.i.e(str2, "smartLoginBookmarkIconURL");
        l.y.c.i.e(str3, "smartLoginMenuIconURL");
        l.y.c.i.e(str4, "sdkUpdateMessage");
        this.a = z;
        this.b = i2;
        this.c = enumSet;
        this.d = map;
        this.e = z3;
        this.f = lVar;
        this.f631g = z4;
        this.f632h = z5;
        this.f633i = jSONArray;
        this.f634j = str4;
        this.f635k = str5;
        this.f636l = str6;
        this.f637m = str7;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.f632h;
    }

    public final Map<String, Map<String, b>> c() {
        return this.d;
    }

    public final l d() {
        return this.f;
    }

    public final JSONArray e() {
        return this.f633i;
    }

    public final boolean f() {
        return this.f631g;
    }

    public final String g() {
        return this.f635k;
    }

    public final String h() {
        return this.f637m;
    }

    public final String i() {
        return this.f634j;
    }

    public final int j() {
        return this.b;
    }

    public final EnumSet<g0> k() {
        return this.c;
    }

    public final String l() {
        return this.f636l;
    }

    public final boolean m() {
        return this.a;
    }
}
