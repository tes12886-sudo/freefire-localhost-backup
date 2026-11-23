.class Lcom/google/android/play/core/review/h;
.super Lj/d/a/d/a/b/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj/d/a/d/a/b/d;"
    }
.end annotation


# instance fields
.field final a:Lj/d/a/d/a/b/f;

.field final b:Lj/d/a/d/a/f/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/a/d/a/f/p<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/android/play/core/review/j;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/review/j;Lj/d/a/d/a/b/f;Lj/d/a/d/a/f/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/b/f;",
            "Lj/d/a/d/a/f/p<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/play/core/review/h;->c:Lcom/google/android/play/core/review/j;

    invoke-direct {p0}, Lj/d/a/d/a/b/d;-><init>()V

    iput-object p2, p0, Lcom/google/android/play/core/review/h;->a:Lj/d/a/d/a/b/f;

    iput-object p3, p0, Lcom/google/android/play/core/review/h;->b:Lj/d/a/d/a/f/p;

    return-void
.end method


# virtual methods
.method public Z0(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/play/core/review/h;->c:Lcom/google/android/play/core/review/j;

    iget-object p1, p1, Lcom/google/android/play/core/review/j;->a:Lj/d/a/d/a/b/p;

    invoke-virtual {p1}, Lj/d/a/d/a/b/p;->b()V

    iget-object p1, p0, Lcom/google/android/play/core/review/h;->a:Lj/d/a/d/a/b/f;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetLaunchReviewFlowInfo"

    invoke-virtual {p1, v1, v0}, Lj/d/a/d/a/b/f;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
