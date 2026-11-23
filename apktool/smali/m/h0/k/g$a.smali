.class public final Lm/h0/k/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/k/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lm/h0/k/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm/b0;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/b0;",
            ")",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm/b0;->e()Lm/u;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lm/u;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Lm/h0/k/c;

    sget-object v3, Lm/h0/k/c;->f:Ln/e;

    invoke-virtual {p1}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lm/h0/k/c;-><init>(Ln/e;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lm/h0/k/c;

    sget-object v3, Lm/h0/k/c;->g:Ln/e;

    sget-object v4, Lm/h0/i/i;->a:Lm/h0/i/i;

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object v5

    invoke-virtual {v4, v5}, Lm/h0/i/i;->c(Lm/v;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lm/h0/k/c;-><init>(Ln/e;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    invoke-virtual {p1, v2}, Lm/b0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lm/h0/k/c;

    sget-object v4, Lm/h0/k/c;->i:Ln/e;

    invoke-direct {v3, v4, v2}, Lm/h0/k/c;-><init>(Ln/e;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Lm/h0/k/c;

    sget-object v3, Lm/h0/k/c;->h:Ln/e;

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object p1

    invoke-virtual {p1}, Lm/v;->u()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Lm/h0/k/c;-><init>(Ln/e;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-virtual {v0}, Lm/u;->size()I

    move-result v2

    :goto_0
    if-ge p1, v2, :cond_3

    add-int/lit8 v3, p1, 0x1

    invoke-virtual {v0, p1}, Lm/u;->c(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "US"

    invoke-static {v5, v6}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v4, v5}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm/h0/k/g;->i()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "te"

    invoke-static {v4, v5}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, p1}, Lm/u;->h(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "trailers"

    invoke-static {v5, v6}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    new-instance v5, Lm/h0/k/c;

    invoke-virtual {v0, p1}, Lm/u;->h(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v5, v4, p1}, Lm/h0/k/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    move p1, v3

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final b(Lm/u;Lm/a0;)Lm/d0$a;
    .locals 7

    const-string v0, "headerBlock"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/u$a;

    invoke-direct {v0}, Lm/u$a;-><init>()V

    invoke-virtual {p1}, Lm/u;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p1, v3}, Lm/u;->c(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v3}, Lm/u;->h(I)Ljava/lang/String;

    move-result-object v3

    const-string v6, ":status"

    invoke-static {v5, v6}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v2, Lm/h0/i/k;->d:Lm/h0/i/k$a;

    const-string v5, "HTTP/1.1 "

    invoke-static {v5, v3}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm/h0/i/k$a;->a(Ljava/lang/String;)Lm/h0/i/k;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-static {}, Lm/h0/k/g;->j()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v0, v5, v3}, Lm/u$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/u$a;

    :cond_1
    :goto_1
    move v3, v4

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    new-instance p1, Lm/d0$a;

    invoke-direct {p1}, Lm/d0$a;-><init>()V

    invoke-virtual {p1, p2}, Lm/d0$a;->q(Lm/a0;)Lm/d0$a;

    iget p2, v2, Lm/h0/i/k;->b:I

    invoke-virtual {p1, p2}, Lm/d0$a;->g(I)Lm/d0$a;

    iget-object p2, v2, Lm/h0/i/k;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lm/d0$a;->n(Ljava/lang/String;)Lm/d0$a;

    invoke-virtual {v0}, Lm/u$a;->e()Lm/u;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm/d0$a;->l(Lm/u;)Lm/d0$a;

    return-object p1

    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Expected \':status\' header not present"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
