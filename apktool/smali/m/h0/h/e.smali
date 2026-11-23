.class public final Lm/h0/h/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/h/e$a;,
        Lm/h0/h/e$b;
    }
.end annotation


# instance fields
.field private final a:Lm/z;

.field private final b:Lm/b0;

.field private final c:Z

.field private final d:Lm/h0/h/g;

.field private final e:Lm/r;

.field private final f:Lm/h0/h/e$c;

.field private final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private h:Ljava/lang/Object;

.field private i:Lm/h0/h/d;

.field private j:Lm/h0/h/f;

.field private k:Z

.field private l:Lm/h0/h/c;

.field private m:Z

.field private n:Z

.field private o:Z

.field private volatile p:Z

.field private volatile q:Lm/h0/h/c;

.field private volatile r:Lm/h0/h/f;


# direct methods
.method public constructor <init>(Lm/z;Lm/b0;Z)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/h0/h/e;->a:Lm/z;

    iput-object p2, p0, Lm/h0/h/e;->b:Lm/b0;

    iput-boolean p3, p0, Lm/h0/h/e;->c:Z

    invoke-virtual {p1}, Lm/z;->n()Lm/k;

    move-result-object p2

    invoke-virtual {p2}, Lm/k;->a()Lm/h0/h/g;

    move-result-object p2

    iput-object p2, p0, Lm/h0/h/e;->d:Lm/h0/h/g;

    invoke-virtual {p1}, Lm/z;->s()Lm/r$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lm/r$b;->a(Lm/e;)Lm/r;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/e;->e:Lm/r;

    new-instance p1, Lm/h0/h/e$c;

    invoke-direct {p1, p0}, Lm/h0/h/e$c;-><init>(Lm/h0/h/e;)V

    invoke-virtual {p0}, Lm/h0/h/e;->o()Lm/z;

    move-result-object p2

    invoke-virtual {p2}, Lm/z;->i()I

    move-result p2

    int-to-long p2, p2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    iput-object p1, p0, Lm/h0/h/e;->f:Lm/h0/h/e$c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lm/h0/h/e;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm/h0/h/e;->o:Z

    return-void
.end method

.method private final E(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    iget-boolean v0, p0, Lm/h0/h/e;->k:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lm/h0/h/e;->f:Lm/h0/h/e$c;

    invoke-virtual {v0}, Ln/a;->u()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_2
    return-object v0
.end method

.method private final G()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lm/h0/h/e;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lm/h0/h/e;->c:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm/h0/h/e;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic a(Lm/h0/h/e;)Lm/h0/h/e$c;
    .locals 0

    iget-object p0, p0, Lm/h0/h/e;->f:Lm/h0/h/e$c;

    return-object p0
.end method

.method public static final synthetic d(Lm/h0/h/e;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lm/h0/h/e;->G()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    if-eqz v1, :cond_8

    if-eqz v0, :cond_3

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    :goto_1
    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lm/h0/h/e;->A()Ljava/net/Socket;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v2, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    if-nez v2, :cond_5

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_2
    iget-object v0, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-virtual {v0, p0, v1}, Lm/r;->l(Lm/e;Lm/j;)V

    goto :goto_4

    :cond_5
    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_4
    invoke-direct {p0, p1}, Lm/h0/h/e;->E(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-eqz p1, :cond_9

    iget-object p1, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Lm/r;->e(Lm/e;Ljava/io/IOException;)V

    goto :goto_5

    :cond_9
    iget-object p1, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-virtual {p1, p0}, Lm/r;->d(Lm/e;)V

    :goto_5
    return-object v0
.end method

.method private final h()V
    .locals 2

    sget-object v0, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v0}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Lm/h0/l/h;->h(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lm/h0/h/e;->h:Ljava/lang/Object;

    iget-object v0, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-virtual {v0, p0}, Lm/r;->f(Lm/e;)V

    return-void
.end method

.method private final k(Lm/v;)Lm/a;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lm/v;->j()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->J()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    iget-object v1, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->x()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iget-object v3, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v3}, Lm/z;->k()Lm/g;

    move-result-object v3

    move-object v10, v1

    move-object v9, v2

    move-object v11, v3

    goto :goto_0

    :cond_0
    move-object v9, v2

    move-object v10, v9

    move-object v11, v10

    :goto_0
    new-instance v1, Lm/a;

    invoke-virtual/range {p1 .. p1}, Lm/v;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lm/v;->n()I

    move-result v6

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->r()Lm/q;

    move-result-object v7

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->I()Ljavax/net/SocketFactory;

    move-result-object v8

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->D()Lm/b;

    move-result-object v12

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->C()Ljava/net/Proxy;

    move-result-object v13

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->B()Ljava/util/List;

    move-result-object v14

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->o()Ljava/util/List;

    move-result-object v15

    iget-object v2, v0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v2}, Lm/z;->E()Ljava/net/ProxySelector;

    move-result-object v16

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, Lm/a;-><init>(Ljava/lang/String;ILm/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lm/g;Lm/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v1
.end method


# virtual methods
.method public final A()Ljava/net/Socket;
    .locals 7

    iget-object v0, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    sget-boolean v1, Lm/h0/d;->g:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " MUST hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lm/h0/h/f;->o()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/Reference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p0}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, -0x1

    :goto_2
    if-eq v4, v6, :cond_4

    const/4 v3, 0x1

    :cond_4
    if-eqz v3, :cond_6

    invoke-interface {v1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lm/h0/h/f;->C(J)V

    iget-object v1, p0, Lm/h0/h/e;->d:Lm/h0/h/g;

    invoke-virtual {v1, v0}, Lm/h0/h/g;->c(Lm/h0/h/f;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lm/h0/h/f;->E()Ljava/net/Socket;

    move-result-object v0

    return-object v0

    :cond_5
    return-object v2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method

.method public final B()Z
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->i:Lm/h0/h/d;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/h0/h/d;->e()Z

    move-result v0

    return v0
.end method

.method public final C(Lm/h0/h/f;)V
    .locals 0

    iput-object p1, p0, Lm/h0/h/e;->r:Lm/h0/h/f;

    return-void
.end method

.method public final D()V
    .locals 2

    iget-boolean v0, p0, Lm/h0/h/e;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lm/h0/h/e;->k:Z

    iget-object v0, p0, Lm/h0/h/e;->f:Lm/h0/h/e$c;

    invoke-virtual {v0}, Ln/a;->u()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lm/d0;
    .locals 3

    iget-object v0, p0, Lm/h0/h/e;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/h0/h/e;->f:Lm/h0/h/e$c;

    invoke-virtual {v0}, Ln/a;->t()V

    invoke-direct {p0}, Lm/h0/h/e;->h()V

    :try_start_0
    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->q()Lm/p;

    move-result-object v0

    invoke-virtual {v0, p0}, Lm/p;->b(Lm/h0/h/e;)V

    invoke-virtual {p0}, Lm/h0/h/e;->v()Lm/d0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->q()Lm/p;

    move-result-object v1

    invoke-virtual {v1, p0}, Lm/p;->g(Lm/h0/h/e;)V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->q()Lm/p;

    move-result-object v1

    invoke-virtual {v1, p0}, Lm/p;->g(Lm/h0/h/e;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lm/b0;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->b:Lm/b0;

    return-object v0
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lm/h0/h/e;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/h0/h/e;->p:Z

    iget-object v0, p0, Lm/h0/h/e;->q:Lm/h0/h/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lm/h0/h/c;->b()V

    :goto_0
    iget-object v0, p0, Lm/h0/h/e;->r:Lm/h0/h/f;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lm/h0/h/f;->e()V

    :goto_1
    iget-object v0, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-virtual {v0, p0}, Lm/r;->g(Lm/e;)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm/h0/h/e;->i()Lm/h0/h/e;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lm/h0/h/f;)V
    .locals 3

    const-string v0, "connection"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

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

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    iput-object p1, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    invoke-virtual {p1}, Lm/h0/h/f;->o()Ljava/util/List;

    move-result-object p1

    new-instance v0, Lm/h0/h/e$b;

    iget-object v1, p0, Lm/h0/h/e;->h:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lm/h0/h/e$b;-><init>(Lm/h0/h/e;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/h/e;->p:Z

    return v0
.end method

.method public i()Lm/h0/h/e;
    .locals 4

    new-instance v0, Lm/h0/h/e;

    iget-object v1, p0, Lm/h0/h/e;->a:Lm/z;

    iget-object v2, p0, Lm/h0/h/e;->b:Lm/b0;

    iget-boolean v3, p0, Lm/h0/h/e;->c:Z

    invoke-direct {v0, v1, v2, v3}, Lm/h0/h/e;-><init>(Lm/z;Lm/b0;Z)V

    return-object v0
.end method

.method public final m(Lm/b0;Z)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/e;->l:Lm/h0/h/c;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/h/e;->n:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lm/h0/h/e;->m:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p2, :cond_1

    new-instance p2, Lm/h0/h/d;

    iget-object v0, p0, Lm/h0/h/e;->d:Lm/h0/h/g;

    invoke-virtual {p1}, Lm/b0;->j()Lm/v;

    move-result-object p1

    invoke-direct {p0, p1}, Lm/h0/h/e;->k(Lm/v;)Lm/a;

    move-result-object p1

    iget-object v1, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-direct {p2, v0, p1, p0, v1}, Lm/h0/h/d;-><init>(Lm/h0/h/g;Lm/a;Lm/h0/h/e;Lm/r;)V

    iput-object p2, p0, Lm/h0/h/e;->i:Lm/h0/h/d;

    :cond_1
    return-void

    :cond_2
    :try_start_1
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-string p1, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_4
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final n(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/h/e;->o:Z

    if-eqz v0, :cond_2

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lm/h0/h/e;->q:Lm/h0/h/c;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm/h0/h/c;->d()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lm/h0/h/e;->l:Lm/h0/h/c;

    return-void

    :cond_2
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final o()Lm/z;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    return-object v0
.end method

.method public final p()Lm/h0/h/f;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    return-object v0
.end method

.method public final q()Lm/r;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->e:Lm/r;

    return-object v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/h/e;->c:Z

    return v0
.end method

.method public final s()Lm/h0/h/c;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->l:Lm/h0/h/c;

    return-object v0
.end method

.method public final t()Lm/b0;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->b:Lm/b0;

    return-object v0
.end method

.method public u(Lm/f;)V
    .locals 3

    const-string v0, "responseCallback"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/e;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lm/h0/h/e;->h()V

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->q()Lm/p;

    move-result-object v0

    new-instance v1, Lm/h0/h/e$a;

    invoke-direct {v1, p0, p1}, Lm/h0/h/e$a;-><init>(Lm/h0/h/e;Lm/f;)V

    invoke-virtual {v0, v1}, Lm/p;->a(Lm/h0/h/e$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v()Lm/d0;
    .locals 10

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->y()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Ll/t/k;->r(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    new-instance v0, Lm/h0/i/j;

    iget-object v1, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-direct {v0, v1}, Lm/h0/i/j;-><init>(Lm/z;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, Lm/h0/i/a;

    iget-object v1, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->p()Lm/n;

    move-result-object v1

    invoke-direct {v0, v1}, Lm/h0/i/a;-><init>(Lm/n;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, Lm/h0/f/a;

    iget-object v1, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v1}, Lm/z;->h()Lm/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lm/h0/f/a;-><init>(Lm/c;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    sget-object v0, Lm/h0/h/a;->a:Lm/h0/h/a;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lm/h0/h/e;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->z()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Ll/t/k;->r(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    :cond_0
    new-instance v0, Lm/h0/i/b;

    iget-boolean v1, p0, Lm/h0/h/e;->c:Z

    invoke-direct {v0, v1}, Lm/h0/i/b;-><init>(Z)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v9, Lm/h0/i/g;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lm/h0/h/e;->b:Lm/b0;

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->m()I

    move-result v6

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->G()I

    move-result v7

    iget-object v0, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0}, Lm/z;->L()I

    move-result v8

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lm/h0/i/g;-><init>(Lm/h0/h/e;Ljava/util/List;ILm/h0/h/c;Lm/b0;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lm/h0/h/e;->b:Lm/b0;

    invoke-virtual {v9, v2}, Lm/h0/i/g;->a(Lm/b0;)Lm/d0;

    move-result-object v2

    invoke-virtual {p0}, Lm/h0/h/e;->f()Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    invoke-virtual {p0, v1}, Lm/h0/h/e;->y(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, Lm/h0/d;->j(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    :try_start_2
    invoke-virtual {p0, v0}, Lm/h0/h/e;->y(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v3, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Lm/h0/h/e;->y(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_3
    throw v2
.end method

.method public final w(Lm/h0/i/g;)Lm/h0/h/c;
    .locals 4

    const-string v0, "chain"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/h/e;->o:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lm/h0/h/e;->n:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lm/h0/h/e;->m:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    iget-object v0, p0, Lm/h0/h/e;->i:Lm/h0/h/d;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lm/h0/h/e;->a:Lm/z;

    invoke-virtual {v0, v2, p1}, Lm/h0/h/d;->a(Lm/z;Lm/h0/i/g;)Lm/h0/i/d;

    move-result-object p1

    new-instance v2, Lm/h0/h/c;

    iget-object v3, p0, Lm/h0/h/e;->e:Lm/r;

    invoke-direct {v2, p0, v3, v0, p1}, Lm/h0/h/c;-><init>(Lm/h0/h/e;Lm/r;Lm/h0/h/d;Lm/h0/i/d;)V

    iput-object v2, p0, Lm/h0/h/e;->l:Lm/h0/h/c;

    iput-object v2, p0, Lm/h0/h/e;->q:Lm/h0/h/c;

    monitor-enter p0

    :try_start_1
    iput-boolean v1, p0, Lm/h0/h/e;->m:Z

    iput-boolean v1, p0, Lm/h0/h/e;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-boolean p1, p0, Lm/h0/h/e;->p:Z

    if-nez p1, :cond_0

    return-object v2

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1
    :try_start_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final x(Lm/h0/h/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(",
            "Lm/h0/h/c;",
            "ZZTE;)TE;"
        }
    .end annotation

    const-string v0, "exchange"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/e;->q:Lm/h0/h/c;

    invoke-static {p1, v0}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    monitor-enter p0

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v0, p0, Lm/h0/h/e;->m:Z

    if-nez v0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    iget-boolean v0, p0, Lm/h0/h/e;->n:Z

    if-eqz v0, :cond_7

    :cond_2
    if-eqz p2, :cond_3

    iput-boolean p1, p0, Lm/h0/h/e;->m:Z

    :cond_3
    if-eqz p3, :cond_4

    iput-boolean p1, p0, Lm/h0/h/e;->n:Z

    :cond_4
    iget-boolean p2, p0, Lm/h0/h/e;->m:Z

    const/4 p3, 0x1

    if-nez p2, :cond_5

    iget-boolean v0, p0, Lm/h0/h/e;->n:Z

    if-nez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    if-nez p2, :cond_6

    iget-boolean p2, p0, Lm/h0/h/e;->n:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, Lm/h0/h/e;->o:Z

    if-nez p2, :cond_6

    const/4 p1, 0x1

    :cond_6
    move p2, p1

    move p1, v0

    goto :goto_2

    :cond_7
    const/4 p2, 0x0

    :goto_2
    sget-object p3, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_9

    const/4 p1, 0x0

    iput-object p1, p0, Lm/h0/h/e;->q:Lm/h0/h/c;

    iget-object p1, p0, Lm/h0/h/e;->j:Lm/h0/h/f;

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Lm/h0/h/f;->t()V

    :cond_9
    :goto_3
    if-eqz p2, :cond_a

    invoke-direct {p0, p4}, Lm/h0/h/e;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_a
    return-object p4

    :goto_4
    monitor-exit p0

    throw p1
.end method

.method public final y(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/h/e;->o:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lm/h0/h/e;->o:Z

    iget-boolean v0, p0, Lm/h0/h/e;->m:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lm/h0/h/e;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lm/h0/h/e;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e;->b:Lm/b0;

    invoke-virtual {v0}, Lm/b0;->j()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
