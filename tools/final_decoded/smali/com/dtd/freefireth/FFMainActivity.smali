.class public Lcom/dtd/freefireth/FFMainActivity;
.super Lcom/unity3d/player/UnityPlayerActivity;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;
    }
.end annotation


# static fields
.field private static SYSTEM_UI_VISIBILITY:I

.field private static _FFDestroying:Z


# instance fields
.field private _CapturedPointerListener:Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;

.field private _GenericMotionEventListener:Ljava/lang/Object;

.field private _LastScreenshotClue:Ljava/lang/String;

.field private _ScreenshotContentObserver:Landroid/database/ContentObserver;

.field private watcherOfBattery:Landroid/content/BroadcastReceiver;

.field private watcherOfWifi:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/unity3d/player/UnityPlayerActivity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_GenericMotionEventListener:Ljava/lang/Object;

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_CapturedPointerListener:Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;

    return-void
.end method

.method public static FFDestroying()Z
    .locals 1

    sget-boolean v0, Lcom/dtd/freefireth/FFMainActivity;->_FFDestroying:Z

    return v0
.end method

.method public static FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/unity3d/player/UnityPlayer;->currentActivity:Landroid/app/Activity;

    const-string v1, "FreeFire"

    if-nez v0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": UnityPlayer.currentActivity == null!"

    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {}, Lcom/dtd/freefireth/FFMainActivity;->FFDestroying()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": FFMainActivity.FFDestroying()!"

    goto :goto_0

    :cond_1
    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p0, p1, p2}, Lcom/unity3d/player/UnityPlayer;->UnitySendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_2
    const-string p0, "invalid method!"

    goto :goto_1

    :cond_5
    :goto_3
    const-string p0, "invalid gameObjectName!"

    goto :goto_1
.end method

.method private _SplashScreen_31()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/dtd/freefireth/FFMainActivity$3;

    invoke-direct {v2, p0, v0}, Lcom/dtd/freefireth/FFMainActivity$3;-><init>(Lcom/dtd/freefireth/FFMainActivity;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getSplashScreen()Landroid/window/SplashScreen;

    move-result-object v0

    new-instance v1, Lcom/dtd/freefireth/FFMainActivity$4;

    invoke-direct {v1, p0}, Lcom/dtd/freefireth/FFMainActivity$4;-><init>(Lcom/dtd/freefireth/FFMainActivity;)V

    invoke-interface {v0, v1}, Landroid/window/SplashScreen;->setOnExitAnimationListener(Landroid/window/SplashScreen$OnExitAnimationListener;)V

    return-void
.end method

.method private _SplashScreen_Legacy()V
    .locals 0

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    sget v0, Lcom/dtd/freefireth/FFMainActivity;->SYSTEM_UI_VISIBILITY:I

    return v0
.end method

.method static synthetic access$100(Lcom/dtd/freefireth/FFMainActivity;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/dtd/freefireth/FFMainActivity;->onTakenScreenshot(Landroid/net/Uri;)V

    return-void
.end method

.method private getMetaDataString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v0
.end method

.method private handleIntent(Landroid/content/Intent;)V
    .locals 6

    invoke-static {p1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->handleintent(Landroid/content/Intent;)V

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/dtd/freefireth/FFAPI;->OpenedByUrl:Ljava/lang/String;

    :cond_0
    const/4 v0, -0x1

    const-string v1, "FreeFireNotifyType"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/dtd/freefireth/FFAPI;->OpenedByNotifyType:I

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_2

    sget-object v4, Lcom/dtd/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Lcom/dtd/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :try_start_0
    sget-object v4, Lcom/dtd/freefireth/FFAPI;->OpenedWithParams:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    goto :goto_0

    :cond_4
    return-void
.end method

.method private onTakenScreenshot(Landroid/net/Uri;)V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    const-string v1, "onTakenScreenshot"

    invoke-static {v0, v1, p1}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private setSystemUiVisibility()V
    .locals 3

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    const/16 v2, 0x1e

    if-lt v0, v1, :cond_1

    if-ge v0, v2, :cond_1

    const/16 v1, 0x706

    sput v1, Lcom/dtd/freefireth/FFMainActivity;->SYSTEM_UI_VISIBILITY:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_0

    or-int/lit16 v0, v1, 0x1000

    sput v0, Lcom/dtd/freefireth/FFMainActivity;->SYSTEM_UI_VISIBILITY:I

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    sget v2, Lcom/dtd/freefireth/FFMainActivity;->SYSTEM_UI_VISIBILITY:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    new-instance v1, Lcom/dtd/freefireth/FFMainActivity$5;

    invoke-direct {v1, p0}, Lcom/dtd/freefireth/FFMainActivity$5;-><init>(Lcom/dtd/freefireth/FFMainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    goto :goto_0

    :cond_1
    if-lt v0, v2, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->hide(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->setSystemBarsBehavior(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method private unwatchScreenshot()V
    .locals 2

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_ScreenshotContentObserver:Landroid/database/ContentObserver;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/dtd/freefireth/FFMainActivity;->_ScreenshotContentObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_ScreenshotContentObserver:Landroid/database/ContentObserver;

    :cond_0
    return-void
.end method

.method private usingFCM()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private watchBattery()V
    .locals 3

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfBattery:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/dtd/freefireth/FFMainActivity$1;

    invoke-direct {v0, p0}, Lcom/dtd/freefireth/FFMainActivity$1;-><init>(Lcom/dtd/freefireth/FFMainActivity;)V

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfBattery:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private watchScreenshot()V
    .locals 4

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_ScreenshotContentObserver:Landroid/database/ContentObserver;

    if-nez v0, :cond_0

    new-instance v0, Lcom/dtd/freefireth/FFMainActivity$6;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/app/Activity;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lcom/dtd/freefireth/FFMainActivity$6;-><init>(Lcom/dtd/freefireth/FFMainActivity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_ScreenshotContentObserver:Landroid/database/ContentObserver;

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/dtd/freefireth/FFMainActivity;->_ScreenshotContentObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    :cond_0
    return-void
.end method

.method private watchWifi()V
    .locals 2

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfWifi:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/dtd/freefireth/FFMainActivity$2;

    invoke-direct {v0, p0}, Lcom/dtd/freefireth/FFMainActivity$2;-><init>(Lcom/dtd/freefireth/FFMainActivity;)V

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfWifi:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.wifi.RSSI_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfWifi:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public getViewHeight()I
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public getViewWidth()I
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method

.method public hasPointerCapture()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasPointerCapture()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x1232

    if-eq p1, v0, :cond_0

    invoke-static {p1, p2, p3}, Lcom/dtd/freefireth/FFAPI;->onActivityResult(IILandroid/content/Intent;)V

    invoke-static {p0, p1, p2, p3}, Lcom/garena/sdkunity/SdkUnity;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    invoke-static {p1, p2, p3}, Lcom/garena/unity/webview/WebViewManager;->onActivityResult(IILandroid/content/Intent;)V

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lcom/garena/pay/android/a;->s(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->setSystemUiVisibility()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-static {}, Lcom/garena/unity/webview/WebViewManager;->isShowingCustomView()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->usingFCM()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->quit()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    :cond_0
    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p1, v0, :cond_1

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->_SplashScreen_31()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->_SplashScreen_Legacy()V

    :goto_0
    const-string p1, "HwAcc"

    invoke-direct {p0, p1}, Lcom/dtd/freefireth/FFMainActivity;->getMetaDataString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "on"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/high16 v0, 0x1000000

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_2
    invoke-static {p0}, Lcom/garena/unity/webview/WebViewManager;->onActivityCreate(Landroid/app/Activity;)V

    invoke-static {}, Lcom/dtd/freefireth/UnityMessenger;->I()Lcom/dtd/freefireth/UnityMessenger;

    move-result-object p1

    invoke-static {p1}, Lcom/garena/unity/webview/WebViewManager;->setUnityMessenger(Lcom/garena/unity/webview/IUnityMessenger;)V

    sput-object p0, Lcom/dtd/freefireth/FFAPI;->MainActivity:Lcom/dtd/freefireth/FFMainActivity;

    invoke-static {p0}, Lcom/garena/sdkunity/SdkUnity;->setActivity(Landroid/app/Activity;)V

    invoke-static {p0}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->setActivity(Landroid/app/Activity;)V

    invoke-static {}, Lcom/dtd/freefireth/UnityMessenger;->I()Lcom/dtd/freefireth/UnityMessenger;

    move-result-object p1

    invoke-static {p1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->setUnityMessenger(Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;)V

    invoke-static {p0}, Lcom/beetalk/sdk/x/d;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/dtd/freefireth/FFAPI;->MetaDataGarenaAppId:Ljava/lang/String;

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->watchBattery()V

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->watchWifi()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/dtd/freefireth/FFMainActivity;->handleIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 5

    const/4 v0, 0x1

    sput-boolean v0, Lcom/dtd/freefireth/FFMainActivity;->_FFDestroying:Z

    invoke-static {p0}, Lcom/garena/unity/webview/WebViewManager;->onActivityDestroy(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfBattery:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    const-string v2, "FreeFire"

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-object v1, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfBattery:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "@FFMainActivity.onDestroy(): battery: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfWifi:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-object v1, p0, Lcom/dtd/freefireth/FFMainActivity;->watcherOfWifi:Landroid/content/BroadcastReceiver;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "@FFMainActivity.onDestroy(): wifi: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/16 v0, 0x6f

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/garena/unity/webview/WebViewManager;->isShowingCustomView()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Lcom/unity3d/player/UnityPlayerActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/16 v0, 0x6f

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/garena/unity/webview/WebViewManager;->isShowingCustomView()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Lcom/unity3d/player/UnityPlayerActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onLowMemory()V
    .locals 1

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->getCanHandleLowMemory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onLowMemory()V

    :cond_0
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->onNewIntent(Landroid/content/Intent;)V

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->usingFCM()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.firebase.messaging.MessageForwardingService"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.google.android.c2dm.intent.RECEIVE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    invoke-direct {p0, p1}, Lcom/dtd/freefireth/FFMainActivity;->handleIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onPause()V

    invoke-static {p0}, Lcom/garena/unity/webview/WebViewManager;->onActivityPause(Landroid/app/Activity;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    new-instance v0, Lcom/dtd/freefireth/RequestPermissionResult;

    invoke-direct {v0}, Lcom/dtd/freefireth/RequestPermissionResult;-><init>()V

    iput p1, v0, Lcom/dtd/freefireth/RequestPermissionResult;->RequestCode:I

    const/4 p1, 0x0

    :goto_0
    array-length v1, p2

    if-ge p1, v1, :cond_0

    iget-object v1, v0, Lcom/dtd/freefireth/RequestPermissionResult;->Results:Ljava/util/HashMap;

    aget-object v2, p2, p1

    aget v3, p3, p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lj/d/d/e;

    invoke-direct {p1}, Lj/d/d/e;-><init>()V

    invoke-virtual {p1, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    const-string p3, "onRequestPermissionsResult"

    invoke-static {p2, p3, p1}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected onResume()V
    .locals 0

    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onResume()V

    invoke-static {p0}, Lcom/garena/unity/webview/WebViewManager;->onActivityResume(Landroid/app/Activity;)V

    return-void
.end method

.method protected onStart()V
    .locals 0

    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onStart()V

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->watchScreenshot()V

    invoke-static {p0}, Lcom/garena/unity/webview/WebViewManager;->onActivityStart(Landroid/app/Activity;)V

    return-void
.end method

.method protected onStop()V
    .locals 0

    invoke-super {p0}, Lcom/unity3d/player/UnityPlayerActivity;->onStop()V

    invoke-direct {p0}, Lcom/dtd/freefireth/FFMainActivity;->unwatchScreenshot()V

    invoke-static {p0}, Lcom/garena/unity/webview/WebViewManager;->onActivityStop(Landroid/app/Activity;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->getCanHandleLowMemory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->onTrimMemory(I)V

    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    invoke-static {}, Lcom/garena/unity/webview/WebViewManager;->ignoreActivityWindowFocusChanged()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/unity3d/player/UnityPlayerActivity;->onWindowFocusChanged(Z)V

    :goto_0
    return-void
.end method

.method public registerCapturedPointerListener()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_CapturedPointerListener:Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;

    if-nez v0, :cond_0

    new-instance v0, Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;-><init>(Lcom/dtd/freefireth/FFMainActivity;Lcom/dtd/freefireth/FFMainActivity$1;)V

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_CapturedPointerListener:Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;

    :cond_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->GLView()Landroid/view/SurfaceView;

    move-result-object v0

    iget-object v1, p0, Lcom/dtd/freefireth/FFMainActivity;->_CapturedPointerListener:Lcom/dtd/freefireth/FFMainActivity$CapturedPointerListener;

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setOnCapturedPointerListener(Landroid/view/View$OnCapturedPointerListener;)V

    :cond_1
    return-void
.end method

.method public registerGenericMotionEventListener()V
    .locals 2

    iget-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_GenericMotionEventListener:Ljava/lang/Object;

    if-nez v0, :cond_0

    new-instance v0, Lcom/dtd/freefireth/FFMainActivity$7;

    invoke-direct {v0, p0}, Lcom/dtd/freefireth/FFMainActivity$7;-><init>(Lcom/dtd/freefireth/FFMainActivity;)V

    iput-object v0, p0, Lcom/dtd/freefireth/FFMainActivity;->_GenericMotionEventListener:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    iget-object v1, p0, Lcom/dtd/freefireth/FFMainActivity;->_GenericMotionEventListener:Ljava/lang/Object;

    check-cast v1, Lcom/unity3d/player/UnityPlayer$IGenericMotionEventListener;

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->SetGenericMotionEventListener(Lcom/unity3d/player/UnityPlayer$IGenericMotionEventListener;)V

    return-void
.end method

.method public releasePointerCapture()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->releasePointerCapture()V

    :cond_0
    return-void
.end method

.method public requestPointerCapture()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestPointerCapture()V

    :cond_0
    return-void
.end method

.method public unregisterCapturedPointerListener()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    invoke-virtual {v0}, Lcom/unity3d/player/UnityPlayer;->GLView()Landroid/view/SurfaceView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setOnCapturedPointerListener(Landroid/view/View$OnCapturedPointerListener;)V

    :cond_0
    return-void
.end method

.method public unregisterGenericMotionEventListener()V
    .locals 2

    iget-object v0, p0, Lcom/unity3d/player/UnityPlayerActivity;->mUnityPlayer:Lcom/unity3d/player/UnityPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/unity3d/player/UnityPlayer;->SetGenericMotionEventListener(Lcom/unity3d/player/UnityPlayer$IGenericMotionEventListener;)V

    return-void
.end method
