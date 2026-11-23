package com.garena.unity.webview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import h.u.a;
import h.u.b;
import j.d.d.e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class UnityWebViewProxy implements IUnityWebViewProxy {
    public static volatile boolean WebContentDebugging;
    private static volatile UnityWebViewProxy _I;
    private FrameLayout _FrameLayout;
    private IUnityMessenger _UnityMessenger;
    private Activity _UnityPlayerActivity;
    private View _focus;
    private final e gson = new e();
    private volatile HashMap<Integer, WebView> _WebViews = new HashMap<>();
    private volatile HashMap<Integer, WebViewStatus> _WebViewStatuses = new HashMap<>();
    private volatile int _NextWebViewId = 0;

    private class _UnityWebChromeClient extends UnityWebChromeClient {
        public _UnityWebChromeClient(int i2) {
            super(i2);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected WebViewStatus getStatus() {
            return UnityWebViewProxy.this.getStatus(this._webViewId);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected WebView getWebView() {
            return UnityWebViewProxy.this.getWebView(this._webViewId);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected Activity getWebViewActivity() {
            return UnityWebViewProxy.this._UnityPlayerActivity;
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected ViewGroup getWebViewParent() {
            return UnityWebViewProxy.this._FrameLayout;
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected void sendToUnity(String str, String str2) {
            UnityWebViewProxy.this.sendToUnity(this._webViewId, str, str2);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected void setStatus(WebViewStatus webViewStatus) {
            UnityWebViewProxy.this._WebViewStatuses.put(Integer.valueOf(this._webViewId), webViewStatus);
        }
    }

    private class _UnityWebViewClient extends UnityWebViewClient {
        public _UnityWebViewClient(int i2) {
            super(i2);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void Log(String str) {
            UnityWebViewProxy.this.Log(this._webViewId, str);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void Log(String str, Throwable th) {
            UnityWebViewProxy.this.Log(this._webViewId, str, th);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void LogExtra(String str) {
            UnityWebViewProxy.this.LogExtra(this._webViewId, str);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void LogExtra(String str, Throwable th) {
            UnityWebViewProxy.this.LogExtra(this._webViewId, str, th);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected WebViewStatus getStatus() {
            return UnityWebViewProxy.this.getStatus(this._webViewId);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected Activity getWebViewActivity() {
            return UnityWebViewProxy.this._UnityPlayerActivity;
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected ViewGroup getWebViewParent() {
            return UnityWebViewProxy.this._FrameLayout;
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void runJavaScript(JavaScriptInvoke javaScriptInvoke) {
            UnityWebViewProxy.this._runJavaScript(this._webViewId, javaScriptInvoke.code, javaScriptInvoke.callback, javaScriptInvoke.id);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void setStatus(WebViewStatus webViewStatus) {
            UnityWebViewProxy.this._WebViewStatuses.put(Integer.valueOf(this._webViewId), webViewStatus);
        }
    }

    private class _WebViewJavaScriptHandler {
        private final int _webViewId;

        public _WebViewJavaScriptHandler(int i2) {
            this._webViewId = i2;
        }

        @JavascriptInterface
        public void on_HTML5_Video_Ended() {
            WebViewManager.RunOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy._WebViewJavaScriptHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    UnityWebChromeClient unityWebChromeClient;
                    _WebViewJavaScriptHandler _webviewjavascripthandler = _WebViewJavaScriptHandler.this;
                    WebViewStatus status = UnityWebViewProxy.this.getStatus(_webviewjavascripthandler._webViewId);
                    if (status == null || (unityWebChromeClient = status.WebChromeClient) == null) {
                        return;
                    }
                    unityWebChromeClient.onHideCustomView();
                }
            });
        }

        @JavascriptInterface
        public void postMessage(String str) {
            UnityWebViewProxy.this.sendToUnity(this._webViewId, IUnityWebViewProxy.UnityCallbacks.JAVA_SCRIPT_POST_MESSAGE, str);
        }
    }

    private UnityWebViewProxy() {
    }

    public static synchronized UnityWebViewProxy I() {
        if (_I == null) {
            _I = new UnityWebViewProxy();
        }
        return _I;
    }

    private synchronized int NewWebViewId() {
        this._NextWebViewId++;
        return this._NextWebViewId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String _clearCache() {
        try {
            WebView webView = new WebView(this._UnityPlayerActivity);
            webView.clearFormData();
            webView.clearHistory();
            webView.clearMatches();
            webView.clearCache(true);
            webView.destroy();
            return "";
        } catch (Throwable th) {
            WebViewManager.Log("@clearCache()", th);
            return th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _clearCookies() {
        CookieManager cookieManager = CookieManager.getInstance();
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.removeSessionCookies(null);
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
            } else {
                CookieSyncManager.createInstance(this._UnityPlayerActivity);
                cookieManager.removeAllCookie();
                cookieManager.removeSessionCookie();
                CookieSyncManager.getInstance().sync();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _runJavaScript(final int i2, String str, final String str2, final String str3) {
        String message;
        WebView webView = getWebView(i2);
        LogExtra(i2, "@runJavaScript(): execute " + str2 + ": " + str3);
        if (webView == null) {
            sendJavaScriptErrorToUnity(i2, JavaScriptResult.ERROR_NO_WEB_VIEW + i2, str2, str3);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            try {
                LogExtra(i2, "?evaluateJavascript()");
                webView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.garena.unity.webview.UnityWebViewProxy.17
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str4) {
                        try {
                            String str5 = str2;
                            if (str5 == null || str5.length() <= 0) {
                                return;
                            }
                            UnityWebViewProxy.this.LogExtra(i2, "@evaluateJavascript.ValueCallback(): " + str4);
                            UnityWebViewProxy.this.sendJavaScriptResultToUnity(i2, str4, str2, str3);
                        } catch (Throwable th) {
                            UnityWebViewProxy.this.LogExtra(i2, "@evaluateJavascript.ValueCallback()", th);
                            UnityWebViewProxy.this.sendJavaScriptErrorToUnity(i2, th.getMessage(), str2, str3);
                        }
                    }
                });
                LogExtra(i2, "!evaluateJavascript()");
                return;
            } catch (Throwable th) {
                LogExtra(i2, "@evaluateJavascript()", th);
                message = th.getMessage();
            }
        } else {
            message = JavaScriptResult.ERROR_API_LEVEL_TOO_LOW + i3;
        }
        sendJavaScriptErrorToUnity(i2, message, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _webStorage_DeleteAllData() {
        try {
            WebStorage.getInstance().deleteAllData();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkShouldRestoreFocus() {
        View view;
        FrameLayout frameLayout;
        boolean z = true;
        boolean z2 = true;
        for (Map.Entry<Integer, WebView> entry : this._WebViews.entrySet()) {
            boolean z3 = false;
            z &= entry.getValue() == null;
            if (entry.getValue() == null || entry.getValue().getVisibility() != 0) {
                z3 = true;
            }
            z2 &= z3;
        }
        if (z && (frameLayout = this._FrameLayout) != null) {
            frameLayout.setVisibility(4);
        }
        if (!z2 || (view = this._focus) == null) {
            return;
        }
        view.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendJavaScriptErrorToUnity(int i2, String str, String str2, String str3) {
        LogExtra(i2, "@sendJavaScriptErrorToUnity: " + str);
        sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.JAVA_SCRIPT_RESULT, this.gson.t(JavaScriptResult.Error(str, str2, str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendJavaScriptResultToUnity(int i2, String str, String str2, String str3) {
        LogExtra(i2, "@sendJavaScriptResultToUnity: " + str);
        sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.JAVA_SCRIPT_RESULT, this.gson.t(JavaScriptResult.Result(str, str2, str3)));
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void Log(int i2, String str) {
        sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.LOG_MESSAGE, str);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void Log(int i2, String str, Throwable th) {
        sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.LOG_MESSAGE, str + ": " + th.getClass().getName() + ": " + th.getMessage());
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void LogExtra(int i2, String str) {
        WebViewStatus status = getStatus(i2);
        if (status != null && status.ExtraLog) {
            Log(i2, str);
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void LogExtra(int i2, String str, Throwable th) {
        WebViewStatus status = getStatus(i2);
        if (status != null && status.ExtraLog) {
            Log(i2, str, th);
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean canClearCache() {
        return this._UnityPlayerActivity != null;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean canClearCookies() {
        return this._UnityPlayerActivity != null;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void canGoBackward(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.9
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                boolean zCanGoBack = false;
                if (webView != null) {
                    try {
                        zCanGoBack = webView.canGoBack();
                    } catch (Throwable th) {
                        UnityWebViewProxy.this.Log(i2, "@canGoBackward()", th);
                    }
                }
                UnityWebViewProxy.this.sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAN_GO_BACKWARD_RESULT, zCanGoBack + "");
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void canGoForward(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.10
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                boolean zCanGoForward = false;
                if (webView != null) {
                    try {
                        zCanGoForward = webView.canGoForward();
                    } catch (Throwable th) {
                        UnityWebViewProxy.this.Log(i2, "@canGoForward()", th);
                    }
                }
                UnityWebViewProxy.this.sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAN_GO_FORWARD_RESULT, zCanGoForward + "");
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean captureScreenshot(final int i2, final String str) {
        if (this._UnityPlayerActivity == null || this._FrameLayout == null || str == null || str.length() <= 0) {
            return false;
        }
        this._UnityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.19
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                if (webView == null) {
                    UnityWebViewProxy.this.sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAPTURE_SCREENSHOT_FAILURE, "");
                    return;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(UnityWebViewProxy.this._FrameLayout.getWidth(), UnityWebViewProxy.this._FrameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    UnityWebViewProxy.this._FrameLayout.draw(new Canvas(bitmapCreateBitmap));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                    int i3 = layoutParams.leftMargin;
                    int height = UnityWebViewProxy.this._FrameLayout.getHeight();
                    int i4 = layoutParams.height;
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, i3, (height - i4) - layoutParams.bottomMargin, layoutParams.width, i4);
                    File file = new File(UnityWebViewProxy.this._UnityPlayerActivity.getExternalFilesDir(null).toString(), str + ".jpg");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    UnityWebViewProxy.this.sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAPTURE_SCREENSHOT_SUCCESS, file.getAbsolutePath());
                } catch (Throwable unused) {
                    UnityWebViewProxy.this.sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAPTURE_SCREENSHOT_FAILURE, "");
                }
            }
        });
        return true;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void clearCache() {
        Activity activity;
        if (canClearCache() && (activity = this._UnityPlayerActivity) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.22
                @Override // java.lang.Runnable
                public void run() {
                    WebViewManager.__sendToUnity("OnClearCache", UnityWebViewProxy.this._clearCache());
                }
            });
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void clearCookies() {
        Activity activity;
        if (canClearCookies() && (activity = this._UnityPlayerActivity) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.21
                @Override // java.lang.Runnable
                public void run() {
                    UnityWebViewProxy.this._clearCookies();
                }
            });
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void clearData() {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.20
            @Override // java.lang.Runnable
            public void run() {
                if (UnityWebViewProxy.this.canClearCookies()) {
                    UnityWebViewProxy.this._clearCookies();
                }
                if (UnityWebViewProxy.this.canClearCache()) {
                    UnityWebViewProxy.this._clearCache();
                }
                UnityWebViewProxy.this._webStorage_DeleteAllData();
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void close(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.6
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                WebViewStatus status = UnityWebViewProxy.this.getStatus(i2);
                if (status != null) {
                    status.DeferringDisplay = false;
                    status.Hiding = false;
                }
                if (webView != null) {
                    try {
                        UnityWebViewProxy.this._WebViews.remove(Integer.valueOf(i2));
                        UnityWebViewProxy.this._FrameLayout.removeView(webView);
                        webView.destroy();
                        UnityWebViewProxy.this._WebViewStatuses.remove(Integer.valueOf(i2));
                        UnityWebViewProxy.this.checkShouldRestoreFocus();
                        if (!UnityWebViewProxy.this._WebViews.isEmpty()) {
                        }
                    } catch (Throwable th) {
                        try {
                            UnityWebViewProxy.this.Log(i2, "@close()", th);
                        } finally {
                            UnityWebViewProxy.this._WebViewStatuses.remove(Integer.valueOf(i2));
                            UnityWebViewProxy.this.checkShouldRestoreFocus();
                            if (UnityWebViewProxy.this._WebViews.isEmpty()) {
                                UnityWebViewProxy.this._focus = null;
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void closeAll() {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.7
            @Override // java.lang.Runnable
            public void run() {
                if (UnityWebViewProxy.this._WebViews.size() > 0) {
                    for (Integer num : UnityWebViewProxy.this._WebViews.keySet()) {
                        WebView webView = UnityWebViewProxy.this.getWebView(num.intValue());
                        if (webView != null) {
                            try {
                                UnityWebViewProxy.this._FrameLayout.removeView(webView);
                                webView.destroy();
                            } catch (Throwable th) {
                                UnityWebViewProxy.this.Log(num.intValue(), "@closeAll(): " + num, th);
                            }
                        }
                    }
                }
                UnityWebViewProxy.this._WebViews.clear();
                UnityWebViewProxy.this._WebViewStatuses.clear();
                UnityWebViewProxy.this.checkShouldRestoreFocus();
                UnityWebViewProxy.this._focus = null;
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void destroy() {
        Activity activity = this._UnityPlayerActivity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = UnityWebViewProxy.this._WebViews.entrySet().iterator();
                    while (it.hasNext()) {
                        WebView webView = (WebView) ((Map.Entry) it.next()).getValue();
                        if (webView != null) {
                            try {
                                webView.destroy();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    UnityWebViewProxy.this._WebViews.clear();
                    UnityWebViewProxy.this._WebViewStatuses.clear();
                    UnityWebViewProxy.this._FrameLayout = null;
                    UnityWebViewProxy.this._UnityPlayerActivity = null;
                    UnityWebViewProxy.this._UnityMessenger = null;
                }
            });
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public double getLoadingProgress(int i2) {
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            return status.LoadingProgress;
        }
        return -1.0d;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public synchronized WebViewStatus getStatus(int i2) {
        return this._WebViewStatuses.get(Integer.valueOf(i2));
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public String getUrl(int i2) {
        WebViewStatus status = getStatus(i2);
        return status != null ? status.Url : "";
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void getUserAgentString(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.15
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                UnityWebViewProxy.this.sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.GET_USER_AGENT_STRING, webView != null ? webView.getSettings().getUserAgentString() : "");
            }
        });
    }

    public synchronized WebView getWebView(int i2) {
        return this._WebViews.get(Integer.valueOf(i2));
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void goBackward(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.11
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                if (webView == null || !webView.canGoBack()) {
                    return;
                }
                try {
                    webView.goBack();
                } catch (Throwable th) {
                    UnityWebViewProxy.this.Log(i2, "@goBackward()", th);
                }
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void goForward(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.12
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                if (webView == null || !webView.canGoForward()) {
                    return;
                }
                try {
                    webView.goForward();
                } catch (Throwable th) {
                    UnityWebViewProxy.this.Log(i2, "@_goForward()", th);
                }
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void hide(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.14
            @Override // java.lang.Runnable
            public void run() {
                WebView webView;
                WebViewStatus status = UnityWebViewProxy.this.getStatus(i2);
                if (status != null) {
                    status.Hiding = true;
                    if (status.DeferringDisplay || (webView = UnityWebViewProxy.this.getWebView(i2)) == null) {
                        return;
                    }
                    try {
                        webView.onPause();
                        webView.pauseTimers();
                    } catch (Throwable th) {
                        UnityWebViewProxy.this.Log(i2, "@hide()", th);
                    }
                    webView.setVisibility(8);
                    UnityWebViewProxy.this.checkShouldRestoreFocus();
                }
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean ignoreUnityPlayerActivityWindowFocusChanged() {
        return false;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void init(Activity activity) {
        this._UnityPlayerActivity = activity;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.1
                @Override // java.lang.Runnable
                public void run() {
                    if (UnityWebViewProxy.this._FrameLayout == null) {
                        UnityWebViewProxy.this._FrameLayout = new FrameLayout(UnityWebViewProxy.this._UnityPlayerActivity);
                        UnityWebViewProxy.this._UnityPlayerActivity.addContentView(UnityWebViewProxy.this._FrameLayout, new FrameLayout.LayoutParams(-1, -1));
                        UnityWebViewProxy.this._FrameLayout.setVisibility(4);
                    }
                }
            });
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean isLoading(int i2) {
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            return status.IsLoading;
        }
        return false;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean isShowing(int i2) {
        WebViewStatus status;
        if (this._UnityPlayerActivity == null || (status = getStatus(i2)) == null) {
            return false;
        }
        return !status.Hiding;
    }

    public boolean isShowingCustomView() {
        UnityWebChromeClient unityWebChromeClient;
        boolean zShowingCustomView = false;
        if (this._WebViewStatuses != null && this._WebViewStatuses.size() > 0) {
            for (WebViewStatus webViewStatus : this._WebViewStatuses.values()) {
                if (webViewStatus != null && (unityWebChromeClient = webViewStatus.WebChromeClient) != null) {
                    zShowingCustomView |= unityWebChromeClient.showingCustomView();
                }
            }
        }
        return zShowingCustomView;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void move(int i2, float f, float f2, float f3, float f4) {
    }

    public boolean onUnityPlayerActivityBackPressed() {
        UnityWebChromeClient unityWebChromeClient;
        boolean zOnBackPressed = false;
        if (this._WebViewStatuses != null && this._WebViewStatuses.size() > 0) {
            for (WebViewStatus webViewStatus : this._WebViewStatuses.values()) {
                if (webViewStatus != null && (unityWebChromeClient = webViewStatus.WebChromeClient) != null) {
                    zOnBackPressed |= unityWebChromeClient.onBackPressed();
                }
            }
        }
        return zOnBackPressed;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void onUnityPlayerActivityDestroy(Activity activity) {
        destroy();
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void onUnityPlayerActivityPause(Activity activity) {
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void onUnityPlayerActivityResume(Activity activity) {
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void onUnityPlayerActivityStart(Activity activity) {
        Activity activity2 = this._UnityPlayerActivity;
        if (activity2 != null) {
            activity2.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.3
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry : UnityWebViewProxy.this._WebViews.entrySet()) {
                        WebView webView = (WebView) entry.getValue();
                        WebViewStatus status = UnityWebViewProxy.this.getStatus(((Integer) entry.getKey()).intValue());
                        if (webView != null && status != null && !status.Hiding) {
                            try {
                                webView.onResume();
                                webView.resumeTimers();
                            } catch (Throwable th) {
                                UnityWebViewProxy.this.Log(((Integer) entry.getKey()).intValue(), "@onUnityPlayerActivityStart(): " + entry.getKey(), th);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void onUnityPlayerActivityStop(Activity activity) {
        Activity activity2 = this._UnityPlayerActivity;
        if (activity2 != null) {
            activity2.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.4
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry : UnityWebViewProxy.this._WebViews.entrySet()) {
                        WebView webView = (WebView) entry.getValue();
                        WebViewStatus status = UnityWebViewProxy.this.getStatus(((Integer) entry.getKey()).intValue());
                        if (webView != null && status != null && !status.Hiding) {
                            try {
                                webView.onPause();
                                webView.pauseTimers();
                            } catch (Throwable th) {
                                UnityWebViewProxy.this.Log(((Integer) entry.getKey()).intValue(), "@onUnityPlayerActivityStop(): " + entry.getKey(), th);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public int open(final String str, final float f, final float f2, final float f3, final float f4, final String str2) {
        if (this._UnityPlayerActivity == null) {
            return -1;
        }
        final int iNewWebViewId = NewWebViewId();
        WebViewStatus webViewStatus = new WebViewStatus();
        webViewStatus.Url = str;
        webViewStatus.Opening = true;
        this._WebViewStatuses.put(Integer.valueOf(iNewWebViewId), webViewStatus);
        this._UnityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.5
            @Override // java.lang.Runnable
            public void run() {
                WebViewStatus status = UnityWebViewProxy.this.getStatus(iNewWebViewId);
                if (status == null) {
                    status = new WebViewStatus();
                    UnityWebViewProxy.this._WebViewStatuses.put(Integer.valueOf(iNewWebViewId), status);
                }
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 19) {
                        WebView.setWebContentsDebuggingEnabled(UnityWebViewProxy.WebContentDebugging);
                    }
                    if (UnityWebViewProxy.this._WebViews.isEmpty()) {
                        UnityWebViewProxy unityWebViewProxy = UnityWebViewProxy.this;
                        unityWebViewProxy._focus = unityWebViewProxy._UnityPlayerActivity.getCurrentFocus();
                    }
                    String str3 = str2;
                    WebViewParameters webViewParameters = (str3 == null || str3.length() <= 0) ? new WebViewParameters() : (WebViewParameters) UnityWebViewProxy.this.gson.k(str2, WebViewParameters.class);
                    status.ExtraLog = webViewParameters.ExtraLog;
                    status.UnitySendMessageGameObjectName = webViewParameters.UnitySendMessageGameObjectName;
                    WebView webView = new WebView(UnityWebViewProxy.this._UnityPlayerActivity);
                    UnityWebViewProxy.this._WebViews.put(Integer.valueOf(iNewWebViewId), webView);
                    boolean z = true;
                    if (!webViewParameters.HardwareAcceleration) {
                        webView.setLayerType(1, null);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 83;
                    float width = UnityWebViewProxy.this._FrameLayout.getWidth();
                    float height = UnityWebViewProxy.this._FrameLayout.getHeight();
                    layoutParams.leftMargin = (int) (f * width);
                    layoutParams.bottomMargin = (int) (f2 * height);
                    layoutParams.width = (int) (f3 * width);
                    layoutParams.height = (int) (f4 * height);
                    UnityWebViewProxy.this._FrameLayout.addView(webView, layoutParams);
                    UnityWebViewProxy.this.LogExtra(iNewWebViewId, "@open(): DeferredDisplay: " + webViewParameters.DeferredDisplay);
                    if (webViewParameters.DeferredDisplay) {
                        status.DeferredDisplay = true;
                        status.DeferringDisplay = true;
                        webView.setVisibility(8);
                    } else {
                        UnityWebViewProxy.this._FrameLayout.setVisibility(0);
                        webView.setVisibility(0);
                        webView.requestFocus();
                    }
                    CookieManager.getInstance().setAcceptCookie(webViewParameters.UseCookie);
                    if (i2 >= 21) {
                        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, webViewParameters.UseCookie);
                    }
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setSupportZoom(webViewParameters.Scaling);
                    webView.getSettings().setBuiltInZoomControls(webViewParameters.Scaling);
                    webView.getSettings().setTextZoom(100);
                    webView.getSettings().setDisplayZoomControls(false);
                    webView.getSettings().setDomStorageEnabled(true);
                    if (i2 >= 17) {
                        WebSettings settings = webView.getSettings();
                        if (webViewParameters.AutoPlayMedia) {
                            z = false;
                        }
                        settings.setMediaPlaybackRequiresUserGesture(z);
                    }
                    String nameInJavaScript = WebViewManager.getNameInJavaScript();
                    if (nameInJavaScript != null && nameInJavaScript.length() > 0) {
                        webView.addJavascriptInterface(UnityWebViewProxy.this.new _WebViewJavaScriptHandler(iNewWebViewId), nameInJavaScript);
                    }
                    webView.setBackgroundColor(0);
                    if (i2 >= 21) {
                        webView.getSettings().setMixedContentMode(0);
                    }
                    if (b.a("FORCE_DARK")) {
                        a.b(webView.getSettings(), 0);
                    }
                    webView.setWebViewClient(UnityWebViewProxy.this.new _UnityWebViewClient(iNewWebViewId));
                    _UnityWebChromeClient _unitywebchromeclient = UnityWebViewProxy.this.new _UnityWebChromeClient(iNewWebViewId);
                    status.WebChromeClient = _unitywebchromeclient;
                    webView.setWebChromeClient(_unitywebchromeclient);
                    webView.loadUrl(str);
                    webView.onResume();
                    webView.resumeTimers();
                } catch (Throwable th) {
                    UnityWebViewProxy.this.Log(iNewWebViewId, "@_open()", th);
                }
                status.Opening = false;
            }
        });
        return iNewWebViewId;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void reload(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.8
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                if (webView != null) {
                    try {
                        webView.reload();
                    } catch (Throwable th) {
                        UnityWebViewProxy.this.Log(i2, "@reload()", th);
                    }
                }
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void runJavaScript(final int i2, final String str, final String str2, final String str3) {
        if (this._UnityPlayerActivity == null) {
            return;
        }
        LogExtra(i2, "@runJavaScript(): " + str3 + ": " + str2 + "\n" + str);
        WebView webView = getWebView(i2);
        WebViewStatus status = getStatus(i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            sendJavaScriptErrorToUnity(i2, JavaScriptResult.ERROR_API_LEVEL_TOO_LOW + i3, str2, str3);
            return;
        }
        if (webView == null) {
            if (status != null && status.Opening) {
                LogExtra(i2, "@runJavaScript(): queued " + str2 + ": " + str3);
                JavaScriptInvoke javaScriptInvoke = new JavaScriptInvoke();
                javaScriptInvoke.webViewId = i2;
                javaScriptInvoke.code = str;
                javaScriptInvoke.callback = str2;
                javaScriptInvoke.id = str3;
                status.PendingJavaScriptInvokes.addLast(javaScriptInvoke);
                return;
            }
            sendJavaScriptErrorToUnity(i2, JavaScriptResult.ERROR_NO_WEB_VIEW + i2, str2, str3);
        }
        this._UnityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.18
            @Override // java.lang.Runnable
            public void run() {
                UnityWebViewProxy.this._runJavaScript(i2, str, str2, str3);
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void sendToUnity(int i2, String str, String str2) {
        String str3;
        IUnityMessenger iUnityMessenger;
        WebViewStatus status = getStatus(i2);
        if (status == null || (str3 = status.UnitySendMessageGameObjectName) == null || str3.length() <= 0 || (iUnityMessenger = this._UnityMessenger) == null) {
            return;
        }
        iUnityMessenger.Send(status.UnitySendMessageGameObjectName, str, str2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void setUnityMessenger(IUnityMessenger iUnityMessenger) {
        this._UnityMessenger = iUnityMessenger;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void setUserAgentString(final int i2, final String str) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.16
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = UnityWebViewProxy.this.getWebView(i2);
                if (webView == null || webView.getSettings() == null) {
                    return;
                }
                webView.getSettings().setUserAgentString(str);
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void show(final int i2) {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.13
            @Override // java.lang.Runnable
            public void run() {
                WebView webView;
                WebViewStatus status = UnityWebViewProxy.this.getStatus(i2);
                if (status != null) {
                    status.Hiding = false;
                    if (status.DeferringDisplay || (webView = UnityWebViewProxy.this.getWebView(i2)) == null) {
                        return;
                    }
                    if (webView != null && status != null) {
                        try {
                            webView.onResume();
                            webView.resumeTimers();
                        } catch (Throwable th) {
                            UnityWebViewProxy.this.Log(i2, "@show()", th);
                        }
                    }
                    UnityWebViewProxy.this._FrameLayout.setVisibility(0);
                    webView.setVisibility(0);
                    webView.requestFocus();
                }
            }
        });
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void test() {
        boolean z;
        try {
            CookieManager.getInstance();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        WebViewManager.__sendToUnity(IUnityWebViewProxy.UnityCallbacks.TEST_RESULT, z + "");
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void webStorage_DeleteAllData() {
        Activity activity = this._UnityPlayerActivity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewProxy.23
            @Override // java.lang.Runnable
            public void run() {
                UnityWebViewProxy.this._webStorage_DeleteAllData();
            }
        });
    }
}
