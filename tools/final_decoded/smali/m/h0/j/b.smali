.class public final Lm/h0/j/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/h0/i/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/j/b$e;,
        Lm/h0/j/b$b;,
        Lm/h0/j/b$a;,
        Lm/h0/j/b$d;,
        Lm/h0/j/b$c;,
        Lm/h0/j/b$f;
    }
.end annotation


# instance fields
.field private final a:Lm/z;

.field private final b:Lm/h0/h/f;

.field private final c:Ln/d;

.field private final d:Ln/c;

.field private e:I

.field private final f:Lm/h0/j/a;

.field private g:Lm/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm/z;Lm/h0/h/f;Ln/d;Ln/c;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/j/b;->a:Lm/z;

    iput-object p2, p0, Lm/h0/j/b;->b:Lm/h0/h/f;

    iput-object p3, p0, Lm/h0/j/b;->c:Ln/d;

    iput-object p4, p0, Lm/h0/j/b;->d:Ln/c;

    new-instance p1, Lm/h0/j/a;

    invoke-direct {p1, p3}, Lm/h0/j/a;-><init>(Ln/d;)V

    iput-object p1, p0, Lm/h0/j/b;->f:Lm/h0/j/a;

    return-void
.end method

.method public static final synthetic i(Lm/h0/j/b;Ln/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lm/h0/j/b;->r(Ln/h;)V

    return-void
.end method

.method public static final synthetic j(Lm/h0/j/b;)Lm/z;
    .locals 0

    iget-object p0, p0, Lm/h0/j/b;->a:Lm/z;

    return-object p0
.end method

.method public static final synthetic k(Lm/h0/j/b;)Lm/h0/j/a;
    .locals 0

    iget-object p0, p0, Lm/h0/j/b;->f:Lm/h0/j/a;

    return-object p0
.end method

.method public static final synthetic l(Lm/h0/j/b;)Ln/c;
    .locals 0

    iget-object p0, p0, Lm/h0/j/b;->d:Ln/c;

    return-object p0
.end method

.method public static final synthetic m(Lm/h0/j/b;)Ln/d;
    .locals 0

    iget-object p0, p0, Lm/h0/j/b;->c:Ln/d;

    return-object p0
.end method

.method public static final synthetic n(Lm/h0/j/b;)I
    .locals 0

    iget p0, p0, Lm/h0/j/b;->e:I

    return p0
.end method

.method public static final synthetic o(Lm/h0/j/b;)Lm/u;
    .locals 0

    iget-object p0, p0, Lm/h0/j/b;->g:Lm/u;

    return-object p0
.end method

.method public static final synthetic p(Lm/h0/j/b;I)V
    .locals 0

    iput p1, p0, Lm/h0/j/b;->e:I

    return-void
.end method

.method public static final synthetic q(Lm/h0/j/b;Lm/u;)V
    .locals 0

    iput-object p1, p0, Lm/h0/j/b;->g:Lm/u;

    return-void
.end method

.method private final r(Ln/h;)V
    .locals 2

    invoke-virtual {p1}, Ln/h;->i()Ln/y;

    move-result-object v0

    sget-object v1, Ln/y;->d:Ln/y;

    invoke-virtual {p1, v1}, Ln/h;->j(Ln/y;)Ln/h;

    invoke-virtual {v0}, Ln/y;->a()Ln/y;

    invoke-virtual {v0}, Ln/y;->b()Ln/y;

    return-void
.end method

.method private final s(Lm/b0;)Z
    .locals 2

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lm/b0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private final t(Lm/d0;)Z
    .locals 3

    const-string v0, "Transfer-Encoding"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lm/d0;->Q(Lm/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private final u()Ln/v;
    .locals 2

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x2

    iput v0, p0, Lm/h0/j/b;->e:I

    new-instance v0, Lm/h0/j/b$b;

    invoke-direct {v0, p0}, Lm/h0/j/b$b;-><init>(Lm/h0/j/b;)V

    return-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "state: "

    invoke-static {v1, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final v(Lm/v;)Ln/x;
    .locals 2

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Lm/h0/j/b;->e:I

    new-instance v0, Lm/h0/j/b$c;

    invoke-direct {v0, p0, p1}, Lm/h0/j/b$c;-><init>(Lm/h0/j/b;Lm/v;)V

    return-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "state: "

    invoke-static {v0, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final w(J)Ln/x;
    .locals 2

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Lm/h0/j/b;->e:I

    new-instance v0, Lm/h0/j/b$d;

    invoke-direct {v0, p0, p1, p2}, Lm/h0/j/b$d;-><init>(Lm/h0/j/b;J)V

    return-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "state: "

    invoke-static {p2, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final x()Ln/v;
    .locals 2

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x2

    iput v0, p0, Lm/h0/j/b;->e:I

    new-instance v0, Lm/h0/j/b$e;

    invoke-direct {v0, p0}, Lm/h0/j/b$e;-><init>(Lm/h0/j/b;)V

    return-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "state: "

    invoke-static {v1, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final y()Ln/x;
    .locals 2

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Lm/h0/j/b;->e:I

    invoke-virtual {p0}, Lm/h0/j/b;->h()Lm/h0/h/f;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/h/f;->z()V

    new-instance v0, Lm/h0/j/b$f;

    invoke-direct {v0, p0}, Lm/h0/j/b$f;-><init>(Lm/h0/j/b;)V

    return-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "state: "

    invoke-static {v1, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final A(Lm/u;Ljava/lang/String;)V
    .locals 6

    const-string v0, "headers"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    iget-object v0, p0, Lm/h0/j/b;->d:Ln/c;

    invoke-interface {v0, p2}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    invoke-virtual {p1}, Lm/u;->size()I

    move-result p2

    :goto_1
    if-ge v1, p2, :cond_1

    add-int/lit8 v3, v1, 0x1

    iget-object v4, p0, Lm/h0/j/b;->d:Ln/c;

    invoke-virtual {p1, v1}, Lm/u;->c(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    move-result-object v4

    const-string v5, ": "

    invoke-interface {v4, v5}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    move-result-object v4

    invoke-virtual {p1, v1}, Lm/u;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    move-result-object v1

    invoke-interface {v1, v0}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    move v1, v3

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lm/h0/j/b;->d:Ln/c;

    invoke-interface {p1, v0}, Ln/c;->R(Ljava/lang/String;)Ln/c;

    iput v2, p0, Lm/h0/j/b;->e:I

    return-void

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "state: "

    invoke-static {p2, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p2

    :goto_3
    goto :goto_2
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lm/h0/j/b;->d:Ln/c;

    invoke-interface {v0}, Ln/c;->flush()V

    return-void
.end method

.method public b(Lm/b0;)V
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/h0/i/i;->a:Lm/h0/i/i;

    invoke-virtual {p0}, Lm/h0/j/b;->h()Lm/h0/h/f;

    move-result-object v1

    invoke-virtual {v1}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v1

    invoke-virtual {v1}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    const-string v2, "connection.route().proxy.type()"

    invoke-static {v1, v2}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lm/h0/i/i;->a(Lm/b0;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lm/b0;->e()Lm/u;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lm/h0/j/b;->A(Lm/u;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lm/h0/j/b;->d:Ln/c;

    invoke-interface {v0}, Ln/c;->flush()V

    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-virtual {p0}, Lm/h0/j/b;->h()Lm/h0/h/f;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/h/f;->e()V

    return-void
.end method

.method public d(Lm/d0;)J
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm/h0/i/e;->b(Lm/d0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lm/h0/j/b;->t(Lm/d0;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lm/h0/d;->s(Lm/d0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public e(Lm/d0;)Ln/x;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm/h0/i/e;->b(Lm/d0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, v1}, Lm/h0/j/b;->w(J)Ln/x;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lm/h0/j/b;->t(Lm/d0;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object p1

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object p1

    invoke-direct {p0, p1}, Lm/h0/j/b;->v(Lm/v;)Ln/x;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lm/h0/d;->s(Lm/d0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lm/h0/j/b;->y()Ln/x;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public f(Lm/b0;J)Ln/v;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm/b0;->a()Lm/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lm/b0;->a()Lm/c0;

    move-result-object v0

    invoke-virtual {v0}, Lm/c0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lm/h0/j/b;->s(Lm/b0;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lm/h0/j/b;->u()Ln/v;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lm/h0/j/b;->x()Ln/v;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Z)Lm/d0$a;
    .locals 4

    iget v0, p0, Lm/h0/j/b;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    if-eqz v2, :cond_4

    :try_start_0
    sget-object v0, Lm/h0/i/k;->d:Lm/h0/i/k$a;

    iget-object v2, p0, Lm/h0/j/b;->f:Lm/h0/j/a;

    invoke-virtual {v2}, Lm/h0/j/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lm/h0/i/k$a;->a(Ljava/lang/String;)Lm/h0/i/k;

    move-result-object v0

    new-instance v2, Lm/d0$a;

    invoke-direct {v2}, Lm/d0$a;-><init>()V

    iget-object v3, v0, Lm/h0/i/k;->a:Lm/a0;

    invoke-virtual {v2, v3}, Lm/d0$a;->q(Lm/a0;)Lm/d0$a;

    iget v3, v0, Lm/h0/i/k;->b:I

    invoke-virtual {v2, v3}, Lm/d0$a;->g(I)Lm/d0$a;

    iget-object v3, v0, Lm/h0/i/k;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lm/d0$a;->n(Ljava/lang/String;)Lm/d0$a;

    iget-object v3, p0, Lm/h0/j/b;->f:Lm/h0/j/a;

    invoke-virtual {v3}, Lm/h0/j/a;->a()Lm/u;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm/d0$a;->l(Lm/u;)Lm/d0$a;

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, Lm/h0/i/k;->b:I

    if-ne p1, v3, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget p1, v0, Lm/h0/i/k;->b:I

    if-ne p1, v3, :cond_3

    iput v1, p0, Lm/h0/j/b;->e:I

    goto :goto_1

    :cond_3
    const/4 p1, 0x4

    iput p1, p0, Lm/h0/j/b;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v2

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lm/h0/j/b;->h()Lm/h0/h/f;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v0

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->s()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "unexpected end of stream on "

    invoke-static {v2, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "state: "

    invoke-static {v0, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lm/h0/h/f;
    .locals 1

    iget-object v0, p0, Lm/h0/j/b;->b:Lm/h0/h/f;

    return-object v0
.end method

.method public final z(Lm/d0;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm/h0/d;->s(Lm/d0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v0, v1}, Lm/h0/j/b;->w(J)Ln/x;

    move-result-object p1

    const v0, 0x7fffffff

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, Lm/h0/d;->K(Ln/x;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p1}, Ln/x;->close()V

    return-void
.end method
