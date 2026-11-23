.class final Lcom/google/android/gms/common/api/internal/e3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/internal/p1;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/internal/t;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/common/api/internal/t;Lcom/google/android/gms/common/api/internal/d3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/t;->x(Lcom/google/android/gms/common/api/internal/t;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->e:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {p1, v0}, Lcom/google/android/gms/common/api/internal/t;->t(Lcom/google/android/gms/common/api/internal/t;Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/t;->y(Lcom/google/android/gms/common/api/internal/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final b(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->z(Lcom/google/android/gms/common/api/internal/t;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->o(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->o(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->n()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/google/android/gms/common/api/internal/t;->v(Lcom/google/android/gms/common/api/internal/t;Z)V

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p2}, Lcom/google/android/gms/common/api/internal/t;->r(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/common/api/internal/b1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/common/api/internal/b1;->j(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/t;->v(Lcom/google/android/gms/common/api/internal/t;Z)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/common/api/internal/t;->w(Lcom/google/android/gms/common/api/internal/t;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p2}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final c(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/t;->t(Lcom/google/android/gms/common/api/internal/t;Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/t;->y(Lcom/google/android/gms/common/api/internal/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e3;->a:Lcom/google/android/gms/common/api/internal/t;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/t;->s(Lcom/google/android/gms/common/api/internal/t;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
