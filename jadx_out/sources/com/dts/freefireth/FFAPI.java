package com.dts.freefireth;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.os.StatFs;
import android.provider.MediaStore;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.core.content.FileProvider;
import androidx.core.content.a;
import com.dts.freefireth.FFNetCommand.TraceRoute.Traceroute;
import com.dts.freefireth.FFNetCommand.TraceRoute.TracerouteCallback;
import com.dts.freefireth.FFNetCommand.TraceRoute.TracerouteResult;
import com.dts.freefireth.FFNetCommand.UCommandStatus;
import com.dts.freefireth.variant.FreeFireBuildVariant;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.b;
import j.d.d.e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FFAPI {
    private static final int BIND_SOCKET_CELLULAR = 1;
    private static final String BIND_SOCKET_ERROR_EPERM = "EPERM";
    private static final String BIND_SOCKET_ERROR_NO_FD = "NO_FD";
    private static final String BIND_SOCKET_ERROR_NO_NET = "NO_NET";
    private static final String BIND_SOCKET_ERROR_SDK_INT = "SDK_INT";
    private static final int BIND_SOCKET_WIFI = 0;
    public static float BatteryLevel = -1.0f;
    public static int BatteryStatus = 1;
    private static final String DATA_CONNECTION_STATE_CHANGED = "OnDataConnectionStateChanged";
    private static e GsonInstance = null;
    private static final String IN_APP_REVIEW_CALLBACK = "onInAppReviewCallback";
    public static final String LOG_TAG = "FreeFire";
    public static FFMainActivity MainActivity = null;
    public static String MetaDataGarenaAppId = null;
    private static final String NETWORK_CALLBACK = "OnNetworkCallback";
    private static final String NETWORK_CALLBACK_EVENT_AVAILABLE = "available";
    private static final String NETWORK_CALLBACK_EVENT_BLOCKED = "blocked";
    private static final String NETWORK_CALLBACK_EVENT_CAPABILITIES_CHANGED = "capabilities_changed";
    private static final String NETWORK_CALLBACK_EVENT_LOSING = "losing";
    private static final String NETWORK_CALLBACK_EVENT_LOST = "lost";
    private static final String NETWORK_CALLBACK_EVENT_UNAVAILABLE = "unavailable";
    private static final String NETWORK_CALLBACK_EVENT_UNBLOCKED = "unblocked";
    private static final String NETWORK_CALLBACK_LEGACY = "OnNetworkCallbackLegacy";
    private static final String NETWORK_CALLBACK_TYPE_CELLULAR = "Cellular";
    private static final String NETWORK_CALLBACK_TYPE_VPN = "VPN";
    private static final String NETWORK_CALLBACK_TYPE_WIFI = "WIFI";
    private static final String ON_GET_ADVERTISING_ID = "onGetAdvertisingId";
    public static int OpenedByNotifyType = -1;
    public static String OpenedByUrl = "";
    private static final Hashtable<String, String> PermissionRationales;
    public static final int REQUEST_CODE_SELECT_IMAGE_FROM_ALBUM = 67136091;
    public static String UnitySendMessageGameObjectName = null;
    public static float WifiSignalLevel = -1.0f;
    private static Network _CellularNetwork;
    private static BroadcastReceiver _ConnectivityActionWatcher;
    private static boolean _ConnectivityAction_VPN;
    private static boolean _ConnectivityAction_WifiCellular;
    private static boolean _IsRunningTraceRoute;
    private static ConnectivityManager.NetworkCallback _NetworkCallbackCellular;
    private static ConnectivityManager.NetworkCallback _NetworkCallbackVPN;
    private static ConnectivityManager.NetworkCallback _NetworkCallbackWifi;
    private static volatile boolean _NetworkCallbacksForMonitor;
    private static volatile boolean _NetworkCallbacksForRequest;
    private static FFPhoneStateListener _PhoneStateListener;
    private static FFTelephonyCallback _TelephonyCallback;
    private static WifiManager _WifiManager;
    private static Network _WifiNetwork;
    private static boolean canHandleLowMemroy;
    private static boolean shouldReportBattery;
    public static HashMap<String, String> OpenedWithParams = new HashMap<>();
    private static boolean _PendingSelectImageFromAlbum = false;
    private static Handler handler = new Handler();

    private static class FFPhoneStateListener extends PhoneStateListener {
        private FFPhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDataConnectionStateChanged(int i2, int i3) {
            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.DATA_CONNECTION_STATE_CHANGED, FFAPI.getDataNetworkTypeString(i3) + "|" + FFAPI.getDataNetworkStateString(i2));
        }
    }

    private static class FFTelephonyCallback extends TelephonyCallback implements TelephonyCallback.DataConnectionStateListener {
        private FFTelephonyCallback() {
        }

        @Override // android.telephony.TelephonyCallback.DataConnectionStateListener
        public void onDataConnectionStateChanged(int i2, int i3) {
            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.DATA_CONNECTION_STATE_CHANGED, FFAPI.getDataNetworkTypeString(i3) + "|" + FFAPI.getDataNetworkStateString(i2));
        }
    }

    private static class NetworkCallbackEvent {
        public int Capability_Internet;
        public int Capability_NotMetered;
        public int Capability_NotVPN;
        public int Capability_Validated;
        public String Event;
        public int Transport_Cellular;
        public int Transport_VPN;
        public int Transport_Wifi;
        public String Type;

        public NetworkCallbackEvent(String str, String str2) {
            this(str, str2, 0, 0, 0, 0, 0, 0, 0);
        }

        public NetworkCallbackEvent(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.Type = str;
            this.Event = str2;
            this.Capability_Internet = i2;
            this.Capability_Validated = i3;
            this.Transport_Wifi = i4;
            this.Transport_Cellular = i5;
            this.Transport_VPN = i6;
            this.Capability_NotMetered = i7;
            this.Capability_NotVPN = i8;
        }
    }

    private static class ProcessMemoryInfo {
        public int dalvikPrivateDirty;
        public int dalvikPss;
        public int dalvikSharedDirty;
        public int nativePrivateDirty;
        public int nativePss;
        public int nativeSharedDirty;
        public int otherPrivateDirty;
        public int otherPss;
        public int otherSharedDirty;
        public int totalPrivateClean;
        public int totalPrivateDirty;
        public int totalPss;
        public int totalSharedClean;
        public int totalSharedDirty;
        public int totalSwappablePss;

        private ProcessMemoryInfo() {
        }
    }

    static {
        Hashtable<String, String> hashtable = new Hashtable<>();
        PermissionRationales = hashtable;
        hashtable.put("android.permission.READ_EXTERNAL_STORAGE", "permission_rationale_external_storage");
        hashtable.put("android.permission.WRITE_EXTERNAL_STORAGE", "permission_rationale_external_storage");
        hashtable.put("android.permission.READ_PHONE_STATE", "permission_rationale_phone_state");
        hashtable.put("android.permission.RECORD_AUDIO", "permission_rationale_record_audio");
        hashtable.put("android.permission.BLUETOOTH_CONNECT", "permission_rationale_bluetooth_connect");
        _NetworkCallbackWifi = null;
        _NetworkCallbackCellular = null;
        _NetworkCallbackVPN = null;
        _NetworkCallbacksForMonitor = false;
        _NetworkCallbacksForRequest = false;
        canHandleLowMemroy = false;
        shouldReportBattery = false;
        _WifiManager = null;
        _IsRunningTraceRoute = false;
    }

    public static boolean IsGooglePlayServicesAvailable() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MainActivity) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    static int R(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, FreeFireBuildVariant.GetPackageName());
    }

    static int R_drawable(Context context, String str) {
        return R(context, "drawable", str);
    }

    static int R_string(Context context, String str) {
        return R(context, "string", str);
    }

    static String R_string_toString(Context context, String str) {
        return R_toString(context, R_string(context, str));
    }

    static String R_toString(Context context, int i2) {
        return context.getResources().getString(i2);
    }

    private static synchronized void _createNetworkCallbacks() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (_NetworkCallbackWifi == null) {
            _NetworkCallbackWifi = new ConnectivityManager.NetworkCallback() { // from class: com.dts.freefireth.FFAPI.5
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    FFAPI.set_WifiNetwork(network);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_WIFI, FFAPI.NETWORK_CALLBACK_EVENT_AVAILABLE)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onBlockedStatusChanged(Network network, boolean z) {
                    super.onBlockedStatusChanged(network, z);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_WIFI, z ? FFAPI.NETWORK_CALLBACK_EVENT_BLOCKED : FFAPI.NETWORK_CALLBACK_EVENT_UNBLOCKED)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    if (networkCapabilities != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 29) {
                            try {
                                WifiInfo wifiInfo = (WifiInfo) networkCapabilities.getTransportInfo();
                                if (i2 < 30) {
                                    FFAPI.WifiSignalLevel = WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 100) / 100;
                                } else {
                                    if (FFAPI._WifiManager == null) {
                                        WifiManager unused = FFAPI._WifiManager = (WifiManager) FFAPI.MainActivity.getApplicationContext().getSystemService("wifi");
                                    }
                                    FFAPI.WifiSignalLevel = FFAPI._WifiManager.calculateSignalLevel(wifiInfo.getRssi()) / FFAPI._WifiManager.getMaxSignalLevel();
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        networkCapabilities.hasCapability(11);
                        FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_WIFI, FFAPI.NETWORK_CALLBACK_EVENT_CAPABILITIES_CHANGED, networkCapabilities.hasCapability(12) ? 1 : -1, networkCapabilities.hasCapability(16) ? 1 : -1, networkCapabilities.hasTransport(1) ? 1 : -1, networkCapabilities.hasTransport(0) ? 1 : -1, networkCapabilities.hasTransport(4) ? 1 : -1, networkCapabilities.hasCapability(11) ? 1 : -1, networkCapabilities.hasCapability(15) ? 1 : -1)));
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLosing(Network network, int i2) {
                    super.onLosing(network, i2);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_WIFI, FFAPI.NETWORK_CALLBACK_EVENT_LOSING)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    FFAPI.set_WifiNetwork(null);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_WIFI, FFAPI.NETWORK_CALLBACK_EVENT_LOST)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    super.onUnavailable();
                    FFAPI.set_WifiNetwork(null);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_WIFI, FFAPI.NETWORK_CALLBACK_EVENT_UNAVAILABLE)));
                }
            };
        }
        if (_NetworkCallbackCellular == null) {
            _NetworkCallbackCellular = new ConnectivityManager.NetworkCallback() { // from class: com.dts.freefireth.FFAPI.6
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    FFAPI.set_CellularNetwork(network);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_CELLULAR, FFAPI.NETWORK_CALLBACK_EVENT_AVAILABLE)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onBlockedStatusChanged(Network network, boolean z) {
                    super.onBlockedStatusChanged(network, z);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_CELLULAR, z ? FFAPI.NETWORK_CALLBACK_EVENT_BLOCKED : FFAPI.NETWORK_CALLBACK_EVENT_UNBLOCKED)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_CELLULAR, FFAPI.NETWORK_CALLBACK_EVENT_CAPABILITIES_CHANGED, networkCapabilities.hasCapability(12) ? 1 : -1, networkCapabilities.hasCapability(16) ? 1 : -1, networkCapabilities.hasTransport(1) ? 1 : -1, networkCapabilities.hasTransport(0) ? 1 : -1, networkCapabilities.hasTransport(4) ? 1 : -1, networkCapabilities.hasCapability(11) ? 1 : -1, networkCapabilities.hasCapability(15) ? 1 : -1)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLosing(Network network, int i2) {
                    super.onLosing(network, i2);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_CELLULAR, FFAPI.NETWORK_CALLBACK_EVENT_LOSING)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    FFAPI.set_CellularNetwork(null);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_CELLULAR, FFAPI.NETWORK_CALLBACK_EVENT_LOST)));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    super.onUnavailable();
                    FFAPI.set_CellularNetwork(null);
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_CELLULAR, FFAPI.NETWORK_CALLBACK_EVENT_UNAVAILABLE)));
                }
            };
        }
    }

    private static synchronized void _registerConnectivityAction() {
        if (_ConnectivityActionWatcher == null) {
            _ConnectivityActionWatcher = new BroadcastReceiver() { // from class: com.dts.freefireth.FFAPI.8
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    int i2;
                    int i3;
                    NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
                    int i4 = 0;
                    if (allNetworkInfo != null) {
                        int length = allNetworkInfo.length;
                        i2 = 0;
                        i3 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            NetworkInfo networkInfo = allNetworkInfo[i4];
                            if (networkInfo != null && networkInfo.isConnected()) {
                                int type = networkInfo.getType();
                                if (type == 0) {
                                    i3++;
                                } else if (type == 1) {
                                    i2++;
                                } else if (type == 17) {
                                    i5++;
                                }
                            }
                            i4++;
                        }
                        i4 = i5;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK_LEGACY, i4 + "|" + i2 + "|" + i3);
                }
            };
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                MainActivity.registerReceiver(_ConnectivityActionWatcher, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    private static synchronized void _registerNetworkCallbacks() {
        int i2 = Build.VERSION.SDK_INT;
        synchronized (FFAPI.class) {
            if (i2 < 21) {
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) MainActivity.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    builder.addCapability(12);
                    if (i2 >= 23) {
                        builder.addCapability(16);
                    }
                    builder.addTransportType(1);
                    connectivityManager.registerNetworkCallback(builder.build(), _NetworkCallbackWifi);
                } catch (Throwable th) {
                    Log.e(LOG_TAG, "ConnectivityManager.registerNetworkCallback wifi", th);
                }
                try {
                    NetworkRequest.Builder builder2 = new NetworkRequest.Builder();
                    builder2.addCapability(12);
                    if (i2 >= 23) {
                        builder2.addCapability(16);
                    }
                    builder2.addTransportType(0);
                    connectivityManager.registerNetworkCallback(builder2.build(), _NetworkCallbackCellular);
                } catch (Throwable th2) {
                    Log.e(LOG_TAG, "ConnectivityManager.registerNetworkCallback cellular", th2);
                }
            }
        }
    }

    private static synchronized void _unregisterConnectivityAction() {
        BroadcastReceiver broadcastReceiver = _ConnectivityActionWatcher;
        if (broadcastReceiver != null) {
            try {
                MainActivity.unregisterReceiver(broadcastReceiver);
            } catch (Throwable unused) {
            }
            _ConnectivityActionWatcher = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static synchronized void _unregisterNetworkCallbacks() {
        ConnectivityManager.NetworkCallback networkCallback;
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) MainActivity.getApplicationContext().getSystemService("connectivity");
        ConnectivityManager.NetworkCallback networkCallback2 = _NetworkCallbackWifi;
        if (networkCallback2 == null) {
            networkCallback = _NetworkCallbackCellular;
            if (networkCallback != null) {
                connectivityManager.unregisterNetworkCallback(networkCallback);
            }
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(networkCallback2);
        } catch (Throwable th) {
            Log.e(LOG_TAG, "ConnectivityManager.releaseNetworkCallbacks wifi", th);
        }
        networkCallback = _NetworkCallbackCellular;
        if (networkCallback != null) {
            try {
                connectivityManager.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th2) {
                Log.e(LOG_TAG, "ConnectivityManager.releaseNetworkCallbacks cellular", th2);
            }
        }
        return;
        throw th;
    }

    public static String bindSocket(int i2, int i3) {
        if (Build.VERSION.SDK_INT < 23) {
            return BIND_SOCKET_ERROR_SDK_INT;
        }
        Network network = null;
        if (i3 == 0) {
            network = get_WifiNetwork();
        } else if (i3 == 1) {
            network = get_CellularNetwork();
        }
        return network == null ? BIND_SOCKET_ERROR_NO_NET : bindSocket(i2, network);
    }

    private static String bindSocket(int i2, Network network) {
        if (Build.VERSION.SDK_INT < 23) {
            return BIND_SOCKET_ERROR_SDK_INT;
        }
        FileDescriptor fd = getFD(i2);
        if (fd == null) {
            Log.e(LOG_TAG, "bindSocket(), fail, no fd=" + i2);
            return BIND_SOCKET_ERROR_NO_FD;
        }
        try {
            network.bindSocket(fd);
            return "";
        } catch (SocketException e) {
            return e.getMessage().contains(BIND_SOCKET_ERROR_EPERM) ? BIND_SOCKET_ERROR_EPERM : "";
        } catch (Exception e2) {
            Log.e(LOG_TAG, "bindSocket() fd: " + i2, e2);
            return e2.getMessage();
        }
    }

    public static boolean checkFileExists(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean checkPackageName(String str) {
        PackageManager packageManager = MainActivity.getApplicationContext().getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        return (launchIntentForPackage == null || packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) ? false : true;
    }

    public static int checkPermission(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            return 0;
        }
        if (i2 >= 31 || !"android.permission.BLUETOOTH_CONNECT".equals(str)) {
            return a.a(MainActivity, str);
        }
        return 0;
    }

    public static void clearOpenedWith() {
        OpenedWithParams.clear();
        OpenedByNotifyType = -1;
        OpenedByUrl = "";
    }

    public static String convertFilePathToUri(String str, String str2) {
        Uri uriE = FileProvider.e(MainActivity, str2, new File(str));
        return uriE == null ? "" : uriE.toString();
    }

    public static String copyStringFromClipboard() {
        ClipData primaryClip;
        CharSequence text;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) MainActivity.getSystemService("clipboard");
            if (clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
                for (int i2 = 0; i2 < primaryClip.getItemCount(); i2++) {
                    ClipData.Item itemAt = primaryClip.getItemAt(i2);
                    if (itemAt != null && (text = itemAt.getText()) != null && text.length() > 0) {
                        return text.toString();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static void copyStringToClipboard(String str, String str2) {
        try {
            ((ClipboardManager) MainActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str2));
        } catch (Exception unused) {
        }
    }

    public static void doInAppReview() {
        FFMainActivity fFMainActivity = MainActivity;
        if (fFMainActivity == null) {
            return;
        }
        final com.google.android.play.core.review.a aVarA = b.a(fFMainActivity);
        aVarA.b().a(new j.d.a.d.a.f.a<ReviewInfo>() { // from class: com.dts.freefireth.FFAPI.13
            @Override // j.d.a.d.a.f.a
            public void onComplete(j.d.a.d.a.f.e<ReviewInfo> eVar) {
                if (eVar.g()) {
                    aVarA.a(FFAPI.MainActivity, eVar.e()).a(new j.d.a.d.a.f.a<Void>() { // from class: com.dts.freefireth.FFAPI.13.1
                        @Override // j.d.a.d.a.f.a
                        public void onComplete(j.d.a.d.a.f.e<Void> eVar2) {
                            if (eVar2.g()) {
                                FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.IN_APP_REVIEW_CALLBACK, FFAPI.gson().t(new InAppReviewResult()));
                                return;
                            }
                            InAppReviewResult inAppReviewResult = new InAppReviewResult();
                            inAppReviewResult.LaunchFailure = true;
                            if (eVar2.d() != null) {
                                inAppReviewResult.ExceptionType = eVar2.d().getClass().getCanonicalName();
                                inAppReviewResult.ExceptionMessage = eVar2.d().getMessage();
                            }
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.IN_APP_REVIEW_CALLBACK, FFAPI.gson().t(inAppReviewResult));
                        }
                    });
                    return;
                }
                InAppReviewResult inAppReviewResult = new InAppReviewResult();
                inAppReviewResult.RequestFailure = true;
                if (eVar.d() != null) {
                    inAppReviewResult.ExceptionType = eVar.d().getClass().getCanonicalName();
                    inAppReviewResult.ExceptionMessage = eVar.d().getMessage();
                }
                FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.IN_APP_REVIEW_CALLBACK, FFAPI.gson().t(inAppReviewResult));
            }
        });
    }

    public static void getAdvertisingId() {
        if (!isAdvertisingIdProviderAvailable()) {
            GetAdvertisingIdResult getAdvertisingIdResult = new GetAdvertisingIdResult();
            getAdvertisingIdResult.Exception = "!FFAPI.isAdvertisingIdProviderAvailable()";
            FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, ON_GET_ADVERTISING_ID, gson().t(getAdvertisingIdResult));
            return;
        }
        try {
            final j.d.b.a.a.a<h.a.a.b> aVarA = h.a.a.a.a(MainActivity.getApplicationContext());
            aVarA.a(new Runnable() { // from class: com.dts.freefireth.FFAPI.12
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        h.a.a.b bVar = (h.a.a.b) aVarA.get();
                        GetAdvertisingIdResult getAdvertisingIdResult2 = new GetAdvertisingIdResult();
                        getAdvertisingIdResult2.AdvertisingId = bVar.b();
                        getAdvertisingIdResult2.ProviderPackageName = bVar.c();
                        getAdvertisingIdResult2.IsLimitAdTrackingEnabled = bVar.d();
                        FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.ON_GET_ADVERTISING_ID, FFAPI.gson().t(getAdvertisingIdResult2));
                    } catch (Exception e) {
                        GetAdvertisingIdResult getAdvertisingIdResult3 = new GetAdvertisingIdResult();
                        getAdvertisingIdResult3.Exception = e.getMessage();
                        FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.ON_GET_ADVERTISING_ID, FFAPI.gson().t(getAdvertisingIdResult3));
                    }
                }
            }, a.i(MainActivity));
        } catch (Exception e) {
            GetAdvertisingIdResult getAdvertisingIdResult2 = new GetAdvertisingIdResult();
            getAdvertisingIdResult2.Exception = e.getMessage();
            FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, ON_GET_ADVERTISING_ID, gson().t(getAdvertisingIdResult2));
        }
    }

    public static int getAndroidManifestMetaData_Int(String str, String str2) {
        Bundle bundle;
        FFMainActivity fFMainActivity = MainActivity;
        if (fFMainActivity == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = fFMainActivity.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt(str2, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String getAndroidManifestMetaData_String(String str, String str2) {
        Bundle bundle;
        FFMainActivity fFMainActivity = MainActivity;
        if (fFMainActivity == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = fFMainActivity.getPackageManager().getApplicationInfo(str, 128);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString(str2);
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static float getAppMemory() {
        try {
            return ((ActivityManager) MainActivity.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPrivateDirty() / 1024.0f;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static float getAvailMemory() {
        try {
            ActivityManager activityManager = (ActivityManager) MainActivity.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem / 1024;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static long getAvailbleStorageByPath(String str) {
        long blockSize;
        long availableBlocks;
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }

    public static float getBatteryLevel() {
        return BatteryLevel;
    }

    public static String getBuildBoard() {
        return Build.BOARD;
    }

    public static String getBuildBootloader() {
        return Build.BOOTLOADER;
    }

    public static String getBuildBrand() {
        return Build.BRAND;
    }

    public static String getBuildDevice() {
        return Build.DEVICE;
    }

    public static String getBuildFingerPrint() {
        return Build.FINGERPRINT;
    }

    public static String getBuildHardware() {
        return Build.HARDWARE;
    }

    public static String getBuildManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getBuildModel() {
        return Build.MODEL;
    }

    public static String getBuildProduct() {
        return Build.PRODUCT;
    }

    public static String getBuildSerial() {
        return "";
    }

    public static String getBuildVariantPackageName() {
        return FreeFireBuildVariant.GetPackageName();
    }

    public static int getBuild_VERSION_SDK_INT() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean getCanHandleLowMemory() {
        return canHandleLowMemroy;
    }

    public static String[] getCodecsForMediaFormat_MimeType(String str, boolean z, boolean z2) {
        String str2 = str == null ? "" : str;
        ArrayList arrayList = new ArrayList();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 2;
        if (i2 >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (z2) {
                Object[] objArr = new Object[1];
                objArr[0] = codecInfos != null ? Integer.valueOf(codecInfos.length) : "null";
                nativeLog(String.format("@FFAPI.supportMediaFormat_MimeType: infos: %s", objArr));
            }
            int length = codecInfos.length;
            int i4 = 0;
            while (i4 < length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i4];
                if (z == mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (z2) {
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = mediaCodecInfo.getName();
                        objArr2[1] = Integer.valueOf(mediaCodecInfo.getSupportedTypes().length);
                        nativeLog(String.format("@FFAPI.supportMediaFormat_MimeType: info: %s supports %s types", objArr2));
                    }
                    int length2 = supportedTypes.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        String str3 = supportedTypes[i5];
                        MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
                        if (z2) {
                            nativeLog(String.format("@FFAPI.supportMediaFormat_MimeType: type: %s", str3));
                        }
                        if (str2.equals("") || str3.equals(str2)) {
                            arrayList.add(mediaCodecInfo.getName());
                        }
                        i5++;
                        codecInfos = mediaCodecInfoArr;
                    }
                }
                i4++;
                codecInfos = codecInfos;
                i3 = 2;
            }
        } else if (i2 >= 16) {
            int codecCount = MediaCodecList.getCodecCount();
            if (z2) {
                nativeLog(String.format("@FFAPI.supportMediaFormat_MimeType: infos: %s", Integer.valueOf(codecCount)));
            }
            for (int i6 = 0; i6 < codecCount; i6++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i6);
                if (z == codecInfoAt.isEncoder()) {
                    String[] supportedTypes2 = codecInfoAt.getSupportedTypes();
                    if (z2) {
                        nativeLog(String.format("@FFAPI.supportMediaFormat_MimeType: info: %s supports %s types", codecInfoAt.getName(), Integer.valueOf(supportedTypes2.length)));
                    }
                    for (String str4 : supportedTypes2) {
                        if (z2) {
                            nativeLog(String.format("@FFAPI.supportMediaFormat_MimeType: type: %s", str4));
                        }
                        if (str2.equals("") || str4.equals(str2)) {
                            arrayList.add(codecInfoAt.getName());
                        }
                    }
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String getCpuArchitecture() {
        try {
            return System.getProperty("os.arch");
        } catch (Exception unused) {
            return "";
        }
    }

    public static long getCpuCurrentFrequency(int i2) {
        return readSystemFileAsLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/scaling_cur_freq");
    }

    public static long getCpuMaxFrequency(int i2) {
        return readSystemFileAsLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
    }

    public static long getCpuMinFrequency(int i2) {
        return readSystemFileAsLong("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_min_freq");
    }

    public static int getCpus() {
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getDataNetworkStateString(int i2) {
        if (i2 == 0) {
            return "disconnected";
        }
        if (i2 == 1) {
            return "connecting";
        }
        if (i2 == 2) {
            return "connected";
        }
        if (i2 != 3) {
            return null;
        }
        return "suspended";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getDataNetworkTypeString(int i2) {
        if (i2 == 20) {
            return "5G";
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return null;
        }
    }

    public static String getExternalStorageDeviceSpace() {
        try {
            File file = new File(MainActivity.getExternalFilesDir(null).toString());
            StorageDeviceSpace storageDeviceSpace = new StorageDeviceSpace();
            storageDeviceSpace.Free = file.getFreeSpace();
            storageDeviceSpace.Total = file.getTotalSpace();
            return gson().t(storageDeviceSpace);
        } catch (Error | Exception unused) {
            return "";
        }
    }

    public static FileDescriptor getFD(int i2) {
        StringBuilder sb;
        String message;
        try {
            FileDescriptor fileDescriptor = new FileDescriptor();
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, i2);
            return fileDescriptor;
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append("bindSocket(), fetch fd fail, no access: ");
            message = e.getMessage();
            sb.append(message);
            Log.e(LOG_TAG, sb.toString());
            return null;
        } catch (IllegalArgumentException e2) {
            sb = new StringBuilder();
            sb.append("bindSocket(), fetch fd fail, ill arg: ");
            message = e2.getMessage();
            sb.append(message);
            Log.e(LOG_TAG, sb.toString());
            return null;
        } catch (NoSuchFieldException e3) {
            sb = new StringBuilder();
            sb.append("bindSocket(), fetch fd fail, no such field: ");
            message = e3.getMessage();
            sb.append(message);
            Log.e(LOG_TAG, sb.toString());
            return null;
        } catch (NullPointerException e4) {
            sb = new StringBuilder();
            sb.append("bindSocket(), fetch fd fail, null pointer: ");
            message = e4.getMessage();
            sb.append(message);
            Log.e(LOG_TAG, sb.toString());
            return null;
        } catch (Exception e5) {
            sb = new StringBuilder();
            sb.append("bindSocket(), fetch fd fail, ex: ");
            message = e5.getMessage();
            sb.append(message);
            Log.e(LOG_TAG, sb.toString());
            return null;
        }
    }

    public static String getGoogleAdvertisingId() {
        if (MainActivity == null) {
            return "";
        }
        GetAdvertisingIdResult getAdvertisingIdResult = new GetAdvertisingIdResult();
        try {
            j.d.a.c.a.a.a.C0230a c0230aB = j.d.a.c.a.a.a.b(MainActivity);
            getAdvertisingIdResult.AdvertisingId = c0230aB.a();
            getAdvertisingIdResult.IsLimitAdTrackingEnabled = c0230aB.b();
        } catch (Exception e) {
            getAdvertisingIdResult.Exception = e.getMessage();
        }
        return gson().t(getAdvertisingIdResult);
    }

    public static String getInternalStorageDeviceSpace() {
        try {
            File file = new File(MainActivity.getApplicationContext().getFilesDir().getAbsolutePath());
            StorageDeviceSpace storageDeviceSpace = new StorageDeviceSpace();
            storageDeviceSpace.Free = file.getFreeSpace();
            storageDeviceSpace.Total = file.getTotalSpace();
            return gson().t(storageDeviceSpace);
        } catch (Error | Exception unused) {
            return "";
        }
    }

    public static float getLowMemoryThreshold() {
        try {
            ActivityManager activityManager = (ActivityManager) MainActivity.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.threshold / 1024;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static String getMemoryInfo() {
        try {
            ActivityManager activityManager = (ActivityManager) MainActivity.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return gson().t(memoryInfo);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getNativeDir() {
        try {
            return MainActivity.getApplicationContext().getPackageResourcePath();
        } catch (Exception e) {
            Log.w(LOG_TAG, "@FFAPI.getNativeDir(): " + e.getMessage());
            return "";
        }
    }

    public static String getNativeLibraryDir() {
        try {
            return MainActivity.getApplicationInfo().nativeLibraryDir;
        } catch (Exception e) {
            Log.w(LOG_TAG, "@FFAPI.getNativeLibraryDir(): " + e.getMessage());
            return "";
        }
    }

    public static String getNetworkOperatorName() {
        TelephonyManager telephonyManager = (TelephonyManager) MainActivity.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    public static String getNetworkType() {
        boolean zHasTransport;
        boolean zHasTransport2;
        boolean zIsConnected;
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        Context applicationContext = MainActivity.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        boolean zHasTransport3 = false;
        if (i2 >= 29) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    try {
                        zHasTransport = networkCapabilities.hasTransport(1);
                    } catch (Throwable unused) {
                        zHasTransport = false;
                    }
                    try {
                        zHasTransport2 = networkCapabilities.hasTransport(4);
                    } catch (Throwable unused2) {
                        zHasTransport2 = false;
                    }
                    try {
                        zHasTransport3 = networkCapabilities.hasTransport(0);
                    } catch (Throwable unused3) {
                    }
                    zHasTransport3 |= zHasTransport | zHasTransport2;
                } else {
                    zHasTransport = false;
                }
            } catch (Throwable unused4) {
                return "Unknown";
            }
        } else {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    try {
                        zIsConnected = activeNetworkInfo.isConnected();
                    } catch (Throwable unused5) {
                        zIsConnected = false;
                    }
                    try {
                        zHasTransport3 = activeNetworkInfo.getType() == 1;
                    } catch (Throwable unused6) {
                    }
                    try {
                        activeNetworkInfo.getType();
                    } catch (Throwable unused7) {
                    }
                    try {
                        activeNetworkInfo.getType();
                    } catch (Throwable unused8) {
                    }
                    z = zHasTransport3;
                    zHasTransport3 = zIsConnected;
                } else {
                    z = false;
                }
                zHasTransport = z;
            } catch (Throwable unused9) {
                return "Unknown";
            }
        }
        if (!zHasTransport3) {
            return "Unknown";
        }
        if (zHasTransport) {
            return NETWORK_CALLBACK_TYPE_WIFI;
        }
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        if (a.a(MainActivity, "android.permission.READ_PHONE_STATE") == 0) {
            String dataNetworkTypeString = getDataNetworkTypeString(i2 >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
            if (dataNetworkTypeString != null && dataNetworkTypeString.length() > 0) {
                return dataNetworkTypeString;
            }
        }
        return NETWORK_CALLBACK_TYPE_CELLULAR;
    }

    public static String getOpenedWith() {
        OpenedWith openedWith = new OpenedWith();
        openedWith.Params = OpenedWithParams;
        openedWith.NotifyType = OpenedByNotifyType;
        openedWith.Url = OpenedByUrl;
        return gson().t(openedWith);
    }

    public static String getProcessMemoryInfo() {
        try {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) MainActivity.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
            ProcessMemoryInfo processMemoryInfo2 = new ProcessMemoryInfo();
            processMemoryInfo2.dalvikPrivateDirty = processMemoryInfo[0].dalvikPrivateDirty;
            processMemoryInfo2.dalvikPss = processMemoryInfo[0].dalvikPss;
            processMemoryInfo2.dalvikSharedDirty = processMemoryInfo[0].dalvikSharedDirty;
            processMemoryInfo2.nativePrivateDirty = processMemoryInfo[0].nativePrivateDirty;
            processMemoryInfo2.nativePss = processMemoryInfo[0].nativePss;
            processMemoryInfo2.nativeSharedDirty = processMemoryInfo[0].nativeSharedDirty;
            processMemoryInfo2.otherPrivateDirty = processMemoryInfo[0].otherPrivateDirty;
            processMemoryInfo2.otherPss = processMemoryInfo[0].otherPss;
            processMemoryInfo2.otherSharedDirty = processMemoryInfo[0].otherSharedDirty;
            processMemoryInfo2.totalPrivateDirty = processMemoryInfo[0].getTotalPrivateDirty();
            processMemoryInfo2.totalPss = processMemoryInfo[0].getTotalPss();
            processMemoryInfo2.totalSharedDirty = processMemoryInfo[0].getTotalSharedDirty();
            if (Build.VERSION.SDK_INT >= 19) {
                processMemoryInfo2.totalPrivateClean = processMemoryInfo[0].getTotalPrivateClean();
                processMemoryInfo2.totalSharedClean = processMemoryInfo[0].getTotalSharedClean();
                processMemoryInfo2.totalSwappablePss = processMemoryInfo[0].getTotalSwappablePss();
            }
            return gson().t(processMemoryInfo2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static long getSDCardAvailStorage() {
        long blockSize;
        long availableBlocks;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return availableBlocks * blockSize;
    }

    public static long getSDCardTotalStorage() {
        long blockSize;
        long blockCount;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            blockCount = statFs.getBlockCountLong();
        } else {
            blockSize = statFs.getBlockSize();
            blockCount = statFs.getBlockCount();
        }
        return blockSize * blockCount;
    }

    public static byte[] getSignature() {
        PackageManager packageManager;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        try {
            FFMainActivity fFMainActivity = MainActivity;
            if (fFMainActivity != null && (packageManager = fFMainActivity.getPackageManager()) != null && (packageInfo = packageManager.getPackageInfo(FreeFireBuildVariant.GetPackageName(), 64)) != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getString(String str, String str2, String[] strArr) {
        try {
            Class<?> clsLoadClass = MainActivity.getApplicationContext().getClassLoader().loadClass(str);
            Method method = clsLoadClass.getMethod(str2, String.class);
            String[] strArr2 = null;
            if (strArr != null) {
                strArr2 = new String[strArr.length];
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    strArr2[i2] = strArr[i2];
                }
            }
            return (String) method.invoke(clsLoadClass, strArr2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static long getSystemInnerAvailStorage() {
        long blockSize;
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static long getSystemInnerTotalStorage() {
        long blockSize;
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                blockCount = statFs.getBlockCountLong();
            } else {
                blockSize = statFs.getBlockSize();
                blockCount = statFs.getBlockCount();
            }
            return blockSize * blockCount;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String getSystemProperty(String str) {
        return getString("android.os.SystemProperties", "get", new String[]{str});
    }

    public static String getTelephonyManagerIMEI() {
        return "";
    }

    public static String getTelephonyManagerMEID() {
        return "";
    }

    public static String getTelephonyManagerSubscriberId() {
        return "";
    }

    public static long getTotalStorageByPath(String str) {
        long blockSize;
        long blockCount;
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            blockCount = statFs.getBlockCountLong();
        } else {
            blockSize = statFs.getBlockSize();
            blockCount = statFs.getBlockCount();
        }
        return blockSize * blockCount;
    }

    public static float getWifiSignalLevel() {
        return WifiSignalLevel;
    }

    private static synchronized Network get_CellularNetwork() {
        return _CellularNetwork;
    }

    private static synchronized Network get_WifiNetwork() {
        return _WifiNetwork;
    }

    public static void gotoApplicationDetailsSettings() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", MainActivity.getPackageName(), null));
        MainActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e gson() {
        if (GsonInstance == null) {
            GsonInstance = new e();
        }
        return GsonInstance;
    }

    public static boolean hasDisplayCutout() {
        return DisplayCutoutAPI.HasDisplayCutout();
    }

    public static boolean hasSystemFeature(String str) {
        if (str != null) {
            try {
                if (str.length() > 0 && MainActivity != null && !FFMainActivity.FFDestroying()) {
                    return MainActivity.getPackageManager().hasSystemFeature(str);
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean isAdvertisingIdProviderAvailable() {
        FFMainActivity fFMainActivity = MainActivity;
        if (fFMainActivity == null) {
            return false;
        }
        return h.a.a.a.d(fFMainActivity);
    }

    public static boolean isBatteryCharging() {
        return BatteryStatus == 2;
    }

    public static boolean isDebuggable() {
        FFMainActivity fFMainActivity = MainActivity;
        return (fFMainActivity == null || (fFMainActivity.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static int isPackageInstalled(String str) {
        if (str == null) {
            return 0;
        }
        try {
            MainActivity.getPackageManager().getPackageInfo(str, 128);
            return 1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        } catch (RuntimeException unused2) {
            return 0;
        }
    }

    public static boolean isVPN() {
        ConnectivityManager connectivityManager = (ConnectivityManager) MainActivity.getApplicationContext().getSystemService("connectivity");
        boolean zHasTransport = false;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        zHasTransport = networkCapabilities.hasTransport(4);
                    }
                    return zHasTransport;
                } catch (Throwable unused) {
                    return false;
                }
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 17) {
                zHasTransport = true;
            }
        } catch (Throwable unused2) {
        }
        return zHasTransport;
    }

    public static void nativeLog(String str) {
        Log.i(LOG_TAG, str);
    }

    public static void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 67136091 && _PendingSelectImageFromAlbum) {
            _PendingSelectImageFromAlbum = false;
            onSelectedImageFromAlbum(i3, intent);
        }
    }

    private static void onSelectedImageFromAlbum(int i2, Intent intent) {
        Bitmap bitmapDecodeBitmap;
        if (i2 == -1) {
            Uri data = intent.getData();
            try {
                bitmapDecodeBitmap = Build.VERSION.SDK_INT >= 28 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(MainActivity.getContentResolver(), data)) : MediaStore.Images.Media.getBitmap(MainActivity.getContentResolver(), data);
            } catch (IOException e) {
                e.printStackTrace();
                bitmapDecodeBitmap = null;
            }
            if (bitmapDecodeBitmap != null) {
                File file = new File(MainActivity.getExternalFilesDir(null), "selected_temp.png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    bitmapDecodeBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, "OnSelectedImageFromAlbum", file.getAbsolutePath());
            }
        }
        FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, "OnSelectedImageFromAlbum", "");
    }

    private static long readSystemFileAsLong(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            long j2 = Long.parseLong(randomAccessFile.readLine());
            randomAccessFile.close();
            return j2;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean relaunch(final long j2) {
        final AlarmManager alarmManager;
        try {
            FFMainActivity fFMainActivity = MainActivity;
            if (fFMainActivity == null || fFMainActivity.getPackageManager() == null || (alarmManager = (AlarmManager) MainActivity.getSystemService("alarm")) == null) {
                return false;
            }
            MainActivity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.FFAPI.11
                @Override // java.lang.Runnable
                public void run() {
                    FFMainActivity fFMainActivity2;
                    try {
                        try {
                            alarmManager.set(1, System.currentTimeMillis() + j2, PendingIntent.getActivity(FFAPI.MainActivity, 0, FFAPI.MainActivity.getIntent(), 0));
                            fFMainActivity2 = FFAPI.MainActivity;
                            if (fFMainActivity2 == null) {
                                return;
                            }
                        } catch (Exception e) {
                            Log.w(FFAPI.LOG_TAG, "@FFAPI.scheduleLaunch() relaunching: ", e);
                            fFMainActivity2 = FFAPI.MainActivity;
                            if (fFMainActivity2 == null) {
                                return;
                            }
                        }
                        fFMainActivity2.finish();
                    } catch (Throwable th) {
                        FFMainActivity fFMainActivity3 = FFAPI.MainActivity;
                        if (fFMainActivity3 != null) {
                            fFMainActivity3.finish();
                        }
                        throw th;
                    }
                }
            });
            return true;
        } catch (Exception e) {
            Log.w(LOG_TAG, "@FFAPI.scheduleLaunch()", e);
            return false;
        }
    }

    public static synchronized void releaseNetworks() {
        if (_NetworkCallbacksForRequest) {
            _NetworkCallbacksForRequest = false;
            _unregisterNetworkCallbacks();
            if (_NetworkCallbacksForMonitor) {
                _registerNetworkCallbacks();
            }
        }
    }

    public static synchronized boolean requestNetworks() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) MainActivity.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (!_NetworkCallbacksForRequest) {
            if (_NetworkCallbacksForMonitor) {
                _unregisterNetworkCallbacks();
            }
            _NetworkCallbacksForRequest = true;
            _createNetworkCallbacks();
            try {
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12);
                builder.addTransportType(1);
                connectivityManager.requestNetwork(builder.build(), _NetworkCallbackWifi);
            } catch (Throwable th) {
                Log.e(LOG_TAG, "ConnectivityManager.requestNetwork wifi", th);
            }
            try {
                NetworkRequest.Builder builder2 = new NetworkRequest.Builder();
                builder2.addCapability(12);
                builder2.addTransportType(0);
                connectivityManager.requestNetwork(builder2.build(), _NetworkCallbackCellular);
            } catch (Throwable th2) {
                Log.e(LOG_TAG, "ConnectivityManager.requestNetwork cellular", th2);
            }
        }
        return true;
    }

    public static void requestPermissions(String[] strArr, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.core.app.a.o(MainActivity, strArr, i2);
            return;
        }
        RequestPermissionResult requestPermissionResult = new RequestPermissionResult();
        requestPermissionResult.RequestCode = i2;
        for (String str : strArr) {
            requestPermissionResult.Results.put(str, 0);
        }
        FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, "onRequestPermissionsResult", new e().t(requestPermissionResult));
    }

    public static void saveImageToAlbum(final byte[] bArr, final String str, final String str2) {
        handler.post(new Runnable() { // from class: com.dts.freefireth.FFAPI.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentResolver contentResolver = FFAPI.MainActivity.getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_display_name", str);
                        contentValues.put("mime_type", "image/png");
                        contentValues.put("relative_path", "DCIM/FreeFire");
                        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
                        outputStreamOpenOutputStream.write(bArr);
                        outputStreamOpenOutputStream.flush();
                        outputStreamOpenOutputStream.close();
                    } else {
                        ContentResolver contentResolver2 = FFAPI.MainActivity.getContentResolver();
                        byte[] bArr2 = bArr;
                        MediaStore.Images.Media.insertImage(contentResolver2, BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length), str, str2);
                    }
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onSaveImageToAlbumResult", "");
                } catch (Exception e) {
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onSaveImageToAlbumResult", e.getMessage());
                }
            }
        });
    }

    public static void selectImageFromAlbum() {
        if (MainActivity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        _PendingSelectImageFromAlbum = true;
        MainActivity.startActivityForResult(Intent.createChooser(intent, null), REQUEST_CODE_SELECT_IMAGE_FROM_ALBUM);
    }

    public static void sendBroadcast(final String str, final String str2, final String str3) {
        MainActivity.runOnUiThread(new Runnable() { // from class: com.dts.freefireth.FFAPI.10
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction(str2);
                String str4 = str;
                if (str4 != null && str4.length() > 0) {
                    intent.setPackage(str);
                }
                String str5 = str3;
                if (str5 != null && str5.length() > 0) {
                    try {
                        Hashtable hashtable = (Hashtable) FFAPI.gson().k(str3, new Hashtable(0).getClass());
                        if (hashtable != null) {
                            for (Map.Entry entry : hashtable.entrySet()) {
                                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    } catch (Exception e) {
                        Log.w(FFAPI.LOG_TAG, "@FFAPI.sendBroadcast() exception while parsing JSON: " + e.getMessage() + ": " + str3);
                    }
                }
                FFAPI.MainActivity.sendBroadcast(intent);
            }
        });
    }

    public static boolean sendIntent(String str, String str2, String str3, boolean z, String str4) {
        return sendIntent(str, str2, str3, z, str4, null, null);
    }

    public static boolean sendIntent(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str2);
        if (z) {
            intent.putExtra(str3, Uri.parse(str4));
            intent.addFlags(1);
        } else {
            intent.putExtra(str3, str4);
        }
        if (str5 != null && str5.length() > 0 && str6 != null && str6.length() > 0) {
            intent.setComponent(new ComponentName(str5, str6));
        }
        Intent intentCreateChooser = Intent.createChooser(intent, str);
        intentCreateChooser.setFlags(intentCreateChooser.getFlags() | 268435456);
        if (intentCreateChooser == null || intentCreateChooser.resolveActivity(MainActivity.getPackageManager()) == null) {
            return false;
        }
        MainActivity.startActivity(intentCreateChooser);
        return true;
    }

    public static void setCanHandleLowMemory(boolean z) {
        canHandleLowMemroy = z;
    }

    public static void setDebugDisplayCutout(boolean z) {
        DisplayCutoutAPI.SetDebug(z);
    }

    public static void setUnitySendMessageGameObjectName(String str) {
        UnitySendMessageGameObjectName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void set_CellularNetwork(Network network) {
        _CellularNetwork = network;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void set_WifiNetwork(Network network) {
        _WifiNetwork = network;
    }

    public static boolean shouldShowRequestPermissionRationale(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            return false;
        }
        if (i2 >= 31 || !"android.permission.BLUETOOTH_CONNECT".equals(str)) {
            return androidx.core.app.a.p(MainActivity, str);
        }
        return false;
    }

    public static void showAlertDialog(String str, String str2, String str3, String str4, String str5, final String str6) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity);
        if (str != null && str.length() > 0) {
            builder.setTitle(str);
        }
        if (str2 != null && str2.length() > 0) {
            builder.setMessage(str2);
        }
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        if (str3 != null && str3.length() > 0) {
            builder.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.dts.freefireth.FFAPI.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onAlertDialogPositiveButtonClick", "" + str6);
                }
            });
        }
        if (str4 != null && str4.length() > 0) {
            builder.setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.dts.freefireth.FFAPI.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onAlertDialogNegativeButtonClick", "" + str6);
                }
            });
        }
        if (str5 != null && str5.length() > 0) {
            builder.setNeutralButton(str5, new DialogInterface.OnClickListener() { // from class: com.dts.freefireth.FFAPI.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, "onAlertDialogNeutralButtonClick", "" + str6);
                }
            });
        }
        builder.setCancelable(false);
        builder.show();
    }

    public static void showGotoApplicationDetailsSettingsAlertDialog(String str, String str2, boolean z) {
        String string;
        if (!z) {
            showAlertDialog(R_string_toString(MainActivity, "permission_goto_application_details_settings_title"), R_string_toString(MainActivity, "permission_goto_application_details_settings_or_later"), R_string_toString(MainActivity, "permission_goto_application_details_settings_or_later_yes"), R_string_toString(MainActivity, "permission_goto_application_details_settings_or_later_no"), null, str2);
            return;
        }
        try {
            PermissionInfo permissionInfo = MainActivity.getPackageManager().getPermissionInfo(str, 0);
            string = (Build.VERSION.SDK_INT >= 29 ? permissionInfo.loadLabel(MainActivity.getPackageManager()) : MainActivity.getPackageManager().getPermissionGroupInfo(permissionInfo.group, 0).loadLabel(MainActivity.getPackageManager())).toString();
        } catch (Exception unused) {
            string = "?";
        }
        showAlertDialog(R_string_toString(MainActivity, "permission_goto_application_details_settings_title"), String.format(R_string_toString(MainActivity, "permission_goto_application_details_settings"), string), R_string_toString(MainActivity, "permission_goto_application_details_settings_yes"), R_string_toString(MainActivity, "permission_goto_application_details_settings_no"), null, str2);
    }

    public static void showRequestPermissionRationaleAlertDialog(String str, boolean z, String str2, boolean z2) {
        String strR_string_toString;
        String strR_string_toString2;
        String strR_string_toString3;
        String strR_string_toString4;
        Hashtable<String, String> hashtable = PermissionRationales;
        if (!hashtable.containsKey(str)) {
            FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, "onAlertDialogNegativeButtonClick", "" + str2);
        }
        if (z2) {
            strR_string_toString = R_string_toString(MainActivity, "permission_rationale_title");
            strR_string_toString2 = R_string_toString(MainActivity, hashtable.get(str));
            strR_string_toString3 = R_string_toString(MainActivity, z ? "permission_rationale_critical_yes" : "permission_rationale_trivial_yes");
            strR_string_toString4 = R_string_toString(MainActivity, z ? "permission_rationale_critical_no" : "permission_rationale_trivial_no");
        } else {
            strR_string_toString = R_string_toString(MainActivity, "permission_rationale_title");
            strR_string_toString2 = R_string_toString(MainActivity, hashtable.get(str));
            strR_string_toString3 = R_string_toString(MainActivity, "permission_rationale_neutral");
            strR_string_toString4 = null;
        }
        showAlertDialog(strR_string_toString, strR_string_toString2, strR_string_toString3, strR_string_toString4, null, str2);
    }

    public static void showRequestPermissionRationalesAlertDialog(String str) {
        showAlertDialog(R_string_toString(MainActivity, "permission_rationale_title"), R_string_toString(MainActivity, "permission_rationales"), R_string_toString(MainActivity, "permission_rationale_neutral"), null, null, str);
    }

    public static synchronized void startMonitoringDataConnectionState() {
        String str;
        String str2;
        TelephonyManager telephonyManager = (TelephonyManager) MainActivity.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 31) {
            if (_TelephonyCallback == null) {
                _TelephonyCallback = new FFTelephonyCallback();
            }
            try {
                telephonyManager.registerTelephonyCallback(MainActivity.getMainExecutor(), _TelephonyCallback);
            } catch (Throwable th) {
                th = th;
                str = LOG_TAG;
                str2 = "TelephonyManager.registerTelephonyCallback";
                Log.e(str, str2, th);
            }
        } else {
            if (_PhoneStateListener == null) {
                _PhoneStateListener = new FFPhoneStateListener();
            }
            try {
                telephonyManager.listen(_PhoneStateListener, 64);
            } catch (Throwable th2) {
                th = th2;
                str = LOG_TAG;
                str2 = "TelephonyManager.listen LISTEN_DATA_CONNECTION_STATE";
                Log.e(str, str2, th);
            }
        }
    }

    public static synchronized void startMonitoringNetworks() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (!_NetworkCallbacksForMonitor) {
                _NetworkCallbacksForMonitor = true;
                if (!_NetworkCallbacksForRequest) {
                    _createNetworkCallbacks();
                    _registerNetworkCallbacks();
                }
            }
        } else if (!_ConnectivityAction_WifiCellular) {
            _ConnectivityAction_WifiCellular = true;
            if (!_ConnectivityAction_VPN) {
                _registerConnectivityAction();
            }
        }
    }

    public static synchronized void startMonitoringVPN() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                if (_NetworkCallbackVPN == null) {
                    _NetworkCallbackVPN = new ConnectivityManager.NetworkCallback() { // from class: com.dts.freefireth.FFAPI.7
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onAvailable(Network network) {
                            super.onAvailable(network);
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_VPN, FFAPI.NETWORK_CALLBACK_EVENT_AVAILABLE)));
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onBlockedStatusChanged(Network network, boolean z) {
                            super.onBlockedStatusChanged(network, z);
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_VPN, z ? FFAPI.NETWORK_CALLBACK_EVENT_BLOCKED : FFAPI.NETWORK_CALLBACK_EVENT_UNBLOCKED)));
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                            super.onCapabilitiesChanged(network, networkCapabilities);
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_VPN, FFAPI.NETWORK_CALLBACK_EVENT_CAPABILITIES_CHANGED, networkCapabilities.hasCapability(12) ? 1 : -1, networkCapabilities.hasCapability(16) ? 1 : -1, networkCapabilities.hasTransport(1) ? 1 : -1, networkCapabilities.hasTransport(0) ? 1 : -1, networkCapabilities.hasTransport(4) ? 1 : -1, networkCapabilities.hasCapability(11) ? 1 : -1, networkCapabilities.hasCapability(15) ? 1 : -1)));
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLosing(Network network, int i2) {
                            super.onLosing(network, i2);
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_VPN, FFAPI.NETWORK_CALLBACK_EVENT_LOSING)));
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLost(Network network) {
                            super.onLost(network);
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_VPN, FFAPI.NETWORK_CALLBACK_EVENT_LOST)));
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onUnavailable() {
                            super.onUnavailable();
                            FFMainActivity.FFSendToUnity(FFAPI.UnitySendMessageGameObjectName, FFAPI.NETWORK_CALLBACK, FFAPI.gson().t(new NetworkCallbackEvent(FFAPI.NETWORK_CALLBACK_TYPE_VPN, FFAPI.NETWORK_CALLBACK_EVENT_UNAVAILABLE)));
                        }
                    };
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) MainActivity.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkRequest.Builder builder = new NetworkRequest.Builder();
                        builder.addCapability(12);
                        builder.removeCapability(15);
                        builder.addTransportType(4);
                        connectivityManager.registerNetworkCallback(builder.build(), _NetworkCallbackVPN);
                    } catch (Throwable th) {
                        Log.e(LOG_TAG, "ConnectivityManager.registerNetworkCallback vpn", th);
                    }
                }
            } else if (!_ConnectivityAction_VPN) {
                _ConnectivityAction_VPN = true;
                if (!_ConnectivityAction_WifiCellular) {
                    _registerConnectivityAction();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void stopMonitoringDataConnectionState() {
        String str;
        String str2;
        TelephonyManager telephonyManager = (TelephonyManager) MainActivity.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 31) {
            FFTelephonyCallback fFTelephonyCallback = _TelephonyCallback;
            if (fFTelephonyCallback != null) {
                try {
                    telephonyManager.unregisterTelephonyCallback(fFTelephonyCallback);
                } catch (Throwable th) {
                    th = th;
                    str = LOG_TAG;
                    str2 = "TelephonyManager.unregisterTelephonyCallback";
                    Log.e(str, str2, th);
                }
            }
        } else {
            FFPhoneStateListener fFPhoneStateListener = _PhoneStateListener;
            if (fFPhoneStateListener != null) {
                try {
                    telephonyManager.listen(fFPhoneStateListener, 0);
                } catch (Throwable th2) {
                    th = th2;
                    str = LOG_TAG;
                    str2 = "TelephonyManager.listen LISTEN_NONE";
                    Log.e(str, str2, th);
                }
            }
        }
    }

    public static synchronized void stopMonitoringNetworks() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (_NetworkCallbacksForMonitor) {
                _NetworkCallbacksForMonitor = false;
                if (!_NetworkCallbacksForMonitor && !_NetworkCallbacksForRequest) {
                    _unregisterNetworkCallbacks();
                }
            }
        } else if (_ConnectivityAction_WifiCellular) {
            _ConnectivityAction_WifiCellular = false;
            if (!_ConnectivityAction_VPN) {
                _unregisterConnectivityAction();
            }
        }
    }

    public static synchronized void stopMonitoringVPN() {
        if (Build.VERSION.SDK_INT >= 21) {
            ConnectivityManager connectivityManager = (ConnectivityManager) MainActivity.getApplicationContext().getSystemService("connectivity");
            ConnectivityManager.NetworkCallback networkCallback = _NetworkCallbackVPN;
            if (networkCallback != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                } catch (Throwable th) {
                    Log.e(LOG_TAG, "ConnectivityManager.unregisterNetworkCallback vpn", th);
                }
            }
        } else if (_ConnectivityAction_VPN) {
            _ConnectivityAction_VPN = false;
            if (!_ConnectivityAction_WifiCellular && 0 == 0) {
                _unregisterConnectivityAction();
            }
        }
    }

    public static boolean supportBindSocket() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static void toggleBatteryReport(boolean z) {
        shouldReportBattery = z;
    }

    public static void traceRoute(final String str, int i2) {
        if (_IsRunningTraceRoute) {
            Log.e("Unity", "<Tracert> Duplicate Call ");
            return;
        }
        try {
            Traceroute traceroute = new Traceroute(new Traceroute.Config(str).setThreadSize(i2), new TracerouteCallback() { // from class: com.dts.freefireth.FFAPI.9
                @Override // com.dts.freefireth.FFNetCommand.TraceRoute.TracerouteCallback
                public void onTracerouteFinish(TracerouteResult tracerouteResult, UCommandStatus uCommandStatus) {
                    String str2;
                    String string;
                    boolean unused = FFAPI._IsRunningTraceRoute = false;
                    if (tracerouteResult == null) {
                        str2 = "result = null";
                    } else {
                        str2 = "result node length " + tracerouteResult.getTracerouteNodeResults().size();
                    }
                    Log.i("Unity", str2);
                    if (tracerouteResult == null || uCommandStatus != UCommandStatus.CMD_STATUS_SUCCESSFUL) {
                        if (tracerouteResult == null) {
                            uCommandStatus = UCommandStatus.CMD_STATUS_ERROE_NULL_RESULT;
                        }
                        string = "ErrorCode:" + uCommandStatus.ordinal() + "|TargetIP:" + str;
                    } else {
                        string = tracerouteResult.toString();
                    }
                    FFMainActivity.FFSendToUnity("__NetworkDetection__", "OnTraceRouteCompleted", string);
                }
            });
            _IsRunningTraceRoute = true;
            AsyncTask.execute(traceroute);
        } catch (Exception e) {
            Log.e("Unity", "<Tracert> TraceRoute With Exception " + e);
        }
    }

    static void updateBattery(Intent intent) {
        BatteryStatus = intent.getIntExtra("status", 1);
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra <= 0 || intExtra2 <= 0) {
            BatteryLevel = -1.0f;
        } else {
            BatteryLevel = intExtra / intExtra2;
        }
        if (shouldReportBattery) {
            FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, "OnBatteryChargingChanged", "" + isBatteryCharging());
            FFMainActivity.FFSendToUnity(UnitySendMessageGameObjectName, "OnBatteryLevelChanged", "" + getBatteryLevel());
        }
    }

    static void updateWifi(Intent intent) {
        if (_WifiManager == null) {
            _WifiManager = (WifiManager) MainActivity.getApplicationContext().getSystemService("wifi");
        }
        if (!_WifiManager.isWifiEnabled()) {
            WifiSignalLevel = -1.0f;
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            WifiInfo connectionInfo = _WifiManager.getConnectionInfo();
            if (connectionInfo == null) {
                WifiSignalLevel = -1.0f;
            } else if (i2 < 30) {
                WifiSignalLevel = WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100) / 100;
            } else {
                WifiSignalLevel = _WifiManager.calculateSignalLevel(connectionInfo.getRssi()) / _WifiManager.getMaxSignalLevel();
            }
        }
    }
}
