.class Lcom/dts/freefireth/FFAPI$5;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dts/freefireth/FFAPI;->_createNetworkCallbacks()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    invoke-static {p1}, Lcom/dts/freefireth/FFAPI;->access$200(Landroid/net/Network;)V

    sget-object p1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v1, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v2, "WIFI"

    const-string v3, "available"

    invoke-direct {v1, v2, v3}, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "OnNetworkCallback"

    invoke-static {p1, v1, v0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onBlockedStatusChanged(Landroid/net/Network;Z)V

    sget-object p1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v1, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;

    if-eqz p2, :cond_0

    const-string p2, "blocked"

    goto :goto_0

    :cond_0
    const-string p2, "unblocked"

    :goto_0
    const-string v2, "WIFI"

    invoke-direct {v1, v2, p2}, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "OnNetworkCallback"

    invoke-static {p1, v0, p2}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 13

    if-eqz p2, :cond_a

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_2

    :try_start_0
    invoke-virtual {p2}, Landroid/net/NetworkCapabilities;->getTransportInfo()Landroid/net/TransportInfo;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiInfo;

    const/16 v1, 0x1e

    if-ge p1, v1, :cond_0

    const/16 p1, 0x64

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    invoke-static {v0, p1}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    move-result v0

    int-to-float v0, v0

    int-to-float p1, p1

    div-float/2addr v0, p1

    sput v0, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$400()Landroid/net/wifi/WifiManager;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "wifi"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    invoke-static {p1}, Lcom/dts/freefireth/FFAPI;->access$402(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiManager;

    :cond_1
    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$400()Landroid/net/wifi/WifiManager;

    move-result-object p1

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(I)I

    move-result p1

    int-to-float p1, p1

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$400()Landroid/net/wifi/WifiManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getMaxSignalLevel()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    sput p1, Lcom/dts/freefireth/FFAPI;->WifiSignalLevel:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    :cond_2
    :goto_0
    const/16 p1, 0xb

    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    sget-object v0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v1

    new-instance v12, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;

    const/16 v2, 0xc

    invoke-virtual {p2, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, -0x1

    :goto_1
    const/16 v2, 0x10

    invoke-virtual {p2, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, -0x1

    :goto_2
    invoke-virtual {p2, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    const/4 v7, -0x1

    :goto_3
    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v8, 0x1

    goto :goto_4

    :cond_6
    const/4 v8, -0x1

    :goto_4
    const/4 v2, 0x4

    invoke-virtual {p2, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v9, 0x1

    goto :goto_5

    :cond_7
    const/4 v9, -0x1

    :goto_5
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    if-eqz p1, :cond_8

    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    const/4 v10, -0x1

    :goto_6
    const/16 p1, 0xf

    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 v11, 0x1

    goto :goto_7

    :cond_9
    const/4 v11, -0x1

    :goto_7
    const-string v3, "WIFI"

    const-string v4, "capabilities_changed"

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIIII)V

    invoke-virtual {v1, v12}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "OnNetworkCallback"

    invoke-static {v0, p2, p1}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    return-void
.end method

.method public onLosing(Landroid/net/Network;I)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onLosing(Landroid/net/Network;I)V

    sget-object p1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object p2

    new-instance v0, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v1, "WIFI"

    const-string v2, "losing"

    invoke-direct {v0, v1, v2}, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "OnNetworkCallback"

    invoke-static {p1, v0, p2}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/dts/freefireth/FFAPI;->access$200(Landroid/net/Network;)V

    sget-object p1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v1, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v2, "WIFI"

    const-string v3, "lost"

    invoke-direct {v1, v2, v3}, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "OnNetworkCallback"

    invoke-static {p1, v1, v0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onUnavailable()V
    .locals 5

    invoke-super {p0}, Landroid/net/ConnectivityManager$NetworkCallback;->onUnavailable()V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/dts/freefireth/FFAPI;->access$200(Landroid/net/Network;)V

    sget-object v0, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v1

    new-instance v2, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v3, "WIFI"

    const-string v4, "unavailable"

    invoke-direct {v2, v3, v4}, Lcom/dts/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OnNetworkCallback"

    invoke-static {v0, v2, v1}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
