.class final Lcom/google/android/gms/common/api/internal/g2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/j;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/j2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/j2;Lcom/google/android/gms/common/api/j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/g2;->a:Lcom/google/android/gms/common/api/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->p:Ljava/lang/ThreadLocal;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-static {v2}, Lcom/google/android/gms/common/api/internal/j2;->b(Lcom/google/android/gms/common/api/internal/j2;)Lcom/google/android/gms/common/api/m;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/internal/q;->k(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/common/api/m;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/g2;->a:Lcom/google/android/gms/common/api/j;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/api/m;->b(Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/f;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-static {v3}, Lcom/google/android/gms/common/api/internal/j2;->c(Lcom/google/android/gms/common/api/internal/j2;)Lcom/google/android/gms/common/api/internal/h2;

    move-result-object v4

    invoke-static {v3}, Lcom/google/android/gms/common/api/internal/j2;->c(Lcom/google/android/gms/common/api/internal/j2;)Lcom/google/android/gms/common/api/internal/h2;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g2;->a:Lcom/google/android/gms/common/api/j;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/j2;->e(Lcom/google/android/gms/common/api/internal/j2;Lcom/google/android/gms/common/api/j;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/j2;->d(Lcom/google/android/gms/common/api/internal/j2;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/e;

    if-eqz v0, :cond_0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/e;->q(Lcom/google/android/gms/common/api/internal/j2;)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-static {v2}, Lcom/google/android/gms/common/api/internal/j2;->c(Lcom/google/android/gms/common/api/internal/j2;)Lcom/google/android/gms/common/api/internal/h2;

    move-result-object v3

    invoke-static {v2}, Lcom/google/android/gms/common/api/internal/j2;->c(Lcom/google/android/gms/common/api/internal/j2;)Lcom/google/android/gms/common/api/internal/h2;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->p:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g2;->a:Lcom/google/android/gms/common/api/j;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/j2;->e(Lcom/google/android/gms/common/api/internal/j2;Lcom/google/android/gms/common/api/j;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/j2;->d(Lcom/google/android/gms/common/api/internal/j2;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/e;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :goto_1
    sget-object v2, Lcom/google/android/gms/common/api/internal/BasePendingResult;->p:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g2;->a:Lcom/google/android/gms/common/api/j;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/api/internal/j2;->e(Lcom/google/android/gms/common/api/internal/j2;Lcom/google/android/gms/common/api/j;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/j2;->d(Lcom/google/android/gms/common/api/internal/j2;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/e;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g2;->b:Lcom/google/android/gms/common/api/internal/j2;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/e;->q(Lcom/google/android/gms/common/api/internal/j2;)V

    :goto_2
    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method
