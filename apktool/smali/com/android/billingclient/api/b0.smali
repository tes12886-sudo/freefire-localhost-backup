.class final Lcom/android/billingclient/api/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private c:Lcom/android/billingclient/api/f;

.field final synthetic d:Lcom/android/billingclient/api/e;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/f;Lcom/android/billingclient/api/a0;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b0;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b0;->b:Z

    iput-object p2, p0, Lcom/android/billingclient/api/b0;->c:Lcom/android/billingclient/api/f;

    return-void
.end method

.method private final c(Lcom/android/billingclient/api/h;)V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b0;->c:Lcom/android/billingclient/api/f;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lcom/android/billingclient/api/f;->onBillingSetupFinished(Lcom/android/billingclient/api/h;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method final synthetic a()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/android/billingclient/api/b0;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "accountName"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    const/4 v1, 0x3

    const/4 v3, 0x0

    :try_start_1
    iget-object v4, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v4}, Lcom/android/billingclient/api/e;->w(Lcom/android/billingclient/api/e;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v5, 0x11

    const/16 v6, 0x11

    const/4 v7, 0x3

    :goto_1
    if-lt v6, v1, :cond_4

    if-nez v0, :cond_2

    :try_start_2
    iget-object v8, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v8}, Lcom/android/billingclient/api/e;->C(Lcom/android/billingclient/api/e;)Lj/d/a/c/f/h/n;

    move-result-object v8

    const-string v9, "subs"

    invoke-interface {v8, v6, v4, v9}, Lj/d/a/c/f/h/n;->G(ILjava/lang/String;Ljava/lang/String;)I

    move-result v7

    goto :goto_2

    :cond_2
    iget-object v8, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v8}, Lcom/android/billingclient/api/e;->C(Lcom/android/billingclient/api/e;)Lj/d/a/c/f/h/n;

    move-result-object v8

    const-string v9, "subs"

    invoke-interface {v8, v6, v4, v9, v0}, Lj/d/a/c/f/h/n;->y0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result v7

    :goto_2
    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_3
    iget-object v8, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    const/4 v9, 0x5

    const/4 v10, 0x1

    if-lt v6, v9, :cond_5

    const/4 v9, 0x1

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    invoke-static {v8, v9}, Lcom/android/billingclient/api/e;->m(Lcom/android/billingclient/api/e;Z)V

    iget-object v8, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    if-lt v6, v1, :cond_6

    const/4 v9, 0x1

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    :goto_5
    invoke-static {v8, v9}, Lcom/android/billingclient/api/e;->n(Lcom/android/billingclient/api/e;Z)V

    if-ge v6, v1, :cond_7

    const-string v6, "BillingClient"

    const-string v8, "In-app billing API does not support subscription on this device."

    invoke-static {v6, v8}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    const/16 v6, 0x11

    :goto_6
    if-lt v6, v1, :cond_a

    if-nez v0, :cond_8

    iget-object v8, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v8}, Lcom/android/billingclient/api/e;->C(Lcom/android/billingclient/api/e;)Lj/d/a/c/f/h/n;

    move-result-object v8

    const-string v9, "inapp"

    invoke-interface {v8, v6, v4, v9}, Lj/d/a/c/f/h/n;->G(ILjava/lang/String;Ljava/lang/String;)I

    move-result v7

    goto :goto_7

    :cond_8
    iget-object v8, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v8}, Lcom/android/billingclient/api/e;->C(Lcom/android/billingclient/api/e;)Lj/d/a/c/f/h/n;

    move-result-object v8

    const-string v9, "inapp"

    invoke-interface {v8, v6, v4, v9, v0}, Lj/d/a/c/f/h/n;->y0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result v7

    :goto_7
    if-nez v7, :cond_9

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0, v6}, Lcom/android/billingclient/api/e;->I(Lcom/android/billingclient/api/e;I)V

    goto :goto_8

    :cond_9
    add-int/lit8 v6, v6, -0x1

    goto :goto_6

    :cond_a
    :goto_8
    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    if-lt v4, v5, :cond_b

    const/4 v4, 0x1

    goto :goto_9

    :cond_b
    const/4 v4, 0x0

    :goto_9
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->O(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0x10

    if-lt v4, v5, :cond_c

    const/4 v4, 0x1

    goto :goto_a

    :cond_c
    const/4 v4, 0x0

    :goto_a
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->N(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0xf

    if-lt v4, v5, :cond_d

    const/4 v4, 0x1

    goto :goto_b

    :cond_d
    const/4 v4, 0x0

    :goto_b
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->M(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0xe

    if-lt v4, v5, :cond_e

    const/4 v4, 0x1

    goto :goto_c

    :cond_e
    const/4 v4, 0x0

    :goto_c
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->L(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0xc

    if-lt v4, v5, :cond_f

    const/4 v4, 0x1

    goto :goto_d

    :cond_f
    const/4 v4, 0x0

    :goto_d
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->K(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0xa

    if-lt v4, v5, :cond_10

    const/4 v4, 0x1

    goto :goto_e

    :cond_10
    const/4 v4, 0x0

    :goto_e
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->J(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0x9

    if-lt v4, v5, :cond_11

    const/4 v4, 0x1

    goto :goto_f

    :cond_11
    const/4 v4, 0x0

    :goto_f
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->k(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/16 v5, 0x8

    if-lt v4, v5, :cond_12

    const/4 v4, 0x1

    goto :goto_10

    :cond_12
    const/4 v4, 0x0

    :goto_10
    invoke-static {v0, v4}, Lcom/android/billingclient/api/e;->Q(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v4

    const/4 v5, 0x6

    if-lt v4, v5, :cond_13

    goto :goto_11

    :cond_13
    const/4 v10, 0x0

    :goto_11
    invoke-static {v0, v10}, Lcom/android/billingclient/api/e;->P(Lcom/android/billingclient/api/e;Z)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0}, Lcom/android/billingclient/api/e;->v(Lcom/android/billingclient/api/e;)I

    move-result v0

    if-ge v0, v1, :cond_14

    const-string v0, "BillingClient"

    const-string v1, "In-app billing API version 3 is not supported on this device."

    invoke-static {v0, v1}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_14
    if-nez v7, :cond_15

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/android/billingclient/api/e;->H(Lcom/android/billingclient/api/e;I)V

    goto :goto_13

    :cond_15
    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0, v3}, Lcom/android/billingclient/api/e;->H(Lcom/android/billingclient/api/e;I)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0, v2}, Lcom/android/billingclient/api/e;->l(Lcom/android/billingclient/api/e;Lj/d/a/c/f/h/n;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_13

    :catch_0
    move-exception v0

    move v1, v7

    goto :goto_12

    :catch_1
    move-exception v0

    :goto_12
    const-string v4, "BillingClient"

    const-string v5, "Exception while checking if billing is supported; try to reconnect"

    invoke-static {v4, v5, v0}, Lj/d/a/c/f/h/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0, v3}, Lcom/android/billingclient/api/e;->H(Lcom/android/billingclient/api/e;I)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {v0, v2}, Lcom/android/billingclient/api/e;->l(Lcom/android/billingclient/api/e;Lj/d/a/c/f/h/n;)V

    move v7, v1

    :goto_13
    if-nez v7, :cond_16

    sget-object v0, Lcom/android/billingclient/api/i0;->k:Lcom/android/billingclient/api/h;

    goto :goto_14

    :cond_16
    sget-object v0, Lcom/android/billingclient/api/i0;->a:Lcom/android/billingclient/api/h;

    :goto_14
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/b0;->c(Lcom/android/billingclient/api/h;)V

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_16

    :goto_15
    throw v1

    :goto_16
    goto :goto_15
.end method

.method final synthetic b()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/billingclient/api/e;->H(Lcom/android/billingclient/api/e;I)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/billingclient/api/e;->l(Lcom/android/billingclient/api/e;Lj/d/a/c/f/h/n;)V

    sget-object v0, Lcom/android/billingclient/api/i0;->m:Lcom/android/billingclient/api/h;

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/b0;->c(Lcom/android/billingclient/api/h;)V

    return-void
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    const-string p1, "BillingClient"

    const-string v0, "Billing service connected."

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {p2}, Lj/d/a/c/f/h/m;->j(Landroid/os/IBinder;)Lj/d/a/c/f/h/n;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/e;->l(Lcom/android/billingclient/api/e;Lj/d/a/c/f/h/n;)V

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    new-instance v1, Lcom/android/billingclient/api/y;

    invoke-direct {v1, p0}, Lcom/android/billingclient/api/y;-><init>(Lcom/android/billingclient/api/b0;)V

    new-instance v4, Lcom/android/billingclient/api/z;

    invoke-direct {v4, p0}, Lcom/android/billingclient/api/z;-><init>(Lcom/android/billingclient/api/b0;)V

    invoke-static {v0}, Lcom/android/billingclient/api/e;->z(Lcom/android/billingclient/api/e;)Landroid/os/Handler;

    move-result-object v5

    const-wide/16 v2, 0x7530

    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/e;->G(Lcom/android/billingclient/api/e;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    invoke-static {p1}, Lcom/android/billingclient/api/e;->A(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b0;->c(Lcom/android/billingclient/api/h;)V

    :cond_0
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "BillingClient"

    const-string v0, "Billing service disconnected."

    invoke-static {p1, v0}, Lj/d/a/c/f/h/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/e;->l(Lcom/android/billingclient/api/e;Lj/d/a/c/f/h/n;)V

    iget-object p1, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/e;->H(Lcom/android/billingclient/api/e;I)V

    iget-object p1, p0, Lcom/android/billingclient/api/b0;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b0;->c:Lcom/android/billingclient/api/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/android/billingclient/api/f;->onBillingServiceDisconnected()V

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
