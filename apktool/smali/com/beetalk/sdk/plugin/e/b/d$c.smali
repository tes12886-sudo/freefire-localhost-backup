.class Lcom/beetalk/sdk/plugin/e/b/d$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/d;->r(Ljava/util/List;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/l<",
        "Lcom/facebook/share/d/a$d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/d;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    sget-object v1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->a:Landroid/app/Activity;

    const-string v3, "User Cancelled"

    invoke-static {v0, v1, v3, v2}, Lcom/beetalk/sdk/plugin/e/b/d;->o(Lcom/beetalk/sdk/plugin/e/b/d;ILjava/lang/String;Landroid/app/Activity;)V

    return-void
.end method

.method public b(Lcom/facebook/n;)V
    .locals 3

    instance-of v0, p1, Lcom/facebook/p;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    sget-object v0, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->a:Landroid/app/Activity;

    const-string v2, "User Cancelled"

    invoke-static {p1, v0, v2, v1}, Lcom/beetalk/sdk/plugin/e/b/d;->o(Lcom/beetalk/sdk/plugin/e/b/d;ILjava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->a:Landroid/app/Activity;

    invoke-static {v0, p1, v1}, Lcom/beetalk/sdk/plugin/e/b/d;->p(Lcom/beetalk/sdk/plugin/e/b/d;Ljava/lang/String;Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public c(Lcom/facebook/share/d/a$d;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/d$c$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/b/d$c$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/d$c;)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/d$c;->b:Lcom/beetalk/sdk/plugin/e/b/d;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/share/d/a$d;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/d$c;->c(Lcom/facebook/share/d/a$d;)V

    return-void
.end method
