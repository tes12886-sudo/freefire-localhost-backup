package com.garena.unity.webview;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.unity3d.player.UnityPlayerActivity;
import j.d.d.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class UnityWebViewActivityProxy implements IUnityWebViewProxy {
    private static final String BROADCAST_RECEIVER_LOG = "recv by UnityPlayerActivity";
    private static final String LOG_TAG = "UWVActivityProxy";
    public static final int REQUEST_CODE_UNITY_WEB_VIEW_ACTIVITY = 3003;
    public static volatile boolean WebContentDebugging;
    private static boolean _DebugLog;
    private static volatile UnityWebViewActivityProxy _I;
    private IUnityMessenger _UnityMessenger;
    private Activity _UnityPlayerActivity;
    private final HashMap<String, BroadcastReceiver> _WebViewToUnityBroadcastReceivers = new AnonymousClass1();
    private final e gson = new e();
    private volatile HashMap<Integer, WebViewStatus> _WebViewStatuses = new HashMap<>();
    private volatile boolean _WebViewActivityRunning = false;
    private volatile boolean _WebViewActivityPresent = false;
    private LinkedList<Intent> _pendingIntentsToWebViewActivity = new LinkedList<>();
    private volatile int _NextWebViewId = 0;

    /* JADX INFO: renamed from: com.garena.unity.webview.UnityWebViewActivityProxy$1, reason: invalid class name */
    class AnonymousClass1 extends HashMap<String, BroadcastReceiver> {
        AnonymousClass1() {
            put(IntentActions.PING_REQ, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    UnityWebViewActivityProxy.this._sendIntentToWebView(IntentActions.PING_RESP, -1);
                }
            });
            put(IntentActions.READY, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    UnityWebViewActivityProxy.this._onWebViewActivityReady();
                }
            });
            put(IntentActions.TEST_RESULT, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    WebViewManager.__sendToUnity(IUnityWebViewProxy.UnityCallbacks.TEST_RESULT, intent.getBooleanExtra(IntentExtras.RETURN_VALUE, false) + "");
                }
            });
            put(IntentActions.ON_TOUCH_RELAY, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.4
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    intent.setExtrasClassLoader(MotionEvent.class.getClassLoader());
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    MotionEvent motionEvent = (MotionEvent) intent.getParcelableExtra(IntentExtras.MOTION_EVENT);
                    if (UnityWebViewActivityProxy.this._UnityPlayerActivity != null) {
                        UnityWebViewActivityProxy.this._UnityPlayerActivity.onTouchEvent(motionEvent);
                    }
                }
            });
            put(IntentActions.ON_CONFIGURATION_CHANGED, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    intent.setExtrasClassLoader(Configuration.class.getClassLoader());
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    Configuration configuration = (Configuration) intent.getParcelableExtra(IntentExtras.CONFIGURATION);
                    if (UnityWebViewActivityProxy.this._UnityPlayerActivity != null) {
                        UnityWebViewActivityProxy.this._UnityPlayerActivity.onConfigurationChanged(configuration);
                    }
                }
            });
            put(IntentActions.SEND_TO_UNITY, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.6
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    UnityWebViewActivityProxy.this.sendToUnity(intent.getIntExtra(IntentExtras.WEB_VIEW_ID, -1), intent.getStringExtra(IntentExtras.UNITY_METHOD), intent.getStringExtra(IntentExtras.UNITY_METHOD_PARAMETERS));
                }
            });
            put(IntentActions.UPDATE_STATUS, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.7
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    intent.setExtrasClassLoader(WebViewStatus.class.getClassLoader());
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    UnityWebViewActivityProxy.this.updateWebViewStatus(intent.getIntExtra(IntentExtras.WEB_VIEW_ID, -1), (WebViewStatus) intent.getParcelableExtra(IntentExtras.WEB_VIEW_STATUS));
                }
            });
            put(IntentActions.BACK_PRESSED_RELAY, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.8
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    if (UnityWebViewActivityProxy.this._UnityPlayerActivity != null) {
                        UnityWebViewActivityProxy.this._UnityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                UnityWebViewActivityProxy.this._UnityPlayerActivity.dispatchKeyEvent(new KeyEvent(0, 4));
                                UnityWebViewActivityProxy.this._UnityPlayerActivity.dispatchKeyEvent(new KeyEvent(1, 4));
                            }
                        });
                    }
                }
            });
            put(IntentActions.CLOSE_ALL, new BroadcastReceiver() { // from class: com.garena.unity.webview.UnityWebViewActivityProxy.1.9
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    UnityWebViewActivityProxy.LogIntent(UnityWebViewActivityProxy.BROADCAST_RECEIVER_LOG, intent);
                    UnityWebViewActivityProxy.this._UnityPlayerActivity.overridePendingTransition(0, 0);
                    int intExtra = intent.getIntExtra(IntentExtras.ACTIVITY_PID, 0);
                    if (intExtra > 0) {
                        try {
                            Process.killProcess(intExtra);
                        } catch (Throwable th) {
                            Log.e(UnityWebViewActivityProxy.LOG_TAG, "kill pid " + intExtra, th);
                        }
                    }
                    synchronized (this) {
                        UnityWebViewActivityProxy.this._WebViewActivityRunning = false;
                        UnityWebViewActivityProxy.this._WebViewActivityPresent = false;
                    }
                    if (UnityWebViewActivityProxy.this._UnityPlayerActivity != null && (UnityWebViewActivityProxy.this._UnityPlayerActivity instanceof UnityPlayerActivity)) {
                        ((UnityPlayerActivity) UnityWebViewActivityProxy.this._UnityPlayerActivity).setUseStartStopInsteadOfPauseResume(false);
                    }
                    if (intent.getBooleanExtra(IntentExtras.FORCE, false)) {
                        WebViewManager.__sendToUnity(IUnityWebViewProxy.UnityCallbacks.FORCE_CLOSE_ALL, "");
                    }
                }
            });
        }
    }

    public class IntentActions {
        public static final String BACK_PRESSED_RELAY = "back_pressed";
        public static final String CAN_GO_BACKWARD = "can_go_backward";
        public static final String CAN_GO_FORWARD = "can_go_forward";
        public static final String CAPTURE_SCREENSHOT = "capture_screenshot";
        public static final String CLEAR_ALL = "clear_all";
        public static final String CLOSE = "close";
        public static final String CLOSE_ALL = "close_all";
        public static final String GET_USER_AGENT_STRING = "get_ua";
        public static final String GO_BACKWARD = "go_backward";
        public static final String GO_FORWARD = "go_forward";
        public static final String HIDE = "hide";
        public static final String ON_CONFIGURATION_CHANGED = "on_configuration_changed";
        public static final String ON_TOUCH_RELAY = "on_touch";
        public static final String OPEN = "open";
        public static final String PING_REQ = "ping_req";
        public static final String PING_RESP = "ping_resp";
        public static final String READY = "ready";
        public static final String RELOAD = "reload";
        public static final String RUN_JAVASCRIPT = "run_javascript";
        public static final String SEND_TO_UNITY = "send_to_unity";
        public static final String SET_USER_AGENT_STRING = "set_ua";
        public static final String SHOW = "show";
        public static final String TEST = "test";
        public static final String TEST_RESULT = "test_result";
        public static final String UPDATE_STATUS = "update_status";

        public IntentActions() {
        }
    }

    public class IntentExtras {
        public static final String ACTIVITY_PID = "activity_pid";
        public static final String CONFIGURATION = "configuration";
        public static final String DEBUG_LOG = "debug_log";
        public static final String FILE_NAME = "file_name";
        public static final String FORCE = "force";
        public static final String JAVASCRIPT_INVOKE = "javascript_invoke";
        public static final String MOTION_EVENT = "motion_event";
        public static final String RETURN_VALUE = "return_value";
        public static final String UNITY_METHOD = "unity_method";
        public static final String UNITY_METHOD_PARAMETERS = "unity_method_parameters";
        public static final String USER_AGENT_STRING = "ua";
        public static final String WEB_CONTENT_DEBUGGING = "content_debugging";
        public static final String WEB_VIEW_ID = "web_view_id";
        public static final String WEB_VIEW_PARAMETERS = "web_view_parameters";
        public static final String WEB_VIEW_STATUS = "web_view_status";

        public IntentExtras() {
        }
    }

    private UnityWebViewActivityProxy() {
    }

    public static synchronized UnityWebViewActivityProxy I() {
        if (_I == null) {
            _I = new UnityWebViewActivityProxy();
        }
        return _I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LogIntent(String str, Intent intent) {
        if (_DebugLog) {
            Log.i(LOG_TAG, String.format("%s: action %s", str, intent.getAction()));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    Log.i(LOG_TAG, String.format("%s: %s %s", str, str2, extras.get(str2)));
                }
            }
        }
    }

    private synchronized int NewWebViewId() {
        this._NextWebViewId++;
        return this._NextWebViewId;
    }

    public static void SetDebugLog(boolean z) {
        _DebugLog = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void _onWebViewActivityReady() {
        if (this._UnityPlayerActivity == null) {
            return;
        }
        synchronized (this) {
            this._WebViewActivityRunning = true;
            this._WebViewActivityPresent = true;
            synchronized (this._pendingIntentsToWebViewActivity) {
                while (!this._pendingIntentsToWebViewActivity.isEmpty()) {
                    Intent intentPollFirst = this._pendingIntentsToWebViewActivity.pollFirst();
                    LogIntent("send queued to WebViewActivity", intentPollFirst);
                    this._UnityPlayerActivity.sendBroadcast(intentPollFirst);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void _sendIntentToWebView(String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(IntentExtras.WEB_VIEW_ID, i2);
        _sendIntentToWebViewActivity(str, bundle, false);
    }

    private synchronized void _sendIntentToWebViewActivity(String str, Bundle bundle, boolean z) {
        if (this._UnityPlayerActivity == null) {
            return;
        }
        synchronized (this) {
            if (_DebugLog) {
                Log.i(LOG_TAG, "_sendIntentToWebViewActivity: running: " + this._WebViewActivityRunning);
                Log.i(LOG_TAG, "_sendIntentToWebViewActivity: present: " + this._WebViewActivityPresent);
            }
            if (this._WebViewActivityRunning) {
                Intent intent = new Intent(str);
                intent.setPackage(this._UnityPlayerActivity.getApplicationContext().getPackageName());
                intent.putExtra(IntentExtras.DEBUG_LOG, _DebugLog);
                intent.putExtra(IntentExtras.WEB_CONTENT_DEBUGGING, WebContentDebugging);
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                if (this._WebViewActivityPresent) {
                    LogIntent("broadcast to WebViewActivity", intent);
                    this._UnityPlayerActivity.sendBroadcast(intent);
                } else {
                    synchronized (this._pendingIntentsToWebViewActivity) {
                        LogIntent("queued for WebViewActivity", intent);
                        this._pendingIntentsToWebViewActivity.addLast(intent);
                    }
                }
            } else if (z) {
                Intent intent2 = new Intent(this._UnityPlayerActivity, (Class<?>) UnityWebViewActivity.class);
                intent2.setAction(str);
                intent2.putExtra(IntentExtras.DEBUG_LOG, _DebugLog);
                intent2.putExtra(IntentExtras.WEB_CONTENT_DEBUGGING, WebContentDebugging);
                if (bundle != null) {
                    intent2.putExtras(bundle);
                }
                Activity activity = this._UnityPlayerActivity;
                if (activity instanceof UnityPlayerActivity) {
                    ((UnityPlayerActivity) activity).setUseStartStopInsteadOfPauseResume(true);
                }
                this._WebViewActivityRunning = true;
                LogIntent("start WebViewActivity", intent2);
                this._UnityPlayerActivity.startActivity(intent2);
                this._UnityPlayerActivity.overridePendingTransition(0, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateWebViewStatus(int i2, WebViewStatus webViewStatus) {
        synchronized (this._WebViewStatuses) {
            this._WebViewStatuses.put(Integer.valueOf(i2), webViewStatus);
        }
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
        return false;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean canClearCookies() {
        return false;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void canGoBackward(int i2) {
        _sendIntentToWebView(IntentActions.CAN_GO_BACKWARD, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void canGoForward(int i2) {
        _sendIntentToWebView(IntentActions.CAN_GO_FORWARD, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean captureScreenshot(int i2, String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(IntentExtras.WEB_VIEW_ID, i2);
        bundle.putString(IntentExtras.FILE_NAME, str);
        _sendIntentToWebViewActivity(IntentActions.CAPTURE_SCREENSHOT, bundle, false);
        return true;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void clearCache() {
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void clearCookies() {
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void clearData() {
        _sendIntentToWebViewActivity(IntentActions.CLEAR_ALL, null, true);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void close(int i2) {
        updateWebViewStatus(i2, null);
        _sendIntentToWebView(IntentActions.CLOSE, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void closeAll() {
        _sendIntentToWebViewActivity(IntentActions.CLOSE_ALL, null, false);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void destroy() {
        if (_DebugLog) {
            Log.i(LOG_TAG, "UnityPlayerActivity.onDestroy()!!!");
        }
        if (this._UnityPlayerActivity != null) {
            Iterator<String> it = this._WebViewToUnityBroadcastReceivers.keySet().iterator();
            while (it.hasNext()) {
                this._UnityPlayerActivity.unregisterReceiver(this._WebViewToUnityBroadcastReceivers.get(it.next()));
            }
            closeAll();
            this._UnityPlayerActivity = null;
            this._UnityMessenger = null;
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
        WebViewStatus webViewStatus;
        synchronized (this._WebViewStatuses) {
            webViewStatus = this._WebViewStatuses.get(Integer.valueOf(i2));
        }
        return webViewStatus;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public String getUrl(int i2) {
        WebViewStatus status = getStatus(i2);
        return status != null ? status.Url : "";
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void getUserAgentString(int i2) {
        _sendIntentToWebView(IntentActions.GET_USER_AGENT_STRING, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void goBackward(int i2) {
        _sendIntentToWebView(IntentActions.GO_BACKWARD, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void goForward(int i2) {
        _sendIntentToWebView(IntentActions.GO_FORWARD, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void hide(int i2) {
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            status.Hiding = true;
            updateWebViewStatus(i2, status);
        }
        _sendIntentToWebView(IntentActions.HIDE, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public boolean ignoreUnityPlayerActivityWindowFocusChanged() {
        return this._WebViewActivityRunning;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void init(Activity activity) {
        this._UnityPlayerActivity = activity;
        if (activity != null) {
            for (String str : this._WebViewToUnityBroadcastReceivers.keySet()) {
                this._UnityPlayerActivity.registerReceiver(this._WebViewToUnityBroadcastReceivers.get(str), new IntentFilter(str));
            }
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
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            return !status.Hiding;
        }
        return false;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void move(int i2, float f, float f2, float f3, float f4) {
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
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void onUnityPlayerActivityStop(Activity activity) {
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public int open(String str, float f, float f2, float f3, float f4, String str2) {
        if (this._UnityPlayerActivity == null) {
            return -1;
        }
        int iNewWebViewId = NewWebViewId();
        WebViewStatus webViewStatus = new WebViewStatus();
        updateWebViewStatus(iNewWebViewId, webViewStatus);
        webViewStatus.Url = str;
        webViewStatus.Opening = true;
        WebViewParameters webViewParameters = (str2 == null || str2.length() <= 0) ? new WebViewParameters() : (WebViewParameters) this.gson.k(str2, WebViewParameters.class);
        webViewStatus.ExtraLog = webViewParameters.ExtraLog;
        webViewStatus.UnitySendMessageGameObjectName = webViewParameters.UnitySendMessageGameObjectName;
        if (webViewParameters.DeferredDisplay) {
            webViewStatus.DeferredDisplay = true;
            webViewStatus.DeferringDisplay = true;
        }
        WebViewActivityParameters webViewActivityParameters = new WebViewActivityParameters(iNewWebViewId);
        webViewActivityParameters.id = iNewWebViewId;
        webViewActivityParameters.url = str;
        webViewActivityParameters.x = f;
        webViewActivityParameters.y = f2;
        webViewActivityParameters.w = f3;
        webViewActivityParameters.f831h = f4;
        webViewActivityParameters.script_handler_name = WebViewManager.getNameInJavaScript();
        webViewActivityParameters.merge(webViewParameters);
        Bundle bundle = new Bundle();
        bundle.putParcelable(IntentExtras.WEB_VIEW_PARAMETERS, webViewActivityParameters);
        _sendIntentToWebViewActivity(IntentActions.OPEN, bundle, true);
        return iNewWebViewId;
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void reload(int i2) {
        _sendIntentToWebView(IntentActions.RELOAD, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void runJavaScript(int i2, String str, String str2, String str3) {
        JavaScriptInvoke javaScriptInvoke = new JavaScriptInvoke();
        javaScriptInvoke.webViewId = i2;
        javaScriptInvoke.code = str;
        javaScriptInvoke.callback = str2;
        javaScriptInvoke.id = str3;
        Bundle bundle = new Bundle();
        bundle.putParcelable(IntentExtras.JAVASCRIPT_INVOKE, javaScriptInvoke);
        _sendIntentToWebViewActivity(IntentActions.RUN_JAVASCRIPT, bundle, false);
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
    public void setUserAgentString(int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(IntentExtras.WEB_VIEW_ID, i2);
        bundle.putString(IntentExtras.USER_AGENT_STRING, str);
        _sendIntentToWebViewActivity(IntentActions.SET_USER_AGENT_STRING, bundle, false);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void show(int i2) {
        WebViewStatus status = getStatus(i2);
        if (status != null) {
            status.Hiding = false;
            updateWebViewStatus(i2, status);
        }
        _sendIntentToWebView(IntentActions.SHOW, i2);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void test() {
        _sendIntentToWebViewActivity(IntentActions.TEST, null, true);
    }

    @Override // com.garena.unity.webview.IUnityWebViewProxy
    public void webStorage_DeleteAllData() {
    }
}
