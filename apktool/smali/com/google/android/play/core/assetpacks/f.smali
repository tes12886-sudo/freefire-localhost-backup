.class final Lcom/google/android/play/core/assetpacks/f;
.super Lj/d/a/d/a/b/g;
.source ""


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lj/d/a/d/a/f/p;

.field final synthetic e:I

.field final synthetic f:Lcom/google/android/play/core/assetpacks/o;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/o;Lj/d/a/d/a/f/p;ILjava/lang/String;Lj/d/a/d/a/f/p;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/f;->f:Lcom/google/android/play/core/assetpacks/o;

    iput p3, p0, Lcom/google/android/play/core/assetpacks/f;->b:I

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/f;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/play/core/assetpacks/f;->d:Lj/d/a/d/a/f/p;

    iput p6, p0, Lcom/google/android/play/core/assetpacks/f;->e:I

    invoke-direct {p0, p2}, Lj/d/a/d/a/b/g;-><init>(Lj/d/a/d/a/f/p;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 11

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/f;->f:Lcom/google/android/play/core/assetpacks/o;

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/o;->n(Lcom/google/android/play/core/assetpacks/o;)Lj/d/a/d/a/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lj/d/a/d/a/b/p;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lj/d/a/d/a/b/o0;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/f;->f:Lcom/google/android/play/core/assetpacks/o;

    invoke-static {v1}, Lcom/google/android/play/core/assetpacks/o;->l(Lcom/google/android/play/core/assetpacks/o;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/play/core/assetpacks/f;->b:I

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/f;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/play/core/assetpacks/o;->r(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, Lcom/google/android/play/core/assetpacks/o;->p()Landroid/os/Bundle;

    move-result-object v3

    new-instance v10, Lcom/google/android/play/core/assetpacks/n;

    iget-object v5, p0, Lcom/google/android/play/core/assetpacks/f;->f:Lcom/google/android/play/core/assetpacks/o;

    iget-object v6, p0, Lcom/google/android/play/core/assetpacks/f;->d:Lj/d/a/d/a/f/p;

    iget v7, p0, Lcom/google/android/play/core/assetpacks/f;->b:I

    iget-object v8, p0, Lcom/google/android/play/core/assetpacks/f;->c:Ljava/lang/String;

    iget v9, p0, Lcom/google/android/play/core/assetpacks/f;->e:I

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lcom/google/android/play/core/assetpacks/n;-><init>(Lcom/google/android/play/core/assetpacks/o;Lj/d/a/d/a/f/p;ILjava/lang/String;I)V

    invoke-interface {v0, v1, v2, v3, v10}, Lj/d/a/d/a/b/o0;->y(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/assetpacks/o;->o()Lj/d/a/d/a/b/f;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyModuleCompleted"

    invoke-virtual {v1, v0, v3, v2}, Lj/d/a/d/a/b/f;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
