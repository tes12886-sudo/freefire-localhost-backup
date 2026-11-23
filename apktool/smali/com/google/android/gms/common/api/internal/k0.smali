.class final Lcom/google/android/gms/common/api/internal/k0;
.super Lj/d/a/c/g/b/d;
.source ""


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/p0;)V
    .locals 1

    invoke-direct {p0}, Lj/d/a/c/g/b/d;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/k0;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final g0(Lj/d/a/c/g/b/l;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/k0;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/p0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/p0;->t(Lcom/google/android/gms/common/api/internal/p0;)Lcom/google/android/gms/common/api/internal/b1;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/common/api/internal/j0;

    invoke-direct {v2, p0, v0, v0, p1}, Lcom/google/android/gms/common/api/internal/j0;-><init>(Lcom/google/android/gms/common/api/internal/k0;Lcom/google/android/gms/common/api/internal/y0;Lcom/google/android/gms/common/api/internal/p0;Lj/d/a/c/g/b/l;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/b1;->q(Lcom/google/android/gms/common/api/internal/z0;)V

    return-void
.end method
