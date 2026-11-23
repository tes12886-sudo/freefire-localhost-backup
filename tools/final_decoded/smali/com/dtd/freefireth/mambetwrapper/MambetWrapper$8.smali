.class Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->onConnectChanged(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$b:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$8;->val$b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->access$500()Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->access$500()Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;

    move-result-object v0

    sget-object v1, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->UnitySendMessageGameObjectName:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$8;->val$b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onConnectChanged"

    invoke-interface {v0, v1, v3, v2}, Lcom/dtd/freefireth/mambetwrapper/IUnityMessenger;->Send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
