.class public Lj/g/a/a/a/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final f:Lj/g/a/a/a/h;

.field static volatile g:Lj/g/a/a/a/m;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/ExecutorService;

.field private final c:Lj/g/a/a/a/p;

.field private final d:Lj/g/a/a/a/y/a;

.field private final e:Lj/g/a/a/a/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/g/a/a/a/d;

    invoke-direct {v0}, Lj/g/a/a/a/d;-><init>()V

    sput-object v0, Lj/g/a/a/a/m;->f:Lj/g/a/a/a/h;

    return-void
.end method

.method private constructor <init>(Lj/g/a/a/a/s;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lj/g/a/a/a/s;->a:Landroid/content/Context;

    iput-object v0, p0, Lj/g/a/a/a/m;->a:Landroid/content/Context;

    new-instance v1, Lj/g/a/a/a/y/a;

    invoke-direct {v1, v0}, Lj/g/a/a/a/y/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lj/g/a/a/a/m;->d:Lj/g/a/a/a/y/a;

    iget-object v1, p1, Lj/g/a/a/a/s;->c:Lj/g/a/a/a/p;

    if-nez v1, :cond_0

    const-string v1, "com.twitter.sdk.android.CONSUMER_KEY"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lj/g/a/a/a/y/b;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "com.twitter.sdk.android.CONSUMER_SECRET"

    invoke-static {v0, v3, v2}, Lj/g/a/a/a/y/b;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lj/g/a/a/a/p;

    invoke-direct {v2, v1, v0}, Lj/g/a/a/a/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p0, Lj/g/a/a/a/m;->c:Lj/g/a/a/a/p;

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lj/g/a/a/a/m;->c:Lj/g/a/a/a/p;

    :goto_0
    iget-object v0, p1, Lj/g/a/a/a/s;->d:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    const-string v0, "twitter-worker"

    invoke-static {v0}, Lj/g/a/a/a/y/c;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lj/g/a/a/a/m;->b:Ljava/util/concurrent/ExecutorService;

    iget-object v0, p1, Lj/g/a/a/a/s;->b:Lj/g/a/a/a/h;

    if-nez v0, :cond_2

    sget-object v0, Lj/g/a/a/a/m;->f:Lj/g/a/a/a/h;

    :cond_2
    iput-object v0, p0, Lj/g/a/a/a/m;->e:Lj/g/a/a/a/h;

    iget-object p1, p1, Lj/g/a/a/a/s;->e:Ljava/lang/Boolean;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    :goto_1
    return-void
.end method

.method static a()V
    .locals 2

    sget-object v0, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must initialize Twitter before using getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static declared-synchronized b(Lj/g/a/a/a/s;)Lj/g/a/a/a/m;
    .locals 2

    const-class v0, Lj/g/a/a/a/m;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;

    if-nez v1, :cond_0

    new-instance v1, Lj/g/a/a/a/m;

    invoke-direct {v1, p0}, Lj/g/a/a/a/m;-><init>(Lj/g/a/a/a/s;)V

    sput-object v1, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;

    sget-object p0, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_0
    :try_start_1
    sget-object p0, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static f()Lj/g/a/a/a/m;
    .locals 1

    invoke-static {}, Lj/g/a/a/a/m;->a()V

    sget-object v0, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;

    return-object v0
.end method

.method public static g()Lj/g/a/a/a/h;
    .locals 1

    sget-object v0, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;

    if-nez v0, :cond_0

    sget-object v0, Lj/g/a/a/a/m;->f:Lj/g/a/a/a/h;

    return-object v0

    :cond_0
    sget-object v0, Lj/g/a/a/a/m;->g:Lj/g/a/a/a/m;

    iget-object v0, v0, Lj/g/a/a/a/m;->e:Lj/g/a/a/a/h;

    return-object v0
.end method

.method public static i(Lj/g/a/a/a/s;)V
    .locals 0

    invoke-static {p0}, Lj/g/a/a/a/m;->b(Lj/g/a/a/a/s;)Lj/g/a/a/a/m;

    return-void
.end method


# virtual methods
.method public c()Lj/g/a/a/a/y/a;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/m;->d:Lj/g/a/a/a/y/a;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Landroid/content/Context;
    .locals 4

    new-instance v0, Lj/g/a/a/a/t;

    iget-object v1, p0, Lj/g/a/a/a/m;->a:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ".TwitterKit"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lj/g/a/a/a/t;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public e()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/m;->b:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public h()Lj/g/a/a/a/p;
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/m;->c:Lj/g/a/a/a/p;

    return-object v0
.end method
