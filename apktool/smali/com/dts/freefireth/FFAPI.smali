.class public Lcom/dts/freefireth/FFAPI;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;,
        Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;,
        Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;,
        Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;
    }
.end annotation


# static fields
.field private static final BIND_SOCKET_CELLULAR:I = 0x1

.field private static final BIND_SOCKET_ERROR_EPERM:Ljava/lang/String; = "EPERM"

.field private static final BIND_SOCKET_ERROR_NO_FD:Ljava/lang/String; = "NO_FD"

.field private static final BIND_SOCKET_ERROR_NO_NET:Ljava/lang/String; = "NO_NET"

.field private static final BIND_SOCKET_ERROR_SDK_INT:Ljava/lang/String; = "SDK_INT"

.field private static final BIND_SOCKET_WIFI:I = 0x0

.field public static BatteryLevel:F = -1.0f

.field public static BatteryStatus:I = 0x1

.field private static final DATA_CONNECTION_STATE_CHANGED:Ljava/lang/String; = "OnDataConnectionStateChanged"

.field private static GsonInstance:Lj/d/d/e; = null

.field private static final IN_APP_REVIEW_CALLBACK:Ljava/lang/String; = "onInAppReviewCallback"

.field public static final LOG_TAG:Ljava/lang/String; = "FreeFire"

.field public static MainActivity:Lcom/dts/freefireth/FFMainActivity; = null

.field public static MetaDataGarenaAppId:Ljava/lang/String; = null

.field private static final NETWORK_CALLBACK:Ljava/lang/String; = "OnNetworkCallback"

.field private static final NETWORK_CALLBACK_EVENT_AVAILABLE:Ljava/lang/String; = "available"

.field private static final NETWORK_CALLBACK_EVENT_BLOCKED:Ljava/lang/String; = "blocked"

.field private static final NETWORK_CALLBACK_EVENT_CAPABILITIES_CHANGED:Ljava/lang/String; = "capabilities_changed"

.field private static final NETWORK_CALLBACK_EVENT_LOSING:Ljava/lang/String; = "losing"

.field private static final NETWORK_CALLBACK_EVENT_LOST:Ljava/lang/String; = "lost"

.field private static final NETWORK_CALLBACK_EVENT_UNAVAILABLE:Ljava/lang/String; = "unavailable"

.field private static final NETWORK_CALLBACK_EVENT_UNBLOCKED:Ljava/lang/String; = "unblocked"

.field private static final NETWORK_CALLBACK_LEGACY:Ljava/lang/String; = "OnNetworkCallbackLegacy"

.field private static final NETWORK_CALLBACK_TYPE_CELLULAR:Ljava/lang/String; = "Cellular"

.field private static final NETWORK_CALLBACK_TYPE_VPN:Ljava/lang/String; = "VPN"

.field private static final NETWORK_CALLBACK_TYPE_WIFI:Ljava/lang/String; = "WIFI"

.field private static final ON_GET_ADVERTISING_ID:Ljava/lang/String; = "onGetAdvertisingId"

.field public static OpenedByNotifyType:I = -0x1

.field public static OpenedByUrl:Ljava/lang/String; = ""

.field public static OpenedWithParams:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final PermissionRationales:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final REQUEST_CODE_SELECT_IMAGE_FROM_ALBUM:I = 0x4006a5b

.field public static UnitySendMessageGameObjectName:Ljava/lang/String; = null

.field public static WifiSignalLevel:F = -1.0f

.field private static _CellularNetwork:Landroid/net/Network;

.field private static _ConnectivityActionWatcher:Landroid/content/BroadcastReceiver;

.field private static _ConnectivityAction_VPN:Z

.field private static _ConnectivityAction_WifiCellular:Z

.field private static _IsRunningTraceRoute:Z

.field private static _NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;

.field private static _NetworkCallbackVPN:Landroid/net/ConnectivityManager$NetworkCallback;

.field private static _NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;

.field private static volatile _NetworkCallbacksForMonitor:Z

.field private static volatile _NetworkCallbacksForRequest:Z

.field private static _PendingSelectImageFromAlbum:Z

.field private static _PhoneStateListener:Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;

.field private static _TelephonyCallback:Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;

.field private static _WifiManager:Landroid/net/wifi/WifiManager;

.field private static _WifiNetwork:Landroid/net/Network;

.field private static canHandleLowMemroy:Z

.field private static handler:Landroid/os/Handler;

.field private static shouldReportBattery:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/dts/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/dts/freefireth/FFAPI;->_PendingSelectImageFromAlbum:Z

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    sput-object v1, Lcom/dts/freefireth/FFAPI;->handler:Landroid/os/Handler;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    sput-object v1, Lcom/dts/freefireth/FFAPI;->PermissionRationales:Ljava/util/Hashtable;

    const-string v2, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v3, "permission_rationale_external_storage"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.permission.READ_PHONE_STATE"

    const-string v3, "permission_rationale_phone_state"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.permission.RECORD_AUDIO"

    const-string v3, "permission_rationale_record_audio"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.permission.BLUETOOTH_CONNECT"

    const-string v3, "permission_rationale_bluetooth_connect"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackVPN:Landroid/net/ConnectivityManager$NetworkCallback;

    sput-boolean v0, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    sput-boolean v0, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    sput-boolean v0, Lcom/dts/freefireth/FFAPI;->canHandleLowMemroy:Z

    sput-boolean v0, Lcom/dts/freefireth/FFAPI;->shouldReportBattery:Z

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    sput-boolean v0, Lcom/dts/freefireth/FFAPI;->_IsRunningTraceRoute:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IsGooglePlayServicesAvailable()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v1

    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :catchall_0
    :cond_0
    return v0
.end method

.method static R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {}, Lcom/dts/freefireth/variant/FreeFireBuildVariant;->GetPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2, p1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static R_drawable(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    const-string v0, "drawable"

    invoke-static {p0, v0, p1}, Lcom/dts/freefireth/FFAPI;->R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static R_string(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    const-string v0, "string"

    invoke-static {p0, v0, p1}, Lcom/dts/freefireth/FFAPI;->R(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method static R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/dts/freefireth/FFAPI;->R_string(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    invoke-static {p0, p1}, Lcom/dts/freefireth/FFAPI;->R_toString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static R_toString(Landroid/content/Context;I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static declared-synchronized _createNetworkCallbacks()V
    .locals 3

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x15

    if-ge v1, v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v1, :cond_1

    new-instance v1, Lcom/dts/freefireth/FFAPI$5;

    invoke-direct {v1}, Lcom/dts/freefireth/FFAPI$5;-><init>()V

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;

    :cond_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v1, :cond_2

    new-instance v1, Lcom/dts/freefireth/FFAPI$6;

    invoke-direct {v1}, Lcom/dts/freefireth/FFAPI$6;-><init>()V

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized _registerConnectivityAction()V
    .locals 4

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityActionWatcher:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_0

    new-instance v1, Lcom/dts/freefireth/FFAPI$8;

    invoke-direct {v1}, Lcom/dts/freefireth/FFAPI$8;-><init>()V

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityActionWatcher:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    sget-object v3, Lcom/dts/freefireth/FFAPI;->_ConnectivityActionWatcher:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized _registerNetworkCallbacks()V
    .locals 9

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-class v1, Lcom/dts/freefireth/FFAPI;

    monitor-enter v1

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    :try_start_0
    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v2, :cond_3

    const/16 v3, 0x10

    const/16 v4, 0x17

    const/16 v5, 0xc

    :try_start_1
    new-instance v6, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v6}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v6, v5}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    if-lt v0, v4, :cond_1

    invoke-virtual {v6, v3}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    :cond_1
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v6}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v6

    sget-object v7, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v2, v6, v7}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v6

    :try_start_2
    const-string v7, "FreeFire"

    const-string v8, "ConnectivityManager.registerNetworkCallback wifi"

    invoke-static {v7, v8, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_0
    :try_start_3
    new-instance v6, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v6}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v6, v5}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    if-lt v0, v4, :cond_2

    invoke-virtual {v6, v3}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v6}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    sget-object v3, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v2, v0, v3}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    const-string v2, "FreeFire"

    const-string v3, "ConnectivityManager.registerNetworkCallback cellular"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_3
    :goto_1
    monitor-exit v1

    return-void

    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static declared-synchronized _unregisterConnectivityAction()V
    .locals 3

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityActionWatcher:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    :try_start_1
    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v2, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    const/4 v1, 0x0

    :try_start_2
    sput-object v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityActionWatcher:Landroid/content/BroadcastReceiver;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized _unregisterNetworkCallbacks()V
    .locals 5

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v2, 0x15

    if-ge v1, v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    sget-object v2, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_3
    const-string v3, "FreeFire"

    const-string v4, "ConnectivityManager.releaseNetworkCallbacks wifi"

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    sget-object v2, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v2, :cond_2

    :try_start_4
    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_5
    const-string v2, "FreeFire"

    const-string v3, "ConnectivityManager.releaseNetworkCallbacks cellular"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method static synthetic access$000(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->getDataNetworkTypeString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->getDataNetworkStateString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Landroid/net/Network;)V
    .locals 0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->set_WifiNetwork(Landroid/net/Network;)V

    return-void
.end method

.method static synthetic access$300()Lj/d/d/e;
    .locals 1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400()Landroid/net/wifi/WifiManager;
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    return-object v0
.end method

.method static synthetic access$402(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiManager;
    .locals 0

    sput-object p0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    return-object p0
.end method

.method static synthetic access$500(Landroid/net/Network;)V
    .locals 0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->set_CellularNetwork(Landroid/net/Network;)V

    return-void
.end method

.method static synthetic access$902(Z)Z
    .locals 0

    sput-boolean p0, Lcom/dts/freefireth/FFAPI;->_IsRunningTraceRoute:Z

    return p0
.end method

.method public static bindSocket(II)Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const-string p0, "SDK_INT"

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/dts/freefireth/FFAPI;->get_CellularNetwork()Landroid/net/Network;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/dts/freefireth/FFAPI;->get_WifiNetwork()Landroid/net/Network;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_3

    const-string p0, "NO_NET"

    return-object p0

    :cond_3
    invoke-static {p0, v0}, Lcom/dts/freefireth/FFAPI;->bindSocket(ILandroid/net/Network;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static bindSocket(ILandroid/net/Network;)Ljava/lang/String;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const-string p0, "SDK_INT"

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->getFD(I)Ljava/io/FileDescriptor;

    move-result-object v0

    const-string v1, "FreeFire"

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "bindSocket(), fail, no fd="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "NO_FD"

    return-object p0

    :cond_1
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/Network;->bindSocket(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindSocket() fd: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/net/SocketException;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string p1, "EPERM"

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-object p1

    :cond_2
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static checkFileExists(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static checkPackageName(Ljava/lang/String;)Z
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_0

    const/high16 v1, 0x10000

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static checkPermission(Ljava/lang/String;)I
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-lt v0, v2, :cond_1

    const/16 v2, 0x1f

    if-ge v0, v2, :cond_0

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0, p0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    return v1
.end method

.method public static clearOpenedWith()V
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, -0x1

    sput v0, Lcom/dts/freefireth/FFAPI;->OpenedByNotifyType:I

    const-string v0, ""

    sput-object v0, Lcom/dts/freefireth/FFAPI;->OpenedByUrl:Ljava/lang/String;

    return-void
.end method

.method public static convertFilePathToUri(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0, p1, v0}, Landroidx/core/content/FileProvider;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static copyStringFromClipboard()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    invoke-virtual {v1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_2

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static copyStringToClipboard(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-static {p0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static doInAppReview()V
    .locals 3

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/play/core/review/b;->a(Landroid/content/Context;)Lcom/google/android/play/core/review/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/play/core/review/a;->b()Lj/d/a/d/a/f/e;

    move-result-object v1

    new-instance v2, Lcom/dts/freefireth/FFAPI$13;

    invoke-direct {v2, v0}, Lcom/dts/freefireth/FFAPI$13;-><init>(Lcom/google/android/play/core/review/a;)V

    invoke-virtual {v1, v2}, Lj/d/a/d/a/f/e;->a(Lj/d/a/d/a/f/a;)Lj/d/a/d/a/f/e;

    return-void
.end method

.method public static getAdvertisingId()V
    .locals 4

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->isAdvertisingIdProviderAvailable()Z

    move-result v0

    const-string v1, "onGetAdvertisingId"

    if-nez v0, :cond_0

    new-instance v0, Lcom/dts/freefireth/GetAdvertisingIdResult;

    invoke-direct {v0}, Lcom/dts/freefireth/GetAdvertisingIdResult;-><init>()V

    const-string v2, "!FFAPI.isAdvertisingIdProviderAvailable()"

    iput-object v2, v0, Lcom/dts/freefireth/GetAdvertisingIdResult;->Exception:Ljava/lang/String;

    sget-object v2, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v3

    invoke-virtual {v3, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lh/a/a/a;->a(Landroid/content/Context;)Lj/d/b/a/a/a;

    move-result-object v0

    new-instance v2, Lcom/dts/freefireth/FFAPI$12;

    invoke-direct {v2, v0}, Lcom/dts/freefireth/FFAPI$12;-><init>(Lj/d/b/a/a/a;)V

    sget-object v3, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v3}, Landroidx/core/content/a;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Lj/d/b/a/a/a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v2, Lcom/dts/freefireth/GetAdvertisingIdResult;

    invoke-direct {v2}, Lcom/dts/freefireth/GetAdvertisingIdResult;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/dts/freefireth/GetAdvertisingIdResult;->Exception:Ljava/lang/String;

    sget-object v0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v3

    invoke-virtual {v3, v2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static getAndroidManifestMetaData_Int(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v2, 0x80

    :try_start_0
    invoke-virtual {v0, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez p0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v1
.end method

.method public static getAndroidManifestMetaData_String(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v2, 0x80

    :try_start_0
    invoke-virtual {v0, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v1
.end method

.method public static getAppMemory()F
    .locals 4

    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v2, "activity"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    const/4 v2, 0x1

    new-array v2, v2, [I

    const/4 v3, 0x0

    aput v0, v2, v3

    invoke-virtual {v1, v2}, Landroid/app/ActivityManager;->getProcessMemoryInfo([I)[Landroid/os/Debug$MemoryInfo;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-virtual {v0}, Landroid/os/Debug$MemoryInfo;->getTotalPrivateDirty()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float v0, v0

    const/high16 v1, 0x44800000    # 1024.0f

    div-float/2addr v0, v1

    goto :goto_0

    :catch_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0
.end method

.method public static getAvailMemory()F
    .locals 4

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-float v0, v0

    goto :goto_0

    :catch_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0
.end method

.method public static getAvailbleStorageByPath(Ljava/lang/String;)J
    .locals 5

    new-instance v0, Landroid/os/StatFs;

    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt p0, v1, :cond_0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result p0

    int-to-long v3, p0

    :goto_0
    mul-long v1, v1, v3

    return-wide v1
.end method

.method public static getBatteryLevel()F
    .locals 1

    sget v0, Lcom/dts/freefireth/FFAPI;->BatteryLevel:F

    return v0
.end method

.method public static getBuildBoard()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildBootloader()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildBrand()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildDevice()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildFingerPrint()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildHardware()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildManufacturer()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildModel()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildProduct()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    return-object v0
.end method

.method public static getBuildSerial()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public static getBuildVariantPackageName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/dts/freefireth/variant/FreeFireBuildVariant;->GetPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getBuild_VERSION_SDK_INT()I
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method public static getCanHandleLowMemory()Z
    .locals 1

    sget-boolean v0, Lcom/dts/freefireth/FFAPI;->canHandleLowMemroy:Z

    return v0
.end method

.method public static getCodecsForMediaFormat_MimeType(Ljava/lang/String;ZZ)[Ljava/lang/String;
    .locals 17

    move/from16 v0, p1

    const-string v1, ""

    if-nez p0, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    const-string v6, "@FFAPI.supportMediaFormat_MimeType: type: %s"

    const/4 v7, 0x2

    const-string v8, "@FFAPI.supportMediaFormat_MimeType: info: %s supports %s types"

    const-string v9, "@FFAPI.supportMediaFormat_MimeType: infos: %s"

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-lt v4, v5, :cond_9

    new-instance v4, Landroid/media/MediaCodecList;

    invoke-direct {v4, v11}, Landroid/media/MediaCodecList;-><init>(I)V

    invoke-virtual {v4}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    move-result-object v4

    if-eqz p2, :cond_2

    new-array v5, v11, [Ljava/lang/Object;

    if-eqz v4, :cond_1

    array-length v12, v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_1

    :cond_1
    const-string v12, "null"

    :goto_1
    aput-object v12, v5, v10

    invoke-static {v9, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dts/freefireth/FFAPI;->nativeLog(Ljava/lang/String;)V

    :cond_2
    array-length v5, v4

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v5, :cond_11

    aget-object v12, v4, v9

    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v13

    if-eq v0, v13, :cond_4

    :cond_3
    move-object/from16 v16, v4

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v13

    if-eqz p2, :cond_5

    new-array v14, v7, [Ljava/lang/Object;

    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v14, v10

    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v15

    array-length v15, v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v14, v11

    invoke-static {v8, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/dts/freefireth/FFAPI;->nativeLog(Ljava/lang/String;)V

    :cond_5
    array-length v14, v13

    const/4 v15, 0x0

    :goto_3
    if-ge v15, v14, :cond_3

    aget-object v7, v13, v15

    move-object/from16 v16, v4

    if-eqz p2, :cond_6

    new-array v4, v11, [Ljava/lang/Object;

    aput-object v7, v4, v10

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/dts/freefireth/FFAPI;->nativeLog(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v4, v16

    const/4 v7, 0x2

    goto :goto_3

    :goto_4
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v4, v16

    const/4 v7, 0x2

    goto :goto_2

    :cond_9
    const/16 v5, 0x10

    if-lt v4, v5, :cond_11

    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v4

    if-eqz p2, :cond_a

    new-array v5, v11, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v10

    invoke-static {v9, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dts/freefireth/FFAPI;->nativeLog(Ljava/lang/String;)V

    :cond_a
    const/4 v5, 0x0

    :goto_5
    if-ge v5, v4, :cond_11

    invoke-static {v5}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v7

    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v9

    if-eq v0, v9, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x2

    if-eqz p2, :cond_c

    new-array v13, v12, [Ljava/lang/Object;

    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v13, v10

    array-length v14, v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v13, v11

    invoke-static {v8, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/dts/freefireth/FFAPI;->nativeLog(Ljava/lang/String;)V

    :cond_c
    array-length v13, v9

    const/4 v14, 0x0

    :goto_6
    if-ge v14, v13, :cond_10

    aget-object v15, v9, v14

    if-eqz p2, :cond_d

    new-array v12, v11, [Ljava/lang/Object;

    aput-object v15, v12, v10

    invoke-static {v6, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/dts/freefireth/FFAPI;->nativeLog(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    :cond_e
    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v14, v14, 0x1

    const/4 v12, 0x2

    goto :goto_6

    :cond_10
    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public static getCpuArchitecture()Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "os.arch"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public static getCpuCurrentFrequency(I)J
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/sys/devices/system/cpu/cpu"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "/cpufreq/scaling_cur_freq"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->readSystemFileAsLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getCpuMaxFrequency(I)J
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/sys/devices/system/cpu/cpu"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "/cpufreq/cpuinfo_max_freq"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->readSystemFileAsLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getCpuMinFrequency(I)J
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/sys/devices/system/cpu/cpu"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "/cpufreq/cpuinfo_min_freq"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/dts/freefireth/FFAPI;->readSystemFileAsLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getCpus()I
    .locals 1

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    const/4 v0, 0x0

    return v0
.end method

.method private static getDataNetworkStateString(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string p0, "suspended"

    return-object p0

    :cond_1
    const-string p0, "connected"

    return-object p0

    :cond_2
    const-string p0, "connecting"

    return-object p0

    :cond_3
    const-string p0, "disconnected"

    return-object p0
.end method

.method private static getDataNetworkTypeString(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    const-string p0, "4G"

    return-object p0

    :pswitch_1
    const-string p0, "3G"

    return-object p0

    :pswitch_2
    const-string p0, "2G"

    return-object p0

    :cond_0
    const-string p0, "5G"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static getExternalStorageDeviceSpace()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    :try_start_0
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/dts/freefireth/StorageDeviceSpace;

    invoke-direct {v2}, Lcom/dts/freefireth/StorageDeviceSpace;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/dts/freefireth/StorageDeviceSpace;->Free:J

    invoke-virtual {v1}, Ljava/io/File;->getTotalSpace()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/dts/freefireth/StorageDeviceSpace;->Total:J

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v1

    invoke-virtual {v1, v2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static getFD(I)Ljava/io/FileDescriptor;
    .locals 4

    const-string v0, "FreeFire"

    :try_start_0
    new-instance v1, Ljava/io/FileDescriptor;

    invoke-direct {v1}, Ljava/io/FileDescriptor;-><init>()V

    const-class v2, Ljava/io/FileDescriptor;

    const-string v3, "descriptor"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v2, v1, p0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindSocket(), fetch fd fail, ex: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catch_1
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindSocket(), fetch fd fail, ill arg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catch_2
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindSocket(), fetch fd fail, no access: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catch_3
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindSocket(), fetch fd fail, null pointer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catch_4
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindSocket(), fetch fd fail, no such field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/NoSuchFieldException;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method public static getGoogleAdvertisingId()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v0, Lcom/dts/freefireth/GetAdvertisingIdResult;

    invoke-direct {v0}, Lcom/dts/freefireth/GetAdvertisingIdResult;-><init>()V

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v1}, Lj/d/a/c/a/a/a;->b(Landroid/content/Context;)Lj/d/a/c/a/a/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lj/d/a/c/a/a/a$a;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/dts/freefireth/GetAdvertisingIdResult;->AdvertisingId:Ljava/lang/String;

    invoke-virtual {v1}, Lj/d/a/c/a/a/a$a;->b()Z

    move-result v1

    iput-boolean v1, v0, Lcom/dts/freefireth/GetAdvertisingIdResult;->IsLimitAdTrackingEnabled:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dts/freefireth/GetAdvertisingIdResult;->Exception:Ljava/lang/String;

    :goto_0
    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInternalStorageDeviceSpace()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    :try_start_0
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/dts/freefireth/StorageDeviceSpace;

    invoke-direct {v2}, Lcom/dts/freefireth/StorageDeviceSpace;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/dts/freefireth/StorageDeviceSpace;->Free:J

    invoke-virtual {v1}, Ljava/io/File;->getTotalSpace()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/dts/freefireth/StorageDeviceSpace;->Total:J

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v1

    invoke-virtual {v1, v2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static getLowMemoryThreshold()F
    .locals 4

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v1, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-float v0, v0

    goto :goto_0

    :catch_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0
.end method

.method public static getMemoryInfo()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public static getNativeDir()Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageResourcePath()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "@FFAPI.getNativeDir(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FreeFire"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ""

    return-object v0
.end method

.method public static getNativeLibraryDir()Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "@FFAPI.getNativeLibraryDir(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FreeFire"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ""

    return-object v0
.end method

.method public static getNetworkOperatorName()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static getNetworkType()Ljava/lang/String;
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    const-string v3, "Unknown"

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x1d

    if-lt v0, v6, :cond_1

    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v2, :cond_0

    :try_start_1
    invoke-virtual {v2, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v4, 0x0

    :goto_0
    const/4 v6, 0x4

    :try_start_2
    invoke-virtual {v2, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    const/4 v6, 0x0

    :goto_1
    :try_start_3
    invoke-virtual {v2, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    or-int v2, v4, v6

    or-int/2addr v5, v2

    goto :goto_5

    :cond_0
    const/4 v4, 0x0

    goto :goto_5

    :catchall_3
    return-object v3

    :cond_1
    :try_start_4
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    if-eqz v2, :cond_3

    :try_start_5
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_2

    :catchall_4
    const/4 v6, 0x0

    :goto_2
    :try_start_6
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-ne v7, v4, :cond_2

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    :goto_3
    move v5, v4

    :catchall_5
    :try_start_7
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    const/16 v7, 0x11

    :catchall_6
    :try_start_8
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :catchall_7
    move v2, v5

    move v5, v6

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    :goto_4
    move v4, v2

    :goto_5
    if-nez v5, :cond_4

    goto :goto_7

    :cond_4
    if-eqz v4, :cond_5

    const-string v3, "WIFI"

    goto :goto_7

    :cond_5
    const-string v2, "phone"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v2, v3}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_7

    const/16 v2, 0x18

    if-lt v0, v2, :cond_6

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDataNetworkType()I

    move-result v0

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    :goto_6
    invoke-static {v0}, Lcom/dts/freefireth/FFAPI;->getDataNetworkTypeString(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    goto :goto_7

    :cond_7
    const-string v3, "Cellular"

    :catchall_8
    :goto_7
    return-object v3
.end method

.method public static getOpenedWith()Ljava/lang/String;
    .locals 2

    new-instance v0, Lcom/dts/freefireth/OpenedWith;

    invoke-direct {v0}, Lcom/dts/freefireth/OpenedWith;-><init>()V

    sget-object v1, Lcom/dts/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    iput-object v1, v0, Lcom/dts/freefireth/OpenedWith;->Params:Ljava/util/HashMap;

    sget v1, Lcom/dts/freefireth/FFAPI;->OpenedByNotifyType:I

    iput v1, v0, Lcom/dts/freefireth/OpenedWith;->NotifyType:I

    sget-object v1, Lcom/dts/freefireth/FFAPI;->OpenedByUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/dts/freefireth/OpenedWith;->Url:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getProcessMemoryInfo()Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v0, v1, v2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v3, "activity"

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getProcessMemoryInfo([I)[Landroid/os/Debug$MemoryInfo;

    move-result-object v0

    new-instance v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;-><init>(Lcom/dts/freefireth/FFAPI$1;)V

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->dalvikPrivateDirty:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->dalvikPrivateDirty:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->dalvikPss:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->dalvikPss:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->dalvikSharedDirty:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->dalvikSharedDirty:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->nativePrivateDirty:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->nativePrivateDirty:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->nativePss:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->nativePss:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->nativeSharedDirty:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->nativeSharedDirty:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->otherPrivateDirty:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->otherPrivateDirty:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->otherPss:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->otherPss:I

    aget-object v3, v0, v2

    iget v3, v3, Landroid/os/Debug$MemoryInfo;->otherSharedDirty:I

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->otherSharedDirty:I

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/os/Debug$MemoryInfo;->getTotalPrivateDirty()I

    move-result v3

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->totalPrivateDirty:I

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/os/Debug$MemoryInfo;->getTotalPss()I

    move-result v3

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->totalPss:I

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/os/Debug$MemoryInfo;->getTotalSharedDirty()I

    move-result v3

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->totalSharedDirty:I

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/os/Debug$MemoryInfo;->getTotalPrivateClean()I

    move-result v3

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->totalPrivateClean:I

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/os/Debug$MemoryInfo;->getTotalSharedClean()I

    move-result v3

    iput v3, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->totalSharedClean:I

    aget-object v0, v0, v2

    invoke-virtual {v0}, Landroid/os/Debug$MemoryInfo;->getTotalSwappablePss()I

    move-result v0

    iput v0, v1, Lcom/dts/freefireth/FFAPI$ProcessMemoryInfo;->totalSwappablePss:I

    :cond_0
    invoke-static {}, Lcom/dts/freefireth/FFAPI;->gson()Lj/d/d/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public static getSDCardAvailStorage()J
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    :goto_0
    mul-long v0, v0, v2

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x0

    :goto_1
    return-wide v0
.end method

.method public static getSDCardTotalStorage()J
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    :goto_0
    mul-long v2, v2, v0

    goto :goto_1

    :cond_1
    const-wide/16 v2, 0x0

    :goto_1
    return-wide v2
.end method

.method public static getSignature()[B
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lcom/dts/freefireth/variant/FreeFireBuildVariant;->GetPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v1, :cond_4

    array-length v2, v1

    if-gtz v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_4
    :goto_0
    return-object v0
.end method

.method public static getString(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    :goto_0
    array-length v1, p2

    if-ge v2, v1, :cond_0

    aget-object v1, p2, v2

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method

.method public static getSystemInnerAvailStorage()J
    .locals 4

    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v0

    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, v0

    :goto_0
    mul-long v2, v2, v0

    goto :goto_1

    :catch_0
    const-wide/16 v2, 0x0

    :goto_1
    return-wide v2
.end method

.method public static getSystemInnerTotalStorage()J
    .locals 4

    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v0

    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v2

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, v0

    :goto_0
    mul-long v2, v2, v0

    goto :goto_1

    :catch_0
    const-wide/16 v2, 0x0

    :goto_1
    return-wide v2
.end method

.method public static getSystemProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "android.os.SystemProperties"

    const-string v1, "get"

    invoke-static {p0, v1, v0}, Lcom/dts/freefireth/FFAPI;->getString(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getTelephonyManagerIMEI()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public static getTelephonyManagerMEID()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public static getTelephonyManagerSubscriberId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public static getTotalStorageByPath(Ljava/lang/String;)J
    .locals 5

    new-instance v0, Landroid/os/StatFs;

    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt p0, v1, :cond_0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result p0

    int-to-long v3, p0

    :goto_0
    mul-long v1, v1, v3

    return-wide v1
.end method

.method public static getWifiSignalLevel()F
    .locals 1

    sget v0, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F

    return v0
.end method

.method private static declared-synchronized get_CellularNetwork()Landroid/net/Network;
    .locals 2

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->_CellularNetwork:Landroid/net/Network;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized get_WifiNetwork()Landroid/net/Network;
    .locals 2

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->_WifiNetwork:Landroid/net/Network;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static gotoApplicationDetailsSettings()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "package"

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static gson()Lj/d/d/e;
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->GsonInstance:Lj/d/d/e;

    if-nez v0, :cond_0

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    sput-object v0, Lcom/dts/freefireth/FFAPI;->GsonInstance:Lj/d/d/e;

    :cond_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->GsonInstance:Lj/d/d/e;

    return-object v0
.end method

.method public static hasDisplayCutout()Z
    .locals 1

    invoke-static {}, Lcom/dts/freefireth/DisplayCutoutAPI;->HasDisplayCutout()Z

    move-result v0

    return v0
.end method

.method public static hasSystemFeature(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/dts/freefireth/FFMainActivity;->FFDestroying()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_2
    :goto_0
    return v0
.end method

.method public static isAdvertisingIdProviderAvailable()Z
    .locals 1

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Lh/a/a/a;->d(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static isBatteryCharging()Z
    .locals 2

    sget v0, Lcom/dts/freefireth/FFAPI;->BatteryStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isDebuggable()Z
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static isPackageInstalled(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x80

    :try_start_0
    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    return v0

    :catch_1
    const/4 p0, -0x1

    return p0
.end method

.method public static isVPN()Z
    .locals 4

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/16 v3, 0x1d

    if-lt v1, v3, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    const/4 v1, 0x4

    :try_start_1
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_0
    return v2

    :cond_0
    :try_start_2
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v1, 0x11

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    const/4 v2, 0x1

    :catchall_1
    :cond_1
    :goto_0
    return v2
.end method

.method public static nativeLog(Ljava/lang/String;)V
    .locals 1

    const-string v0, "FreeFire"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const v0, 0x4006a5b

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-boolean p0, Lcom/dts/freefireth/FFAPI;->_PendingSelectImageFromAlbum:Z

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    sput-boolean p0, Lcom/dts/freefireth/FFAPI;->_PendingSelectImageFromAlbum:Z

    invoke-static {p1, p2}, Lcom/dts/freefireth/FFAPI;->onSelectedImageFromAlbum(ILandroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static onSelectedImageFromAlbum(ILandroid/content/Intent;)V
    .locals 4

    const-string v0, "OnSelectedImageFromAlbum"

    const/4 v1, -0x1

    if-ne p0, v1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    if-lt p1, v1, :cond_0

    :try_start_0
    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-static {p1, p0}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    invoke-static {p0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-static {p1, p0}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    move-object p0, v2

    :goto_0
    if-eqz p0, :cond_1

    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, "selected_temp.png"

    invoke-direct {p1, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {p0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    sget-object p0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    sget-object p0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    const-string p1, ""

    invoke-static {p0, v0, p1}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static readSystemFileAsLong(Ljava/lang/String;)J
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "r"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide v1

    :catchall_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static relaunch(J)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v2, "alarm"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    if-nez v1, :cond_2

    return v0

    :cond_2
    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    new-instance v3, Lcom/dts/freefireth/FFAPI$11;

    invoke-direct {v3, v1, p0, p1}, Lcom/dts/freefireth/FFAPI$11;-><init>(Landroid/app/AlarmManager;J)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    const-string p1, "FreeFire"

    const-string v1, "@FFAPI.scheduleLaunch()"

    invoke-static {p1, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v0
.end method

.method public static declared-synchronized releaseNetworks()V
    .locals 2

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    sput-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_unregisterNetworkCallbacks()V

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_registerNetworkCallbacks()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized requestNetworks()Z
    .locals 8

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-ge v1, v2, :cond_0

    monitor-exit v0

    return v3

    :cond_0
    :try_start_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-nez v1, :cond_1

    monitor-exit v0

    return v3

    :cond_1
    :try_start_2
    sget-boolean v2, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    const/4 v4, 0x1

    if-nez v2, :cond_3

    sget-boolean v2, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_unregisterNetworkCallbacks()V

    :cond_2
    sput-boolean v4, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_createNetworkCallbacks()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/16 v2, 0xc

    :try_start_3
    new-instance v5, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v5}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v5, v2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v5, v4}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v5}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v5

    sget-object v6, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackWifi:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v1, v5, v6}, Landroid/net/ConnectivityManager;->requestNetwork(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v5

    :try_start_4
    const-string v6, "FreeFire"

    const-string v7, "ConnectivityManager.requestNetwork wifi"

    invoke-static {v6, v7, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_0
    :try_start_5
    new-instance v5, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v5}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v5, v2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v5, v3}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v5}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v2

    sget-object v3, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackCellular:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v1, v2, v3}, Landroid/net/ConnectivityManager;->requestNetwork(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_6
    const-string v2, "FreeFire"

    const-string v3, "ConnectivityManager.requestNetwork cellular"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_3
    :goto_1
    monitor-exit v0

    return v4

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static requestPermissions([Ljava/lang/String;I)V
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0, p0, p1}, Landroidx/core/app/a;->o(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/dts/freefireth/RequestPermissionResult;

    invoke-direct {v0}, Lcom/dts/freefireth/RequestPermissionResult;-><init>()V

    iput p1, v0, Lcom/dts/freefireth/RequestPermissionResult;->RequestCode:I

    const/4 p1, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    iget-object v2, v0, Lcom/dts/freefireth/RequestPermissionResult;->Results:Ljava/util/HashMap;

    aget-object v3, p0, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lj/d/d/e;

    invoke-direct {p0}, Lj/d/d/e;-><init>()V

    invoke-virtual {p0, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    const-string v0, "onRequestPermissionsResult"

    invoke-static {p1, v0, p0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static saveImageToAlbum([BLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/dts/freefireth/FFAPI$1;

    invoke-direct {v1, p1, p0, p2}, Lcom/dts/freefireth/FFAPI$1;-><init>(Ljava/lang/String;[BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static selectImageFromAlbum()V
    .locals 3

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x1

    sput-boolean v1, Lcom/dts/freefireth/FFAPI;->_PendingSelectImageFromAlbum:Z

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const v2, 0x4006a5b

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public static sendBroadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    new-instance v1, Lcom/dts/freefireth/FFAPI$10;

    invoke-direct {v1, p1, p0, p2}, Lcom/dts/freefireth/FFAPI$10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static sendIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v6}, Lcom/dts/freefireth/FFAPI;->sendIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static sendIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x1

    if-eqz p3, :cond_0

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {v0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    if-eqz p5, :cond_1

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_1

    if-eqz p6, :cond_1

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_1

    new-instance p2, Landroid/content/ComponentName;

    invoke-direct {p2, p5, p6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    :cond_1
    invoke-static {v0, p0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Intent;->getFlags()I

    move-result p2

    const/high16 p3, 0x10000000

    or-int/2addr p2, p3

    invoke-virtual {p0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    if-eqz p0, :cond_2

    sget-object p2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p2}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object p2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p2, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static setCanHandleLowMemory(Z)V
    .locals 0

    sput-boolean p0, Lcom/dts/freefireth/FFAPI;->canHandleLowMemroy:Z

    return-void
.end method

.method public static setDebugDisplayCutout(Z)V
    .locals 0

    invoke-static {p0}, Lcom/dts/freefireth/DisplayCutoutAPI;->SetDebug(Z)V

    return-void
.end method

.method public static setUnitySendMessageGameObjectName(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    return-void
.end method

.method private static declared-synchronized set_CellularNetwork(Landroid/net/Network;)V
    .locals 1

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/dts/freefireth/FFAPI;->_CellularNetwork:Landroid/net/Network;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static declared-synchronized set_WifiNetwork(Landroid/net/Network;)V
    .locals 1

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/dts/freefireth/FFAPI;->_WifiNetwork:Landroid/net/Network;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static shouldShowRequestPermissionRationale(Ljava/lang/String;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-lt v0, v2, :cond_1

    const/16 v2, 0x1f

    if-ge v0, v2, :cond_0

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {v0, p0}, Landroidx/core/app/a;->p(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    return v1
.end method

.method public static showAlertDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/app/AlertDialog$Builder;

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_1
    const p0, 0x1080027

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_2

    new-instance p0, Lcom/dts/freefireth/FFAPI$2;

    invoke-direct {p0, p5}, Lcom/dts/freefireth/FFAPI$2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_3

    new-instance p0, Lcom/dts/freefireth/FFAPI$3;

    invoke-direct {p0, p5}, Lcom/dts/freefireth/FFAPI$3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_3
    if-eqz p4, :cond_4

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_4

    new-instance p0, Lcom/dts/freefireth/FFAPI$4;

    invoke-direct {p0, p5}, Lcom/dts/freefireth/FFAPI$4;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4, p0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_4
    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method public static showGotoApplicationDetailsSettingsAlertDialog(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    const-string v0, "permission_goto_application_details_settings_title"

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p0, p2}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    move-result-object p0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/content/pm/PermissionInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_0
    iget-object p0, p0, Landroid/content/pm/PermissionInfo;->group:Ljava/lang/String;

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p0, p2}, Landroid/content/pm/PackageManager;->getPermissionGroupInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionGroupInfo;

    move-result-object p0

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/content/pm/PermissionGroupInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "?"

    :goto_1
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v2, "permission_goto_application_details_settings"

    invoke-static {v1, v2}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, p2

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p2, "permission_goto_application_details_settings_yes"

    invoke-static {p0, p2}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p2, "permission_goto_application_details_settings_no"

    invoke-static {p0, p2}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    move-object v8, p1

    invoke-static/range {v3 .. v8}, Lcom/dts/freefireth/FFAPI;->showAlertDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p0, v0}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p2, "permission_goto_application_details_settings_or_later"

    invoke-static {p0, p2}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p2, "permission_goto_application_details_settings_or_later_yes"

    invoke-static {p0, p2}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p2, "permission_goto_application_details_settings_or_later_no"

    invoke-static {p0, p2}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/dts/freefireth/FFAPI;->showAlertDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public static showRequestPermissionRationaleAlertDialog(Ljava/lang/String;ZLjava/lang/String;Z)V
    .locals 8

    sget-object v0, Lcom/dts/freefireth/FFAPI;->PermissionRationales:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onAlertDialogNegativeButtonClick"

    invoke-static {v1, v3, v2}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v1, "permission_rationale_title"

    if-eqz p3, :cond_3

    sget-object p3, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p3, v1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object p3, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p3, p0}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-eqz p1, :cond_1

    const-string p3, "permission_rationale_critical_yes"

    goto :goto_0

    :cond_1
    const-string p3, "permission_rationale_trivial_yes"

    :goto_0
    invoke-static {p0, p3}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    if-eqz p1, :cond_2

    const-string p1, "permission_rationale_critical_no"

    goto :goto_1

    :cond_2
    const-string p1, "permission_rationale_trivial_no"

    :goto_1
    invoke-static {p0, p1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_3
    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-static {p1, v1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p1, p0}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string p1, "permission_rationale_neutral"

    invoke-static {p0, p1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v7}, Lcom/dts/freefireth/FFAPI;->showAlertDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static showRequestPermissionRationalesAlertDialog(Ljava/lang/String;)V
    .locals 8

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "permission_rationale_title"

    invoke-static {v0, v1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "permission_rationales"

    invoke-static {v0, v1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v1, "permission_rationale_neutral"

    invoke-static {v0, v1}, Lcom/dts/freefireth/FFAPI;->R_string_toString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v2 .. v7}, Lcom/dts/freefireth/FFAPI;->showAlertDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized startMonitoringDataConnectionState()V
    .locals 5

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v2, "phone"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    const/4 v4, 0x0

    if-lt v2, v3, :cond_1

    sget-object v2, Lcom/dts/freefireth/FFAPI;->_TelephonyCallback:Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;

    if-nez v2, :cond_0

    new-instance v2, Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;

    invoke-direct {v2, v4}, Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;-><init>(Lcom/dts/freefireth/FFAPI$1;)V

    sput-object v2, Lcom/dts/freefireth/FFAPI;->_TelephonyCallback:Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :cond_0
    :try_start_1
    sget-object v2, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v2}, Landroid/app/Activity;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    sget-object v3, Lcom/dts/freefireth/FFAPI;->_TelephonyCallback:Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;

    invoke-virtual {v1, v2, v3}, Landroid/telephony/TelephonyManager;->registerTelephonyCallback(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    const-string v2, "FreeFire"

    const-string v3, "TelephonyManager.registerTelephonyCallback"

    :goto_0
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/dts/freefireth/FFAPI;->_PhoneStateListener:Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;

    if-nez v2, :cond_2

    new-instance v2, Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;

    invoke-direct {v2, v4}, Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;-><init>(Lcom/dts/freefireth/FFAPI$1;)V

    sput-object v2, Lcom/dts/freefireth/FFAPI;->_PhoneStateListener:Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    :try_start_3
    sget-object v2, Lcom/dts/freefireth/FFAPI;->_PhoneStateListener:Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;

    const/16 v3, 0x40

    invoke-virtual {v1, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    const-string v2, "FreeFire"

    const-string v3, "TelephonyManager.listen LISTEN_DATA_CONNECTION_STATE"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :goto_1
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method

.method public static declared-synchronized startMonitoringNetworks()V
    .locals 4

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    const/4 v3, 0x1

    if-lt v1, v2, :cond_0

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    if-nez v1, :cond_1

    sput-boolean v3, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    if-nez v1, :cond_1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_createNetworkCallbacks()V

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_registerNetworkCallbacks()V

    goto :goto_0

    :cond_0
    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_WifiCellular:Z

    if-nez v1, :cond_1

    sput-boolean v3, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_WifiCellular:Z

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_VPN:Z

    if-nez v1, :cond_1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_registerConnectivityAction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized startMonitoringVPN()V
    .locals 4

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_1

    sget-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackVPN:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v1, :cond_0

    new-instance v1, Lcom/dts/freefireth/FFAPI$7;

    invoke-direct {v1}, Lcom/dts/freefireth/FFAPI$7;-><init>()V

    sput-object v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackVPN:Landroid/net/ConnectivityManager$NetworkCallback;

    :cond_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_2

    :try_start_1
    new-instance v2, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v2}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    const/16 v3, 0xf

    invoke-virtual {v2, v3}, Landroid/net/NetworkRequest$Builder;->removeCapability(I)Landroid/net/NetworkRequest$Builder;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v2}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v2

    sget-object v3, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackVPN:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v1, v2, v3}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    const-string v2, "FreeFire"

    const-string v3, "ConnectivityManager.registerNetworkCallback vpn"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_1
    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_VPN:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    sput-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_VPN:Z

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_WifiCellular:Z

    if-nez v1, :cond_2

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_registerConnectivityAction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized stopMonitoringDataConnectionState()V
    .locals 4

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    const-string v2, "phone"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_0

    sget-object v2, Lcom/dts/freefireth/FFAPI;->_TelephonyCallback:Lcom/dts/freefireth/FFAPI$FFTelephonyCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {v1, v2}, Landroid/telephony/TelephonyManager;->unregisterTelephonyCallback(Landroid/telephony/TelephonyCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    const-string v2, "FreeFire"

    const-string v3, "TelephonyManager.unregisterTelephonyCallback"

    :goto_0
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/dts/freefireth/FFAPI;->_PhoneStateListener:Lcom/dts/freefireth/FFAPI$FFPhoneStateListener;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    :try_start_3
    invoke-virtual {v1, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    const-string v2, "FreeFire"

    const-string v3, "TelephonyManager.listen LISTEN_NONE"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method

.method public static declared-synchronized stopMonitoringNetworks()V
    .locals 4

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    if-eqz v1, :cond_1

    sput-boolean v3, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForMonitor:Z

    if-nez v1, :cond_1

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_NetworkCallbacksForRequest:Z

    if-nez v1, :cond_1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_unregisterNetworkCallbacks()V

    goto :goto_0

    :cond_0
    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_WifiCellular:Z

    if-eqz v1, :cond_1

    sput-boolean v3, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_WifiCellular:Z

    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_VPN:Z

    if-nez v1, :cond_1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_unregisterConnectivityAction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized stopMonitoringVPN()V
    .locals 4

    const-class v0, Lcom/dts/freefireth/FFAPI;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    sget-object v2, Lcom/dts/freefireth/FFAPI;->_NetworkCallbackVPN:Landroid/net/ConnectivityManager$NetworkCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    const-string v2, "FreeFire"

    const-string v3, "ConnectivityManager.unregisterNetworkCallback vpn"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    sget-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_VPN:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    sput-boolean v1, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_VPN:Z

    sget-boolean v2, Lcom/dts/freefireth/FFAPI;->_ConnectivityAction_WifiCellular:Z

    if-nez v2, :cond_1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->_unregisterConnectivityAction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static supportBindSocket()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static toggleBatteryReport(Z)V
    .locals 0

    sput-boolean p0, Lcom/dts/freefireth/FFAPI;->shouldReportBattery:Z

    return-void
.end method

.method public static traceRoute(Ljava/lang/String;I)V
    .locals 4

    sget-boolean v0, Lcom/dts/freefireth/FFAPI;->_IsRunningTraceRoute:Z

    const-string v1, "Unity"

    if-eqz v0, :cond_0

    const-string p0, "<Tracert> Duplicate Call "

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lcom/dts/freefireth/FFAPI$9;

    invoke-direct {v0, p0}, Lcom/dts/freefireth/FFAPI$9;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute;

    new-instance v3, Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute$Config;

    invoke-direct {v3, p0}, Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute$Config;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute$Config;->setThreadSize(I)Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute$Config;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute;-><init>(Lcom/dts/freefireth/FFNetCommand/TraceRoute/Traceroute$Config;Lcom/dts/freefireth/FFNetCommand/TraceRoute/TracerouteCallback;)V

    const/4 p0, 0x1

    sput-boolean p0, Lcom/dts/freefireth/FFAPI;->_IsRunningTraceRoute:Z

    invoke-static {v2}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "<Tracert> TraceRoute With Exception "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method static updateBattery(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "status"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/dts/freefireth/FFAPI;->BatteryStatus:I

    const-string v0, "level"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "scale"

    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-lez v0, :cond_1

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v0, v0

    int-to-float p0, p0

    div-float/2addr v0, p0

    sput v0, Lcom/dts/freefireth/FFAPI;->BatteryLevel:F

    goto :goto_1

    :cond_1
    :goto_0
    const/high16 p0, -0x40800000    # -1.0f

    sput p0, Lcom/dts/freefireth/FFAPI;->BatteryLevel:F

    :goto_1
    sget-boolean p0, Lcom/dts/freefireth/FFAPI;->shouldReportBattery:Z

    if-eqz p0, :cond_2

    sget-object p0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->isBatteryCharging()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "OnBatteryChargingChanged"

    invoke-static {p0, v2, v0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->getBatteryLevel()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OnBatteryLevelChanged"

    invoke-static {p0, v1, v0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method static updateWifi(Landroid/content/Intent;)V
    .locals 2

    sget-object p0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    if-nez p0, :cond_0

    sget-object p0, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/wifi/WifiManager;

    sput-object p0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    :cond_0
    sget-object p0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result p0

    const/high16 v0, -0x40800000    # -1.0f

    if-nez p0, :cond_1

    sput v0, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F

    return-void

    :cond_1
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge p0, v1, :cond_4

    sget-object v1, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    if-nez v1, :cond_2

    sput v0, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F

    return-void

    :cond_2
    const/16 v0, 0x1e

    if-ge p0, v0, :cond_3

    const/16 p0, 0x64

    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    invoke-static {v0, p0}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    move-result v0

    int-to-float v0, v0

    int-to-float p0, p0

    div-float/2addr v0, p0

    sput v0, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(I)I

    move-result p0

    int-to-float p0, p0

    sget-object v0, Lcom/dts/freefireth/FFAPI;->_WifiManager:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getMaxSignalLevel()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p0, v0

    sput p0, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F

    :cond_4
    :goto_0
    return-void
.end method
