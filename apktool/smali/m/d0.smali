.class public final Lm/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/d0$a;
    }
.end annotation


# instance fields
.field private final a:Lm/b0;

.field private final b:Lm/a0;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Lm/t;

.field private final f:Lm/u;

.field private final g:Lm/e0;

.field private final h:Lm/d0;

.field private final i:Lm/d0;

.field private final j:Lm/d0;

.field private final k:J

.field private final l:J

.field private final m:Lm/h0/h/c;

.field private n:Lm/d;


# direct methods
.method public constructor <init>(Lm/b0;Lm/a0;Ljava/lang/String;ILm/t;Lm/u;Lm/e0;Lm/d0;Lm/d0;Lm/d0;JJLm/h0/h/c;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    const-string v5, "request"

    invoke-static {p1, v5}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "protocol"

    invoke-static {p2, v5}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "message"

    invoke-static {p3, v5}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "headers"

    invoke-static {p6, v5}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lm/d0;->a:Lm/b0;

    iput-object v2, v0, Lm/d0;->b:Lm/a0;

    iput-object v3, v0, Lm/d0;->c:Ljava/lang/String;

    move v1, p4

    iput v1, v0, Lm/d0;->d:I

    move-object v1, p5

    iput-object v1, v0, Lm/d0;->e:Lm/t;

    iput-object v4, v0, Lm/d0;->f:Lm/u;

    move-object v1, p7

    iput-object v1, v0, Lm/d0;->g:Lm/e0;

    move-object v1, p8

    iput-object v1, v0, Lm/d0;->h:Lm/d0;

    move-object v1, p9

    iput-object v1, v0, Lm/d0;->i:Lm/d0;

    move-object/from16 v1, p10

    iput-object v1, v0, Lm/d0;->j:Lm/d0;

    move-wide/from16 v1, p11

    iput-wide v1, v0, Lm/d0;->k:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lm/d0;->l:J

    move-object/from16 v1, p15

    iput-object v1, v0, Lm/d0;->m:Lm/h0/h/c;

    return-void
.end method

.method public static synthetic Q(Lm/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lm/d0;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Lm/t;
    .locals 1

    iget-object v0, p0, Lm/d0;->e:Lm/t;

    return-object v0
.end method

.method public final O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/d0;->f:Lm/u;

    invoke-virtual {v0, p1}, Lm/u;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    return-object p2
.end method

.method public final T()Lm/u;
    .locals 1

    iget-object v0, p0, Lm/d0;->f:Lm/u;

    return-object v0
.end method

.method public final Y()Z
    .locals 3

    iget v0, p0, Lm/d0;->d:I

    const/4 v1, 0x0

    const/16 v2, 0xc8

    if-gt v2, v0, :cond_0

    const/16 v2, 0x12c

    if-ge v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final Z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/d0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final a0()Lm/d0;
    .locals 1

    iget-object v0, p0, Lm/d0;->h:Lm/d0;

    return-object v0
.end method

.method public final b()Lm/e0;
    .locals 1

    iget-object v0, p0, Lm/d0;->g:Lm/e0;

    return-object v0
.end method

.method public final b0()Lm/d0$a;
    .locals 1

    new-instance v0, Lm/d0$a;

    invoke-direct {v0, p0}, Lm/d0$a;-><init>(Lm/d0;)V

    return-object v0
.end method

.method public final c()Lm/d;
    .locals 2

    iget-object v0, p0, Lm/d0;->n:Lm/d;

    if-nez v0, :cond_0

    sget-object v0, Lm/d;->n:Lm/d$b;

    iget-object v1, p0, Lm/d0;->f:Lm/u;

    invoke-virtual {v0, v1}, Lm/d$b;->b(Lm/u;)Lm/d;

    move-result-object v0

    iput-object v0, p0, Lm/d0;->n:Lm/d;

    :cond_0
    return-object v0
.end method

.method public final c0()Lm/d0;
    .locals 1

    iget-object v0, p0, Lm/d0;->j:Lm/d0;

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lm/d0;->g:Lm/e0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm/e0;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d0()Lm/a0;
    .locals 1

    iget-object v0, p0, Lm/d0;->b:Lm/a0;

    return-object v0
.end method

.method public final e0()J
    .locals 2

    iget-wide v0, p0, Lm/d0;->l:J

    return-wide v0
.end method

.method public final f()Lm/d0;
    .locals 1

    iget-object v0, p0, Lm/d0;->i:Lm/d0;

    return-object v0
.end method

.method public final f0()Lm/b0;
    .locals 1

    iget-object v0, p0, Lm/d0;->a:Lm/b0;

    return-object v0
.end method

.method public final g0()J
    .locals 2

    iget-wide v0, p0, Lm/d0;->k:J

    return-wide v0
.end method

.method public final j()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/d0;->f:Lm/u;

    iget v1, p0, Lm/d0;->d:I

    const/16 v2, 0x191

    if-eq v1, v2, :cond_1

    const/16 v2, 0x197

    if-eq v1, v2, :cond_0

    invoke-static {}, Ll/t/k;->g()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, "Proxy-Authenticate"

    goto :goto_0

    :cond_1
    const-string v1, "WWW-Authenticate"

    :goto_0
    invoke-static {v0, v1}, Lm/h0/i/e;->a(Lm/u;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lm/d0;->d:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/d0;->b:Lm/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm/d0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/d0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/d0;->a:Lm/b0;

    invoke-virtual {v1}, Lm/b0;->j()Lm/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lm/h0/h/c;
    .locals 1

    iget-object v0, p0, Lm/d0;->m:Lm/h0/h/c;

    return-object v0
.end method
