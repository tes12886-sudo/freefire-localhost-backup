package com.garena.unity.webview;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.appff.haptic.base.Utils;
import h.u.a;
import h.u.b;
import j.d.d.e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class UnityWebViewActivity extends Activity {
    private static final String EXECUTE_INTENT_LOG = "execute intent";
    private static final String LOG_TAG = "UWVActivity";
    private static int SYSTEM_UI_VISIBILITY;
    private static boolean _DebugLog;
    private static boolean _UserFinish;
    private static boolean _WebContentDebugging;
    private HashMap<Integer, WebView> _WebViews = new HashMap<>();
    private volatile HashMap<Integer, WebViewStatus> _WebViewStatuses = new HashMap<>();
    private e gson = new e();
    private Insets _SystemBarsWindowInsets = null;
    private volatile boolean canHandleIntent = false;
    private volatile LinkedList<Intent> queuedIntents = new LinkedList<>();
    private boolean _PingEcho = false;
    public View.OnTouchListener FrameLayoutTouchListener = new View.OnTouchListener() { // from class: com.garena.unity.webview.UnityWebViewActivity.6
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intent intent_intentToUnityActivity = UnityWebViewActivity.this._intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.ON_TOUCH_RELAY);
            if (Build.VERSION.SDK_INT >= 30 && UnityWebViewActivity.this._SystemBarsWindowInsets != null) {
                motionEvent.setLocation(motionEvent.getX() - UnityWebViewActivity.this._SystemBarsWindowInsets.left, motionEvent.getY() - UnityWebViewActivity.this._SystemBarsWindowInsets.top);
            }
            intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.MOTION_EVENT, motionEvent);
            UnityWebViewActivity.this._sendToUnityActivity(intent_intentToUnityActivity);
            return true;
        }
    };
    private final BroadcastReceiver _UnityToWebViewBroadcastReceiver = new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivity.7
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            UnityWebViewActivity.LogIntent("recv by WebViewActivity", intent);
            if (intent == null || intent.getAction() == null) {
                return;
            }
            UnityWebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewActivity.7.1
                @Override // java.lang.Runnable
                public void run() {
                    UnityWebViewActivity.this.processIntent(intent);
                }
            });
        }
    };
    private final HashMap<String, IntentExecutor> _UnityToWebViewIntentExecutors = new HashMap<String, IntentExecutor>() { // from class: com.garena.unity.webview.UnityWebViewActivity.8
        {
            put(UnityWebViewActivityProxy.IntentActions.PING_RESP, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.1
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    UnityWebViewActivity.this._PingEcho = true;
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.TEST, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.2
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    boolean z;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    try {
                        CookieManager.getInstance();
                        z = true;
                    } catch (Throwable unused) {
                        z = false;
                    }
                    Intent intent_intentToUnityActivity = UnityWebViewActivity.this._intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.TEST_RESULT);
                    intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.RETURN_VALUE, z);
                    return intent_intentToUnityActivity;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.CLEAR_ALL, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.3
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:10:0x002e
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public android.content.Intent onIntent(android.content.Intent r4) {
                    /*
                        r3 = this;
                        java.lang.String r0 = "execute intent"
                        com.garena.unity.webview.UnityWebViewActivity.access$1000(r0, r4)
                        r4 = 0
                        android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> L2e
                        int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2e
                        r2 = 21
                        if (r1 < r2) goto L1a
                        r0.removeSessionCookies(r4)     // Catch: java.lang.Throwable -> L2e
                        r0.removeAllCookies(r4)     // Catch: java.lang.Throwable -> L2e
                        r0.flush()     // Catch: java.lang.Throwable -> L2e
                        goto L2e
                    L1a:
                        com.garena.unity.webview.UnityWebViewActivity$8 r1 = com.garena.unity.webview.UnityWebViewActivity.AnonymousClass8.this     // Catch: java.lang.Throwable -> L2e
                        com.garena.unity.webview.UnityWebViewActivity r1 = com.garena.unity.webview.UnityWebViewActivity.this     // Catch: java.lang.Throwable -> L2e
                        android.webkit.CookieSyncManager.createInstance(r1)     // Catch: java.lang.Throwable -> L2e
                        r0.removeAllCookie()     // Catch: java.lang.Throwable -> L2e
                        r0.removeSessionCookie()     // Catch: java.lang.Throwable -> L2e
                        android.webkit.CookieSyncManager r0 = android.webkit.CookieSyncManager.getInstance()     // Catch: java.lang.Throwable -> L2e
                        r0.sync()     // Catch: java.lang.Throwable -> L2e
                    L2e:
                        android.webkit.WebView r0 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L47
                        com.garena.unity.webview.UnityWebViewActivity$8 r1 = com.garena.unity.webview.UnityWebViewActivity.AnonymousClass8.this     // Catch: java.lang.Throwable -> L47
                        com.garena.unity.webview.UnityWebViewActivity r1 = com.garena.unity.webview.UnityWebViewActivity.this     // Catch: java.lang.Throwable -> L47
                        r0.<init>(r1)     // Catch: java.lang.Throwable -> L47
                        r0.clearFormData()     // Catch: java.lang.Throwable -> L47
                        r0.clearHistory()     // Catch: java.lang.Throwable -> L47
                        r0.clearMatches()     // Catch: java.lang.Throwable -> L47
                        r1 = 1
                        r0.clearCache(r1)     // Catch: java.lang.Throwable -> L47
                        r0.destroy()     // Catch: java.lang.Throwable -> L47
                    L47:
                        android.webkit.WebStorage r0 = android.webkit.WebStorage.getInstance()     // Catch: java.lang.Throwable -> L4e
                        r0.deleteAllData()     // Catch: java.lang.Throwable -> L4e
                    L4e:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.garena.unity.webview.UnityWebViewActivity.AnonymousClass8.AnonymousClass3.onIntent(android.content.Intent):android.content.Intent");
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.CLOSE_ALL, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.4
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    UnityWebViewActivity.this._closeAll();
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.OPEN, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.5
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    intent.setExtrasClassLoader(WebViewActivityParameters.class.getClassLoader());
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    WebViewActivityParameters webViewActivityParameters = (WebViewActivityParameters) intent.getParcelableExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_PARAMETERS);
                    if (webViewActivityParameters == null) {
                        return null;
                    }
                    UnityWebViewActivity.this._open(webViewActivityParameters);
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.CLOSE, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.6
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0) {
                        return null;
                    }
                    UnityWebViewActivity.this._close(intExtra);
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.RELOAD, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.7
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0) {
                        return null;
                    }
                    UnityWebViewActivity.this._reload(intExtra);
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.SHOW, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.8
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0) {
                        return null;
                    }
                    UnityWebViewActivity.this._show(intExtra);
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.HIDE, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.9
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0) {
                        return null;
                    }
                    UnityWebViewActivity.this._hide(intExtra);
                    return null;
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.RUN_JAVASCRIPT, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.10
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    intent.setExtrasClassLoader(JavaScriptInvoke.class.getClassLoader());
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    JavaScriptInvoke javaScriptInvoke = (JavaScriptInvoke) intent.getParcelableExtra(UnityWebViewActivityProxy.IntentExtras.JAVASCRIPT_INVOKE);
                    if (javaScriptInvoke == null) {
                        return null;
                    }
                    return UnityWebViewActivity.this._runJavaScript(javaScriptInvoke);
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.CAN_GO_BACKWARD, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.11
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    WebView webView;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    boolean zCanGoBack = false;
                    if (intExtra >= 0 && (webView = UnityWebViewActivity.this.getWebView(intExtra)) != null) {
                        try {
                            zCanGoBack = webView.canGoBack();
                        } catch (Throwable th) {
                            UnityWebViewActivity.this.Log(intExtra, "@canGoBackward()", th);
                        }
                    }
                    return UnityWebViewActivity.this._intentToUnity(intExtra, IUnityWebViewProxy.UnityCallbacks.CAN_GO_BACKWARD_RESULT, zCanGoBack + "");
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.CAN_GO_FORWARD, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.12
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    WebView webView;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    boolean zCanGoForward = false;
                    if (intExtra >= 0 && (webView = UnityWebViewActivity.this.getWebView(intExtra)) != null) {
                        try {
                            zCanGoForward = webView.canGoForward();
                        } catch (Throwable th) {
                            UnityWebViewActivity.this.Log(intExtra, "@canGoForward()", th);
                        }
                    }
                    return UnityWebViewActivity.this._intentToUnity(intExtra, IUnityWebViewProxy.UnityCallbacks.CAN_GO_FORWARD_RESULT, zCanGoForward + "");
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.GO_BACKWARD, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.13
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    WebView webView;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0 || (webView = UnityWebViewActivity.this.getWebView(intExtra)) == null) {
                        return null;
                    }
                    try {
                        webView.goBack();
                        return null;
                    } catch (Throwable th) {
                        UnityWebViewActivity.this.Log(intExtra, "@goBackward()", th);
                        return null;
                    }
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.GO_FORWARD, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.14
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    WebView webView;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0 || (webView = UnityWebViewActivity.this.getWebView(intExtra)) == null) {
                        return null;
                    }
                    try {
                        webView.goForward();
                        return null;
                    } catch (Throwable th) {
                        UnityWebViewActivity.this.Log(intExtra, "@goForward()", th);
                        return null;
                    }
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.CAPTURE_SCREENSHOT, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.15
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    return UnityWebViewActivity.this._captureScreenshot(intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1), intent.getStringExtra(UnityWebViewActivityProxy.IntentExtras.FILE_NAME));
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.GET_USER_AGENT_STRING, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.16
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    WebView webView;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    String userAgentString = "";
                    if (intExtra >= 0 && (webView = UnityWebViewActivity.this.getWebView(intExtra)) != null) {
                        try {
                            if (webView.getSettings() != null) {
                                userAgentString = webView.getSettings().getUserAgentString();
                            }
                        } catch (Throwable th) {
                            UnityWebViewActivity.this.Log(intExtra, "@getUserAgentString()", th);
                        }
                    }
                    return UnityWebViewActivity.this._intentToUnity(intExtra, IUnityWebViewProxy.UnityCallbacks.GET_USER_AGENT_STRING, userAgentString);
                }
            });
            put(UnityWebViewActivityProxy.IntentActions.SET_USER_AGENT_STRING, new IntentExecutor() { // from class: com.garena.unity.webview.UnityWebViewActivity.8.17
                {
                    UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                }

                @Override // com.garena.unity.webview.UnityWebViewActivity.IntentExecutor
                public Intent onIntent(Intent intent) {
                    WebView webView;
                    UnityWebViewActivity.LogIntent(UnityWebViewActivity.EXECUTE_INTENT_LOG, intent);
                    String stringExtra = intent.getStringExtra(UnityWebViewActivityProxy.IntentExtras.USER_AGENT_STRING);
                    int intExtra = intent.getIntExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, -1);
                    if (intExtra < 0 || (webView = UnityWebViewActivity.this.getWebView(intExtra)) == null) {
                        return null;
                    }
                    try {
                        if (webView.getSettings() == null) {
                            return null;
                        }
                        webView.getSettings().setUserAgentString(stringExtra);
                        return null;
                    } catch (Throwable th) {
                        UnityWebViewActivity.this.Log(intExtra, "@setUserAgentString()", th);
                        return null;
                    }
                }
            });
        }
    };

    private abstract class IntentExecutor {
        private IntentExecutor() {
        }

        public abstract Intent onIntent(Intent intent);
    }

    private class _UnityWebChromeClient extends UnityWebChromeClient {
        public _UnityWebChromeClient(int i2) {
            super(i2);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected WebViewStatus getStatus() {
            return UnityWebViewActivity.this.getStatus(this._webViewId);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected WebView getWebView() {
            return UnityWebViewActivity.this.getWebView(this._webViewId);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected Activity getWebViewActivity() {
            return UnityWebViewActivity.this;
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected ViewGroup getWebViewParent() {
            return (FrameLayout) UnityWebViewActivity.this.getWindow().getDecorView().getRootView();
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected void sendToUnity(String str, String str2) {
            UnityWebViewActivity.this._sendToUnity(this._webViewId, str, str2);
        }

        @Override // com.garena.unity.webview.UnityWebChromeClient
        protected void setStatus(WebViewStatus webViewStatus) {
            UnityWebViewActivity.this.setStatus(this._webViewId, webViewStatus);
        }
    }

    private class _UnityWebViewClient extends UnityWebViewClient {
        public _UnityWebViewClient(int i2) {
            super(i2);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void Log(String str) {
            UnityWebViewActivity.this.Log(this._webViewId, str);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void Log(String str, Throwable th) {
            UnityWebViewActivity.this.Log(this._webViewId, str, th);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void LogExtra(String str) {
            UnityWebViewActivity.this.LogExtra(this._webViewId, str);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void LogExtra(String str, Throwable th) {
            UnityWebViewActivity.this.LogExtra(this._webViewId, str, th);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected WebViewStatus getStatus() {
            return UnityWebViewActivity.this.getStatus(this._webViewId);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected Activity getWebViewActivity() {
            return UnityWebViewActivity.this;
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected ViewGroup getWebViewParent() {
            return (FrameLayout) UnityWebViewActivity.this.getWindow().getDecorView().getRootView();
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void runJavaScript(JavaScriptInvoke javaScriptInvoke) {
            UnityWebViewActivity.this._runJavaScript(javaScriptInvoke);
        }

        @Override // com.garena.unity.webview.UnityWebViewClient
        protected void setStatus(WebViewStatus webViewStatus) {
            UnityWebViewActivity.this.setStatus(this._webViewId, webViewStatus);
        }
    }

    private class _WebViewJavaScriptHandler {
        private final int _webViewId;

        public _WebViewJavaScriptHandler(int i2) {
            this._webViewId = i2;
        }

        @JavascriptInterface
        public void on_HTML5_Video_Ended() {
            UnityWebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewActivity._WebViewJavaScriptHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    UnityWebChromeClient unityWebChromeClient;
                    _WebViewJavaScriptHandler _webviewjavascripthandler = _WebViewJavaScriptHandler.this;
                    WebViewStatus status = UnityWebViewActivity.this.getStatus(_webviewjavascripthandler._webViewId);
                    if (status == null || (unityWebChromeClient = status.WebChromeClient) == null) {
                        return;
                    }
                    unityWebChromeClient.onHideCustomView();
                }
            });
        }

        @JavascriptInterface
        public void postMessage(String str) {
            UnityWebViewActivity.this._sendToUnity(this._webViewId, IUnityWebViewProxy.UnityCallbacks.JAVA_SCRIPT_POST_MESSAGE, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Log(int i2, String str) {
        _sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.LOG_MESSAGE, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Log(int i2, String str, Throwable th) {
        _sendToUnity(i2, IUnityWebViewProxy.UnityCallbacks.LOG_MESSAGE, str + ": " + th.getClass().getName() + ": " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LogExtra(int i2, String str) {
        WebViewStatus status = getStatus(i2);
        if (status != null && status.ExtraLog) {
            Log(i2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LogExtra(int i2, String str, Throwable th) {
        WebViewStatus status = getStatus(i2);
        if (status != null && status.ExtraLog) {
            Log(i2, str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LogIntent(String str, Intent intent) {
        if (_DebugLog) {
            if (intent == null) {
                Log.i(LOG_TAG, String.format("%s: intent is null", str));
                return;
            }
            Log.i(LOG_TAG, String.format("%s: action %s", str, intent.getAction()));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    Log.i(LOG_TAG, String.format("%s: %s %s", str, str2, extras.get(str2)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent _captureScreenshot(int i2, String str) {
        WebView webView = getWebView(i2);
        if (webView == null) {
            return _intentToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAPTURE_SCREENSHOT_FAILURE, "");
        }
        try {
            FrameLayout frameLayout = (FrameLayout) webView.getParent();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
            frameLayout.draw(new Canvas(bitmapCreateBitmap));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
            int i3 = layoutParams.leftMargin;
            int height = frameLayout.getHeight();
            int i4 = layoutParams.height;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, i3, (height - i4) - layoutParams.bottomMargin, layoutParams.width, i4);
            File file = new File(getExternalFilesDir(null).toString(), str + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return _intentToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAPTURE_SCREENSHOT_SUCCESS, file.getAbsolutePath());
        } catch (Throwable unused) {
            return _intentToUnity(i2, IUnityWebViewProxy.UnityCallbacks.CAPTURE_SCREENSHOT_FAILURE, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _close(int i2) {
        setStatus(i2, null);
        WebView webView = getWebView(i2);
        if (webView != null) {
            try {
                this._WebViews.remove(Integer.valueOf(i2));
                ((FrameLayout) webView.getParent()).removeView(webView);
                webView.destroy();
            } catch (Throwable th) {
                Log(i2, "@_close()", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _closeAll() {
        for (WebView webView : this._WebViews.values()) {
            if (webView != null) {
                try {
                    ((FrameLayout) webView.getParent()).removeView(webView);
                    webView.destroy();
                } catch (Throwable unused) {
                }
            }
        }
        this._WebViews.clear();
        this._WebViewStatuses.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _finish() {
        if (_DebugLog) {
            Log.i(LOG_TAG, "_finish()\n" + Log.getStackTraceString(new Throwable()));
        }
        _UserFinish = true;
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _hide(int i2) {
        WebView webView;
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            status.Hiding = true;
            if (status.DeferringDisplay || (webView = getWebView(i2)) == null) {
                return;
            }
            try {
                webView.onPause();
                webView.pauseTimers();
            } catch (Throwable th) {
                Log(i2, "@_hide()", th);
            }
            webView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent _intentJavaScriptErrorToUnity(int i2, String str, String str2, String str3) {
        return _intentToUnity(i2, IUnityWebViewProxy.UnityCallbacks.JAVA_SCRIPT_RESULT, this.gson.t(JavaScriptResult.Error(str, str2, str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent _intentJavaScriptResultToUnity(int i2, String str, String str2, String str3) {
        return _intentToUnity(i2, IUnityWebViewProxy.UnityCallbacks.JAVA_SCRIPT_RESULT, this.gson.t(JavaScriptResult.Result(str, str2, str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent _intentToUnity(int i2, String str, String str2) {
        Intent intent_intentToUnityActivity = _intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.SEND_TO_UNITY);
        intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, i2);
        intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.UNITY_METHOD, str);
        intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.UNITY_METHOD_PARAMETERS, str2);
        return intent_intentToUnityActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent _intentToUnityActivity(String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _open(WebViewActivityParameters webViewActivityParameters) {
        WebViewStatus webViewStatus = new WebViewStatus();
        webViewStatus.Url = webViewActivityParameters.url;
        webViewStatus.x = webViewActivityParameters.x;
        webViewStatus.y = webViewActivityParameters.y;
        webViewStatus.w = webViewActivityParameters.w;
        webViewStatus.f832h = webViewActivityParameters.f831h;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 19) {
                WebView.setWebContentsDebuggingEnabled(_WebContentDebugging);
            }
            webViewStatus.ExtraLog = webViewActivityParameters.extra_log;
            webViewStatus.UnitySendMessageGameObjectName = webViewActivityParameters.unity_send_message_gameobject_name;
            WebView webView = new WebView(this);
            this._WebViews.put(Integer.valueOf(webViewActivityParameters.id), webView);
            boolean z = true;
            if (!webViewActivityParameters.hardware_acceleration) {
                webView.setLayerType(1, null);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 83;
            FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView().getRootView();
            calculateWebViewLayoutParams(webViewStatus, layoutParams);
            frameLayout.addView(webView, layoutParams);
            if (webViewActivityParameters.defer_display) {
                webViewStatus.DeferredDisplay = true;
                webViewStatus.DeferringDisplay = true;
                webView.setVisibility(8);
            } else {
                frameLayout.setVisibility(0);
                webView.setVisibility(0);
                webView.requestFocus();
            }
            CookieManager.getInstance().setAcceptCookie(webViewActivityParameters.cookie);
            if (i2 >= 21) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, webViewActivityParameters.cookie);
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setSupportZoom(webViewActivityParameters.scaling);
            webView.getSettings().setBuiltInZoomControls(webViewActivityParameters.scaling);
            webView.getSettings().setTextZoom(100);
            webView.getSettings().setDisplayZoomControls(false);
            webView.getSettings().setDomStorageEnabled(true);
            if (i2 >= 17) {
                WebSettings settings = webView.getSettings();
                if (webViewActivityParameters.auto_play_media) {
                    z = false;
                }
                settings.setMediaPlaybackRequiresUserGesture(z);
            }
            String str = webViewActivityParameters.script_handler_name;
            if (str != null && str.length() > 0) {
                webView.addJavascriptInterface(new _WebViewJavaScriptHandler(webViewActivityParameters.id), webViewActivityParameters.script_handler_name);
            }
            webView.setBackgroundColor(0);
            if (i2 >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            if (b.a("FORCE_DARK")) {
                a.b(webView.getSettings(), 0);
            }
            webView.setWebViewClient(new _UnityWebViewClient(webViewActivityParameters.id));
            _UnityWebChromeClient _unitywebchromeclient = new _UnityWebChromeClient(webViewActivityParameters.id);
            webViewStatus.WebChromeClient = _unitywebchromeclient;
            webView.setWebChromeClient(_unitywebchromeclient);
            webView.loadUrl(webViewActivityParameters.url);
            webView.onResume();
            webView.resumeTimers();
        } catch (Throwable unused) {
        }
        setStatus(webViewActivityParameters.id, webViewStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _reload(int i2) {
        WebView webView = getWebView(i2);
        if (webView != null) {
            try {
                webView.reload();
            } catch (Throwable th) {
                Log(i2, "@_reload()", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent _runJavaScript(final JavaScriptInvoke javaScriptInvoke) {
        WebView webView = getWebView(javaScriptInvoke.webViewId);
        LogExtra(javaScriptInvoke.webViewId, "@runJavaScript(): execute " + javaScriptInvoke.callback + ": " + javaScriptInvoke.webViewId);
        if (webView == null) {
            return _intentJavaScriptErrorToUnity(javaScriptInvoke.webViewId, JavaScriptResult.ERROR_NO_WEB_VIEW + javaScriptInvoke.webViewId, javaScriptInvoke.callback, javaScriptInvoke.id);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            return _intentJavaScriptErrorToUnity(javaScriptInvoke.webViewId, JavaScriptResult.ERROR_API_LEVEL_TOO_LOW + i2, javaScriptInvoke.callback, javaScriptInvoke.id);
        }
        try {
            LogExtra(javaScriptInvoke.webViewId, "?evaluateJavascript()");
            webView.evaluateJavascript(javaScriptInvoke.code, new ValueCallback<String>() { // from class: com.garena.unity.webview.UnityWebViewActivity.9
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    try {
                        String str2 = javaScriptInvoke.callback;
                        if (str2 == null || str2.length() <= 0) {
                            return;
                        }
                        UnityWebViewActivity.this.LogExtra(javaScriptInvoke.webViewId, "@evaluateJavascript.ValueCallback(): " + str);
                        UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                        JavaScriptInvoke javaScriptInvoke2 = javaScriptInvoke;
                        unityWebViewActivity._sendToUnityActivity(unityWebViewActivity._intentJavaScriptResultToUnity(javaScriptInvoke2.webViewId, str, javaScriptInvoke2.callback, javaScriptInvoke2.id));
                    } catch (Throwable th) {
                        UnityWebViewActivity.this.LogExtra(javaScriptInvoke.webViewId, "@evaluateJavascript.ValueCallback()", th);
                        UnityWebViewActivity unityWebViewActivity2 = UnityWebViewActivity.this;
                        int i3 = javaScriptInvoke.webViewId;
                        String message = th.getMessage();
                        JavaScriptInvoke javaScriptInvoke3 = javaScriptInvoke;
                        unityWebViewActivity2._sendToUnityActivity(unityWebViewActivity2._intentJavaScriptErrorToUnity(i3, message, javaScriptInvoke3.callback, javaScriptInvoke3.id));
                    }
                }
            });
            LogExtra(javaScriptInvoke.webViewId, "!evaluateJavascript()");
            return null;
        } catch (Throwable th) {
            LogExtra(javaScriptInvoke.webViewId, "@evaluateJavascript()", th);
            return _intentJavaScriptErrorToUnity(javaScriptInvoke.webViewId, th.getMessage(), javaScriptInvoke.callback, javaScriptInvoke.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _sendToUnity(int i2, String str, String str2) {
        _sendToUnityActivity(_intentToUnity(i2, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _sendToUnityActivity(Intent intent) {
        LogIntent("send to UnityPlayerActivity", intent);
        if (intent != null) {
            sendBroadcast(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _show(int i2) {
        WebView webView;
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            status.Hiding = false;
            if (status.DeferringDisplay || (webView = getWebView(i2)) == null) {
                return;
            }
            try {
                webView.onResume();
                webView.resumeTimers();
            } catch (Throwable th) {
                Log(i2, "@_show()", th);
            }
            webView.setVisibility(0);
            webView.requestFocus();
        }
    }

    private void calculateWebViewLayoutParams(WebViewStatus webViewStatus, FrameLayout.LayoutParams layoutParams) {
        int i2;
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView().getRootView();
        float measuredWidth = frameLayout.getMeasuredWidth();
        float measuredHeight = frameLayout.getMeasuredHeight();
        if (Build.VERSION.SDK_INT < 30 || this._SystemBarsWindowInsets == null) {
            layoutParams.leftMargin = (int) (webViewStatus.x * measuredWidth);
            i2 = (int) (webViewStatus.y * measuredHeight);
        } else {
            if (_DebugLog) {
                Log.i(LOG_TAG, "calculateWebViewLayoutParams: " + measuredWidth + " * " + measuredHeight);
                StringBuilder sb = new StringBuilder();
                sb.append("calculateWebViewLayoutParams: ");
                sb.append(this._SystemBarsWindowInsets.toString());
                Log.i(LOG_TAG, sb.toString());
            }
            Insets insets = this._SystemBarsWindowInsets;
            int i3 = insets.left;
            measuredWidth -= insets.right + i3;
            int i4 = insets.top;
            int i5 = insets.bottom;
            measuredHeight -= i4 + i5;
            layoutParams.leftMargin = (int) ((webViewStatus.x * measuredWidth) + i3);
            i2 = (int) ((webViewStatus.y * measuredHeight) + i5);
        }
        layoutParams.bottomMargin = i2;
        layoutParams.width = (int) (webViewStatus.w * measuredWidth);
        layoutParams.height = (int) (webViewStatus.f832h * measuredHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebView getWebView(int i2) {
        return this._WebViews.get(Integer.valueOf(i2));
    }

    private boolean isShowingCustomView() {
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

    private void ping() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (UnityWebViewActivity.this._PingEcho) {
                    return;
                }
                UnityWebViewActivity.this._finish();
            }
        }, 1000L);
        this._PingEcho = false;
        _sendToUnityActivity(_intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.PING_REQ));
    }

    private boolean processBackPressed() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void processIntent(Intent intent) {
        IntentExecutor intentExecutor;
        if (intent != null) {
            try {
                if (intent.hasExtra(UnityWebViewActivityProxy.IntentExtras.DEBUG_LOG)) {
                    _DebugLog = intent.getBooleanExtra(UnityWebViewActivityProxy.IntentExtras.DEBUG_LOG, false);
                }
                if (intent.hasExtra(UnityWebViewActivityProxy.IntentExtras.WEB_CONTENT_DEBUGGING)) {
                    _WebContentDebugging = intent.getBooleanExtra(UnityWebViewActivityProxy.IntentExtras.WEB_CONTENT_DEBUGGING, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (intent != null) {
            synchronized (this.queuedIntents) {
                LogIntent("queued intent", intent);
                this.queuedIntents.addLast(intent);
            }
        }
        if (this.canHandleIntent) {
            synchronized (this.queuedIntents) {
                while (!this.queuedIntents.isEmpty()) {
                    Intent intentPollFirst = this.queuedIntents.pollFirst();
                    String action = intentPollFirst.getAction();
                    if (action != null && (intentExecutor = this._UnityToWebViewIntentExecutors.get(action)) != null) {
                        _sendToUnityActivity(intentExecutor.onIntent(intentPollFirst));
                    }
                }
                if (this._WebViews.isEmpty()) {
                    _finish();
                }
            }
        }
    }

    private void redoRootLayout() {
        final FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView().getRootView();
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.garena.unity.webview.UnityWebViewActivity.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                frameLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                UnityWebViewActivity.this.redoWebViewLayouts();
            }
        });
        frameLayout.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redoWebViewLayouts() {
        Iterator<Integer> it = this._WebViews.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            WebViewStatus status = getStatus(iIntValue);
            if (status != null) {
                WebView webView = getWebView(iIntValue);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                calculateWebViewLayoutParams(status, layoutParams);
                webView.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setStatus(int i2, WebViewStatus webViewStatus) {
        synchronized (this._WebViewStatuses) {
            this._WebViewStatuses.put(Integer.valueOf(i2), webViewStatus);
            Intent intent_intentToUnityActivity = _intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.UPDATE_STATUS);
            intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_ID, i2);
            intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.WEB_VIEW_STATUS, webViewStatus);
            _sendToUnityActivity(intent_intentToUnityActivity);
        }
    }

    private void setSystemUiVisibility() {
        try {
            getWindow().setFlags(1024, 1024);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 16 || i2 >= 30) {
                if (i2 >= 30) {
                    getWindow().setDecorFitsSystemWindows(false);
                    getWindow().getInsetsController().hide(WindowInsets.Type.systemBars());
                    getWindow().getInsetsController().setSystemBarsBehavior(2);
                    return;
                }
                return;
            }
            SYSTEM_UI_VISIBILITY = 1798;
            if (i2 >= 19) {
                SYSTEM_UI_VISIBILITY = 1798 | Utils.CONTINUOUS_EVENT;
            }
            View decorView = getWindow().getDecorView();
            getWindow().getDecorView().setSystemUiVisibility(SYSTEM_UI_VISIBILITY);
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.garena.unity.webview.UnityWebViewActivity.4
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public void onSystemUiVisibilityChange(int i3) {
                    if ((i3 & 4) == 0) {
                        UnityWebViewActivity.this.getWindow().getDecorView().setSystemUiVisibility(UnityWebViewActivity.SYSTEM_UI_VISIBILITY);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public synchronized WebViewStatus getStatus(int i2) {
        WebViewStatus webViewStatus;
        synchronized (this._WebViewStatuses) {
            webViewStatus = this._WebViewStatuses.get(Integer.valueOf(i2));
        }
        return webViewStatus;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 8226) {
            return;
        }
        UnityWebChromeClient.OnFileChooserResult(i2, i3, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().getDecorView().getRootView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.garena.unity.webview.UnityWebViewActivity.2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    UnityWebViewActivity.this._SystemBarsWindowInsets = windowInsets.getInsets(WindowInsets.Type.systemBars());
                    if (UnityWebViewActivity._DebugLog) {
                        Log.i(UnityWebViewActivity.LOG_TAG, "onApplyWindowInsets: _SystemBarsWindowInsets: " + UnityWebViewActivity.this._SystemBarsWindowInsets.toString());
                    }
                    if (UnityWebViewActivity.this.hasWindowFocus()) {
                        UnityWebViewActivity.this.redoWebViewLayouts();
                    }
                    return WindowInsets.CONSUMED;
                }
            });
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (isShowingCustomView()) {
            return;
        }
        _sendToUnityActivity(_intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.BACK_PRESSED_RELAY));
        _finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (_DebugLog) {
            int i2 = configuration.orientation;
            String str = i2 == 1 ? "portrait" : "";
            if (i2 == 2) {
                str = "landscape";
            }
            Log.i(LOG_TAG, "onConfigurationChanged: orientation: " + str);
            Log.i(LOG_TAG, "onConfigurationChanged: screen: " + configuration.screenWidthDp + " * " + configuration.screenHeightDp);
        }
        redoRootLayout();
        Intent intent_intentToUnityActivity = _intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.ON_CONFIGURATION_CHANGED);
        intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.CONFIGURATION, configuration);
        _sendToUnityActivity(intent_intentToUnityActivity);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        super.onCreate(bundle);
        ((FrameLayout) getWindow().getDecorView().getRootView()).setOnTouchListener(this.FrameLayoutTouchListener);
        _UserFinish = false;
        if (_DebugLog) {
            Log.i(LOG_TAG, "onCreate");
        }
        if (i2 >= 28) {
            try {
                WebView.setDataDirectorySuffix(Application.getProcessName());
            } catch (IllegalStateException unused) {
            }
        }
        if (i2 >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        setContentView(getApplicationContext().getResources().getIdentifier("activity_unity_web_view", "layout", getApplicationContext().getPackageName()));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.PING_RESP);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.TEST);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.CLEAR_ALL);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.OPEN);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.CLOSE);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.CLOSE_ALL);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.RELOAD);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.SHOW);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.HIDE);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.RUN_JAVASCRIPT);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.CAN_GO_BACKWARD);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.CAN_GO_FORWARD);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.GO_BACKWARD);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.GO_FORWARD);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.CAPTURE_SCREENSHOT);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.GET_USER_AGENT_STRING);
        intentFilter.addAction(UnityWebViewActivityProxy.IntentActions.SET_USER_AGENT_STRING);
        registerReceiver(this._UnityToWebViewBroadcastReceiver, intentFilter);
        Intent intent = getIntent();
        processIntent(intent);
        LogIntent("onCreate", intent);
        getWindow().getDecorView().getRootView().post(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewActivity.1
            @Override // java.lang.Runnable
            public void run() {
                UnityWebViewActivity.this.canHandleIntent = true;
                UnityWebViewActivity unityWebViewActivity = UnityWebViewActivity.this;
                unityWebViewActivity._sendToUnityActivity(unityWebViewActivity._intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.READY));
                UnityWebViewActivity.this.processIntent(null);
            }
        });
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (_DebugLog) {
            Log.i(LOG_TAG, "onDestroy");
        }
        unregisterReceiver(this._UnityToWebViewBroadcastReceiver);
        _closeAll();
        Intent intent_intentToUnityActivity = _intentToUnityActivity(UnityWebViewActivityProxy.IntentActions.CLOSE_ALL);
        intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.ACTIVITY_PID, Process.myPid());
        intent_intentToUnityActivity.putExtra(UnityWebViewActivityProxy.IntentExtras.FORCE, !_UserFinish);
        _sendToUnityActivity(intent_intentToUnityActivity);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogIntent("onNewIntent", intent);
        processIntent(intent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (_DebugLog) {
            Log.i(LOG_TAG, "onPause");
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        if (_DebugLog) {
            Log.i(LOG_TAG, "onResume");
        }
        redoWebViewLayouts();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
        if (_DebugLog) {
            Log.i(LOG_TAG, "onStart");
        }
        redoWebViewLayouts();
        for (Map.Entry<Integer, WebView> entry : this._WebViews.entrySet()) {
            WebView value = entry.getValue();
            WebViewStatus status = getStatus(entry.getKey().intValue());
            if (value != null && status != null && !status.Hiding) {
                try {
                    value.onResume();
                    value.resumeTimers();
                } catch (Throwable th) {
                    Log(entry.getKey().intValue(), "@onUnityWebViewActivityStart(): " + entry.getKey(), th);
                }
            }
        }
        ping();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (_DebugLog) {
            Log.i(LOG_TAG, "onStop");
        }
        for (Map.Entry<Integer, WebView> entry : this._WebViews.entrySet()) {
            WebView value = entry.getValue();
            WebViewStatus status = getStatus(entry.getKey().intValue());
            if (value != null && status != null && !status.Hiding) {
                try {
                    value.onPause();
                    value.pauseTimers();
                } catch (Throwable th) {
                    Log(entry.getKey().intValue(), "@onUnityWebViewActivityStop(): " + entry.getKey(), th);
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (_DebugLog) {
            Log.i(LOG_TAG, "onWindowFocusChanged: " + z);
        }
        if (z) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 16 && i2 < 30) {
                    getWindow().getDecorView().setSystemUiVisibility(SYSTEM_UI_VISIBILITY);
                } else if (i2 >= 30) {
                    getWindow().setDecorFitsSystemWindows(false);
                    getWindow().getInsetsController().hide(WindowInsets.Type.systemBars());
                    getWindow().getInsetsController().setSystemBarsBehavior(2);
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            redoWebViewLayouts();
        }
    }
}
