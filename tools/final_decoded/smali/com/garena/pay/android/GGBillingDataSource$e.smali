.class Lcom/garena/pay/android/GGBillingDataSource$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/GGBillingDataSource;->r(Lcom/android/billingclient/api/Purchase;II)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/networking/model/CommitResp;",
        "Lcom/beetalk/sdk/networking/model/CommitResp;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/garena/pay/android/GGBillingDataSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource$e;->b(Li/i;)Lcom/beetalk/sdk/networking/model/CommitResp;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Lcom/beetalk/sdk/networking/model/CommitResp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;)",
            "Lcom/beetalk/sdk/networking/model/CommitResp;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->x()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li/i;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/networking/model/CommitResp;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
