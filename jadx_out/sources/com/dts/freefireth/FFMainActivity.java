package com.dts.freefireth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.appff.haptic.base.Utils;
import com.beetalk.sdk.x.d;
import com.dts.freefireth.mambetwrapper.MambetWrapper;
import com.garena.pay.android.a;
import com.garena.sdkunity.SdkUnity;
import com.garena.unity.webview.WebViewManager;
import com.unity3d.player.UnityPlayer;
import j.d.d.e;

/* JADX INFO: loaded from: classes.dex */
public class FFMainActivity extends com.unity3d.player.UnityPlayerActivity {
    private static int SYSTEM_UI_VISIBILITY;
    private static boolean _FFDestroying;
    private String _LastScreenshotClue;
    private ContentObserver _ScreenshotContentObserver;
    private BroadcastReceiver watcherOfBattery;
    private BroadcastReceiver watcherOfWifi;
    private Object _GenericMotionEventListener = null;
    private CapturedPointerListener _CapturedPointerListener = null;

    private class CapturedPointerListener implements View.OnCapturedPointerListener {
        private CapturedPointerListener() {
        }

        @Override // android.view.View.OnCapturedPointerListener
        public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
            AndroidMouse.onCapturedPointer(motionEvent);
            return true;
        }
    }

    public static boolean FFDestroying() {
        return _FFDestroying;
    }

    public static void FFSendToUnity(String str, String str2, String str3) {
        String string;
        StringBuilder sb;
        String str4;
        if (UnityPlayer.currentActivity != null) {
            if (FFDestroying()) {
                sb = new StringBuilder();
                sb.append(str2);
                str4 = ": FFMainActivity.FFDestroying()!";
            } else if (str == null || str.length() <= 0) {
                string = "invalid gameObjectName!";
            } else {
                if (str2 != null && str2.length() > 0) {
                    UnityPlayer.UnitySendMessage(str, str2, str3);
                    return;
                }
                string = "invalid method!";
            }
            Log.w(FFAPI.LOG_TAG, string);
        }
        sb = new StringBuilder();
        sb.append(str2);
        str4 = ": UnityPlayer.currentActivity == null!";
        sb.append(str4);
        string = sb.toString();
        Log.w(FFAPI.LOG_TAG, string);
    }

    private void _SplashScreen_31() {
        final View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.dts.freefireth.FFMainActivity.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                decorView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: com.dts.freefireth.FFMainActivity.4
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public void onSplashScreenExit(SplashScreenView splashScreenView) {
                splashScreenView.remove();
            }
        });
    }

    private void _SplashScreen_Legacy() {
    }

    private String getMetaDataString(String str) {
        try {
            return getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString(str);
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            return "";
        }
    }

    private void handleIntent(Intent intent) {
        Object obj;
        MambetWrapper.handleintent(intent);
        if (intent != null) {
            if (intent.getData() != null) {
                FFAPI.OpenedByUrl = intent.getData().toString();
            }
            FFAPI.OpenedByNotifyType = intent.getIntExtra(FFLocalNotification.INTENT_EXTRA_NOTIFY_TYPE, -1);
            FFAPI.OpenedWithParams.clear();
            Bundle extras = intent.getExtras();
            if (extras == null || extras.keySet() == null) {
                return;
            }
            e eVar = new e();
            for (String str : extras.keySet()) {
                if (str != null && (obj = extras.get(str)) != null) {
                    if (obj instanceof String) {
                        FFAPI.OpenedWithParams.put(str, (String) obj);
                    }
                    if (obj.getClass() == null || !obj.getClass().isPrimitive()) {
                        try {
                            FFAPI.OpenedWithParams.put(str, eVar.t(obj));
                        } catch (Throwable unused) {
                        }
                    } else {
                        FFAPI.OpenedWithParams.put(str, obj.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTakenScreenshot(Uri uri) {
        FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onTakenScreenshot", uri != null ? uri.toString() : "");
    }

    private void setSystemUiVisibility() {
        try {
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
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.dts.freefireth.FFMainActivity.5
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public void onSystemUiVisibilityChange(int i3) {
                    if ((i3 & 4) == 0) {
                        FFMainActivity.this.getWindow().getDecorView().setSystemUiVisibility(FFMainActivity.SYSTEM_UI_VISIBILITY);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void unwatchScreenshot() {
        if (this._ScreenshotContentObserver != null) {
            getContentResolver().unregisterContentObserver(this._ScreenshotContentObserver);
            this._ScreenshotContentObserver = null;
        }
    }

    private boolean usingFCM() {
        return true;
    }

    private void watchBattery() {
        if (this.watcherOfBattery == null) {
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.dts.freefireth.FFMainActivity.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        FFAPI.updateBattery(intent);
                    }
                };
                this.watcherOfBattery = broadcastReceiver;
                registerReceiver(broadcastReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (Exception unused) {
            }
        }
    }

    private void watchScreenshot() {
        if (this._ScreenshotContentObserver == null) {
            this._ScreenshotContentObserver = new ContentObserver(new Handler(getMainLooper())) { // from class: com.dts.freefireth.FFMainActivity.6
                @Override // android.database.ContentObserver
                public void onChange(boolean z, Uri uri) {
                    String type;
                    super.onChange(z, uri);
                    if (!uri.toString().startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri.toString().equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || (type = FFMainActivity.this.getContentResolver().getType(uri)) == null || !type.startsWith("image/")) {
                        return;
                    }
                    FFMainActivity.this.onTakenScreenshot(uri);
                }
            };
            getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this._ScreenshotContentObserver);
        }
    }

    private void watchWifi() {
        if (this.watcherOfWifi == null) {
            try {
                this.watcherOfWifi = new BroadcastReceiver() { // from class: com.dts.freefireth.FFMainActivity.2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        FFAPI.updateWifi(intent);
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                registerReceiver(this.watcherOfWifi, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    public int getViewHeight() {
        return getWindow().getDecorView().getRootView().getHeight();
    }

    public int getViewWidth() {
        return getWindow().getDecorView().getRootView().getWidth();
    }

    public boolean hasPointerCapture() {
        if (Build.VERSION.SDK_INT >= 26) {
            return getWindow().getDecorView().getRootView().hasPointerCapture();
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 4658) {
            a.s(intent);
            return;
        }
        FFAPI.onActivityResult(i2, i3, intent);
        SdkUnity.onActivityResult(this, i2, i3, intent);
        WebViewManager.onActivityResult(i2, i3, intent);
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSystemUiVisibility();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (WebViewManager.isShowingCustomView()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        UnityPlayer unityPlayer;
        if (usingFCM() && (unityPlayer = this.mUnityPlayer) != null) {
            unityPlayer.quit();
            this.mUnityPlayer = null;
        }
        super.onCreate(bundle);
        getWindow().getDecorView().getRootView().setFocusable(true);
        if (Build.VERSION.SDK_INT >= 31) {
            _SplashScreen_31();
        } else {
            _SplashScreen_Legacy();
        }
        String metaDataString = getMetaDataString("HwAcc");
        if (metaDataString != null && metaDataString.equalsIgnoreCase("on")) {
            getWindow().setFlags(16777216, 16777216);
        }
        WebViewManager.onActivityCreate(this);
        WebViewManager.setUnityMessenger(UnityMessenger.I());
        FFAPI.MainActivity = this;
        SdkUnity.setActivity(this);
        MambetWrapper.setActivity(this);
        MambetWrapper.setUnityMessenger(UnityMessenger.I());
        FFAPI.MetaDataGarenaAppId = d.e(this);
        watchBattery();
        watchWifi();
        handleIntent(getIntent());
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onDestroy() {
        _FFDestroying = true;
        WebViewManager.onActivityDestroy(this);
        BroadcastReceiver broadcastReceiver = this.watcherOfBattery;
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
                this.watcherOfBattery = null;
            } catch (Exception e) {
                Log.i(FFAPI.LOG_TAG, "@FFMainActivity.onDestroy(): battery: " + e.getMessage(), e);
            }
        }
        BroadcastReceiver broadcastReceiver2 = this.watcherOfWifi;
        if (broadcastReceiver2 != null) {
            try {
                unregisterReceiver(broadcastReceiver2);
                this.watcherOfWifi = null;
            } catch (Exception e2) {
                Log.i(FFAPI.LOG_TAG, "@FFMainActivity.onDestroy(): wifi: " + e2.getMessage(), e2);
            }
        }
        super.onDestroy();
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if ((i2 == 4 || i2 == 111) && WebViewManager.isShowingCustomView()) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if ((i2 == 4 || i2 == 111) && WebViewManager.isShowingCustomView()) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        if (FFAPI.getCanHandleLowMemory()) {
            super.onLowMemory();
        }
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (usingFCM()) {
            try {
                Intent intent2 = new Intent(this, Class.forName("com.google.firebase.messaging.MessageForwardingService"));
                intent2.setAction("com.google.android.c2dm.intent.RECEIVE");
                intent2.putExtras(intent);
                intent2.setData(intent.getData());
                startService(intent2);
            } catch (ClassNotFoundException | IllegalStateException unused) {
            }
        }
        handleIntent(intent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        WebViewManager.onActivityPause(this);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        RequestPermissionResult requestPermissionResult = new RequestPermissionResult();
        requestPermissionResult.RequestCode = i2;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            requestPermissionResult.Results.put(strArr[i3], Integer.valueOf(iArr[i3]));
        }
        FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onRequestPermissionsResult", new e().t(requestPermissionResult));
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        WebViewManager.onActivityResume(this);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        watchScreenshot();
        WebViewManager.onActivityStart(this);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        unwatchScreenshot();
        WebViewManager.onActivityStop(this);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (FFAPI.getCanHandleLowMemory()) {
            super.onTrimMemory(i2);
        }
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (WebViewManager.ignoreActivityWindowFocusChanged()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    public void registerCapturedPointerListener() {
        if (Build.VERSION.SDK_INT >= 26) {
            if (this._CapturedPointerListener == null) {
                this._CapturedPointerListener = new CapturedPointerListener();
            }
            this.mUnityPlayer.GLView().setOnCapturedPointerListener(this._CapturedPointerListener);
        }
    }

    public void registerGenericMotionEventListener() {
        if (this._GenericMotionEventListener == null) {
            this._GenericMotionEventListener = new UnityPlayer.IGenericMotionEventListener() { // from class: com.dts.freefireth.FFMainActivity.7
                @Override // com.unity3d.player.UnityPlayer.IGenericMotionEventListener
                public void onGenericMotionEvent(MotionEvent motionEvent) {
                    AndroidMouse.onGenericMotionEvent(motionEvent);
                }
            };
        }
        this.mUnityPlayer.SetGenericMotionEventListener((UnityPlayer.IGenericMotionEventListener) this._GenericMotionEventListener);
    }

    public void releasePointerCapture() {
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().getRootView().releasePointerCapture();
        }
    }

    public void requestPointerCapture() {
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().getRootView().requestFocus();
            getWindow().getDecorView().getRootView().requestPointerCapture();
        }
    }

    public void unregisterCapturedPointerListener() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mUnityPlayer.GLView().setOnCapturedPointerListener(null);
        }
    }

    public void unregisterGenericMotionEventListener() {
        this.mUnityPlayer.SetGenericMotionEventListener(null);
    }
}
