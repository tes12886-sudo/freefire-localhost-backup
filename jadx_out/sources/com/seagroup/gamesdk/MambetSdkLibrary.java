package com.seagroup.gamesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import j.d.d.e;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import m.b0;
import m.c0;
import m.d0;
import m.f;
import m.x;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public class MambetSdkLibrary implements Application.ActivityLifecycleCallbacks {
    private static final String EVENT_PATH = "/reports/gameevents/%d/reports";
    private static final String KEY_DEVICE_ID = "MAMBET_DEVICE_ID";
    private static final String KEY_STREAM_KEY = "MAMBET_STREAM_KEY";
    private static final int MAX_QUEUE_SIZE = 10;
    private static final int MAX_RETRY_COUNT = 10;
    private static final int POLLING_INTERVAL = 30000;
    private static final String POLLING_PATH = "/channel/check";
    private static final String PREF_KEY_DEVICE_ID = "device_id";
    private static final String PREF_KEY_STREAM_KEY = "stream_key";
    private static final String PREF_NAME = "mambet_sdk";
    private static final int RETRY_INTERVAL = 5;
    private static final int RETRY_INTERVAL_RANDOM = 3;
    private static final String SERVER_URL = "https://booyah.live/api/v3";
    private static final String TAG = "MambetSDK";
    private static final String TEST_SERVER_URL = "https://test.connect.booyah.live/api/v3";
    private static volatile MambetSdkLibrary instance;
    final Context context;
    private SdkEventBuilder currentEventBuilder;
    private boolean debugEnv;
    private String deviceId;
    private int gameId;
    private final Handler mainHandler;
    final z okHttpClient;
    private String packageVersion;
    private String streamId;
    private String streamKey;
    private String gameAccountId = "";
    private final Object lock = new Object();
    private volatile Boolean uploading = Boolean.FALSE;
    private boolean isStreaming = false;
    private int retryCount = 0;
    private int resumedCount = 0;
    private ConcurrentHashMap<b0, String> requestStreamKeyMap = new ConcurrentHashMap<>();
    private final ConcurrentLinkedQueue<SdkEventBuilder> dataCacheQueue = new ConcurrentLinkedQueue<>();
    private final Runnable scheduleTask = new Runnable() { // from class: com.seagroup.gamesdk.MambetSdkLibrary.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (MambetSdkLibrary.this.lock) {
                Log.d(MambetSdkLibrary.TAG, "it time to check...");
                MambetSdkLibrary.this.updateChannelStatus();
                if (MambetSdkLibrary.this.currentEventBuilder != null && !MambetSdkLibrary.this.uploading.booleanValue()) {
                    MambetSdkLibrary mambetSdkLibrary = MambetSdkLibrary.this;
                    mambetSdkLibrary.uploadingAsync(mambetSdkLibrary.currentEventBuilder.toString());
                    MambetSdkLibrary.this.currentEventBuilder = null;
                }
            }
            MambetSdkLibrary.this.mainHandler.postDelayed(MambetSdkLibrary.this.scheduleTask, 30000L);
        }
    };
    final e gson = new e();

    private MambetSdkLibrary(Application application, int i2, boolean z) {
        this.context = application;
        this.gameId = i2;
        this.debugEnv = z;
        application.registerActivityLifecycleCallbacks(this);
        this.okHttpClient = new z.a().b();
        this.mainHandler = new Handler(application.getMainLooper());
        try {
            this.packageVersion = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        this.streamKey = getStreamKey();
        this.deviceId = getDeviceId();
    }

    static /* synthetic */ int access$1308(MambetSdkLibrary mambetSdkLibrary) {
        int i2 = mambetSdkLibrary.retryCount;
        mambetSdkLibrary.retryCount = i2 + 1;
        return i2;
    }

    private void clearCache() {
        this.dataCacheQueue.clear();
        this.currentEventBuilder = null;
    }

    private String getDeviceId() {
        return this.context.getSharedPreferences(PREF_NAME, 0).getString(PREF_KEY_DEVICE_ID, "");
    }

    public static MambetSdkLibrary getInstance() {
        return instance;
    }

    private String getServerUrl() {
        return this.debugEnv ? TEST_SERVER_URL : SERVER_URL;
    }

    private String getStreamKey() {
        return this.context.getSharedPreferences(PREF_NAME, 0).getString(PREF_KEY_STREAM_KEY, "");
    }

    public static void init(Application application, int i2, boolean z) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new AssertionError("should call init method on mainThread");
        }
        if (instance == null) {
            synchronized (MambetSdkLibrary.class) {
                if (instance == null) {
                    instance = new MambetSdkLibrary(application, i2, z);
                }
            }
        }
    }

    public static MambetInfo parseIntent(Intent intent) {
        return new MambetInfo(intent.getStringExtra(KEY_STREAM_KEY), intent.getStringExtra(KEY_DEVICE_ID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retrySend(final String str) {
        if (this.retryCount >= 10) {
            Log.d(TAG, "reached max retry count, give up");
            this.uploading = Boolean.FALSE;
            this.retryCount = 0;
            return;
        }
        Log.e(TAG, "failed uploading events, retry after several seconds...");
        Handler handler = this.mainHandler;
        Runnable runnable = new Runnable() { // from class: com.seagroup.gamesdk.MambetSdkLibrary.4
            @Override // java.lang.Runnable
            public void run() {
                MambetSdkLibrary.access$1308(MambetSdkLibrary.this);
                MambetSdkLibrary.this.uploadingAsync(str);
                Log.d(MambetSdkLibrary.TAG, "retry uploading events...");
            }
        };
        double dRandom = (Math.random() * 3.0d) + 1.0d;
        double d = this.retryCount * 5;
        Double.isNaN(d);
        handler.postDelayed(runnable, (long) ((dRandom + d) * 1000.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamKey(String str) {
        synchronized (this.lock) {
            this.streamKey = str;
            clearCache();
        }
        this.context.getSharedPreferences(PREF_NAME, 0).edit().putString(PREF_KEY_STREAM_KEY, str).apply();
        this.mainHandler.removeCallbacks(this.scheduleTask);
        if (TextUtils.isEmpty(this.streamKey)) {
            Log.d(TAG, "clear stream key, stop schedule");
            this.isStreaming = false;
        } else {
            updateChannelStatus();
            Log.d(TAG, "set stream key, start schedule");
            this.mainHandler.postDelayed(this.scheduleTask, 30000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateChannelStatus() {
        if (TextUtils.isEmpty(this.streamKey)) {
            return;
        }
        c0 c0VarC = c0.c(x.g("application/json; charset=UTF-8"), this.gson.t(new CheckChannelRequest(this.streamKey, this.deviceId)));
        b0.a aVar = new b0.a();
        aVar.o(getServerUrl() + POLLING_PATH);
        aVar.g(c0VarC);
        b0 b0VarA = aVar.a();
        m.e eVarA = this.okHttpClient.a(b0VarA);
        this.requestStreamKeyMap.put(b0VarA, this.streamKey);
        eVarA.u(new f() { // from class: com.seagroup.gamesdk.MambetSdkLibrary.2
            @Override // m.f
            public void onFailure(m.e eVar, IOException iOException) {
                Log.d(MambetSdkLibrary.TAG, "polling status failed");
                MambetSdkLibrary.this.requestStreamKeyMap.remove(eVar.c());
            }

            @Override // m.f
            public void onResponse(m.e eVar, d0 d0Var) {
                if (d0Var.Y()) {
                    if (d0Var.b() == null) {
                        Log.d(MambetSdkLibrary.TAG, "empty response");
                        return;
                    }
                    try {
                        CheckChannelResponse checkChannelResponse = (CheckChannelResponse) MambetSdkLibrary.this.gson.k(d0Var.b().O(), CheckChannelResponse.class);
                        MambetSdkLibrary.this.streamId = checkChannelResponse.getStreamId();
                        MambetSdkLibrary.this.isStreaming = checkChannelResponse.getStatus() != 0;
                        Log.d(MambetSdkLibrary.TAG, "is streaming " + MambetSdkLibrary.this.isStreaming);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.d(MambetSdkLibrary.TAG, "can't parse response");
                    }
                } else if (d0Var.l() == 403 || d0Var.l() == 401) {
                    Log.d(MambetSdkLibrary.TAG, d0Var.l() + " received, clear token");
                    if (TextUtils.equals((String) MambetSdkLibrary.this.requestStreamKeyMap.get(eVar.c()), MambetSdkLibrary.this.streamKey)) {
                        MambetSdkLibrary.this.setStreamKey("");
                    }
                }
                MambetSdkLibrary.this.requestStreamKeyMap.remove(eVar.c());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadingAsync(final String str) {
        if (TextUtils.isEmpty(this.streamKey)) {
            return;
        }
        this.uploading = Boolean.TRUE;
        c0 c0VarC = c0.c(x.g("application/json; charset=UTF-8"), str);
        b0.a aVar = new b0.a();
        aVar.o(getServerUrl() + String.format(EVENT_PATH, Integer.valueOf(this.gameId)));
        aVar.g(c0VarC);
        b0 b0VarA = aVar.a();
        m.e eVarA = this.okHttpClient.a(b0VarA);
        this.requestStreamKeyMap.put(b0VarA, this.streamKey);
        eVarA.u(new f() { // from class: com.seagroup.gamesdk.MambetSdkLibrary.3
            @Override // m.f
            public void onFailure(m.e eVar, IOException iOException) {
                MambetSdkLibrary.this.retrySend(str);
                MambetSdkLibrary.this.requestStreamKeyMap.remove(eVar.c());
            }

            @Override // m.f
            public void onResponse(m.e eVar, d0 d0Var) {
                Boolean bool = Boolean.FALSE;
                if (d0Var.Y()) {
                    Log.d(MambetSdkLibrary.TAG, "upload events successful");
                } else {
                    Log.d(MambetSdkLibrary.TAG, "upload events failed code:" + d0Var.l());
                    if (d0Var.l() == 403 || d0Var.l() == 401) {
                        Log.d(MambetSdkLibrary.TAG, d0Var.l() + " received, clear token");
                        if (TextUtils.equals((String) MambetSdkLibrary.this.requestStreamKeyMap.get(eVar.c()), MambetSdkLibrary.this.streamKey)) {
                            MambetSdkLibrary.this.setStreamKey("");
                        }
                        MambetSdkLibrary.this.uploading = bool;
                        MambetSdkLibrary.this.retryCount = 0;
                        return;
                    }
                    if (d0Var.l() == 500 || d0Var.l() == 502 || d0Var.l() == 503 || d0Var.l() == 504) {
                        MambetSdkLibrary.this.retrySend(str);
                        return;
                    }
                }
                MambetSdkLibrary.this.retryCount = 0;
                if (MambetSdkLibrary.this.dataCacheQueue.isEmpty()) {
                    Log.d(MambetSdkLibrary.TAG, "events uploaded");
                    MambetSdkLibrary.this.uploading = bool;
                } else {
                    Log.d(MambetSdkLibrary.TAG, "continue uploading events...");
                    SdkEventBuilder sdkEventBuilder = (SdkEventBuilder) MambetSdkLibrary.this.dataCacheQueue.poll();
                    if (sdkEventBuilder != null) {
                        MambetSdkLibrary.this.uploadingAsync(sdkEventBuilder.toString());
                    }
                }
                MambetSdkLibrary.this.requestStreamKeyMap.remove(eVar.c());
            }
        });
    }

    public void handleIntent(Intent intent) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new AssertionError("should call handle intent method on mainThread");
        }
        String stringExtra = intent.getStringExtra(KEY_STREAM_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.deviceId = intent.getStringExtra(KEY_DEVICE_ID);
        this.context.getSharedPreferences(PREF_NAME, 0).edit().putString(PREF_KEY_DEVICE_ID, this.deviceId).apply();
        setStreamKey(stringExtra);
    }

    public void handleMambetInfo(MambetInfo mambetInfo) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new AssertionError("should call handle intent method on mainThread");
        }
        String streamKey = mambetInfo.getStreamKey();
        if (TextUtils.isEmpty(streamKey)) {
            return;
        }
        this.deviceId = mambetInfo.getDeviceId();
        this.context.getSharedPreferences(PREF_NAME, 0).edit().putString(PREF_KEY_DEVICE_ID, this.deviceId).apply();
        setStreamKey(streamKey);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.resumedCount--;
        synchronized (this.lock) {
            Log.d(TAG, "onPaused");
            if (this.resumedCount == 0) {
                Log.d(TAG, "app goes background");
                this.mainHandler.removeCallbacks(this.scheduleTask);
                if (this.currentEventBuilder != null && !this.uploading.booleanValue()) {
                    uploadingAsync(this.currentEventBuilder.toString());
                    this.currentEventBuilder = null;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.resumedCount == 0) {
            Log.d(TAG, "app goes foreground");
            if (!TextUtils.isEmpty(this.streamKey)) {
                this.mainHandler.removeCallbacks(this.scheduleTask);
                updateChannelStatus();
                this.mainHandler.postDelayed(this.scheduleTask, 30000L);
            }
        }
        this.resumedCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public void pushEvent(String str, Parcelable parcelable) {
        pushEvent(str, this.gson.t(parcelable));
    }

    public void pushEvent(String str, String str2) {
        String string;
        if (TextUtils.isEmpty(this.streamKey) || !this.isStreaming) {
            return;
        }
        String string2 = new GameEventBuilder(str, System.currentTimeMillis(), str2).toString();
        synchronized (this.lock) {
            if (this.currentEventBuilder == null) {
                this.currentEventBuilder = new SdkEventBuilder(this.context.getPackageName(), this.streamId, this.streamKey, this.packageVersion, this.gameAccountId, this.deviceId);
            }
            if (this.currentEventBuilder.addEvent(string2)) {
                if (this.uploading.booleanValue()) {
                    this.dataCacheQueue.add(this.currentEventBuilder);
                    if (this.dataCacheQueue.size() > 10) {
                        this.dataCacheQueue.poll();
                    }
                    if (!this.uploading.booleanValue()) {
                        Log.d(TAG, "queue not empty,start uploading events...");
                        SdkEventBuilder sdkEventBuilderPoll = this.dataCacheQueue.poll();
                        if (sdkEventBuilderPoll != null) {
                            string = sdkEventBuilderPoll.toString();
                        }
                    }
                    this.currentEventBuilder = null;
                } else {
                    Log.d(TAG, "reach max count, start uploading events...");
                    string = this.currentEventBuilder.toString();
                }
                uploadingAsync(string);
                this.currentEventBuilder = null;
            }
        }
    }

    public void setCurrentAccountID(String str) {
        this.gameAccountId = str;
    }
}
