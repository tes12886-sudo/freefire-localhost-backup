.class public Lj/c/a/e/f/d;
.super Landroid/os/HandlerThread;
.source ""

# interfaces
.implements Lj/c/a/e/f/b;
.implements Lj/c/a/e/f/l/c$b;
.implements Lj/c/a/e/f/e;


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private final b:Lj/c/a/e/f/c;

.field private c:Lj/c/a/e/f/l/a;

.field private d:Lj/c/a/e/f/a;

.field private e:Lj/c/a/e/f/g;


# direct methods
.method public constructor <init>(Lj/c/a/e/f/c;)V
    .locals 1

    const-string v0, "NETWORK_THREAD"

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lj/c/a/e/f/d;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private h(I)V
    .locals 1

    invoke-static {p1}, Lj/c/a/e/f/i;->a(I)Lj/c/a/e/f/l/a;

    move-result-object v0

    iput-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    :try_start_0
    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->d()V

    invoke-direct {p0}, Lj/c/a/e/f/d;->k()V

    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->c(I)V
    :try_end_0
    .catch Lj/c/a/e/f/k/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->b(I)V

    :goto_0
    return-void
.end method

.method private i()V
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->e()V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 4

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->g()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/f/i;->c(Ljava/io/InputStream;)Lj/c/a/e/f/j;

    move-result-object v0

    new-instance v1, Lj/c/a/e/f/h;

    iget-object v2, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v2}, Lj/c/a/e/f/l/a;->f()I

    move-result v2

    iget-object v3, p0, Lj/c/a/e/f/d;->e:Lj/c/a/e/f/g;

    invoke-direct {v1, v2, v0, v3}, Lj/c/a/e/f/h;-><init>(ILj/c/a/e/f/j;Lj/c/a/e/f/e;)V

    iget-object v0, p0, Lj/c/a/e/f/d;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-direct {p0}, Lj/c/a/e/f/d;->i()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj/c/a/e/f/d;->h(I)V

    return-void
.end method

.method public b(Lj/c/a/e/f/l/b;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TIMEOUT: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj/c/a/e/f/l/b;->b()I

    move-result v1

    invoke-static {v1}, Lj/c/a/e/l/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->e()V

    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->d(Lj/c/a/e/f/l/b;)V

    return-void
.end method

.method public c(Lj/c/a/e/f/l/b;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {p1}, Lj/c/a/e/f/l/b;->h()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/c/a/e/f/l/a;->k([B)V

    invoke-virtual {p1}, Lj/c/a/e/f/l/b;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lj/c/a/e/f/l/c;

    invoke-direct {v0, p1}, Lj/c/a/e/f/l/c;-><init>(Lj/c/a/e/f/l/b;)V

    invoke-virtual {v0, p0}, Lj/c/a/e/f/l/c;->d(Lj/c/a/e/f/l/c$b;)V

    invoke-virtual {v0}, Lj/c/a/e/f/l/c;->e()V

    iget-object v1, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v1, v0}, Lj/c/a/e/f/l/a;->o(Lj/c/a/e/f/l/c;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->d(Lj/c/a/e/f/l/b;)V
    :try_end_0
    .catch Lj/c/a/e/f/k/b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->d(Lj/c/a/e/f/l/b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    invoke-direct {p0}, Lj/c/a/e/f/d;->i()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj/c/a/e/f/d;->h(I)V

    return-void
.end method

.method public e(Lj/c/a/e/f/l/b;)V
    .locals 2

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->j()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->e()V

    :cond_0
    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->i()Lj/c/a/e/f/l/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lj/c/a/e/f/l/c;->c(Lj/c/a/e/f/l/b;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lj/c/a/e/f/l/c;->f()V

    :cond_1
    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->e(Lj/c/a/e/f/l/b;)V

    :cond_2
    return-void
.end method

.method public f()V
    .locals 1

    invoke-direct {p0}, Lj/c/a/e/f/d;->i()V

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lj/c/a/e/f/d;->h(I)V

    return-void
.end method

.method public g(I)V
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->e()V

    iget-object v0, p0, Lj/c/a/e/f/d;->b:Lj/c/a/e/f/c;

    invoke-interface {v0, p1}, Lj/c/a/e/f/c;->a(I)V

    :cond_0
    return-void
.end method

.method public j()Lj/c/a/e/f/b;
    .locals 2

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/f/d;->d:Lj/c/a/e/f/a;

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    new-instance v1, Lj/c/a/e/f/a;

    invoke-direct {v1, v0, p0}, Lj/c/a/e/f/a;-><init>(Landroid/os/Looper;Lj/c/a/e/f/b;)V

    iput-object v1, p0, Lj/c/a/e/f/d;->d:Lj/c/a/e/f/a;

    :cond_0
    iget-object v0, p0, Lj/c/a/e/f/d;->d:Lj/c/a/e/f/a;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onLooperPrepared()V
    .locals 2

    invoke-super {p0}, Landroid/os/HandlerThread;->onLooperPrepared()V

    new-instance v0, Lj/c/a/e/f/g;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lj/c/a/e/f/g;-><init>(Landroid/os/Looper;Lj/c/a/e/f/e;)V

    iput-object v0, p0, Lj/c/a/e/f/d;->e:Lj/c/a/e/f/g;

    return-void
.end method

.method public quit()Z
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/d;->c:Lj/c/a/e/f/l/a;

    invoke-virtual {v0}, Lj/c/a/e/f/l/a;->e()V

    iget-object v0, p0, Lj/c/a/e/f/d;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lj/c/a/e/f/d;->d:Lj/c/a/e/f/a;

    invoke-super {p0}, Landroid/os/HandlerThread;->quit()Z

    move-result v0

    return v0
.end method
