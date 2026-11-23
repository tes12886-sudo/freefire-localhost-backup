.class Lcom/facebook/share/d/c$g;
.super Lcom/facebook/internal/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/j<",
        "Lcom/facebook/share/c/e;",
        "Lcom/facebook/share/a;",
        ">.a;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/share/d/c;


# direct methods
.method private constructor <init>(Lcom/facebook/share/d/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/d/c$g;->b:Lcom/facebook/share/d/c;

    invoke-direct {p0, p1}, Lcom/facebook/internal/j$a;-><init>(Lcom/facebook/internal/j;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/d/c$g;-><init>(Lcom/facebook/share/d/c;)V

    return-void
.end method

.method private e(Lcom/facebook/share/c/u;Ljava/util/UUID;)Lcom/facebook/share/c/u;
    .locals 7

    new-instance v0, Lcom/facebook/share/c/u$b;

    invoke-direct {v0}, Lcom/facebook/share/c/u$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/share/c/u$b;->r(Lcom/facebook/share/c/u;)Lcom/facebook/share/c/u$b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/facebook/share/c/u;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {p1}, Lcom/facebook/share/c/u;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/share/c/t;

    invoke-virtual {v4}, Lcom/facebook/share/c/t;->c()Landroid/graphics/Bitmap;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {p2, v5}, Lcom/facebook/internal/b0;->d(Ljava/util/UUID;Landroid/graphics/Bitmap;)Lcom/facebook/internal/b0$a;

    move-result-object v5

    new-instance v6, Lcom/facebook/share/c/t$b;

    invoke-direct {v6}, Lcom/facebook/share/c/t$b;-><init>()V

    invoke-virtual {v6, v4}, Lcom/facebook/share/c/t$b;->m(Lcom/facebook/share/c/t;)Lcom/facebook/share/c/t$b;

    move-result-object v4

    invoke-virtual {v5}, Lcom/facebook/internal/b0$a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/facebook/share/c/t$b;->q(Landroid/net/Uri;)Lcom/facebook/share/c/t$b;

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lcom/facebook/share/c/t$b;->o(Landroid/graphics/Bitmap;)Lcom/facebook/share/c/t$b;

    invoke-virtual {v4}, Lcom/facebook/share/c/t$b;->i()Lcom/facebook/share/c/t;

    move-result-object v4

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lcom/facebook/share/c/u$b;->s(Ljava/util/List;)Lcom/facebook/share/c/u$b;

    invoke-static {v2}, Lcom/facebook/internal/b0;->a(Ljava/util/Collection;)V

    invoke-virtual {v0}, Lcom/facebook/share/c/u$b;->q()Lcom/facebook/share/c/u;

    move-result-object p1

    return-object p1
.end method

.method private g(Lcom/facebook/share/c/e;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lcom/facebook/share/c/g;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/facebook/share/c/u;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/facebook/share/c/q;

    if-eqz p1, :cond_1

    const-string p1, "share_open_graph"

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    :goto_0
    const-string p1, "share"

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/d/c$g;->d(Lcom/facebook/share/c/e;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1}, Lcom/facebook/share/d/c$g;->f(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/facebook/share/d/c$d;->c:Lcom/facebook/share/d/c$d;

    return-object v0
.end method

.method public d(Lcom/facebook/share/c/e;Z)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/facebook/share/d/c;->t(Lcom/facebook/share/c/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/d/c$g;->b:Lcom/facebook/share/d/c;

    invoke-static {v0}, Lcom/facebook/share/d/c;->n(Lcom/facebook/share/d/c;)Landroid/app/Activity;

    move-result-object v1

    sget-object v2, Lcom/facebook/share/d/c$d;->c:Lcom/facebook/share/d/c$d;

    invoke-static {v0, v1, p1, v2}, Lcom/facebook/share/d/c;->r(Lcom/facebook/share/d/c;Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/share/d/c$d;)V

    iget-object v0, p0, Lcom/facebook/share/d/c$g;->b:Lcom/facebook/share/d/c;

    invoke-virtual {v0}, Lcom/facebook/share/d/c;->e()Lcom/facebook/internal/a;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/share/b/l;->y(Lcom/facebook/share/c/e;)V

    instance-of v1, p1, Lcom/facebook/share/c/g;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/facebook/share/c/g;

    invoke-static {v1}, Lcom/facebook/share/b/q;->b(Lcom/facebook/share/c/g;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/facebook/share/c/u;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/facebook/share/c/u;

    invoke-virtual {v0}, Lcom/facebook/internal/a;->d()Ljava/util/UUID;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/share/d/c$g;->e(Lcom/facebook/share/c/u;Ljava/util/UUID;)Lcom/facebook/share/c/u;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/share/b/q;->d(Lcom/facebook/share/c/u;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/facebook/share/c/q;

    invoke-static {v1}, Lcom/facebook/share/b/q;->c(Lcom/facebook/share/c/q;)Landroid/os/Bundle;

    move-result-object v1

    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/share/d/c$g;->g(Lcom/facebook/share/c/e;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Lcom/facebook/internal/i;->l(Lcom/facebook/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
