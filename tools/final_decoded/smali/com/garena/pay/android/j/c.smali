.class public Lcom/garena/pay/android/j/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile b:Lcom/garena/pay/android/j/c;


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/garena/pay/android/j/c;->a:Landroid/os/Handler;

    return-void
.end method

.method public static a()Lcom/garena/pay/android/j/c;
    .locals 2

    sget-object v0, Lcom/garena/pay/android/j/c;->b:Lcom/garena/pay/android/j/c;

    if-nez v0, :cond_1

    const-class v0, Lcom/garena/pay/android/j/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/garena/pay/android/j/c;->b:Lcom/garena/pay/android/j/c;

    if-nez v1, :cond_0

    new-instance v1, Lcom/garena/pay/android/j/c;

    invoke-direct {v1}, Lcom/garena/pay/android/j/c;-><init>()V

    sput-object v1, Lcom/garena/pay/android/j/c;->b:Lcom/garena/pay/android/j/c;

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
    sget-object v0, Lcom/garena/pay/android/j/c;->b:Lcom/garena/pay/android/j/c;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/j/c;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
