.class final Lcom/google/android/gms/internal/measurement/j2;
.super Lcom/google/android/gms/internal/measurement/s2;
.source ""


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/Object;

.field final synthetic g:Lcom/google/android/gms/internal/measurement/zzee;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzee;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/j2;->g:Lcom/google/android/gms/internal/measurement/zzee;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/j2;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/j2;->f:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/s2;-><init>(Lcom/google/android/gms/internal/measurement/zzee;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j2;->g:Lcom/google/android/gms/internal/measurement/zzee;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzee;->m(Lcom/google/android/gms/internal/measurement/zzee;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/f1;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/j2;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j2;->f:Ljava/lang/Object;

    invoke-static {v0}, Lj/d/a/c/e/b;->c1(Ljava/lang/Object;)Lj/d/a/c/e/a;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, Lj/d/a/c/e/b;->c1(Ljava/lang/Object;)Lj/d/a/c/e/a;

    move-result-object v5

    invoke-static {v0}, Lj/d/a/c/e/b;->c1(Ljava/lang/Object;)Lj/d/a/c/e/a;

    move-result-object v6

    const/4 v2, 0x5

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/f1;->logHealthData(ILjava/lang/String;Lj/d/a/c/e/a;Lj/d/a/c/e/a;Lj/d/a/c/e/a;)V

    return-void
.end method
