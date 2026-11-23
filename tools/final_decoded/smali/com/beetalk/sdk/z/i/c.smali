.class public Lcom/beetalk/sdk/z/i/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Lcom/android/billingclient/api/Purchase;II)Li/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/android/billingclient/api/Purchase;",
            "II)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/beetalk/sdk/networking/model/CommitReq;->toParams(Lcom/android/billingclient/api/Purchase;II)Ljava/util/Map;

    move-result-object p0

    new-instance p1, Lcom/beetalk/sdk/z/i/c$m;

    invoke-direct {p1, p0}, Lcom/beetalk/sdk/z/i/c$m;-><init>(Ljava/util/Map;)V

    invoke-static {p1}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p0

    new-instance p1, Lcom/beetalk/sdk/z/i/c$k;

    invoke-direct {p1}, Lcom/beetalk/sdk/z/i/c$k;-><init>()V

    sget-object p2, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, p1, p2}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/Map;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/EventPricingResp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/i/c$e;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/i/c$e;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p0

    new-instance v0, Lcom/beetalk/sdk/z/i/c$d;

    invoke-direct {v0}, Lcom/beetalk/sdk/z/i/c$d;-><init>()V

    sget-object v1, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/Map;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/LessIsMoreEventsResp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/i/c$g;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/i/c$g;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p0

    new-instance v0, Lcom/beetalk/sdk/z/i/c$f;

    invoke-direct {v0}, Lcom/beetalk/sdk/z/i/c$f;-><init>()V

    sget-object v1, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/util/Map;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/RebatesResp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/i/c$o;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/i/c$o;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p0

    new-instance v0, Lcom/beetalk/sdk/z/i/c$n;

    invoke-direct {v0}, Lcom/beetalk/sdk/z/i/c$n;-><init>()V

    sget-object v1, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;Lcom/garena/pay/android/d;Ljava/util/Map;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/garena/pay/android/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/ChannelsResp;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/garena/pay/android/d;->c()Lcom/garena/pay/android/data/GGPayment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/garena/pay/android/data/GGPayment;->getApiVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Lcom/beetalk/sdk/z/i/c;->f(Lcom/garena/pay/android/d;Ljava/util/Map;)Li/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/beetalk/sdk/z/i/c$l;

    invoke-direct {v0, p2}, Lcom/beetalk/sdk/z/i/c$l;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p2

    new-instance v0, Lcom/beetalk/sdk/z/i/c$j;

    invoke-direct {v0, p1, p0}, Lcom/beetalk/sdk/z/i/c$j;-><init>(Lcom/garena/pay/android/d;Landroid/content/Context;)V

    sget-object p0, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p2, v0, p0}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lcom/garena/pay/android/d;Ljava/util/Map;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/garena/pay/android/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/ChannelsResp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/i/c$i;

    invoke-direct {v0, p1}, Lcom/beetalk/sdk/z/i/c$i;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p1

    new-instance v0, Lcom/beetalk/sdk/z/i/c$h;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/i/c$h;-><init>(Lcom/garena/pay/android/d;)V

    sget-object p0, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p1, v0, p0}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/Map;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/EventCancelResp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/i/c$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/i/c$a;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p0

    new-instance v0, Lcom/beetalk/sdk/z/i/c$p;

    invoke-direct {v0}, Lcom/beetalk/sdk/z/i/c$p;-><init>()V

    sget-object v1, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/util/Map;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/EventInitResp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/i/c$c;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/i/c$c;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p0

    new-instance v0, Lcom/beetalk/sdk/z/i/c$b;

    invoke-direct {v0}, Lcom/beetalk/sdk/z/i/c$b;-><init>()V

    sget-object v1, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lcom/beetalk/sdk/z/e$l;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beetalk/sdk/z/e$l;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/z/e;

    sget-object v1, Lcom/beetalk/sdk/z/e$k;->b:Lcom/beetalk/sdk/z/e$k;

    invoke-direct {v0, v1, p1, p0}, Lcom/beetalk/sdk/z/e;-><init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/Map;Lcom/beetalk/sdk/z/e$f;)V

    invoke-static {}, Lcom/beetalk/sdk/p;->G()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/beetalk/sdk/z/e;->h(Ljava/lang/String;)V

    return-void
.end method
