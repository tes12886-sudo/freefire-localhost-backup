.class abstract Lcom/facebook/login/t;
.super Lcom/facebook/login/q;
.source ""


# direct methods
.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/q;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/login/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/login/q;-><init>(Lcom/facebook/login/l;)V

    return-void
.end method

.method private r(Lcom/facebook/login/l$e;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/login/l;->g(Lcom/facebook/login/l$e;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/login/l;->C()V

    :goto_0
    return-void
.end method


# virtual methods
.method public m(IILandroid/content/Intent;)Z
    .locals 5

    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/login/l;->q()Lcom/facebook/login/l$d;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p3, :cond_0

    const-string p2, "Operation canceled"

    invoke-static {p1, p2}, Lcom/facebook/login/l$e;->a(Lcom/facebook/login/l$d;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, p1, p3}, Lcom/facebook/login/t;->v(Lcom/facebook/login/l$d;Landroid/content/Intent;)V

    goto :goto_1

    :cond_1
    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq p2, v1, :cond_2

    const-string p2, "Unexpected resultCode from authorization."

    invoke-static {p1, p2, v2}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_3

    const-string p2, "Unexpected null from returned authorization data."

    invoke-static {p1, p2, v2}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    return v0

    :cond_3
    invoke-virtual {p0, p2}, Lcom/facebook/login/t;->s(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "error_code"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    invoke-virtual {p0, p2}, Lcom/facebook/login/t;->t(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "e2e"

    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p0, v3}, Lcom/facebook/login/q;->k(Ljava/lang/String;)V

    :cond_5
    if-nez p3, :cond_6

    if-nez v2, :cond_6

    if-nez v1, :cond_6

    invoke-virtual {p0, p1, p2}, Lcom/facebook/login/t;->x(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1, p3, v1, v2}, Lcom/facebook/login/t;->w(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return v0
.end method

.method protected s(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "error_type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method protected t(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "error_message"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "error_description"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public u()Lcom/facebook/e;
    .locals 1

    sget-object v0, Lcom/facebook/e;->b:Lcom/facebook/e;

    return-object v0
.end method

.method protected v(Lcom/facebook/login/l$d;Landroid/content/Intent;)V
    .locals 3

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/facebook/login/t;->s(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "error_code"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {}, Lcom/facebook/internal/f0;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p2}, Lcom/facebook/login/t;->t(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2, v1}, Lcom/facebook/login/l$e;->d(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    :cond_1
    invoke-static {p1, v0}, Lcom/facebook/login/l$e;->a(Lcom/facebook/login/l$d;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    return-void
.end method

.method protected w(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const-string v1, "logged_out"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    sput-boolean p1, Lcom/facebook/login/a;->h:Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/facebook/internal/f0;->d()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    goto :goto_2

    :cond_1
    invoke-static {}, Lcom/facebook/internal/f0;->e()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, v0}, Lcom/facebook/login/l$e;->a(Lcom/facebook/login/l$d;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1, p2, p3, p4}, Lcom/facebook/login/l$e;->d(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    :goto_1
    invoke-direct {p0, p1}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    :goto_2
    return-void
.end method

.method protected x(Lcom/facebook/login/l$d;Landroid/os/Bundle;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/login/l$d;->k()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/login/t;->u()Lcom/facebook/e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p2, v1, v2}, Lcom/facebook/login/q;->d(Ljava/util/Collection;Landroid/os/Bundle;Lcom/facebook/e;Ljava/lang/String;)Lcom/facebook/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/login/l$d;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/facebook/login/q;->f(Landroid/os/Bundle;Ljava/lang/String;)Lcom/facebook/f;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/facebook/login/l$e;->b(Lcom/facebook/login/l$d;Lcom/facebook/a;Lcom/facebook/f;)Lcom/facebook/login/l$e;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V
    :try_end_0
    .catch Lcom/facebook/n; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const/4 v0, 0x0

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/facebook/login/l$e;->c(Lcom/facebook/login/l$d;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/l$e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/login/t;->r(Lcom/facebook/login/l$e;)V

    :goto_0
    return-void
.end method

.method protected y(Landroid/content/Intent;I)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/login/q;->h()Lcom/facebook/login/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/login/l;->l()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v0
.end method
