.class Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->_setAccountID(Ljava/lang/String;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$accountID:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$2;->val$accountID:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper;->access$000()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->getInstance()Lcom/seagroup/gamesdk/MambetSdkLibrary;

    move-result-object v0

    iget-object v1, p0, Lcom/dtd/freefireth/mambetwrapper/MambetWrapper$2;->val$accountID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->setCurrentAccountID(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method
