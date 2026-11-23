.class Lcom/dts/freefireth/FFAPI$13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/d/a/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dts/freefireth/FFAPI;->doInAppReview()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/a/d/a/f/a<",
        "Lcom/google/android/play/core/review/ReviewInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$reviewManager:Lcom/google/android/play/core/review/a;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/review/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/dts/freefireth/FFAPI$13;->val$reviewManager:Lcom/google/android/play/core/review/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lj/d/a/d/a/f/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/f/e<",
            "Lcom/google/android/play/core/review/ReviewInfo;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/play/core/review/ReviewInfo;

    iget-object v0, p0, Lcom/dts/freefireth/FFAPI$13;->val$reviewManager:Lcom/google/android/play/core/review/a;

    sget-object v1, Lcom/dts/freefireth/FFAPI;->MainActivity:Lcom/dts/freefireth/FFMainActivity;

    invoke-interface {v0, v1, p1}, Lcom/google/android/play/core/review/a;->a(Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;)Lj/d/a/d/a/f/e;

    move-result-object p1

    new-instance v0, Lcom/dts/freefireth/FFAPI$13$1;

    invoke-direct {v0, p0}, Lcom/dts/freefireth/FFAPI$13$1;-><init>(Lcom/dts/freefireth/FFAPI$13;)V

    invoke-virtual {p1, v0}, Lj/d/a/d/a/f/e;->a(Lj/d/a/d/a/f/a;)Lj/d/a/d/a/f/e;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/dts/freefireth/InAppReviewResult;

    invoke-direct {v0}, Lcom/dts/freefireth/InAppReviewResult;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/dts/freefireth/InAppReviewResult;->RequestFailure:Z

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dts/freefireth/InAppReviewResult;->ExceptionType:Ljava/lang/String;

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/dts/freefireth/InAppReviewResult;->ExceptionMessage:Ljava/lang/String;

    :cond_1
    sget-object p1, Lcom/dts/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dts/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onInAppReviewCallback"

    invoke-static {p1, v1, v0}, Lcom/dts/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
