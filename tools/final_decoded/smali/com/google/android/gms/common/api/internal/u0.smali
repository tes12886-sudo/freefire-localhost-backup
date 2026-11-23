.class final Lcom/google/android/gms/common/api/internal/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/k;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/internal/q;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/common/api/e;

.field final synthetic d:Lcom/google/android/gms/common/api/internal/x0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/x0;Lcom/google/android/gms/common/api/internal/q;ZLcom/google/android/gms/common/api/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/u0;->d:Lcom/google/android/gms/common/api/internal/x0;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/u0;->a:Lcom/google/android/gms/common/api/internal/q;

    iput-boolean p3, p0, Lcom/google/android/gms/common/api/internal/u0;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/u0;->c:Lcom/google/android/gms/common/api/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/common/api/j;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u0;->d:Lcom/google/android/gms/common/api/internal/x0;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/x0;->u(Lcom/google/android/gms/common/api/internal/x0;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/c;->i()V

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u0;->d:Lcom/google/android/gms/common/api/internal/x0;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/x0;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u0;->d:Lcom/google/android/gms/common/api/internal/x0;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/x0;->g()V

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/x0;->f()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/u0;->a:Lcom/google/android/gms/common/api/internal/q;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->j(Lcom/google/android/gms/common/api/j;)V

    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/u0;->b:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/u0;->c:Lcom/google/android/gms/common/api/e;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/e;->g()V

    :cond_1
    return-void
.end method
