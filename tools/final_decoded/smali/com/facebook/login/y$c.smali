.class Lcom/facebook/login/y$c;
.super Lcom/facebook/internal/j0$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Lcom/facebook/login/k;

.field private l:Lcom/facebook/login/s;

.field private m:Z

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "oauth"

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/internal/j0$a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    const-string p1, "fbconnect://success"

    iput-object p1, p0, Lcom/facebook/login/y$c;->j:Ljava/lang/String;

    sget-object p1, Lcom/facebook/login/k;->h:Lcom/facebook/login/k;

    iput-object p1, p0, Lcom/facebook/login/y$c;->k:Lcom/facebook/login/k;

    sget-object p1, Lcom/facebook/login/s;->b:Lcom/facebook/login/s;

    iput-object p1, p0, Lcom/facebook/login/y$c;->l:Lcom/facebook/login/s;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/login/y$c;->m:Z

    iput-boolean p1, p0, Lcom/facebook/login/y$c;->n:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/internal/j0;
    .locals 6

    invoke-virtual {p0}, Lcom/facebook/internal/j0$a;->f()Landroid/os/Bundle;

    move-result-object v2

    iget-object v0, p0, Lcom/facebook/login/y$c;->j:Ljava/lang/String;

    const-string v1, "redirect_uri"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/internal/j0$a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_id"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/y$c;->h:Ljava/lang/String;

    const-string v1, "e2e"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/y$c;->l:Lcom/facebook/login/s;

    sget-object v1, Lcom/facebook/login/s;->c:Lcom/facebook/login/s;

    if-ne v0, v1, :cond_0

    const-string v0, "token,signed_request,graph_domain,granted_scopes"

    goto :goto_0

    :cond_0
    const-string v0, "token,signed_request,graph_domain"

    :goto_0
    const-string v1, "response_type"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "return_scopes"

    const-string v1, "true"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/y$c;->i:Ljava/lang/String;

    const-string v3, "auth_type"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/login/y$c;->k:Lcom/facebook/login/k;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v3, "login_behavior"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/facebook/login/y$c;->m:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/y$c;->l:Lcom/facebook/login/s;

    invoke-virtual {v0}, Lcom/facebook/login/s;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "fx_app"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Lcom/facebook/login/y$c;->n:Z

    if-eqz v0, :cond_2

    const-string v0, "skip_dedupe"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/internal/j0$a;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/internal/j0$a;->g()I

    move-result v3

    iget-object v4, p0, Lcom/facebook/login/y$c;->l:Lcom/facebook/login/s;

    invoke-virtual {p0}, Lcom/facebook/internal/j0$a;->e()Lcom/facebook/internal/j0$e;

    move-result-object v5

    const-string v1, "oauth"

    invoke-static/range {v0 .. v5}, Lcom/facebook/internal/j0;->q(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/s;Lcom/facebook/internal/j0$e;)Lcom/facebook/internal/j0;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/String;)Lcom/facebook/login/y$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/y$c;->i:Ljava/lang/String;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/facebook/login/y$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/y$c;->h:Ljava/lang/String;

    return-object p0
.end method

.method public k(Z)Lcom/facebook/login/y$c;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/login/y$c;->m:Z

    return-object p0
.end method

.method public l(Z)Lcom/facebook/login/y$c;
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "fbconnect://chrome_os_success"

    goto :goto_0

    :cond_0
    const-string p1, "fbconnect://success"

    :goto_0
    iput-object p1, p0, Lcom/facebook/login/y$c;->j:Ljava/lang/String;

    return-object p0
.end method

.method public m(Lcom/facebook/login/k;)Lcom/facebook/login/y$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/y$c;->k:Lcom/facebook/login/k;

    return-object p0
.end method

.method public n(Lcom/facebook/login/s;)Lcom/facebook/login/y$c;
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/y$c;->l:Lcom/facebook/login/s;

    return-object p0
.end method

.method public o(Z)Lcom/facebook/login/y$c;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/login/y$c;->n:Z

    return-object p0
.end method
