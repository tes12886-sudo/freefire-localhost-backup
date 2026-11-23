package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends Dialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile int f607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static d f608o;
    private String a;
    private String b;
    private e c;
    private WebView d;
    private ProgressDialog e;
    private ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FrameLayout f609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WindowManager.LayoutParams f614l;
    public static final b p = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f606m = com.facebook.common.e.a;

    public static class a {
        private Context a;
        private String b;
        private String c;
        private int d;
        private e e;
        private Bundle f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.facebook.a f615g;

        public a(Context context, String str, Bundle bundle) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(str, "action");
            com.facebook.a.c cVar = com.facebook.a.p;
            this.f615g = cVar.e();
            if (!cVar.g()) {
                String strE = h0.E(context);
                if (strE == null) {
                    throw new com.facebook.n("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.b = strE;
            }
            b(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(str2, "action");
            str = str == null ? h0.E(context) : str;
            i0.n(str, "applicationId");
            this.b = str;
            b(context, str2, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.a = context;
            this.c = str;
            if (bundle != null) {
                this.f = bundle;
            } else {
                this.f = new Bundle();
            }
        }

        public j0 a() {
            com.facebook.a aVar = this.f615g;
            if (aVar != null) {
                Bundle bundle = this.f;
                if (bundle != null) {
                    bundle.putString("app_id", aVar != null ? aVar.c() : null);
                }
                Bundle bundle2 = this.f;
                if (bundle2 != null) {
                    com.facebook.a aVar2 = this.f615g;
                    bundle2.putString("access_token", aVar2 != null ? aVar2.m() : null);
                }
            } else {
                Bundle bundle3 = this.f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.b);
                }
            }
            b bVar = j0.p;
            Context context = this.a;
            if (context != null) {
                return bVar.c(context, this.c, this.f, this.d, this.e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String c() {
            return this.b;
        }

        public final Context d() {
            return this.a;
        }

        public final e e() {
            return this.e;
        }

        public final Bundle f() {
            return this.f;
        }

        public final int g() {
            return this.d;
        }

        public final a h(e eVar) {
            this.e = eVar;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final int a() {
            i0.o();
            return j0.f607n;
        }

        protected final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && j0.f607n == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final j0 c(Context context, String str, Bundle bundle, int i2, e eVar) {
            l.y.c.i.e(context, "context");
            b(context);
            return new j0(context, str, bundle, i2, com.facebook.login.s.FACEBOOK, eVar, null);
        }

        public final j0 d(Context context, String str, Bundle bundle, int i2, com.facebook.login.s sVar, e eVar) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(sVar, "targetApp");
            b(context);
            return new j0(context, str, bundle, i2, sVar, eVar, null);
        }

        public final void e(int i2) {
            if (i2 == 0) {
                i2 = j0.f606m;
            }
            j0.f607n = i2;
        }
    }

    private final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            l.y.c.i.e(webView, "view");
            l.y.c.i.e(str, "url");
            super.onPageFinished(webView, str);
            if (!j0.this.f612j && (progressDialog = j0.this.e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = j0.this.f609g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webViewN = j0.this.n();
            if (webViewN != null) {
                webViewN.setVisibility(0);
            }
            ImageView imageView = j0.this.f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            j0.this.f613k = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            l.y.c.i.e(webView, "view");
            l.y.c.i.e(str, "url");
            h0.f0("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (j0.this.f612j || (progressDialog = j0.this.e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            l.y.c.i.e(webView, "view");
            l.y.c.i.e(str, "description");
            l.y.c.i.e(str2, "failingUrl");
            super.onReceivedError(webView, i2, str, str2);
            j0.this.t(new com.facebook.m(str, i2, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            l.y.c.i.e(webView, "view");
            l.y.c.i.e(sslErrorHandler, "handler");
            l.y.c.i.e(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            j0.this.t(new com.facebook.m(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i2;
            l.y.c.i.e(webView, "view");
            l.y.c.i.e(str, "url");
            h0.f0("FacebookSDK.WebDialog", "Redirect URL: " + str);
            Uri uri = Uri.parse(str);
            l.y.c.i.d(uri, "parsedURL");
            boolean z = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            if (!l.d0.p.x(str, j0.this.b, false, 2, null)) {
                if (l.d0.p.x(str, "fbconnect://cancel", false, 2, null)) {
                    j0.this.cancel();
                    return true;
                }
                if (z || l.d0.q.C(str, "touch", false, 2, null)) {
                    return false;
                }
                try {
                    j0.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            Bundle bundleR = j0.this.r(str);
            String string = bundleR.getString("error");
            if (string == null) {
                string = bundleR.getString("error_type");
            }
            String string2 = bundleR.getString("error_msg");
            if (string2 == null) {
                string2 = bundleR.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleR.getString("error_description");
            }
            String string3 = bundleR.getString("error_code");
            if (string3 == null || h0.Y(string3)) {
                i2 = -1;
            } else {
                try {
                    i2 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i2 = -1;
                }
            }
            if (h0.Y(string) && h0.Y(string2) && i2 == -1) {
                j0.this.u(bundleR);
            } else if ((string == null || !(l.y.c.i.a(string, "access_denied") || l.y.c.i.a(string, "OAuthAccessDeniedException"))) && i2 != 4201) {
                j0.this.t(new com.facebook.t(new com.facebook.q(i2, string, string2), string2));
            } else {
                j0.this.cancel();
            }
            return true;
        }
    }

    public interface d {
        void a(WebView webView);
    }

    public interface e {
        void a(Bundle bundle, com.facebook.n nVar);
    }

    private final class f extends AsyncTask<Void, Void, String[]> {
        private Exception[] a;
        private final String b;
        private final Bundle c;
        final /* synthetic */ j0 d;

        static final class a implements com.facebook.u.b {
            final /* synthetic */ String[] b;
            final /* synthetic */ int c;
            final /* synthetic */ CountDownLatch d;

            a(String[] strArr, int i2, CountDownLatch countDownLatch) {
                this.b = strArr;
                this.c = i2;
                this.d = countDownLatch;
            }

            @Override // com.facebook.u.b
            public final void b(com.facebook.x xVar) {
                l.y.c.i.e(xVar, "response");
                try {
                    com.facebook.q qVarB = xVar.b();
                    String str = "Error staging photo.";
                    if (qVarB != null) {
                        String strC = qVarB.c();
                        if (strC != null) {
                            str = strC;
                        }
                        throw new com.facebook.o(xVar, str);
                    }
                    JSONObject jSONObjectC = xVar.c();
                    if (jSONObjectC == null) {
                        throw new com.facebook.n("Error staging photo.");
                    }
                    String strOptString = jSONObjectC.optString("uri");
                    if (strOptString == null) {
                        throw new com.facebook.n("Error staging photo.");
                    }
                    this.b[this.c] = strOptString;
                    this.d.countDown();
                } catch (Exception e) {
                    f.this.a[this.c] = e;
                }
            }
        }

        public f(j0 j0Var, String str, Bundle bundle) {
            l.y.c.i.e(str, "action");
            l.y.c.i.e(bundle, "parameters");
            this.d = j0Var;
            this.b = str;
            this.c = bundle;
            this.a = new Exception[0];
        }

        protected String[] b(Void... voidArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                l.y.c.i.e(voidArr, "p0");
                String[] stringArray = this.c.getStringArray("media");
                if (stringArray != null) {
                    l.y.c.i.d(stringArray, "parameters.getStringArra…RAM_MEDIA) ?: return null");
                    String[] strArr = new String[stringArray.length];
                    this.a = new Exception[stringArray.length];
                    CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    com.facebook.a aVarE = com.facebook.a.p.e();
                    try {
                        int length = stringArray.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((com.facebook.v) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i2]);
                            if (h0.a0(uri)) {
                                strArr[i2] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                concurrentLinkedQueue.add(com.facebook.share.b.o.u(aVarE, uri, new a(strArr, i2, countDownLatch)).j());
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((com.facebook.v) it2.next()).cancel(true);
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return null;
            }
        }

        protected void c(String[] strArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.d.e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                for (Exception exc : this.a) {
                    if (exc != null) {
                        this.d.t(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.d.t(new com.facebook.n("Failed to stage photos for web dialog"));
                    return;
                }
                List listB = l.t.g.b(strArr);
                if (listB.contains(null)) {
                    this.d.t(new com.facebook.n("Failed to stage photos for web dialog"));
                    return;
                }
                h0.n0(this.c, "media", new JSONArray((Collection) listB));
                this.d.a = h0.f(f0.b(), com.facebook.r.p() + "/dialog/" + this.b, this.c).toString();
                ImageView imageView = this.d.f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Drawable drawable = imageView.getDrawable();
                l.y.c.i.d(drawable, "checkNotNull(crossImageView).drawable");
                this.d.x((drawable.getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                return b(voidArr);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                c(strArr);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                j0.this.cancel();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class h implements DialogInterface.OnCancelListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            j0.this.cancel();
        }
    }

    public static final class i extends WebView {
        i(j0 j0Var, Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    static final class j implements View.OnTouchListener {
        public static final j a = new j();

        j() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected j0(Context context, String str) {
        this(context, str, p.a());
        l.y.c.i.e(context, "context");
        l.y.c.i.e(str, "url");
    }

    private j0(Context context, String str, int i2) {
        super(context, i2 == 0 ? p.a() : i2);
        this.b = "fbconnect://success";
        this.a = str;
    }

    private j0(Context context, String str, Bundle bundle, int i2, com.facebook.login.s sVar, e eVar) {
        String strJ;
        String str2;
        super(context, i2 == 0 ? p.a() : i2);
        this.b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str3 = h0.S(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.b = str3;
        bundle.putString("redirect_uri", str3);
        bundle.putString("display", "touch");
        bundle.putString("client_id", com.facebook.r.g());
        l.y.c.o oVar = l.y.c.o.a;
        String str4 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{com.facebook.r.u()}, 1));
        l.y.c.i.d(str4, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", str4);
        this.c = eVar;
        if (l.y.c.i.a(str, "share") && bundle.containsKey("media")) {
            this.f610h = new f(this, str, bundle);
            return;
        }
        if (k0.a[sVar.ordinal()] != 1) {
            strJ = f0.b();
            str2 = com.facebook.r.p() + "/dialog/" + str;
        } else {
            strJ = f0.j();
            str2 = "oauth/authorize";
        }
        this.a = h0.f(strJ, str2, bundle).toString();
    }

    public /* synthetic */ j0(Context context, String str, Bundle bundle, int i2, com.facebook.login.s sVar, e eVar, l.y.c.f fVar) {
        this(context, str, bundle, i2, sVar, eVar);
    }

    private final void l() {
        ImageView imageView = new ImageView(getContext());
        this.f = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        Context context = getContext();
        l.y.c.i.d(context, "context");
        Drawable drawable = context.getResources().getDrawable(com.facebook.common.a.a);
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    private final int m(int i2, float f2, int i3, int i4) {
        int i5 = (int) (i2 / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            double d3 = i4 - i5;
            double d4 = i4 - i3;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = i2;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    public static final j0 q(Context context, String str, Bundle bundle, int i2, com.facebook.login.s sVar, e eVar) {
        return p.d(context, str, bundle, i2, sVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void x(int i2) {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        LinearLayout linearLayout = new LinearLayout(getContext());
        i iVar = new i(this, getContext());
        this.d = iVar;
        d dVar = f608o;
        if (dVar != null) {
            dVar.a(iVar);
        }
        WebView webView = this.d;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.d;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.d;
        if (webView3 != null) {
            webView3.setWebViewClient(new c());
        }
        WebView webView4 = this.d;
        if (webView4 != null && (settings3 = webView4.getSettings()) != null) {
            settings3.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.d;
        if (webView5 != null) {
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.d;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.d;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.d;
        if (webView8 != null && (settings2 = webView8.getSettings()) != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.d;
        if (webView9 != null && (settings = webView9.getSettings()) != null) {
            settings.setSaveFormData(false);
        }
        WebView webView10 = this.d;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.d;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.d;
        if (webView12 != null) {
            webView12.setOnTouchListener(j.a);
        }
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f609g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c == null || this.f611i) {
            return;
        }
        t(new com.facebook.p());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f612j && (progressDialog = this.e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    protected final WebView n() {
        return this.d;
    }

    protected final boolean o() {
        return this.f611i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f612j = false;
        Context context = getContext();
        l.y.c.i.d(context, "context");
        if (h0.k0(context) && (layoutParams = this.f614l) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.f614l;
                sb.append(layoutParams2 != null ? layoutParams2.token : null);
                h0.f0("FacebookSDK.WebDialog", sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.e = progressDialog;
        if (progressDialog != null) {
            progressDialog.requestWindowFeature(1);
        }
        ProgressDialog progressDialog2 = this.e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(com.facebook.common.d.d));
        }
        ProgressDialog progressDialog3 = this.e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new h());
        }
        requestWindowFeature(1);
        this.f609g = new FrameLayout(getContext());
        s();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        l();
        if (this.a != null) {
            ImageView imageView = this.f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Drawable drawable = imageView.getDrawable();
            l.y.c.i.d(drawable, "checkNotNull(crossImageView).drawable");
            x((drawable.getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f609g;
        if (frameLayout != null) {
            frameLayout.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f609g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f612j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        l.y.c.i.e(keyEvent, "event");
        if (i2 == 4) {
            WebView webView = this.d;
            if (webView != null && webView != null && webView.canGoBack()) {
                WebView webView2 = this.d;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        f fVar = this.f610h;
        if (fVar != null) {
            if ((fVar != null ? fVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                f fVar2 = this.f610h;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        s();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        f fVar = this.f610h;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        l.y.c.i.e(layoutParams, "params");
        if (layoutParams.token == null) {
            this.f614l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    protected final boolean p() {
        return this.f613k;
    }

    public Bundle r(String str) {
        Uri uri = Uri.parse(str);
        l.y.c.i.d(uri, "u");
        Bundle bundleL0 = h0.l0(uri.getQuery());
        bundleL0.putAll(h0.l0(uri.getFragment()));
        return bundleL0;
    }

    public final void s() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = i2 < i3 ? i2 : i3;
        if (i2 < i3) {
            i2 = i3;
        }
        int iMin = Math.min(m(i4, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(m(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    protected final void t(Throwable th) {
        if (this.c == null || this.f611i) {
            return;
        }
        this.f611i = true;
        com.facebook.n nVar = th instanceof com.facebook.n ? (com.facebook.n) th : new com.facebook.n(th);
        e eVar = this.c;
        if (eVar != null) {
            eVar.a(null, nVar);
        }
        dismiss();
    }

    protected final void u(Bundle bundle) {
        e eVar = this.c;
        if (eVar == null || this.f611i) {
            return;
        }
        this.f611i = true;
        if (eVar != null) {
            eVar.a(bundle, null);
        }
        dismiss();
    }

    protected final void v(String str) {
        l.y.c.i.e(str, "expectedRedirectUrl");
        this.b = str;
    }

    public final void w(e eVar) {
        this.c = eVar;
    }
}
