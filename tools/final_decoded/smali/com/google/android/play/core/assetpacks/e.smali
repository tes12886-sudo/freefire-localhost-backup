.class final Lcom/google/android/play/core/assetpacks/e;
.super Lj/d/a/d/a/b/g;
.source ""


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I

.field final synthetic f:Lj/d/a/d/a/f/p;

.field final synthetic g:Lcom/google/android/play/core/assetpacks/o;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/o;Lj/d/a/d/a/f/p;ILjava/lang/String;Ljava/lang/String;ILj/d/a/d/a/f/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/e;->g:Lcom/google/android/play/core/assetpacks/o;

    iput p3, p0, Lcom/google/android/play/core/assetpacks/e;->b:I

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/e;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/play/core/assetpacks/e;->d:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/play/core/assetpacks/e;->e:I

    iput-object p7, p0, Lcom/google/android/play/core/assetpacks/e;->f:Lj/d/a/d/a/f/p;

    invoke-direct {p0, p2}, Lj/d/a/d/a/b/g;-><init>(Lj/d/a/d/a/f/p;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/e;->g:Lcom/google/android/play/core/assetpacks/o;

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/o;->n(Lcom/google/android/play/core/assetpacks/o;)Lj/d/a/d/a/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lj/d/a/d/a/b/p;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lj/d/a/d/a/b/o0;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/e;->g:Lcom/google/android/play/core/assetpacks/o;

    invoke-static {v1}, Lcom/google/android/play/core/assetpacks/o;->l(Lcom/google/android/play/core/assetpacks/o;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/play/core/assetpacks/e;->b:I

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/e;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/e;->d:Ljava/lang/String;

    iget v5, p0, Lcom/google/android/play/core/assetpacks/e;->e:I

    invoke-static {v2, v3, v4, v5}, Lcom/google/android/play/core/assetpacks/o;->q(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, Lcom/google/android/play/core/assetpacks/o;->p()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/assetpacks/j;

    iget-object v5, p0, Lcom/google/android/play/core/assetpacks/e;->g:Lcom/google/android/play/core/assetpacks/o;

    iget-object v6, p0, Lcom/google/android/play/core/assetpacks/e;->f:Lj/d/a/d/a/f/p;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/play/core/assetpacks/j;-><init>(Lcom/google/android/play/core/assetpacks/o;Lj/d/a/d/a/f/p;[C)V

    invoke-interface {v0, v1, v2, v3, v4}, Lj/d/a/d/a/b/o0;->S0(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lj/d/a/d/a/b/q0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/assetpacks/o;->o()Lj/d/a/d/a/b/f;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyChunkTransferred"

    invoke-virtual {v1, v0, v3, v2}, Lj/d/a/d/a/b/f;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
