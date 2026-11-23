.class public Lcom/garena/pay/android/GGBillingDataSource;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/j;
.implements Lcom/android/billingclient/api/m;
.implements Lcom/android/billingclient/api/f;
.implements Ljava/io/Serializable;


# static fields
.field private static final g:Ljava/lang/String;

.field private static final h:Landroid/os/Handler;

.field private static volatile i:Lcom/garena/pay/android/GGBillingDataSource;


# instance fields
.field private final a:Landroidx/lifecycle/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p<",
            "Lcom/android/billingclient/api/h;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroidx/lifecycle/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/app/Application;

.field d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/android/billingclient/api/d;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Garena MSDK:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lcom/garena/pay/android/GGBillingDataSource;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/garena/pay/android/GGBillingDataSource;->h:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>(Landroid/app/Application;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/p;

    invoke-direct {v0}, Landroidx/lifecycle/p;-><init>()V

    iput-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    new-instance v1, Landroidx/lifecycle/p;

    invoke-direct {v1}, Landroidx/lifecycle/p;-><init>()V

    iput-object v1, p0, Lcom/garena/pay/android/GGBillingDataSource;->b:Landroidx/lifecycle/p;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/garena/pay/android/GGBillingDataSource;->d:Ljava/util/Map;

    const-wide/16 v2, 0x3e8

    iput-wide v2, p0, Lcom/garena/pay/android/GGBillingDataSource;->f:J

    iput-object p1, p0, Lcom/garena/pay/android/GGBillingDataSource;->c:Landroid/app/Application;

    invoke-static {p1}, Lcom/android/billingclient/api/d;->e(Landroid/content/Context;)Lcom/android/billingclient/api/d$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/billingclient/api/d$a;->c(Lcom/android/billingclient/api/m;)Lcom/android/billingclient/api/d$a;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d$a;->b()Lcom/android/billingclient/api/d$a;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d$a;->a()Lcom/android/billingclient/api/d;

    move-result-object p1

    iput-object p1, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/lifecycle/p;->n(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lcom/android/billingclient/api/d;->h(Lcom/android/billingclient/api/f;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/p;->n(Ljava/lang/Object;)V

    return-void
.end method

.method private B(Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            ")",
            "Li/i<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->h()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p0, Lcom/garena/pay/android/GGBillingDataSource;->c:Landroid/app/Application;

    invoke-virtual {v4}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "android.test.purchased"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    const-string v5, "9999"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/beetalk/sdk/x/i;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->a()Lcom/android/billingclient/api/a;

    move-result-object v5

    if-eqz v2, :cond_9

    if-nez v5, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v5}, Lcom/android/billingclient/api/a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/android/billingclient/api/a;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v6, :cond_9

    if-nez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    sget-object v7, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    const/4 v8, 0x1

    const-string v9, "#"

    const/4 v10, 0x2

    if-nez v7, :cond_5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    return-object v1

    :cond_4
    invoke-virtual {v5, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-ne v1, v10, :cond_a

    aget-object v1, v0, v3

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    aget-object v0, v0, v8

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_3

    :cond_5
    :goto_1
    iget-object v2, p0, Lcom/garena/pay/android/GGBillingDataSource;->b:Landroidx/lifecycle/p;

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_6

    return-object v1

    :cond_6
    const/4 v5, 0x4

    invoke-virtual {v2, v9, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    array-length v6, v2

    if-eq v6, v5, :cond_7

    return-object v1

    :cond_7
    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v0

    aget-object v3, v2, v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    aget-object v3, v2, v8

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    aget-object v0, v2, v10

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v0, 0x3

    aget-object v0, v2, v0

    goto :goto_0

    :cond_9
    :goto_2
    return-object v1

    :cond_a
    const/4 v0, 0x0

    :goto_3
    invoke-direct {p0, p1, v3, v0}, Lcom/garena/pay/android/GGBillingDataSource;->r(Lcom/android/billingclient/api/Purchase;II)Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$f;

    invoke-direct {v1, p0, p1, v4}, Lcom/garena/pay/android/GGBillingDataSource$f;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Lcom/android/billingclient/api/Purchase;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Li/i;->l(Li/g;)Li/i;

    move-result-object p1

    return-object p1

    :cond_b
    :goto_4
    return-object v1
.end method

.method private C()Li/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li/g<",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/garena/pay/android/GGBillingDataSource$l;

    invoke-direct {v0, p0}, Lcom/garena/pay/android/GGBillingDataSource$l;-><init>(Lcom/garena/pay/android/GGBillingDataSource;)V

    return-object v0
.end method

.method private D(Ljava/util/Collection;)Li/i;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)",
            "Li/i<",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/garena/pay/android/GGBillingDataSource;->c:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    invoke-static {v1, v2}, Lcom/beetalk/sdk/t/d;->e(Landroid/content/Context;Lcom/android/billingclient/api/Purchase;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->d()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_3

    invoke-static {v1}, Lcom/beetalk/sdk/t/f;->a(Landroid/content/Context;)Lcom/beetalk/sdk/t/f;

    move-result-object v3

    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lcom/beetalk/sdk/t/f;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0, v2}, Lcom/garena/pay/android/GGBillingDataSource;->B(Lcom/android/billingclient/api/Purchase;)Li/i;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v0}, Li/i;->H(Ljava/util/Collection;)Li/i;

    move-result-object p1

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$k;

    invoke-direct {v1, p0, v0}, Lcom/garena/pay/android/GGBillingDataSource$k;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v1}, Li/i;->i(Li/g;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method private G(Ljava/lang/String;Ljava/util/List;)Li/i;
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

    new-instance p2, Lcom/garena/pay/android/GGBillingDataSource$j;

    invoke-direct {p2, p0, v0}, Lcom/garena/pay/android/GGBillingDataSource$j;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Li/j;)V

    invoke-virtual {p0, p1, p2}, Lcom/garena/pay/android/GGBillingDataSource;->H(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)Z

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

.method private J()V
    .locals 4

    sget-object v0, Lcom/garena/pay/android/GGBillingDataSource;->h:Landroid/os/Handler;

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$d;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/GGBillingDataSource$d;-><init>(Lcom/garena/pay/android/GGBillingDataSource;)V

    iget-wide v2, p0, Lcom/garena/pay/android/GGBillingDataSource;->f:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-wide v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->f:J

    const-wide/16 v2, 0x2

    mul-long v0, v0, v2

    const-wide/32 v2, 0xdbba0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->f:J

    return-void
.end method

.method static synthetic h(Lcom/garena/pay/android/GGBillingDataSource;)Lcom/android/billingclient/api/d;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    return-object p0
.end method

.method static synthetic i()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/garena/pay/android/GGBillingDataSource;Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->s(Lcom/android/billingclient/api/Purchase;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lcom/garena/pay/android/GGBillingDataSource;Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->q(Lcom/android/billingclient/api/Purchase;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/garena/pay/android/GGBillingDataSource;Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->x(Lcom/android/billingclient/api/Purchase;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Lcom/garena/pay/android/GGBillingDataSource;Ljava/util/Collection;)Li/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->D(Ljava/util/Collection;)Li/i;

    move-result-object p0

    return-object p0
.end method

.method private o(Ljava/lang/String;Lcom/garena/pay/android/b;)V
    .locals 3

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    invoke-virtual {v1, p1, p2}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->z(Ljava/lang/String;Lcom/garena/pay/android/b;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private q(Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            ")",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Li/j;->d(Ljava/lang/Object;)V

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/android/billingclient/api/b;->b()Lcom/android/billingclient/api/b$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/billingclient/api/b$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/b$a;

    invoke-virtual {v1}, Lcom/android/billingclient/api/b$a;->a()Lcom/android/billingclient/api/b;

    move-result-object p1

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$h;

    invoke-direct {v1, p0, v0}, Lcom/garena/pay/android/GGBillingDataSource$h;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Li/j;)V

    invoke-virtual {p0, p1, v1}, Lcom/garena/pay/android/GGBillingDataSource;->n(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    invoke-virtual {p1}, Li/i;->w()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Li/j;->d(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1
.end method

.method private r(Lcom/android/billingclient/api/Purchase;II)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            "II)",
            "Li/i<",
            "Lcom/beetalk/sdk/networking/model/CommitResp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->c:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lcom/beetalk/sdk/z/i/c;->a(Landroid/content/Context;Lcom/android/billingclient/api/Purchase;II)Li/i;

    move-result-object p1

    new-instance p2, Lcom/garena/pay/android/GGBillingDataSource$e;

    invoke-direct {p2, p0}, Lcom/garena/pay/android/GGBillingDataSource$e;-><init>(Lcom/garena/pay/android/GGBillingDataSource;)V

    invoke-virtual {p1, p2}, Li/i;->i(Li/g;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method private s(Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            ")",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    invoke-static {}, Lcom/android/billingclient/api/i;->b()Lcom/android/billingclient/api/i$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/billingclient/api/i$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/i$a;

    invoke-virtual {v1}, Lcom/android/billingclient/api/i$a;->a()Lcom/android/billingclient/api/i;

    move-result-object p1

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$g;

    invoke-direct {v1, p0, v0}, Lcom/garena/pay/android/GGBillingDataSource$g;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Li/j;)V

    invoke-virtual {p0, p1, v1}, Lcom/garena/pay/android/GGBillingDataSource;->p(Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    invoke-virtual {p1}, Li/i;->w()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Li/j;->d(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Li/j;->a()Li/i;

    move-result-object p1

    return-object p1
.end method

.method public static u(Landroid/app/Application;)Lcom/garena/pay/android/GGBillingDataSource;
    .locals 2

    sget-object v0, Lcom/garena/pay/android/GGBillingDataSource;->i:Lcom/garena/pay/android/GGBillingDataSource;

    if-nez v0, :cond_1

    const-class v0, Lcom/garena/pay/android/GGBillingDataSource;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/garena/pay/android/GGBillingDataSource;->i:Lcom/garena/pay/android/GGBillingDataSource;

    if-nez v1, :cond_0

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/GGBillingDataSource;-><init>(Landroid/app/Application;)V

    sput-object v1, Lcom/garena/pay/android/GGBillingDataSource;->i:Lcom/garena/pay/android/GGBillingDataSource;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/garena/pay/android/GGBillingDataSource;->i:Lcom/garena/pay/android/GGBillingDataSource;

    return-object p0
.end method

.method private v(Ljava/lang/String;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Li/i<",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Li/j;

    invoke-direct {v0}, Li/j;-><init>()V

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$a;

    invoke-direct {v1, p0, v0}, Lcom/garena/pay/android/GGBillingDataSource$a;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Li/j;)V

    invoke-virtual {p0, p1, v1}, Lcom/garena/pay/android/GGBillingDataSource;->F(Ljava/lang/String;Lcom/android/billingclient/api/l;)Z

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

.method private x(Lcom/android/billingclient/api/Purchase;)Li/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            ")",
            "Li/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->h()Ljava/util/ArrayList;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->y(Ljava/lang/String;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method private y(Ljava/lang/String;)Li/i;
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

    const-string v0, "9999"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.test.purchased"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "subs"

    invoke-direct {p0, v1, v0}, Lcom/garena/pay/android/GGBillingDataSource;->G(Ljava/lang/String;Ljava/util/List;)Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$i;

    invoke-direct {v1, p0, p1}, Lcom/garena/pay/android/GGBillingDataSource$i;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Li/i;->i(Li/g;)Li/i;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Li/i;->r(Ljava/lang/Object;)Li/i;

    move-result-object p1

    return-object p1
.end method

.method private z()Z
    .locals 4

    const-string v0, "subscriptions"

    invoke-virtual {p0, v0}, Lcom/garena/pay/android/GGBillingDataSource;->w(Ljava/lang/String;)Lcom/android/billingclient/api/h;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSubscriptionSupported() error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public A(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/d;->d(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string p2, "launchBillingFlow: billingSetupIncomplete"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public E()Li/i;
    .locals 3
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

    sget-object v0, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string v1, "queryPurchasesAsync called"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "inapp"

    invoke-direct {p0, v1}, Lcom/garena/pay/android/GGBillingDataSource;->v(Ljava/lang/String;)Li/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/garena/pay/android/GGBillingDataSource;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "subs"

    invoke-direct {p0, v1}, Lcom/garena/pay/android/GGBillingDataSource;->v(Ljava/lang/String;)Li/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, Li/i;->H(Ljava/util/Collection;)Li/i;

    move-result-object v1

    new-instance v2, Lcom/garena/pay/android/GGBillingDataSource$c;

    invoke-direct {v2, p0, v0}, Lcom/garena/pay/android/GGBillingDataSource$c;-><init>(Lcom/garena/pay/android/GGBillingDataSource;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Li/i;->i(Li/g;)Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/GGBillingDataSource$b;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/GGBillingDataSource$b;-><init>(Lcom/garena/pay/android/GGBillingDataSource;)V

    invoke-virtual {v0, v1}, Li/i;->A(Li/g;)Li/i;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/String;Lcom/android/billingclient/api/l;)Z
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/d;->f(Ljava/lang/String;Lcom/android/billingclient/api/l;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string p2, "queryPurchasesAsync: billingSetupIncomplete"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method

.method public H(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)Z
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/d;->g(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string p2, "querySkuDetailsAsync: billingSetupIncomplete"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method

.method public I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "#"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/garena/pay/android/GGBillingDataSource;->d:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/garena/pay/android/GGBillingDataSource;->d:Ljava/util/Map;

    invoke-interface {p2, p1, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Google Handler added: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/garena/pay/android/GGBillingDataSource;->b:Landroidx/lifecycle/p;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/p;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "#"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/garena/pay/android/GGBillingDataSource;->d:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Google Handler removed: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public n(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)Z
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/d;->a(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string p2, "acknowledgePurchase: billingSetupIncomplete"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method

.method public onBillingServiceDisconnected()V
    .locals 3

    sget-object v0, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string v1, "onBillingServiceDisconnected, retrying"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-static {}, Lcom/android/billingclient/api/h;->c()Lcom/android/billingclient/api/h$a;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/h$a;->c(I)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v1}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->l(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/garena/pay/android/GGBillingDataSource;->J()V

    return-void
.end method

.method public onBillingSetupFinished(Lcom/android/billingclient/api/h;)V
    .locals 5

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onBillingSetupFinished: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v1, p1}, Landroidx/lifecycle/p;->l(Ljava/lang/Object;)V

    if-nez v0, :cond_0

    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->f:J

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/garena/pay/android/GGBillingDataSource;->J()V

    :goto_0
    return-void
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/h;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/h;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    sget-object v1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Billing Result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1}, Lcom/garena/pay/android/GGBillingDataSource;->D(Ljava/util/Collection;)Li/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p2, 0x7

    if-ne v0, p2, :cond_2

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/garena/pay/android/GGBillingDataSource;->E()Li/i;

    move-result-object p1

    :goto_0
    invoke-direct {p0}, Lcom/garena/pay/android/GGBillingDataSource;->C()Li/g;

    move-result-object p2

    sget-object v0, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, v0}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    goto :goto_2

    :cond_2
    const/4 p2, 0x1

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-ne v0, p2, :cond_3

    sget-object p1, Lcom/garena/pay/android/b;->T:Lcom/garena/pay/android/b;

    const-string p2, "User cancelled payment"

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    const-string p2, "Error Recd."

    :goto_1
    invoke-direct {p0, p2, p1}, Lcom/garena/pay/android/GGBillingDataSource;->o(Ljava/lang/String;Lcom/garena/pay/android/b;)V

    :goto_2
    return-void
.end method

.method public p(Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)Z
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/d;->b(Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string p2, "consumeAsync: billingSetupIncomplete"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method

.method public t()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/android/billingclient/api/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    return-object v0
.end method

.method public w(Ljava/lang/String;)Lcom/android/billingclient/api/h;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->a:Landroidx/lifecycle/p;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/GGBillingDataSource;->e:Lcom/android/billingclient/api/d;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/d;->c(Ljava/lang/String;)Lcom/android/billingclient/api/h;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/garena/pay/android/GGBillingDataSource;->g:Ljava/lang/String;

    const-string v0, "isFeatureSupported: billingSetupIncomplete"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method
