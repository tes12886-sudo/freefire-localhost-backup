.class Lcom/beetalk/sdk/plugin/e/b/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/b;->k(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/l<",
        "Lcom/facebook/share/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/b;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/b;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    sget-object v2, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "User cancelled"

    invoke-static {v1, v2, v3}, Lcom/beetalk/sdk/plugin/e/b/b;->r(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->a:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/b/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/facebook/n;)V
    .locals 3

    instance-of v0, p1, Lcom/facebook/p;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    sget-object v1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "User cancelled"

    invoke-static {v0, v1, v2}, Lcom/beetalk/sdk/plugin/e/b/b;->s(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "Unknown Error"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    sget-object v2, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2, p1}, Lcom/beetalk/sdk/plugin/e/b/b;->t(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p1

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public c(Lcom/facebook/share/a;)V
    .locals 5

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    sget-object v2, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/share/a;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Successfully posted %s"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/beetalk/sdk/plugin/e/b/b;->q(Lcom/beetalk/sdk/plugin/e/b/b;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object p1

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/b$b;->b:Lcom/beetalk/sdk/plugin/e/b/b;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/share/a;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/b$b;->c(Lcom/facebook/share/a;)V

    return-void
.end method
