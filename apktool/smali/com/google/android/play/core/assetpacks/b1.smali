.class public final Lcom/google/android/play/core/assetpacks/b1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/d/a/b/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/a/d/a/b/h0<",
        "Lcom/google/android/play/core/assetpacks/a1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/a/d/a/b/h0;

.field private final b:Lj/d/a/d/a/b/h0;

.field private final c:Lj/d/a/d/a/b/h0;

.field private final d:Lj/d/a/d/a/b/h0;

.field private final synthetic e:I


# direct methods
.method public constructor <init>(Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/v;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/s2;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/o0;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/play/core/assetpacks/b1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/b1;->a:Lj/d/a/d/a/b/h0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/b1;->b:Lj/d/a/d/a/b/h0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/b1;->c:Lj/d/a/d/a/b/h0;

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/b1;->d:Lj/d/a/d/a/b/h0;

    return-void
.end method

.method public constructor <init>(Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/v;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/s2;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/s;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/o0;",
            ">;[B)V"
        }
    .end annotation

    const/4 p5, 0x1

    iput p5, p0, Lcom/google/android/play/core/assetpacks/b1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/b1;->a:Lj/d/a/d/a/b/h0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/b1;->b:Lj/d/a/d/a/b/h0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/b1;->c:Lj/d/a/d/a/b/h0;

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/b1;->d:Lj/d/a/d/a/b/h0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcom/google/android/play/core/assetpacks/b1;->e:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/b1;->a:Lj/d/a/d/a/b/h0;

    invoke-interface {v0}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/b1;->b:Lj/d/a/d/a/b/h0;

    invoke-static {v1}, Lj/d/a/d/a/b/g0;->c(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/b/e0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/b1;->c:Lj/d/a/d/a/b/h0;

    invoke-static {v2}, Lj/d/a/d/a/b/g0;->c(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/b/e0;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/b1;->d:Lj/d/a/d/a/b/h0;

    invoke-interface {v3}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/assetpacks/j0;

    check-cast v0, Lcom/google/android/play/core/assetpacks/v;

    check-cast v3, Lcom/google/android/play/core/assetpacks/o0;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/play/core/assetpacks/j0;-><init>(Lcom/google/android/play/core/assetpacks/v;Lj/d/a/d/a/b/e0;Lj/d/a/d/a/b/e0;Lcom/google/android/play/core/assetpacks/o0;)V

    return-object v4

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/b1;->a:Lj/d/a/d/a/b/h0;

    invoke-interface {v0}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/b1;->b:Lj/d/a/d/a/b/h0;

    invoke-static {v1}, Lj/d/a/d/a/b/g0;->c(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/b/e0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/b1;->c:Lj/d/a/d/a/b/h0;

    invoke-interface {v2}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/b1;->d:Lj/d/a/d/a/b/h0;

    invoke-static {v3}, Lj/d/a/d/a/b/g0;->c(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/b/e0;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/assetpacks/a1;

    check-cast v0, Lcom/google/android/play/core/assetpacks/v;

    check-cast v2, Lcom/google/android/play/core/assetpacks/o0;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/play/core/assetpacks/a1;-><init>(Lcom/google/android/play/core/assetpacks/v;Lj/d/a/d/a/b/e0;Lcom/google/android/play/core/assetpacks/o0;Lj/d/a/d/a/b/e0;)V

    return-object v4
.end method
