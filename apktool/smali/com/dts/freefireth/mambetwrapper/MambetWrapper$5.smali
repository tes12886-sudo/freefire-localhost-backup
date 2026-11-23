.class Lcom/dts/freefireth/mambetwrapper/MambetWrapper$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->VoiceDataSender_Stop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$300()Lcom/seagroup/gamesdk/VoiceDataSender;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->access$300()Lcom/seagroup/gamesdk/VoiceDataSender;

    move-result-object v0

    invoke-virtual {v0}, Lcom/seagroup/gamesdk/VoiceDataSender;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method
