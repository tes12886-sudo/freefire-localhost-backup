.class final Lcom/google/android/play/core/assetpacks/h2;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final e:Lj/d/a/d/a/b/f;


# instance fields
.field private final a:Lcom/google/android/play/core/assetpacks/v;

.field private final b:Lj/d/a/d/a/b/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/a/d/a/b/e0<",
            "Lcom/google/android/play/core/assetpacks/s2;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/play/core/assetpacks/s;

.field private final d:Lj/d/a/d/a/b/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/a/d/a/b/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/a/d/a/b/f;

    const-string v1, "AssetPackManager"

    invoke-direct {v0, v1}, Lj/d/a/d/a/b/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/play/core/assetpacks/h2;->e:Lj/d/a/d/a/b/f;

    return-void
.end method

.method constructor <init>(Lcom/google/android/play/core/assetpacks/v;Lj/d/a/d/a/b/e0;Lcom/google/android/play/core/assetpacks/s;Lj/d/a/d/a/e/a;Lcom/google/android/play/core/assetpacks/a1;Lcom/google/android/play/core/assetpacks/o0;Lcom/google/android/play/core/assetpacks/e0;Lj/d/a/d/a/b/e0;Lcom/google/android/play/core/common/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/assetpacks/v;",
            "Lj/d/a/d/a/b/e0<",
            "Lcom/google/android/play/core/assetpacks/s2;",
            ">;",
            "Lcom/google/android/play/core/assetpacks/s;",
            "Lj/d/a/d/a/e/a;",
            "Lcom/google/android/play/core/assetpacks/a1;",
            "Lcom/google/android/play/core/assetpacks/o0;",
            "Lcom/google/android/play/core/assetpacks/e0;",
            "Lj/d/a/d/a/b/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lcom/google/android/play/core/common/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/h2;->a:Lcom/google/android/play/core/assetpacks/v;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/h2;->b:Lj/d/a/d/a/b/e0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/h2;->c:Lcom/google/android/play/core/assetpacks/s;

    iput-object p8, p0, Lcom/google/android/play/core/assetpacks/h2;->d:Lj/d/a/d/a/b/e0;

    return-void
.end method

.method static final synthetic d(Ljava/lang/Exception;)V
    .locals 3

    sget-object v0, Lcom/google/android/play/core/assetpacks/h2;->e:Lj/d/a/d/a/b/f;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Could not sync active asset packs. %s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Lj/d/a/d/a/b/f;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final e()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h2;->d:Lj/d/a/d/a/b/e0;

    invoke-interface {v0}, Lj/d/a/d/a/b/e0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/play/core/assetpacks/e2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/play/core/assetpacks/e2;-><init>(Lcom/google/android/play/core/assetpacks/h2;[B)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method final a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h2;->c:Lcom/google/android/play/core/assetpacks/s;

    invoke-virtual {v0}, Lj/d/a/d/a/c/c;->e()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/h2;->c:Lcom/google/android/play/core/assetpacks/s;

    invoke-virtual {v1, p1}, Lj/d/a/d/a/c/c;->c(Z)V

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/play/core/assetpacks/h2;->e()V

    :cond_0
    return-void
.end method

.method final synthetic b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h2;->a:Lcom/google/android/play/core/assetpacks/v;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/v;->I()V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h2;->a:Lcom/google/android/play/core/assetpacks/v;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/v;->F()V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h2;->a:Lcom/google/android/play/core/assetpacks/v;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/v;->J()V

    return-void
.end method

.method final synthetic c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h2;->b:Lj/d/a/d/a/b/e0;

    invoke-interface {v0}, Lj/d/a/d/a/b/e0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/assetpacks/s2;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/h2;->a:Lcom/google/android/play/core/assetpacks/v;

    invoke-virtual {v1}, Lcom/google/android/play/core/assetpacks/v;->q()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/play/core/assetpacks/s2;->e(Ljava/util/Map;)Lj/d/a/d/a/f/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/h2;->d:Lj/d/a/d/a/b/e0;

    invoke-interface {v1}, Lj/d/a/d/a/b/e0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/h2;->a:Lcom/google/android/play/core/assetpacks/v;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/android/play/core/assetpacks/f2;->a(Lcom/google/android/play/core/assetpacks/v;)Lj/d/a/d/a/f/c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lj/d/a/d/a/f/e;->c(Ljava/util/concurrent/Executor;Lj/d/a/d/a/f/c;)Lj/d/a/d/a/f/e;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/h2;->d:Lj/d/a/d/a/b/e0;

    invoke-interface {v1}, Lj/d/a/d/a/b/e0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    sget-object v2, Lcom/google/android/play/core/assetpacks/g2;->a:Lj/d/a/d/a/f/b;

    invoke-virtual {v0, v1, v2}, Lj/d/a/d/a/f/e;->b(Ljava/util/concurrent/Executor;Lj/d/a/d/a/f/b;)Lj/d/a/d/a/f/e;

    return-void
.end method
