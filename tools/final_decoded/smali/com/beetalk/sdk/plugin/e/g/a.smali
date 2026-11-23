.class public Lcom/beetalk/sdk/plugin/e/g/a;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/a<",
        "Lcom/beetalk/sdk/u/k;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected bridge synthetic b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/beetalk/sdk/u/k;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/g/a;->i(Landroid/app/Activity;Lcom/beetalk/sdk/u/k;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "beepost.delete.tags"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected i(Landroid/app/Activity;Lcom/beetalk/sdk/u/k;)V
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/g/a$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/g/a$b;-><init>(Lcom/beetalk/sdk/plugin/e/g/a;Landroid/app/Activity;Lcom/beetalk/sdk/u/k;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p2

    new-instance v0, Lcom/beetalk/sdk/plugin/e/g/a$a;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/plugin/e/g/a$a;-><init>(Lcom/beetalk/sdk/plugin/e/g/a;Landroid/app/Activity;)V

    sget-object p1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, p1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    return-void
.end method
