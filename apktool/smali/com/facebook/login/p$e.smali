.class Lcom/facebook/login/p$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# static fields
.field private static a:Lcom/facebook/login/o;


# direct methods
.method static synthetic a(Landroid/content/Context;)Lcom/facebook/login/o;
    .locals 0

    invoke-static {p0}, Lcom/facebook/login/p$e;->b(Landroid/content/Context;)Lcom/facebook/login/o;

    move-result-object p0

    return-object p0
.end method

.method private static declared-synchronized b(Landroid/content/Context;)Lcom/facebook/login/o;
    .locals 3

    const-class v0, Lcom/facebook/login/p$e;

    monitor-enter v0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    monitor-exit v0

    return-object p0

    :cond_1
    :try_start_1
    sget-object v1, Lcom/facebook/login/p$e;->a:Lcom/facebook/login/o;

    if-nez v1, :cond_2

    new-instance v1, Lcom/facebook/login/o;

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/facebook/login/o;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/facebook/login/p$e;->a:Lcom/facebook/login/o;

    :cond_2
    sget-object p0, Lcom/facebook/login/p$e;->a:Lcom/facebook/login/o;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
