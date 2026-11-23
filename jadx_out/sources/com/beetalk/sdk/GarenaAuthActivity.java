package com.beetalk.sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GarenaAuthActivity extends Activity {
    private WebView a;
    private com.beetalk.sdk.b.c b;
    private String c;

    class a extends WebViewClient {

        /* JADX INFO: renamed from: com.beetalk.sdk.GarenaAuthActivity$a$a, reason: collision with other inner class name */
        class RunnableC0027a implements Runnable {
            final /* synthetic */ String a;

            RunnableC0027a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                GarenaAuthActivity.this.i(this.a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                GarenaAuthActivity.this.h(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue());
            }
        }

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            GarenaAuthActivity.this.j(com.beetalk.sdk.b.e.a(GarenaAuthActivity.this.b, com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED.c().intValue()));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.contains(p.t()) && !str.contains(GarenaAuthActivity.this.c)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            int iIndexOf = str.indexOf("code=");
            if (iIndexOf != -1) {
                String strSubstring = str.substring(iIndexOf + 5);
                com.beetalk.sdk.x.a.i("web code 1%s %s", str, strSubstring);
                com.beetalk.sdk.z.a.a().b(new RunnableC0027a(strSubstring));
            } else {
                int iIndexOf2 = str.indexOf("error=");
                if (iIndexOf2 == -1) {
                    com.beetalk.sdk.z.a.a().b(new b());
                } else if (str.substring(iIndexOf2 + 6).equals("access_denied")) {
                    GarenaAuthActivity.this.g();
                }
            }
            return true;
        }
    }

    class b implements DownloadListener {
        b() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            GarenaAuthActivity.this.startActivity(intent);
        }
    }

    class c implements Runnable {
        final /* synthetic */ com.beetalk.sdk.b.e a;

        c(com.beetalk.sdk.b.e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            GarenaAuthActivity.this.j(this.a);
        }
    }

    class d implements Runnable {
        final /* synthetic */ com.beetalk.sdk.b.e a;

        d(com.beetalk.sdk.b.e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            GarenaAuthActivity.this.j(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2) {
        com.beetalk.sdk.x.a.i("onAuthFailed-failed", new Object[0]);
        this.a.post(new d(com.beetalk.sdk.b.e.a(this.b, i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        com.beetalk.sdk.x.a.i("onAuthSuccess-user code %s", str);
        this.a.post(new c(k(str, this.b)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(com.beetalk.sdk.b.e eVar) {
        if (eVar != null && eVar.b != null) {
            g gVarY = g.y();
            if (this.b.e() == p.f509i.intValue()) {
                gVarY = g.w();
            } else if (this.b.e() == p.f508h.intValue()) {
                gVarY = g.x();
            }
            if (gVarY != null) {
                gVarY.v().l(eVar.b);
            }
        }
        Intent intent = new Intent();
        intent.putExtra("garena_auth_result", eVar);
        setResult(com.beetalk.sdk.b.e.d(eVar.a) ? 0 : -1, intent);
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    private com.beetalk.sdk.b.e k(String str, com.beetalk.sdk.b.c cVar) {
        com.garena.pay.android.b bVar;
        JSONObject jSONObjectD = com.beetalk.sdk.z.i.b.d(str, this.c, cVar.a(), cVar.b());
        int iIntValue = com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue();
        com.beetalk.sdk.b.e eVarC = null;
        if (jSONObjectD != null) {
            if (jSONObjectD.has("open_id")) {
                try {
                    String string = jSONObjectD.getString("open_id");
                    String string2 = jSONObjectD.getString("access_token");
                    String string3 = jSONObjectD.getString("refresh_token");
                    int i2 = jSONObjectD.getInt("expiry_time");
                    int iOptInt = jSONObjectD.optInt("platform");
                    com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(string2, com.beetalk.sdk.u.l.GARENA_WEB_ANDROID, iOptInt);
                    if (iOptInt == 3) {
                        aVar.o(com.beetalk.sdk.u.l.FACEBOOK);
                    }
                    aVar.n(string3);
                    aVar.k(i2);
                    eVarC = com.beetalk.sdk.b.e.c(cVar, aVar, string, iOptInt);
                } catch (JSONException e) {
                    com.beetalk.sdk.x.a.b(e);
                }
            } else {
                bVar = com.garena.pay.android.b.ACCESS_TOKEN_EXCHANGE_FAILED;
            }
            if (eVarC == null) {
                return com.beetalk.sdk.b.e.a(cVar, iIntValue);
            }
            return eVarC;
        }
        bVar = com.garena.pay.android.b.NETWORK_EXCEPTION;
        iIntValue = bVar.c().intValue();
        if (eVarC == null) {
            return com.beetalk.sdk.b.e.a(cVar, iIntValue);
        }
        return eVarC;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.A(this);
        WebView webView = new WebView(this);
        this.a = webView;
        webView.getSettings().setUseWideViewPort(true);
        this.a.getSettings().setLoadWithOverviewMode(true);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.getSettings().setBuiltInZoomControls(true);
        this.a.getSettings().setDomStorageEnabled(true);
        this.a.clearCache(true);
        CookieManager.getInstance().removeAllCookie();
        if (TextUtils.isEmpty(i.v())) {
            setTitle(j.c.b.g.a);
        } else {
            setTitle(i.v());
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(getResources().getColor(j.c.b.b.a));
        setContentView(linearLayout);
        linearLayout.addView(this.a, new LinearLayout.LayoutParams(-1, -1));
        this.a.setWebViewClient(new a());
        this.a.setDownloadListener(new b());
        try {
            com.beetalk.sdk.b.c cVar = (com.beetalk.sdk.b.c) getIntent().getSerializableExtra("garena_request_info");
            this.b = cVar;
            String strA = cVar.a();
            this.c = p.f511k + this.b.a() + "://auth/";
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.beetalk.sdk.z.d("redirect_uri", this.c));
            arrayList.add(new com.beetalk.sdk.z.d("source", i.u().toString()));
            arrayList.add(new com.beetalk.sdk.z.d("response_type", "code"));
            arrayList.add(new com.beetalk.sdk.z.d("client_id", strA));
            arrayList.add(new com.beetalk.sdk.z.d("display", "embedded"));
            if (this.b.e() == p.f509i.intValue()) {
                arrayList.add(new com.beetalk.sdk.z.d("create_grant", "false"));
                arrayList.add(new com.beetalk.sdk.z.d("grant", "true"));
            }
            Locale localeE = com.beetalk.sdk.x.g.e(getApplicationContext());
            if (localeE != null) {
                arrayList.add(new com.beetalk.sdk.z.d("locale", com.beetalk.sdk.x.g.f(localeE)));
            }
            try {
                this.a.loadUrl(p.u() + com.beetalk.sdk.x.j.a(arrayList));
            } catch (UnsupportedEncodingException e) {
                com.beetalk.sdk.x.a.b(e);
                finish();
            }
        } catch (NullPointerException e2) {
            com.beetalk.sdk.x.a.b(e2);
            finish();
        }
    }
}
