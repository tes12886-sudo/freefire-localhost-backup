.class final Lcom/google/android/gms/common/internal/z/d;
.super Lcom/google/android/gms/common/internal/z/g;
.source ""


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/internal/z/f;Lcom/google/android/gms/common/api/e;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/common/internal/z/g;-><init>(Lcom/google/android/gms/common/api/e;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic r(Lcom/google/android/gms/common/api/a$b;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/common/internal/z/i;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->I()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/z/m;

    new-instance v0, Lcom/google/android/gms/common/internal/z/e;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/internal/z/e;-><init>(Lcom/google/android/gms/common/api/internal/e;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/internal/z/m;->c1(Lcom/google/android/gms/common/internal/z/l;)V

    return-void
.end method
