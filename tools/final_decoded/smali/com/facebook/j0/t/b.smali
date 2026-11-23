.class public final Lcom/facebook/j0/t/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/facebook/j0/t/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/j0/t/b;

    invoke-direct {v0}, Lcom/facebook/j0/t/b;-><init>()V

    sput-object v0, Lcom/facebook/j0/t/b;->a:Lcom/facebook/j0/t/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/j0/t/b;)V
    .locals 2

    const-class v0, Lcom/facebook/j0/t/b;

    invoke-static {v0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/j0/t/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private final b()V
    .locals 3

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/j0/t/c;->x:Lcom/facebook/j0/t/c$b;

    invoke-virtual {v0}, Lcom/facebook/j0/t/c$b;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/j0/t/c$b;->e()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/j0/t/e;->e(Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v0}, Lcom/facebook/j0/t/c$b;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/facebook/j0/t/b;

    invoke-static {v0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "context"

    invoke-static {p0, v1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.android.billingclient.api.Purchase"

    invoke-static {v1}, Lcom/facebook/j0/t/h;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lcom/facebook/j0/t/c;->x:Lcom/facebook/j0/t/c$b;

    invoke-virtual {v1, p0}, Lcom/facebook/j0/t/c$b;->c(Landroid/content/Context;)Lcom/facebook/j0/t/c;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {v1}, Lcom/facebook/j0/t/c$b;->f()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/facebook/j0/t/e;->d()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "inapp"

    if-eqz v1, :cond_2

    :try_start_1
    sget-object v1, Lcom/facebook/j0/t/b$a;->a:Lcom/facebook/j0/t/b$a;

    invoke-virtual {p0, v2, v1}, Lcom/facebook/j0/t/c;->p(Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/facebook/j0/t/b$b;->a:Lcom/facebook/j0/t/b$b;

    invoke-virtual {p0, v2, v1}, Lcom/facebook/j0/t/c;->o(Ljava/lang/String;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_0
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
