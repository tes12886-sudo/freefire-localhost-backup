.class public final Lcom/google/android/gms/common/api/internal/a3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/e$b;
.implements Lcom/google/android/gms/common/api/e$c;


# instance fields
.field public final a:Lcom/google/android/gms/common/api/a;

.field private final b:Z

.field private c:Lcom/google/android/gms/common/api/internal/b3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a3;->a:Lcom/google/android/gms/common/api/a;

    iput-boolean p2, p0, Lcom/google/android/gms/common/api/internal/a3;->b:Z

    return-void
.end method

.method private final b()Lcom/google/android/gms/common/api/internal/b3;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a3;->c:Lcom/google/android/gms/common/api/internal/b3;

    const-string v1, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/q;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a3;->c:Lcom/google/android/gms/common/api/internal/b3;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/internal/b3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a3;->c:Lcom/google/android/gms/common/api/internal/b3;

    return-void
.end method

.method public final j(I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/a3;->b()Lcom/google/android/gms/common/api/internal/b3;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/f;->j(I)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/a3;->b()Lcom/google/android/gms/common/api/internal/b3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a3;->a:Lcom/google/android/gms/common/api/a;

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/a3;->b:Z

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/common/api/internal/b3;->c1(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;Z)V

    return-void
.end method

.method public final o(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/a3;->b()Lcom/google/android/gms/common/api/internal/b3;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/f;->o(Landroid/os/Bundle;)V

    return-void
.end method
