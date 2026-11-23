.class public Lm/d0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lm/b0;

.field private b:Lm/a0;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Lm/t;

.field private f:Lm/u$a;

.field private g:Lm/e0;

.field private h:Lm/d0;

.field private i:Lm/d0;

.field private j:Lm/d0;

.field private k:J

.field private l:J

.field private m:Lm/h0/h/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm/d0$a;->c:I

    new-instance v0, Lm/u$a;

    invoke-direct {v0}, Lm/u$a;-><init>()V

    iput-object v0, p0, Lm/d0$a;->f:Lm/u$a;

    return-void
.end method

.method public constructor <init>(Lm/d0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm/d0$a;->c:I

    invoke-virtual {p1}, Lm/d0;->f0()Lm/b0;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->a:Lm/b0;

    invoke-virtual {p1}, Lm/d0;->d0()Lm/a0;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->b:Lm/a0;

    invoke-virtual {p1}, Lm/d0;->l()I

    move-result v0

    iput v0, p0, Lm/d0$a;->c:I

    invoke-virtual {p1}, Lm/d0;->Z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lm/d0;->F()Lm/t;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->e:Lm/t;

    invoke-virtual {p1}, Lm/d0;->T()Lm/u;

    move-result-object v0

    invoke-virtual {v0}, Lm/u;->d()Lm/u$a;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->f:Lm/u$a;

    invoke-virtual {p1}, Lm/d0;->b()Lm/e0;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->g:Lm/e0;

    invoke-virtual {p1}, Lm/d0;->a0()Lm/d0;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->h:Lm/d0;

    invoke-virtual {p1}, Lm/d0;->f()Lm/d0;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->i:Lm/d0;

    invoke-virtual {p1}, Lm/d0;->c0()Lm/d0;

    move-result-object v0

    iput-object v0, p0, Lm/d0$a;->j:Lm/d0;

    invoke-virtual {p1}, Lm/d0;->g0()J

    move-result-wide v0

    iput-wide v0, p0, Lm/d0$a;->k:J

    invoke-virtual {p1}, Lm/d0;->e0()J

    move-result-wide v0

    iput-wide v0, p0, Lm/d0$a;->l:J

    invoke-virtual {p1}, Lm/d0;->u()Lm/h0/h/c;

    move-result-object p1

    iput-object p1, p0, Lm/d0$a;->m:Lm/h0/h/c;

    return-void
.end method

.method private final e(Lm/d0;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lm/d0;->b()Lm/e0;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final f(Ljava/lang/String;Lm/d0;)V
    .locals 3

    if-nez p2, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {p2}, Lm/d0;->b()Lm/e0;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lm/d0;->a0()Lm/d0;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lm/d0;->f()Lm/d0;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lm/d0;->c0()Lm/d0;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_5

    :goto_4
    return-void

    :cond_5
    const-string p2, ".priorResponse != null"

    invoke-static {p1, p2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    const-string p2, ".cacheResponse != null"

    invoke-static {p1, p2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    const-string p2, ".networkResponse != null"

    invoke-static {p1, p2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    const-string p2, ".body != null"

    invoke-static {p1, p2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final A(Lm/d0;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->h:Lm/d0;

    return-void
.end method

.method public final B(Lm/d0;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->j:Lm/d0;

    return-void
.end method

.method public final C(Lm/a0;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->b:Lm/a0;

    return-void
.end method

.method public final D(J)V
    .locals 0

    iput-wide p1, p0, Lm/d0$a;->l:J

    return-void
.end method

.method public final E(Lm/b0;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->a:Lm/b0;

    return-void
.end method

.method public final F(J)V
    .locals 0

    iput-wide p1, p0, Lm/d0$a;->k:J

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lm/d0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/d0$a;->i()Lm/u$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lm/u$a;->a(Ljava/lang/String;Ljava/lang/String;)Lm/u$a;

    return-object p0
.end method

.method public b(Lm/e0;)Lm/d0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lm/d0$a;->u(Lm/e0;)V

    return-object p0
.end method

.method public c()Lm/d0;
    .locals 18

    move-object/from16 v0, p0

    iget v5, v0, Lm/d0$a;->c:I

    if-ltz v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-object v2, v0, Lm/d0$a;->a:Lm/b0;

    if-eqz v2, :cond_3

    iget-object v3, v0, Lm/d0$a;->b:Lm/a0;

    if-eqz v3, :cond_2

    iget-object v4, v0, Lm/d0$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v6, v0, Lm/d0$a;->e:Lm/t;

    iget-object v1, v0, Lm/d0$a;->f:Lm/u$a;

    invoke-virtual {v1}, Lm/u$a;->e()Lm/u;

    move-result-object v7

    iget-object v8, v0, Lm/d0$a;->g:Lm/e0;

    iget-object v9, v0, Lm/d0$a;->h:Lm/d0;

    iget-object v10, v0, Lm/d0$a;->i:Lm/d0;

    iget-object v11, v0, Lm/d0$a;->j:Lm/d0;

    iget-wide v12, v0, Lm/d0$a;->k:J

    iget-wide v14, v0, Lm/d0$a;->l:J

    iget-object v1, v0, Lm/d0$a;->m:Lm/h0/h/c;

    new-instance v17, Lm/d0;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Lm/d0;-><init>(Lm/b0;Lm/a0;Ljava/lang/String;ILm/t;Lm/u;Lm/e0;Lm/d0;Lm/d0;Lm/d0;JJLm/h0/h/c;)V

    return-object v17

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lm/d0$a;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code < 0: "

    invoke-static {v2, v1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public d(Lm/d0;)Lm/d0$a;
    .locals 1

    const-string v0, "cacheResponse"

    invoke-direct {p0, v0, p1}, Lm/d0$a;->f(Ljava/lang/String;Lm/d0;)V

    invoke-virtual {p0, p1}, Lm/d0$a;->v(Lm/d0;)V

    return-object p0
.end method

.method public g(I)Lm/d0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lm/d0$a;->w(I)V

    return-object p0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lm/d0$a;->c:I

    return v0
.end method

.method public final i()Lm/u$a;
    .locals 1

    iget-object v0, p0, Lm/d0$a;->f:Lm/u$a;

    return-object v0
.end method

.method public j(Lm/t;)Lm/d0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lm/d0$a;->x(Lm/t;)V

    return-object p0
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)Lm/d0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/d0$a;->i()Lm/u$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lm/u$a;->h(Ljava/lang/String;Ljava/lang/String;)Lm/u$a;

    return-object p0
.end method

.method public l(Lm/u;)Lm/d0$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm/u;->d()Lm/u$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/d0$a;->y(Lm/u$a;)V

    return-object p0
.end method

.method public final m(Lm/h0/h/c;)V
    .locals 1

    const-string v0, "deferredTrailers"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/d0$a;->m:Lm/h0/h/c;

    return-void
.end method

.method public n(Ljava/lang/String;)Lm/d0$a;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm/d0$a;->z(Ljava/lang/String;)V

    return-object p0
.end method

.method public o(Lm/d0;)Lm/d0$a;
    .locals 1

    const-string v0, "networkResponse"

    invoke-direct {p0, v0, p1}, Lm/d0$a;->f(Ljava/lang/String;Lm/d0;)V

    invoke-virtual {p0, p1}, Lm/d0$a;->A(Lm/d0;)V

    return-object p0
.end method

.method public p(Lm/d0;)Lm/d0$a;
    .locals 0

    invoke-direct {p0, p1}, Lm/d0$a;->e(Lm/d0;)V

    invoke-virtual {p0, p1}, Lm/d0$a;->B(Lm/d0;)V

    return-object p0
.end method

.method public q(Lm/a0;)Lm/d0$a;
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm/d0$a;->C(Lm/a0;)V

    return-object p0
.end method

.method public r(J)Lm/d0$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lm/d0$a;->D(J)V

    return-object p0
.end method

.method public s(Lm/b0;)Lm/d0$a;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm/d0$a;->E(Lm/b0;)V

    return-object p0
.end method

.method public t(J)Lm/d0$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lm/d0$a;->F(J)V

    return-object p0
.end method

.method public final u(Lm/e0;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->g:Lm/e0;

    return-void
.end method

.method public final v(Lm/d0;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->i:Lm/d0;

    return-void
.end method

.method public final w(I)V
    .locals 0

    iput p1, p0, Lm/d0$a;->c:I

    return-void
.end method

.method public final x(Lm/t;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->e:Lm/t;

    return-void
.end method

.method public final y(Lm/u$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/d0$a;->f:Lm/u$a;

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm/d0$a;->d:Ljava/lang/String;

    return-void
.end method
