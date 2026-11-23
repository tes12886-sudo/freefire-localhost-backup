.class final Lj/c/a/d/a/g$b;
.super Lj/f/a/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/d/a/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/f/a/e<",
        "Lj/c/a/d/a/g;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    sget-object v0, Lj/f/a/a;->d:Lj/f/a/a;

    const-class v1, Lj/c/a/d/a/g;

    invoke-direct {p0, v0, v1}, Lj/f/a/e;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lj/f/a/f;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/c/a/d/a/g$b;->n(Lj/f/a/f;)Lj/c/a/d/a/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lj/f/a/g;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lj/c/a/d/a/g;

    invoke-virtual {p0, p1, p2}, Lj/c/a/d/a/g$b;->o(Lj/f/a/g;Lj/c/a/d/a/g;)V

    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj/c/a/d/a/g;

    invoke-virtual {p0, p1}, Lj/c/a/d/a/g$b;->p(Lj/c/a/d/a/g;)I

    move-result p1

    return p1
.end method

.method public n(Lj/f/a/f;)Lj/c/a/d/a/g;
    .locals 6

    new-instance v0, Lj/c/a/d/a/g$a;

    invoke-direct {v0}, Lj/c/a/d/a/g$a;-><init>()V

    invoke-virtual {p1}, Lj/f/a/f;->c()J

    move-result-wide v1

    :goto_0
    invoke-virtual {p1}, Lj/f/a/f;->f()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    invoke-virtual {p1}, Lj/f/a/f;->g()Lj/f/a/a;

    move-result-object v4

    invoke-virtual {v4}, Lj/f/a/a;->a()Lj/f/a/e;

    move-result-object v5

    invoke-virtual {v5, p1}, Lj/f/a/e;->c(Lj/f/a/f;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Lj/f/a/b$a;->a(ILj/f/a/a;Ljava/lang/Object;)Lj/f/a/b$a;

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lj/c/a/d/a/g$a;->d:Ljava/util/List;

    sget-object v4, Lj/f/a/e;->c:Lj/f/a/e;

    invoke-virtual {v4, p1}, Lj/f/a/e;->c(Lj/f/a/f;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v3, Lj/f/a/e;->c:Lj/f/a/e;

    invoke-virtual {v3, p1}, Lj/f/a/e;->c(Lj/f/a/f;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v3}, Lj/c/a/d/a/g$a;->c(Ljava/lang/Integer;)Lj/c/a/d/a/g$a;

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1, v2}, Lj/f/a/f;->d(J)V

    invoke-virtual {v0}, Lj/c/a/d/a/g$a;->d()Lj/c/a/d/a/g;

    move-result-object p1

    return-object p1
.end method

.method public o(Lj/f/a/g;Lj/c/a/d/a/g;)V
    .locals 3

    sget-object v0, Lj/f/a/e;->c:Lj/f/a/e;

    iget-object v1, p2, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2, v1}, Lj/f/a/e;->i(Lj/f/a/g;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lj/f/a/e;->a()Lj/f/a/e;

    move-result-object v0

    iget-object v1, p2, Lj/c/a/d/a/g;->e:Ljava/util/List;

    const/4 v2, 0x2

    invoke-virtual {v0, p1, v2, v1}, Lj/f/a/e;->i(Lj/f/a/g;ILjava/lang/Object;)V

    invoke-virtual {p2}, Lj/f/a/b;->c()Ln/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/f/a/g;->f(Ln/e;)V

    return-void
.end method

.method public p(Lj/c/a/d/a/g;)I
    .locals 4

    sget-object v0, Lj/f/a/e;->c:Lj/f/a/e;

    iget-object v1, p1, Lj/c/a/d/a/g;->d:Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lj/f/a/e;->k(ILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0}, Lj/f/a/e;->a()Lj/f/a/e;

    move-result-object v0

    iget-object v2, p1, Lj/c/a/d/a/g;->e:Ljava/util/List;

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v2}, Lj/f/a/e;->k(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    invoke-virtual {p1}, Lj/f/a/b;->c()Ln/e;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->t()I

    move-result p1

    add-int/2addr v1, p1

    return v1
.end method
