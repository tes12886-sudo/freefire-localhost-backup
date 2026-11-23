.class final Lcom/google/android/gms/common/api/internal/q2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/e$c;


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/common/api/e;

.field public final c:Lcom/google/android/gms/common/api/e$c;

.field final synthetic d:Lcom/google/android/gms/common/api/internal/r2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/r2;ILcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/e$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q2;->d:Lcom/google/android/gms/common/api/internal/r2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/common/api/internal/q2;->a:I

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/q2;->b:Lcom/google/android/gms/common/api/e;

    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/q2;->c:Lcom/google/android/gms/common/api/e$c;

    return-void
.end method


# virtual methods
.method public final m(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "beginFailureResolution for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AutoManageHelper"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q2;->d:Lcom/google/android/gms/common/api/internal/r2;

    iget v1, p0, Lcom/google/android/gms/common/api/internal/q2;->a:I

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/w2;->s(Lcom/google/android/gms/common/ConnectionResult;I)V

    return-void
.end method
