.class public Lcom/seagroup/gamesdk/VoiceDataSender;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/seagroup/gamesdk/VoiceDataSender$ClientHandler;,
        Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;
    }
.end annotation


# static fields
.field private static final KEY_VOICE_BYTES_PER_SAMPLE:Ljava/lang/String; = "b"

.field private static final KEY_VOICE_CHANNEL_NUM:Ljava/lang/String; = "c"

.field private static final KEY_VOICE_DATA:Ljava/lang/String; = "d"

.field private static final KEY_VOICE_SAMPLE_RATE:Ljava/lang/String; = "s"

.field private static final KEY_VOICE_TIMESTAMP:Ljava/lang/String; = "t"

.field private static final MSG_MIC_STATE:I = 0x9

.field private static final MSG_ON_VOICE_DATA:I = 0xa

.field private static final MSG_RELEASE_MIC:I = 0xc

.field private static final MSG_REQUEST_MIC:I = 0xb

.field private static final MSG_SDK_INIT:I = 0x7

.field private static final MSG_SDK_UNINIT:I = 0x8

.field private static final MTV_MIC_OFF:I = 0x0

.field private static final MTV_MIC_OPEN:I = 0x1

.field private static final MTV_PACKAGE_NAME:Ljava/lang/String; = "com.mambet.tv"

.field private static final MTV_TEST_PACKAGE_NAME:Ljava/lang/String; = "com.mambet.tv.test"

.field private static final TAG:Ljava/lang/String; = "VoiceDataSender"

.field public static final VOICE_SOURCE_GAME:I = 0x3

.field public static final VOICE_SOURCE_MIC:I = 0x0

.field public static final VOICE_SOURCE_MIXED:I = 0x2

.field public static final VOICE_SOURCE_REMOTE:I = 0x1

.field private static clientHandler:Landroid/os/Handler;

.field private static senderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/seagroup/gamesdk/VoiceDataSender;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private callback:Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

.field private client:Landroid/os/Messenger;

.field private context:Landroid/content/Context;

.field private final isTest:Z

.field private messenger:Landroid/os/Messenger;

.field private serviceConnection:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/seagroup/gamesdk/VoiceDataSender$ClientHandler;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/seagroup/gamesdk/VoiceDataSender$ClientHandler;-><init>(Lcom/seagroup/gamesdk/VoiceDataSender$1;)V

    sput-object v0, Lcom/seagroup/gamesdk/VoiceDataSender;->clientHandler:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->context:Landroid/content/Context;

    iput-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    new-instance v0, Landroid/os/Messenger;

    sget-object v1, Lcom/seagroup/gamesdk/VoiceDataSender;->clientHandler:Landroid/os/Handler;

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->client:Landroid/os/Messenger;

    new-instance v0, Lcom/seagroup/gamesdk/VoiceDataSender$1;

    invoke-direct {v0, p0}, Lcom/seagroup/gamesdk/VoiceDataSender$1;-><init>(Lcom/seagroup/gamesdk/VoiceDataSender;)V

    iput-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->serviceConnection:Landroid/content/ServiceConnection;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/seagroup/gamesdk/VoiceDataSender;->senderRef:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->callback:Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

    iput-boolean p2, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->isTest:Z

    return-void
.end method

.method static synthetic access$002(Lcom/seagroup/gamesdk/VoiceDataSender;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    return-object p1
.end method

.method static synthetic access$100(Lcom/seagroup/gamesdk/VoiceDataSender;)Landroid/os/Messenger;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->client:Landroid/os/Messenger;

    return-object p0
.end method

.method static synthetic access$200(Lcom/seagroup/gamesdk/VoiceDataSender;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->safeSendMessage(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic access$300(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->callback:Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

    return-object p0
.end method

.method static synthetic access$400(Lcom/seagroup/gamesdk/VoiceDataSender;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$600()Ljava/lang/ref/WeakReference;
    .locals 1

    sget-object v0, Lcom/seagroup/gamesdk/VoiceDataSender;->senderRef:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private safeSendMessage(Landroid/os/Message;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "VoiceDataSender"

    const-string v1, "messenger broken"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public releaseMic()V
    .locals 2

    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0xc

    iput v1, v0, Landroid/os/Message;->what:I

    invoke-direct {p0, v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->safeSendMessage(Landroid/os/Message;)V

    :cond_0
    return-void
.end method

.method public requestMic()V
    .locals 2

    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0xb

    iput v1, v0, Landroid/os/Message;->what:I

    invoke-direct {p0, v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->safeSendMessage(Landroid/os/Message;)V

    :cond_0
    return-void
.end method

.method public sendAudioData(III[BI)V
    .locals 5

    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "c"

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "s"

    invoke-virtual {v3, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "b"

    invoke-virtual {v3, p1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "d"

    invoke-virtual {v3, p1, p4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string p1, "t"

    invoke-virtual {v3, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/16 p1, 0xa

    iput p1, v2, Landroid/os/Message;->what:I

    iput p5, v2, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    invoke-direct {p0, v2}, Lcom/seagroup/gamesdk/VoiceDataSender;->safeSendMessage(Landroid/os/Message;)V

    :cond_0
    return-void
.end method

.method public sendUnityAudioData(II[F)V
    .locals 5

    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->messenger:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "c"

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "s"

    invoke-virtual {v3, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "d"

    invoke-virtual {v3, p1, p3}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    const-string p1, "t"

    invoke-virtual {v3, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/16 p1, 0xa

    iput p1, v2, Landroid/os/Message;->what:I

    const/4 p1, 0x3

    iput p1, v2, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    invoke-direct {p0, v2}, Lcom/seagroup/gamesdk/VoiceDataSender;->safeSendMessage(Landroid/os/Message;)V

    :cond_0
    return-void
.end method

.method public start(Landroid/content/Context;)Z
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.seagroup.spark.action.SEND_VOICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->isTest:Z

    if-eqz v1, :cond_0

    const-string v1, "com.mambet.tv.test"

    goto :goto_0

    :cond_0
    const-string v1, "com.mambet.tv"

    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->serviceConnection:Landroid/content/ServiceConnection;

    const/16 v3, 0x8

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bind result: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "VoiceDataSender"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_1

    iput-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->context:Landroid/content/Context;

    :cond_1
    return v1
.end method

.method public stop()V
    .locals 2

    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->context:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x8

    iput v1, v0, Landroid/os/Message;->what:I

    invoke-direct {p0, v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->safeSendMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->serviceConnection:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/seagroup/gamesdk/VoiceDataSender;->context:Landroid/content/Context;

    :cond_0
    return-void
.end method
