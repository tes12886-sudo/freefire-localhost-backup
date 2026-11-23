.class Lcom/garena/pay/android/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/pay/android/c$h;,
        Lcom/garena/pay/android/c$g;
    }
.end annotation


# instance fields
.field private a:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/garena/pay/android/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/garena/pay/android/e;

.field private c:Lcom/garena/pay/android/d;

.field private d:Lcom/garena/pay/android/c$h;

.field private transient e:Lcom/garena/pay/android/GGPayActivity;

.field private transient f:Landroid/app/ProgressDialog;

.field private transient g:Lcom/garena/pay/android/c$g;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    sget-object v0, Lcom/garena/pay/android/c$h;->b:Lcom/garena/pay/android/c$h;

    iput-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    return-void
.end method

.method private A()V
    .locals 3

    iget-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    iget-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    new-instance v1, Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method private B(Lcom/garena/pay/android/d;)V
    .locals 3

    invoke-direct {p0}, Lcom/garena/pay/android/c;->A()V

    invoke-static {}, Lcom/beetalk/sdk/t/e;->d()Lcom/beetalk/sdk/t/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->n()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lcom/beetalk/sdk/t/e;->e(Landroid/content/Context;ZLcom/garena/pay/android/d;)Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/c$a;

    invoke-direct {v1, p0, p1}, Lcom/garena/pay/android/c$a;-><init>(Lcom/garena/pay/android/c;Lcom/garena/pay/android/d;)V

    sget-object p1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    return-void
.end method

.method static synthetic a(Lcom/garena/pay/android/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/garena/pay/android/c;->o()V

    return-void
.end method

.method static synthetic b(Lcom/garena/pay/android/c;Lcom/garena/pay/android/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/garena/pay/android/c;->l(Lcom/garena/pay/android/b;)V

    return-void
.end method

.method static synthetic c(Lcom/garena/pay/android/c;)Lcom/garena/pay/android/d;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    return-object p0
.end method

.method static synthetic d(Lcom/garena/pay/android/c;Lcom/garena/pay/android/d;)Lcom/garena/pay/android/d;
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    return-object p1
.end method

.method static synthetic e(Lcom/garena/pay/android/c;Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    return-object p1
.end method

.method static synthetic f(Lcom/garena/pay/android/c;Lcom/garena/pay/android/d;Lcom/beetalk/sdk/networking/model/ChannelsResp;)Ljava/util/LinkedHashMap;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/garena/pay/android/c;->t(Lcom/garena/pay/android/d;Lcom/beetalk/sdk/networking/model/ChannelsResp;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lcom/garena/pay/android/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/garena/pay/android/c;->v()V

    return-void
.end method

.method static synthetic h(Lcom/garena/pay/android/c;Lcom/beetalk/sdk/u/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/garena/pay/android/c;->p(Lcom/beetalk/sdk/u/j;)V

    return-void
.end method

.method static synthetic i(Lcom/garena/pay/android/c;Lcom/garena/pay/android/c$h;)Lcom/garena/pay/android/c$h;
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    return-object p1
.end method

.method static synthetic j(Lcom/garena/pay/android/c;)Lcom/garena/pay/android/e;
    .locals 0

    iget-object p0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    return-object p0
.end method

.method static synthetic k(Lcom/garena/pay/android/c;Lcom/garena/pay/android/e;)Lcom/garena/pay/android/e;
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    return-object p1
.end method

.method private l(Lcom/garena/pay/android/b;)V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/beetalk/sdk/u/j;->a(Lcom/garena/pay/android/d;Lcom/garena/pay/android/b;Ljava/lang/String;)Lcom/beetalk/sdk/u/j;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/garena/pay/android/c;->p(Lcom/beetalk/sdk/u/j;)V

    return-void
.end method

.method private o()V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private p(Lcom/beetalk/sdk/u/j;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/c;->g:Lcom/garena/pay/android/c$g;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/garena/pay/android/c$g;->a(Lcom/beetalk/sdk/u/j;)V

    :cond_1
    return-void
.end method

.method private t(Lcom/garena/pay/android/d;Lcom/beetalk/sdk/networking/model/ChannelsResp;)Ljava/util/LinkedHashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/garena/pay/android/d;",
            "Lcom/beetalk/sdk/networking/model/ChannelsResp;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/garena/pay/android/e;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string v1, "JSON From Payment Server %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/beetalk/sdk/networking/model/ChannelsResp;->getChannels()Ljava/util/List;

    move-result-object p2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/garena/pay/android/data/GGPayment$PaymentChannel;

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$PaymentChannel;->getItems()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$PaymentChannel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/garena/pay/android/data/GGPayment$PaymentChannel;->getChannelId()Ljava/lang/String;

    move-result-object v2

    const v3, 0x3116d

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lcom/garena/pay/android/d;->c()Lcom/garena/pay/android/data/GGPayment;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/garena/pay/android/data/GGPayment;->getAppServerId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2}, Lcom/garena/pay/android/data/GGPayment;->getRoleId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v4

    :goto_1
    new-instance v5, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;

    iget-object v6, p0, Lcom/garena/pay/android/c;->e:Lcom/garena/pay/android/GGPayActivity;

    invoke-direct {v5, v6, v4, v2}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;-><init>(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v5, v1}, Lcom/garena/pay/android/e;->p(Lcom/garena/pay/android/data/GGPayment$PaymentChannel;)V

    invoke-virtual {v5}, Lcom/garena/pay/android/NewGoogleIabPayRequestHandler;->C()Li/i;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method private v()V
    .locals 5

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v0}, Lcom/garena/pay/android/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/x/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v1}, Lcom/garena/pay/android/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/garena/pay/android/e;

    iput-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    sget-object v2, Lcom/garena/pay/android/c$h;->c:Lcom/garena/pay/android/c$h;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/garena/pay/android/e;

    iput-object v2, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v0}, Lcom/garena/pay/android/d;->b()Lcom/garena/pay/android/data/GGPayment$Denomination;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    invoke-virtual {v0}, Lcom/garena/pay/android/e;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/garena/pay/android/c$h;->e:Lcom/garena/pay/android/c$h;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    iget-object v2, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    invoke-virtual {v2}, Lcom/garena/pay/android/e;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/garena/pay/android/d;->j(Ljava/util/List;)V

    sget-object v0, Lcom/garena/pay/android/c$h;->d:Lcom/garena/pay/android/c$h;

    :goto_1
    iput-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    :cond_3
    iget-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v0}, Lcom/garena/pay/android/d;->b()Lcom/garena/pay/android/data/GGPayment$Denomination;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    iget-object v2, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    invoke-virtual {v2}, Lcom/garena/pay/android/e;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/garena/pay/android/d;->j(Ljava/util/List;)V

    sget-object v0, Lcom/garena/pay/android/c$h;->e:Lcom/garena/pay/android/c$h;

    iput-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    :cond_4
    sget-object v0, Lcom/garena/pay/android/c$f;->a:[I

    iget-object v2, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/garena/pay/android/c;->A()V

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v0}, Lcom/garena/pay/android/d;->b()Lcom/garena/pay/android/data/GGPayment$Denomination;

    move-result-object v0

    invoke-virtual {v0}, Lcom/garena/pay/android/data/GGPayment$Denomination;->getItemId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    iget-object v2, p0, Lcom/garena/pay/android/c;->e:Lcom/garena/pay/android/GGPayActivity;

    iget-object v3, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    new-instance v4, Lcom/garena/pay/android/c$c;

    invoke-direct {v4, p0}, Lcom/garena/pay/android/c$c;-><init>(Lcom/garena/pay/android/c;)V

    invoke-virtual {v1, v2, v3, v0, v4}, Lcom/garena/pay/android/e;->q(Landroid/app/Activity;Lcom/garena/pay/android/d;Ljava/lang/String;Li/g;)Li/i;

    move-result-object v0

    new-instance v1, Lcom/garena/pay/android/c$b;

    invoke-direct {v1, p0}, Lcom/garena/pay/android/c$b;-><init>(Lcom/garena/pay/android/c;)V

    sget-object v2, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    goto :goto_2

    :cond_6
    sget-object v0, Lcom/garena/pay/android/b;->R:Lcom/garena/pay/android/b;

    invoke-direct {p0, v0}, Lcom/garena/pay/android/c;->l(Lcom/garena/pay/android/b;)V

    :goto_2
    sget-object v0, Lcom/garena/pay/android/c$h;->f:Lcom/garena/pay/android/c$h;

    iput-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    goto :goto_3

    :cond_7
    invoke-direct {p0}, Lcom/garena/pay/android/c;->z()V

    goto :goto_3

    :cond_8
    invoke-direct {p0}, Lcom/garena/pay/android/c;->y()V

    :goto_3
    return-void
.end method

.method private y()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/garena/pay/android/k/h;->a(Z)V

    invoke-static {v0}, Lcom/garena/pay/android/k/a;->a(Z)V

    new-instance v0, Lcom/garena/pay/android/c$d;

    invoke-direct {v0, p0}, Lcom/garena/pay/android/c$d;-><init>(Lcom/garena/pay/android/c;)V

    invoke-static {v0}, Lcom/garena/pay/android/k/h;->c(Lcom/garena/pay/android/k/h$b;)V

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    invoke-static {v0, v1}, Lcom/garena/pay/android/k/h;->b(Landroid/app/Activity;Ljava/util/HashMap;)V

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lj/c/b/e;->j:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/pay/android/k/h;->d(Landroid/view/View;)V

    return-void
.end method

.method private z()V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/garena/pay/android/k/h;->a(Z)V

    invoke-static {v0}, Lcom/garena/pay/android/k/a;->a(Z)V

    new-instance v0, Lcom/garena/pay/android/c$e;

    invoke-direct {v0, p0}, Lcom/garena/pay/android/c$e;-><init>(Lcom/garena/pay/android/c;)V

    invoke-static {v0}, Lcom/garena/pay/android/k/a;->c(Lcom/garena/pay/android/k/a$b;)V

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v1}, Lcom/garena/pay/android/d;->d()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    invoke-virtual {v2}, Lcom/garena/pay/android/d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/garena/pay/android/k/a;->b(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lj/c/b/e;->j:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/pay/android/k/a;->d(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method m()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/c;->e:Lcom/garena/pay/android/GGPayActivity;

    return-object v0
.end method

.method n()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/c;->e:Lcom/garena/pay/android/GGPayActivity;

    return-object v0
.end method

.method q()V
    .locals 3

    iget-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    invoke-virtual {v0}, Lcom/garena/pay/android/c$h;->d()Lcom/garena/pay/android/c$h;

    move-result-object v0

    iput-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    sget-object v1, Lcom/garena/pay/android/c$h;->b:Lcom/garena/pay/android/c$h;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/garena/pay/android/c;->v()V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0}, Lcom/garena/pay/android/c;->m()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x10a0001

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method r()V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/c;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/garena/pay/android/e;

    invoke-virtual {v1}, Lcom/garena/pay/android/e;->n()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/garena/pay/android/c;->f:Landroid/app/ProgressDialog;

    :cond_1
    return-void
.end method

.method s(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/garena/pay/android/c;->b:Lcom/garena/pay/android/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/garena/pay/android/e;->o(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method u(Lcom/garena/pay/android/d;)V
    .locals 2

    iget-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    sget-object v1, Lcom/garena/pay/android/c$h;->f:Lcom/garena/pay/android/c$h;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/garena/pay/android/c;->c:Lcom/garena/pay/android/d;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/garena/pay/android/c$h;->b:Lcom/garena/pay/android/c$h;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/garena/pay/android/c;->v()V

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lcom/garena/pay/android/c$h;->c:Lcom/garena/pay/android/c$h;

    iput-object v0, p0, Lcom/garena/pay/android/c;->d:Lcom/garena/pay/android/c$h;

    invoke-direct {p0, p1}, Lcom/garena/pay/android/c;->B(Lcom/garena/pay/android/d;)V

    :goto_1
    return-void
.end method

.method w(Lcom/garena/pay/android/GGPayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c;->e:Lcom/garena/pay/android/GGPayActivity;

    return-void
.end method

.method x(Lcom/garena/pay/android/c$g;)V
    .locals 0

    iput-object p1, p0, Lcom/garena/pay/android/c;->g:Lcom/garena/pay/android/c$g;

    return-void
.end method
