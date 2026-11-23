.class Lcom/dtd/freefireth/FFAPI$6;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dtd/freefireth/FFAPI;->_createNetworkCallbacks()V
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

    invoke-static {p1}, Lcom/dtd/freefireth/FFAPI;->access$500(Landroid/net/Network;)V

    sget-object p1, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v1, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v2, "Cellular"

    const-string v3, "available"

    invoke-direct {v1, v2, v3}, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "OnNetworkCallback"

    invoke-static {p1, v1, v0}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onBlockedStatusChanged(Landroid/net/Network;Z)V

    sget-object p1, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v1, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;

    if-eqz p2, :cond_0

    const-string p2, "blocked"

    goto :goto_0

    :cond_0
    const-string p2, "unblocked"

    :goto_0
    const-string v2, "Cellular"

    invoke-direct {v1, v2, p2}, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "OnNetworkCallback"

    invoke-static {p1, v0, p2}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 12

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    sget-object p1, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v11, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;

    const/16 v1, 0xc

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, -0x1

    :goto_0
    const/16 v1, 0x10

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, -0x1

    :goto_1
    invoke-virtual {p2, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, -0x1

    :goto_2
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, -0x1

    :goto_3
    const/4 v1, 0x4

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v8, 0x1

    goto :goto_4

    :cond_4
    const/4 v8, -0x1

    :goto_4
    const/16 v1, 0xb

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v9, 0x1

    goto :goto_5

    :cond_5
    const/4 v9, -0x1

    :goto_5
    const/16 v1, 0xf

    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p2

    if-eqz p2, :cond_6

    const/4 v10, 0x1

    goto :goto_6

    :cond_6
    const/4 v10, -0x1

    :goto_6
    const-string v2, "Cellular"

    const-string v3, "capabilities_changed"

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIIII)V

    invoke-virtual {v0, v11}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "OnNetworkCallback"

    invoke-static {p1, v0, p2}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onLosing(Landroid/net/Network;I)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onLosing(Landroid/net/Network;I)V

    sget-object p1, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object p2

    new-instance v0, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v1, "Cellular"

    const-string v2, "losing"

    invoke-direct {v0, v1, v2}, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "OnNetworkCallback"

    invoke-static {p1, v0, p2}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/dtd/freefireth/FFAPI;->access$500(Landroid/net/Network;)V

    sget-object p1, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v0

    new-instance v1, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v2, "Cellular"

    const-string v3, "lost"

    invoke-direct {v1, v2, v3}, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "OnNetworkCallback"

    invoke-static {p1, v1, v0}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onUnavailable()V
    .locals 5

    invoke-super {p0}, Landroid/net/ConnectivityManager$NetworkCallback;->onUnavailable()V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/dtd/freefireth/FFAPI;->access$500(Landroid/net/Network;)V

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v1

    new-instance v2, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;

    const-string v3, "Cellular"

    const-string v4, "unavailable"

    invoke-direct {v2, v3, v4}, Lcom/dtd/freefireth/FFAPI$NetworkCallbackEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OnNetworkCallback"

    invoke-static {v0, v2, v1}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
