.class public final Lcom/google/android/play/core/assetpacks/e1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/d/a/b/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/a/d/a/b/h0<",
        "Lcom/google/android/play/core/assetpacks/d1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/a/d/a/b/h0;

.field private final b:Lj/d/a/d/a/b/h0;

.field private final c:Lj/d/a/d/a/b/h0;

.field private final synthetic d:I


# direct methods
.method public constructor <init>(Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/a1;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/v;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/c0;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/play/core/assetpacks/e1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/e1;->a:Lj/d/a/d/a/b/h0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/e1;->b:Lj/d/a/d/a/b/h0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/e1;->c:Lj/d/a/d/a/b/h0;

    return-void
.end method

.method public constructor <init>(Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;Lj/d/a/d/a/b/h0;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/h0<",
            "Landroid/content/Context;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/o;",
            ">;",
            "Lj/d/a/d/a/b/h0<",
            "Lcom/google/android/play/core/assetpacks/i1;",
            ">;[B)V"
        }
    .end annotation

    const/4 p4, 0x1

    iput p4, p0, Lcom/google/android/play/core/assetpacks/e1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/e1;->c:Lj/d/a/d/a/b/h0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/e1;->b:Lj/d/a/d/a/b/h0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/e1;->a:Lj/d/a/d/a/b/h0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcom/google/android/play/core/assetpacks/e1;->d:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/e1;->c:Lj/d/a/d/a/b/h0;

    check-cast v0, Lcom/google/android/play/core/assetpacks/o2;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/o2;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/e1;->b:Lj/d/a/d/a/b/h0;

    invoke-static {v1}, Lj/d/a/d/a/b/g0;->c(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/b/e0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/e1;->a:Lj/d/a/d/a/b/h0;

    invoke-static {v2}, Lj/d/a/d/a/b/g0;->c(Lj/d/a/d/a/b/h0;)Lj/d/a/d/a/b/e0;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/k2;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {v1}, Lj/d/a/d/a/b/e0;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lj/d/a/d/a/b/e0;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Lcom/google/android/play/core/assetpacks/s2;

    invoke-static {v0}, Lj/d/a/d/a/b/s;->d(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/e1;->a:Lj/d/a/d/a/b/h0;

    invoke-interface {v0}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/e1;->b:Lj/d/a/d/a/b/h0;

    invoke-interface {v1}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/e1;->c:Lj/d/a/d/a/b/h0;

    invoke-interface {v2}, Lj/d/a/d/a/b/h0;->a()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Lcom/google/android/play/core/assetpacks/d1;

    check-cast v0, Lcom/google/android/play/core/assetpacks/a1;

    check-cast v1, Lcom/google/android/play/core/assetpacks/v;

    check-cast v2, Lcom/google/android/play/core/assetpacks/c0;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/play/core/assetpacks/d1;-><init>(Lcom/google/android/play/core/assetpacks/a1;Lcom/google/android/play/core/assetpacks/v;Lcom/google/android/play/core/assetpacks/c0;)V

    return-object v3
.end method
