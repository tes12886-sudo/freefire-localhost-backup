.class public Lj/c/a/e/h/c;
.super Lj/c/a/e/h/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/h/a;-><init>()V

    return-void
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj/c/a/d/a/e;",
            ">;)",
            "Ljava/util/List<",
            "Lj/c/a/d/a/e;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lj/c/a/e/i/a;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj/c/a/d/a/e;

    iget-object v4, v3, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v3, v3, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lj/c/a/e/i/a;->h(Ljava/util/List;)V

    return-object v2
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0x12

    return v0
.end method

.method public b([BII)V
    .locals 2

    invoke-static {p1, p2, p3}, Lj/c/a/e/l/f;->d([BII)Lj/c/a/d/a/f;

    move-result-object p1

    iget-object p2, p1, Lj/c/a/d/a/f;->e:Ljava/util/List;

    invoke-direct {p0, p2}, Lj/c/a/e/h/c;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lj/c/a/d/a/e;

    invoke-static {}, Lj/c/a/e/a;->c()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p3, Lj/c/a/d/a/e;->d:Ljava/lang/Integer;

    iget-object p3, p3, Lj/c/a/d/a/e;->f:Ln/e;

    invoke-static {v0, v1, p3}, Lj/c/a/e/k/a;->a(Landroid/content/Context;Ljava/lang/Integer;Ln/e;)V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lj/c/a/d/a/f;->e:Ljava/util/List;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/c/a/d/a/e;

    iget-object p1, p1, Lj/c/a/d/a/e;->e:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lj/c/a/e/l/e;->e(I)Lj/c/a/e/f/l/b;

    move-result-object p1

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object p2

    new-instance p3, Lj/c/a/e/g/c/a;

    invoke-direct {p3, p1}, Lj/c/a/e/g/c/a;-><init>(Ljava/lang/Object;)V

    const-string p1, "ACK_PUSH_MSG"

    invoke-virtual {p2, p1, p3}, Lj/c/a/e/g/a;->b(Ljava/lang/String;Lj/c/a/e/g/c/a;)V

    return-void
.end method
