.class public Lj/c/a/e/f/l/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/c/a/e/f/l/c$b;
    }
.end annotation


# instance fields
.field private final a:Lj/c/a/e/f/l/b;

.field private final b:Landroid/os/Handler;

.field private c:Lj/c/a/e/f/l/c$b;

.field private d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lj/c/a/e/f/l/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/c/a/e/f/l/c$a;

    invoke-direct {v0, p0}, Lj/c/a/e/f/l/c$a;-><init>(Lj/c/a/e/f/l/c;)V

    iput-object v0, p0, Lj/c/a/e/f/l/c;->d:Ljava/lang/Runnable;

    iput-object p1, p0, Lj/c/a/e/f/l/c;->a:Lj/c/a/e/f/l/b;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lj/c/a/e/f/l/c;->b:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lj/c/a/e/f/l/c;)Lj/c/a/e/f/l/c$b;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/f/l/c;->c:Lj/c/a/e/f/l/c$b;

    return-object p0
.end method

.method static synthetic b(Lj/c/a/e/f/l/c;)Lj/c/a/e/f/l/b;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/f/l/c;->a:Lj/c/a/e/f/l/b;

    return-object p0
.end method


# virtual methods
.method public c(Lj/c/a/e/f/l/b;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public d(Lj/c/a/e/f/l/c$b;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/f/l/c;->c:Lj/c/a/e/f/l/c$b;

    return-void
.end method

.method public declared-synchronized e()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/f/l/c;->c:Lj/c/a/e/f/l/c$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/f/l/c;->b:Landroid/os/Handler;

    iget-object v1, p0, Lj/c/a/e/f/l/c;->d:Ljava/lang/Runnable;

    iget-object v2, p0, Lj/c/a/e/f/l/c;->a:Lj/c/a/e/f/l/b;

    invoke-virtual {v2}, Lj/c/a/e/f/l/b;->d()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/f/l/c;->c:Lj/c/a/e/f/l/c$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/f/l/c;->b:Landroid/os/Handler;

    iget-object v1, p0, Lj/c/a/e/f/l/c;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
