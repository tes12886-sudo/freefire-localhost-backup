.class Lcom/dtd/freefireth/FFAPI$13$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/a/d/a/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dtd/freefireth/FFAPI$13;->onComplete(Lj/d/a/d/a/f/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/a/d/a/f/a<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/dtd/freefireth/FFAPI$13;


# direct methods
.method constructor <init>(Lcom/dtd/freefireth/FFAPI$13;)V
    .locals 0

    iput-object p1, p0, Lcom/dtd/freefireth/FFAPI$13$1;->this$0:Lcom/dtd/freefireth/FFAPI$13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lj/d/a/d/a/f/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/f/e<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->g()Z

    move-result v0

    const-string v1, "onInAppReviewCallback"

    if-eqz v0, :cond_0

    new-instance p1, Lcom/dtd/freefireth/InAppReviewResult;

    invoke-direct {p1}, Lcom/dtd/freefireth/InAppReviewResult;-><init>()V

    sget-object v0, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v2

    invoke-virtual {v2, p1}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/dtd/freefireth/InAppReviewResult;

    invoke-direct {v0}, Lcom/dtd/freefireth/InAppReviewResult;-><init>()V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/dtd/freefireth/InAppReviewResult;->LaunchFailure:Z

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/dtd/freefireth/InAppReviewResult;->ExceptionType:Ljava/lang/String;

    invoke-virtual {p1}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/dtd/freefireth/InAppReviewResult;->ExceptionMessage:Ljava/lang/String;

    :cond_1
    sget-object p1, Lcom/dtd/freefireth/FFAPI;->UnitySendMessageGameObjectName:Ljava/lang/String;

    invoke-static {}, Lcom/dtd/freefireth/FFAPI;->access$300()Lj/d/d/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Lj/d/d/e;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/dtd/freefireth/FFMainActivity;->FFSendToUnity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
