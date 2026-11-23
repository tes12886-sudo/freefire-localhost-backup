.class public Lcom/beetalk/sdk/z/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/z/e$g;,
        Lcom/beetalk/sdk/z/e$k;,
        Lcom/beetalk/sdk/z/e$j;,
        Lcom/beetalk/sdk/z/e$f;,
        Lcom/beetalk/sdk/z/e$m;,
        Lcom/beetalk/sdk/z/e$h;,
        Lcom/beetalk/sdk/z/e$i;,
        Lcom/beetalk/sdk/z/e$l;
    }
.end annotation


# instance fields
.field private final a:Lcom/beetalk/sdk/z/e$f;

.field private final b:Lcom/beetalk/sdk/z/e$k;

.field private final c:Lcom/beetalk/sdk/z/e$g;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/z/d;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beetalk/sdk/z/e$k;",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/z/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/beetalk/sdk/z/e;-><init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/List;Ljava/util/Map;Lcom/beetalk/sdk/z/e$f;)V

    return-void
.end method

.method public constructor <init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/List;Ljava/util/Map;Lcom/beetalk/sdk/z/e$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beetalk/sdk/z/e$k;",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/z/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beetalk/sdk/z/e$f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/beetalk/sdk/z/e;->b:Lcom/beetalk/sdk/z/e$k;

    iput-object p2, p0, Lcom/beetalk/sdk/z/e;->d:Ljava/util/List;

    iput-object p3, p0, Lcom/beetalk/sdk/z/e;->e:Ljava/util/Map;

    sget-object p1, Lcom/beetalk/sdk/z/e$g;->a:Lcom/beetalk/sdk/z/e$g;

    iput-object p1, p0, Lcom/beetalk/sdk/z/e;->c:Lcom/beetalk/sdk/z/e$g;

    iput-object p4, p0, Lcom/beetalk/sdk/z/e;->a:Lcom/beetalk/sdk/z/e$f;

    return-void
.end method

.method public constructor <init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beetalk/sdk/z/e$k;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/beetalk/sdk/z/e;-><init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/Map;Lcom/beetalk/sdk/z/e$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/beetalk/sdk/z/e$k;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beetalk/sdk/z/e$f;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/beetalk/sdk/z/e;-><init>(Lcom/beetalk/sdk/z/e$k;Ljava/util/List;Ljava/util/Map;Lcom/beetalk/sdk/z/e$f;)V

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$f;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/z/e;->a:Lcom/beetalk/sdk/z/e$f;

    return-object p0
.end method

.method static synthetic b(Lcom/beetalk/sdk/z/e;Ljava/lang/String;)Lcom/beetalk/sdk/z/e$j;
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/z/e;->j(Ljava/lang/String;)Lcom/beetalk/sdk/z/e$j;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$k;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/z/e;->b:Lcom/beetalk/sdk/z/e$k;

    return-object p0
.end method

.method static synthetic d(Lcom/beetalk/sdk/z/e;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/z/e;->e:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic e(Lcom/beetalk/sdk/z/e;)Lcom/beetalk/sdk/z/e$g;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/z/e;->c:Lcom/beetalk/sdk/z/e$g;

    return-object p0
.end method

.method static synthetic f(Lcom/beetalk/sdk/z/e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/z/e;->d:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g(Lcom/beetalk/sdk/z/e;)Lorg/json/JSONObject;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/z/e;->f:Lorg/json/JSONObject;

    return-object p0
.end method

.method private j(Ljava/lang/String;)Lcom/beetalk/sdk/z/e$j;
    .locals 5

    sget-object v0, Li/i;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/beetalk/sdk/z/e$d;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/z/e$d;-><init>(Lcom/beetalk/sdk/z/e;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    const-wide/16 v0, 0x2710

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, p1

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    const/4 v2, 0x1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_1
    new-instance p1, Lcom/beetalk/sdk/z/e$j;

    invoke-direct {p1, v3, v2}, Lcom/beetalk/sdk/z/e$j;-><init>(Lorg/json/JSONObject;Z)V

    return-object p1
.end method


# virtual methods
.method public h(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/beetalk/sdk/z/e$c;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/z/e$c;-><init>(Lcom/beetalk/sdk/z/e;Ljava/lang/String;)V

    invoke-static {v0}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p1

    new-instance v0, Lcom/beetalk/sdk/z/e$b;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/e$b;-><init>(Lcom/beetalk/sdk/z/e;)V

    sget-object v1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p1

    new-instance v0, Lcom/beetalk/sdk/z/e$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/z/e$a;-><init>(Lcom/beetalk/sdk/z/e;)V

    invoke-virtual {p1, v0}, Li/i;->i(Li/g;)Li/i;

    return-void
.end method

.method public i(Ljava/lang/String;)Lcom/beetalk/sdk/z/e$m;
    .locals 3

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/z/e;->j(Ljava/lang/String;)Lcom/beetalk/sdk/z/e$j;

    move-result-object p1

    new-instance v0, Lcom/beetalk/sdk/z/e$m;

    iget-object v1, p1, Lcom/beetalk/sdk/z/e$j;->b:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    iget-boolean p1, p1, Lcom/beetalk/sdk/z/e$j;->a:Z

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/beetalk/sdk/z/e$m;-><init>(Ljava/lang/String;ZLcom/beetalk/sdk/z/e$a;)V

    return-object v0
.end method
