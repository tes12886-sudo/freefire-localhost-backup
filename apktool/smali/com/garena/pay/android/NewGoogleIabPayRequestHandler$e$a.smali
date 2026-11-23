.class Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/android/billingclient/api/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b(Li/i;)Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    return-void
.end method

.method constructor <init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSkuDetailsResponse(Lcom/android/billingclient/api/h;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/h;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->b()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "querySkuDetailsAsync, responseCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", skuDetailsList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "google-iab"

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/SkuDetails;

    invoke-static {}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/android/billingclient/api/g$a;->e(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/g$a;

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object p1, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-static {p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->u(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/i;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object v4, v4, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v4, v4, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "#"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object v4, v4, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v4, v4, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v4

    sget-object v5, Lcom/beetalk/sdk/p$c;->b:Lcom/beetalk/sdk/p$c;

    if-ne v4, v5, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Original key: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", Account ID: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p2, v1}, Lcom/android/billingclient/api/g$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/g$a;

    invoke-virtual {p2, v2}, Lcom/android/billingclient/api/g$a;->d(Ljava/lang/String;)Lcom/android/billingclient/api/g$a;

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object p1, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->c:Lcom/garena/pay/android/d;

    invoke-virtual {p1}, Lcom/garena/pay/android/d;->c()Lcom/garena/pay/android/data/GGPayment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/garena/pay/android/data/GGPayment;->isOfferPersonalized()Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/android/billingclient/api/g$a;->b(Z)Lcom/android/billingclient/api/g$a;

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object p1, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->e:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-static {p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->v(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Lcom/garena/pay/android/GGBillingDataSource;

    move-result-object p1

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object v1, v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->d:Landroid/app/Activity;

    invoke-virtual {p2}, Lcom/android/billingclient/api/g$a;->a()Lcom/android/billingclient/api/g;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Lcom/garena/pay/android/GGBillingDataSource;->A(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->b()I

    move-result p2

    if-nez p2, :cond_2

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object p1, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b:Li/j;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Li/j;->d(Ljava/lang/Object;)V

    return-void

    :cond_2
    if-eqz p1, :cond_6

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSkuDetailsResponse, res.getResponseCode() = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->b()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    const-string p1, "No session found"

    goto :goto_1

    :cond_4
    :goto_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object p1, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b:Li/j;

    invoke-virtual {p1, v0}, Li/j;->d(Ljava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_2
    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e$a;->a:Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    iget-object p1, p1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;->b:Li/j;

    invoke-virtual {p1, v0}, Li/j;->d(Ljava/lang/Object;)V

    return-void
.end method
