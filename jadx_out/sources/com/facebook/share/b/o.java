package com.facebook.share.b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.internal.b0;
import com.facebook.internal.c0;
import com.facebook.internal.h0;
import com.facebook.r;
import com.facebook.share.c.t;
import com.facebook.share.c.u;
import com.facebook.share.c.v;
import com.facebook.share.c.w;
import com.facebook.share.c.x;
import com.facebook.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    static class a implements h0.b<b0.a, Bundle> {
        a() {
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle apply(b0.a aVar) {
            Bundle bundle = new Bundle();
            bundle.putString("uri", aVar.b());
            String strN = o.n(aVar.e());
            if (strN != null) {
                h0.o0(bundle, "extension", strN);
            }
            return bundle;
        }
    }

    static class b implements h0.b<com.facebook.share.c.h, Bundle> {
        final /* synthetic */ UUID a;
        final /* synthetic */ List b;

        b(UUID uuid, List list) {
            this.a = uuid;
            this.b = list;
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle apply(com.facebook.share.c.h hVar) {
            b0.a aVarA = o.a(this.a, hVar);
            this.b.add(aVarA);
            Bundle bundle = new Bundle();
            bundle.putString("type", hVar.a().name());
            bundle.putString("uri", aVarA.b());
            String strN = o.n(aVarA.e());
            if (strN != null) {
                h0.o0(bundle, "extension", strN);
            }
            return bundle;
        }
    }

    static class c extends com.facebook.share.b.k {
        final /* synthetic */ com.facebook.l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.facebook.l lVar, com.facebook.l lVar2) {
            super(lVar);
            this.b = lVar2;
        }

        @Override // com.facebook.share.b.k
        public void a(com.facebook.internal.a aVar) {
            o.q(this.b);
        }

        @Override // com.facebook.share.b.k
        public void b(com.facebook.internal.a aVar, com.facebook.n nVar) {
            o.r(this.b, nVar);
        }

        @Override // com.facebook.share.b.k
        public void c(com.facebook.internal.a aVar, Bundle bundle) {
            if (bundle != null) {
                String strH = o.h(bundle);
                if (strH == null || "post".equalsIgnoreCase(strH)) {
                    o.s(this.b, o.j(bundle));
                } else if ("cancel".equalsIgnoreCase(strH)) {
                    o.q(this.b);
                } else {
                    o.r(this.b, new com.facebook.n("UnknownError"));
                }
            }
        }
    }

    static class d implements com.facebook.internal.e.a {
        final /* synthetic */ int a;

        d(int i2) {
            this.a = i2;
        }

        @Override // com.facebook.internal.e.a
        public boolean a(int i2, Intent intent) {
            return o.p(this.a, i2, intent, o.k(null));
        }
    }

    static class e implements com.facebook.internal.e.a {
        final /* synthetic */ int a;
        final /* synthetic */ com.facebook.l b;

        e(int i2, com.facebook.l lVar) {
            this.a = i2;
            this.b = lVar;
        }

        @Override // com.facebook.internal.e.a
        public boolean a(int i2, Intent intent) {
            return o.p(this.a, i2, intent, o.k(this.b));
        }
    }

    static class f implements h0.b<t, b0.a> {
        final /* synthetic */ UUID a;

        f(UUID uuid) {
            this.a = uuid;
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0.a apply(t tVar) {
            return o.a(this.a, tVar);
        }
    }

    static class g implements h0.b<b0.a, String> {
        g() {
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(b0.a aVar) {
            return aVar.b();
        }
    }

    static class h implements h0.b<com.facebook.share.c.h, Bundle> {
        final /* synthetic */ UUID a;
        final /* synthetic */ List b;

        h(UUID uuid, List list) {
            this.a = uuid;
            this.b = list;
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle apply(com.facebook.share.c.h hVar) {
            b0.a aVarA = o.a(this.a, hVar);
            this.b.add(aVarA);
            Bundle bundle = new Bundle();
            bundle.putString("type", hVar.a().name());
            bundle.putString("uri", aVarA.b());
            return bundle;
        }
    }

    static class i implements com.facebook.share.b.j.a {
        final /* synthetic */ UUID a;
        final /* synthetic */ ArrayList b;

        i(UUID uuid, ArrayList arrayList) {
            this.a = uuid;
            this.b = arrayList;
        }

        @Override // com.facebook.share.b.j.a
        public JSONObject a(t tVar) {
            b0.a aVarA = o.a(this.a, tVar);
            if (aVarA == null) {
                return null;
            }
            this.b.add(aVarA);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVarA.b());
                if (tVar.f()) {
                    jSONObject.put("user_generated", true);
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new com.facebook.n("Unable to attach images", e);
            }
        }
    }

    static class j implements com.facebook.share.b.j.a {
        j() {
        }

        @Override // com.facebook.share.b.j.a
        public JSONObject a(t tVar) {
            Uri uriE = tVar.e();
            if (!h0.a0(uriE)) {
                throw new com.facebook.n("Only web images may be used in OG objects shared via the web dialog");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", uriE.toString());
                return jSONObject;
            } catch (JSONException e) {
                throw new com.facebook.n("Unable to attach images", e);
            }
        }
    }

    static class k implements h0.b<t, b0.a> {
        final /* synthetic */ UUID a;

        k(UUID uuid) {
            this.a = uuid;
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0.a apply(t tVar) {
            return o.a(this.a, tVar);
        }
    }

    public static JSONObject A(UUID uuid, com.facebook.share.c.q qVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            com.facebook.share.c.p pVarH = qVar.h();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectB = com.facebook.share.b.j.b(pVarH, new i(uuid, arrayList));
            b0.a(arrayList);
            if (qVar.d() != null && h0.Y(jSONObjectB.optString("place"))) {
                jSONObjectB.put("place", qVar.d());
            }
            if (qVar.c() != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("tags");
                Set hashSet = jSONArrayOptJSONArray == null ? new HashSet() : h0.b0(jSONArrayOptJSONArray);
                Iterator<String> it = qVar.c().iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
                jSONObjectB.put("tags", new JSONArray((Collection) hashSet));
            }
            return jSONObjectB;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static JSONObject B(com.facebook.share.c.q qVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            return com.facebook.share.b.j.b(qVar.h(), new j());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    static /* synthetic */ b0.a a(UUID uuid, com.facebook.share.c.h hVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            return d(uuid, hVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    private static com.facebook.internal.a b(int i2, int i3, Intent intent) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            UUID uuidT = c0.t(intent);
            if (uuidT == null) {
                return null;
            }
            return com.facebook.internal.a.c(uuidT, i2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    private static b0.a c(UUID uuid, Uri uri, Bitmap bitmap) {
        b0.a aVarE = null;
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            if (bitmap == null) {
                if (uri != null) {
                    aVarE = b0.e(uuid, uri);
                }
                return aVarE;
            }
            aVarE = b0.d(uuid, bitmap);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
        return aVarE;
    }

    private static b0.a d(UUID uuid, com.facebook.share.c.h hVar) {
        Uri uriC;
        Bitmap bitmapC;
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            if (hVar instanceof t) {
                t tVar = (t) hVar;
                bitmapC = tVar.c();
                uriC = tVar.e();
            } else if (hVar instanceof w) {
                uriC = ((w) hVar).c();
                bitmapC = null;
            } else {
                uriC = null;
                bitmapC = null;
            }
            return c(uuid, uriC, bitmapC);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static Bundle e(v vVar, UUID uuid) {
        if (!com.facebook.internal.m0.i.a.d(o.class) && vVar != null) {
            try {
                if (vVar.i() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vVar.i());
                    ArrayList arrayList2 = new ArrayList();
                    List listH0 = h0.h0(arrayList, new b(uuid, arrayList2));
                    b0.a(arrayList2);
                    return (Bundle) listH0.get(0);
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, o.class);
            }
        }
        return null;
    }

    public static Pair<String, String> f(String str) {
        String strSubstring;
        int i2;
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf == -1 || str.length() <= (i2 = iIndexOf + 1)) {
                strSubstring = null;
            } else {
                strSubstring = str.substring(0, iIndexOf);
                str = str.substring(i2);
            }
            return new Pair<>(strSubstring, str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static List<Bundle> g(com.facebook.share.c.i iVar, UUID uuid) {
        if (!com.facebook.internal.m0.i.a.d(o.class) && iVar != null) {
            try {
                List<com.facebook.share.c.h> listH = iVar.h();
                if (listH != null) {
                    ArrayList arrayList = new ArrayList();
                    List<Bundle> listH0 = h0.h0(listH, new h(uuid, arrayList));
                    b0.a(arrayList);
                    return listH0;
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, o.class);
            }
        }
        return null;
    }

    public static String h(Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            return bundle.containsKey("completionGesture") ? bundle.getString("completionGesture") : bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static List<String> i(u uVar, UUID uuid) {
        if (!com.facebook.internal.m0.i.a.d(o.class) && uVar != null) {
            try {
                List<t> listH = uVar.h();
                if (listH != null) {
                    List listH0 = h0.h0(listH, new f(uuid));
                    List<String> listH1 = h0.h0(listH0, new g());
                    b0.a(listH0);
                    return listH1;
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, o.class);
            }
        }
        return null;
    }

    public static String j(Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            if (bundle.containsKey("postId")) {
                return bundle.getString("postId");
            }
            return bundle.containsKey("com.facebook.platform.extra.POST_ID") ? bundle.getString("com.facebook.platform.extra.POST_ID") : bundle.getString("post_id");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static com.facebook.share.b.k k(com.facebook.l<com.facebook.share.a> lVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            return new c(lVar, lVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static Bundle l(v vVar, UUID uuid) {
        if (!com.facebook.internal.m0.i.a.d(o.class) && vVar != null) {
            try {
                if (vVar.k() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vVar.k());
                    List listH0 = h0.h0(arrayList, new k(uuid));
                    List listH1 = h0.h0(listH0, new a());
                    b0.a(listH0);
                    return (Bundle) listH1.get(0);
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, o.class);
            }
        }
        return null;
    }

    public static Bundle m(com.facebook.share.c.d dVar, UUID uuid) {
        if (!com.facebook.internal.m0.i.a.d(o.class) && dVar != null) {
            try {
                com.facebook.share.c.b bVarJ = dVar.j();
                if (bVarJ != null) {
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (String str : bVarJ.d()) {
                        b0.a aVarC = c(uuid, bVarJ.c(str), bVarJ.b(str));
                        arrayList.add(aVarC);
                        bundle.putString(str, aVarC.b());
                    }
                    b0.a(arrayList);
                    return bundle;
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, o.class);
            }
        }
        return null;
    }

    public static String n(Uri uri) {
        if (com.facebook.internal.m0.i.a.d(o.class) || uri == null) {
            return null;
        }
        try {
            String string = uri.toString();
            int iLastIndexOf = string.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            return string.substring(iLastIndexOf);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static String o(x xVar, UUID uuid) {
        if (!com.facebook.internal.m0.i.a.d(o.class) && xVar != null) {
            try {
                if (xVar.k() != null) {
                    b0.a aVarE = b0.e(uuid, xVar.k().c());
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(aVarE);
                    b0.a(arrayList);
                    return aVarE.b();
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, o.class);
            }
        }
        return null;
    }

    public static boolean p(int i2, int i3, Intent intent, com.facebook.share.b.k kVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return false;
        }
        try {
            com.facebook.internal.a aVarB = b(i2, i3, intent);
            if (aVarB == null) {
                return false;
            }
            b0.c(aVarB.d());
            if (kVar == null) {
                return true;
            }
            com.facebook.n nVarV = c0.v(c0.u(intent));
            if (nVarV == null) {
                kVar.c(aVarB, c0.C(intent));
            } else if (nVarV instanceof com.facebook.p) {
                kVar.a(aVarB);
            } else {
                kVar.b(aVarB, nVarV);
            }
            return true;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return false;
        }
    }

    static void q(com.facebook.l<com.facebook.share.a> lVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return;
        }
        try {
            t("cancelled", null);
            if (lVar != null) {
                lVar.a();
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
    }

    static void r(com.facebook.l<com.facebook.share.a> lVar, com.facebook.n nVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return;
        }
        try {
            t("error", nVar.getMessage());
            if (lVar != null) {
                lVar.b(nVar);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
    }

    static void s(com.facebook.l<com.facebook.share.a> lVar, String str) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return;
        }
        try {
            t("succeeded", null);
            if (lVar != null) {
                lVar.onSuccess(new com.facebook.share.a(str));
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
    }

    private static void t(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return;
        }
        try {
            com.facebook.j0.m mVar = new com.facebook.j0.m(r.f());
            Bundle bundle = new Bundle();
            bundle.putString("fb_share_dialog_outcome", str);
            if (str2 != null) {
                bundle.putString("error_message", str2);
            }
            mVar.g("fb_share_dialog_result", bundle);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
    }

    public static com.facebook.u u(com.facebook.a aVar, Uri uri, com.facebook.u.b bVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            if (h0.W(uri)) {
                return v(aVar, new File(uri.getPath()), bVar);
            }
            if (!h0.T(uri)) {
                throw new com.facebook.n("The image Uri must be either a file:// or content:// Uri");
            }
            com.facebook.u.g gVar = new com.facebook.u.g(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new com.facebook.u(aVar, "me/staging_resources", bundle, y.POST, bVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static com.facebook.u v(com.facebook.a aVar, File file, com.facebook.u.b bVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            com.facebook.u.g gVar = new com.facebook.u.g(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new com.facebook.u(aVar, "me/staging_resources", bundle, y.POST, bVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    public static void w(int i2, com.facebook.j jVar, com.facebook.l<com.facebook.share.a> lVar) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return;
        }
        try {
            if (!(jVar instanceof com.facebook.internal.e)) {
                throw new com.facebook.n("Unexpected CallbackManager, please use the provided Factory.");
            }
            ((com.facebook.internal.e) jVar).c(i2, new e(i2, lVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
    }

    public static void x(int i2) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return;
        }
        try {
            com.facebook.internal.e.d(i2, new d(i2));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
        }
    }

    public static JSONArray y(JSONArray jSONArray, boolean z) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object objZ = jSONArray.get(i2);
                if (objZ instanceof JSONArray) {
                    objZ = y((JSONArray) objZ, z);
                } else if (objZ instanceof JSONObject) {
                    objZ = z((JSONObject) objZ, z);
                }
                jSONArray2.put(objZ);
            }
            return jSONArray2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b A[Catch: all -> 0x0089, JSONException -> 0x008b, TryCatch #1 {JSONException -> 0x008b, blocks: (B:7:0x000d, B:8:0x001c, B:10:0x0022, B:12:0x002f, B:16:0x0040, B:19:0x0050, B:21:0x0058, B:32:0x007a, B:23:0x005e, B:26:0x0067, B:27:0x006b, B:29:0x0071, B:13:0x0036, B:15:0x003a, B:33:0x007d, B:35:0x0083), top: B:44:0x000d, outer: #0 }] */
    public static JSONObject z(JSONObject jSONObject, boolean z) {
        if (com.facebook.internal.m0.i.a.d(o.class)) {
            return null;
        }
        try {
            if (jSONObject == null) {
                return null;
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String string = jSONArrayNames.getString(i2);
                    Object objY = jSONObject.get(string);
                    if (objY instanceof JSONObject) {
                        objY = z((JSONObject) objY, true);
                    } else if (objY instanceof JSONArray) {
                        objY = y((JSONArray) objY, true);
                    }
                    Pair<String, String> pairF = f(string);
                    String str = (String) pairF.first;
                    String str2 = (String) pairF.second;
                    if (z) {
                        if (str != null && str.equals("fbsdk")) {
                            jSONObject2.put(string, objY);
                        } else if (str == null || str.equals("og")) {
                            jSONObject2.put(str2, objY);
                        } else {
                            jSONObject3.put(str2, objY);
                        }
                    } else if (str == null || !str.equals("fb")) {
                        jSONObject2.put(str2, objY);
                    } else {
                        jSONObject2.put(string, objY);
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("data", jSONObject3);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                throw new com.facebook.n("Failed to create json object from share content");
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, o.class);
            return null;
        }
    }
}
