.class public Lj/g/a/a/a/u;
.super Ljava/lang/Object;
.source ""


# static fields
.field static volatile g:Lj/g/a/a/a/u;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field a:Lj/g/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/l<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation
.end field

.field b:Lj/g/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/l<",
            "Lj/g/a/a/a/e;",
            ">;"
        }
    .end annotation
.end field

.field c:Lj/g/a/a/a/y/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/y/d<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lj/g/a/a/a/p;

.field private final e:Landroid/content/Context;

.field private volatile f:Lj/g/a/a/a/f;


# direct methods
.method constructor <init>(Lj/g/a/a/a/p;)V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lj/g/a/a/a/u;-><init>(Lj/g/a/a/a/p;Ljava/util/concurrent/ConcurrentHashMap;Lj/g/a/a/a/n;)V

    return-void
.end method

.method constructor <init>(Lj/g/a/a/a/p;Ljava/util/concurrent/ConcurrentHashMap;Lj/g/a/a/a/n;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/p;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lj/g/a/a/a/k;",
            "Lj/g/a/a/a/n;",
            ">;",
            "Lj/g/a/a/a/n;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/g/a/a/a/u;->d:Lj/g/a/a/a/p;

    invoke-static {}, Lj/g/a/a/a/m;->f()Lj/g/a/a/a/m;

    move-result-object p1

    invoke-virtual {p0}, Lj/g/a/a/a/u;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/g/a/a/a/m;->d(Ljava/lang/String;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lj/g/a/a/a/u;->e:Landroid/content/Context;

    new-instance p2, Lj/g/a/a/a/i;

    new-instance p3, Lj/g/a/a/a/y/k/b;

    const-string v0, "session_store"

    invoke-direct {p3, p1, v0}, Lj/g/a/a/a/y/k/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v1, Lj/g/a/a/a/x$a;

    invoke-direct {v1}, Lj/g/a/a/a/x$a;-><init>()V

    const-string v2, "active_twittersession"

    const-string v3, "twittersession"

    invoke-direct {p2, p3, v1, v2, v3}, Lj/g/a/a/a/i;-><init>(Lj/g/a/a/a/y/k/a;Lj/g/a/a/a/y/k/d;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lj/g/a/a/a/u;->a:Lj/g/a/a/a/l;

    new-instance p2, Lj/g/a/a/a/i;

    new-instance p3, Lj/g/a/a/a/y/k/b;

    invoke-direct {p3, p1, v0}, Lj/g/a/a/a/y/k/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p1, Lj/g/a/a/a/e$a;

    invoke-direct {p1}, Lj/g/a/a/a/e$a;-><init>()V

    const-string v0, "active_guestsession"

    const-string v1, "guestsession"

    invoke-direct {p2, p3, p1, v0, v1}, Lj/g/a/a/a/i;-><init>(Lj/g/a/a/a/y/k/a;Lj/g/a/a/a/y/k/d;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lj/g/a/a/a/u;->b:Lj/g/a/a/a/l;

    new-instance p1, Lj/g/a/a/a/y/d;

    iget-object p2, p0, Lj/g/a/a/a/u;->a:Lj/g/a/a/a/l;

    invoke-static {}, Lj/g/a/a/a/m;->f()Lj/g/a/a/a/m;

    move-result-object p3

    invoke-virtual {p3}, Lj/g/a/a/a/m;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p3

    new-instance v0, Lj/g/a/a/a/y/h;

    invoke-direct {v0}, Lj/g/a/a/a/y/h;-><init>()V

    invoke-direct {p1, p2, p3, v0}, Lj/g/a/a/a/y/d;-><init>(Lj/g/a/a/a/l;Ljava/util/concurrent/ExecutorService;Lj/g/a/a/a/y/e;)V

    iput-object p1, p0, Lj/g/a/a/a/u;->c:Lj/g/a/a/a/y/d;

    return-void
.end method

.method private declared-synchronized a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj/g/a/a/a/u;->f:Lj/g/a/a/a/f;

    if-nez v0, :cond_0

    new-instance v0, Lj/g/a/a/a/y/j/e;

    new-instance v1, Lj/g/a/a/a/y/g;

    invoke-direct {v1}, Lj/g/a/a/a/y/g;-><init>()V

    invoke-direct {v0, p0, v1}, Lj/g/a/a/a/y/j/e;-><init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V

    new-instance v1, Lj/g/a/a/a/f;

    iget-object v2, p0, Lj/g/a/a/a/u;->b:Lj/g/a/a/a/l;

    invoke-direct {v1, v0, v2}, Lj/g/a/a/a/f;-><init>(Lj/g/a/a/a/y/j/e;Lj/g/a/a/a/l;)V

    iput-object v1, p0, Lj/g/a/a/a/u;->f:Lj/g/a/a/a/f;
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

.method public static f()Lj/g/a/a/a/u;
    .locals 3

    sget-object v0, Lj/g/a/a/a/u;->g:Lj/g/a/a/a/u;

    if-nez v0, :cond_1

    const-class v0, Lj/g/a/a/a/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj/g/a/a/a/u;->g:Lj/g/a/a/a/u;

    if-nez v1, :cond_0

    new-instance v1, Lj/g/a/a/a/u;

    invoke-static {}, Lj/g/a/a/a/m;->f()Lj/g/a/a/a/m;

    move-result-object v2

    invoke-virtual {v2}, Lj/g/a/a/a/m;->h()Lj/g/a/a/a/p;

    move-result-object v2

    invoke-direct {v1, v2}, Lj/g/a/a/a/u;-><init>(Lj/g/a/a/a/p;)V

    sput-object v1, Lj/g/a/a/a/u;->g:Lj/g/a/a/a/u;

    invoke-static {}, Lj/g/a/a/a/m;->f()Lj/g/a/a/a/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/g/a/a/a/m;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lj/g/a/a/a/u$a;

    invoke-direct {v2}, Lj/g/a/a/a/u$a;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lj/g/a/a/a/u;->g:Lj/g/a/a/a/u;

    return-object v0
.end method


# virtual methods
.method b()V
    .locals 2

    iget-object v0, p0, Lj/g/a/a/a/u;->a:Lj/g/a/a/a/l;

    invoke-interface {v0}, Lj/g/a/a/a/l;->c()Lj/g/a/a/a/k;

    iget-object v0, p0, Lj/g/a/a/a/u;->b:Lj/g/a/a/a/l;

    invoke-interface {v0}, Lj/g/a/a/a/l;->c()Lj/g/a/a/a/k;

    invoke-virtual {p0}, Lj/g/a/a/a/u;->d()Lj/g/a/a/a/f;

    iget-object v0, p0, Lj/g/a/a/a/u;->c:Lj/g/a/a/a/y/d;

    invoke-static {}, Lj/g/a/a/a/m;->f()Lj/g/a/a/a/m;

    move-result-object v1

    invoke-virtual {v1}, Lj/g/a/a/a/m;->c()Lj/g/a/a/a/y/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/g/a/a/a/y/d;->a(Lj/g/a/a/a/y/a;)V

    return-void
.end method

.method public c()Lj/g/a/a/a/p;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/u;->d:Lj/g/a/a/a/p;

    return-object v0
.end method

.method public d()Lj/g/a/a/a/f;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/u;->f:Lj/g/a/a/a/f;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lj/g/a/a/a/u;->a()V

    :cond_0
    iget-object v0, p0, Lj/g/a/a/a/u;->f:Lj/g/a/a/a/f;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "com.twitter.sdk.android:twitter-core"

    return-object v0
.end method

.method public g()Lj/g/a/a/a/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/g/a/a/a/l<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj/g/a/a/a/u;->a:Lj/g/a/a/a/l;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "4.0.19P2"

    return-object v0
.end method
