.class public final Lm/h0/f/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/f/a$a;
    }
.end annotation


# static fields
.field public static final b:Lm/h0/f/a$a;


# instance fields
.field private final a:Lm/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm/h0/f/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/h0/f/a$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/h0/f/a;->b:Lm/h0/f/a$a;

    return-void
.end method

.method public constructor <init>(Lm/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm/w$a;)Lm/d0;
    .locals 7

    const-string v0, "chain"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lm/w$a;->call()Lm/e;

    move-result-object v0

    iget-object v1, p0, Lm/h0/f/a;->a:Lm/c;

    const/4 v2, 0x0

    if-nez v1, :cond_11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v1, Lm/h0/f/c$b;

    invoke-interface {p1}, Lm/w$a;->c()Lm/b0;

    move-result-object v5

    invoke-direct {v1, v3, v4, v5, v2}, Lm/h0/f/c$b;-><init>(JLm/b0;Lm/d0;)V

    invoke-virtual {v1}, Lm/h0/f/c$b;->b()Lm/h0/f/c;

    move-result-object v1

    invoke-virtual {v1}, Lm/h0/f/c;->b()Lm/b0;

    move-result-object v3

    invoke-virtual {v1}, Lm/h0/f/c;->a()Lm/d0;

    move-result-object v4

    iget-object v5, p0, Lm/h0/f/a;->a:Lm/c;

    if-nez v5, :cond_10

    instance-of v1, v0, Lm/h0/h/e;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lm/h0/h/e;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lm/h0/h/e;->q()Lm/r;

    move-result-object v1

    :goto_1
    if-nez v1, :cond_2

    sget-object v1, Lm/r;->a:Lm/r;

    :cond_2
    if-nez v3, :cond_3

    if-nez v4, :cond_3

    new-instance v2, Lm/d0$a;

    invoke-direct {v2}, Lm/d0$a;-><init>()V

    invoke-interface {p1}, Lm/w$a;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lm/d0$a;->s(Lm/b0;)Lm/d0$a;

    sget-object p1, Lm/a0;->d:Lm/a0;

    invoke-virtual {v2, p1}, Lm/d0$a;->q(Lm/a0;)Lm/d0$a;

    const/16 p1, 0x1f8

    invoke-virtual {v2, p1}, Lm/d0$a;->g(I)Lm/d0$a;

    const-string p1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {v2, p1}, Lm/d0$a;->n(Ljava/lang/String;)Lm/d0$a;

    sget-object p1, Lm/h0/d;->c:Lm/e0;

    invoke-virtual {v2, p1}, Lm/d0$a;->b(Lm/e0;)Lm/d0$a;

    const-wide/16 v3, -0x1

    invoke-virtual {v2, v3, v4}, Lm/d0$a;->t(J)Lm/d0$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lm/d0$a;->r(J)Lm/d0$a;

    invoke-virtual {v2}, Lm/d0$a;->c()Lm/d0;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lm/r;->A(Lm/e;Lm/d0;)V

    return-object p1

    :cond_3
    if-nez v3, :cond_4

    invoke-static {v4}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm/d0;->b0()Lm/d0$a;

    move-result-object p1

    sget-object v2, Lm/h0/f/a;->b:Lm/h0/f/a$a;

    invoke-static {v2, v4}, Lm/h0/f/a$a;->b(Lm/h0/f/a$a;Lm/d0;)Lm/d0;

    move-result-object v2

    invoke-virtual {p1, v2}, Lm/d0$a;->d(Lm/d0;)Lm/d0$a;

    invoke-virtual {p1}, Lm/d0$a;->c()Lm/d0;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lm/r;->b(Lm/e;Lm/d0;)V

    return-object p1

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v1, v0, v4}, Lm/r;->a(Lm/e;Lm/d0;)V

    goto :goto_2

    :cond_5
    iget-object v5, p0, Lm/h0/f/a;->a:Lm/c;

    if-eqz v5, :cond_6

    invoke-virtual {v1, v0}, Lm/r;->c(Lm/e;)V

    :cond_6
    :goto_2
    :try_start_0
    invoke-interface {p1, v3}, Lm/w$a;->a(Lm/b0;)Lm/d0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_b

    const/4 v0, 0x0

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Lm/d0;->l()I

    move-result v1

    const/16 v5, 0x130

    if-ne v1, v5, :cond_8

    const/4 v0, 0x1

    :cond_8
    :goto_3
    if-nez v0, :cond_a

    invoke-virtual {v4}, Lm/d0;->b()Lm/e0;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v0}, Lm/h0/d;->j(Ljava/io/Closeable;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Lm/d0;->b0()Lm/d0$a;

    move-result-object v0

    sget-object v1, Lm/h0/f/a;->b:Lm/h0/f/a$a;

    invoke-virtual {v4}, Lm/d0;->T()Lm/u;

    move-result-object v3

    invoke-virtual {p1}, Lm/d0;->T()Lm/u;

    move-result-object v5

    invoke-static {v1, v3, v5}, Lm/h0/f/a$a;->a(Lm/h0/f/a$a;Lm/u;Lm/u;)Lm/u;

    move-result-object v3

    invoke-virtual {v0, v3}, Lm/d0$a;->l(Lm/u;)Lm/d0$a;

    invoke-virtual {p1}, Lm/d0;->g0()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Lm/d0$a;->t(J)Lm/d0$a;

    invoke-virtual {p1}, Lm/d0;->e0()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Lm/d0$a;->r(J)Lm/d0$a;

    invoke-static {v1, v4}, Lm/h0/f/a$a;->b(Lm/h0/f/a$a;Lm/d0;)Lm/d0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lm/d0$a;->d(Lm/d0;)Lm/d0$a;

    invoke-static {v1, p1}, Lm/h0/f/a$a;->b(Lm/h0/f/a$a;Lm/d0;)Lm/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/d0$a;->o(Lm/d0;)Lm/d0$a;

    invoke-virtual {v0}, Lm/d0$a;->c()Lm/d0;

    invoke-virtual {p1}, Lm/d0;->b()Lm/e0;

    move-result-object p1

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/e0;->close()V

    iget-object p1, p0, Lm/h0/f/a;->a:Lm/c;

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/c;->j()V

    throw v2

    :cond_b
    :goto_4
    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/d0;->b0()Lm/d0$a;

    move-result-object v0

    sget-object v1, Lm/h0/f/a;->b:Lm/h0/f/a$a;

    invoke-static {v1, v4}, Lm/h0/f/a$a;->b(Lm/h0/f/a$a;Lm/d0;)Lm/d0;

    move-result-object v4

    invoke-virtual {v0, v4}, Lm/d0$a;->d(Lm/d0;)Lm/d0$a;

    invoke-static {v1, p1}, Lm/h0/f/a$a;->b(Lm/h0/f/a$a;Lm/d0;)Lm/d0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm/d0$a;->o(Lm/d0;)Lm/d0$a;

    invoke-virtual {v0}, Lm/d0$a;->c()Lm/d0;

    move-result-object p1

    iget-object v0, p0, Lm/h0/f/a;->a:Lm/c;

    if-eqz v0, :cond_f

    invoke-static {p1}, Lm/h0/i/e;->b(Lm/d0;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, Lm/h0/f/c;->c:Lm/h0/f/c$a;

    invoke-virtual {v0, p1, v3}, Lm/h0/f/c$a;->a(Lm/d0;Lm/b0;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_5

    :cond_c
    iget-object v0, p0, Lm/h0/f/a;->a:Lm/c;

    invoke-virtual {v0, p1}, Lm/c;->c(Lm/d0;)Lm/h0/f/b;

    throw v2

    :cond_d
    :goto_5
    sget-object v0, Lm/h0/i/f;->a:Lm/h0/i/f;

    invoke-virtual {v3}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/h0/i/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_6

    :cond_e
    :try_start_1
    iget-object v0, p0, Lm/h0/f/a;->a:Lm/c;

    invoke-virtual {v0, v3}, Lm/c;->f(Lm/b0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    throw v2

    :catch_0
    :cond_f
    :goto_6
    return-object p1

    :catchall_0
    move-exception p1

    throw p1

    :cond_10
    invoke-virtual {v5, v1}, Lm/c;->l(Lm/h0/f/c;)V

    throw v2

    :cond_11
    invoke-interface {p1}, Lm/w$a;->c()Lm/b0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm/c;->b(Lm/b0;)Lm/d0;

    throw v2
.end method
