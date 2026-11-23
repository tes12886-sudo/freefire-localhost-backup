.class public Lcom/beetalk/sdk/plugin/e/b/d;
.super Lcom/beetalk/sdk/plugin/e/b/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/plugin/e/b/d$f;,
        Lcom/beetalk/sdk/plugin/e/b/d$d;,
        Lcom/beetalk/sdk/plugin/e/b/d$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/b/a<",
        "Lcom/beetalk/sdk/plugin/e/b/d$d;",
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

.method private m(ILjava/lang/String;Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/d$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/d$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/d;ILjava/lang/String;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p3, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method private n(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1

    sget-object v0, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/d;->m(ILjava/lang/String;Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic o(Lcom/beetalk/sdk/plugin/e/b/d;ILjava/lang/String;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/beetalk/sdk/plugin/e/b/d;->m(ILjava/lang/String;Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic p(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/d;->n(Ljava/lang/String;Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic q(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/util/List;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/d;->r(Ljava/util/List;Landroid/app/Activity;)V

    return-void
.end method

.method private r(Ljava/util/List;Landroid/app/Activity;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/plugin/e/b/d$e;",
            ">;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/facebook/share/d/a;->o()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string v0, "Facebook App Not install"

    invoke-direct {p0, p1, v0, p2}, Lcom/beetalk/sdk/plugin/e/b/d;->m(ILjava/lang/String;Landroid/app/Activity;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string v0, "Cant get any friends, token scope issue perhaps"

    invoke-direct {p0, p1, v0, p2}, Lcom/beetalk/sdk/plugin/e/b/d;->m(ILjava/lang/String;Landroid/app/Activity;)V

    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/d$e;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/d$e;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/facebook/share/d/a;

    invoke-direct {p1, p2}, Lcom/facebook/share/d/a;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v2, Lcom/beetalk/sdk/plugin/e/b/d$c;

    invoke-direct {v2, p0, p2}, Lcom/beetalk/sdk/plugin/e/b/d$c;-><init>(Lcom/beetalk/sdk/plugin/e/b/d;Landroid/app/Activity;)V

    invoke-virtual {p1, v1, v2}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    new-instance p2, Lcom/facebook/share/c/c$c;

    invoke-direct {p2}, Lcom/facebook/share/c/c$c;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/d$d;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/d$d;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/facebook/share/c/c$c;->m(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/d$d;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/d$d;->d:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/facebook/share/c/c$c;->n(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/d$d;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/d$d;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/facebook/share/c/c$c;->p(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/d$d;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/d$d;->c:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/facebook/share/c/c$c;->l(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    invoke-virtual {p2, v0}, Lcom/facebook/share/c/c$c;->o(Ljava/util/List;)Lcom/facebook/share/c/c$c;

    sget-object v0, Lcom/facebook/share/c/c$b;->a:Lcom/facebook/share/c/c$b;

    invoke-virtual {p2, v0}, Lcom/facebook/share/c/c$c;->k(Lcom/facebook/share/c/c$b;)Lcom/facebook/share/c/c$c;

    invoke-virtual {p2}, Lcom/facebook/share/c/c$c;->j()Lcom/facebook/share/c/c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "facebook.share.graph"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/d$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/d$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/d$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/beetalk/sdk/plugin/e/b/d$f;-><init>(Lcom/beetalk/sdk/plugin/e/b/d;Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/b/d$a;)V

    const/4 p1, 0x1

    new-array p1, p1, [Lcom/beetalk/sdk/plugin/e/b/d$d;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/d$d;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
