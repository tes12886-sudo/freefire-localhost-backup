.class final Lcom/facebook/j0/v/a$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/v/a$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/v/a$b;


# direct methods
.method constructor <init>(Lcom/facebook/j0/v/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/v/a$b$a;->a:Lcom/facebook/j0/v/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/j0/v/a;->l:Lcom/facebook/j0/v/a;

    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/facebook/j0/v/h;

    iget-object v2, p0, Lcom/facebook/j0/v/a$b$a;->a:Lcom/facebook/j0/v/a$b;

    iget-wide v2, v2, Lcom/facebook/j0/v/a$b;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lcom/facebook/j0/v/h;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILl/y/c/f;)V

    invoke-static {v0, v1}, Lcom/facebook/j0/v/a;->n(Lcom/facebook/j0/v/a;Lcom/facebook/j0/v/h;)V

    :cond_1
    invoke-static {v0}, Lcom/facebook/j0/v/a;->f(Lcom/facebook/j0/v/a;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-gtz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/j0/v/a$b$a;->a:Lcom/facebook/j0/v/a$b;

    iget-object v1, v1, Lcom/facebook/j0/v/a$b;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/j0/v/a;->e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;

    move-result-object v3

    invoke-static {v0}, Lcom/facebook/j0/v/a;->b(Lcom/facebook/j0/v/a;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lcom/facebook/j0/v/i;->e(Ljava/lang/String;Lcom/facebook/j0/v/h;Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/j0/v/h;->g:Lcom/facebook/j0/v/h$a;

    invoke-virtual {v1}, Lcom/facebook/j0/v/h$a;->a()V

    invoke-static {v0, v2}, Lcom/facebook/j0/v/a;->n(Lcom/facebook/j0/v/a;Lcom/facebook/j0/v/h;)V

    :cond_2
    invoke-static {v0}, Lcom/facebook/j0/v/a;->d(Lcom/facebook/j0/v/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v0, v2}, Lcom/facebook/j0/v/a;->m(Lcom/facebook/j0/v/a;Ljava/util/concurrent/ScheduledFuture;)V

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
