.class Lcom/google/android/gms/measurement/internal/l9;
.super Lcom/google/android/gms/measurement/internal/u5;
.source ""

# interfaces
.implements Lcom/google/android/gms/measurement/internal/w5;


# instance fields
.field protected final b:Lcom/google/android/gms/measurement/internal/v9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v9;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/v9;->s()Lcom/google/android/gms/measurement/internal/a5;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/u5;-><init>(Lcom/google/android/gms/measurement/internal/a5;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/q;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/l9;->b:Lcom/google/android/gms/measurement/internal/v9;

    return-void
.end method
