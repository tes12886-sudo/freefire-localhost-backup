.class Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;


# direct methods
.method constructor <init>(Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string p1, "recv by UnityPlayerActivity"

    invoke-static {p1, p2}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$000(Ljava/lang/String;Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    iget-object p1, p1, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;->this$0:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-static {p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$300(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)Landroid/app/Activity;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    const-string p1, "activity_pid"

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_0

    :try_start_0
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v2, "UWVActivityProxy"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "kill pid "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    iget-object p1, p1, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;->this$0:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-static {p1, v0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$502(Lcom/garena/unity/webview/UnityWebViewActivityProxy;Z)Z

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    iget-object p1, p1, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;->this$0:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-static {p1, v0}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$602(Lcom/garena/unity/webview/UnityWebViewActivityProxy;Z)Z

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    iget-object p1, p1, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;->this$0:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-static {p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$300(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    iget-object p1, p1, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;->this$0:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-static {p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$300(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)Landroid/app/Activity;

    move-result-object p1

    instance-of p1, p1, Lcom/unity3d/player/UnityPlayerActivity;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1$9;->this$1:Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;

    iget-object p1, p1, Lcom/garena/unity/webview/UnityWebViewActivityProxy$1;->this$0:Lcom/garena/unity/webview/UnityWebViewActivityProxy;

    invoke-static {p1}, Lcom/garena/unity/webview/UnityWebViewActivityProxy;->access$300(Lcom/garena/unity/webview/UnityWebViewActivityProxy;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Lcom/unity3d/player/UnityPlayerActivity;

    invoke-virtual {p1, v0}, Lcom/unity3d/player/UnityPlayerActivity;->setUseStartStopInsteadOfPauseResume(Z)V

    :cond_1
    const-string p1, "force"

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "ForceCloseAll"

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/garena/unity/webview/WebViewManager;->__sendToUnity(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
