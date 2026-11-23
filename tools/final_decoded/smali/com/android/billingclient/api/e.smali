.class Lcom/android/billingclient/api/e;
.super Lcom/android/billingclient/api/d;
.source ""


# instance fields
.field private volatile a:I

.field private final b:Ljava/lang/String;

.field private final c:Landroid/os/Handler;

.field private volatile d:Lcom/android/billingclient/api/y0;

.field private e:Landroid/content/Context;

.field private volatile f:Lj/d/a/c/f/h/n;

.field private volatile g:Lcom/android/billingclient/api/b0;

.field private h:Z

.field private i:Z

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>(Landroid/content/Context;ZLcom/android/billingclient/api/m;Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/t0;)V
    .locals 1

    invoke-direct {p0}, Lcom/android/billingclient/api/d;-><init>()V

    const/4 p5, 0x0

    iput p5, p0, Lcom/android/billingclient/api/e;->a:I

    new-instance p6, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p6, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    iput p5, p0, Lcom/android/billingclient/api/e;->j:I

    iput-object p4, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    const/4 p4, 0x0

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/android/billingclient/api/e;->i(Landroid/content/Context;Lcom/android/billingclient/api/m;ZLcom/android/billingclient/api/t0;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ZLandroid/content/Context;Lcom/android/billingclient/api/l0;)V
    .locals 1

    invoke-direct {p0}, Lcom/android/billingclient/api/d;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/e;->a:I

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p4, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/e;->j:I

    invoke-static {}, Lcom/android/billingclient/api/e;->s()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    new-instance p3, Lcom/android/billingclient/api/y0;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p4}, Lcom/android/billingclient/api/y0;-><init>(Landroid/content/Context;Lcom/android/billingclient/api/l0;)V

    iput-object p3, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/y0;

    iput-boolean p2, p0, Lcom/android/billingclient/api/e;->t:Z

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ZLandroid/content/Context;Lcom/android/billingclient/api/m;Lcom/android/billingclient/api/t0;)V
    .locals 7

    invoke-static {}, Lcom/android/billingclient/api/e;->s()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p3

    move v2, p2

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/e;-><init>(Landroid/content/Context;ZLcom/android/billingclient/api/m;Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/t0;)V

    return-void
.end method

.method static bridge synthetic A(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/h;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->r()Lcom/android/billingclient/api/h;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic B(Lcom/android/billingclient/api/e;Ljava/lang/String;)Lcom/android/billingclient/api/m0;
    .locals 13

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Querying owned items, item type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingClient"

    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, p0, Lcom/android/billingclient/api/e;->m:Z

    iget-boolean v3, p0, Lcom/android/billingclient/api/e;->t:Z

    iget-object v4, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lj/d/a/c/f/h/k;->g(ZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x0

    move-object v9, v3

    :cond_0
    :try_start_0
    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->m:Z

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/16 v6, 0x9

    iget-object v4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    move-object v8, p1

    move-object v10, v2

    invoke-interface/range {v5 .. v10}, Lj/d/a/c/f/h/n;->G0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/4 v5, 0x3

    iget-object v6, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, p1, v9}, Lj/d/a/c/f/h/n;->z0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    const-string v5, "getPurchase()"

    invoke-static {v4, v1, v5}, Lcom/android/billingclient/api/n0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/h;

    move-result-object v5

    sget-object v6, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    if-eq v5, v6, :cond_2

    new-instance p0, Lcom/android/billingclient/api/m0;

    invoke-direct {p0, v5, v3}, Lcom/android/billingclient/api/m0;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_2
    const-string v5, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const-string v6, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    const-string v7, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_4

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Sku is owned: "

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v11, Lcom/android/billingclient/api/Purchase;

    invoke-direct {v11, v9, v10}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v11}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "BUG: empty/null token!"

    invoke-static {v1, v9}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :catch_0
    move-exception p0

    const-string p1, "Got an exception trying to decode the purchase!"

    invoke-static {v1, p1, p0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p0, Lcom/android/billingclient/api/m0;

    sget-object p1, Lcom/android/billingclient/api/i0;->j:Lcom/android/billingclient/api/h;

    invoke-direct {p0, p1, v3}, Lcom/android/billingclient/api/m0;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    goto :goto_2

    :cond_4
    const-string v5, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Continuation token: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance p0, Lcom/android/billingclient/api/m0;

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    invoke-direct {p0, p1, v0}, Lcom/android/billingclient/api/m0;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    goto :goto_2

    :catch_1
    move-exception p0

    const-string p1, "Got exception trying to get purchasesm try to reconnect"

    invoke-static {v1, p1, p0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p0, Lcom/android/billingclient/api/m0;

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    invoke-direct {p0, p1, v3}, Lcom/android/billingclient/api/m0;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    :goto_2
    return-object p0
.end method

.method static bridge synthetic C(Lcom/android/billingclient/api/e;)Lj/d/a/c/f/h/n;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    return-object p0
.end method

.method static bridge synthetic G(Lcom/android/billingclient/api/e;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 6

    const-wide/16 v2, 0x7530

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/e;->t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic H(Lcom/android/billingclient/api/e;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/e;->a:I

    return-void
.end method

.method static bridge synthetic I(Lcom/android/billingclient/api/e;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/e;->j:I

    return-void
.end method

.method static bridge synthetic J(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->n:Z

    return-void
.end method

.method static bridge synthetic K(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->o:Z

    return-void
.end method

.method static bridge synthetic L(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->p:Z

    return-void
.end method

.method static bridge synthetic M(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->q:Z

    return-void
.end method

.method static bridge synthetic N(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->r:Z

    return-void
.end method

.method static bridge synthetic O(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->s:Z

    return-void
.end method

.method static bridge synthetic P(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->k:Z

    return-void
.end method

.method static bridge synthetic Q(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->l:Z

    return-void
.end method

.method private i(Landroid/content/Context;Lcom/android/billingclient/api/m;ZLcom/android/billingclient/api/t0;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    new-instance v0, Lcom/android/billingclient/api/y0;

    invoke-direct {v0, p1, p2, p4}, Lcom/android/billingclient/api/y0;-><init>(Landroid/content/Context;Lcom/android/billingclient/api/m;Lcom/android/billingclient/api/t0;)V

    iput-object v0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/y0;

    iput-boolean p3, p0, Lcom/android/billingclient/api/e;->t:Z

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->u:Z

    return-void
.end method

.method static bridge synthetic k(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->m:Z

    return-void
.end method

.method static bridge synthetic l(Lcom/android/billingclient/api/e;Lj/d/a/c/f/h/n;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    return-void
.end method

.method static bridge synthetic m(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->i:Z

    return-void
.end method

.method static bridge synthetic n(Lcom/android/billingclient/api/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->h:Z

    return-void
.end method

.method private final p()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    return-object v0
.end method

.method private final q(Lcom/android/billingclient/api/h;)Lcom/android/billingclient/api/h;
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/billingclient/api/v;

    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/v;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/h;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method

.method private final r()Lcom/android/billingclient/api/h;
    .locals 2

    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/android/billingclient/api/i0;->j:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    :goto_1
    return-object v0
.end method

.method private static s()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.android.billingclient.ktx.BuildConfig"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "VERSION_NAME"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "5.0.0"

    return-object v0
.end method

.method private final t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 2

    long-to-double p2, p2

    const-wide v0, 0x3fee666666666666L    # 0.95

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v0

    double-to-long p2, p2

    iget-object v0, p0, Lcom/android/billingclient/api/e;->v:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lj/d/a/c/f/h/k;->a:I

    new-instance v1, Lcom/android/billingclient/api/x;

    invoke-direct {v1, p0}, Lcom/android/billingclient/api/x;-><init>(Lcom/android/billingclient/api/e;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/e;->v:Ljava/util/concurrent/ExecutorService;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/e;->v:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lcom/android/billingclient/api/u;

    invoke-direct {v0, p1, p4}, Lcom/android/billingclient/api/u;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    invoke-virtual {p5, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Async task throws exception!"

    invoke-static {p2, p3, p1}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final u(Ljava/lang/String;Lcom/android/billingclient/api/l;)V
    .locals 7

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    :goto_0
    invoke-static {}, Lj/d/a/c/f/h/b0;->t()Lj/d/a/c/f/h/b0;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/android/billingclient/api/l;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid product type."

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->g:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/android/billingclient/api/w;

    invoke-direct {v2, p0, p1, p2}, Lcom/android/billingclient/api/w;-><init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Lcom/android/billingclient/api/l;)V

    new-instance v5, Lcom/android/billingclient/api/t;

    invoke-direct {v5, p2}, Lcom/android/billingclient/api/t;-><init>(Lcom/android/billingclient/api/l;)V

    const-wide/16 v3, 0x7530

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->p()Landroid/os/Handler;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/e;->t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->r()Lcom/android/billingclient/api/h;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-void
.end method

.method static bridge synthetic v(Lcom/android/billingclient/api/e;)I
    .locals 0

    iget p0, p0, Lcom/android/billingclient/api/e;->j:I

    return p0
.end method

.method static bridge synthetic w(Lcom/android/billingclient/api/e;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic z(Lcom/android/billingclient/api/e;)Landroid/os/Handler;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->p()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method final synthetic D(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)Ljava/lang/Object;
    .locals 7

    const-string v0, "BillingClient"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/android/billingclient/api/b;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {p1, v6}, Lj/d/a/c/f/h/k;->c(Lcom/android/billingclient/api/b;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {v2, v3, v4, v5, p1}, Lj/d/a/c/f/h/n;->b1(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v2

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/android/billingclient/api/h;->c()Lcom/android/billingclient/api/h$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/h$a;->c(I)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/h$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lcom/android/billingclient/api/c;->a(Lcom/android/billingclient/api/h;)V

    return-object v1

    :catch_0
    move-exception p1

    const-string v2, "Error acknowledge purchase!"

    invoke-static {v0, v2, p1}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    goto :goto_0
.end method

.method final synthetic E(Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)Ljava/lang/Object;
    .locals 7

    const-string v0, "BillingClient"

    invoke-virtual {p1}, Lcom/android/billingclient/api/i;->a()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Consuming purchase with token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/android/billingclient/api/e;->m:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-boolean v5, p0, Lcom/android/billingclient/api/e;->m:Z

    iget-object v6, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {p1, v5, v6}, Lj/d/a/c/f/h/k;->d(Lcom/android/billingclient/api/i;ZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {v2, v3, v4, v1, p1}, Lj/d/a/c/f/h/n;->L(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    const-string v2, "RESPONSE_CODE"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2, v3, v1}, Lj/d/a/c/f/h/n;->H(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    const-string p1, ""

    :goto_0
    invoke-static {}, Lcom/android/billingclient/api/h;->c()Lcom/android/billingclient/api/h$a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/billingclient/api/h$a;->c(I)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v3, p1}, Lcom/android/billingclient/api/h$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v3}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object p1

    if-nez v2, :cond_1

    const-string v2, "Successfully consumed purchase."

    invoke-static {v0, v2}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/android/billingclient/api/j;->a(Lcom/android/billingclient/api/h;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error consuming purchase with token. Response code: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v2, "Error consuming purchase!"

    invoke-static {v0, v2, p1}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    invoke-interface {p2, p1, v1}, Lcom/android/billingclient/api/j;->a(Lcom/android/billingclient/api/h;Ljava/lang/String;)V

    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method final synthetic F(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/android/billingclient/api/o;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    const-string v2, "BillingClient"

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x6

    const/4 v7, 0x4

    const-string v8, "Item is unavailable for purchase."

    const/4 v9, 0x0

    if-ge v5, v3, :cond_8

    add-int/lit8 v10, v5, 0x14

    if-le v10, v3, :cond_0

    move v11, v3

    goto :goto_1

    :cond_0
    move v11, v10

    :goto_1
    new-instance v12, Ljava/util/ArrayList;

    move-object/from16 v13, p2

    invoke-interface {v13, v5, v11}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v11

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v11, :cond_1

    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/android/billingclient/api/s0;

    invoke-virtual {v15}, Lcom/android/billingclient/api/s0;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_1
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    const-string v14, "ITEM_ID_LIST"

    invoke-virtual {v11, v14, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v5, v1, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    const-string v14, "playBillingLibraryVersion"

    invoke-virtual {v11, v14, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-boolean v5, v1, Lcom/android/billingclient/api/e;->n:Z

    if-eqz v5, :cond_2

    iget-object v15, v1, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/16 v16, 0xa

    iget-object v5, v1, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v17

    iget v5, v1, Lcom/android/billingclient/api/e;->j:I

    iget-boolean v14, v1, Lcom/android/billingclient/api/e;->t:Z

    iget-object v4, v1, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {v5, v14, v4, v9, v12}, Lj/d/a/c/f/h/k;->e(IZLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Landroid/os/Bundle;

    move-result-object v20

    move-object/from16 v18, p1

    move-object/from16 v19, v11

    invoke-interface/range {v15 .. v20}, Lj/d/a/c/f/h/n;->E(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4

    move-object/from16 v14, p1

    goto :goto_3

    :cond_2
    iget-object v4, v1, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    const/4 v5, 0x3

    iget-object v12, v1, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v14, p1

    invoke-interface {v4, v5, v12, v14, v11}, Lj/d/a/c/f/h/n;->X(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_3
    if-nez v4, :cond_3

    const-string v0, "querySkuDetailsAsync got null sku details list"

    :goto_4
    invoke-static {v2, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v9

    const/4 v4, 0x4

    goto/16 :goto_7

    :cond_3
    const-string v5, "DETAILS_LIST"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_5

    invoke-static {v4, v2}, Lj/d/a/c/f/h/k;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v3

    invoke-static {v4, v2}, Lj/d/a/c/f/h/k;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v3, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getSkuDetails() failed. Response code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    move v4, v3

    goto :goto_7

    :cond_4
    const-string v3, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    invoke-static {v2, v3}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    const/4 v4, 0x6

    goto :goto_7

    :cond_5
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_6

    const-string v0, "querySkuDetailsAsync got null response list"

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_7

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    :try_start_1
    new-instance v8, Lcom/android/billingclient/api/SkuDetails;

    invoke-direct {v8, v7}, Lcom/android/billingclient/api/SkuDetails;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v11, "Got sku details: "

    invoke-virtual {v11, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :catch_0
    move-exception v0

    const-string v3, "Got a JSON exception trying to decode SkuDetails."

    invoke-static {v2, v3, v0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v8, "Error trying to decode SkuDetails."

    move-object v0, v9

    goto :goto_5

    :cond_7
    move v5, v10

    goto/16 :goto_0

    :catch_1
    move-exception v0

    const-string v3, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    invoke-static {v2, v3, v0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v4, -0x1

    const-string v8, "Service connection is disconnected."

    move-object v0, v9

    goto :goto_7

    :cond_8
    const-string v8, ""

    const/4 v4, 0x0

    :goto_7
    invoke-static {}, Lcom/android/billingclient/api/h;->c()Lcom/android/billingclient/api/h$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/android/billingclient/api/h$a;->c(I)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v2, v8}, Lcom/android/billingclient/api/h$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v2}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v2

    move-object/from16 v3, p4

    invoke-interface {v3, v2, v0}, Lcom/android/billingclient/api/o;->onSkuDetailsResponse(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object v9
.end method

.method public final a(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)V
    .locals 6

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    :goto_0
    invoke-interface {p2, p1}, Lcom/android/billingclient/api/c;->a(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid purchase token."

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->i:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/e;->m:Z

    if-nez v0, :cond_2

    sget-object p1, Lcom/android/billingclient/api/i0;->b:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/android/billingclient/api/d1;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/billingclient/api/d1;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/c;)V

    new-instance v4, Lcom/android/billingclient/api/e1;

    invoke-direct {v4, p2}, Lcom/android/billingclient/api/e1;-><init>(Lcom/android/billingclient/api/c;)V

    const-wide/16 v2, 0x7530

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->p()Landroid/os/Handler;

    move-result-object v5

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/e;->t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->r()Lcom/android/billingclient/api/h;

    move-result-object p1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final b(Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)V
    .locals 7

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    :goto_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/i;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/android/billingclient/api/j;->a(Lcom/android/billingclient/api/h;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v2, Lcom/android/billingclient/api/b1;

    invoke-direct {v2, p0, p1, p2}, Lcom/android/billingclient/api/b1;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/i;Lcom/android/billingclient/api/j;)V

    new-instance v5, Lcom/android/billingclient/api/c1;

    invoke-direct {v5, p2, p1}, Lcom/android/billingclient/api/c1;-><init>(Lcom/android/billingclient/api/j;Lcom/android/billingclient/api/i;)V

    const-wide/16 v3, 0x7530

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->p()Landroid/os/Handler;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/e;->t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->r()Lcom/android/billingclient/api/h;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/android/billingclient/api/h;
    .locals 1

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "subscriptions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "priceChangeConfirmation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_2
    const-string v0, "fff"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    goto :goto_1

    :sswitch_3
    const-string v0, "eee"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x7

    goto :goto_1

    :sswitch_4
    const-string v0, "ddd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_5
    const-string v0, "ccc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x6

    goto :goto_1

    :sswitch_6
    const-string v0, "bbb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_7
    const-string v0, "aaa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_8
    const-string v0, "subscriptionsUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unsupported feature: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "BillingClient"

    invoke-static {v0, p1}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->v:Lcom/android/billingclient/api/h;

    return-object p1

    :pswitch_0
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->s:Z

    if-eqz p1, :cond_2

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_2

    :cond_2
    sget-object p1, Lcom/android/billingclient/api/i0;->t:Lcom/android/billingclient/api/h;

    :goto_2
    return-object p1

    :pswitch_1
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->r:Z

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/android/billingclient/api/i0;->r:Lcom/android/billingclient/api/h;

    :goto_3
    return-object p1

    :pswitch_2
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->p:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_4

    :cond_4
    sget-object p1, Lcom/android/billingclient/api/i0;->s:Lcom/android/billingclient/api/h;

    :goto_4
    return-object p1

    :pswitch_3
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->q:Z

    if-eqz p1, :cond_5

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_5

    :cond_5
    sget-object p1, Lcom/android/billingclient/api/i0;->q:Lcom/android/billingclient/api/h;

    :goto_5
    return-object p1

    :pswitch_4
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->o:Z

    if-eqz p1, :cond_6

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_6

    :cond_6
    sget-object p1, Lcom/android/billingclient/api/i0;->u:Lcom/android/billingclient/api/h;

    :goto_6
    return-object p1

    :pswitch_5
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->l:Z

    if-eqz p1, :cond_7

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_7

    :cond_7
    sget-object p1, Lcom/android/billingclient/api/i0;->p:Lcom/android/billingclient/api/h;

    :goto_7
    return-object p1

    :pswitch_6
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->i:Z

    if-eqz p1, :cond_8

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_8

    :cond_8
    sget-object p1, Lcom/android/billingclient/api/i0;->o:Lcom/android/billingclient/api/h;

    :goto_8
    return-object p1

    :pswitch_7
    iget-boolean p1, p0, Lcom/android/billingclient/api/e;->h:Z

    if-eqz p1, :cond_9

    sget-object p1, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_9

    :cond_9
    sget-object p1, Lcom/android/billingclient/api/i0;->n:Lcom/android/billingclient/api/h;

    :goto_9
    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x1928a0a1 -> :sswitch_8
        0x17841 -> :sswitch_7
        0x17c22 -> :sswitch_6
        0x18003 -> :sswitch_5
        0x183e4 -> :sswitch_4
        0x187c5 -> :sswitch_3
        0x18ba6 -> :sswitch_2
        0xc5ff92e -> :sswitch_1
        0x7674caf6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;
    .locals 31

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "proxyPackageVersion"

    const-string v9, "BUY_INTENT"

    invoke-virtual/range {p0 .. p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_0
    sget-object v0, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    :goto_1
    invoke-direct {v8, v0}, Lcom/android/billingclient/api/e;->q(Lcom/android/billingclient/api/h;)Lcom/android/billingclient/api/h;

    return-object v0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/g;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/g;->g()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lj/d/a/c/f/h/g0;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/SkuDetails;

    invoke-static {v3, v4}, Lj/d/a/c/f/h/g0;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/g$b;

    if-eqz v5, :cond_22

    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v10

    const-string v11, "subs"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-string v12, "BillingClient"

    if-eqz v11, :cond_2

    iget-boolean v11, v8, Lcom/android/billingclient/api/e;->h:Z

    if-eqz v11, :cond_1

    goto :goto_2

    :cond_1
    const-string v0, "Current client doesn\'t support subscriptions."

    invoke-static {v12, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->n:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/g;->p()Z

    move-result v11

    if-eqz v11, :cond_4

    iget-boolean v11, v8, Lcom/android/billingclient/api/e;->k:Z

    if-eqz v11, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    invoke-static {v12, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->h:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_4
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v13, 0x1

    if-le v11, v13, :cond_6

    iget-boolean v11, v8, Lcom/android/billingclient/api/e;->r:Z

    if-eqz v11, :cond_5

    goto :goto_4

    :cond_5
    const-string v0, "Current client doesn\'t support multi-item purchases."

    invoke-static {v12, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->r:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_8

    iget-boolean v11, v8, Lcom/android/billingclient/api/e;->s:Z

    if-eqz v11, :cond_7

    goto :goto_5

    :cond_7
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    invoke-static {v12, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->t:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_8
    :goto_5
    iget-boolean v11, v8, Lcom/android/billingclient/api/e;->k:Z

    if-eqz v11, :cond_20

    iget-boolean v11, v8, Lcom/android/billingclient/api/e;->m:Z

    iget-boolean v14, v8, Lcom/android/billingclient/api/e;->t:Z

    iget-boolean v15, v8, Lcom/android/billingclient/api/e;->u:Z

    iget-object v4, v8, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    move-object/from16 v13, p2

    invoke-static {v13, v11, v14, v15, v4}, Lj/d/a/c/f/h/k;->f(Lcom/android/billingclient/api/g;ZZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v11

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const-string v14, "additionalSkuTypes"

    const-string v15, "additionalSkus"

    const-string v13, "skuDetailsTokens"

    move-object/from16 v17, v9

    const-string v9, "SKU_OFFER_ID_TOKEN_LIST"

    if-nez v4, :cond_12

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v18, v10

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    :goto_6
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_b

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->j()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->isEmpty()Z

    move-result v27

    if-nez v27, :cond_9

    move-object/from16 v27, v12

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->j()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    move-object/from16 v27, v12

    :goto_7
    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v28, v6

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->e()I

    move-result v29

    move-object/from16 v30, v5

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    const/16 v16, 0x1

    xor-int/lit8 v12, v12, 0x1

    or-int v22, v22, v12

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    or-int v23, v23, v6

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v29, :cond_a

    const/4 v6, 0x1

    goto :goto_8

    :cond_a
    const/4 v6, 0x0

    :goto_8
    or-int v24, v24, v6

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    or-int v25, v25, v6

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v12, v27

    move-object/from16 v6, v28

    move-object/from16 v5, v30

    goto :goto_6

    :cond_b
    move-object/from16 v30, v5

    move-object/from16 v28, v6

    move-object/from16 v27, v12

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v11, v13, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_c
    if-eqz v22, :cond_d

    invoke-virtual {v11, v9, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_d
    if-eqz v23, :cond_e

    const-string v0, "SKU_OFFER_ID_LIST"

    invoke-virtual {v11, v0, v10}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_e
    if-eqz v24, :cond_f

    const-string v0, "SKU_OFFER_TYPE_LIST"

    invoke-virtual {v11, v0, v7}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_f
    if-eqz v25, :cond_10

    const-string v0, "SKU_SERIALIZED_DOCID_LIST"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_10
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_14

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x1

    :goto_9
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_11

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_11
    invoke-virtual {v11, v15, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v11, v14, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_a

    :cond_12
    move-object/from16 v20, v1

    move-object/from16 v30, v5

    move-object/from16 v28, v6

    move-object/from16 v19, v7

    move-object/from16 v18, v10

    move-object/from16 v27, v12

    const/4 v1, 0x1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-gtz v6, :cond_1f

    invoke-virtual {v11, v9, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_13

    invoke-virtual {v11, v13, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_14

    invoke-virtual {v11, v15, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v11, v14, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_14
    :goto_a
    invoke-virtual {v11, v9}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-boolean v0, v8, Lcom/android/billingclient/api/e;->p:Z

    if-eqz v0, :cond_15

    goto :goto_b

    :cond_15
    sget-object v0, Lcom/android/billingclient/api/i0;->s:Lcom/android/billingclient/api/h;

    goto/16 :goto_1

    :cond_16
    :goto_b
    if-eqz v30, :cond_17

    invoke-virtual/range {v30 .. v30}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual/range {v30 .. v30}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v0

    const-string v2, "skuPackageName"

    invoke-virtual {v11, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v13, 0x1

    goto :goto_c

    :cond_17
    if-nez v28, :cond_1e

    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_c
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_18

    const-string v1, "accountName"

    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_19

    const-string v0, "Activity\'s intent is null."

    move-object/from16 v9, v27

    invoke-static {v9, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    :cond_19
    move-object/from16 v9, v27

    const-string v1, "PROXY_PACKAGE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "proxyPackage"

    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v8, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, v20

    :try_start_1
    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_d

    :catch_0
    move-object/from16 v1, v20

    :catch_1
    const-string v0, "package not found"

    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    :goto_d
    iget-boolean v0, v8, Lcom/android/billingclient/api/e;->s:Z

    if-eqz v0, :cond_1b

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    const/16 v0, 0x11

    const/16 v3, 0x11

    goto :goto_e

    :cond_1b
    iget-boolean v0, v8, Lcom/android/billingclient/api/e;->q:Z

    if-eqz v0, :cond_1c

    if-eqz v13, :cond_1c

    const/16 v0, 0xf

    const/16 v3, 0xf

    goto :goto_e

    :cond_1c
    iget-boolean v0, v8, Lcom/android/billingclient/api/e;->m:Z

    if-eqz v0, :cond_1d

    const/16 v0, 0x9

    const/16 v3, 0x9

    goto :goto_e

    :cond_1d
    const/4 v0, 0x6

    const/4 v3, 0x6

    :goto_e
    new-instance v0, Lcom/android/billingclient/api/r;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object/from16 v4, v19

    move-object/from16 v5, v18

    move-object/from16 v6, p2

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/r;-><init>(Lcom/android/billingclient/api/e;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/g;Landroid/os/Bundle;)V

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    move-object/from16 v1, p0

    move-object v2, v0

    goto :goto_f

    :cond_1e
    invoke-virtual/range {v28 .. v28}, Lcom/android/billingclient/api/g$b;->a()Lcom/android/billingclient/api/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/k;->c()Ljava/lang/String;

    const/4 v0, 0x0

    throw v0

    :cond_1f
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/g$b;

    invoke-virtual {v1}, Lcom/android/billingclient/api/g$b;->a()Lcom/android/billingclient/api/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/k;->d()Ljava/lang/String;

    throw v0

    :cond_20
    move-object/from16 v19, v7

    move-object/from16 v17, v9

    move-object/from16 v18, v10

    move-object v9, v12

    new-instance v2, Lcom/android/billingclient/api/s;

    move-object/from16 v1, v18

    move-object/from16 v0, v19

    invoke-direct {v2, v8, v0, v1}, Lcom/android/billingclient/api/s;-><init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    move-object/from16 v1, p0

    :goto_f
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/e;->t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x1388

    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-static {v0, v9}, Lj/d/a/c/f/h/k;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v9}, Lj/d/a/c/f/h/k;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_21

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to buy item, Error response code: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/billingclient/api/h;->c()Lcom/android/billingclient/api/h$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/h$a;->c(I)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/h$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/h$a;->a()Lcom/android/billingclient/api/h;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/android/billingclient/api/e;->q(Lcom/android/billingclient/api/h;)Lcom/android/billingclient/api/h;

    return-object v0

    :cond_21
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/android/billingclient/api/ProxyBillingActivity;

    move-object/from16 v3, p1

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v2, v17

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    sget-object v0, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    return-object v0

    :catch_2
    move-exception v0

    const-string v1, "Exception while launching billing flow. Try to reconnect"

    invoke-static {v9, v1, v0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :catch_3
    move-exception v0

    goto :goto_10

    :catch_4
    move-exception v0

    :goto_10
    const-string v1, "Time out while launching billing flow. Try to reconnect"

    invoke-static {v9, v1, v0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->m:Lcom/android/billingclient/api/h;

    goto/16 :goto_1

    :cond_22
    move-object/from16 v28, v6

    invoke-virtual/range {v28 .. v28}, Lcom/android/billingclient/api/g$b;->a()Lcom/android/billingclient/api/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/k;->a()Ljava/lang/String;

    const/4 v0, 0x0

    goto :goto_12

    :goto_11
    throw v0

    :goto_12
    goto :goto_11
.end method

.method public f(Ljava/lang/String;Lcom/android/billingclient/api/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/e;->u(Ljava/lang/String;Lcom/android/billingclient/api/l;)V

    return-void
.end method

.method public final g(Lcom/android/billingclient/api/n;Lcom/android/billingclient/api/o;)V
    .locals 12

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    :goto_0
    invoke-interface {p2, p1, v1}, Lcom/android/billingclient/api/o;->onSkuDetailsResponse(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/n;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/android/billingclient/api/n;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v2, "BillingClient"

    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Lcom/android/billingclient/api/q0;

    invoke-direct {v2, v1}, Lcom/android/billingclient/api/q0;-><init>(Lcom/android/billingclient/api/p0;)V

    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/q0;->a(Ljava/lang/String;)Lcom/android/billingclient/api/q0;

    invoke-virtual {v2}, Lcom/android/billingclient/api/q0;->b()Lcom/android/billingclient/api/s0;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/android/billingclient/api/a1;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p0

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/android/billingclient/api/a1;-><init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/android/billingclient/api/o;)V

    new-instance v10, Lcom/android/billingclient/api/q;

    invoke-direct {v10, p2}, Lcom/android/billingclient/api/q;-><init>(Lcom/android/billingclient/api/o;)V

    const-wide/16 v8, 0x7530

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->p()Landroid/os/Handler;

    move-result-object v11

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v6 .. v11}, Lcom/android/billingclient/api/e;->t(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->r()Lcom/android/billingclient/api/h;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    const-string p1, "Please fix the input params. The list of SKUs can\'t be empty - set SKU list or SkuWithOffer list."

    invoke-static {v2, p1}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->e:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_4
    const-string p1, "Please fix the input params. SKU type can\'t be empty."

    invoke-static {v2, p1}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i0;->f:Lcom/android/billingclient/api/h;

    goto :goto_0
.end method

.method public final h(Lcom/android/billingclient/api/f;)V
    .locals 7

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->j()Z

    move-result v0

    const-string v1, "BillingClient"

    if-eqz v0, :cond_0

    const-string v0, "Service connection is valid. No need to re-initialize."

    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->onBillingSetupFinished(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const-string v0, "Client is already in the process of connecting to billing service."

    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->d:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->onBillingSetupFinished(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_1
    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    const-string v0, "Client was already closed and can\'t be reused. Please create another instance."

    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->l:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->onBillingSetupFinished(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_2
    iput v2, p0, Lcom/android/billingclient/api/e;->a:I

    iget-object v0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/y0;

    invoke-virtual {v0}, Lcom/android/billingclient/api/y0;->d()V

    const-string v0, "Starting in-app billing setup."

    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/b0;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/android/billingclient/api/b0;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/f;Lcom/android/billingclient/api/a0;)V

    iput-object v0, p0, Lcom/android/billingclient/api/e;->g:Lcom/android/billingclient/api/b0;

    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.android.vending"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v4, :cond_5

    iget-object v6, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    new-instance v3, Landroid/content/ComponentName;

    invoke-direct {v3, v6, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    const-string v3, "playBillingLibraryVersion"

    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/billingclient/api/e;->g:Lcom/android/billingclient/api/b0;

    invoke-virtual {v0, v4, v3, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Service was bonded successfully."

    invoke-static {v1, p1}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "Connection to Billing service is blocked."

    goto :goto_0

    :cond_4
    const-string v0, "The device doesn\'t have valid Play Store."

    :goto_0
    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iput v5, p0, Lcom/android/billingclient/api/e;->a:I

    const-string v0, "Billing service unavailable on device."

    invoke-static {v1, v0}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->c:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->onBillingSetupFinished(Lcom/android/billingclient/api/h;)V

    return-void
.end method

.method public final j()Z
    .locals 2

    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->g:Lcom/android/billingclient/api/b0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final synthetic o(Lcom/android/billingclient/api/h;)V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/y0;

    invoke-virtual {v0}, Lcom/android/billingclient/api/y0;->c()Lcom/android/billingclient/api/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/y0;

    invoke-virtual {v0}, Lcom/android/billingclient/api/y0;->c()Lcom/android/billingclient/api/m;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/m;->onPurchasesUpdated(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/y0;

    invoke-virtual {p1}, Lcom/android/billingclient/api/y0;->b()Lcom/android/billingclient/api/l0;

    const-string p1, "BillingClient"

    const-string v0, "No valid listener is set in BroadcastManager"

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic x(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/g;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    iget-object v0, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    iget-object p4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lj/d/a/c/f/h/n;->S(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method final synthetic y(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 6

    iget-object v0, p0, Lcom/android/billingclient/api/e;->f:Lj/d/a/c/f/h/n;

    iget-object v1, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x3

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Lj/d/a/c/f/h/n;->K0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
