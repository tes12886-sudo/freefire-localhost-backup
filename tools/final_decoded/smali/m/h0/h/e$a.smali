.class public final Lm/h0/h/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/h/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final a:Lm/f;

.field private volatile b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic c:Lm/h0/h/e;


# direct methods
.method public constructor <init>(Lm/h0/h/e;Lm/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/f;",
            ")V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm/h0/h/e$a;->a:Lm/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lm/h0/h/e$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    const-string v0, "executorService"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v0

    invoke-virtual {v0}, Lm/z;->q()Lm/p;

    move-result-object v0

    sget-boolean v1, Lm/h0/d;->g:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

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

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object p1, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-virtual {p1, v0}, Lm/h0/h/e;->y(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object p1, p0, Lm/h0/h/e$a;->a:Lm/f;

    iget-object v1, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-interface {p1, v1, v0}, Lm/f;->onFailure(Lm/e;Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-virtual {p1}, Lm/h0/h/e;->o()Lm/z;

    move-result-object p1

    invoke-virtual {p1}, Lm/z;->q()Lm/p;

    move-result-object p1

    invoke-virtual {p1, p0}, Lm/p;->f(Lm/h0/h/e$a;)V

    :goto_1
    return-void

    :goto_2
    iget-object v0, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v0

    invoke-virtual {v0}, Lm/z;->q()Lm/p;

    move-result-object v0

    invoke-virtual {v0, p0}, Lm/p;->f(Lm/h0/h/e$a;)V

    throw p1
.end method

.method public final b()Lm/h0/h/e;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    return-object v0
.end method

.method public final c()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->t()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->j()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lm/h0/h/e$a;)V
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lm/h0/h/e$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lm/h0/h/e$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public run()V
    .locals 7

    iget-object v0, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-virtual {v0}, Lm/h0/h/e;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OkHttp "

    invoke-static {v1, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm/h0/h/e$a;->c:Lm/h0/h/e;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v1}, Lm/h0/h/e;->a(Lm/h0/h/e;)Lm/h0/h/e$c;

    move-result-object v4

    invoke-virtual {v4}, Ln/a;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-virtual {v1}, Lm/h0/h/e;->v()Lm/d0;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v4, 0x1

    :try_start_2
    iget-object v5, p0, Lm/h0/h/e$a;->a:Lm/f;

    invoke-interface {v5, v1, v0}, Lm/f;->onResponse(Lm/e;Lm/d0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v1}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v0

    invoke-virtual {v0}, Lm/z;->q()Lm/p;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p0}, Lm/p;->f(Lm/h0/h/e$a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v4

    move-object v0, v4

    const/4 v4, 0x0

    :goto_1
    :try_start_4
    invoke-virtual {v1}, Lm/h0/h/e;->cancel()V

    if-nez v4, :cond_0

    new-instance v4, Ljava/io/IOException;

    const-string v5, "canceled due to "

    invoke-static {v5, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v0}, Ll/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iget-object v5, p0, Lm/h0/h/e$a;->a:Lm/f;

    invoke-interface {v5, v1, v4}, Lm/f;->onFailure(Lm/e;Ljava/io/IOException;)V

    :cond_0
    throw v0

    :catchall_2
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v4

    move-object v0, v4

    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_1

    sget-object v4, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v4}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v4

    const-string v5, "Callback failure for "

    invoke-static {v1}, Lm/h0/h/e;->d(Lm/h0/h/e;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    invoke-virtual {v4, v5, v6, v0}, Lm/h0/l/h;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_3

    :cond_1
    iget-object v4, p0, Lm/h0/h/e$a;->a:Lm/f;

    invoke-interface {v4, v1, v0}, Lm/f;->onFailure(Lm/e;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    :try_start_5
    invoke-virtual {v1}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v0

    invoke-virtual {v0}, Lm/z;->q()Lm/p;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_0

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_5
    :try_start_6
    invoke-virtual {v1}, Lm/h0/h/e;->o()Lm/z;

    move-result-object v1

    invoke-virtual {v1}, Lm/z;->q()Lm/p;

    move-result-object v1

    invoke-virtual {v1, p0}, Lm/p;->f(Lm/h0/h/e$a;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method
