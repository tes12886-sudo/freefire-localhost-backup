.class final Lcom/facebook/j0/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/e;->h(Lcom/facebook/j0/a;Lcom/facebook/j0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/a;

.field final synthetic b:Lcom/facebook/j0/c;


# direct methods
.method constructor <init>(Lcom/facebook/j0/a;Lcom/facebook/j0/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/e$a;->a:Lcom/facebook/j0/a;

    iput-object p2, p0, Lcom/facebook/j0/e$a;->b:Lcom/facebook/j0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/j0/e;->g:Lcom/facebook/j0/e;

    invoke-static {v0}, Lcom/facebook/j0/e;->a(Lcom/facebook/j0/e;)Lcom/facebook/j0/d;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/j0/e$a;->a:Lcom/facebook/j0/a;

    iget-object v3, p0, Lcom/facebook/j0/e$a;->b:Lcom/facebook/j0/c;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/j0/d;->a(Lcom/facebook/j0/a;Lcom/facebook/j0/c;)V

    sget-object v1, Lcom/facebook/j0/g;->b:Lcom/facebook/j0/g$a;

    invoke-virtual {v1}, Lcom/facebook/j0/g$a;->c()Lcom/facebook/j0/g$b;

    move-result-object v1

    sget-object v2, Lcom/facebook/j0/g$b;->b:Lcom/facebook/j0/g$b;

    if-eq v1, v2, :cond_1

    invoke-static {v0}, Lcom/facebook/j0/e;->a(Lcom/facebook/j0/e;)Lcom/facebook/j0/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/j0/d;->d()I

    move-result v1

    invoke-static {v0}, Lcom/facebook/j0/e;->c(Lcom/facebook/j0/e;)I

    move-result v2

    if-le v1, v2, :cond_1

    sget-object v0, Lcom/facebook/j0/j;->c:Lcom/facebook/j0/j;

    invoke-static {v0}, Lcom/facebook/j0/e;->l(Lcom/facebook/j0/j;)V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/facebook/j0/e;->d(Lcom/facebook/j0/e;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lcom/facebook/j0/e;->e(Lcom/facebook/j0/e;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/j0/e;->b(Lcom/facebook/j0/e;)Ljava/lang/Runnable;

    move-result-object v2

    const/16 v3, 0xf

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/j0/e;->g(Lcom/facebook/j0/e;Ljava/util/concurrent/ScheduledFuture;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
