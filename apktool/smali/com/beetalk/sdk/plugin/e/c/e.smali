.class public Lcom/beetalk/sdk/plugin/e/c/e;
.super Lcom/beetalk/sdk/plugin/e/c/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/c/a<",
        "Ljava/lang/Void;",
        "Lcom/beetalk/sdk/u/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/e/c/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/c/e;->j(Landroid/app/Activity;Ljava/lang/Void;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "msdk.load.inapp.friendgroups.list"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->o:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected j(Landroid/app/Activity;Ljava/lang/Void;)V
    .locals 1

    new-instance p2, Lcom/beetalk/sdk/u/c;

    invoke-direct {p2}, Lcom/beetalk/sdk/u/c;-><init>()V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/e$a;

    invoke-direct {v0, p0, p2, p1}, Lcom/beetalk/sdk/plugin/e/c/e$a;-><init>(Lcom/beetalk/sdk/plugin/e/c/e;Lcom/beetalk/sdk/u/c;Landroid/app/Activity;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    return-void
.end method
