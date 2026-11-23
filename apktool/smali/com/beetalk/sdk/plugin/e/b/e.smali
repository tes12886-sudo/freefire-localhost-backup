.class public Lcom/beetalk/sdk/plugin/e/b/e;
.super Lcom/beetalk/sdk/plugin/e/b/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/plugin/e/b/e$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/b/a<",
        "Lcom/beetalk/sdk/plugin/e/b/e$c;",
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

    const-string v0, "facebook.invite"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/e$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/e$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/e;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 3

    new-instance v0, Lcom/facebook/share/d/a;

    invoke-direct {v0, p1}, Lcom/facebook/share/d/a;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v2, Lcom/beetalk/sdk/plugin/e/b/e$b;

    invoke-direct {v2, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/e$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/e;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/internal/j;->j(Lcom/facebook/j;Lcom/facebook/l;)V

    new-instance p1, Lcom/facebook/share/c/c$c;

    invoke-direct {p1}, Lcom/facebook/share/c/c$c;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/e$c;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/e$c;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/facebook/share/c/c$c;->p(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    check-cast v1, Lcom/beetalk/sdk/plugin/e/b/e$c;

    iget-object v1, v1, Lcom/beetalk/sdk/plugin/e/b/e$c;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/facebook/share/c/c$c;->m(Ljava/lang/String;)Lcom/facebook/share/c/c$c;

    invoke-virtual {p1}, Lcom/facebook/share/c/c$c;->j()Lcom/facebook/share/c/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/internal/j;->l(Ljava/lang/Object;)V

    return-void
.end method
