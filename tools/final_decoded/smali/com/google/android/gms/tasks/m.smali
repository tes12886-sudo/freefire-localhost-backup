.class final Lcom/google/android/gms/tasks/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/n;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tasks/m;->a:Lcom/google/android/gms/tasks/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tasks/m;->a:Lcom/google/android/gms/tasks/n;

    invoke-static {v0}, Lcom/google/android/gms/tasks/n;->d(Lcom/google/android/gms/tasks/n;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/tasks/m;->a:Lcom/google/android/gms/tasks/n;

    invoke-static {v1}, Lcom/google/android/gms/tasks/n;->c(Lcom/google/android/gms/tasks/n;)Lcom/google/android/gms/tasks/OnCanceledListener;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/tasks/n;->c(Lcom/google/android/gms/tasks/n;)Lcom/google/android/gms/tasks/OnCanceledListener;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/tasks/OnCanceledListener;->onCanceled()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
