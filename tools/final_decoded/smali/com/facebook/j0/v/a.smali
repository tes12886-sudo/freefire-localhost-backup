.class public final Lcom/facebook/j0/v/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private static volatile c:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private static final d:Ljava/lang/Object;

.field private static final e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static volatile f:Lcom/facebook/j0/v/h;

.field private static final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static h:Ljava/lang/String;

.field private static i:J

.field private static j:I

.field private static k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lcom/facebook/j0/v/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/j0/v/a;

    invoke-direct {v0}, Lcom/facebook/j0/v/a;-><init>()V

    sput-object v0, Lcom/facebook/j0/v/a;->l:Lcom/facebook/j0/v/a;

    const-class v0, Lcom/facebook/j0/v/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "com.facebook.appevents.internal.ActivityLifecycleTracker"

    :goto_0
    sput-object v0, Lcom/facebook/j0/v/a;->a:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/facebook/j0/v/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/j0/v/a;->d:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/facebook/j0/v/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/facebook/j0/v/a;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/j0/v/a;)I
    .locals 0

    sget p0, Lcom/facebook/j0/v/a;->j:I

    return p0
.end method

.method public static final synthetic b(Lcom/facebook/j0/v/a;)Ljava/lang/String;
    .locals 0

    sget-object p0, Lcom/facebook/j0/v/a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic c(Lcom/facebook/j0/v/a;)J
    .locals 2

    sget-wide v0, Lcom/facebook/j0/v/a;->i:J

    return-wide v0
.end method

.method public static final synthetic d(Lcom/facebook/j0/v/a;)Ljava/lang/Object;
    .locals 0

    sget-object p0, Lcom/facebook/j0/v/a;->d:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic e(Lcom/facebook/j0/v/a;)Lcom/facebook/j0/v/h;
    .locals 0

    sget-object p0, Lcom/facebook/j0/v/a;->f:Lcom/facebook/j0/v/h;

    return-object p0
.end method

.method public static final synthetic f(Lcom/facebook/j0/v/a;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    sget-object p0, Lcom/facebook/j0/v/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic g(Lcom/facebook/j0/v/a;)I
    .locals 0

    invoke-direct {p0}, Lcom/facebook/j0/v/a;->r()I

    move-result p0

    return p0
.end method

.method public static final synthetic h(Lcom/facebook/j0/v/a;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    sget-object p0, Lcom/facebook/j0/v/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static final synthetic i(Lcom/facebook/j0/v/a;)Ljava/lang/String;
    .locals 0

    sget-object p0, Lcom/facebook/j0/v/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic j(Lcom/facebook/j0/v/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/j0/v/a;->u(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic k(Lcom/facebook/j0/v/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/j0/v/a;->v(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic l(Lcom/facebook/j0/v/a;I)V
    .locals 0

    sput p1, Lcom/facebook/j0/v/a;->j:I

    return-void
.end method

.method public static final synthetic m(Lcom/facebook/j0/v/a;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    sput-object p1, Lcom/facebook/j0/v/a;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static final synthetic n(Lcom/facebook/j0/v/a;Lcom/facebook/j0/v/h;)V
    .locals 0

    sput-object p1, Lcom/facebook/j0/v/a;->f:Lcom/facebook/j0/v/h;

    return-void
.end method

.method private final o()V
    .locals 3

    sget-object v0, Lcom/facebook/j0/v/a;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/j0/v/a;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/facebook/j0/v/a;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    const/4 v1, 0x0

    sput-object v1, Lcom/facebook/j0/v/a;->c:Ljava/util/concurrent/ScheduledFuture;

    sget-object v1, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static final p()Landroid/app/Activity;
    .locals 2

    sget-object v0, Lcom/facebook/j0/v/a;->k:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    :cond_0
    return-object v1
.end method

.method public static final q()Ljava/util/UUID;
    .locals 2

    sget-object v0, Lcom/facebook/j0/v/a;->f:Lcom/facebook/j0/v/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/j0/v/a;->f:Lcom/facebook/j0/v/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/j0/v/h;->d()Ljava/util/UUID;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method private final r()I
    .locals 1

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/u;->j(Ljava/lang/String;)Lcom/facebook/internal/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/internal/t;->j()I

    move-result v0

    return v0

    :cond_0
    invoke-static {}, Lcom/facebook/j0/v/e;->a()I

    move-result v0

    return v0
.end method

.method public static final s()Z
    .locals 1

    sget v0, Lcom/facebook/j0/v/a;->j:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final t(Landroid/app/Activity;)V
    .locals 1

    sget-object p0, Lcom/facebook/j0/v/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v0, Lcom/facebook/j0/v/a$a;->a:Lcom/facebook/j0/v/a$a;

    invoke-interface {p0, v0}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final u(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Lcom/facebook/j0/r/b;->k(Landroid/app/Activity;)V

    return-void
.end method

.method private final v(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lcom/facebook/j0/v/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    sget-object v0, Lcom/facebook/j0/v/a;->a:Ljava/lang/String;

    const-string v1, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application\'s onCreate method"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-direct {p0}, Lcom/facebook/j0/v/a;->o()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1}, Lcom/facebook/internal/h0;->t(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/facebook/j0/r/b;->l(Landroid/app/Activity;)V

    new-instance p1, Lcom/facebook/j0/v/a$b;

    invoke-direct {p1, v0, v1, v2}, Lcom/facebook/j0/v/a$b;-><init>(JLjava/lang/String;)V

    sget-object v0, Lcom/facebook/j0/v/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final w(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/facebook/j0/v/a;->k:Ljava/lang/ref/WeakReference;

    sget-object v0, Lcom/facebook/j0/v/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    sget-object v0, Lcom/facebook/j0/v/a;->l:Lcom/facebook/j0/v/a;

    invoke-direct {v0}, Lcom/facebook/j0/v/a;->o()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/facebook/j0/v/a;->i:J

    invoke-static {p0}, Lcom/facebook/internal/h0;->t(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/facebook/j0/r/b;->m(Landroid/app/Activity;)V

    invoke-static {p0}, Lcom/facebook/j0/q/a;->d(Landroid/app/Activity;)V

    invoke-static {p0}, Lcom/facebook/j0/z/d;->h(Landroid/app/Activity;)V

    invoke-static {}, Lcom/facebook/j0/t/f;->b()V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v3, Lcom/facebook/j0/v/a$c;

    invoke-direct {v3, v0, v1, v2, p0}, Lcom/facebook/j0/v/a$c;-><init>(JLjava/lang/String;Landroid/content/Context;)V

    sget-object p0, Lcom/facebook/j0/v/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p0, v3}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final x(Landroid/app/Application;Ljava/lang/String;)V
    .locals 3

    const-string v0, "application"

    invoke-static {p0, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/j0/v/a;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/internal/p$b;->e:Lcom/facebook/internal/p$b;

    sget-object v1, Lcom/facebook/j0/v/a$d;->a:Lcom/facebook/j0/v/a$d;

    invoke-static {v0, v1}, Lcom/facebook/internal/p;->a(Lcom/facebook/internal/p$b;Lcom/facebook/internal/p$a;)V

    sput-object p1, Lcom/facebook/j0/v/a;->h:Ljava/lang/String;

    new-instance p1, Lcom/facebook/j0/v/a$e;

    invoke-direct {p1}, Lcom/facebook/j0/v/a$e;-><init>()V

    invoke-virtual {p0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
