.class public Li/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li/i$m;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final i:Ljava/util/concurrent/ExecutorService;

.field private static final j:Ljava/util/concurrent/Executor;

.field public static final k:Ljava/util/concurrent/Executor;

.field private static volatile l:Li/i$m;

.field private static m:Li/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/i<",
            "*>;"
        }
    .end annotation
.end field

.field private static n:Li/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static o:Li/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static p:Li/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/i<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private c:Z

.field private d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Exception;

.field private f:Z

.field private g:Li/k;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li/g<",
            "TTResult;",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Li/c;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Li/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Li/i;->j:Ljava/util/concurrent/Executor;

    invoke-static {}, Li/b;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Li/i;->k:Ljava/util/concurrent/Executor;

    new-instance v0, Li/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li/i;-><init>(Ljava/lang/Object;)V

    sput-object v0, Li/i;->m:Li/i;

    new-instance v0, Li/i;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Li/i;-><init>(Ljava/lang/Object;)V

    sput-object v0, Li/i;->n:Li/i;

    new-instance v0, Li/i;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Li/i;-><init>(Ljava/lang/Object;)V

    sput-object v0, Li/i;->o:Li/i;

    new-instance v0, Li/i;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li/i;-><init>(Z)V

    sput-object v0, Li/i;->p:Li/i;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li/i;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li/i;->h:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li/i;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li/i;->h:Ljava/util/List;

    invoke-virtual {p0, p1}, Li/i;->G(Ljava/lang/Object;)Z

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li/i;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li/i;->h:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Li/i;->E()Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Li/i;->G(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private D()V
    .locals 3

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Li/i;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v2, p0}, Li/g;->a(Li/i;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    throw v1

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Li/i;->h:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public static H(Ljava/util/Collection;)Li/i;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Li/i<",
            "*>;>;)",
            "Li/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    invoke-static {p0}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v6, Li/j;

    invoke-direct {v6}, Li/j;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/lang/Object;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v9, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {v10, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Li/i;

    new-instance v12, Li/i$l;

    move-object v0, v12

    move-object v1, v8

    move-object v2, v7

    move-object v3, v10

    move-object v4, v9

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Li/i$l;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicInteger;Li/j;)V

    invoke-virtual {v11, v12}, Li/i;->i(Li/g;)Li/i;

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Li/j;->a()Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static I(Ljava/util/Collection;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Li/i<",
            "TTResult;>;>;)",
            "Li/i<",
            "Ljava/util/List<",
            "TTResult;>;>;"
        }
    .end annotation

    invoke-static {p0}, Li/i;->H(Ljava/util/Collection;)Li/i;

    move-result-object v0

    new-instance v1, Li/i$k;

    invoke-direct {v1, p0}, Li/i$k;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Li/i;->y(Li/g;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static J(Ljava/util/Collection;)Li/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Li/i<",
            "TTResult;>;>;)",
            "Li/i<",
            "Li/i<",
            "TTResult;>;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    invoke-static {p0}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li/i;

    new-instance v3, Li/i$j;

    invoke-direct {v3, v1, v0}, Li/i$j;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Li/j;)V

    invoke-virtual {v2, v3}, Li/i;->i(Li/g;)Li/i;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Li/i;->h(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V

    return-void
.end method

.method static synthetic b(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Li/i;->g(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V

    return-void
.end method

.method public static c(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Li/i<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Li/i;->d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Li/d;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")",
            "Li/i<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    :try_start_0
    new-instance v1, Li/i$i;

    invoke-direct {v1, p2, v0, p0}, Li/i$i;-><init>(Li/d;Li/j;Ljava/util/concurrent/Callable;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Li/h;

    invoke-direct {p1, p0}, Li/h;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {v0, p1}, Li/j;->c(Ljava/lang/Exception;)V

    :goto_0
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/util/concurrent/Callable;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Li/i<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Li/i;->d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static f()Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">()",
            "Li/i<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Li/i;->p:Li/i;

    return-object v0
.end method

.method private static g(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            "TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/j<",
            "TTContinuationResult;>;",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;",
            "Li/i<",
            "TTResult;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")V"
        }
    .end annotation

    :try_start_0
    new-instance v0, Li/i$f;

    invoke-direct {v0, p4, p0, p1, p2}, Li/i$f;-><init>(Li/d;Li/j;Li/g;Li/i;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Li/h;

    invoke-direct {p2, p1}, Li/h;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {p0, p2}, Li/j;->c(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static h(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            "TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/j<",
            "TTContinuationResult;>;",
            "Li/g<",
            "TTResult;TTContinuationResult;>;",
            "Li/i<",
            "TTResult;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")V"
        }
    .end annotation

    :try_start_0
    new-instance v0, Li/i$e;

    invoke-direct {v0, p4, p0, p1, p2}, Li/i$e;-><init>(Li/d;Li/j;Li/g;Li/i;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Li/h;

    invoke-direct {p2, p1}, Li/h;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {p0, p2}, Li/j;->c(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public static o(JLi/d;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Li/d;",
            ")",
            "Li/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Li/c;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Li/i;->p(JLjava/util/concurrent/ScheduledExecutorService;Li/d;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method static p(JLjava/util/concurrent/ScheduledExecutorService;Li/d;)Li/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Li/d;",
            ")",
            "Li/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Li/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Li/i;->f()Li/i;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_1

    const/4 p0, 0x0

    invoke-static {p0}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    new-instance v1, Li/i$g;

    invoke-direct {v1, v0}, Li/i$g;-><init>(Li/j;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p2, v1, p0, p1, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    if-eqz p3, :cond_2

    new-instance p1, Li/i$h;

    invoke-direct {p1, p0, v0}, Li/i$h;-><init>(Ljava/util/concurrent/ScheduledFuture;Li/j;)V

    invoke-virtual {p3, p1}, Li/d;->b(Ljava/lang/Runnable;)Li/e;

    :cond_2
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Exception;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Li/i<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    invoke-virtual {v0, p0}, Li/j;->c(Ljava/lang/Exception;)V

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static r(Ljava/lang/Object;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Li/i<",
            "TTResult;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Li/i;->m:Li/i;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Li/i;->n:Li/i;

    goto :goto_0

    :cond_1
    sget-object p0, Li/i;->o:Li/i;

    :goto_0
    return-object p0

    :cond_2
    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    invoke-virtual {v0, p0}, Li/j;->d(Ljava/lang/Object;)V

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static u()Li/i$m;
    .locals 1

    sget-object v0, Li/i;->l:Li/i$m;

    return-object v0
.end method


# virtual methods
.method public A(Li/g;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;)",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Li/i;->j:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p1, v0}, Li/i;->B(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public B(Li/g;Ljava/util/concurrent/Executor;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Li/i;->C(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public C(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Li/i$d;

    invoke-direct {v0, p0, p3, p1}, Li/i$d;-><init>(Li/i;Li/d;Li/g;)V

    invoke-virtual {p0, v0, p2}, Li/i;->m(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method E()Z
    .locals 3

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Li/i;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return v1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Li/i;->b:Z

    iput-boolean v1, p0, Li/i;->c:Z

    iget-object v2, p0, Li/i;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    invoke-direct {p0}, Li/i;->D()V

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method F(Ljava/lang/Exception;)Z
    .locals 3

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Li/i;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Li/i;->b:Z

    iput-object p1, p0, Li/i;->e:Ljava/lang/Exception;

    iput-boolean v2, p0, Li/i;->f:Z

    iget-object p1, p0, Li/i;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    invoke-direct {p0}, Li/i;->D()V

    iget-boolean p1, p0, Li/i;->f:Z

    if-nez p1, :cond_1

    invoke-static {}, Li/i;->u()Li/i$m;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p1, Li/k;

    invoke-direct {p1, p0}, Li/k;-><init>(Li/i;)V

    iput-object p1, p0, Li/i;->g:Li/k;

    :cond_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method G(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Li/i;->b:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Li/i;->b:Z

    iput-object p1, p0, Li/i;->d:Ljava/lang/Object;

    iget-object p1, p0, Li/i;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    invoke-direct {p0}, Li/i;->D()V

    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Li/g;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;TTContinuationResult;>;)",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Li/i;->j:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Li/i;->k(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public j(Li/g;Ljava/util/concurrent/Executor;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;TTContinuationResult;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Li/i;->k(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public k(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;TTContinuationResult;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v6, Li/j;

    invoke-direct {v6}, Li/j;-><init>()V

    iget-object v7, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    invoke-virtual {p0}, Li/i;->w()Z

    move-result v8

    if-nez v8, :cond_0

    iget-object v9, p0, Li/i;->h:Ljava/util/List;

    new-instance v10, Li/i$a;

    move-object v0, v10

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Li/i$a;-><init>(Li/i;Li/j;Li/g;Ljava/util/concurrent/Executor;Li/d;)V

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_1

    invoke-static {v6, p1, p0, p2, p3}, Li/i;->h(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V

    :cond_1
    invoke-virtual {v6}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public l(Li/g;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;)",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Li/i;->j:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Li/i;->n(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public m(Li/g;Ljava/util/concurrent/Executor;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Li/i;->n(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public n(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;",
            "Li/i<",
            "TTContinuationResult;>;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v6, Li/j;

    invoke-direct {v6}, Li/j;-><init>()V

    iget-object v7, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    invoke-virtual {p0}, Li/i;->w()Z

    move-result v8

    if-nez v8, :cond_0

    iget-object v9, p0, Li/i;->h:Ljava/util/List;

    new-instance v10, Li/i$b;

    move-object v0, v10

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Li/i$b;-><init>(Li/i;Li/j;Li/g;Ljava/util/concurrent/Executor;Li/d;)V

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_1

    invoke-static {v6, p1, p0, p2, p3}, Li/i;->g(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V

    :cond_1
    invoke-virtual {v6}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public s()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Li/i;->e:Ljava/lang/Exception;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Li/i;->f:Z

    iget-object v1, p0, Li/i;->g:Li/k;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Li/k;->a()V

    const/4 v1, 0x0

    iput-object v1, p0, Li/i;->g:Li/k;

    :cond_0
    iget-object v1, p0, Li/i;->e:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public t()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Li/i;->d:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public v()Z
    .locals 2

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Li/i;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Li/i;->b:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public x()Z
    .locals 2

    iget-object v0, p0, Li/i;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Li/i;->s()Ljava/lang/Exception;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public y(Li/g;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;TTContinuationResult;>;)",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Li/i;->j:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Li/i;->z(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public z(Li/g;Ljava/util/concurrent/Executor;Li/d;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Li/g<",
            "TTResult;TTContinuationResult;>;",
            "Ljava/util/concurrent/Executor;",
            "Li/d;",
            ")",
            "Li/i<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Li/i$c;

    invoke-direct {v0, p0, p3, p1}, Li/i$c;-><init>(Li/i;Li/d;Li/g;)V

    invoke-virtual {p0, v0, p2}, Li/i;->m(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p1

    return-object p1
.end method
