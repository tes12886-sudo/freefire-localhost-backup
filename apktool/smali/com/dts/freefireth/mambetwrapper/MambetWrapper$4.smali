.class Lcom/dts/freefireth/mambetwrapper/MambetWrapper$4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->VoiceDataSender_Start(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$debug_mode:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$4;->val$debug_mode:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$200()Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;

    invoke-direct {v0}, Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;-><init>()V

    invoke-static {v0}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$202(Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;)Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;

    :cond_0
    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$300()Lcom/seagroup/gamesdk/VoiceDataSender;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/seagroup/gamesdk/VoiceDataSender;

    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$200()Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;

    move-result-object v1

    iget-boolean v2, p0, Lcom/dts/freefireth/mambetwrapper/MambetWrapper$4;->val$debug_mode:Z

    invoke-direct {v0, v1, v2}, Lcom/seagroup/gamesdk/VoiceDataSender;-><init>(Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;Z)V

    invoke-static {v0}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$302(Lcom/seagroup/gamesdk/VoiceDataSender;)Lcom/seagroup/gamesdk/VoiceDataSender;

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$300()Lcom/seagroup/gamesdk/VoiceDataSender;

    move-result-object v0

    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$400()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/seagroup/gamesdk/VoiceDataSender;->start(Landroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
