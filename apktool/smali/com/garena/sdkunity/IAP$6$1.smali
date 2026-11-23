.class Lcom/garena/sdkunity/IAP$6$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/garena/pay/android/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/sdkunity/IAP$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/garena/sdkunity/IAP$6;


# direct methods
.method constructor <init>(Lcom/garena/sdkunity/IAP$6;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/sdkunity/IAP$6$1;->this$0:Lcom/garena/sdkunity/IAP$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/garena/pay/android/h$a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/garena/sdkunity/ScanGoogleInAppPurchaseInventoryResult;

    invoke-direct {v0}, Lcom/garena/sdkunity/ScanGoogleInAppPurchaseInventoryResult;-><init>()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/garena/pay/android/h$a;

    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/garena/pay/android/h$a;

    invoke-virtual {v0, p1}, Lcom/garena/sdkunity/ScanGoogleInAppPurchaseInventoryResult;->Copy([Lcom/garena/pay/android/h$a;)V

    :cond_0
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p1

    const-string v1, "onScanGoogleInAppPurchaseInventoryResult"

    invoke-virtual {p1, v1, v0}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
