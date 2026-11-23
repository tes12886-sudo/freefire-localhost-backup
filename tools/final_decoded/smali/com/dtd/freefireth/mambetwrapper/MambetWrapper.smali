.class public Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static UnitySendMessageGameObjectName:Ljava/lang/String;

.field private static _Activity:Landroid/app/Activity;

.field private static _Messenger:Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

.field private static _StatusCallback:Lcom/dtd/freefireth/mambetwrapper/FFStatusCallback;

.field private static _VoiceDataSender:Lcom/seagroup/gamesdk/VoiceDataSender;

.field private static _info:Lcom/seagroup/gamesdk/MambetInfo;

.field private static _inited:Z

.field private static externalAudioDataSent:Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

.field private static gsonExternal:Lj/d/d/e;

.field private static gsonUnity:Lj/d/d/e;

.field private static unityAudioDataSent:Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

    invoke-direct {v0}, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;-><init>()V

    sput-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->unityAudioDataSent:Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

    new-instance v0, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

    invoke-direct {v0}, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;-><init>()V

    sput-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->externalAudioDataSent:Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static VoiceDataSender_ReleaseMic()V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$7;

    invoke-direct {v1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$7;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static VoiceDataSender_RequestMic()V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$6;

    invoke-direct {v1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$6;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static VoiceDataSender_SendAudioData(III[BII)V
    .locals 6

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_VoiceDataSender:Lcom/seagroup/gamesdk/VoiceDataSender;

    if-nez v0, :cond_0

    return-void

    :cond_0
    move v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Lcom/seagroup/gamesdk/VoiceDataSender;->sendAudioData(III[BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    :goto_0
    sget-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->gsonExternal:Lj/d/d/e;

    if-nez p0, :cond_1

    new-instance p0, Lj/d/d/e;

    invoke-direct {p0}, Lj/d/d/e;-><init>()V

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->gsonExternal:Lj/d/d/e;

    :cond_1
    sget-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->externalAudioDataSent:Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

    iput p5, p0, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;->id:I

    array-length p1, p3

    iput p1, p0, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;->length:I

    sget-object p1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->gsonExternal:Lj/d/d/e;

    invoke-virtual {p1, p0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Messenger:Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

    if-eqz p1, :cond_2

    sget-object p2, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->UnitySendMessageGameObjectName:Ljava/lang/String;

    const-string p3, "ExternalAudioDataSent"

    invoke-interface {p1, p2, p3, p0}, Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;->Send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static VoiceDataSender_SendUnityAudioData(II[FI)V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_VoiceDataSender:Lcom/seagroup/gamesdk/VoiceDataSender;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0, p0, p1, p2}, Lcom/seagroup/gamesdk/VoiceDataSender;->sendUnityAudioData(II[F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    :goto_0
    sget-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->gsonUnity:Lj/d/d/e;

    if-nez p0, :cond_1

    new-instance p0, Lj/d/d/e;

    invoke-direct {p0}, Lj/d/d/e;-><init>()V

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->gsonUnity:Lj/d/d/e;

    :cond_1
    sget-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->unityAudioDataSent:Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;

    iput p3, p0, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;->id:I

    array-length p1, p2

    iput p1, p0, Lcom/dtd/freefireth/mambetwrapper/AudioDataSent;->length:I

    sget-object p1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->gsonUnity:Lj/d/d/e;

    invoke-virtual {p1, p0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Messenger:Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

    if-eqz p1, :cond_2

    sget-object p2, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->UnitySendMessageGameObjectName:Ljava/lang/String;

    const-string p3, "UnityAudioDataSent"

    invoke-interface {p1, p2, p3, p0}, Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;->Send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static VoiceDataSender_Start(Z)V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$4;

    invoke-direct {v1, p0}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$4;-><init>(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static VoiceDataSender_Stop()V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$5;

    invoke-direct {v1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$5;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static _init(Landroid/app/Application;IZ)V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$1;-><init>(Landroid/app/Application;IZ)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static _pushEvent(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$3;

    invoke-direct {v0, p0, p1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static _setAccountID(Ljava/lang/String;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$2;

    invoke-direct {v0, p0}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$2;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic access$000()Z
    .locals 1

    sget-boolean v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_inited:Z

    return v0
.end method

.method static synthetic access$002(Z)Z
    .locals 0

    sput-boolean p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_inited:Z

    return p0
.end method

.method static synthetic access$100()Lcom/seagroup/gamesdk/MambetInfo;
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_info:Lcom/seagroup/gamesdk/MambetInfo;

    return-object v0
.end method

.method static synthetic access$102(Lcom/seagroup/gamesdk/MambetInfo;)Lcom/seagroup/gamesdk/MambetInfo;
    .locals 0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_info:Lcom/seagroup/gamesdk/MambetInfo;

    return-object p0
.end method

.method static synthetic access$200()Lcom/dtd/freefireth/mambetwrapper/FFStatusCallback;
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_StatusCallback:Lcom/dtd/freefireth/mambetwrapper/FFStatusCallback;

    return-object v0
.end method

.method static synthetic access$202(Lcom/dtd/freefireth/mambetwrapper/FFStatusCallback;)Lcom/dtd/freefireth/mambetwrapper/FFStatusCallback;
    .locals 0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_StatusCallback:Lcom/dtd/freefireth/mambetwrapper/FFStatusCallback;

    return-object p0
.end method

.method static synthetic access$300()Lcom/seagroup/gamesdk/VoiceDataSender;
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_VoiceDataSender:Lcom/seagroup/gamesdk/VoiceDataSender;

    return-object v0
.end method

.method static synthetic access$302(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender;
    .locals 0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_VoiceDataSender:Lcom/seagroup/gamesdk/VoiceDataSender;

    return-object p0
.end method

.method static synthetic access$400()Landroid/app/Activity;
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$500()Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Messenger:Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

    return-object v0
.end method

.method public static handleintent(Landroid/content/Intent;)V
    .locals 1

    sget-boolean v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_inited:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->parseIntent(Landroid/content/Intent;)Lcom/seagroup/gamesdk/MambetInfo;

    move-result-object p0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_info:Lcom/seagroup/gamesdk/MambetInfo;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->handleIntent(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static init(IZ)V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p0, p1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_init(Landroid/app/Application;IZ)V

    return-void
.end method

.method public static inited()Z
    .locals 1

    sget-boolean v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_inited:Z

    return v0
.end method

.method public static onConnectChanged(Z)V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@FFStatusCallback.onConnectChanged("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, "): MainActivity is null!"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "FreeFire"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$8;

    invoke-direct {v1, p0}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$8;-><init>(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static onMicFocusChanged(Z)V
    .locals 2

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@FFStatusCallback.onMicFocusChanged("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, "): MainActivity is null!"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "FreeFire"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$9;

    invoke-direct {v1, p0}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$9;-><init>(Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static pushEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_pushEvent(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static setAccountID(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_setAccountID(Ljava/lang/String;)Ljava/lang/Runnable;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static setActivity(Landroid/app/Activity;)V
    .locals 0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Activity:Landroid/app/Activity;

    return-void
.end method

.method public static setUnityMessenger(Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;)V
    .locals 0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_Messenger:Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

    return-void
.end method

.method public static setUnitySendMessageGameObjectName(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->UnitySendMessageGameObjectName:Ljava/lang/String;

    return-void
.end method
