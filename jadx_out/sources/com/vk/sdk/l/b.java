package com.vk.sdk.l;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.d;
import com.vk.sdk.k.c;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements DialogInterface.OnDismissListener {
    protected c a;
    protected WebView b;
    protected View c;
    protected View d;
    protected Bundle e;
    protected Intent f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f1623g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f1624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Dialog f1625i;

    class a implements DialogInterface.OnCancelListener {
        final /* synthetic */ Dialog a;

        a(b bVar, Dialog dialog) {
            this.a = dialog;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.a.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.vk.sdk.l.b$b, reason: collision with other inner class name */
    private static class C0169b extends WebViewClient {
        boolean a = true;
        final b b;

        /* JADX INFO: renamed from: com.vk.sdk.l.b$b$a */
        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                C0169b.this.b.d();
            }
        }

        /* JADX INFO: renamed from: com.vk.sdk.l.b$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0170b implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0170b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                C0169b.this.b.e();
            }
        }

        public C0169b(b bVar) {
            this.b = bVar;
        }

        boolean a(String str) {
            b bVar;
            int i2 = 0;
            if (!str.startsWith("https://oauth.vk.com/blank.html")) {
                return false;
            }
            Intent intent = new Intent("com.vk.auth-token");
            String strSubstring = str.substring(str.indexOf(35) + 1);
            intent.putExtra("extra-token-data", strSubstring);
            Map<String, String> mapA = com.vk.sdk.m.c.a(strSubstring);
            c cVar = this.b.a;
            if (cVar != null) {
                intent.putExtra("extra-validation-request", cVar.d.b());
            }
            if (mapA == null || !(mapA.containsKey("error") || mapA.containsKey("cancel"))) {
                bVar = this.b;
                i2 = -1;
            } else {
                bVar = this.b;
            }
            bVar.g(i2, intent);
            this.b.d();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.a) {
                View view = this.b.c;
                if (view != null) {
                    view.setVisibility(8);
                }
                webView.setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            this.a = false;
            try {
                new AlertDialog.Builder(webView.getContext()).setMessage(str).setPositiveButton(com.vk.sdk.c.a, new DialogInterfaceOnClickListenerC0170b()).setNegativeButton(R.string.cancel, new a()).show();
            } catch (Exception unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (a(str)) {
                return true;
            }
            this.a = true;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Dialog dialog = this.f1625i;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void e() {
        try {
            c cVar = this.a;
            String str = cVar == null ? null : cVar.f1545j;
            if (str == null) {
                int i2 = this.e.getInt("client_id", 0);
                String string = this.e.getString("scope");
                String string2 = this.e.getString("version");
                boolean z = this.e.getBoolean("revoke", false);
                Locale locale = Locale.US;
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = string;
                objArr[2] = "https://oauth.vk.com/blank.html";
                objArr[3] = string2;
                objArr[4] = Integer.valueOf(z ? 1 : 0);
                str = String.format(locale, "https://oauth.vk.com/authorize?client_id=%s&scope=%s&redirect_uri=%s&display=mobile&v=%s&response_type=token&revoke=%d", objArr);
            }
            this.b.setWebViewClient(new C0169b(this));
            this.b.getSettings().setJavaScriptEnabled(true);
            this.b.loadUrl(str);
            this.b.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT >= 11) {
                this.b.setLayerType(1, null);
            }
            this.b.setVerticalScrollBarEnabled(false);
            this.b.setVisibility(4);
            this.b.setOverScrollMode(2);
            this.c.setVisibility(0);
        } catch (Exception unused) {
            f(0);
            d();
        }
    }

    private void f(int i2) {
        this.f1623g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2, Intent intent) {
        this.f1623g = i2;
        this.f = intent;
    }

    public void h(Activity activity, Bundle bundle, int i2, c cVar) {
        this.a = cVar;
        this.e = bundle;
        this.f1624h = i2;
        View viewInflate = View.inflate(activity, com.vk.sdk.b.b, null);
        this.d = viewInflate;
        this.c = viewInflate.findViewById(com.vk.sdk.a.d);
        this.b = (WebView) this.d.findViewById(com.vk.sdk.a.b);
        Dialog dialog = new Dialog(activity, d.a);
        dialog.setContentView(this.d);
        dialog.setOnCancelListener(new a(this, dialog));
        dialog.setOnDismissListener(this);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            dialog.getWindow().setStatusBarColor(0);
        }
        if (i3 >= 3) {
            dialog.getWindow().setSoftInputMode(48);
        }
        this.f1625i = dialog;
        dialog.show();
        e();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        View view = this.d;
        Activity activity = view == null ? null : (Activity) view.getContext();
        if (activity instanceof VKServiceActivity) {
            ((VKServiceActivity) activity).g(this.f1624h, this.f1623g, this.f);
        }
    }
}
