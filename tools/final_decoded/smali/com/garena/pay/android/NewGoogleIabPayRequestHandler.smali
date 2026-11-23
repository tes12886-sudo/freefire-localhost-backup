.class public Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;
.super Lcom/garena/pay/android/e;
.source ""

# interfaces
.implements Landroidx/lifecycle/j;


# instance fields
.field private final transient b:Landroid/content/Context;

.field private transient c:Landroidx/lifecycle/j;

.field private transient d:Li/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/j<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private transient e:Li/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/j<",
            "Lcom/beetalk/sdk/u/j;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/garena/pay/android/GGBillingDataSource;

.field private final g:Landroidx/lifecycle/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/q<",
            "Lcom/android/billingclient/api/h;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Integer;

.field public final i:Ljava/lang/Integer;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;-><init>(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lcom/garena/pay/android/e;-><init>()V

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    check-cast p2, Landroid/app/Application;

    invoke-static {p2}, Lcom/garena/pay/android/GGBillingDataSource;->u(Landroid/app/Application;)Lcom/garena/pay/android/GGBillingDataSource;

    move-result-object p2

    iput-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    new-instance p3, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$b;

    invoke-direct {p3, p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$b;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V

    iput-object p3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->g:Landroidx/lifecycle/q;

    invoke-virtual {p2}, Lcom/garena/pay/android/GGBillingDataSource;->t()Landroidx/lifecycle/LiveData;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroidx/lifecycle/LiveData;->i(Landroidx/lifecycle/q;)V

    invoke-direct {p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->y(Landroid/content/Context;)V

    return-void
.end method

.method private A()Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "google-iab"

    const-string v1, "connectToPlayBillingService"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object v0

    invoke-virtual {v0}, Li/i;->w()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    iput-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    invoke-virtual {v0}, Lcom/garena/pay/android/GGBillingDataSource;->t()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Li/j;->d(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private B()Li/i;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Li/f;

    invoke-direct {v0}, Li/f;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [Li/i;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xa

    invoke-static {v3, v4, v2, v0}, Lcom/garena/pay/android/j/d;->e(JLjava/util/concurrent/TimeUnit;Li/f;)Li/i;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->A()Li/i;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Li/i;->J(Ljava/util/Collection;)Li/i;

    move-result-object v1

    new-instance v2, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$a;

    invoke-direct {v2, p0, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$a;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Li/f;)V

    sget-object v0, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v0}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object v0

    return-object v0
.end method

.method private D(Ljava/lang/String;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/garena/pay/android/e;->l()Lcom/garena/pay/android/data/GGPayment$PaymentChannel;

    move-result-object v0

    const-string v1, "9999"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "android.test.purchased"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/garena/pay/android/data/GGPayment$PaymentChannel;->getDenomination(Ljava/lang/String;)Lcom/garena/pay/android/data/GGPayment$Denomination;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/garena/pay/android/data/GGPayment$Denomination;->isSubscription()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "subs"

    invoke-direct {p0, v1, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->J(Ljava/lang/String;Ljava/util/List;)Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$f;

    invoke-direct {v1, p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$f;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Li/i;->i(Li/g;)Li/i;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method private E(Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)Li/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Lcom/garena/pay/android/d;",
            ")",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "launchBillingFlow, productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "google-iab"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Li/j;->d(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "9999"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p2, "android.test.purchased"

    :cond_1
    move-object v4, p2

    invoke-direct {p0, v4}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->D(Ljava/lang/String;)Li/i;

    move-result-object p2

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;

    move-object v2, v1

    move-object v3, p0

    move-object v5, v0

    move-object v6, p3

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$e;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/lang/String;Li/j;Lcom/garena/pay/android/d;Landroid/app/Activity;)V

    sget-object p1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v1, p1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    goto :goto_0
.end method

.method private H(Lcom/android/billingclient/api/Purchase;Lcom/beetalk/sdk/networking/model/CommitResp;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p2}, Lcom/beetalk/sdk/networking/model/CommitResp;->getAppPointAmount()I

    move-result v1

    const-string v2, "app_point_amount"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/networking/model/CommitResp;->getCurrentCommitTxnId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "txn_id"

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/networking/model/CommitResp;->getItemName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "item_name"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/networking/model/CommitResp;->getRebateCardId()J

    move-result-wide v1

    const-string v3, "rebate_card_id"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/networking/model/CommitResp;->getRemainingDays()I

    move-result p2

    const-string v1, "remaining_days"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->f()I

    move-result p1

    const-string p2, "quantity"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/pay/android/j/d;->a(Landroid/os/Bundle;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/beetalk/sdk/u/j;->b(Lcom/garena/pay/android/d;Ljava/util/Map;)Lcom/beetalk/sdk/u/j;

    move-result-object p2

    invoke-virtual {p1, p2}, Li/j;->g(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    iget-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/garena/pay/android/GGBillingDataSource;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method

.method private J(Ljava/lang/String;Ljava/util/List;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    invoke-static {}, Lcom/android/billingclient/api/n;->c()Lcom/android/billingclient/api/n$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/android/billingclient/api/n$a;->b(Ljava/util/List;)Lcom/android/billingclient/api/n$a;

    invoke-virtual {v1, p1}, Lcom/android/billingclient/api/n$a;->c(Ljava/lang/String;)Lcom/android/billingclient/api/n$a;

    invoke-virtual {v1}, Lcom/android/billingclient/api/n$a;->a()Lcom/android/billingclient/api/n;

    move-result-object p1

    iget-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$i;

    invoke-direct {v1, p0, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$i;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Li/j;)V

    invoke-virtual {p2, p1, v1}, Lcom/garena/pay/android/GGBillingDataSource;->H(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    invoke-virtual {p1}, Li/i;->w()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Li/j;->d(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1
.end method

.method private L(ZLjava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object v0

    invoke-virtual {v0}, Li/i;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    iput-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    invoke-virtual {p1, p2}, Li/j;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Li/j;->d(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static synthetic r(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Landroidx/lifecycle/j;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->c:Landroidx/lifecycle/j;

    return-object p0
.end method

.method static synthetic s(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Landroidx/lifecycle/j;)Landroidx/lifecycle/j;
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->c:Landroidx/lifecycle/j;

    return-object p1
.end method

.method static synthetic t(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Li/j;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    return-object p0
.end method

.method static synthetic u(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->b:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic v(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)Lcom/garena/pay/android/GGBillingDataSource;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    return-object p0
.end method

.method static synthetic w(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)Li/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->E(Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic x(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/lang/String;Ljava/util/List;)Li/i;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->J(Ljava/lang/String;Ljava/util/List;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method private y(Landroid/content/Context;)V
    .locals 1

    instance-of v0, p1, Landroidx/fragment/app/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p1, Landroidx/fragment/app/e;

    new-instance v0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$2;

    invoke-direct {v0, p0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$2;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Landroidx/fragment/app/e;)V

    iput-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->c:Landroidx/lifecycle/j;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->a()Landroidx/lifecycle/g;

    move-result-object p1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->c:Landroidx/lifecycle/j;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/j;)V

    return-void
.end method


# virtual methods
.method C()Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li/i<",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;>;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->B()Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$g;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$g;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V

    invoke-virtual {v0, v1}, Li/i;->A(Li/g;)Li/i;

    move-result-object v0

    return-object v0
.end method

.method public F()V
    .locals 2

    const-string v0, "google-iab"

    const-string v1, "onBillingServiceDisconnected, reconnecting"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public G(Lcom/android/billingclient/api/h;)V
    .locals 5

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "google-iab"

    if-nez v0, :cond_0

    const-string p1, "onBillingSetupFinished successfully"

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    invoke-direct {p0, p1, v1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->L(ZLjava/lang/Exception;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    const/4 v4, 0x0

    if-ne v0, v3, :cond_1

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v4, v1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->L(ZLjava/lang/Exception;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/Exception;

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v4, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->L(ZLjava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public I(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/android/billingclient/api/Purchase;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/beetalk/sdk/networking/model/CommitResp;

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->h()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->k:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v5, "android.test.purchased"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->k:Ljava/lang/String;

    const-string v6, "9999"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-nez v4, :cond_1

    if-eqz v2, :cond_2

    :cond_1
    const/4 v3, 0x1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->k:Ljava/lang/String;

    if-eqz v0, :cond_4

    sget-object p1, Lcom/beetalk/sdk/z/f;->l:Lcom/beetalk/sdk/z/f;

    invoke-virtual {p1}, Lcom/beetalk/sdk/z/f;->c()I

    move-result p1

    invoke-virtual {v0}, Lcom/beetalk/sdk/networking/model/BaseResp;->getResultCode()I

    move-result v2

    if-ne p1, v2, :cond_4

    invoke-virtual {v0}, Lcom/beetalk/sdk/networking/model/CommitResp;->getMessage()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/garena/pay/android/b;->a0:Lcom/garena/pay/android/b;

    :goto_2
    invoke-virtual {p0, p1, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->z(Ljava/lang/String;Lcom/garena/pay/android/b;)V

    goto :goto_6

    :cond_4
    if-eqz v0, :cond_5

    sget-object p1, Lcom/beetalk/sdk/z/f;->f:Lcom/beetalk/sdk/z/f;

    invoke-virtual {p1}, Lcom/beetalk/sdk/z/f;->c()I

    move-result p1

    invoke-virtual {v0}, Lcom/beetalk/sdk/networking/model/BaseResp;->getResultCode()I

    move-result v2

    if-ne p1, v2, :cond_5

    invoke-virtual {v0}, Lcom/beetalk/sdk/networking/model/CommitResp;->getMessage()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/garena/pay/android/b;->b0:Lcom/garena/pay/android/b;

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/beetalk/sdk/networking/model/CommitResp;->isError()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->d()I

    move-result p1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_7

    sget-object p1, Lcom/garena/pay/android/b;->b0:Lcom/garena/pay/android/b;

    const-string v0, "Pending transaction"

    :goto_3
    invoke-virtual {p0, v0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->z(Ljava/lang/String;Lcom/garena/pay/android/b;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->d()I

    move-result p1

    if-eq p1, v5, :cond_8

    sget-object p1, Lcom/garena/pay/android/b;->c0:Lcom/garena/pay/android/b;

    const-string v0, "Purchase state is incorrect."

    goto :goto_3

    :cond_8
    invoke-direct {p0, v1, v0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->H(Lcom/android/billingclient/api/Purchase;Lcom/beetalk/sdk/networking/model/CommitResp;)V

    goto :goto_6

    :cond_9
    :goto_4
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/beetalk/sdk/networking/model/CommitResp;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_a
    const-string p1, "Failed to commit"

    :goto_5
    sget-object v0, Lcom/garena/pay/android/b;->c0:Lcom/garena/pay/android/b;

    goto :goto_2

    :goto_6
    return-void

    :cond_b
    sget-object p1, Lcom/garena/pay/android/b;->c0:Lcom/garena/pay/android/b;

    const-string v0, ""

    invoke-virtual {p0, v0, p1}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->z(Ljava/lang/String;Lcom/garena/pay/android/b;)V

    return-void
.end method

.method K(Ljava/util/List;Ljava/util/List;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Li/i<",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;>;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->B()Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;

    invoke-direct {v1, p0, p1, p2}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$h;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Li/i;->A(Li/g;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lj/c/b/g;->f:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k()I
    .locals 1

    sget v0, Lj/c/b/d;->b:I

    return v0
.end method

.method n()V
    .locals 5

    const-string v0, "google-iab"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->d:Li/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/j;->e()Z

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li/j;->e()Z

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->j:Ljava/lang/String;

    iget-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/garena/pay/android/GGBillingDataSource;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_1
    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    invoke-virtual {v0}, Lcom/garena/pay/android/GGBillingDataSource;->t()Landroidx/lifecycle/LiveData;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->g:Landroidx/lifecycle/q;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->m(Landroidx/lifecycle/q;)V

    return-void
.end method

.method q(Landroid/app/Activity;Lcom/garena/pay/android/d;Ljava/lang/String;Li/g;)Li/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/garena/pay/android/d;",
            "Ljava/lang/String;",
            "Li/g<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Li/i<",
            "Lcom/beetalk/sdk/u/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object v0

    invoke-virtual {v0}, Li/i;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    invoke-virtual {p1}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    iput-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    new-instance p2, Ljava/lang/Exception;

    const-string p3, "Processing another product."

    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Li/j;->c(Ljava/lang/Exception;)V

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    invoke-virtual {p1}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->j:Ljava/lang/String;

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, Lcom/garena/pay/android/GGBillingDataSource;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V

    :cond_2
    iput-object p3, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->k:Ljava/lang/String;

    invoke-direct {p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->B()Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$d;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;Landroid/app/Activity;Ljava/lang/String;Lcom/garena/pay/android/d;)V

    sget-object p1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Li/i;->B(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p2

    invoke-virtual {p2, p4, p1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p2

    new-instance p3, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;

    invoke-direct {p3, p0}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler$c;-><init>(Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V

    invoke-virtual {p2, p3, p1}, Li/i;->m(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/String;Lcom/garena/pay/android/b;)V
    .locals 3

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object v0

    invoke-virtual {v0}, Li/i;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "google-iab"

    const-string v1, "Wrong state."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->e:Li/j;

    const/4 v1, 0x0

    invoke-static {v1, p2, p1}, Lcom/beetalk/sdk/u/j;->a(Lcom/garena/pay/android/d;Lcom/garena/pay/android/b;Ljava/lang/String;)Lcom/beetalk/sdk/u/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Li/j;->g(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->f:Lcom/garena/pay/android/GGBillingDataSource;

    iget-object p2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->h:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->i:Ljava/lang/Integer;

    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/garena/pay/android/GGBillingDataSource;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method
