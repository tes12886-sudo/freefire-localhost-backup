.class public Lcom/beetalk/sdk/z/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile b:Lcom/beetalk/sdk/z/a;


# instance fields
.field private a:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/z/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static a()Lcom/beetalk/sdk/z/a;
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/z/a;->b:Lcom/beetalk/sdk/z/a;

    if-nez v0, :cond_1

    const-class v0, Lcom/beetalk/sdk/z/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/z/a;->b:Lcom/beetalk/sdk/z/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/beetalk/sdk/z/a;

    invoke-direct {v1}, Lcom/beetalk/sdk/z/a;-><init>()V

    sput-object v1, Lcom/beetalk/sdk/z/a;->b:Lcom/beetalk/sdk/z/a;

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
    sget-object v0, Lcom/beetalk/sdk/z/a;->b:Lcom/beetalk/sdk/z/a;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/z/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
