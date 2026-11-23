.class public Lcom/garena/unity/webview/UnityWebViewActivityProxy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/garena/unity/webview/IUnityWebViewProxy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/unity/webview/UnityWebViewActivityProxy$IntentExtras;,
        Lcom/garena/unity/webview/UnityWebViewActivityProxy$IntentActions;
    }
.end annotation


# static fields
.field private static final BROADCAST_RECEIVER_LOG:Ljava/lang/String; = "recv by UnityPlayerActivity"

.field private static final LOG_TAG:Ljava/lang/String; = "UWVActivityProxy"

.field public static final REQUEST_CODE_UNITY_WEB_VIEW_ACTIVITY:I = 0xbbb

.field public static volatile WebContentDebugging:Z

.field private static _DebugLog:Z

.field private static volatile _I:Lcom/garena/unity/webview/UnityWebViewActivityProxy;


# instance fields
.field private volatile _NextWebViewId:I

.field private _UnityMessenger:Lcom/garena/unity/webview/IUnityMessenger;

.field private _UnityPlayerActivity:Landroid/app/Activity;

.field private volatile _WebViewActivityPresent:Z

.field private volatile _WebViewActivityRunning:Z

.field private volatile _WebViewStatuses:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/garena/unity/webview/WebViewStatus;",
            ">;"
        }
    .end annotation
.end field

.field private final _WebViewToUnityBroadcastReceivers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/content/BroadcastReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private _pendingIntentsToWebViewActivity:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final gson:Lj/d/d/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    invoke-direct {v0, p0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;-><init>(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)V

    iput-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewToUnityBroadcastReceivers:Ljava/util/HashMap;

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    iput-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->gson:Lj/d/d/e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewStatuses:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    iput-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityPresent:Z

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_pendingIntentsToWebViewActivity:Ljava/util/LinkedList;

    iput v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_NextWebViewId:I

    return-void
.end method

.method public static declared-synchronized I()Lcom/garena/unity/webview/UnityWebViewActivityProxy;
    .locals 2

    const-class v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_I:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    if-nez v1, :cond_0

    new-instance v1, Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-direct {v1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;-><init>()V

    sput-object v1, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_I:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    :cond_0
    sget-object v1, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_I:Lcom/garena/unity/webview/UnityWebViewActivityProxy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static LogIntent(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 7

    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_DebugLog:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v3, "%s: action %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "UWVActivityProxy"

    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p0, v6, v2

    aput-object v5, v6, v4

    invoke-virtual {p1, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v6, v0

    const-string v5, "%s: %s %s"

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method private declared-synchronized NewWebViewId()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_NextWebViewId:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_NextWebViewId:I

    iget v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_NextWebViewId:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static SetDebugLog(Z)V
    .locals 0

    sput-boolean p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_DebugLog:Z

    return-void
.end method

.method private declared-synchronized _onWebViewActivityReady()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    iput-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityPresent:Z

    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_pendingIntentsToWebViewActivity:Ljava/util/LinkedList;

    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    :try_start_3
    iget-object v1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_pendingIntentsToWebViewActivity:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_pendingIntentsToWebViewActivity:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    const-string v2, "send queued to WebViewActivity"

    invoke-static {v2, v1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->LogIntent(Ljava/lang/String;Landroid/content/Intent;)V

    iget-object v2, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    invoke-virtual {v2, v1}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v1

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method private declared-synchronized _sendIntentToWebView(Ljava/lang/String;I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "web_view_id"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/4 p2, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized _sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_DebugLog:Z

    if-eqz v0, :cond_1

    const-string v0, "UWVActivityProxy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_sendIntentToWebViewActivity: running: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "UWVActivityProxy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_sendIntentToWebViewActivity: present: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityPresent:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    if-eqz v0, :cond_4

    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "debug_log"

    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_DebugLog:Z

    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "content_debugging"

    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->WebContentDebugging:Z

    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    if-eqz p2, :cond_2

    invoke-virtual {p3, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2
    iget-boolean p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityPresent:Z

    if-eqz p1, :cond_3

    const-string p1, "broadcast to WebViewActivity"

    invoke-static {p1, p3}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->LogIntent(Ljava/lang/String;Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    invoke-virtual {p1, p3}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_pendingIntentsToWebViewActivity:Ljava/util/LinkedList;

    monitor-enter p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    const-string p2, "queued for WebViewActivity"

    invoke-static {p2, p3}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->LogIntent(Ljava/lang/String;Landroid/content/Intent;)V

    iget-object p2, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_pendingIntentsToWebViewActivity:Ljava/util/LinkedList;

    invoke-virtual {p2, p3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p2

    :cond_4
    if-eqz p3, :cond_7

    new-instance p3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    const-class v1, Lcom/garena/unity/webview/UnityWebViewActivity;

    invoke-direct {p3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p3, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "debug_log"

    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_DebugLog:Z

    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "content_debugging"

    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->WebContentDebugging:Z

    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    if-eqz p2, :cond_5

    invoke-virtual {p3, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_5
    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    instance-of p2, p1, Lcom/unity3d/player/UnityPlayerActivity;

    const/4 v0, 0x1

    if-eqz p2, :cond_6

    check-cast p1, Lcom/unity3d/player/UnityPlayerActivity;

    invoke-virtual {p1, v0}, Lcom/unity3d/player/UnityPlayerActivity;->setUseStartStopInsteadOfPauseResume(Z)V

    :cond_6
    iput-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    const-string p1, "start WebViewActivity"

    invoke-static {p1, p3}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->LogIntent(Ljava/lang/String;Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    invoke-virtual {p1, p3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_7
    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic access$000(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->LogIntent(Ljava/lang/String;Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic access$100(Lcom/garena/unity/webview/UnityWebViewActivityProxy;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic access$200(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)V
    .locals 0

    invoke-direct {p0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_onWebViewActivityReady()V

    return-void
.end method

.method static synthetic access$300(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$400(Lcom/garena/unity/webview/UnityWebViewActivityProxy;ILcom/garena/unity/webview/WebViewStatus;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->updateWebViewStatus(ILcom/garena/unity/webview/WebViewStatus;)V

    return-void
.end method

.method static synthetic access$502(Lcom/garena/unity/webview/UnityWebViewActivityProxy;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    return p1
.end method

.method static synthetic access$602(Lcom/garena/unity/webview/UnityWebViewActivityProxy;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityPresent:Z

    return p1
.end method

.method private declared-synchronized updateWebViewStatus(ILcom/garena/unity/webview/WebViewStatus;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewStatuses:Ljava/util/HashMap;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewStatuses:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public Log(ILjava/lang/String;)V
    .locals 1

    const-string v0, "OnWebViewMessage_Android"

    invoke-virtual {p0, p1, v0, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->sendToUnity(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public Log(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "OnWebViewMessage_Android"

    invoke-virtual {p0, p1, p3, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->sendToUnity(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public LogExtra(ILjava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, v0, Lcom/garena/unity/webview/WebViewStatus;->ExtraLog:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->Log(ILjava/lang/String;)V

    return-void
.end method

.method public LogExtra(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, v0, Lcom/garena/unity/webview/WebViewStatus;->ExtraLog:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->Log(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public canClearCache()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public canClearCookies()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public canGoBackward(I)V
    .locals 1

    const-string v0, "can_go_backward"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public canGoForward(I)V
    .locals 1

    const-string v0, "can_go_forward"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public captureScreenshot(ILjava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "web_view_id"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "file_name"

    invoke-virtual {v1, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "capture_screenshot"

    invoke-direct {p0, p1, v1, v0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public clearCache()V
    .locals 0

    return-void
.end method

.method public clearCookies()V
    .locals 0

    return-void
.end method

.method public clearData()V
    .locals 3

    const-string v0, "clear_all"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public close(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->updateWebViewStatus(ILcom/garena/unity/webview/WebViewStatus;)V

    const-string v0, "close"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public closeAll()V
    .locals 3

    const-string v0, "close_all"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public destroy()V
    .locals 4

    sget-boolean v0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_DebugLog:Z

    if-eqz v0, :cond_0

    const-string v0, "UWVActivityProxy"

    const-string v1, "UnityPlayerActivity.onDestroy()!!!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewToUnityBroadcastReceivers:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewToUnityBroadcastReceivers:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->closeAll()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    iput-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityMessenger:Lcom/garena/unity/webview/IUnityMessenger;

    :cond_2
    return-void
.end method

.method public getLoadingProgress(I)D
    .locals 2

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-wide v0, p1, Lcom/garena/unity/webview/WebViewStatus;->LoadingProgress:D

    return-wide v0

    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0
.end method

.method public declared-synchronized getStatus(I)Lcom/garena/unity/webview/WebViewStatus;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewStatuses:Ljava/util/HashMap;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewStatuses:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/garena/unity/webview/WebViewStatus;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getUrl(I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/garena/unity/webview/WebViewStatus;->Url:Ljava/lang/String;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public getUserAgentString(I)V
    .locals 1

    const-string v0, "get_ua"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public goBackward(I)V
    .locals 1

    const-string v0, "go_backward"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public goForward(I)V
    .locals 1

    const-string v0, "go_forward"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public hide(I)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/garena/unity/webview/WebViewStatus;->Hiding:Z

    invoke-direct {p0, p1, v0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->updateWebViewStatus(ILcom/garena/unity/webview/WebViewStatus;)V

    :cond_0
    const-string v0, "hide"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public ignoreUnityPlayerActivityWindowFocusChanged()Z
    .locals 1

    iget-boolean v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewActivityRunning:Z

    return v0
.end method

.method public init(Landroid/app/Activity;)V
    .locals 4

    iput-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewToUnityBroadcastReceivers:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_WebViewToUnityBroadcastReceivers:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/BroadcastReceiver;

    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isLoading(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lcom/garena/unity/webview/WebViewStatus;->IsLoading:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isShowing(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lcom/garena/unity/webview/WebViewStatus;->Hiding:Z

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public move(IFFFF)V
    .locals 0

    return-void
.end method

.method public onUnityPlayerActivityDestroy(Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->destroy()V

    return-void
.end method

.method public onUnityPlayerActivityPause(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onUnityPlayerActivityResume(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onUnityPlayerActivityStart(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onUnityPlayerActivityStop(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public open(Ljava/lang/String;FFFFLjava/lang/String;)I
    .locals 5

    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityPlayerActivity:Landroid/app/Activity;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-direct {p0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->NewWebViewId()I

    move-result v0

    new-instance v1, Lcom/garena/unity/webview/WebViewStatus;

    invoke-direct {v1}, Lcom/garena/unity/webview/WebViewStatus;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->updateWebViewStatus(ILcom/garena/unity/webview/WebViewStatus;)V

    iput-object p1, v1, Lcom/garena/unity/webview/WebViewStatus;->Url:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/garena/unity/webview/WebViewStatus;->Opening:Z

    if-eqz p6, :cond_1

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    iget-object v3, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->gson:Lj/d/d/e;

    const-class v4, Lcom/garena/unity/webview/WebViewParameters;

    invoke-virtual {v3, p6, v4}, Lj/d/d/e;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lcom/garena/unity/webview/WebViewParameters;

    goto :goto_0

    :cond_1
    new-instance p6, Lcom/garena/unity/webview/WebViewParameters;

    invoke-direct {p6}, Lcom/garena/unity/webview/WebViewParameters;-><init>()V

    :goto_0
    iget-boolean v3, p6, Lcom/garena/unity/webview/WebViewParameters;->ExtraLog:Z

    iput-boolean v3, v1, Lcom/garena/unity/webview/WebViewStatus;->ExtraLog:Z

    iget-object v3, p6, Lcom/garena/unity/webview/WebViewParameters;->UnitySendMessageGameObjectName:Ljava/lang/String;

    iput-object v3, v1, Lcom/garena/unity/webview/WebViewStatus;->UnitySendMessageGameObjectName:Ljava/lang/String;

    iget-boolean v3, p6, Lcom/garena/unity/webview/WebViewParameters;->DeferredDisplay:Z

    if-eqz v3, :cond_2

    iput-boolean v2, v1, Lcom/garena/unity/webview/WebViewStatus;->DeferredDisplay:Z

    iput-boolean v2, v1, Lcom/garena/unity/webview/WebViewStatus;->DeferringDisplay:Z

    :cond_2
    new-instance v1, Lcom/garena/unity/webview/WebViewActivityParameters;

    invoke-direct {v1, v0}, Lcom/garena/unity/webview/WebViewActivityParameters;-><init>(I)V

    iput v0, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->id:I

    iput-object p1, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->url:Ljava/lang/String;

    iput p2, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->x:F

    iput p3, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->y:F

    iput p4, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->w:F

    iput p5, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->h:F

    invoke-static {}, Lcom/garena/unity/webview/WebViewManager;->getNameInJavaScript()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/garena/unity/webview/WebViewActivityParameters;->script_handler_name:Ljava/lang/String;

    invoke-virtual {v1, p6}, Lcom/garena/unity/webview/WebViewActivityParameters;->merge(Lcom/garena/unity/webview/WebViewParameters;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "web_view_parameters"

    invoke-virtual {p1, p2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "open"

    invoke-direct {p0, p2, p1, v2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    return v0
.end method

.method public reload(I)V
    .locals 1

    const-string v0, "reload"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public runJavaScript(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/garena/unity/webview/JavaScriptInvoke;

    invoke-direct {v0}, Lcom/garena/unity/webview/JavaScriptInvoke;-><init>()V

    iput p1, v0, Lcom/garena/unity/webview/JavaScriptInvoke;->webViewId:I

    iput-object p2, v0, Lcom/garena/unity/webview/JavaScriptInvoke;->code:Ljava/lang/String;

    iput-object p3, v0, Lcom/garena/unity/webview/JavaScriptInvoke;->callback:Ljava/lang/String;

    iput-object p4, v0, Lcom/garena/unity/webview/JavaScriptInvoke;->id:Ljava/lang/String;

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "javascript_invoke"

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "run_javascript"

    const/4 p3, 0x0

    invoke-direct {p0, p2, p1, p3}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public sendToUnity(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/garena/unity/webview/WebViewStatus;->UnitySendMessageGameObjectName:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityMessenger:Lcom/garena/unity/webview/IUnityMessenger;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Lcom/garena/unity/webview/WebViewStatus;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-interface {v0, p1, p2, p3}, Lcom/garena/unity/webview/IUnityMessenger;->Send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setUnityMessenger(Lcom/garena/unity/webview/IUnityMessenger;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_UnityMessenger:Lcom/garena/unity/webview/IUnityMessenger;

    return-void
.end method

.method public setUserAgentString(ILjava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "web_view_id"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "ua"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "set_ua"

    const/4 p2, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public show(I)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->getStatus(I)Lcom/garena/unity/webview/WebViewStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/garena/unity/webview/WebViewStatus;->Hiding:Z

    invoke-direct {p0, p1, v0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->updateWebViewStatus(ILcom/garena/unity/webview/WebViewStatus;)V

    :cond_0
    const-string v0, "show"

    invoke-direct {p0, v0, p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebView(Ljava/lang/String;I)V

    return-void
.end method

.method public test()V
    .locals 3

    const-string v0, "test"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->_sendIntentToWebViewActivity(Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public webStorage_DeleteAllData()V
    .locals 0

    return-void
.end method
