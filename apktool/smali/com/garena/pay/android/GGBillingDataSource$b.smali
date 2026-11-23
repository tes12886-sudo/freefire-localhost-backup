.class Lcom/garena/pay/android/GGBillingDataSource$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/GGBillingDataSource;->E()Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Ljava/util/Set<",
        "Lcom/android/billingclient/api/Purchase;",
        ">;",
        "Li/i<",
        "Ljava/util/List<",
        "Landroid/util/Pair<",
        "Lcom/android/billingclient/api/Purchase;",
        "Lcom/beetalk/sdk/networking/model/CommitResp;",
        ">;>;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/GGBillingDataSource;


# direct methods
.method constructor <init>(Lcom/garena/pay/android/GGBillingDataSource;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/GGBillingDataSource$b;->a:Lcom/garena/pay/android/GGBillingDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource$b;->b(Li/i;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Ljava/util/Set<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;>;)",
            "Li/i<",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;>;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource$b;->a:Lcom/garena/pay/android/GGBillingDataSource;

    invoke-static {v0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->m(Lcom/garena/pay/android/GGBillingDataSource;Ljava/util/Collection;)Li/i;

    move-result-object p1

    return-object p1
.end method
