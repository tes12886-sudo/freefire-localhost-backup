.class public Lcom/beetalk/sdk/plugin/e/b/c;
.super Lcom/beetalk/sdk/plugin/e/b/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/b/a<",
        "Lcom/beetalk/sdk/plugin/e/b/j/a;",
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

    const-string v0, "facebook.game.message"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->q:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/c$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/c$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/c;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 6

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    check-cast v0, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-wide v2, v0, Lcom/beetalk/sdk/plugin/e/b/j/a;->a:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/facebook/share/d/a;

    invoke-direct {v0, p1}, Lcom/facebook/share/d/a;-><init>(Landroid/app/Activity;)V

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v3, Lcom/beetalk/sdk/plugin/e/b/c$b;

    invoke-direct {v3, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/c$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/c;Landroid/app/Activity;)V

    invoke-virtual {v0, v2, v3}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    new-instance v2, Lcom/facebook/share/c/c$c;

    invoke-direct {v2}, Lcom/facebook/share/c/c$c;-><init>()V

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v3, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v3, v3, Lcom/beetalk/sdk/plugin/e/b/j/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/share/c/c$c;->p(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v3, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v3, v3, Lcom/beetalk/sdk/plugin/e/b/j/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/share/c/c$c;->m(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v3, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v3, v3, Lcom/beetalk/sdk/plugin/e/b/j/a;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/share/c/c$c;->l(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v3, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-wide v3, v3, Lcom/beetalk/sdk/plugin/e/b/j/a;->a:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/share/c/c$c;->o(Ljava/util/List;)Lcom/facebook/share/c/c$c;

    invoke-virtual {v2}, Lcom/facebook/share/c/c$c;->j()Lcom/facebook/share/c/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/internal/j;->b(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/c;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    sget-object v1, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    const-string v1, "Cannot show game request dialog"

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/c;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    sget-object v1, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    const-string v1, "User id is invalid"

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
