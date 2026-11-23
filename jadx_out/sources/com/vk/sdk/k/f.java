package com.vk.sdk.k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.FF.voiceengine.FFVoiceConst;
import com.garena.unity.webview.UnityWebViewActivityProxy;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.i;
import com.vk.sdk.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.vk.sdk.h {
    public final Context c;
    public final String d;
    private final com.vk.sdk.k.d e;
    private com.vk.sdk.k.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.vk.sdk.k.i.a f1546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<f> f1548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Class<? extends com.vk.sdk.k.k.g> f1549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f1550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f1551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Looper f1553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f1554o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;

    class a extends com.vk.sdk.k.i.e.a {

        /* JADX INFO: renamed from: com.vk.sdk.k.f$a$a, reason: collision with other inner class name */
        class RunnableC0161a implements Runnable {
            RunnableC0161a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.E();
            }
        }

        a() {
        }

        @Override // com.vk.sdk.k.i.a.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(com.vk.sdk.k.i.e eVar, JSONObject jSONObject) {
            if (!jSONObject.has("error")) {
                f fVar = f.this;
                fVar.y(jSONObject, fVar.f1546g instanceof com.vk.sdk.k.i.f ? ((com.vk.sdk.k.i.f) f.this.f1546g).f1562k : null);
                return;
            }
            try {
                com.vk.sdk.k.c cVar = new com.vk.sdk.k.c(jSONObject.getJSONObject("error"));
                if (f.this.w(cVar)) {
                    return;
                }
                f.this.x(cVar);
            } catch (JSONException unused) {
            }
        }

        @Override // com.vk.sdk.k.i.a.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(com.vk.sdk.k.i.e eVar, com.vk.sdk.k.c cVar) {
            com.vk.sdk.k.i.b.f fVar;
            int i2 = cVar.e;
            if (i2 != -102 && i2 != -101 && eVar != null && (fVar = eVar.f1557g) != null && fVar.a == 200) {
                f.this.y(eVar.p(), null);
                return;
            }
            f fVar2 = f.this;
            if (fVar2.q != 0) {
                int i3 = f.i(fVar2);
                f fVar3 = f.this;
                if (i3 >= fVar3.q) {
                    fVar3.x(cVar);
                    return;
                }
            }
            f fVar4 = f.this;
            d dVar = fVar4.f1554o;
            if (dVar != null) {
                dVar.a(fVar4, fVar4.f1547h, f.this.q);
            }
            f.this.B(new RunnableC0161a(), 300);
        }
    }

    class b implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.vk.sdk.k.c b;

        b(boolean z, com.vk.sdk.k.c cVar) {
            this.a = z;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            if (this.a && (dVar = f.this.f1554o) != null) {
                dVar.c(this.b);
            }
            if (f.this.f1548i == null || f.this.f1548i.size() <= 0) {
                return;
            }
            Iterator it = f.this.f1548i.iterator();
            while (it.hasNext()) {
                d dVar2 = ((f) it.next()).f1554o;
                if (dVar2 != null) {
                    dVar2.c(this.b);
                }
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ g b;

        c(boolean z, g gVar) {
            this.a = z;
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            if (f.this.f1548i != null && f.this.f1548i.size() > 0) {
                Iterator it = f.this.f1548i.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).E();
                }
            }
            if (!this.a || (dVar = f.this.f1554o) == null) {
                return;
            }
            dVar.b(this.b);
        }
    }

    public static abstract class d {
        public void a(f fVar, int i2, int i3) {
        }

        public abstract void b(g gVar);

        public abstract void c(com.vk.sdk.k.c cVar);
    }

    public f(String str) {
        this(str, null);
    }

    public f(String str, com.vk.sdk.k.d dVar) {
        this(str, dVar, null);
    }

    public f(String str, com.vk.sdk.k.d dVar, Class<? extends com.vk.sdk.k.k.g> cls) {
        this.f1552m = true;
        this.c = j.a();
        this.d = str;
        this.e = new com.vk.sdk.k.d(dVar == null ? new com.vk.sdk.k.d() : dVar);
        this.f1547h = 0;
        this.r = true;
        this.q = 1;
        this.f1551l = "en";
        this.s = true;
        this.p = true;
        C(cls);
    }

    private void A(Runnable runnable) {
        B(runnable, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Runnable runnable, int i2) {
        if (this.f1553n == null) {
            this.f1553n = Looper.getMainLooper();
        }
        if (i2 > 0) {
            new Handler(this.f1553n).postDelayed(runnable, i2);
        } else {
            new Handler(this.f1553n).post(runnable);
        }
    }

    static /* synthetic */ int i(f fVar) {
        int i2 = fVar.f1547h + 1;
        fVar.f1547h = i2;
        return i2;
    }

    private String o(com.vk.sdk.e eVar) {
        return com.vk.sdk.m.c.h(String.format(Locale.US, "/method/%s?%s", this.d, com.vk.sdk.m.b.b(this.f)) + eVar.d);
    }

    private com.vk.sdk.k.i.e.a p() {
        return new a();
    }

    private String q() {
        String str = this.f1551l;
        Resources system = Resources.getSystem();
        if (!this.s || system == null) {
            return str;
        }
        String language = system.getConfiguration().locale.getLanguage();
        if (language.equals("uk")) {
            language = UnityWebViewActivityProxy.IntentExtras.USER_AGENT_STRING;
        }
        return !Arrays.asList("ru", "en", UnityWebViewActivityProxy.IntentExtras.USER_AGENT_STRING, "es", "fi", "de", "it").contains(language) ? this.f1551l : language;
    }

    public static f v(long j2) {
        return (f) com.vk.sdk.h.a(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(com.vk.sdk.k.c cVar) {
        Context context;
        VKServiceActivity.c cVar2;
        if (cVar.e != -101) {
            return false;
        }
        com.vk.sdk.k.c cVar3 = cVar.c;
        i.p(cVar3);
        int i2 = cVar3.e;
        if (i2 == 16) {
            com.vk.sdk.e eVarB = com.vk.sdk.e.b();
            if (eVarB != null) {
                eVarB.e = true;
                eVarB.g();
            }
            z();
            return true;
        }
        if (!this.p) {
            return false;
        }
        cVar3.d = this;
        if (cVar.c.e == 14) {
            this.f1546g = null;
            context = this.c;
            cVar2 = VKServiceActivity.c.Captcha;
        } else {
            if (i2 != 17) {
                return false;
            }
            context = this.c;
            cVar2 = VKServiceActivity.c.Validation;
        }
        VKServiceActivity.f(context, cVar3, cVar2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(com.vk.sdk.k.c cVar) {
        d dVar;
        cVar.d = this;
        boolean z = this.f1552m;
        if (!z && (dVar = this.f1554o) != null) {
            dVar.c(cVar);
        }
        A(new b(z, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(JSONObject jSONObject, Object obj) {
        d dVar;
        g gVar = new g();
        gVar.b = jSONObject;
        gVar.c = obj;
        new WeakReference(gVar);
        com.vk.sdk.k.i.a aVar = this.f1546g;
        if (aVar instanceof com.vk.sdk.k.i.c) {
            ((com.vk.sdk.k.i.c) aVar).k();
        }
        boolean z = this.f1552m;
        A(new c(z, gVar));
        if (z || (dVar = this.f1554o) == null) {
            return;
        }
        dVar.b(gVar);
    }

    public void C(Class<? extends com.vk.sdk.k.k.g> cls) {
        this.f1549j = cls;
        if (cls != null) {
            this.t = true;
        }
    }

    public void D(d dVar) {
        this.f1554o = dVar;
    }

    public void E() {
        com.vk.sdk.k.i.a aVarS = s();
        this.f1546g = aVarS;
        if (aVarS == null) {
            return;
        }
        if (this.f1553n == null) {
            this.f1553n = Looper.myLooper();
        }
        com.vk.sdk.k.i.b.c(this.f1546g);
    }

    public void l(com.vk.sdk.k.d dVar) {
        this.e.putAll(dVar);
    }

    public void m() {
        com.vk.sdk.k.i.a aVar = this.f1546g;
        if (aVar != null) {
            aVar.b();
        } else {
            x(new com.vk.sdk.k.c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_STOP_FAILED));
        }
    }

    public void n(d dVar) {
        this.f1554o = dVar;
        E();
    }

    public com.vk.sdk.k.d r() {
        return this.e;
    }

    com.vk.sdk.k.i.a s() {
        com.vk.sdk.k.i.f fVar;
        if (this.t) {
            if (this.f1549j != null) {
                fVar = new com.vk.sdk.k.i.f(u(), this.f1549j);
            } else if (this.f1550k != null) {
                fVar = new com.vk.sdk.k.i.f(u(), this.f1550k);
            }
            this.f1546g = fVar;
        }
        if (this.f1546g == null) {
            this.f1546g = new com.vk.sdk.k.i.e(u());
        }
        com.vk.sdk.k.i.a aVar = this.f1546g;
        if (aVar instanceof com.vk.sdk.k.i.c) {
            ((com.vk.sdk.k.i.c) aVar).o(p());
        }
        return this.f1546g;
    }

    public com.vk.sdk.k.d t() {
        if (this.f == null) {
            this.f = new com.vk.sdk.k.d(this.e);
            com.vk.sdk.e eVarB = com.vk.sdk.e.b();
            if (eVarB != null) {
                this.f.put("access_token", eVarB.a);
                if (eVarB.e) {
                    this.r = true;
                }
            }
            this.f.put("v", i.h());
            this.f.put("lang", q());
            if (this.r) {
                this.f.put("https", "1");
            }
            if (eVarB != null && eVarB.d != null) {
                this.f.put("sig", o(eVarB));
            }
        }
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("{");
        sb.append(this.d);
        sb.append(" ");
        com.vk.sdk.k.d dVarR = r();
        for (String str : dVarR.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(dVarR.get(str));
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public com.vk.sdk.k.i.b.d u() {
        com.vk.sdk.k.i.b.d dVarG = com.vk.sdk.k.i.b.g(this);
        if (dVarG != null) {
            return dVarG;
        }
        x(new com.vk.sdk.k.c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_ILLEGAL_SDK));
        return null;
    }

    public void z() {
        this.f1547h = 0;
        this.f = null;
        this.f1546g = null;
        E();
    }
}
