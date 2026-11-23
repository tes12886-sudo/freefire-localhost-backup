.class Lcom/dts/freefireth/mambetwrapper/FFStatusCallback;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/seagroup/gamesdk/VoiceDataSender$OnStatusCallback;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectChanged(Z)V
    .locals 0

    invoke-static {p1}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->onConnectChanged(Z)V

    return-void
.end method

.method public onMicFocusChanged(Z)V
    .locals 0

    invoke-static {p1}, Lcom/dts/freefireth/mambetwrapper/MambetWrapper;->onMicFocusChanged(Z)V

    return-void
.end method
