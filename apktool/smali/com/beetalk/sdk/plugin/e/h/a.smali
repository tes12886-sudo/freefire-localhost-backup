.class public Lcom/beetalk/sdk/plugin/e/h/a;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/a<",
        "Ljava/lang/Void;",
        "Lcom/beetalk/sdk/u/h;",
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

    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/h/a;->i(Landroid/app/Activity;Ljava/lang/Void;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "msdk.user.info.get"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected i(Landroid/app/Activity;Ljava/lang/Void;)V
    .locals 0

    new-instance p2, Lcom/beetalk/sdk/plugin/e/h/a$a;

    invoke-direct {p2, p0, p1}, Lcom/beetalk/sdk/plugin/e/h/a$a;-><init>(Lcom/beetalk/sdk/plugin/e/h/a;Landroid/app/Activity;)V

    invoke-static {p2}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    return-void
.end method
