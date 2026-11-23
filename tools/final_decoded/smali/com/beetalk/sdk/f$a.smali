.class Lcom/beetalk/sdk/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/f;-><init>(Lcom/beetalk/sdk/b;)V
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

.field final synthetic b:Lcom/beetalk/sdk/f;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/f;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/f$a;->b:Lcom/beetalk/sdk/f;

    iput-object p2, p0, Lcom/beetalk/sdk/f$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/v/a;

    const-string v1, "user_cancelled"

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/v/a;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/beetalk/sdk/f$a;->b:Lcom/beetalk/sdk/f;

    iget-object v2, p0, Lcom/beetalk/sdk/f$a;->a:Landroid/app/Activity;

    invoke-static {v1, v0, v2}, Lcom/beetalk/sdk/f;->g(Lcom/beetalk/sdk/f;Ljava/lang/Exception;Landroid/app/Activity;)V

    return-void
.end method

.method public b(Lcom/facebook/n;)V
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Lcom/beetalk/sdk/v/a;

    const-string v1, "Login Failed for some reason"

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/v/a;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/beetalk/sdk/f$a;->b:Lcom/beetalk/sdk/f;

    iget-object v2, p0, Lcom/beetalk/sdk/f$a;->a:Landroid/app/Activity;

    invoke-static {v1, v0, v2}, Lcom/beetalk/sdk/f;->g(Lcom/beetalk/sdk/f;Ljava/lang/Exception;Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/f$a;->b:Lcom/beetalk/sdk/f;

    iget-object v1, p0, Lcom/beetalk/sdk/f$a;->a:Landroid/app/Activity;

    invoke-static {v0, p1, v1}, Lcom/beetalk/sdk/f;->g(Lcom/beetalk/sdk/f;Ljava/lang/Exception;Landroid/app/Activity;)V

    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string p1, "exception is null"

    :goto_1
    aput-object p1, v0, v1

    const-string p1, "FB login fail CLOSED_LOGIN_FAILED, exception: "

    invoke-static {p1, v0}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lcom/facebook/login/r;)V
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/login/r;->a()Lcom/facebook/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/f$a;->b:Lcom/beetalk/sdk/f;

    invoke-static {p1}, Lcom/beetalk/sdk/f;->f(Lcom/beetalk/sdk/f;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/login/r;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/f$a;->c(Lcom/facebook/login/r;)V

    return-void
.end method
