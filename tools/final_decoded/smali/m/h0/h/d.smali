.class public final Lm/h0/h/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lm/h0/h/g;

.field private final b:Lm/a;

.field private final c:Lm/h0/h/e;

.field private final d:Lm/r;

.field private e:Lm/h0/h/j$b;

.field private f:Lm/h0/h/j;

.field private g:I

.field private h:I

.field private i:I

.field private j:Lm/f0;


# direct methods
.method public constructor <init>(Lm/h0/h/g;Lm/a;Lm/h0/h/e;Lm/r;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/h/d;->a:Lm/h0/h/g;

    iput-object p2, p0, Lm/h0/h/d;->b:Lm/a;

    iput-object p3, p0, Lm/h0/h/d;->c:Lm/h0/h/e;

    iput-object p4, p0, Lm/h0/h/d;->d:Lm/r;

    return-void
.end method

.method private final b(IIIIZ)Lm/h0/h/f;
    .locals 14

    move-object v1, p0

    iget-object v0, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->f()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->p()Lm/h0/h/f;

    move-result-object v2

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Lm/h0/h/f;->q()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v5

    invoke-virtual {v5}, Lm/f0;->a()Lm/a;

    move-result-object v5

    invoke-virtual {v5}, Lm/a;->l()Lm/v;

    move-result-object v5

    invoke-virtual {p0, v5}, Lm/h0/h/d;->g(Lm/v;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v4

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v5, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v5}, Lm/h0/h/e;->A()Ljava/net/Socket;

    move-result-object v5

    :goto_1
    sget-object v6, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v6}, Lm/h0/h/e;->p()Lm/h0/h/f;

    move-result-object v6

    if-eqz v6, :cond_4

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_3

    return-object v2

    :cond_3
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v5}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_3
    iget-object v5, v1, Lm/h0/h/d;->d:Lm/r;

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v5, v6, v2}, Lm/r;->l(Lm/e;Lm/j;)V

    goto :goto_4

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_6
    :goto_4
    iput v3, v1, Lm/h0/h/d;->g:I

    iput v3, v1, Lm/h0/h/d;->h:I

    iput v3, v1, Lm/h0/h/d;->i:I

    iget-object v2, v1, Lm/h0/h/d;->a:Lm/h0/h/g;

    iget-object v5, v1, Lm/h0/h/d;->b:Lm/a;

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v2, v5, v6, v4, v3}, Lm/h0/h/g;->a(Lm/a;Lm/h0/h/e;Ljava/util/List;Z)Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_5
    iget-object v0, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->p()Lm/h0/h/f;

    move-result-object v0

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    :goto_6
    iget-object v2, v1, Lm/h0/h/d;->d:Lm/r;

    iget-object v3, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v2, v3, v0}, Lm/r;->k(Lm/e;Lm/j;)V

    return-object v0

    :cond_7
    iget-object v2, v1, Lm/h0/h/d;->j:Lm/f0;

    if-eqz v2, :cond_8

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iput-object v4, v1, Lm/h0/h/d;->j:Lm/f0;

    :goto_7
    move-object v5, v4

    goto :goto_8

    :cond_8
    iget-object v2, v1, Lm/h0/h/d;->e:Lm/h0/h/j$b;

    if-eqz v2, :cond_9

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm/h0/h/j$b;->b()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v1, Lm/h0/h/d;->e:Lm/h0/h/j$b;

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm/h0/h/j$b;->c()Lm/f0;

    move-result-object v2

    goto :goto_7

    :cond_9
    iget-object v2, v1, Lm/h0/h/d;->f:Lm/h0/h/j;

    if-nez v2, :cond_a

    new-instance v2, Lm/h0/h/j;

    iget-object v5, v1, Lm/h0/h/d;->b:Lm/a;

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v6}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v6

    invoke-virtual {v6}, Lm/z;->w()Lm/h0/h/h;

    move-result-object v6

    iget-object v7, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    iget-object v8, v1, Lm/h0/h/d;->d:Lm/r;

    invoke-direct {v2, v5, v6, v7, v8}, Lm/h0/h/j;-><init>(Lm/a;Lm/h0/h/h;Lm/e;Lm/r;)V

    iput-object v2, v1, Lm/h0/h/d;->f:Lm/h0/h/j;

    :cond_a
    invoke-virtual {v2}, Lm/h0/h/j;->c()Lm/h0/h/j$b;

    move-result-object v2

    iput-object v2, v1, Lm/h0/h/d;->e:Lm/h0/h/j$b;

    invoke-virtual {v2}, Lm/h0/h/j$b;->a()Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v6}, Lm/h0/h/e;->f()Z

    move-result v6

    if-nez v6, :cond_d

    iget-object v6, v1, Lm/h0/h/d;->a:Lm/h0/h/g;

    iget-object v7, v1, Lm/h0/h/d;->b:Lm/a;

    iget-object v8, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v6, v7, v8, v5, v3}, Lm/h0/h/g;->a(Lm/a;Lm/h0/h/e;Ljava/util/List;Z)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v2}, Lm/h0/h/j$b;->c()Lm/f0;

    move-result-object v2

    :goto_8
    new-instance v3, Lm/h0/h/f;

    iget-object v6, v1, Lm/h0/h/d;->a:Lm/h0/h/g;

    invoke-direct {v3, v6, v2}, Lm/h0/h/f;-><init>(Lm/h0/h/g;Lm/f0;)V

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v6, v3}, Lm/h0/h/e;->C(Lm/h0/h/f;)V

    :try_start_1
    iget-object v12, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    iget-object v13, v1, Lm/h0/h/d;->d:Lm/r;

    move-object v6, v3

    move v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    invoke-virtual/range {v6 .. v13}, Lm/h0/h/f;->g(IIIIZLm/e;Lm/r;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v6, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v6, v4}, Lm/h0/h/e;->C(Lm/h0/h/f;)V

    iget-object v4, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v4}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v4

    invoke-virtual {v4}, Lm/z;->w()Lm/h0/h/h;

    move-result-object v4

    invoke-virtual {v3}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v6

    invoke-virtual {v4, v6}, Lm/h0/h/h;->a(Lm/f0;)V

    iget-object v4, v1, Lm/h0/h/d;->a:Lm/h0/h/g;

    iget-object v6, v1, Lm/h0/h/d;->b:Lm/a;

    iget-object v7, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v4, v6, v7, v5, v0}, Lm/h0/h/g;->a(Lm/a;Lm/h0/h/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->p()Lm/h0/h/f;

    move-result-object v0

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iput-object v2, v1, Lm/h0/h/d;->j:Lm/f0;

    invoke-virtual {v3}, Lm/h0/h/f;->E()Ljava/net/Socket;

    move-result-object v2

    invoke-static {v2}, Lm/h0/d;->k(Ljava/net/Socket;)V

    goto/16 :goto_6

    :cond_c
    monitor-enter v3

    :try_start_2
    iget-object v0, v1, Lm/h0/h/d;->a:Lm/h0/h/g;

    invoke-virtual {v0, v3}, Lm/h0/h/g;->e(Lm/h0/h/f;)V

    iget-object v0, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0, v3}, Lm/h0/h/e;->e(Lm/h0/h/f;)V

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    iget-object v0, v1, Lm/h0/h/d;->d:Lm/r;

    iget-object v2, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0, v2, v3}, Lm/r;->k(Lm/e;Lm/j;)V

    return-object v3

    :catchall_1
    move-exception v0

    monitor-exit v3

    throw v0

    :catchall_2
    move-exception v0

    iget-object v2, v1, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v2, v4}, Lm/h0/h/e;->C(Lm/h0/h/f;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method private final c(IIIIZZ)Lm/h0/h/f;
    .locals 2

    :goto_0
    invoke-direct/range {p0 .. p5}, Lm/h0/h/d;->b(IIIIZ)Lm/h0/h/f;

    move-result-object v0

    invoke-virtual {v0, p6}, Lm/h0/h/f;->v(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lm/h0/h/f;->z()V

    iget-object v0, p0, Lm/h0/h/d;->j:Lm/f0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lm/h0/h/d;->e:Lm/h0/h/j$b;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lm/h0/h/j$b;->b()Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lm/h0/h/d;->f:Lm/h0/h/j;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lm/h0/h/j;->a()Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "exhausted all routes"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private final f()Lm/f0;
    .locals 4

    iget v0, p0, Lm/h0/h/d;->g:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-gt v0, v1, :cond_4

    iget v0, p0, Lm/h0/h/d;->h:I

    if-gt v0, v1, :cond_4

    iget v0, p0, Lm/h0/h/d;->i:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm/h0/h/d;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->p()Lm/h0/h/f;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Lm/h0/h/f;->r()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    :try_start_1
    invoke-virtual {v0}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v1

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    invoke-virtual {p0}, Lm/h0/h/d;->d()Lm/a;

    move-result-object v3

    invoke-virtual {v3}, Lm/a;->l()Lm/v;

    move-result-object v3

    invoke-static {v1, v3}, Lm/h0/d;->h(Lm/v;Lm/v;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_3

    monitor-exit v0

    return-object v2

    :cond_3
    :try_start_2
    invoke-virtual {v0}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_4
    :goto_0
    return-object v2
.end method


# virtual methods
.method public final a(Lm/z;Lm/h0/i/g;)Lm/h0/i/d;
    .locals 8

    const-string v0, "client"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2}, Lm/h0/i/g;->g()I

    move-result v2

    invoke-virtual {p2}, Lm/h0/i/g;->i()I

    move-result v3

    invoke-virtual {p2}, Lm/h0/i/g;->k()I

    move-result v4

    invoke-virtual {p1}, Lm/z;->A()I

    move-result v5

    invoke-virtual {p1}, Lm/z;->H()Z

    move-result v6

    invoke-virtual {p2}, Lm/h0/i/g;->j()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-static {v0, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_0
    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lm/h0/h/d;->c(IIIIZZ)Lm/h0/h/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lm/h0/h/f;->x(Lm/z;Lm/h0/i/g;)Lm/h0/i/d;

    move-result-object p1
    :try_end_0
    .catch Lm/h0/h/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lm/h0/h/d;->h(Ljava/io/IOException;)V

    new-instance p2, Lm/h0/h/i;

    invoke-direct {p2, p1}, Lm/h0/h/i;-><init>(Ljava/io/IOException;)V

    throw p2

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lm/h0/h/i;->c()Ljava/io/IOException;

    move-result-object p2

    invoke-virtual {p0, p2}, Lm/h0/h/d;->h(Ljava/io/IOException;)V

    throw p1
.end method

.method public final d()Lm/a;
    .locals 1

    iget-object v0, p0, Lm/h0/h/d;->b:Lm/a;

    return-object v0
.end method

.method public final e()Z
    .locals 3

    iget v0, p0, Lm/h0/h/d;->g:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Lm/h0/h/d;->h:I

    if-nez v0, :cond_0

    iget v0, p0, Lm/h0/h/d;->i:I

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lm/h0/h/d;->j:Lm/f0;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-direct {p0}, Lm/h0/h/d;->f()Lm/f0;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lm/h0/h/d;->j:Lm/f0;

    return v2

    :cond_2
    iget-object v0, p0, Lm/h0/h/d;->e:Lm/h0/h/j$b;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lm/h0/h/j$b;->b()Z

    move-result v0

    if-ne v0, v2, :cond_4

    const/4 v1, 0x1

    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v0, p0, Lm/h0/h/d;->f:Lm/h0/h/j;

    if-nez v0, :cond_6

    return v2

    :cond_6
    invoke-virtual {v0}, Lm/h0/h/j;->a()Z

    move-result v0

    return v0
.end method

.method public final g(Lm/v;)Z
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/d;->b:Lm/a;

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {p1}, Lm/v;->n()I

    move-result v1

    invoke-virtual {v0}, Lm/v;->n()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lm/v;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lm/h0/h/d;->j:Lm/f0;

    instance-of v0, p1, Lm/h0/k/n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm/h0/k/n;

    iget-object v0, v0, Lm/h0/k/n;->a:Lm/h0/k/b;

    sget-object v1, Lm/h0/k/b;->j:Lm/h0/k/b;

    if-ne v0, v1, :cond_0

    iget p1, p0, Lm/h0/h/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm/h0/h/d;->g:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lm/h0/k/a;

    if-eqz p1, :cond_1

    iget p1, p0, Lm/h0/h/d;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm/h0/h/d;->h:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lm/h0/h/d;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm/h0/h/d;->i:I

    :goto_0
    return-void
.end method
