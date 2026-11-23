.class public Lcom/beetalk/sdk/plugin/e/b/g;
.super Lcom/beetalk/sdk/plugin/e/b/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/b/a<",
        "[B",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/e/b/a;-><init>()V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "facebook.messenger.send.image"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->s:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/g$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/g$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/g;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 4

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/g;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    const-string v1, "The content url is empty"

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :cond_0
    const-class v0, Lcom/facebook/share/c/u;

    invoke-static {v0}, Lcom/facebook/share/d/b;->q(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [B

    check-cast v2, [B

    array-length v2, v2

    invoke-static {v3, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "Failed to create bitmap: out of memory"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v2, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2, v1}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :catch_1
    move-exception v1

    invoke-static {v1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lcom/facebook/share/c/t$b;

    invoke-direct {v1}, Lcom/facebook/share/c/t$b;-><init>()V

    invoke-virtual {v1, v0}, Lcom/facebook/share/c/t$b;->o(Landroid/graphics/Bitmap;)Lcom/facebook/share/c/t$b;

    invoke-virtual {v1}, Lcom/facebook/share/c/t$b;->i()Lcom/facebook/share/c/t;

    move-result-object v0

    new-instance v1, Lcom/facebook/share/c/u$b;

    invoke-direct {v1}, Lcom/facebook/share/c/u$b;-><init>()V

    invoke-virtual {v1, v0}, Lcom/facebook/share/c/u$b;->o(Lcom/facebook/share/c/t;)Lcom/facebook/share/c/u$b;

    new-instance v0, Lcom/facebook/share/d/b;

    invoke-direct {v0, p1}, Lcom/facebook/share/d/b;-><init>(Landroid/app/Activity;)V

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v3, Lcom/beetalk/sdk/plugin/e/b/g$b;

    invoke-direct {v3, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/g$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/g;Landroid/app/Activity;)V

    invoke-virtual {v0, v2, v3}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    invoke-virtual {v1}, Lcom/facebook/share/c/u$b;->q()Lcom/facebook/share/c/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Failed to create bitmap"

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Cannot show Messenger dialog"

    :goto_1
    invoke-virtual {p0, v1, v2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    :goto_2
    return-void
.end method
