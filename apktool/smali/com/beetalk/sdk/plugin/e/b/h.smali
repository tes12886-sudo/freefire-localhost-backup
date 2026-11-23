.class public Lcom/beetalk/sdk/plugin/e/b/h;
.super Lcom/beetalk/sdk/plugin/e/b/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/b/a<",
        "Lcom/beetalk/sdk/w/b;",
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

.method static synthetic m(Lcom/beetalk/sdk/plugin/e/b/h;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lcom/beetalk/sdk/plugin/e/b/h;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected bridge synthetic b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/beetalk/sdk/w/b;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/h;->o(Landroid/app/Activity;Lcom/beetalk/sdk/w/b;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "facebook.share"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 5

    const-class v0, Lcom/facebook/share/c/u;

    invoke-static {v0}, Lcom/facebook/share/d/c;->u(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/facebook/share/d/c;

    invoke-direct {v0, p1}, Lcom/facebook/share/d/c;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v2, Lcom/beetalk/sdk/plugin/e/b/h$a;

    invoke-direct {v2, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/h$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/h;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lcom/beetalk/sdk/w/b;

    iget-object v4, v4, Lcom/beetalk/sdk/w/b;->e:[B

    check-cast v3, Lcom/beetalk/sdk/w/b;

    iget-object v3, v3, Lcom/beetalk/sdk/w/b;->e:[B

    array-length v3, v3

    invoke-static {v4, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-array v0, v2, [Ljava/lang/Object;

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

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :catch_1
    move-exception v2

    invoke-static {v2}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_0
    if-eqz v1, :cond_0

    new-instance p1, Lcom/facebook/share/c/t$b;

    invoke-direct {p1}, Lcom/facebook/share/c/t$b;-><init>()V

    invoke-virtual {p1, v1}, Lcom/facebook/share/c/t$b;->o(Landroid/graphics/Bitmap;)Lcom/facebook/share/c/t$b;

    invoke-virtual {p1}, Lcom/facebook/share/c/t$b;->i()Lcom/facebook/share/c/t;

    move-result-object p1

    new-instance v1, Lcom/facebook/share/c/u$b;

    invoke-direct {v1}, Lcom/facebook/share/c/u$b;-><init>()V

    invoke-virtual {v1, p1}, Lcom/facebook/share/c/u$b;->o(Lcom/facebook/share/c/t;)Lcom/facebook/share/c/u$b;

    invoke-virtual {v1}, Lcom/facebook/share/c/u$b;->q()Lcom/facebook/share/c/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Failed to create bitmap"

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Facebook App is not installed."

    :goto_1
    invoke-virtual {p0, v1, v2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method protected o(Landroid/app/Activity;Lcom/beetalk/sdk/w/b;)V
    .locals 2

    if-nez p2, :cond_0

    sget-object p2, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->g(Landroid/app/Activity;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/h;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "com.facebook.katana"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/d;->p(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p2

    sget-object v0, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "Facebook App is not installed."

    invoke-virtual {p0, v0, v1}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/a;->b(Landroid/app/Activity;Ljava/lang/Object;)V

    return-void
.end method

.method protected p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
