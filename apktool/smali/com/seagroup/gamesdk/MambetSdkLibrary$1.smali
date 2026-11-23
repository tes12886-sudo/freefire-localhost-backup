.class Lcom/seagroup/gamesdk/MambetSdkLibrary$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/seagroup/gamesdk/MambetSdkLibrary;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;


# direct methods
.method constructor <init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;)V
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$000(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    const-string v1, "MambetSDK"

    const-string v2, "it time to check..."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$100(Lcom/seagroup/gamesdk/MambetSdkLibrary;)V

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$200(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Lcom/seagroup/gamesdk/SdkEventBuilder;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$300(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$200(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Lcom/seagroup/gamesdk/SdkEventBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/seagroup/gamesdk/SdkEventBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$400(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$202(Lcom/seagroup/gamesdk/MambetSdkLibrary;Lcom/seagroup/gamesdk/SdkEventBuilder;)Lcom/seagroup/gamesdk/SdkEventBuilder;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$600(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$1;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$500(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
