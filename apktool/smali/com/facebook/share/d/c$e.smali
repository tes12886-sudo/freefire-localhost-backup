.class Lcom/facebook/share/d/c$e;
.super Lcom/facebook/internal/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
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

    iput-object p1, p0, Lcom/facebook/share/d/c$e;->b:Lcom/facebook/share/d/c;

    invoke-direct {p0, p1}, Lcom/facebook/internal/j$a;-><init>(Lcom/facebook/internal/j;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/d/c$e;-><init>(Lcom/facebook/share/d/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/d/c$e;->d(Lcom/facebook/share/c/e;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1}, Lcom/facebook/share/d/c$e;->e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/facebook/share/d/c$d;->b:Lcom/facebook/share/d/c$d;

    return-object v0
.end method

.method public d(Lcom/facebook/share/c/e;Z)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    instance-of v1, p1, Lcom/facebook/share/c/d;

    if-nez v1, :cond_4

    instance-of v1, p1, Lcom/facebook/share/c/v;

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lcom/facebook/share/c/e;->f()Lcom/facebook/share/c/f;

    move-result-object p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/facebook/share/b/m;->f:Lcom/facebook/share/b/m;

    invoke-static {p2}, Lcom/facebook/internal/i;->a(Lcom/facebook/internal/h;)Z

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    :goto_0
    instance-of v2, p1, Lcom/facebook/share/c/g;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Lcom/facebook/share/c/g;

    invoke-virtual {v2}, Lcom/facebook/share/c/g;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/internal/h0;->Y(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/facebook/share/b/m;->g:Lcom/facebook/share/b/m;

    invoke-static {v2}, Lcom/facebook/internal/i;->a(Lcom/facebook/internal/h;)Z

    move-result v2

    and-int/2addr p2, v2

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/share/d/c;->p(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    :cond_4
    :goto_2
    return v0
.end method

.method public e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/d/c$e;->b:Lcom/facebook/share/d/c;

    invoke-static {v0}, Lcom/facebook/share/d/c;->q(Lcom/facebook/share/d/c;)Landroid/app/Activity;

    move-result-object v1

    sget-object v2, Lcom/facebook/share/d/c$d;->b:Lcom/facebook/share/d/c$d;

    invoke-static {v0, v1, p1, v2}, Lcom/facebook/share/d/c;->r(Lcom/facebook/share/d/c;Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/share/d/c$d;)V

    invoke-static {p1}, Lcom/facebook/share/b/l;->w(Lcom/facebook/share/c/e;)V

    iget-object v0, p0, Lcom/facebook/share/d/c$e;->b:Lcom/facebook/share/d/c;

    invoke-virtual {v0}, Lcom/facebook/share/d/c;->e()Lcom/facebook/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/d/c$e;->b:Lcom/facebook/share/d/c;

    invoke-virtual {v1}, Lcom/facebook/share/d/c;->z()Z

    move-result v1

    new-instance v2, Lcom/facebook/share/d/c$e$a;

    invoke-direct {v2, p0, v0, p1, v1}, Lcom/facebook/share/d/c$e$a;-><init>(Lcom/facebook/share/d/c$e;Lcom/facebook/internal/a;Lcom/facebook/share/c/e;Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/share/d/c;->s(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/facebook/internal/i;->j(Lcom/facebook/internal/a;Lcom/facebook/internal/i$a;Lcom/facebook/internal/h;)V

    return-object v0
.end method
