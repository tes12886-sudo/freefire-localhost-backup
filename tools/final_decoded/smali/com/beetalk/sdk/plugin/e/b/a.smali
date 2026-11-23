.class public abstract Lcom/beetalk/sdk/plugin/e/b/a;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/beetalk/sdk/plugin/a<",
        "TS;TT;>;"
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field protected b:Lcom/facebook/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/a;-><init>()V

    return-void
.end method

.method private l(Landroid/app/Activity;)Z
    .locals 5

    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/a;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/a;->k(Landroid/app/Activity;)V

    return v1

    :cond_0
    invoke-static {}, Lcom/facebook/login/p;->e()Lcom/facebook/login/p;

    move-result-object v0

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    new-instance v3, Lcom/beetalk/sdk/plugin/e/b/a$a;

    invoke-direct {v3, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/a$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/a;Landroid/app/Activity;)V

    invoke-virtual {v0, v2, v3}, Lcom/facebook/login/p;->o(Lcom/facebook/j;Lcom/facebook/l;)V

    invoke-static {}, Lcom/facebook/login/p;->e()Lcom/facebook/login/p;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "public_profile"

    aput-object v4, v2, v3

    const-string v3, "user_friends"

    aput-object v3, v2, v1

    const/4 v3, 0x2

    const-string v4, "email"

    aput-object v4, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/facebook/login/p;->j(Landroid/app/Activity;Ljava/util/Collection;)V

    return v1
.end method


# virtual methods
.method protected b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "TS;)V"
        }
    .end annotation

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->a:Ljava/lang/Object;

    invoke-static {}, Lcom/facebook/j$a;->a()Lcom/facebook/j;

    move-result-object p2

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/a;->l(Landroid/app/Activity;)Z

    return-void
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract i(Ljava/lang/Exception;Landroid/app/Activity;)V
.end method

.method public j(IILandroid/content/Intent;)Z
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a;->b:Lcom/facebook/j;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/j;->a(IILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public abstract k(Landroid/app/Activity;)V
.end method
