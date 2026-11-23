.class Lcom/seagroup/gamesdk/MambetSdkLibrary$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/seagroup/gamesdk/MambetSdkLibrary;->uploadingAsync(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

.field final synthetic val$sdkEventString:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    iput-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->val$sdkEventString:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lm/e;Ljava/io/IOException;)V
    .locals 1

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->val$sdkEventString:Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1200(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lm/e;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onResponse(Lm/e;Lm/d0;)V
    .locals 5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2}, Lm/d0;->Y()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "MambetSDK"

    if-eqz v1, :cond_1

    const-string p2, "upload events successful"

    invoke-static {v3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2, v2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1302(Lcom/seagroup/gamesdk/MambetSdkLibrary;I)I

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "upload events failed code:"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v1

    const/16 v4, 0x193

    if-eq v1, v4, :cond_6

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v1

    const/16 v4, 0x191

    if-ne v1, v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v1

    const/16 v4, 0x1f4

    if-eq v1, v4, :cond_5

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v1

    const/16 v4, 0x1f6

    if-eq v1, v4, :cond_5

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result v1

    const/16 v4, 0x1f7

    if-eq v1, v4, :cond_5

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result p2

    const/16 v1, 0x1f8

    if-ne p2, v1, :cond_0

    goto :goto_2

    :goto_0
    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1400(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, "continue uploading events..."

    invoke-static {v3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1400(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/seagroup/gamesdk/SdkEventBuilder;

    if-eqz p2, :cond_4

    iget-object v0, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-virtual {p2}, Lcom/seagroup/gamesdk/SdkEventBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$400(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string p2, "events uploaded"

    invoke-static {v3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$302(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lm/e;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->val$sdkEventString:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1200(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    return-void

    :cond_6
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lm/d0;->l()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " received, clear token"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$700(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lm/e;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1000(Lcom/seagroup/gamesdk/MambetSdkLibrary;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1100(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/String;)V

    :cond_7
    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p1, v0}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$302(Lcom/seagroup/gamesdk/MambetSdkLibrary;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    iget-object p1, p0, Lcom/seagroup/gamesdk/MambetSdkLibrary$3;->this$0:Lcom/seagroup/gamesdk/MambetSdkLibrary;

    invoke-static {p1, v2}, Lcom/seagroup/gamesdk/MambetSdkLibrary;->access$1302(Lcom/seagroup/gamesdk/MambetSdkLibrary;I)I

    return-void
.end method
