.class public final Lcom/facebook/d0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/d0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/d0;
    .locals 3

    invoke-static {}, Lcom/facebook/d0;->a()Lcom/facebook/d0;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/facebook/d0;->a()Lcom/facebook/d0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lh/q/a/a;->b(Landroid/content/Context;)Lh/q/a/a;

    move-result-object v0

    const-string v1, "LocalBroadcastManager.ge\u2026tance(applicationContext)"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/facebook/d0;

    new-instance v2, Lcom/facebook/c0;

    invoke-direct {v2}, Lcom/facebook/c0;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/facebook/d0;-><init>(Lh/q/a/a;Lcom/facebook/c0;)V

    invoke-static {v1}, Lcom/facebook/d0;->b(Lcom/facebook/d0;)V

    :cond_0
    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :goto_0
    invoke-static {}, Lcom/facebook/d0;->a()Lcom/facebook/d0;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
