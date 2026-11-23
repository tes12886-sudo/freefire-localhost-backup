package j.d.a.e.a.a.i;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends j.d.a.e.a.a.i.b implements j.d.a.e.a.a.g {
    public static final String ACTION_DOWNLOADS_CHANGED = "downloadsChanged";
    public static final String ACTION_DOWNLOAD_COMPLETE = "lvldownloader.intent.action.DOWNLOAD_COMPLETE";
    public static final String ACTION_DOWNLOAD_STATUS = "lvldownloader.intent.action.DOWNLOAD_STATUS";
    public static final int CONTROL_PAUSED = 1;
    public static final int CONTROL_RUN = 0;
    public static final int DOWNLOAD_REQUIRED = 2;
    public static final String EXTRA_FILE_NAME = "downloadId";
    public static final String EXTRA_IS_WIFI_REQUIRED = "isWifiRequired";
    public static final String EXTRA_MESSAGE_HANDLER = "EMH";
    public static final String EXTRA_PACKAGE_NAME = "EPN";
    public static final String EXTRA_PENDING_INTENT = "EPI";
    public static final String EXTRA_STATUS_CURRENT_FILE_SIZE = "CFS";
    public static final String EXTRA_STATUS_CURRENT_PROGRESS = "CFP";
    public static final String EXTRA_STATUS_STATE = "ESS";
    public static final String EXTRA_STATUS_TOTAL_PROGRESS = "TFP";
    public static final String EXTRA_STATUS_TOTAL_SIZE = "ETS";
    private static final String LOG_TAG = "LVLDL";
    public static final int LVL_CHECK_REQUIRED = 1;
    public static final int NETWORK_CANNOT_USE_ROAMING = 5;
    public static final int NETWORK_MOBILE = 1;
    public static final int NETWORK_NO_CONNECTION = 2;
    public static final int NETWORK_OK = 1;
    public static final int NETWORK_RECOMMENDED_UNUSABLE_DUE_TO_SIZE = 4;
    public static final int NETWORK_TYPE_DISALLOWED_BY_REQUESTOR = 6;
    public static final int NETWORK_UNUSABLE_DUE_TO_SIZE = 3;
    public static final int NETWORK_WIFI = 2;
    public static final int NO_DOWNLOAD_REQUIRED = 0;
    private static final float SMOOTHING_FACTOR = 0.005f;
    public static final int STATUS_CANCELED = 490;
    public static final int STATUS_CANNOT_RESUME = 489;
    public static final int STATUS_DEVICE_NOT_FOUND_ERROR = 499;
    public static final int STATUS_FILE_ALREADY_EXISTS_ERROR = 488;
    public static final int STATUS_FILE_DELIVERED_INCORRECTLY = 487;
    public static final int STATUS_FILE_ERROR = 492;
    public static final int STATUS_FORBIDDEN = 403;
    public static final int STATUS_HTTP_DATA_ERROR = 495;
    public static final int STATUS_HTTP_EXCEPTION = 496;
    public static final int STATUS_INSUFFICIENT_SPACE_ERROR = 498;
    public static final int STATUS_PAUSED_BY_APP = 193;
    public static final int STATUS_PENDING = 190;
    public static final int STATUS_QUEUED_FOR_WIFI = 197;
    public static final int STATUS_QUEUED_FOR_WIFI_OR_CELLULAR_PERMISSION = 196;
    public static final int STATUS_RUNNING = 192;
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_TOO_MANY_REDIRECTS = 497;
    public static final int STATUS_UNHANDLED_HTTP_CODE = 494;
    public static final int STATUS_UNHANDLED_REDIRECT = 493;
    public static final int STATUS_UNKNOWN_ERROR = 491;
    public static final int STATUS_WAITING_FOR_NETWORK = 195;
    public static final int STATUS_WAITING_TO_RETRY = 194;
    private static final String TEMP_EXT = ".tmp";
    public static final int VISIBILITY_HIDDEN = 2;
    public static final int VISIBILITY_VISIBLE = 0;
    public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;
    private static boolean sIsRunning;
    private PendingIntent mAlarmIntent;
    float mAverageDownloadSpeed;
    long mBytesAtSample;
    long mBytesSoFar;
    private Messenger mClientMessenger;
    private BroadcastReceiver mConnReceiver;
    private ConnectivityManager mConnectivityManager;
    private int mControl;
    int mFileCount;
    private boolean mIsAtLeast3G;
    private boolean mIsAtLeast4G;
    private boolean mIsCellularConnection;
    private boolean mIsConnected;
    private boolean mIsFailover;
    private boolean mIsRoaming;
    long mMillisecondsAtSample;
    private e mNotification;
    private PackageInfo mPackageInfo;
    private PendingIntent mPendingIntent;
    private final Messenger mServiceMessenger;
    private final j.d.a.e.a.a.h mServiceStub;
    private boolean mStateChanged;
    private int mStatus;
    long mTotalLength;
    private WifiManager mWifiManager;

    public static class a extends Exception {
        int a;
        String b;

        public a(int i2, String str) {
            this.a = i2;
            this.b = str;
        }
    }

    private class b extends BroadcastReceiver {
        final Service a;

        b(Service service) {
            this.a = service;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            g.this.pollNetworkState();
            if (!g.this.mStateChanged || g.isServiceRunning()) {
                return;
            }
            Log.d(g.LOG_TAG, "InnerBroadcastReceiver Called");
            Intent intent2 = new Intent(context, this.a.getClass());
            intent2.putExtra(g.EXTRA_PENDING_INTENT, g.this.mPendingIntent);
            context.startService(intent2);
        }
    }

    private class c implements Runnable {
        final Context a;

        class a implements com.google.android.vending.licensing.f {
            final /* synthetic */ com.google.android.vending.licensing.b a;

            a(com.google.android.vending.licensing.b bVar) {
                this.a = bVar;
            }

            @Override // com.google.android.vending.licensing.f
            public void a(int i2) {
                int i3;
                try {
                    int iG = this.a.g();
                    h hVarA = h.a(c.this.a);
                    if (iG != 0) {
                        i3 = 0;
                        for (int i4 = 0; i4 < iG; i4++) {
                            String strD = this.a.d(i4);
                            if (strD != null) {
                                d dVar = new d(i4, strD, c.this.a.getPackageName());
                                long jE = this.a.e(i4);
                                if (g.this.handleFileUpdated(hVarA, i4, strD, jE)) {
                                    i3 |= -1;
                                    dVar.a();
                                    dVar.a = this.a.f(i4);
                                    dVar.e = jE;
                                    dVar.f2000h = i3;
                                } else {
                                    d dVarC = hVarA.c(dVar.c);
                                    if (dVarC == null) {
                                        Log.d(g.LOG_TAG, "file " + dVar.c + " found. Not downloading.");
                                        dVar.f2000h = g.STATUS_SUCCESS;
                                        dVar.e = jE;
                                        dVar.f = jE;
                                        dVar.a = this.a.f(i4);
                                    } else if (dVarC.f2000h != 200) {
                                        dVarC.a = this.a.f(i4);
                                        hVarA.j(dVarC);
                                        i3 |= -1;
                                    }
                                }
                                hVarA.j(dVar);
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    try {
                        hVarA.o(c.this.a.getPackageManager().getPackageInfo(c.this.a.getPackageName(), 0).versionCode, i3);
                        Class<?> cls = g.this.getClass();
                        c cVar = c.this;
                        int iStartDownloadServiceIfRequired = g.startDownloadServiceIfRequired(cVar.a, g.this.mPendingIntent, cls);
                        if (iStartDownloadServiceIfRequired == 0) {
                            g.this.mNotification.onDownloadStateChanged(16);
                        } else if (iStartDownloadServiceIfRequired == 1) {
                            Log.e(g.LOG_TAG, "In LVL checking loop!");
                            g.this.mNotification.onDownloadStateChanged(15);
                            throw new RuntimeException("Error with LVL checking and database integrity");
                        }
                        g.setServiceRunning(false);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        throw new RuntimeException("Error with getting information from package name");
                    }
                } catch (Throwable th) {
                    g.setServiceRunning(false);
                    throw th;
                }
            }

            @Override // com.google.android.vending.licensing.f
            public void b(int i2) {
                try {
                    g.this.mNotification.onDownloadStateChanged(16);
                } finally {
                    g.setServiceRunning(false);
                }
            }

            @Override // com.google.android.vending.licensing.f
            public void c(int i2) {
                try {
                    if (i2 != 291) {
                        if (i2 == 561) {
                            g.this.mNotification.onDownloadStateChanged(15);
                        }
                        g.setServiceRunning(false);
                    }
                    g.this.mNotification.onDownloadStateChanged(16);
                    g.setServiceRunning(false);
                } catch (Throwable th) {
                    g.setServiceRunning(false);
                    throw th;
                }
            }
        }

        c(Context context, PendingIntent pendingIntent) {
            this.a = context;
            g.this.mPendingIntent = pendingIntent;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.setServiceRunning(true);
            g.this.mNotification.onDownloadStateChanged(2);
            com.google.android.vending.licensing.b bVar = new com.google.android.vending.licensing.b(this.a, new com.google.android.vending.licensing.a(g.this.getSALT(), this.a.getPackageName(), Settings.Secure.getString(this.a.getContentResolver(), "android_id")));
            bVar.h();
            new com.google.android.vending.licensing.e(this.a, bVar, g.this.getPublicKey()).f(new a(bVar));
        }
    }

    public g() {
        super("LVLDownloadService");
        j.d.a.e.a.a.h hVarB = j.d.a.e.a.a.d.b(this);
        this.mServiceStub = hVarB;
        this.mServiceMessenger = hVarB.b();
    }

    private void cancelAlarms() {
        if (this.mAlarmIntent != null) {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            if (alarmManager == null) {
                Log.e(LOG_TAG, "couldn't get alarm manager");
            } else {
                alarmManager.cancel(this.mAlarmIntent);
                this.mAlarmIntent = null;
            }
        }
    }

    private static boolean isLVLCheckRequired(h hVar, PackageInfo packageInfo) {
        return hVar.e != packageInfo.versionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized boolean isServiceRunning() {
        return sIsRunning;
    }

    public static boolean isStatusClientError(int i2) {
        return i2 >= 400 && i2 < 500;
    }

    public static boolean isStatusCompleted(int i2) {
        return (i2 >= 200 && i2 < 300) || (i2 >= 400 && i2 < 600);
    }

    public static boolean isStatusError(int i2) {
        return i2 >= 400 && i2 < 600;
    }

    public static boolean isStatusInformational(int i2) {
        return i2 >= 100 && i2 < 200;
    }

    public static boolean isStatusServerError(int i2) {
        return i2 >= 500 && i2 < 600;
    }

    public static boolean isStatusSuccess(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private void scheduleAlarm(long j2) {
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (alarmManager == null) {
            Log.e(LOG_TAG, "couldn't get alarm manager");
            return;
        }
        String alarmReceiverClassName = getAlarmReceiverClassName();
        Intent intent = new Intent("android.intent.action.DOWNLOAD_WAKEUP");
        intent.putExtra(EXTRA_PENDING_INTENT, this.mPendingIntent);
        intent.setClassName(getPackageName(), alarmReceiverClassName);
        this.mAlarmIntent = PendingIntent.getBroadcast(this, 0, intent, 1107296256);
        alarmManager.set(0, System.currentTimeMillis() + j2, this.mAlarmIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setServiceRunning(boolean z) {
        sIsRunning = z;
    }

    public static int startDownloadServiceIfRequired(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return startDownloadServiceIfRequired(context, pendingIntent, context.getPackageName(), cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    public static int startDownloadServiceIfRequired(Context context, PendingIntent pendingIntent, String str, String str2) throws Throwable {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        h hVarA = h.a(context);
        ?? IsLVLCheckRequired = isLVLCheckRequired(hVarA, packageInfo);
        if (hVarA.f != 0) {
            IsLVLCheckRequired = 2;
            break;
        }
        d[] dVarArrE = hVarA.e();
        if (dVarArrE != null) {
            for (d dVar : dVarArrE) {
                if (!j.d.a.e.a.a.e.a(context, dVar.c, dVar.e, true)) {
                    hVarA.q(-1);
                    IsLVLCheckRequired = 2;
                    break;
                }
            }
        }
        if (IsLVLCheckRequired == 1 || IsLVLCheckRequired == 2) {
            Intent intent = new Intent();
            intent.setClassName(str, str2);
            intent.putExtra(EXTRA_PENDING_INTENT, pendingIntent);
            context.startService(intent);
        }
        return IsLVLCheckRequired;
    }

    public static int startDownloadServiceIfRequired(Context context, Intent intent, Class<?> cls) {
        return startDownloadServiceIfRequired(context, (PendingIntent) intent.getParcelableExtra(EXTRA_PENDING_INTENT), cls);
    }

    private void updateNetworkState(NetworkInfo networkInfo) {
        boolean z = this.mIsConnected;
        boolean z2 = this.mIsFailover;
        boolean z3 = this.mIsCellularConnection;
        boolean z4 = this.mIsRoaming;
        boolean z5 = this.mIsAtLeast3G;
        if (networkInfo != null) {
            this.mIsRoaming = networkInfo.isRoaming();
            this.mIsFailover = networkInfo.isFailover();
            this.mIsConnected = networkInfo.isConnected();
            updateNetworkType(networkInfo.getType(), networkInfo.getSubtype());
        } else {
            this.mIsRoaming = false;
            this.mIsFailover = false;
            this.mIsConnected = false;
            updateNetworkType(-1, -1);
        }
        this.mStateChanged = (!this.mStateChanged && z == this.mIsConnected && z2 == this.mIsFailover && z3 == this.mIsCellularConnection && z4 == this.mIsRoaming && z5 == this.mIsAtLeast3G) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void updateNetworkType(int i2, int i3) {
        if (i2 == 0) {
            this.mIsCellularConnection = true;
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                    this.mIsAtLeast3G = true;
                    this.mIsAtLeast4G = false;
                    break;
                case 12:
                default:
                    this.mIsCellularConnection = false;
                    break;
                case 13:
                case 14:
                case 15:
                    this.mIsAtLeast3G = true;
                    this.mIsAtLeast4G = true;
                    break;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 6) {
                this.mIsCellularConnection = true;
                this.mIsAtLeast3G = true;
                this.mIsAtLeast4G = true;
                return;
            } else if (i2 != 7 && i2 != 9) {
                return;
            }
        }
        this.mIsCellularConnection = false;
        this.mIsAtLeast3G = false;
        this.mIsAtLeast4G = false;
    }

    public String generateSaveFile(String str, long j2) throws a {
        String strGenerateTempSaveFileName = generateTempSaveFileName(str);
        File file = new File(strGenerateTempSaveFileName);
        if (!j.d.a.e.a.a.e.n()) {
            Log.d(LOG_TAG, "External media not mounted: " + strGenerateTempSaveFileName);
            throw new a(STATUS_DEVICE_NOT_FOUND_ERROR, "external media is not yet mounted");
        }
        if (!file.exists()) {
            if (j.d.a.e.a.a.e.c(j.d.a.e.a.a.e.g(strGenerateTempSaveFileName)) >= j2) {
                return strGenerateTempSaveFileName;
            }
            throw new a(STATUS_INSUFFICIENT_SPACE_ERROR, "insufficient space on external storage");
        }
        Log.d(LOG_TAG, "File already exists: " + strGenerateTempSaveFileName);
        throw new a(STATUS_FILE_ALREADY_EXISTS_ERROR, "requested destination file already exists");
    }

    public String generateTempSaveFileName(String str) {
        return j.d.a.e.a.a.e.j(this) + File.separator + str + TEMP_EXT;
    }

    public abstract String getAlarmReceiverClassName();

    public int getControl() {
        return this.mControl;
    }

    public String getLogMessageForNetworkError(int i2) {
        if (i2 == 2) {
            return "no network connection available";
        }
        if (i2 == 3) {
            return "download size exceeds limit for mobile network";
        }
        if (i2 == 4) {
            return "download size exceeds recommended limit for mobile network";
        }
        if (i2 != 5) {
            return i2 != 6 ? "unknown error with network connectivity" : "download was requested to not use the current network type";
        }
        return "download cannot use the current network connection because it is roaming";
    }

    public int getNetworkAvailabilityState(h hVar) {
        if (!this.mIsConnected) {
            return 2;
        }
        if (!this.mIsCellularConnection) {
            return 1;
        }
        int i2 = hVar.f2019g;
        if (this.mIsRoaming) {
            return 5;
        }
        return (i2 & 1) != 0 ? 1 : 6;
    }

    public abstract String getPublicKey();

    public abstract byte[] getSALT();

    public int getStatus() {
        return this.mStatus;
    }

    public boolean handleFileUpdated(h hVar, int i2, String str, long j2) throws Throwable {
        String str2;
        d dVarC = hVar.c(str);
        if (dVarC != null && (str2 = dVarC.c) != null) {
            if (str.equals(str2)) {
                return false;
            }
            File file = new File(j.d.a.e.a.a.e.b(this, str2));
            if (file.exists()) {
                file.delete();
            }
        }
        return true ^ j.d.a.e.a.a.e.a(this, str, j2, true);
    }

    public boolean isWiFi() {
        return this.mIsConnected && !this.mIsCellularConnection;
    }

    public void notifyUpdateBytes(long j2) {
        long j3;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j4 = this.mMillisecondsAtSample;
        if (0 != j4) {
            float f = (j2 - this.mBytesAtSample) / (jUptimeMillis - j4);
            float f2 = this.mAverageDownloadSpeed;
            if (0.0f != f2) {
                f = (f * SMOOTHING_FACTOR) + (f2 * 0.995f);
            }
            this.mAverageDownloadSpeed = f;
            j3 = (long) ((this.mTotalLength - j2) / this.mAverageDownloadSpeed);
        } else {
            j3 = -1;
        }
        this.mMillisecondsAtSample = jUptimeMillis;
        this.mBytesAtSample = j2;
        this.mNotification.onDownloadProgress(new j.d.a.e.a.a.b(this.mTotalLength, j2, j3, this.mAverageDownloadSpeed));
    }

    @Override // j.d.a.e.a.a.i.b, android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "Service Bound");
        return this.mServiceMessenger.getBinder();
    }

    @Override // j.d.a.e.a.a.g
    public void onClientUpdated(Messenger messenger) {
        this.mClientMessenger = messenger;
        this.mNotification.c(messenger);
    }

    @Override // j.d.a.e.a.a.i.b, android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            this.mPackageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.mNotification = new e(this, getPackageManager().getApplicationLabel(getApplicationInfo()));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // j.d.a.e.a.a.i.b, android.app.Service
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.mConnReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.mConnReceiver = null;
        }
        this.mServiceStub.c(this);
        super.onDestroy();
    }

    @Override // j.d.a.e.a.a.i.b
    protected void onHandleIntent(Intent intent) {
        int i2;
        boolean z = true;
        setServiceRunning(true);
        try {
            h hVarA = h.a(this);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(EXTRA_PENDING_INTENT);
            if (pendingIntent != null) {
                this.mNotification.b(pendingIntent);
                this.mPendingIntent = pendingIntent;
            } else {
                PendingIntent pendingIntent2 = this.mPendingIntent;
                if (pendingIntent2 == null) {
                    Log.e(LOG_TAG, "Downloader started in bad state without notification intent.");
                    return;
                }
                this.mNotification.b(pendingIntent2);
            }
            if (isLVLCheckRequired(hVarA, this.mPackageInfo)) {
                updateLVL(this);
                return;
            }
            d[] dVarArrE = hVarA.e();
            long j2 = 0;
            this.mBytesSoFar = 0L;
            this.mTotalLength = 0L;
            this.mFileCount = dVarArrE.length;
            for (d dVar : dVarArrE) {
                if (dVar.f2000h == 200 && !j.d.a.e.a.a.e.a(this, dVar.c, dVar.e, true)) {
                    dVar.f2000h = 0;
                    dVar.f = 0L;
                }
                this.mTotalLength += dVar.e;
                this.mBytesSoFar += dVar.f;
            }
            pollNetworkState();
            if (this.mConnReceiver == null) {
                this.mConnReceiver = new b(this);
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                registerReceiver(this.mConnReceiver, intentFilter);
            }
            int length = dVarArrE.length;
            int i3 = 0;
            while (i3 < length) {
                d dVar2 = dVarArrE[i3];
                long j3 = dVar2.f;
                if (dVar2.f2000h != 200) {
                    f fVar = new f(dVar2, this, this.mNotification);
                    cancelAlarms();
                    scheduleAlarm(5000L);
                    fVar.x();
                    cancelAlarms();
                }
                hVarA.n(dVar2);
                int i4 = dVar2.f2000h;
                if (i4 != 200) {
                    if (i4 == 403) {
                        updateLVL(this);
                        return;
                    }
                    if (i4 == 487) {
                        dVar2.f = j2;
                        hVarA.j(dVar2);
                        i2 = 13;
                    } else if (i4 == 490) {
                        i2 = 18;
                    } else if (i4 == 498) {
                        i2 = 17;
                    } else if (i4 != 499) {
                        switch (i4) {
                            case STATUS_PAUSED_BY_APP /* 193 */:
                                z = false;
                                i2 = 7;
                                break;
                            case STATUS_WAITING_TO_RETRY /* 194 */:
                            case STATUS_WAITING_FOR_NETWORK /* 195 */:
                                i2 = 6;
                                break;
                            case STATUS_QUEUED_FOR_WIFI_OR_CELLULAR_PERMISSION /* 196 */:
                            case STATUS_QUEUED_FOR_WIFI /* 197 */:
                                WifiManager wifiManager = this.mWifiManager;
                                i2 = (wifiManager != null && !wifiManager.isWifiEnabled()) ? 8 : 9;
                                break;
                            default:
                                z = false;
                                i2 = 19;
                                break;
                        }
                    } else {
                        i2 = 14;
                    }
                    if (z) {
                        scheduleAlarm(60000L);
                    } else {
                        cancelAlarms();
                    }
                    this.mNotification.onDownloadStateChanged(i2);
                    return;
                }
                this.mBytesSoFar += dVar2.f - j3;
                hVarA.o(this.mPackageInfo.versionCode, 0);
                i3++;
                j2 = 0;
            }
            this.mNotification.onDownloadStateChanged(5);
        } finally {
            setServiceRunning(false);
        }
    }

    void pollNetworkState() {
        if (this.mConnectivityManager == null) {
            this.mConnectivityManager = (ConnectivityManager) getSystemService("connectivity");
        }
        if (this.mWifiManager == null) {
            this.mWifiManager = (WifiManager) getSystemService("wifi");
        }
        ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager == null) {
            Log.w(LOG_TAG, "couldn't get connectivity manager to poll network state");
        } else {
            updateNetworkState(connectivityManager.getActiveNetworkInfo());
        }
    }

    @Override // j.d.a.e.a.a.g
    public void requestAbortDownload() {
        this.mControl = 1;
        this.mStatus = STATUS_CANCELED;
    }

    @Override // j.d.a.e.a.a.g
    public void requestContinueDownload() {
        if (this.mControl == 1) {
            this.mControl = 0;
        }
        Intent intent = new Intent(this, getClass());
        intent.putExtra(EXTRA_PENDING_INTENT, this.mPendingIntent);
        startService(intent);
    }

    @Override // j.d.a.e.a.a.g
    public void requestDownloadStatus() {
        this.mNotification.a();
    }

    @Override // j.d.a.e.a.a.g
    public void requestPauseDownload() {
        this.mControl = 1;
        this.mStatus = STATUS_PAUSED_BY_APP;
    }

    @Override // j.d.a.e.a.a.g
    public void setDownloadFlags(int i2) {
        h.a(this).m(i2);
    }

    @Override // j.d.a.e.a.a.i.b
    protected boolean shouldStop() {
        return h.a(this).f == 0;
    }

    public void updateLVL(Context context) {
        Context applicationContext = context.getApplicationContext();
        new Handler(applicationContext.getMainLooper()).post(new c(applicationContext, this.mPendingIntent));
    }
}
