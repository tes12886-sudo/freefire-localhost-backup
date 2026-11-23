package com.garena.unity.webview;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public interface IUnityWebViewProxy {

    public static class UnityCallbacks {
        public static final String CAN_GO_BACKWARD_RESULT = "CanGoBackwardResult";
        public static final String CAN_GO_FORWARD_RESULT = "CanGoForwardResult";
        public static final String CAPTURE_SCREENSHOT_FAILURE = "OnCaptureScreenshotFailure";
        public static final String CAPTURE_SCREENSHOT_SUCCESS = "OnCaptureScreenshotSuccess";
        public static final String CONSOLE_MESSAGE = "OnConsoleMessage_Android";
        public static final String FORCE_CLOSE_ALL = "ForceCloseAll";
        public static final String GET_USER_AGENT_STRING = "OnGetUserAgentString";
        public static final String JAVA_SCRIPT_POST_MESSAGE = "OnJavaScriptPostMessage";
        public static final String JAVA_SCRIPT_RESULT = "OnJavaScriptResult";
        public static final String LOG_MESSAGE = "OnWebViewMessage_Android";
        public static final String TEST_RESULT = "testResult";
    }

    void Log(int i2, String str);

    void Log(int i2, String str, Throwable th);

    void LogExtra(int i2, String str);

    void LogExtra(int i2, String str, Throwable th);

    boolean canClearCache();

    boolean canClearCookies();

    void canGoBackward(int i2);

    void canGoForward(int i2);

    boolean captureScreenshot(int i2, String str);

    void clearCache();

    void clearCookies();

    void clearData();

    void close(int i2);

    void closeAll();

    void destroy();

    double getLoadingProgress(int i2);

    WebViewStatus getStatus(int i2);

    String getUrl(int i2);

    void getUserAgentString(int i2);

    void goBackward(int i2);

    void goForward(int i2);

    void hide(int i2);

    boolean ignoreUnityPlayerActivityWindowFocusChanged();

    void init(Activity activity);

    boolean isLoading(int i2);

    boolean isShowing(int i2);

    void move(int i2, float f, float f2, float f3, float f4);

    void onUnityPlayerActivityDestroy(Activity activity);

    void onUnityPlayerActivityPause(Activity activity);

    void onUnityPlayerActivityResume(Activity activity);

    void onUnityPlayerActivityStart(Activity activity);

    void onUnityPlayerActivityStop(Activity activity);

    int open(String str, float f, float f2, float f3, float f4, String str2);

    void reload(int i2);

    void runJavaScript(int i2, String str, String str2, String str3);

    void sendToUnity(int i2, String str, String str2);

    void setUnityMessenger(IUnityMessenger iUnityMessenger);

    void setUserAgentString(int i2, String str);

    void show(int i2);

    void test();

    void webStorage_DeleteAllData();
}
