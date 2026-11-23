.class public final Lm/h0/k/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/k/i$b;,
        Lm/h0/k/i$a;,
        Lm/h0/k/i$c;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lm/h0/k/f;

.field private c:J

.field private d:J

.field private e:J

.field private f:J

.field private final g:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lm/u;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private final i:Lm/h0/k/i$b;

.field private final j:Lm/h0/k/i$a;

.field private final k:Lm/h0/k/i$c;

.field private final l:Lm/h0/k/i$c;

.field private m:Lm/h0/k/b;

.field private n:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILm/h0/k/f;ZZLm/u;)V
    .locals 3

    const-string v0, "connection"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm/h0/k/i;->a:I

    iput-object p2, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    invoke-virtual {p2}, Lm/h0/k/f;->o0()Lm/h0/k/m;

    move-result-object p1

    invoke-virtual {p1}, Lm/h0/k/m;->c()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lm/h0/k/i;->f:J

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lm/h0/k/i;->g:Ljava/util/ArrayDeque;

    new-instance v0, Lm/h0/k/i$b;

    invoke-virtual {p2}, Lm/h0/k/f;->n0()Lm/h0/k/m;

    move-result-object p2

    invoke-virtual {p2}, Lm/h0/k/m;->c()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {v0, p0, v1, v2, p4}, Lm/h0/k/i$b;-><init>(Lm/h0/k/i;JZ)V

    iput-object v0, p0, Lm/h0/k/i;->i:Lm/h0/k/i$b;

    new-instance p2, Lm/h0/k/i$a;

    invoke-direct {p2, p0, p3}, Lm/h0/k/i$a;-><init>(Lm/h0/k/i;Z)V

    iput-object p2, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    new-instance p2, Lm/h0/k/i$c;

    invoke-direct {p2, p0}, Lm/h0/k/i$c;-><init>(Lm/h0/k/i;)V

    iput-object p2, p0, Lm/h0/k/i;->k:Lm/h0/k/i$c;

    new-instance p2, Lm/h0/k/i$c;

    invoke-direct {p2, p0}, Lm/h0/k/i$c;-><init>(Lm/h0/k/i;)V

    iput-object p2, p0, Lm/h0/k/i;->l:Lm/h0/k/i$c;

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lm/h0/k/i;->t()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lm/h0/k/i;->t()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final e(Lm/h0/k/b;Ljava/io/IOException;)Z
    .locals 2

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lm/h0/k/i;->h()Lm/h0/k/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    monitor-exit p0

    return v1

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lm/h0/k/i;->p()Lm/h0/k/i$b;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/i$b;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lm/h0/k/i;->o()Lm/h0/k/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/i$a;->f()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    :try_start_2
    invoke-virtual {p0, p1}, Lm/h0/k/i;->z(Lm/h0/k/b;)V

    invoke-virtual {p0, p2}, Lm/h0/k/i;->A(Ljava/io/IOException;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-object p1, Ll/s;->a:Ll/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    iget-object p1, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    iget p2, p0, Lm/h0/k/i;->a:I

    invoke-virtual {p1, p2}, Lm/h0/k/f;->D0(I)Lm/h0/k/i;

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final A(Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lm/h0/k/i;->n:Ljava/io/IOException;

    return-void
.end method

.method public final B(J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/i;->d:J

    return-void
.end method

.method public final C(J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/i;->c:J

    return-void
.end method

.method public final D(J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/i;->e:J

    return-void
.end method

.method public final declared-synchronized E()Lm/u;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm/h0/k/i;->k:Lm/h0/k/i$c;

    invoke-virtual {v0}, Ln/a;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lm/h0/k/i;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm/h0/k/i;->F()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v0, p0, Lm/h0/k/i;->k:Lm/h0/k/i$c;

    invoke-virtual {v0}, Lm/h0/k/i$c;->A()V

    iget-object v0, p0, Lm/h0/k/i;->g:Ljava/util/ArrayDeque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm/h0/k/i;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "headersQueue.removeFirst()"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v0

    :cond_1
    :try_start_3
    iget-object v0, p0, Lm/h0/k/i;->n:Ljava/io/IOException;

    if-nez v0, :cond_2

    new-instance v0, Lm/h0/k/n;

    iget-object v1, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lm/h0/k/n;-><init>(Lm/h0/k/b;)V

    :cond_2
    throw v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lm/h0/k/i;->k:Lm/h0/k/i$c;

    invoke-virtual {v1}, Lm/h0/k/i$c;->A()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final F()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method

.method public final G()Ln/y;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->l:Lm/h0/k/i$c;

    return-object v0
.end method

.method public final a(J)V
    .locals 3

    iget-wide v0, p0, Lm/h0/k/i;->f:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lm/h0/k/i;->f:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lm/h0/k/i;->p()Lm/h0/k/i$b;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/i$b;->c()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lm/h0/k/i;->p()Lm/h0/k/i$b;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/i$b;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lm/h0/k/i;->o()Lm/h0/k/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/i$a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lm/h0/k/i;->o()Lm/h0/k/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/i$a;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lm/h0/k/i;->u()Z

    move-result v1

    sget-object v2, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_4

    sget-object v0, Lm/h0/k/b;->k:Lm/h0/k/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lm/h0/k/i;->d(Lm/h0/k/b;Ljava/io/IOException;)V

    goto :goto_2

    :cond_4
    if-nez v1, :cond_5

    iget-object v0, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    iget v1, p0, Lm/h0/k/i;->a:I

    invoke-virtual {v0, v1}, Lm/h0/k/f;->D0(I)Lm/h0/k/i;

    :cond_5
    :goto_2
    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    invoke-virtual {v0}, Lm/h0/k/i$a;->c()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    invoke-virtual {v0}, Lm/h0/k/i$a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm/h0/k/i;->n:Ljava/io/IOException;

    if-nez v0, :cond_0

    new-instance v0, Lm/h0/k/n;

    iget-object v1, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lm/h0/k/n;-><init>(Lm/h0/k/b;)V

    :cond_0
    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Lm/h0/k/b;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "rstStatusCode"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lm/h0/k/i;->e(Lm/h0/k/b;Ljava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    iget v0, p0, Lm/h0/k/i;->a:I

    invoke-virtual {p2, v0, p1}, Lm/h0/k/f;->P0(ILm/h0/k/b;)V

    return-void
.end method

.method public final f(Lm/h0/k/b;)V
    .locals 2

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm/h0/k/i;->e(Lm/h0/k/b;Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    iget v1, p0, Lm/h0/k/i;->a:I

    invoke-virtual {v0, v1, p1}, Lm/h0/k/f;->Q0(ILm/h0/k/b;)V

    return-void
.end method

.method public final g()Lm/h0/k/f;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    return-object v0
.end method

.method public final declared-synchronized h()Lm/h0/k/b;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm/h0/k/i;->m:Lm/h0/k/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final i()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->n:Ljava/io/IOException;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lm/h0/k/i;->a:I

    return v0
.end method

.method public final k()J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/i;->d:J

    return-wide v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/i;->c:J

    return-wide v0
.end method

.method public final m()Lm/h0/k/i$c;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->k:Lm/h0/k/i$c;

    return-object v0
.end method

.method public final n()Ln/v;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/k/i;->h:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lm/h0/k/i;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    iget-object v0, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    return-object v0

    :cond_2
    :try_start_1
    const-string v0, "reply before requesting the sink"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final o()Lm/h0/k/i$a;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    return-object v0
.end method

.method public final p()Lm/h0/k/i$b;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->i:Lm/h0/k/i$b;

    return-object v0
.end method

.method public final q()J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/i;->f:J

    return-wide v0
.end method

.method public final r()J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/i;->e:J

    return-wide v0
.end method

.method public final s()Lm/h0/k/i$c;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->l:Lm/h0/k/i$c;

    return-object v0
.end method

.method public final t()Z
    .locals 4

    iget v0, p0, Lm/h0/k/i;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    invoke-virtual {v3}, Lm/h0/k/f;->i0()Z

    move-result v3

    if-ne v3, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public final declared-synchronized u()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm/h0/k/i;->m:Lm/h0/k/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lm/h0/k/i;->i:Lm/h0/k/i$b;

    invoke-virtual {v0}, Lm/h0/k/i$b;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lm/h0/k/i;->i:Lm/h0/k/i$b;

    invoke-virtual {v0}, Lm/h0/k/i$b;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    invoke-virtual {v0}, Lm/h0/k/i$a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lm/h0/k/i;->j:Lm/h0/k/i$a;

    invoke-virtual {v0}, Lm/h0/k/i$a;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Lm/h0/k/i;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    const/4 v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final v()Ln/y;
    .locals 1

    iget-object v0, p0, Lm/h0/k/i;->k:Lm/h0/k/i$c;

    return-object v0
.end method

.method public final w(Ln/d;I)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lm/h0/k/i;->i:Lm/h0/k/i$b;

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lm/h0/k/i$b;->l(Ln/d;J)V

    return-void
.end method

.method public final x(Lm/u;Z)V
    .locals 2

    const-string v0, "headers"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/k/i;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lm/h0/k/i;->p()Lm/h0/k/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/h0/k/i$b;->O(Lm/u;)V

    goto :goto_2

    :cond_3
    :goto_1
    iput-boolean v1, p0, Lm/h0/k/i;->h:Z

    iget-object v0, p0, Lm/h0/k/i;->g:Ljava/util/ArrayDeque;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_2
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lm/h0/k/i;->p()Lm/h0/k/i$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lm/h0/k/i$b;->F(Z)V

    :cond_4
    invoke-virtual {p0}, Lm/h0/k/i;->u()Z

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez p1, :cond_5

    iget-object p1, p0, Lm/h0/k/i;->b:Lm/h0/k/f;

    iget p2, p0, Lm/h0/k/i;->a:I

    invoke-virtual {p1, p2}, Lm/h0/k/f;->D0(I)Lm/h0/k/i;

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized y(Lm/h0/k/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    if-nez v0, :cond_0

    iput-object p1, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final z(Lm/h0/k/b;)V
    .locals 0

    iput-object p1, p0, Lm/h0/k/i;->m:Lm/h0/k/b;

    return-void
.end method
