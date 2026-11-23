.class final Lcom/google/android/gms/measurement/internal/l7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/k7;

.field final synthetic c:Lcom/google/android/gms/measurement/internal/k7;

.field final synthetic d:J

.field final synthetic e:Lcom/google/android/gms/measurement/internal/r7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r7;Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/k7;Lcom/google/android/gms/measurement/internal/k7;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/l7;->e:Lcom/google/android/gms/measurement/internal/r7;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/l7;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/l7;->b:Lcom/google/android/gms/measurement/internal/k7;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/l7;->c:Lcom/google/android/gms/measurement/internal/k7;

    iput-wide p5, p0, Lcom/google/android/gms/measurement/internal/l7;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/l7;->e:Lcom/google/android/gms/measurement/internal/r7;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/l7;->a:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/l7;->b:Lcom/google/android/gms/measurement/internal/k7;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/l7;->c:Lcom/google/android/gms/measurement/internal/k7;

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/l7;->d:J

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/r7;->E(Lcom/google/android/gms/measurement/internal/r7;Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/k7;Lcom/google/android/gms/measurement/internal/k7;J)V

    return-void
.end method
