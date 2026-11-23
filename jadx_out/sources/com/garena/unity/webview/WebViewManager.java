package com.garena.unity.webview;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class WebViewManager {
    public static final int WEB_VIEW_INTENT_REQUEST_CODE = 546;
    private static String _NameInJavaScript;
    private static IUnityWebViewProxy _Proxy;
    private static boolean _SendConsoleMessagesToUnity;
    private static Activity _UnityActivity;
    private static IUnityMessenger _UnityMessenger;
    private static String _UnitySendMessageGameObjectName;
    private static boolean _UseActivity;

    public static void Log(String str) {
        __sendToUnity(IUnityWebViewProxy.UnityCallbacks.LOG_MESSAGE, str);
    }

    public static void Log(String str, Throwable th) {
        __sendToUnity(IUnityWebViewProxy.UnityCallbacks.LOG_MESSAGE, str + ": " + th.getClass().getName() + ": " + th.getMessage());
    }

    public static boolean RunOnUiThread(Runnable runnable) {
        Activity activity = _UnityActivity;
        if (activity == null) {
            return false;
        }
        activity.runOnUiThread(runnable);
        return true;
    }

    static void __sendToUnity(String str, String str2) {
        IUnityMessenger iUnityMessenger;
        String str3 = _UnitySendMessageGameObjectName;
        if (str3 == null || str3.length() <= 0 || (iUnityMessenger = _UnityMessenger) == null) {
            return;
        }
        iUnityMessenger.Send(_UnitySendMessageGameObjectName, str, str2);
    }

    public static boolean canClearCache() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.canClearCache();
        }
        return false;
    }

    public static boolean canClearCookies() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.canClearCookies();
        }
        return false;
    }

    public static void canGoBackward(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.canGoBackward(i2);
        }
    }

    public static void canGoForward(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.canGoForward(i2);
        }
    }

    public static boolean captureScreenshot(int i2, String str) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.captureScreenshot(i2, str);
        }
        return false;
    }

    public static void clearCache() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.clearCache();
        }
    }

    public static void clearCookies() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.clearCookies();
        }
    }

    public static void clearData() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.clearData();
        }
    }

    public static void close(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.close(i2);
        }
    }

    public static void closeAll() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.closeAll();
        }
    }

    public static void configure(boolean z) {
        if (_UseActivity != z || _Proxy == null) {
            _UseActivity = z;
            IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
            if (iUnityWebViewProxy != null) {
                iUnityWebViewProxy.destroy();
                _Proxy = null;
            }
            if (_Proxy == null) {
                IUnityWebViewProxy iUnityWebViewProxyI = _UseActivity ? UnityWebViewActivityProxy.I() : UnityWebViewProxy.I();
                _Proxy = iUnityWebViewProxyI;
                iUnityWebViewProxyI.init(_UnityActivity);
                _Proxy.setUnityMessenger(_UnityMessenger);
            }
        }
    }

    public static double getLoadingProgress(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.getLoadingProgress(i2);
        }
        return 0.0d;
    }

    public static String getNameInJavaScript() {
        return _NameInJavaScript;
    }

    public static boolean getSendConsoleMessagesToUnity() {
        return _SendConsoleMessagesToUnity;
    }

    public static String getURL(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        return iUnityWebViewProxy != null ? iUnityWebViewProxy.getUrl(i2) : "";
    }

    public static void getUserAgentString(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.getUserAgentString(i2);
        }
    }

    public static void goBackward(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.goBackward(i2);
        }
    }

    public static void goForward(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.goForward(i2);
        }
    }

    public static void hide(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.hide(i2);
        }
    }

    public static boolean ignoreActivityWindowFocusChanged() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.ignoreUnityPlayerActivityWindowFocusChanged();
        }
        return false;
    }

    public static boolean isLoading(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.isLoading(i2);
        }
        return false;
    }

    public static boolean isShowingCustomView() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null && (iUnityWebViewProxy instanceof UnityWebViewProxy)) {
            return ((UnityWebViewProxy) iUnityWebViewProxy).isShowingCustomView();
        }
        return false;
    }

    public static void move(int i2, float f, float f2, float f3, float f4) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.move(i2, f, f2, f3, f4);
        }
    }

    public static void onActivityCreate(Activity activity) {
        _UnityActivity = activity;
    }

    public static void onActivityDestroy(Activity activity) {
        _UnityActivity = null;
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.onUnityPlayerActivityDestroy(activity);
        }
    }

    public static void onActivityPause(Activity activity) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.onUnityPlayerActivityPause(activity);
        }
    }

    public static void onActivityResult(int i2, int i3, Intent intent) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null && (iUnityWebViewProxy instanceof UnityWebViewProxy) && i2 == 8226) {
            UnityWebChromeClient.OnFileChooserResult(i2, i3, intent);
        }
    }

    public static void onActivityResume(Activity activity) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.onUnityPlayerActivityResume(activity);
        }
    }

    public static void onActivityStart(Activity activity) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.onUnityPlayerActivityStart(activity);
        }
    }

    public static void onActivityStop(Activity activity) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.onUnityPlayerActivityStop(activity);
        }
    }

    public static boolean onBackPressed(Activity activity) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null && (iUnityWebViewProxy instanceof UnityWebViewProxy)) {
            return ((UnityWebViewProxy) iUnityWebViewProxy).onUnityPlayerActivityBackPressed();
        }
        return false;
    }

    public static int open(String str, float f, float f2, float f3, float f4, String str2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.open(str, f, f2, f3, f4, str2);
        }
        return -1;
    }

    public static void reload(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.reload(i2);
        }
    }

    public static void runJavaScript(int i2, String str, String str2, String str3) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.runJavaScript(i2, str, str2, str3);
        }
    }

    public static void setNameInJavaScript(String str) {
        _NameInJavaScript = str;
    }

    public static void setSendConsoleMessagesToUnity(boolean z) {
        _SendConsoleMessagesToUnity = z;
    }

    public static void setUnityMessenger(IUnityMessenger iUnityMessenger) {
        _UnityMessenger = iUnityMessenger;
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.setUnityMessenger(iUnityMessenger);
        }
    }

    public static void setUnitySendMessageGameObjectName(String str) {
        _UnitySendMessageGameObjectName = str;
    }

    public static void setUserAgentString(int i2, String str) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.setUserAgentString(i2, str);
        }
    }

    public static void setWebContentDebuggingEnabled(boolean z) {
        UnityWebViewProxy.WebContentDebugging = z;
        UnityWebViewActivityProxy.WebContentDebugging = z;
    }

    public static void setWebViewActivityDebugLog(boolean z) {
        UnityWebViewActivityProxy.SetDebugLog(z);
    }

    public static void show(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.show(i2);
        }
    }

    public static boolean showing(int i2) {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            return iUnityWebViewProxy.isShowing(i2);
        }
        return false;
    }

    public static void test() {
        _Proxy.test();
    }

    public static void webStorage_DeleteAllData() {
        IUnityWebViewProxy iUnityWebViewProxy = _Proxy;
        if (iUnityWebViewProxy != null) {
            iUnityWebViewProxy.webStorage_DeleteAllData();
        }
    }
}
