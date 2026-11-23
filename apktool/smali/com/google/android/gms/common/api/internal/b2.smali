.class final Lcom/google/android/gms/common/api/internal/b2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lj/d/a/c/g/b/l;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/d2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/d2;Lj/d/a/c/g/b/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/b2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/b2;->a:Lj/d/a/c/g/b/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/b2;->b:Lcom/google/android/gms/common/api/internal/d2;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/b2;->a:Lj/d/a/c/g/b/l;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/d2;->r1(Lcom/google/android/gms/common/api/internal/d2;Lj/d/a/c/g/b/l;)V

    return-void
.end method
