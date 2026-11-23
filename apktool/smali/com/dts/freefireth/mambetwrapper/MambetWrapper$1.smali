.class Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->_init(Landroid/app/Application;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$application:Landroid/app/Application;

.field final synthetic val$debug_mode:Z

.field final synthetic val$game_id:I


# direct methods
.method constructor <init>(Landroid/app/Application;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$application:Landroid/app/Application;

    iput p2, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$game_id:I

    iput-boolean p3, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$debug_mode:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$application:Landroid/app/Application;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$000()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$application:Landroid/app/Application;

    iget v1, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$game_id:I

    iget-boolean v2, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$1;->val$debug_mode:Z

    invoke-static {v0, v1, v2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->init(Landroid/app/Application;IZ)V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$002(Z)Z

    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$100()Lcom/seagroup/gamesdk/MambetInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_2

    :try_start_1
    invoke-static {}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;

    move-result-object v0

    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$100()Lcom/seagroup/gamesdk/MambetInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->handleMambetInfo(Lcom/seagroup/gamesdk/MambetInfo;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v0}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$102(Lcom/seagroup/gamesdk/MambetInfo;)Lcom/seagroup/gamesdk/MambetInfo;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    const-string v1, "Mambet"

    const-string v2, "init throw"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    return-void
.end method
