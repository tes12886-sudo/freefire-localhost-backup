.class public final Lm/h0/h/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/h/c$a;,
        Lm/h0/h/c$b;
    }
.end annotation


# instance fields
.field private final a:Lm/h0/h/e;

.field private final b:Lm/r;

.field private final c:Lm/h0/h/d;

.field private final d:Lm/h0/i/d;

.field private e:Z

.field private final f:Lm/h0/h/f;


# direct methods
.method public constructor <init>(Lm/h0/h/e;Lm/r;Lm/h0/h/d;Lm/h0/i/d;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    iput-object p2, p0, Lm/h0/h/c;->b:Lm/r;

    iput-object p3, p0, Lm/h0/h/c;->c:Lm/h0/h/d;

    iput-object p4, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {p4}, Lm/h0/i/d;->h()Lm/h0/h/f;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/c;->f:Lm/h0/h/f;

    return-void
.end method

.method private final s(Ljava/io/IOException;)V
    .locals 2

    iget-object v0, p0, Lm/h0/h/c;->c:Lm/h0/h/d;

    invoke-virtual {v0, p1}, Lm/h0/h/d;->h(Ljava/io/IOException;)V

    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0}, Lm/h0/i/d;->h()Lm/h0/h/f;

    move-result-object v0

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1}, Lm/h0/h/f;->H(Lm/h0/h/e;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(JZZTE;)TE;"
        }
    .end annotation

    if-eqz p5, :cond_0

    invoke-direct {p0, p5}, Lm/h0/h/c;->s(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    if-eqz p5, :cond_1

    invoke-virtual {v0, v1, p5}, Lm/r;->s(Lm/e;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1, p1, p2}, Lm/r;->q(Lm/e;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p1, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object p2, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {p1, p2, p5}, Lm/r;->x(Lm/e;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1, p2}, Lm/r;->v(Lm/e;J)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {p1, p0, p4, p3, p5}, Lm/h0/h/e;->x(Lm/h0/h/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0}, Lm/h0/i/d;->cancel()V

    return-void
.end method

.method public final c(Lm/b0;Z)Ln/v;
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lm/h0/h/c;->e:Z

    invoke-virtual {p1}, Lm/b0;->a()Lm/c0;

    move-result-object p2

    invoke-static {p2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm/c0;->a()J

    move-result-wide v0

    iget-object p2, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v2, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {p2, v2}, Lm/r;->r(Lm/e;)V

    iget-object p2, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {p2, p1, v0, v1}, Lm/h0/i/d;->f(Lm/b0;J)Ln/v;

    move-result-object p1

    new-instance p2, Lm/h0/h/c$a;

    invoke-direct {p2, p0, p1, v0, v1}, Lm/h0/h/c$a;-><init>(Lm/h0/h/c;Ln/v;J)V

    return-object p2
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0}, Lm/h0/i/d;->cancel()V

    iget-object v0, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, Lm/h0/h/e;->x(Lm/h0/h/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final e()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0}, Lm/h0/i/d;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v2, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v1, v2, v0}, Lm/r;->s(Lm/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, Lm/h0/h/c;->s(Ljava/io/IOException;)V

    throw v0
.end method

.method public final f()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0}, Lm/h0/i/d;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v2, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v1, v2, v0}, Lm/r;->s(Lm/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, Lm/h0/h/c;->s(Ljava/io/IOException;)V

    throw v0
.end method

.method public final g()Lm/h0/h/e;
    .locals 1

    iget-object v0, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    return-object v0
.end method

.method public final h()Lm/h0/h/f;
    .locals 1

    iget-object v0, p0, Lm/h0/h/c;->f:Lm/h0/h/f;

    return-object v0
.end method

.method public final i()Lm/r;
    .locals 1

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    return-object v0
.end method

.method public final j()Lm/h0/h/d;
    .locals 1

    iget-object v0, p0, Lm/h0/h/c;->c:Lm/h0/h/d;

    return-object v0
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lm/h0/h/c;->c:Lm/h0/h/d;

    invoke-virtual {v0}, Lm/h0/h/d;->d()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/h0/h/c;->f:Lm/h0/h/f;

    invoke-virtual {v1}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v1

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    invoke-virtual {v1}, Lm/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/h/c;->e:Z

    return v0
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0}, Lm/h0/i/d;->h()Lm/h0/h/f;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/h/f;->z()V

    return-void
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v1, v2, v3}, Lm/h0/h/e;->x(Lm/h0/h/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final o(Lm/d0;)Lm/e0;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "Content-Type"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lm/d0;->Q(Lm/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v1, p1}, Lm/h0/i/d;->d(Lm/d0;)J

    move-result-wide v1

    iget-object v3, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v3, p1}, Lm/h0/i/d;->e(Lm/d0;)Ln/x;

    move-result-object p1

    new-instance v3, Lm/h0/h/c$b;

    invoke-direct {v3, p0, p1, v1, v2}, Lm/h0/h/c$b;-><init>(Lm/h0/h/c;Ln/x;J)V

    new-instance p1, Lm/h0/i/h;

    invoke-static {v3}, Ln/l;->b(Ln/x;)Ln/d;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, Lm/h0/i/h;-><init>(Ljava/lang/String;JLn/d;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1}, Lm/r;->x(Lm/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lm/h0/h/c;->s(Ljava/io/IOException;)V

    throw p1
.end method

.method public final p(Z)Lm/d0$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0, p1}, Lm/h0/i/d;->g(Z)Lm/d0$a;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lm/d0$a;->m(Lm/h0/h/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1}, Lm/r;->x(Lm/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lm/h0/h/c;->s(Ljava/io/IOException;)V

    throw p1
.end method

.method public final q(Lm/d0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1}, Lm/r;->y(Lm/e;Lm/d0;)V

    return-void
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1}, Lm/r;->z(Lm/e;)V

    return-void
.end method

.method public final t(Lm/b0;)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1}, Lm/r;->u(Lm/e;)V

    iget-object v0, p0, Lm/h0/h/c;->d:Lm/h0/i/d;

    invoke-interface {v0, p1}, Lm/h0/i/d;->b(Lm/b0;)V

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1}, Lm/r;->t(Lm/e;Lm/b0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lm/h0/h/c;->b:Lm/r;

    iget-object v1, p0, Lm/h0/h/c;->a:Lm/h0/h/e;

    invoke-virtual {v0, v1, p1}, Lm/r;->s(Lm/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lm/h0/h/c;->s(Ljava/io/IOException;)V

    throw p1
.end method
