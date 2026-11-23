package com.garena.unity.webview;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnityWebViewClient extends WebViewClient {
    protected final int _webViewId;

    public UnityWebViewClient(int i2) {
        this._webViewId = i2;
    }

    protected abstract void Log(String str);

    protected abstract void Log(String str, Throwable th);

    protected abstract void LogExtra(String str);

    protected abstract void LogExtra(String str, Throwable th);

    protected abstract WebViewStatus getStatus();

    protected abstract Activity getWebViewActivity();

    protected abstract ViewGroup getWebViewParent();

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        LogExtra("@onLoadResource(): " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        LogExtra("@onPageFinished(): " + str);
        WebViewStatus status = getStatus();
        if (status != null) {
            status.IsLoading = false;
            status.Url = str;
            setStatus(status);
        }
        try {
            webView.setBackgroundColor(0);
            if (status != null && status.DeferredDisplay) {
                status.DeferringDisplay = false;
                if (!status.Hiding) {
                    LogExtra("@onPageFinished(): showing " + str);
                    getWebViewParent().setVisibility(0);
                    webView.setVisibility(0);
                    webView.requestFocus();
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().flush();
            } else {
                CookieSyncManager.getInstance().sync();
            }
        } catch (Throwable th) {
            Log("@onPageFinished()", th);
        }
        if (status != null) {
            while (!status.PendingJavaScriptInvokes.isEmpty()) {
                runJavaScript(status.PendingJavaScriptInvokes.removeFirst());
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        LogExtra("@onPageStarted(): " + str);
        WebViewStatus status = getStatus();
        if (status != null) {
            status.IsLoading = true;
            status.Url = str;
            setStatus(status);
        }
        try {
            webView.setBackgroundColor(0);
        } catch (Throwable th) {
            Log("@onPageStarted()", th);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        LogExtra("@onReceivedError(): " + str2 + ": " + i2 + ": " + str);
        WebViewStatus status = getStatus();
        if (status != null) {
            status.IsLoading = false;
            status.Url = str2;
            setStatus(status);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            LogExtra("@onReceivedError(): " + webResourceRequest.getUrl().toString());
        }
        if (i2 < 23 || webResourceError == null) {
            return;
        }
        LogExtra("@onReceivedError(): " + webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription()));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (webResourceRequest != null) {
                Log("@onReceivedHttpError(): " + webResourceRequest.getUrl().toString());
            }
            if (webResourceResponse != null) {
                Log("@onReceivedHttpError(): " + webResourceResponse.getStatusCode() + ": " + webResourceResponse.getReasonPhrase());
            }
        }
    }

    protected abstract void runJavaScript(JavaScriptInvoke javaScriptInvoke);

    protected abstract void setStatus(WebViewStatus webViewStatus);

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21 || webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        LogExtra("@shouldInterceptRequest(request): " + webResourceRequest.getUrl().toString());
        return null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        LogExtra("@shouldInterceptRequest(url): " + str);
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            LogExtra("@shouldOverrideUrlLoading(request): request is null");
            return false;
        }
        LogExtra("@shouldOverrideUrlLoading(request): " + webResourceRequest.getUrl().toString());
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        LogExtra("@shouldOverrideUrlLoading(url): " + str);
        if (str.startsWith("intent://")) {
            try {
                Intent uri = Intent.parseUri(str, 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 15) {
                    uri.setSelector(null);
                }
                List<ResolveInfo> listQueryIntentActivities = getWebViewActivity().getPackageManager().queryIntentActivities(uri, 0);
                if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                    if (i2 >= 16) {
                        getWebViewActivity().startActivityIfNeeded(uri, WebViewManager.WEB_VIEW_INTENT_REQUEST_CODE);
                    } else {
                        getWebViewActivity().startActivityForResult(uri, WebViewManager.WEB_VIEW_INTENT_REQUEST_CODE);
                    }
                }
                return true;
            } catch (Throwable th) {
                LogExtra("@shouldOverrideUrlLoading(): " + str, th);
            }
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(805306368);
                getWebViewActivity().startActivity(intent);
            } catch (Throwable th2) {
                LogExtra("@shouldOverrideUrlLoading(): " + str, th2);
            }
            return true;
        }
        try {
            webView.loadUrl(str);
        } catch (Throwable th3) {
            LogExtra("@shouldOverrideUrlLoading(): loadUrl: " + str, th3);
        }
        WebViewStatus status = getStatus();
        if (status != null) {
            status.Url = str;
        }
        setStatus(status);
        return false;
    }
}
