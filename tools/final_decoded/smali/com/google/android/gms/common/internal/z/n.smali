.class public final synthetic Lcom/google/android/gms/common/internal/z/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/internal/n;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/internal/u;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/internal/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/z/n;->a:Lcom/google/android/gms/common/internal/u;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/z/n;->a:Lcom/google/android/gms/common/internal/u;

    check-cast p1, Lcom/google/android/gms/common/internal/z/q;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget v1, Lcom/google/android/gms/common/internal/z/p;->n:I

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->I()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/z/j;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/internal/z/j;->c1(Lcom/google/android/gms/common/internal/u;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->c(Ljava/lang/Object;)V

    return-void
.end method
