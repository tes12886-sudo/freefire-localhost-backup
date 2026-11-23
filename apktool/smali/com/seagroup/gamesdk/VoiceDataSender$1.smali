.class Lcom/seagroup/gamesdk/VoiceDataSender$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/seagroup/gamesdk/VoiceDataSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/seagroup/gamesdk/VoiceDataSender;


# direct methods
.method constructor <init>(Lcom/seagroup/gamesdk/VoiceDataSender;)V
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string p1, "VoiceDataSender"

    const-string v0, "stream service connected"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    invoke-static {p1, v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$002(Lcom/seagroup/gamesdk/VoiceDataSender;Landroid/os/Messenger;)Landroid/os/Messenger;

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object p1

    const/4 p2, 0x7

    iput p2, p1, Landroid/os/Message;->what:I

    iget-object p2, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p2}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$100(Lcom/seagroup/gamesdk/VoiceDataSender;)Landroid/os/Messenger;

    move-result-object p2

    iput-object p2, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object p2, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p2, p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$200(Lcom/seagroup/gamesdk/VoiceDataSender;Landroid/os/Message;)V

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$300(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$300(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;->onConnectChanged(Z)V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "VoiceDataSender"

    const-string v0, "stream service disconnected"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$002(Lcom/seagroup/gamesdk/VoiceDataSender;Landroid/os/Messenger;)Landroid/os/Messenger;

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$300(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$300(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;->onConnectChanged(Z)V

    :cond_0
    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$400(Lcom/seagroup/gamesdk/VoiceDataSender;)Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/seagroup/gamesdk/VoiceDataSender$1;->this$0:Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {p1}, Lcom/seagroup/gamesdk/VoiceDataSender;->access$400(Lcom/seagroup/gamesdk/VoiceDataSender;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->start(Landroid/content/Context;)Z

    :cond_1
    return-void
.end method
