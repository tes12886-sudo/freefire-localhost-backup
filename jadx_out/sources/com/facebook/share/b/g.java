package com.facebook.share.b;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.h0;
import com.garena.unity.webview.UnityWebViewActivityProxy;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final Pattern a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.facebook.share.c.m.b.values().length];
            c = iArr;
            try {
                iArr[com.facebook.share.c.m.b.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[com.facebook.share.c.k.b.values().length];
            b = iArr2;
            try {
                iArr2[com.facebook.share.c.k.b.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr3 = new int[com.facebook.share.c.o.b.values().length];
            a = iArr3;
            try {
                iArr3[com.facebook.share.c.o.b.WebviewHeightRatioCompact.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.facebook.share.c.o.b.WebviewHeightRatioTall.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void a(Bundle bundle, com.facebook.share.c.j jVar, boolean z) {
        if (com.facebook.internal.m0.i.a.d(g.class) || jVar == null) {
            return;
        }
        try {
            if (jVar instanceof com.facebook.share.c.o) {
                h(bundle, (com.facebook.share.c.o) jVar, z);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    public static void b(Bundle bundle, com.facebook.share.c.k kVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            c(bundle, kVar.h());
            h0.n0(bundle, "MESSENGER_PLATFORM_CONTENT", p(kVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    private static void c(Bundle bundle, com.facebook.share.c.l lVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            if (lVar.a() != null) {
                a(bundle, lVar.a(), false);
            } else if (lVar.b() != null) {
                a(bundle, lVar.b(), true);
            }
            h0.p0(bundle, "IMAGE", lVar.c());
            h0.o0(bundle, "PREVIEW_TYPE", "DEFAULT");
            h0.o0(bundle, "TITLE", lVar.e());
            h0.o0(bundle, "SUBTITLE", lVar.d());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    public static void d(Bundle bundle, com.facebook.share.c.m mVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            e(bundle, mVar);
            h0.n0(bundle, "MESSENGER_PLATFORM_CONTENT", r(mVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    private static void e(Bundle bundle, com.facebook.share.c.m mVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            a(bundle, mVar.i(), false);
            h0.o0(bundle, "PREVIEW_TYPE", "DEFAULT");
            h0.o0(bundle, "ATTACHMENT_ID", mVar.h());
            if (mVar.k() != null) {
                h0.p0(bundle, k(mVar.k()), mVar.k());
            }
            h0.o0(bundle, "type", j(mVar.j()));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    public static void f(Bundle bundle, com.facebook.share.c.n nVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            g(bundle, nVar);
            h0.n0(bundle, "MESSENGER_PLATFORM_CONTENT", t(nVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    private static void g(Bundle bundle, com.facebook.share.c.n nVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            a(bundle, nVar.h(), false);
            h0.o0(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
            h0.p0(bundle, "OPEN_GRAPH_URL", nVar.i());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    private static void h(Bundle bundle, com.facebook.share.c.o oVar, boolean z) {
        String strK;
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return;
        }
        try {
            if (z) {
                strK = h0.K(oVar.e());
            } else {
                strK = oVar.a() + " - " + h0.K(oVar.e());
            }
            h0.o0(bundle, "TARGET_DISPLAY", strK);
            h0.p0(bundle, "ITEM_URL", oVar.e());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
        }
    }

    private static String i(com.facebook.share.c.k.b bVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        if (bVar == null) {
            return "horizontal";
        }
        try {
            return a.b[bVar.ordinal()] != 1 ? "horizontal" : "square";
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static String j(com.facebook.share.c.m.b bVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        if (bVar == null) {
            return "image";
        }
        try {
            return a.c[bVar.ordinal()] != 1 ? "image" : "video";
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static String k(Uri uri) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            String host = uri.getHost();
            return (h0.Y(host) || !a.matcher(host).matches()) ? "IMAGE" : "uri";
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static String l(com.facebook.share.c.o oVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            if (oVar.d()) {
                return UnityWebViewActivityProxy.IntentActions.HIDE;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static String m(com.facebook.share.c.o.b bVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        if (bVar == null) {
            return "full";
        }
        try {
            int i2 = a.a[bVar.ordinal()];
            if (i2 != 1) {
                return i2 != 2 ? "full" : "tall";
            }
            return "compact";
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject n(com.facebook.share.c.j jVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return o(jVar, false);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject o(com.facebook.share.c.j jVar, boolean z) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            if (jVar instanceof com.facebook.share.c.o) {
                return v((com.facebook.share.c.o) jVar, z);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject p(com.facebook.share.c.k kVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", kVar.j()).put("image_aspect_ratio", i(kVar.i())).put("elements", new JSONArray().put(q(kVar.h())))));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject q(com.facebook.share.c.l lVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("title", lVar.e()).put("subtitle", lVar.d()).put("image_url", h0.K(lVar.c()));
            if (lVar.a() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(n(lVar.a()));
                jSONObjectPut.put("buttons", jSONArray);
            }
            if (lVar.b() != null) {
                jSONObjectPut.put("default_action", o(lVar.b(), true));
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject r(com.facebook.share.c.m mVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "media").put("elements", new JSONArray().put(s(mVar)))));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject s(com.facebook.share.c.m mVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("attachment_id", mVar.h()).put("url", h0.K(mVar.k())).put("media_type", j(mVar.j()));
            if (mVar.i() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(n(mVar.i()));
                jSONObjectPut.put("buttons", jSONArray);
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject t(com.facebook.share.c.n nVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(u(nVar)))));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject u(com.facebook.share.c.n nVar) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("url", h0.K(nVar.i()));
            if (nVar.h() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(n(nVar.h()));
                jSONObjectPut.put("buttons", jSONArray);
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    private static JSONObject v(com.facebook.share.c.o oVar, boolean z) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            return new JSONObject().put("type", "web_url").put("title", z ? null : oVar.a()).put("url", h0.K(oVar.e())).put("webview_height_ratio", m(oVar.f())).put("messenger_extensions", oVar.c()).put("fallback_url", h0.K(oVar.b())).put("webview_share_button", l(oVar));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }
}
