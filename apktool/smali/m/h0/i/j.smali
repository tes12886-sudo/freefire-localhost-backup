.class public final Lm/h0/i/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/w;


# instance fields
.field private final a:Lm/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm/z;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/i/j;->a:Lm/z;

    return-void
.end method

.method private final b(Lm/d0;Ljava/lang/String;)Lm/b0;
    .locals 8

    iget-object v0, p0, Lm/h0/i/j;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->t()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x2

    const-string v2, "Location"

    invoke-static {p1, v2, v1, v0, v1}, Lm/d0;->Q(Lm/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v2

    invoke-virtual {v2}, Lm/b0;->j()Lm/v;

    move-result-object v2

    invoke-virtual {v2, v0}, Lm/v;->t(Ljava/lang/String;)Lm/v;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Lm/v;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v3

    invoke-virtual {v3}, Lm/b0;->j()Lm/v;

    move-result-object v3

    invoke-virtual {v3}, Lm/v;->u()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lm/h0/i/j;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->v()Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v2

    invoke-virtual {v2}, Lm/b0;->h()Lm/b0$a;

    move-result-object v2

    invoke-static {p2}, Lm/h0/i/f;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1}, Lm/d0;->l()I

    move-result v3

    sget-object v4, Lm/h0/i/f;->a:Lm/h0/i/f;

    invoke-virtual {v4, p2}, Lm/h0/i/f;->d(Ljava/lang/String;)Z

    move-result v5

    const/16 v6, 0x133

    const/16 v7, 0x134

    if-nez v5, :cond_5

    if-eq v3, v7, :cond_5

    if-ne v3, v6, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-virtual {v4, p2}, Lm/h0/i/f;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eq v3, v7, :cond_6

    if-eq v3, v6, :cond_6

    const-string p2, "GET"

    goto :goto_2

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v1

    invoke-virtual {v1}, Lm/b0;->a()Lm/c0;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-virtual {v2, p2, v1}, Lm/b0$a;->f(Ljava/lang/String;Lm/c0;)Lm/b0$a;

    if-nez v5, :cond_8

    const-string p2, "Transfer-Encoding"

    invoke-virtual {v2, p2}, Lm/b0$a;->h(Ljava/lang/String;)Lm/b0$a;

    const-string p2, "Content-Length"

    invoke-virtual {v2, p2}, Lm/b0$a;->h(Ljava/lang/String;)Lm/b0$a;

    const-string p2, "Content-Type"

    invoke-virtual {v2, p2}, Lm/b0$a;->h(Ljava/lang/String;)Lm/b0$a;

    :cond_8
    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object p1

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object p1

    invoke-static {p1, v0}, Lm/h0/d;->h(Lm/v;Lm/v;)Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "Authorization"

    invoke-virtual {v2, p1}, Lm/b0$a;->h(Ljava/lang/String;)Lm/b0$a;

    :cond_9
    invoke-virtual {v2, v0}, Lm/b0$a;->p(Lm/v;)Lm/b0$a;

    invoke-virtual {v2}, Lm/b0$a;->a()Lm/b0;

    move-result-object p1

    return-object p1
.end method

.method private final c(Lm/d0;Lm/h0/h/c;)Lm/b0;
    .locals 5

    const/4 v0, 0x0

    if-nez p2, :cond_0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lm/h0/h/c;->h()Lm/h0/h/f;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v1

    :goto_1
    invoke-virtual {p1}, Lm/d0;->l()I

    move-result v2

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v3

    invoke-virtual {v3}, Lm/b0;->g()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x133

    if-eq v2, v4, :cond_11

    const/16 v4, 0x134

    if-eq v2, v4, :cond_11

    const/16 v4, 0x191

    if-eq v2, v4, :cond_10

    const/16 v4, 0x1a5

    if-eq v2, v4, :cond_c

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_9

    const/16 p2, 0x197

    if-eq v2, p2, :cond_7

    const/16 p2, 0x198

    if-eq v2, p2, :cond_2

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_2
    iget-object v1, p0, Lm/h0/i/j;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->H()Z

    move-result v1

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v1

    invoke-virtual {v1}, Lm/b0;->a()Lm/c0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lm/c0;->g()Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p1}, Lm/d0;->c0()Lm/d0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lm/d0;->l()I

    move-result v1

    if-ne v1, p2, :cond_5

    return-object v0

    :cond_5
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lm/h0/i/j;->g(Lm/d0;I)I

    move-result p2

    if-lez p2, :cond_6

    return-object v0

    :cond_6
    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_8

    iget-object p2, p0, Lm/h0/i/j;->a:Lm/z;

    invoke-virtual {p2}, Lm/z;->D()Lm/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, Lm/b;->a(Lm/f0;Lm/d0;)Lm/b0;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-virtual {p1}, Lm/d0;->c0()Lm/d0;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lm/d0;->l()I

    move-result v1

    if-ne v1, p2, :cond_a

    return-object v0

    :cond_a
    const p2, 0x7fffffff

    invoke-direct {p0, p1, p2}, Lm/h0/i/j;->g(Lm/d0;I)I

    move-result p2

    if-nez p2, :cond_b

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object p1

    return-object p1

    :cond_b
    return-object v0

    :cond_c
    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v1

    invoke-virtual {v1}, Lm/b0;->a()Lm/c0;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lm/c0;->g()Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    :cond_d
    if-eqz p2, :cond_f

    invoke-virtual {p2}, Lm/h0/h/c;->k()Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {p2}, Lm/h0/h/c;->h()Lm/h0/h/f;

    move-result-object p2

    invoke-virtual {p2}, Lm/h0/h/f;->y()V

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_2
    return-object v0

    :cond_10
    iget-object p2, p0, Lm/h0/i/j;->a:Lm/z;

    invoke-virtual {p2}, Lm/z;->g()Lm/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, Lm/b;->a(Lm/f0;Lm/d0;)Lm/b0;

    move-result-object p1

    return-object p1

    :cond_11
    :pswitch_0
    invoke-direct {p0, p1, v3}, Lm/h0/i/j;->b(Lm/d0;Ljava/lang/String;)Lm/b0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final d(Ljava/io/IOException;Z)Z
    .locals 3

    instance-of v0, p1, Ljava/net/ProtocolException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    instance-of p2, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/security/cert/CertificateException;

    if-eqz p2, :cond_3

    return v1

    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method private final e(Ljava/io/IOException;Lm/h0/h/e;Lm/b0;Z)Z
    .locals 2

    iget-object v0, p0, Lm/h0/i/j;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->H()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p4, :cond_1

    invoke-direct {p0, p1, p3}, Lm/h0/i/j;->f(Ljava/io/IOException;Lm/b0;)Z

    move-result p3

    if-eqz p3, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, p1, p4}, Lm/h0/i/j;->d(Ljava/io/IOException;Z)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p2}, Lm/h0/h/e;->B()Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final f(Ljava/io/IOException;Lm/b0;)Z
    .locals 0

    invoke-virtual {p2}, Lm/b0;->a()Lm/c0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lm/c0;->g()Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final g(Lm/d0;I)I
    .locals 3

    const-string v0, "Retry-After"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lm/d0;->Q(Lm/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    :cond_0
    new-instance p2, Ll/d0/f;

    const-string v0, "\\d+"

    invoke-direct {p2, v0}, Ll/d0/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ll/d0/f;->a(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "valueOf(header)"

    invoke-static {p1, p2}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_1
    const p1, 0x7fffffff

    return p1
.end method


# virtual methods
.method public a(Lm/w$a;)Lm/d0;
    .locals 10

    const-string v0, "chain"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm/h0/i/g;

    invoke-virtual {p1}, Lm/h0/i/g;->j()Lm/b0;

    move-result-object v0

    invoke-virtual {p1}, Lm/h0/i/g;->f()Lm/h0/h/e;

    move-result-object v1

    invoke-static {}, Ll/t/k;->g()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v7, v3

    const/4 v6, 0x1

    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v1, v0, v6}, Lm/h0/h/e;->m(Lm/b0;Z)V

    :try_start_0
    invoke-virtual {v1}, Lm/h0/h/e;->f()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_9

    :try_start_1
    invoke-virtual {p1, v0}, Lm/h0/i/g;->a(Lm/b0;)Lm/d0;

    move-result-object v0
    :try_end_1
    .catch Lm/h0/h/i; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lm/d0;->b0()Lm/d0$a;

    move-result-object v0

    invoke-virtual {v7}, Lm/d0;->b0()Lm/d0$a;

    move-result-object v6

    invoke-virtual {v6, v3}, Lm/d0$a;->b(Lm/e0;)Lm/d0$a;

    invoke-virtual {v6}, Lm/d0$a;->c()Lm/d0;

    move-result-object v6

    invoke-virtual {v0, v6}, Lm/d0$a;->p(Lm/d0;)Lm/d0$a;

    invoke-virtual {v0}, Lm/d0$a;->c()Lm/d0;

    move-result-object v0

    :cond_0
    move-object v7, v0

    invoke-virtual {v1}, Lm/h0/h/e;->s()Lm/h0/h/c;

    move-result-object v0

    invoke-direct {p0, v7, v0}, Lm/h0/i/j;->c(Lm/d0;Lm/h0/h/c;)Lm/b0;

    move-result-object v6

    if-nez v6, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lm/h0/h/c;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lm/h0/h/e;->D()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    invoke-virtual {v1, v5}, Lm/h0/h/e;->n(Z)V

    return-object v7

    :cond_2
    :try_start_3
    invoke-virtual {v6}, Lm/b0;->a()Lm/c0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lm/c0;->g()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_3

    invoke-virtual {v1, v5}, Lm/h0/h/e;->n(Z)V

    return-object v7

    :cond_3
    :try_start_4
    invoke-virtual {v7}, Lm/d0;->b()Lm/e0;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lm/h0/d;->j(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    add-int/lit8 v8, v8, 0x1

    const/16 v0, 0x14

    if-gt v8, v0, :cond_5

    invoke-virtual {v1, v4}, Lm/h0/h/e;->n(Z)V

    move-object v0, v6

    const/4 v6, 0x1

    goto :goto_0

    :cond_5
    :try_start_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Too many follow-up requests: "

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception v6

    instance-of v9, v6, Lm/h0/k/a;

    if-nez v9, :cond_6

    const/4 v9, 0x1

    goto :goto_2

    :cond_6
    const/4 v9, 0x0

    :goto_2
    invoke-direct {p0, v6, v1, v0, v9}, Lm/h0/i/j;->e(Ljava/io/IOException;Lm/h0/h/e;Lm/b0;Z)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {v6, v2}, Lm/h0/d;->X(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    throw v6

    :catch_1
    move-exception v6

    invoke-virtual {v6}, Lm/h0/h/i;->c()Ljava/io/IOException;

    move-result-object v9

    invoke-direct {p0, v9, v1, v0, v5}, Lm/h0/i/j;->e(Ljava/io/IOException;Lm/h0/h/e;Lm/b0;Z)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {v6}, Lm/h0/h/i;->b()Ljava/io/IOException;

    move-result-object v6

    :goto_3
    invoke-static {v2, v6}, Ll/t/k;->I(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v1, v4}, Lm/h0/h/e;->n(Z)V

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_8
    :try_start_6
    invoke-virtual {v6}, Lm/h0/h/i;->b()Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1, v2}, Lm/h0/d;->X(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    throw p1

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {v1, v4}, Lm/h0/h/e;->n(Z)V

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method
