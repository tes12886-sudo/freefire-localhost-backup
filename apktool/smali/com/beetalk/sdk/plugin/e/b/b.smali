.class public Lcom/beetalk/sdk/plugin/e/b/b;
.super Lcom/beetalk/sdk/plugin/e/b/h;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/e/b/h;-><init>()V

    return-void
.end method

.method static synthetic q(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "facebook.share.fallback"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/b$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/b$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/b;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 6

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v0, Lcom/beetalk/sdk/w/b;

    :try_start_0
    iget-object v1, v0, Lcom/beetalk/sdk/w/b;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/beetalk/sdk/w/b;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    iget-object v3, v0, Lcom/beetalk/sdk/w/b;->d:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v2, v0, Lcom/beetalk/sdk/w/b;->d:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    new-instance v3, Lcom/facebook/share/d/c;

    invoke-direct {v3, p1}, Lcom/facebook/share/d/c;-><init>(Landroid/app/Activity;)V

    new-instance v4, Lcom/facebook/share/c/g$b;

    invoke-direct {v4}, Lcom/facebook/share/c/g$b;-><init>()V

    iget-object v5, v0, Lcom/beetalk/sdk/w/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/facebook/share/c/g$b;->t(Ljava/lang/String;)Lcom/facebook/share/c/g$b;

    iget-object v0, v0, Lcom/beetalk/sdk/w/b;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/facebook/share/c/g$b;->s(Ljava/lang/String;)Lcom/facebook/share/c/g$b;

    invoke-virtual {v4, v1}, Lcom/facebook/share/c/e$a;->h(Landroid/net/Uri;)Lcom/facebook/share/c/e$a;

    check-cast v4, Lcom/facebook/share/c/g$b;

    invoke-virtual {v4, v2}, Lcom/facebook/share/c/g$b;->u(Landroid/net/Uri;)Lcom/facebook/share/c/g$b;

    invoke-virtual {v4}, Lcom/facebook/share/c/g$b;->r()Lcom/facebook/share/c/g;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v2, Lcom/beetalk/sdk/plugin/e/b/b$b;

    invoke-direct {v2, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/b$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/b;Landroid/app/Activity;)V

    invoke-virtual {v3, v1, v2}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    invoke-virtual {v3, v0}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    return-void

    :catch_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Error Uri."

    invoke-virtual {p0, v1, v2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method protected p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
