.class public Lcom/vk/sdk/k/i/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/i/b$e;,
        Lcom/vk/sdk/k/i/b$f;,
        Lcom/vk/sdk/k/i/b$d;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ExecutorService;

.field private static final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/vk/sdk/k/i/b;->a:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/vk/sdk/k/i/b;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lcom/vk/sdk/k/i/b;->b:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static b(Lcom/vk/sdk/k/i/c;)V
    .locals 2

    sget-object v0, Lcom/vk/sdk/k/i/b;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/vk/sdk/k/i/b$c;

    invoke-direct {v1, p0}, Lcom/vk/sdk/k/i/b$c;-><init>(Lcom/vk/sdk/k/i/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static c(Lcom/vk/sdk/k/i/a;)V
    .locals 2

    sget-object v0, Lcom/vk/sdk/k/i/b;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/vk/sdk/k/i/b$b;

    invoke-direct {v1, p0}, Lcom/vk/sdk/k/i/b$b;-><init>(Lcom/vk/sdk/k/i/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static d(Lcom/vk/sdk/k/i/b$d;)Lcom/vk/sdk/k/i/b$f;
    .locals 3

    new-instance v0, Lcom/vk/sdk/k/i/b$f;

    invoke-virtual {p0}, Lcom/vk/sdk/k/i/b$d;->b()Ljava/net/HttpURLConnection;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/vk/sdk/k/i/b$f;-><init>(Ljava/net/HttpURLConnection;Lcom/vk/sdk/k/i/b$e;)V

    iget-boolean p0, p0, Lcom/vk/sdk/k/i/b$d;->f:Z

    if-eqz p0, :cond_0

    return-object v2

    :cond_0
    return-object v0
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/io/File;)Lcom/vk/sdk/k/i/b$d;
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/i/b$d;

    invoke-direct {v0, p0}, Lcom/vk/sdk/k/i/b$d;-><init>(Ljava/lang/String;)V

    new-instance p0, Lcom/vk/sdk/k/i/g;

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/i/g;-><init>([Ljava/io/File;)V

    iput-object p0, v0, Lcom/vk/sdk/k/i/b$d;->d:Lcom/vk/sdk/k/i/g;

    return-object v0
.end method

.method private static f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/vk/sdk/k/i/b$a;

    invoke-direct {v0}, Lcom/vk/sdk/k/i/b$a;-><init>()V

    return-object v0
.end method

.method public static g(Lcom/vk/sdk/k/f;)Lcom/vk/sdk/k/i/b$d;
    .locals 5

    invoke-static {}, Lcom/vk/sdk/e;->b()Lcom/vk/sdk/e;

    move-result-object v0

    new-instance v1, Lcom/vk/sdk/k/i/b$d;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-boolean v4, p0, Lcom/vk/sdk/k/f;->r:Z

    if-nez v4, :cond_1

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/vk/sdk/e;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, "s"

    :goto_1
    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    iget-object v4, p0, Lcom/vk/sdk/k/f;->d:Ljava/lang/String;

    aput-object v4, v3, v0

    const-string v0, "http%s://api.vk.com/method/%s"

    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/vk/sdk/k/i/b$d;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/vk/sdk/k/i/b;->f()Ljava/util/Map;

    move-result-object v0

    iput-object v0, v1, Lcom/vk/sdk/k/i/b$d;->e:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/vk/sdk/k/f;->t()Lcom/vk/sdk/k/d;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/vk/sdk/k/i/b$d;->d(Lcom/vk/sdk/k/d;)V

    return-object v1
.end method
