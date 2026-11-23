.class Lcom/facebook/share/d/c$c;
.super Lcom/facebook/internal/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
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

    iput-object p1, p0, Lcom/facebook/share/d/c$c;->b:Lcom/facebook/share/d/c;

    invoke-direct {p0, p1}, Lcom/facebook/internal/j$a;-><init>(Lcom/facebook/internal/j;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/d/c;Lcom/facebook/share/d/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/d/c$c;-><init>(Lcom/facebook/share/d/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/d/c$c;->d(Lcom/facebook/share/c/e;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1}, Lcom/facebook/share/d/c$c;->e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/facebook/share/d/c$d;->d:Lcom/facebook/share/d/c$d;

    return-object v0
.end method

.method public d(Lcom/facebook/share/c/e;Z)Z
    .locals 0

    instance-of p2, p1, Lcom/facebook/share/c/g;

    if-nez p2, :cond_1

    instance-of p1, p1, Lcom/facebook/share/b/n;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/d/c$c;->b:Lcom/facebook/share/d/c;

    invoke-static {v0}, Lcom/facebook/share/d/c;->o(Lcom/facebook/share/d/c;)Landroid/app/Activity;

    move-result-object v1

    sget-object v2, Lcom/facebook/share/d/c$d;->d:Lcom/facebook/share/d/c$d;

    invoke-static {v0, v1, p1, v2}, Lcom/facebook/share/d/c;->r(Lcom/facebook/share/d/c;Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/share/d/c$d;)V

    iget-object v0, p0, Lcom/facebook/share/d/c$c;->b:Lcom/facebook/share/d/c;

    invoke-virtual {v0}, Lcom/facebook/share/d/c;->e()Lcom/facebook/internal/a;

    move-result-object v0

    instance-of v1, p1, Lcom/facebook/share/c/g;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/facebook/share/c/g;

    invoke-static {p1}, Lcom/facebook/share/b/l;->y(Lcom/facebook/share/c/e;)V

    invoke-static {p1}, Lcom/facebook/share/b/q;->g(Lcom/facebook/share/c/g;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/facebook/share/b/n;

    invoke-static {p1}, Lcom/facebook/share/b/q;->f(Lcom/facebook/share/b/n;)Landroid/os/Bundle;

    move-result-object p1

    :goto_0
    const-string v1, "feed"

    invoke-static {v0, v1, p1}, Lcom/facebook/internal/i;->l(Lcom/facebook/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method
