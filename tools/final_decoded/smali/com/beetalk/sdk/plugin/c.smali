.class public Lcom/beetalk/sdk/plugin/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile h:Lcom/beetalk/sdk/plugin/c;


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Ljava/lang/Thread;

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/beetalk/sdk/plugin/a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/beetalk/sdk/plugin/b;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/plugin/b;",
            ">;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->c:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->d:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->e:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->f:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->g:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/c;->a()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->a:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/plugin/c;->b:Ljava/lang/Thread;

    return-void
.end method

.method private a()V
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/h/a;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/h/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/b;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/c/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/g/b;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/g/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/g/a;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/g/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/c;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/c/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/e;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/c/e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/c/d;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/c/d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/d/b;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/d/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/d/a;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/d/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/d/c;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/d/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/h;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/h;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/i;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/i;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/f;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/f/a;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/f/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/d;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/b;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/c;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/g;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/e;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/i/e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/e/e/a;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/e/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/plugin/c;->h(Lcom/beetalk/sdk/plugin/a;)V

    return-void
.end method

.method static synthetic b(Lcom/beetalk/sdk/plugin/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/c;->d:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic c(Lcom/beetalk/sdk/plugin/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/c;->g:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic d(Lcom/beetalk/sdk/plugin/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/c;->c:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic e(Lcom/beetalk/sdk/plugin/c;Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/c;->j(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic f(Lcom/beetalk/sdk/plugin/c;Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/c;->i(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic g(Lcom/beetalk/sdk/plugin/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/plugin/c;->f:Ljava/util/HashMap;

    return-object p0
.end method

.method private i(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/c;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beetalk/sdk/plugin/b;

    invoke-interface {v0, p2}, Lcom/beetalk/sdk/plugin/b;->onPluginResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private j(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/c;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/plugin/b;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/beetalk/sdk/plugin/b;->onPluginResult(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static k()Lcom/beetalk/sdk/plugin/c;
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/plugin/c;->h:Lcom/beetalk/sdk/plugin/c;

    if-nez v0, :cond_1

    const-class v0, Lcom/beetalk/sdk/plugin/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/plugin/c;->h:Lcom/beetalk/sdk/plugin/c;

    if-nez v1, :cond_0

    new-instance v1, Lcom/beetalk/sdk/plugin/c;

    invoke-direct {v1}, Lcom/beetalk/sdk/plugin/c;-><init>()V

    sput-object v1, Lcom/beetalk/sdk/plugin/c;->h:Lcom/beetalk/sdk/plugin/c;

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
    sget-object v0, Lcom/beetalk/sdk/plugin/c;->h:Lcom/beetalk/sdk/plugin/c;

    return-object v0
.end method

.method private p(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/c;->b:Ljava/lang/Thread;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/plugin/c;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public h(Lcom/beetalk/sdk/plugin/a;)V
    .locals 3

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/c;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/c;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Plugin Already exists for Key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beetalk/sdk/plugin/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/c;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/plugin/a;

    return-object p1
.end method

.method public m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lcom/beetalk/sdk/plugin/b<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v6, Lcom/beetalk/sdk/plugin/c$a;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p4

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/beetalk/sdk/plugin/c$a;-><init>(Lcom/beetalk/sdk/plugin/c;Ljava/lang/String;Lcom/beetalk/sdk/plugin/b;Ljava/lang/Object;Landroid/app/Activity;)V

    invoke-direct {p0, v6}, Lcom/beetalk/sdk/plugin/c;->p(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/plugin/c$b;

    invoke-direct {v0, p0, p3, p2, p1}, Lcom/beetalk/sdk/plugin/c$b;-><init>(Lcom/beetalk/sdk/plugin/c;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/plugin/c;->p(Ljava/lang/Runnable;)V

    return-void
.end method

.method o(Lcom/beetalk/sdk/plugin/a;Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/c$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/beetalk/sdk/plugin/c$c;-><init>(Lcom/beetalk/sdk/plugin/c;Lcom/beetalk/sdk/plugin/a;Landroid/app/Activity;)V

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/plugin/c;->p(Ljava/lang/Runnable;)V

    return-void
.end method
