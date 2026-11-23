.class Lcom/facebook/share/d/b$b;
.super Lcom/facebook/internal/j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/d/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
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
.field final synthetic b:Lcom/facebook/share/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/share/d/b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/d/b$b;->b:Lcom/facebook/share/d/b;

    invoke-direct {p0, p1}, Lcom/facebook/internal/j$a;-><init>(Lcom/facebook/internal/j;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/d/b;Lcom/facebook/share/d/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/d/b$b;-><init>(Lcom/facebook/share/d/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/d/b$b;->d(Lcom/facebook/share/c/e;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lcom/facebook/internal/a;
    .locals 0

    check-cast p1, Lcom/facebook/share/c/e;

    invoke-virtual {p0, p1}, Lcom/facebook/share/d/b$b;->e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/share/c/e;Z)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/share/d/b;->q(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Lcom/facebook/share/c/e;)Lcom/facebook/internal/a;
    .locals 3

    invoke-static {p1}, Lcom/facebook/share/b/l;->v(Lcom/facebook/share/c/e;)V

    iget-object v0, p0, Lcom/facebook/share/d/b$b;->b:Lcom/facebook/share/d/b;

    invoke-virtual {v0}, Lcom/facebook/share/d/b;->e()Lcom/facebook/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/share/d/b$b;->b:Lcom/facebook/share/d/b;

    invoke-virtual {v1}, Lcom/facebook/share/d/b;->s()Z

    move-result v1

    iget-object v2, p0, Lcom/facebook/share/d/b$b;->b:Lcom/facebook/share/d/b;

    invoke-static {v2}, Lcom/facebook/share/d/b;->n(Lcom/facebook/share/d/b;)Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, p1, v0}, Lcom/facebook/share/d/b;->o(Landroid/content/Context;Lcom/facebook/share/c/e;Lcom/facebook/internal/a;)V

    new-instance v2, Lcom/facebook/share/d/b$b$a;

    invoke-direct {v2, p0, v0, p1, v1}, Lcom/facebook/share/d/b$b$a;-><init>(Lcom/facebook/share/d/b$b;Lcom/facebook/internal/a;Lcom/facebook/share/c/e;Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/share/d/b;->p(Ljava/lang/Class;)Lcom/facebook/internal/h;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/facebook/internal/i;->j(Lcom/facebook/internal/a;Lcom/facebook/internal/i$a;Lcom/facebook/internal/h;)V

    return-object v0
.end method
