.class public abstract Lcom/beetalk/sdk/plugin/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected abstract b(Landroid/app/Activity;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "TS;)V"
        }
    .end annotation
.end method

.method protected c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/a$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/beetalk/sdk/plugin/a$a;-><init>(Lcom/beetalk/sdk/plugin/a;ILjava/lang/String;)V

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/Integer;
.end method

.method public abstract f(Landroid/app/Activity;ILandroid/content/Intent;)Z
.end method

.method protected g(Landroid/app/Activity;I)V
    .locals 2

    const-string v0, ""

    invoke-virtual {p0, p2, v0}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, p1, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method protected h(Landroid/app/Activity;ILjava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p2, p3}, Lcom/beetalk/sdk/plugin/a;->c(ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p3

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, p2, p1, v0}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
