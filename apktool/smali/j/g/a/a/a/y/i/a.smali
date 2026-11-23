.class public Lj/g/a/a/a/y/i/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/w;


# instance fields
.field final a:Lj/g/a/a/a/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/k<",
            "+",
            "Lj/g/a/a/a/r;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lj/g/a/a/a/p;


# direct methods
.method public constructor <init>(Lj/g/a/a/a/k;Lj/g/a/a/a/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/k<",
            "+",
            "Lj/g/a/a/a/r;",
            ">;",
            "Lj/g/a/a/a/p;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/g/a/a/a/y/i/a;->a:Lj/g/a/a/a/k;

    iput-object p2, p0, Lj/g/a/a/a/y/i/a;->b:Lj/g/a/a/a/p;

    return-void
.end method


# virtual methods
.method public a(Lm/w$a;)Lm/d0;
    .locals 3

    invoke-interface {p1}, Lm/w$a;->c()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->h()Lm/b0$a;

    move-result-object v1

    invoke-virtual {v0}, Lm/b0;->j()Lm/v;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/g/a/a/a/y/i/a;->d(Lm/v;)Lm/v;

    move-result-object v0

    invoke-virtual {v1, v0}, Lm/b0$a;->p(Lm/v;)Lm/b0$a;

    invoke-virtual {v1}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->h()Lm/b0$a;

    move-result-object v1

    invoke-virtual {p0, v0}, Lj/g/a/a/a/y/i/a;->b(Lm/b0;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Authorization"

    invoke-virtual {v1, v2, v0}, Lm/b0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/b0$a;

    invoke-virtual {v1}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    invoke-interface {p1, v0}, Lm/w$a;->a(Lm/b0;)Lm/d0;

    move-result-object p1

    return-object p1
.end method

.method b(Lm/b0;)Ljava/lang/String;
    .locals 7

    new-instance v0, Lj/g/a/a/a/y/j/b;

    invoke-direct {v0}, Lj/g/a/a/a/y/j/b;-><init>()V

    iget-object v1, p0, Lj/g/a/a/a/y/i/a;->b:Lj/g/a/a/a/p;

    iget-object v2, p0, Lj/g/a/a/a/y/i/a;->a:Lj/g/a/a/a/k;

    invoke-virtual {v2}, Lj/g/a/a/a/k;->a()Lj/g/a/a/a/a;

    move-result-object v2

    check-cast v2, Lj/g/a/a/a/r;

    invoke-virtual {p1}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object v3

    invoke-virtual {v3}, Lm/v;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, p1}, Lj/g/a/a/a/y/i/a;->c(Lm/b0;)Ljava/util/Map;

    move-result-object v6

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v6}, Lj/g/a/a/a/y/j/b;->a(Lj/g/a/a/a/p;Lj/g/a/a/a/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method c(Lm/b0;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/b0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "POST"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lm/b0;->a()Lm/c0;

    move-result-object p1

    instance-of v1, p1, Lm/s;

    if-eqz v1, :cond_0

    check-cast p1, Lm/s;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lm/s;->k()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lm/s;->i(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1}, Lm/s;->l(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method d(Lm/v;)Lm/v;
    .locals 5

    invoke-virtual {p1}, Lm/v;->k()Lm/v$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm/v$a;->v(Ljava/lang/String;)Lm/v$a;

    invoke-virtual {p1}, Lm/v;->r()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Lm/v;->p(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lj/g/a/a/a/y/i/c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2}, Lm/v;->q(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lj/g/a/a/a/y/i/c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lm/v$a;->a(Ljava/lang/String;Ljava/lang/String;)Lm/v$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm/v$a;->c()Lm/v;

    move-result-object p1

    return-object p1
.end method
