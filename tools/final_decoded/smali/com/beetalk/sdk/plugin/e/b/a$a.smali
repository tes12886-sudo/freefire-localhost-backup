.class Lcom/beetalk/sdk/plugin/e/b/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/a;->l(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/l<",
        "Lcom/facebook/login/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/a;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->b:Lcom/beetalk/sdk/plugin/e/b/a;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/v/a;

    const-string v1, "Login Cancelled"

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/v/a;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->b:Lcom/beetalk/sdk/plugin/e/b/a;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->a:Landroid/app/Activity;

    invoke-virtual {v1, v0, v2}, Lcom/beetalk/sdk/plugin/e/b/a;->i(Ljava/lang/Exception;Landroid/app/Activity;)V

    return-void
.end method

.method public b(Lcom/facebook/n;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lcom/beetalk/sdk/v/a;

    const-string v0, "Login Failed for some reason"

    invoke-direct {p1, v0}, Lcom/beetalk/sdk/v/a;-><init>(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->b:Lcom/beetalk/sdk/plugin/e/b/a;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->a:Landroid/app/Activity;

    invoke-virtual {v0, p1, v1}, Lcom/beetalk/sdk/plugin/e/b/a;->i(Ljava/lang/Exception;Landroid/app/Activity;)V

    return-void
.end method

.method public c(Lcom/facebook/login/r;)V
    .locals 1

    invoke-virtual {p1}, Lcom/facebook/login/r;->a()Lcom/facebook/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->b:Lcom/beetalk/sdk/plugin/e/b/a;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/a$a;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/plugin/e/b/a;->k(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/login/r;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/a$a;->c(Lcom/facebook/login/r;)V

    return-void
.end method
