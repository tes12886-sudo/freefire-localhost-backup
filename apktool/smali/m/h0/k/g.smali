.class public final Lm/h0/k/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/h0/i/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/k/g$a;
    }
.end annotation


# static fields
.field public static final g:Lm/h0/k/g$a;

.field private static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lm/h0/h/f;

.field private final b:Lm/h0/i/g;

.field private final c:Lm/h0/k/f;

.field private volatile d:Lm/h0/k/i;

.field private final e:Lm/a0;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lm/h0/k/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/h0/k/g$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/h0/k/g;->g:Lm/h0/k/g$a;

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "connection"

    aput-object v2, v0, v1

    const/4 v3, 0x1

    const-string v4, "host"

    aput-object v4, v0, v3

    const/4 v5, 0x2

    const-string v6, "keep-alive"

    aput-object v6, v0, v5

    const/4 v7, 0x3

    const-string v8, "proxy-connection"

    aput-object v8, v0, v7

    const/4 v9, 0x4

    const-string v10, "te"

    aput-object v10, v0, v9

    const/4 v11, 0x5

    const-string v12, "transfer-encoding"

    aput-object v12, v0, v11

    const/4 v13, 0x6

    const-string v14, "encoding"

    aput-object v14, v0, v13

    const/4 v15, 0x7

    const-string v16, "upgrade"

    aput-object v16, v0, v15

    const-string v17, ":method"

    const/16 v15, 0x8

    aput-object v17, v0, v15

    const/16 v17, 0x9

    const-string v18, ":path"

    aput-object v18, v0, v17

    const/16 v17, 0xa

    const-string v18, ":scheme"

    aput-object v18, v0, v17

    const/16 v17, 0xb

    const-string v18, ":authority"

    aput-object v18, v0, v17

    invoke-static {v0}, Lm/h0/d;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lm/h0/k/g;->h:Ljava/util/List;

    new-array v0, v15, [Ljava/lang/String;

    aput-object v2, v0, v1

    aput-object v4, v0, v3

    aput-object v6, v0, v5

    aput-object v8, v0, v7

    aput-object v10, v0, v9

    aput-object v12, v0, v11

    aput-object v14, v0, v13

    const/4 v1, 0x7

    aput-object v16, v0, v1

    invoke-static {v0}, Lm/h0/d;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lm/h0/k/g;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lm/z;Lm/h0/h/f;Lm/h0/i/g;Lm/h0/k/f;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm/h0/k/g;->a:Lm/h0/h/f;

    iput-object p3, p0, Lm/h0/k/g;->b:Lm/h0/i/g;

    iput-object p4, p0, Lm/h0/k/g;->c:Lm/h0/k/f;

    invoke-virtual {p1}, Lm/z;->B()Ljava/util/List;

    move-result-object p1

    sget-object p2, Lm/a0;->g:Lm/a0;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lm/a0;->f:Lm/a0;

    :goto_0
    iput-object p2, p0, Lm/h0/k/g;->e:Lm/a0;

    return-void
.end method

.method public static final synthetic i()Ljava/util/List;
    .locals 1

    sget-object v0, Lm/h0/k/g;->h:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic j()Ljava/util/List;
    .locals 1

    sget-object v0, Lm/h0/k/g;->i:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/h0/k/i;->n()Ln/v;

    move-result-object v0

    invoke-interface {v0}, Ln/v;->close()V

    return-void
.end method

.method public b(Lm/b0;)V
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lm/b0;->a()Lm/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lm/h0/k/g;->g:Lm/h0/k/g$a;

    invoke-virtual {v1, p1}, Lm/h0/k/g$a;->a(Lm/b0;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lm/h0/k/g;->c:Lm/h0/k/f;

    invoke-virtual {v1, p1, v0}, Lm/h0/k/f;->x0(Ljava/util/List;Z)Lm/h0/k/i;

    move-result-object p1

    iput-object p1, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    iget-boolean p1, p0, Lm/h0/k/g;->f:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/h0/k/i;->v()Ln/y;

    move-result-object p1

    iget-object v0, p0, Lm/h0/k/g;->b:Lm/h0/i/g;

    invoke-virtual {v0}, Lm/h0/i/g;->i()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    iget-object p1, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/h0/k/i;->G()Ln/y;

    move-result-object p1

    iget-object v0, p0, Lm/h0/k/g;->b:Lm/h0/i/g;

    invoke-virtual {v0}, Lm/h0/i/g;->k()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    return-void

    :cond_2
    iget-object p1, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    sget-object v0, Lm/h0/k/b;->k:Lm/h0/k/b;

    invoke-virtual {p1, v0}, Lm/h0/k/i;->f(Lm/h0/k/b;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lm/h0/k/g;->c:Lm/h0/k/f;

    invoke-virtual {v0}, Lm/h0/k/f;->flush()V

    return-void
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/h0/k/g;->f:Z

    iget-object v0, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lm/h0/k/b;->k:Lm/h0/k/b;

    invoke-virtual {v0, v1}, Lm/h0/k/i;->f(Lm/h0/k/b;)V

    :goto_0
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
    invoke-static {p1}, Lm/h0/d;->s(Lm/d0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public e(Lm/d0;)Ln/x;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/h0/k/i;->p()Lm/h0/k/i$b;

    move-result-object p1

    return-object p1
.end method

.method public f(Lm/b0;J)Ln/v;
    .locals 0

    const-string p2, "request"

    invoke-static {p1, p2}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {p1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/h0/k/i;->n()Ln/v;

    move-result-object p1

    return-object p1
.end method

.method public g(Z)Lm/d0$a;
    .locals 3

    iget-object v0, p0, Lm/h0/k/g;->d:Lm/h0/k/i;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/h0/k/i;->E()Lm/u;

    move-result-object v0

    sget-object v1, Lm/h0/k/g;->g:Lm/h0/k/g$a;

    iget-object v2, p0, Lm/h0/k/g;->e:Lm/a0;

    invoke-virtual {v1, v0, v2}, Lm/h0/k/g$a;->b(Lm/u;Lm/a0;)Lm/d0$a;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lm/d0$a;->h()I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public h()Lm/h0/h/f;
    .locals 1

    iget-object v0, p0, Lm/h0/k/g;->a:Lm/h0/h/f;

    return-object v0
.end method
