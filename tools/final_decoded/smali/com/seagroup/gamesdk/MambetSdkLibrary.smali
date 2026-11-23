.class public Lcom/seagroup/gamesdk/MambetSdkLibrary;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static final EVENT_PATH:Ljava/lang/String; = "/reports/gameevents/%d/reports"

.field private static final KEY_DEVICE_ID:Ljava/lang/String; = "MAMBET_DEVICE_ID"

.field private static final KEY_STREAM_KEY:Ljava/lang/String; = "MAMBET_STREAM_KEY"

.field private static final MAX_QUEUE_SIZE:I = 0xa

.field private static final MAX_RETRY_COUNT:I = 0xa

.field private static final POLLING_INTERVAL:I = 0x7530

.field private static final POLLING_PATH:Ljava/lang/String; = "/channel/check"

.field private static final PREF_KEY_DEVICE_ID:Ljava/lang/String; = "device_id"

.field private static final PREF_KEY_STREAM_KEY:Ljava/lang/String; = "stream_key"

.field private static final PREF_NAME:Ljava/lang/String; = "mambet_sdk"

.field private static final RETRY_INTERVAL:I = 0x5

.field private static final RETRY_INTERVAL_RANDOM:I = 0x3

.field private static final SERVER_URL:Ljava/lang/String; = "https://booyah.live/api/v3"

.field private static final TAG:Ljava/lang/String; = "MambetSDK"

.field private static final TEST_SERVER_URL:Ljava/lang/String; = "https://test.connect.booyah.live/api/v3"

.field private static volatile instance:Lcom/seagroup/gamesdk/MambetSdkLibrary;


# instance fields
.field final context:Landroid/content/Context;

.field private currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

.field private final dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/seagroup/gamesdk/SdkEventBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private debugEnv:Z

.field private deviceId:Ljava/lang/String;

.field private gameAccountId:Ljava/lang/String;

.field private gameId:I

.field final gson:Lj/d/d/e;

.field private isStreaming:Z

.field private final lock:Ljava/lang/Object;

.field private final mainHandler:Landroid/os/Handler;

.field final okHttpClient:Lm/z;

.field private packageVersion:Ljava/lang/String;

.field private requestStreamKeyMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lm/b0;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private resumedCount:I

.field private retryCount:I

.field private final scheduleTask:Ljava/lang/Runnable;

.field private streamId:Ljava/lang/String;

.field private streamKey:Ljava/lang/String;

.field private volatile uploading:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>(Landroid/app/Application;IZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gameAccountId:Ljava/lang/String;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->lock:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->isStreaming:Z

    iput v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    iput v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->requestStreamKeyMap:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;

    invoke-direct {v1, p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;-><init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;)V

    iput-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    iput p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gameId:I

    iput-boolean p3, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->debugEnv:Z

    new-instance p2, Lj/d/d/e;

    invoke-direct {p2}, Lj/d/d/e;-><init>()V

    iput-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gson:Lj/d/d/e;

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance p2, Lm/z$a;

    invoke-direct {p2}, Lm/z$a;-><init>()V

    invoke-virtual {p2}, Lm/z$a;->b()Lm/z;

    move-result-object p2

    iput-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->okHttpClient:Lm/z;

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->packageVersion:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    :goto_0
    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getStreamKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getDeviceId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->lock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$100(Lcom/seagroup/gamesdk/MambetSdkLibrary;)V
    .locals 0

    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->updateChannelStatus()V

    return-void
.end method

.method static synthetic access$1000(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->setStreamKey(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retrySend(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1302(Lcom/seagroup/gamesdk/MambetSdkLibrary;I)I
    .locals 0

    iput p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    return p1
.end method

.method static synthetic access$1308(Lcom/seagroup/gamesdk/MambetSdkLibrary;)I
    .locals 2

    iget v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    return v0
.end method

.method static synthetic access$1400(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method static synthetic access$200(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Lcom/seagroup/gamesdk/SdkEventBuilder;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    return-object p0
.end method

.method static synthetic access$202(Lcom/seagroup/gamesdk/MambetSdkLibrary;Lcom/seagroup/gamesdk/SdkEventBuilder;)Lcom/seagroup/gamesdk/SdkEventBuilder;
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    return-object p1
.end method

.method static synthetic access$300(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic access$302(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic access$400(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploadingAsync(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$600(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->requestStreamKeyMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method static synthetic access$802(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$900(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->isStreaming:Z

    return p0
.end method

.method static synthetic access$902(Lcom/seagroup/gamesdk/MambetSdkLibrary;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->isStreaming:Z

    return p1
.end method

.method private clearCache()V
    .locals 1

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    return-void
.end method

.method private getDeviceId()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    const-string v1, "mambet_sdk"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "device_id"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;
    .locals 1

    sget-object v0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->instance:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    return-object v0
.end method

.method private getServerUrl()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->debugEnv:Z

    if-eqz v0, :cond_0

    const-string v0, "https://test.connect.booyah.live/api/v3"

    return-object v0

    :cond_0
    const-string v0, "https://booyah.live/api/v3"

    return-object v0
.end method

.method private getStreamKey()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    const-string v1, "mambet_sdk"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "stream_key"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static init(Landroid/app/Application;IZ)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->instance:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    if-nez v0, :cond_1

    const-class v0, Lcom/seagroup/gamesdk/MambetSdkLibrary;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/seagroup/gamesdk/MambetSdkLibrary;->instance:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    if-nez v1, :cond_0

    new-instance v1, Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-direct {v1, p0, p1, p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;-><init>(Landroid/app/Application;IZ)V

    sput-object v1, Lcom/seagroup/gamesdk/MambetSdkLibrary;->instance:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "should call init method on mainThread"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static parseIntent(Landroid/content/Intent;)Lcom/seagroup/gamesdk/MambetInfo;
    .locals 2

    const-string v0, "MAMBET_STREAM_KEY"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MAMBET_DEVICE_ID"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Lcom/seagroup/gamesdk/MambetInfo;

    invoke-direct {v1, v0, p0}, Lcom/seagroup/gamesdk/MambetInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private retrySend(Ljava/lang/String;)V
    .locals 8

    iget v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    const-string v1, "MambetSDK"

    const/16 v2, 0xa

    if-lt v0, v2, :cond_0

    const-string p1, "reached max retry count, give up"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    const/4 p1, 0x0

    iput p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    return-void

    :cond_0
    const-string v0, "failed uploading events, retry after several seconds..."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;

    invoke-direct {v1, p0, p1}, Lcom/seagroup/gamesdk/MambetSdkLibrary$4;-><init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    mul-double v4, v4, v6

    add-double/2addr v4, v2

    iget p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->retryCount:I

    mul-int/lit8 p1, p1, 0x5

    int-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v4, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double v4, v4, v2

    double-to-long v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private setStreamKey(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->clearCache()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    const-string v1, "mambet_sdk"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "stream_key"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "MambetSDK"

    const-string v0, "clear stream key, stop schedule"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->isStreaming:Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->updateChannelStatus()V

    const-string p1, "MambetSDK"

    const-string v0, "set stream key, start schedule"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    const-wide/16 v1, 0x7530

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private updateChannelStatus()V
    .locals 5

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lm/x;->g(Ljava/lang/String;)Lm/x;

    move-result-object v0

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gson:Lj/d/d/e;

    new-instance v2, Lcom/seagroup/gamesdk/CheckChannelRequest;

    iget-object v3, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/seagroup/gamesdk/CheckChannelRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/c0;->c(Lm/x;Ljava/lang/String;)Lm/c0;

    move-result-object v0

    new-instance v1, Lm/b0$a;

    invoke-direct {v1}, Lm/b0$a;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getServerUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/channel/check"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm/b0$a;->o(Ljava/lang/String;)Lm/b0$a;

    invoke-virtual {v1, v0}, Lm/b0$a;->g(Lm/c0;)Lm/b0$a;

    invoke-virtual {v1}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->okHttpClient:Lm/z;

    invoke-virtual {v1, v0}, Lm/z;->a(Lm/b0;)Lm/e;

    move-result-object v1

    iget-object v2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->requestStreamKeyMap:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;

    invoke-direct {v0, p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;-><init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;)V

    invoke-interface {v1, v0}, Lm/e;->u(Lm/f;)V

    return-void
.end method

.method private uploadingAsync(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lm/x;->g(Ljava/lang/String;)Lm/x;

    move-result-object v0

    invoke-static {v0, p1}, Lm/c0;->c(Lm/x;Ljava/lang/String;)Lm/c0;

    move-result-object v0

    new-instance v1, Lm/b0$a;

    invoke-direct {v1}, Lm/b0$a;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getServerUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget v5, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gameId:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const-string v4, "/reports/gameevents/%d/reports"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm/b0$a;->o(Ljava/lang/String;)Lm/b0$a;

    invoke-virtual {v1, v0}, Lm/b0$a;->g(Lm/c0;)Lm/b0$a;

    invoke-virtual {v1}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->okHttpClient:Lm/z;

    invoke-virtual {v1, v0}, Lm/z;->a(Lm/b0;)Lm/e;

    move-result-object v1

    iget-object v2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->requestStreamKeyMap:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;

    invoke-direct {v0, p0, p1}, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;-><init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Lm/e;->u(Lm/f;)V

    return-void
.end method


# virtual methods
.method public handleIntent(Landroid/content/Intent;)V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const-string v0, "MAMBET_STREAM_KEY"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "MAMBET_DEVICE_ID"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    const/4 v1, 0x0

    const-string v2, "mambet_sdk"

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    const-string v2, "device_id"

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-direct {p0, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->setStreamKey(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "should call handle intent method on mainThread"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public handleMambetInfo(Lcom/seagroup/gamesdk/MambetInfo;)V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/seagroup/gamesdk/MambetInfo;->getStreamKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/seagroup/gamesdk/MambetInfo;->getDeviceId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    const/4 v1, 0x0

    const-string v2, "mambet_sdk"

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    const-string v2, "device_id"

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-direct {p0, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->setStreamKey(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "should call handle intent method on mainThread"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->lock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    const-string v0, "MambetSDK"

    const-string v1, "onPaused"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    if-nez v0, :cond_0

    const-string v0, "MambetSDK"

    const-string v1, "app goes background"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    invoke-virtual {v0}, Lcom/seagroup/gamesdk/SdkEventBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploadingAsync(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    iget p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    if-nez p1, :cond_0

    const-string p1, "MambetSDK"

    const-string v0, "app goes foreground"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-direct {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->updateChannelStatus()V

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->mainHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->scheduleTask:Ljava/lang/Runnable;

    const-wide/16 v1, 0x7530

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    iget p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->resumedCount:I

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public pushEvent(Ljava/lang/String;Landroid/os/Parcelable;)V
    .locals 1

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gson:Lj/d/d/e;

    invoke-virtual {v0, p2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->pushEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public pushEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->isStreaming:Z

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Lcom/seagroup/gamesdk/GameEventBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2, p2}, Lcom/seagroup/gamesdk/GameEventBuilder;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v0}, Lcom/seagroup/gamesdk/GameEventBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->lock:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    if-nez v0, :cond_1

    new-instance v0, Lcom/seagroup/gamesdk/SdkEventBuilder;

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamId:Ljava/lang/String;

    iget-object v4, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->streamKey:Ljava/lang/String;

    iget-object v5, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->packageVersion:Ljava/lang/String;

    iget-object v6, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gameAccountId:Ljava/lang/String;

    iget-object v7, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->deviceId:Ljava/lang/String;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/seagroup/gamesdk/SdkEventBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    :cond_1
    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    invoke-virtual {v0, p1}, Lcom/seagroup/gamesdk/SdkEventBuilder;->addEvent(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "MambetSDK"

    const-string v0, "reach max count, start uploading events..."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    invoke-virtual {p1}, Lcom/seagroup/gamesdk/SdkEventBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploadingAsync(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    const/16 v0, 0xa

    if-le p1, v0, :cond_3

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploading:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "MambetSDK"

    const-string v0, "queue not empty,start uploading events..."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->dataCacheQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/seagroup/gamesdk/SdkEventBuilder;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/seagroup/gamesdk/SdkEventBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->currentEventBuilder:Lcom/seagroup/gamesdk/SdkEventBuilder;

    :cond_5
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    :goto_2
    return-void
.end method

.method public setCurrentAccountID(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gameAccountId:Ljava/lang/String;

    return-void
.end method
