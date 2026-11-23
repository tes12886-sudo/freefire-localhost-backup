.class final Lcom/google/android/gms/common/internal/z/e;
.super Lcom/google/android/gms/common/internal/z/b;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/e;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/z/b;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/z/e;->a:Lcom/google/android/gms/common/api/internal/e;

    return-void
.end method


# virtual methods
.method public final D0(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/z/e;->a:Lcom/google/android/gms/common/api/internal/e;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/e;->a(Ljava/lang/Object;)V

    return-void
.end method
