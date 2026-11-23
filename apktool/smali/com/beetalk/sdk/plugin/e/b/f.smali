.class public Lcom/beetalk/sdk/plugin/e/b/f;
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

    const-string v0, "facebook.message"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/f$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/f$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/f;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/f;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    if-eqz v0, :cond_3

    check-cast v0, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v0, v0, Lcom/beetalk/sdk/plugin/e/b/j/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Lcom/facebook/share/d/b;

    invoke-direct {v0, p1}, Lcom/facebook/share/d/b;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v2, Lcom/beetalk/sdk/plugin/e/b/f$b;

    invoke-direct {v2, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/f$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/f;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    new-instance v1, Lcom/facebook/share/c/g$b;

    invoke-direct {v1}, Lcom/facebook/share/c/g$b;-><init>()V

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v2, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v2, v2, Lcom/beetalk/sdk/plugin/e/b/j/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/share/c/g$b;->t(Ljava/lang/String;)Lcom/facebook/share/c/g$b;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v2, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v2, v2, Lcom/beetalk/sdk/plugin/e/b/j/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/share/c/g$b;->s(Ljava/lang/String;)Lcom/facebook/share/c/g$b;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v2, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v2, v2, Lcom/beetalk/sdk/plugin/e/b/j/a;->d:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/share/c/e$a;->h(Landroid/net/Uri;)Lcom/facebook/share/c/e$a;

    check-cast v1, Lcom/facebook/share/c/g$b;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v2, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v2, v2, Lcom/beetalk/sdk/plugin/e/b/j/a;->e:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v2, Lcom/beetalk/sdk/plugin/e/b/j/a;

    iget-object v2, v2, Lcom/beetalk/sdk/plugin/e/b/j/a;->e:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/share/c/g$b;->u(Landroid/net/Uri;)Lcom/facebook/share/c/g$b;

    :cond_1
    const-class v2, Lcom/facebook/share/c/g;

    invoke-static {v2}, Lcom/facebook/share/d/b;->q(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/facebook/share/c/g$b;->r()Lcom/facebook/share/c/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Cannot show Messenger dialog"

    invoke-virtual {p0, v1, v2}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/f;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/f;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    const-string v1, "The content url is empty"

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/f;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, p1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
