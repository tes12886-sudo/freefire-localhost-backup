.class Lcom/seagroup/gamesdk/MambetSdkLibrary$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/seagroup/gamesdk/MambetSdkLibrary;->updateChannelStatus()V
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

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lm/e;Ljava/io/IOException;)V
    .locals 1

    const-string p2, "MambetSDK"

    const-string v0, "polling status failed"

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lm/e;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onResponse(Lm/e;Lm/d0;)V
    .locals 3

    invoke-virtual {p2}, Lm/d0;->Y()Z

    move-result v0

    const-string v1, "MambetSDK"

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lm/d0;->b()Lm/e0;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "empty response"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    iget-object v0, v0, Lcom/seagroup/gamesdk/MambetSdkLibrary;->gson:Lj/d/d/e;

    invoke-virtual {p2}, Lm/d0;->b()Lm/e0;

    move-result-object p2

    invoke-virtual {p2}, Lm/e0;->O()Ljava/lang/String;

    move-result-object p2

    const-class v2, Lcom/seagroup/gamesdk/CheckChannelResponse;

    invoke-virtual {v0, p2, v2}, Lj/d/d/e;->k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/seagroup/gamesdk/CheckChannelResponse;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-virtual {p2}, Lcom/seagroup/gamesdk/CheckChannelResponse;->getStreamId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$802(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-virtual {p2}, Lcom/seagroup/gamesdk/CheckChannelResponse;->getStatus()I

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-static {v0, p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$902(Lcom/seagroup/gamesdk/MambetSdkLibrary;Z)Z

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "is streaming "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$900(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Z

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    const-string p2, "can\'t parse response"

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v0

    const/16 v2, 0x193

    if-eq v0, v2, :cond_3

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v0

    const/16 v2, 0x191

    if-ne v0, v2, :cond_4

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " received, clear token"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lm/e;->c()Lm/b0;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1000(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    const-string v0, ""

    invoke-static {p2, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1100(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$2;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lm/e;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
