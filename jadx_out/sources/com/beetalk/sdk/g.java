package com.beetalk.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile Context f488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static g f489o;
    private static g p;
    private static g q;
    private final Handler a;
    private final List<n> b;
    private final Object c;
    private com.beetalk.sdk.t.k d;
    private com.beetalk.sdk.c e;
    private q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o f493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.beetalk.sdk.u.a f494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f496m;

    class a implements Runnable {
        final /* synthetic */ n a;

        a(n nVar) {
            this.a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iC = g.this.f494k.c() - com.beetalk.sdk.x.d.k();
            boolean zA0 = false;
            if (iC >= 172800) {
                com.beetalk.sdk.x.a.i("%d hours until the token expires", Integer.valueOf(iC / 3600));
            } else if (g.this.a0(this.a)) {
                com.beetalk.sdk.x.a.i("refresh token ok - no need for inspection", new Object[0]);
                return;
            }
            JSONObject jSONObjectN = com.beetalk.sdk.z.i.b.n(g.this.f494k.b());
            if (jSONObjectN == null) {
                g.this.f = q.CLOSED_WITH_ERROR;
                g.this.f495l = com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue();
            } else if (jSONObjectN.has("error")) {
                try {
                    String string = jSONObjectN.getString("error");
                    com.beetalk.sdk.x.a.i("inspection error %s", string);
                    if ("invalid_grant".equals(string)) {
                        zA0 = g.this.a0(this.a);
                    } else if ("error_token_session".equals(string)) {
                        g.b0();
                    }
                } catch (JSONException e) {
                    com.beetalk.sdk.x.a.b(e);
                }
                if (zA0) {
                    return;
                } else {
                    g.this.f = q.CLOSED_WITH_ERROR;
                }
            } else if (jSONObjectN.has("platform") && jSONObjectN.has("open_id")) {
                try {
                    if (g.this.f494k.f().equals(jSONObjectN.getString("open_id"))) {
                        g.this.f = q.TOKEN_AVAILABLE;
                        g.this.f494k.k(jSONObjectN.optInt("expiry_time"));
                        g.this.f494k.l(com.beetalk.sdk.x.d.k());
                        g.this.d.l(g.this.f494k);
                    } else {
                        g.this.f495l = com.garena.pay.android.b.LOGIN_FAILED.c().intValue();
                        g.this.f = q.CLOSED_WITH_ERROR;
                    }
                    com.beetalk.sdk.x.a.i("verify the open id %s %s", g.this.f494k.f(), jSONObjectN.getString("open_id"));
                } catch (JSONException e2) {
                    com.beetalk.sdk.x.a.b(e2);
                }
            }
            g gVar = g.this;
            gVar.O(this.a, gVar, null);
        }
    }

    class b implements com.facebook.a.InterfaceC0053a {
        final /* synthetic */ n a;

        b(n nVar) {
            this.a = nVar;
        }

        @Override // com.facebook.a.InterfaceC0053a
        public void a(com.facebook.n nVar) {
            if (nVar != null) {
                com.beetalk.sdk.x.a.a("facebook token refresh failed:" + nVar.getMessage(), new Object[0]);
            }
            g.this.f = q.CLOSED_WITH_ERROR;
            com.facebook.a.r(null);
            g.this.c0();
            g.this.f495l = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c().intValue();
            g gVar = g.this;
            gVar.O(this.a, gVar, null);
        }

        @Override // com.facebook.a.InterfaceC0053a
        public void b(com.facebook.a aVar) {
            com.beetalk.sdk.x.a.a("facebook token refreshed", new Object[0]);
            if (g.this.Y(this.a)) {
                return;
            }
            g gVar = g.this;
            gVar.O(this.a, gVar, null);
        }
    }

    class c implements Runnable {
        final /* synthetic */ Exception a;

        class a implements Runnable {
            final /* synthetic */ n a;

            a(n nVar) {
                this.a = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                n nVar = this.a;
                c cVar = c.this;
                nVar.onSessionProcessed(g.this, cVar.a);
            }
        }

        c(Exception exc) {
            this.a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = g.this.b.iterator();
            while (it.hasNext()) {
                g.d0(g.this.a, new a((n) it.next()));
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.beetalk.sdk.u.l.values().length];
            b = iArr;
            try {
                iArr[com.beetalk.sdk.u.l.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[com.beetalk.sdk.u.l.GUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[com.beetalk.sdk.u.l.GARENA_WEB_ANDROID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[com.beetalk.sdk.u.l.VK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[com.beetalk.sdk.u.l.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[com.beetalk.sdk.u.l.GOOGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[com.beetalk.sdk.u.l.TWITTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[q.values().length];
            a = iArr2;
            try {
                iArr2[q.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[q.TOKEN_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CookieManager.getInstance().removeAllCookie();
            } catch (Throwable unused) {
            }
            try {
                new WebView(g.s()).clearCache(true);
            } catch (Throwable unused2) {
            }
            try {
                new com.beetalk.sdk.t.i().a();
            } catch (Throwable unused3) {
            }
        }
    }

    class f implements OnCompleteListener<Void> {
        final /* synthetic */ m a;

        f(m mVar) {
            this.a = mVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void a(Task<Void> task) {
            com.beetalk.sdk.x.a.i("Google account signed out", new Object[0]);
            m mVar = this.a;
            if (mVar != null) {
                mVar.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.g$g, reason: collision with other inner class name */
    class RunnableC0031g implements Runnable {
        RunnableC0031g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CookieManager.getInstance().removeAllCookie();
            new WebView(g.s()).clearCache(true);
        }
    }

    class h implements OnCompleteListener<Void> {
        final /* synthetic */ m a;

        h(m mVar) {
            this.a = mVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void a(Task<Void> task) {
            com.beetalk.sdk.x.a.i("Google account signed out", new Object[0]);
            m mVar = this.a;
            if (mVar != null) {
                mVar.onComplete();
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f494k == null) {
                return;
            }
            String strB = g.this.f494k.b();
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            com.beetalk.sdk.z.i.b.o(strB, g.this.f494k.g());
        }
    }

    class j implements Runnable {
        final /* synthetic */ n a;
        final /* synthetic */ g b;
        final /* synthetic */ Exception c;

        j(g gVar, n nVar, g gVar2, Exception exc) {
            this.a = nVar;
            this.b = gVar2;
            this.c = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onSessionProcessed(this.b, this.c);
        }
    }

    class k implements Runnable {
        final /* synthetic */ n a;

        k(n nVar) {
            this.a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar;
            q qVar;
            if (g.this.a0(this.a)) {
                gVar = g.this;
                qVar = q.TOKEN_AVAILABLE;
            } else {
                gVar = g.this;
                qVar = q.CLOSED_WITH_ERROR;
            }
            gVar.f = qVar;
            g gVar2 = g.this;
            gVar2.O(this.a, gVar2, null);
        }
    }

    public static final class l {
        private final Context a;
        private String b;
        private String c;
        private String d;
        private com.beetalk.sdk.c e;
        private com.beetalk.sdk.t.k f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f497g = p.c.intValue();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private o f498h = o.GARENA;

        public l(Context context) {
            this.a = context;
        }

        public g a() {
            return new g(this.a, this.b, this.c, this.d, this.e, this.f497g, this.f498h, this.f, null);
        }

        public l b(String str) {
            this.b = str;
            return this;
        }

        public l c(String str) {
            this.c = str;
            return this;
        }

        public l d(com.beetalk.sdk.c cVar) {
            this.e = cVar;
            return this;
        }

        public l e(int i2) {
            this.f497g = i2;
            return this;
        }

        public l f(o oVar) {
            this.f498h = oVar;
            return this;
        }
    }

    public interface m {
        void onComplete();
    }

    public interface n {
        void onSessionProcessed(g gVar, Exception exc);
    }

    public enum o {
        GARENA(1),
        FACEBOOK(3),
        GUEST(4),
        VK(5),
        LINE(6),
        GOOGLE(8),
        REFRESH_TOKEN(0),
        TWITTER(11);

        private int a;

        o(int i2) {
            this.a = i2;
        }

        public static boolean d(o oVar, com.beetalk.sdk.u.l lVar) {
            if (oVar == FACEBOOK && lVar == com.beetalk.sdk.u.l.FACEBOOK) {
                return true;
            }
            if ((oVar == GUEST && lVar == com.beetalk.sdk.u.l.GUEST) || oVar == REFRESH_TOKEN) {
                return true;
            }
            if (oVar == GARENA && (lVar == com.beetalk.sdk.u.l.GARENA_WEB_ANDROID || lVar == com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID)) {
                return true;
            }
            if (oVar == VK && lVar == com.beetalk.sdk.u.l.VK) {
                return true;
            }
            if (oVar == LINE && lVar == com.beetalk.sdk.u.l.LINE) {
                return true;
            }
            if (oVar == GOOGLE && lVar == com.beetalk.sdk.u.l.GOOGLE) {
                return true;
            }
            return oVar == TWITTER && lVar == com.beetalk.sdk.u.l.TWITTER;
        }

        public int c() {
            return this.a;
        }
    }

    private g(Context context, String str, String str2, String str3, com.beetalk.sdk.c cVar, int i2, o oVar, com.beetalk.sdk.t.k kVar) {
        this.c = new Object();
        this.f492i = p.a.a;
        this.f495l = 0;
        if (context != null && TextUtils.isEmpty(str)) {
            str = com.beetalk.sdk.x.d.e(context);
        }
        kVar = kVar == null ? new com.beetalk.sdk.t.j(context) : kVar;
        this.d = kVar;
        com.beetalk.sdk.u.a aVarH = kVar.h();
        if (aVarH != null && o.d(oVar, aVarH.h()) && aVarH.i()) {
            this.f494k = aVarH;
        }
        com.beetalk.sdk.x.k.b(str, "applicationId");
        this.f490g = str;
        this.f491h = str2;
        this.e = cVar;
        this.a = new Handler(Looper.getMainLooper());
        this.b = new ArrayList();
        this.f496m = i2;
        this.f493j = oVar;
        this.f = this.f494k != null ? q.TOKEN_AVAILABLE : q.CREATED;
        J(context);
        com.beetalk.sdk.x.a.j(f488n);
        Integer numG = com.beetalk.sdk.x.d.g(f488n);
        Boolean boolH = com.beetalk.sdk.x.d.h(f488n);
        if (boolH != null) {
            boolH.booleanValue();
        }
        if (numG != null) {
            this.f492i = numG;
        }
    }

    /* synthetic */ g(Context context, String str, String str2, String str3, com.beetalk.sdk.c cVar, int i2, o oVar, com.beetalk.sdk.t.k kVar, e eVar) {
        this(context, str, str2, str3, cVar, i2, oVar, kVar);
    }

    private Intent A(com.beetalk.sdk.d dVar) {
        Intent intent = new Intent();
        intent.setClass(f488n, BTLoginActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("request_extra", dVar.c());
        intent.putExtras(bundle);
        return intent;
    }

    public static void J(Context context) {
        if (context == null || f488n != null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        f488n = context;
    }

    private void K(n nVar) {
        if (p.b.b) {
            com.beetalk.sdk.z.a.a().b(new k(nVar));
            return;
        }
        if (p.b.a) {
            this.f = q.CLOSED_WITH_ERROR;
            this.f495l = com.garena.pay.android.b.REFRESH_TOKEN_FAILED.c().intValue();
            O(nVar, this, null);
            return;
        }
        com.beetalk.sdk.u.a aVar = this.f494k;
        if (aVar != null) {
            if (aVar.h() == com.beetalk.sdk.u.l.GUEST && TextUtils.isEmpty(com.beetalk.sdk.t.a.s().f())) {
                String strF = com.beetalk.sdk.t.g.s().f();
                String strC = com.beetalk.sdk.t.g.s().c();
                if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strC)) {
                    try {
                        com.beetalk.sdk.t.a.s().j(Long.parseLong(strF), strC);
                    } catch (NumberFormatException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (com.beetalk.sdk.x.d.k() - 3600 > this.f494k.d()) {
                com.beetalk.sdk.z.a.a().b(new a(nVar));
            } else {
                com.beetalk.sdk.x.a.i("no need for another inspection - last %d minutes ago", Integer.valueOf((com.beetalk.sdk.x.d.k() - this.f494k.d()) / 60));
                nVar.onSessionProcessed(this, null);
            }
        }
    }

    private static boolean M(g gVar) {
        q qVar;
        return gVar != null && ((qVar = gVar.f) == q.OPENING || qVar == q.TOKEN_AVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(n nVar, g gVar, Exception exc) {
        d0(this.a, new j(this, nVar, gVar, exc));
    }

    public static g P(Activity activity, n nVar) {
        return Q(activity, true, nVar, new com.beetalk.sdk.d(activity, nVar, p.f509i.intValue(), false, ""));
    }

    private static g Q(Activity activity, boolean z, n nVar, com.beetalk.sdk.d dVar) {
        g gVarW = w();
        if (gVarW != null) {
            gVarW.e0(new com.beetalk.sdk.t.j(activity, "com.garena.msdk.app_platform_bind_token"));
        } else {
            gVarW = new l(activity).a();
            gVarW.e0(new com.beetalk.sdk.t.j(activity, "com.garena.msdk.app_platform_bind_token"));
            f0(gVarW);
        }
        V(activity, z, nVar, dVar, gVarW);
        return w();
    }

    public static g R(Activity activity, n nVar) {
        return S(activity, true, nVar, new com.beetalk.sdk.d(activity, nVar, p.f508h.intValue(), false, ""));
    }

    private static g S(Activity activity, boolean z, n nVar, com.beetalk.sdk.d dVar) {
        g gVarX = x();
        if (gVarX != null) {
            gVarX.e0(new com.beetalk.sdk.t.j(activity, "com.garena.msdk.bind_token"));
        } else {
            gVarX = new l(activity).a();
            gVarX.e0(new com.beetalk.sdk.t.j(activity, "com.garena.msdk.bind_token"));
            g0(gVarX);
        }
        V(activity, z, nVar, dVar, gVarX);
        return x();
    }

    private static g T(Activity activity, boolean z, n nVar, com.beetalk.sdk.d dVar) {
        g gVarY = y();
        if (gVarY == null) {
            gVarY = new l(activity).a();
            h0(gVarY);
        }
        V(activity, z, nVar, dVar, gVarY);
        return y();
    }

    public static g U(Activity activity, boolean z, n nVar) {
        return T(activity, z, nVar, new com.beetalk.sdk.d(activity, nVar));
    }

    private static g V(Activity activity, boolean z, n nVar, com.beetalk.sdk.d dVar, g gVar) {
        q qVar;
        if (M(gVar)) {
            int i2 = d.a[gVar.f.ordinal()];
            if (i2 == 1) {
                nVar.onSessionProcessed(gVar, new com.beetalk.sdk.v.a("Session is awaiting fulfillment. Please destroy before requesting for a new Session"));
            } else if (i2 == 2) {
                gVar.K(nVar);
                return gVar;
            }
        } else if (z) {
            if (gVar == null) {
                gVar = new l(activity).a();
            }
            synchronized (gVar.c) {
                q qVar2 = gVar.f;
                q qVar3 = q.CREATED;
                if (qVar2 == qVar3) {
                    gVar.f = q.OPENING;
                }
                if (nVar != null) {
                    gVar.b.add(nVar);
                }
                qVar = q.OPENING;
                gVar.X(qVar3, qVar, null);
            }
            if (gVar.f == qVar) {
                dVar.j(gVar);
                gVar.q(dVar);
            }
            return gVar;
        }
        return null;
    }

    private void X(q qVar, q qVar2, Exception exc) {
        synchronized (this.b) {
            try {
                if (qVar == qVar2) {
                    return;
                }
                d0(this.a, new c(exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y(n nVar) {
        int iIntValue;
        q qVar;
        com.facebook.a aVarD = com.facebook.a.d();
        if (aVarD == null) {
            com.beetalk.sdk.u.a aVar = this.f494k;
            if (aVar != null && !TextUtils.isEmpty(aVar.g())) {
                return Z(nVar);
            }
            c0();
            this.f495l = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c().intValue();
            return false;
        }
        if (aVarD.p()) {
            com.facebook.a.q(new b(nVar));
            return true;
        }
        JSONObject jSONObjectB = com.beetalk.sdk.z.i.b.b(aVarD.m(), p.f511k + f489o.t() + "://auth/", f489o.t(), f489o.u());
        try {
            if (jSONObjectB == null) {
                this.f495l = com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue();
                qVar = q.CLOSED_WITH_ERROR;
            } else {
                if (jSONObjectB.has("open_id")) {
                    String strOptString = jSONObjectB.optString("open_id");
                    String strOptString2 = jSONObjectB.optString("access_token");
                    int iOptInt = jSONObjectB.optInt("expiry_time");
                    int iOptInt2 = jSONObjectB.optInt("platform");
                    com.beetalk.sdk.u.a aVar2 = new com.beetalk.sdk.u.a(strOptString2, com.beetalk.sdk.u.l.FACEBOOK, iOptInt2);
                    this.f494k = aVar2;
                    if (iOptInt2 == 1) {
                        aVar2.o(com.beetalk.sdk.u.l.GARENA_NATIVE_ANDROID);
                    }
                    this.f494k.k(iOptInt);
                    this.f494k.m(strOptString);
                    this.f494k.l(com.beetalk.sdk.x.d.k());
                    this.d.l(this.f494k);
                    this.f = q.TOKEN_AVAILABLE;
                    O(nVar, this, null);
                    return true;
                }
                if (jSONObjectB.optString("error").equals("invalid_grant")) {
                    c0();
                    com.facebook.a.r(null);
                    iIntValue = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c().intValue();
                } else {
                    iIntValue = com.garena.pay.android.b.REFRESH_TOKEN_FAILED.c().intValue();
                }
                this.f495l = iIntValue;
                qVar = q.CLOSED_WITH_ERROR;
            }
            this.f = qVar;
        } catch (Exception e2) {
            com.beetalk.sdk.x.a.b(e2);
        }
        return false;
    }

    private boolean Z(n nVar) {
        int iIntValue;
        com.beetalk.sdk.u.a aVar = this.f494k;
        if (aVar == null) {
            return false;
        }
        JSONObject jSONObjectP = com.beetalk.sdk.z.i.b.p(aVar.g());
        if (jSONObjectP == null) {
            this.f495l = com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue();
            return false;
        }
        try {
            if (!jSONObjectP.has("open_id")) {
                if (jSONObjectP.has("error")) {
                    String strOptString = jSONObjectP.optString("error");
                    com.beetalk.sdk.x.a.i("refresh error %s", strOptString);
                    if ("invalid_grant".equals(strOptString)) {
                        c0();
                        iIntValue = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c().intValue();
                    } else {
                        iIntValue = "error_user_ban".equals(strOptString) ? com.garena.pay.android.b.ERROR_USER_BANNED.c().intValue() : com.garena.pay.android.b.REFRESH_TOKEN_FAILED.c().intValue();
                    }
                    this.f495l = iIntValue;
                }
                return false;
            }
            this.f494k.j(jSONObjectP.optString("access_token"));
            this.f494k.n(jSONObjectP.optString("refresh_token"));
            this.f494k.k(jSONObjectP.optInt("expiry_time"));
            this.f494k.m(jSONObjectP.optString("open_id"));
            this.f494k.l(com.beetalk.sdk.x.d.k());
            this.d.l(this.f494k);
            this.f = q.TOKEN_AVAILABLE;
            com.beetalk.sdk.x.a.i("refresh token successful", new Object[0]);
            O(nVar, this, null);
            return true;
        } catch (Exception e2) {
            com.beetalk.sdk.x.a.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a0(n nVar) {
        com.beetalk.sdk.u.a aVar = this.f494k;
        return (aVar == null || aVar.h() == com.beetalk.sdk.u.l.FACEBOOK || TextUtils.isEmpty(this.f494k.g())) ? Y(nVar) : Z(nVar);
    }

    public static void b0() {
        g gVar = f489o;
        if (gVar == null) {
            return;
        }
        gVar.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        com.beetalk.sdk.u.a aVar = this.f494k;
        if (aVar != null) {
            aVar.j("");
            this.f494k.k(0);
            this.f494k.l(0);
            this.f = q.CLOSED_WITH_ERROR;
            this.f495l = com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c().intValue();
        }
        com.beetalk.sdk.t.k kVar = this.d;
        if (kVar != null) {
            kVar.m("com.garena.msdk.token");
            if (this.f493j == o.GUEST) {
                this.d.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d0(Handler handler, Runnable runnable) {
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static synchronized void f0(g gVar) {
        q = gVar;
    }

    public static synchronized void g0(g gVar) {
        p = gVar;
    }

    public static synchronized void h0(g gVar) {
        f489o = gVar;
    }

    private boolean k0(Intent intent) {
        return ((f488n == null || f488n.getPackageManager() == null) ? null : f488n.getPackageManager().resolveActivity(intent, 0)) != null;
    }

    private boolean l(com.beetalk.sdk.d dVar) {
        Intent intentA = dVar.e().A(dVar);
        if (!dVar.e().k0(intentA)) {
            return false;
        }
        dVar.b().startActivityForResult(intentA, dVar.d());
        return true;
    }

    public static boolean m() {
        com.beetalk.sdk.u.a aVarI;
        g gVarY = y();
        return (gVarY == null || (aVarI = gVarY.I()) == null || TextUtils.isEmpty(aVarI.b())) ? false : true;
    }

    public static synchronized boolean n() {
        return o(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029 A[Catch: all -> 0x003f, TryCatch #8 {all -> 0x003f, blocks: (B:19:0x0020, B:21:0x0029, B:23:0x002f, B:24:0x003c), top: B:68:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x002f A[Catch: all -> 0x003f, TryCatch #8 {all -> 0x003f, blocks: (B:19:0x0020, B:21:0x0029, B:23:0x002f, B:24:0x003c), top: B:68:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:27:0x004c, B:29:0x0050), top: B:54:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0059 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #7 {all -> 0x005e, blocks: (B:30:0x0055, B:32:0x0059), top: B:66:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #3 {all -> 0x0099, blocks: (B:36:0x007e, B:38:0x0086), top: B:58:0x007e }] */
    public static synchronized boolean o(m mVar) {
        com.google.android.gms.auth.api.signin.c cVarJ;
        g gVar;
        g gVar2;
        if (f489o == null) {
            return false;
        }
        if (f488n == null) {
            return false;
        }
        if (!com.facebook.r.x()) {
            if (com.beetalk.sdk.b0.c.a(f488n) != -1) {
                if (!com.vk.sdk.i.m()) {
                    com.vk.sdk.i.e(f488n, com.beetalk.sdk.b0.c.a(f488n), p.f512l);
                }
                com.vk.sdk.i.o();
            }
            f489o.N();
            f489o.L();
            f489o = null;
            gVar2 = p;
            if (gVar2 != null) {
                gVar2.L();
                p = null;
            }
            gVar = q;
            if (gVar != null) {
                gVar.L();
                q = null;
            }
            new Handler(Looper.getMainLooper()).post(new e());
            com.beetalk.sdk.t.e.d().c();
            new com.beetalk.sdk.t.i().b();
            cVarJ = com.beetalk.sdk.l.j(f488n);
            if (cVarJ != null) {
                com.beetalk.sdk.x.a.a("Start to sign out Google account.", new Object[0]);
                cVarJ.q().addOnCompleteListener(new f(mVar));
            }
            return true;
        }
        try {
            com.beetalk.sdk.w.a.a(f488n);
        } catch (Exception e2) {
            com.beetalk.sdk.x.a.b(e2);
        }
        try {
            if (com.beetalk.sdk.b0.c.a(f488n) != -1) {
                if (!com.vk.sdk.i.m()) {
                    com.vk.sdk.i.e(f488n, com.beetalk.sdk.b0.c.a(f488n), p.f512l);
                }
                com.vk.sdk.i.o();
            }
        } catch (Throwable unused) {
        }
        try {
            f489o.N();
            f489o.L();
            f489o = null;
        } catch (Throwable unused2) {
        }
        try {
            gVar2 = p;
            if (gVar2 != null) {
                gVar2.L();
                p = null;
            }
        } catch (Throwable unused3) {
        }
        try {
            gVar = q;
            if (gVar != null) {
                gVar.L();
                q = null;
            }
        } catch (Throwable unused4) {
        }
        new Handler(Looper.getMainLooper()).post(new e());
        try {
            com.beetalk.sdk.t.e.d().c();
        } catch (Throwable unused5) {
        }
        try {
            new com.beetalk.sdk.t.i().b();
        } catch (Throwable unused6) {
        }
        try {
            cVarJ = com.beetalk.sdk.l.j(f488n);
            if (cVarJ != null) {
                com.beetalk.sdk.x.a.a("Start to sign out Google account.", new Object[0]);
                cVarJ.q().addOnCompleteListener(new f(mVar));
            }
        } catch (Throwable unused7) {
        }
        return true;
        throw th;
    }

    public static synchronized boolean p(m mVar) {
        if (f488n == null) {
            return false;
        }
        try {
            if (com.facebook.r.x()) {
                com.beetalk.sdk.w.a.a(f488n);
            }
        } catch (Throwable unused) {
        }
        try {
            if (com.beetalk.sdk.b0.c.a(f488n) != -1) {
                if (!com.vk.sdk.i.m()) {
                    com.vk.sdk.i.e(f488n, com.beetalk.sdk.b0.c.a(f488n), p.f512l);
                }
                com.vk.sdk.i.o();
            }
        } catch (Throwable unused2) {
        }
        try {
            g gVar = p;
            if (gVar != null) {
                gVar.L();
                p = null;
            }
        } catch (Throwable unused3) {
        }
        com.garena.pay.android.j.c.a().b(new RunnableC0031g());
        try {
            com.google.android.gms.auth.api.signin.c cVarJ = com.beetalk.sdk.l.j(f488n);
            if (cVarJ != null) {
                com.beetalk.sdk.x.a.a("Start to sign out Google account.", new Object[0]);
                cVarJ.q().addOnCompleteListener(new h(mVar));
            }
        } catch (Throwable unused4) {
        }
        return true;
    }

    private void q(com.beetalk.sdk.d dVar) {
        dVar.f(this.f490g);
        dVar.i(this.f496m);
        dVar.g(this.f491h);
        dVar.h(this.e == com.beetalk.sdk.c.LEGACY_ENABLED);
        if (l(dVar)) {
            return;
        }
        synchronized (g.class) {
            q qVar = dVar.e().f;
            dVar.e().f = q.CLOSED_WITH_ERROR;
            dVar.e().X(qVar, dVar.e().f, new com.beetalk.sdk.v.a("Failed to Validate the authenticity of the internal package.Did you forget to include the BTLoginActivity in your AndroidManifest.xml"));
        }
    }

    public static g r(Activity activity, n nVar) {
        com.beetalk.sdk.d dVar = new com.beetalk.sdk.d(activity, nVar);
        dVar.j(f489o);
        f489o.b.add(nVar);
        com.beetalk.sdk.x.k.a(Integer.valueOf(f489o.b.size()), 1, "[forceOpenSession] Callback Array Size");
        f489o.f = q.OPENING;
        f489o.q(dVar);
        return f489o;
    }

    public static Context s() {
        return f488n;
    }

    public static synchronized g w() {
        return q;
    }

    public static synchronized g x() {
        return p;
    }

    public static synchronized g y() {
        return f489o;
    }

    public com.beetalk.sdk.c B() {
        return this.e;
    }

    public String C() {
        return I() != null ? I().f() : "";
    }

    public Integer D() {
        return Integer.valueOf(F().c());
    }

    public int E() {
        return this.f496m;
    }

    public o F() {
        return this.f493j;
    }

    public q G() {
        return this.f;
    }

    public Integer H() {
        return this.f492i;
    }

    public com.beetalk.sdk.u.a I() {
        return this.f494k;
    }

    public void L() {
        com.beetalk.sdk.t.k kVar = this.d;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void N() {
        this.f = q.CLOSED;
        com.beetalk.sdk.z.a.a().b(new i());
    }

    final boolean W(Activity activity, int i2, int i3, Intent intent) {
        com.beetalk.sdk.b.e eVar;
        q qVar;
        com.beetalk.sdk.u.a aVar;
        o oVar;
        com.beetalk.sdk.x.k.b(activity, "currentActivity");
        com.beetalk.sdk.x.a.a("onActivityResult", new Object[0]);
        J(activity);
        if (i2 != this.f496m) {
            return false;
        }
        if (intent == null || i3 != -1) {
            if (i3 == 0) {
                synchronized (g.class) {
                    q qVar2 = this.f;
                    try {
                        eVar = (com.beetalk.sdk.b.e) intent.getExtras().getSerializable("auth_result");
                    } catch (NullPointerException e2) {
                        com.beetalk.sdk.x.a.b(e2);
                        eVar = null;
                    }
                    if (eVar == null || eVar.c != 0) {
                        int iIntValue = eVar == null ? com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue() : eVar.c;
                        this.f495l = iIntValue;
                        if (iIntValue == com.garena.pay.android.b.ACCESS_TOKEN_INVALID_GRANT.c().intValue()) {
                            c0();
                        }
                        qVar = q.CLOSED_WITH_ERROR;
                    } else {
                        qVar = q.CLOSED;
                    }
                    this.f = qVar;
                    X(qVar2, this.f, null);
                }
            }
            return false;
        }
        synchronized (g.class) {
            com.beetalk.sdk.x.a.a("onActivityResult: success", new Object[0]);
            q qVar3 = this.f;
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            com.beetalk.sdk.b.e eVar2 = (com.beetalk.sdk.b.e) extras.getSerializable("auth_result");
            if (eVar2 != null && (aVar = eVar2.b) != null) {
                this.f494k = aVar;
                aVar.m(eVar2.d);
                this.d.l(this.f494k);
                switch (d.b[this.f494k.h().ordinal()]) {
                    case 1:
                        oVar = o.FACEBOOK;
                        this.f493j = oVar;
                        break;
                    case 2:
                        oVar = o.GUEST;
                        this.f493j = oVar;
                        break;
                    case 3:
                    case 4:
                        oVar = o.GARENA;
                        this.f493j = oVar;
                        break;
                    case 5:
                        oVar = o.VK;
                        this.f493j = oVar;
                        break;
                    case 6:
                        oVar = o.LINE;
                        this.f493j = oVar;
                        break;
                    case 7:
                        oVar = o.GOOGLE;
                        this.f493j = oVar;
                        break;
                    case 8:
                        oVar = o.TWITTER;
                        this.f493j = oVar;
                        break;
                }
                if (this.f493j == o.GUEST) {
                    this.d.k(this.f494k);
                }
                q qVar4 = q.TOKEN_AVAILABLE;
                this.f = qVar4;
                X(qVar3, qVar4, null);
                return true;
            }
            return false;
        }
    }

    public void e0(com.beetalk.sdk.t.k kVar) {
        this.d = kVar;
    }

    public void i0(int i2) {
        this.f495l = i2;
    }

    public void j0(q qVar) {
        this.f = qVar;
    }

    public String t() {
        return this.f490g;
    }

    public String u() {
        return this.f491h;
    }

    public com.beetalk.sdk.t.k v() {
        return this.d;
    }

    public int z() {
        return this.f495l;
    }
}
