.class public Lcom/beetalk/sdk/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/g$o;,
        Lcom/beetalk/sdk/g$n;,
        Lcom/beetalk/sdk/g$l;,
        Lcom/beetalk/sdk/g$m;
    }
.end annotation


# static fields
.field private static volatile n:Landroid/content/Context;

.field private static o:Lcom/beetalk/sdk/g;

.field private static p:Lcom/beetalk/sdk/g;

.field private static q:Lcom/beetalk/sdk/g;


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beetalk/sdk/g$n;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;

.field private d:Lcom/beetalk/sdk/t/k;

.field private e:Lcom/beetalk/sdk/c;

.field private f:Lcom/beetalk/sdk/q;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/Integer;

.field private j:Lcom/beetalk/sdk/g$o;

.field private k:Lcom/beetalk/sdk/u/a;

.field private l:I

.field private m:I


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/c;ILcom/beetalk/sdk/g$o;Lcom/beetalk/sdk/t/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Ljava/lang/Object;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/beetalk/sdk/g;->c:Ljava/lang/Object;

    sget-object p4, Lcom/beetalk/sdk/p$a;->a:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/beetalk/sdk/g;->i:Ljava/lang/Integer;

    const/4 p4, 0x0

    iput p4, p0, Lcom/beetalk/sdk/g;->l:I

    if-eqz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-static {p1}, Lcom/beetalk/sdk/x/d;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    if-eqz p8, :cond_1

    goto :goto_0

    :cond_1
    new-instance p8, Lcom/beetalk/sdk/t/j;

    invoke-direct {p8, p1}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object p8, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    invoke-virtual {p8}, Lcom/beetalk/sdk/t/k;->h()Lcom/beetalk/sdk/u/a;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object p8

    invoke-static {p7, p8}, Lcom/beetalk/sdk/g$o;->d(Lcom/beetalk/sdk/g$o;Lcom/beetalk/sdk/u/l;)Z

    move-result p8

    if-eqz p8, :cond_2

    invoke-virtual {p4}, Lcom/beetalk/sdk/u/a;->i()Z

    move-result p8

    if-eqz p8, :cond_2

    iput-object p4, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    :cond_2
    const-string p4, "applicationId"

    invoke-static {p2, p4}, Lcom/beetalk/sdk/x/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/beetalk/sdk/g;->g:Ljava/lang/String;

    iput-object p3, p0, Lcom/beetalk/sdk/g;->h:Ljava/lang/String;

    iput-object p5, p0, Lcom/beetalk/sdk/g;->e:Lcom/beetalk/sdk/c;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/beetalk/sdk/g;->a:Landroid/os/Handler;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/beetalk/sdk/g;->b:Ljava/util/List;

    iput p6, p0, Lcom/beetalk/sdk/g;->m:I

    iput-object p7, p0, Lcom/beetalk/sdk/g;->j:Lcom/beetalk/sdk/g$o;

    iget-object p2, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    if-eqz p2, :cond_3

    sget-object p2, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    goto :goto_1

    :cond_3
    sget-object p2, Lcom/beetalk/sdk/q;->a:Lcom/beetalk/sdk/q;

    :goto_1
    iput-object p2, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-static {p1}, Lcom/beetalk/sdk/g;->J(Landroid/content/Context;)V

    sget-object p1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->j(Landroid/content/Context;)V

    sget-object p1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/beetalk/sdk/x/d;->g(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p1

    sget-object p2, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {p2}, Lcom/beetalk/sdk/x/d;->h(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    :cond_4
    if-eqz p1, :cond_5

    iput-object p1, p0, Lcom/beetalk/sdk/g;->i:Ljava/lang/Integer;

    :cond_5
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/c;ILcom/beetalk/sdk/g$o;Lcom/beetalk/sdk/t/k;Lcom/beetalk/sdk/g$e;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/beetalk/sdk/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/c;ILcom/beetalk/sdk/g$o;Lcom/beetalk/sdk/t/k;)V

    return-void
.end method

.method private A(Lcom/beetalk/sdk/d;)Landroid/content/Intent;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    const-class v2, Lcom/beetalk/sdk/BTLoginActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->c()Lcom/beetalk/sdk/b$c;

    move-result-object p1

    const-string v2, "request_extra"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method

.method public static J(Landroid/content/Context;)V
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p0, v0

    :cond_0
    sput-object p0, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    :cond_1
    return-void
.end method

.method private K(Lcom/beetalk/sdk/g$n;)V
    .locals 5

    sget-boolean v0, Lcom/beetalk/sdk/p$b;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/z/a;->a()Lcom/beetalk/sdk/z/a;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/g$k;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/g$k;-><init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/z/a;->b(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    sget-boolean v0, Lcom/beetalk/sdk/p$b;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    iput-object v0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    sget-object v0, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/beetalk/sdk/g;->l:I

    invoke-direct {p0, p1, p0, v1}, Lcom/beetalk/sdk/g;->O(Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object v0

    sget-object v2, Lcom/beetalk/sdk/u/l;->g:Lcom/beetalk/sdk/u/l;

    if-ne v0, v2, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beetalk/sdk/t/k;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v0

    invoke-virtual {v0, v3, v4, v2}, Lcom/beetalk/sdk/t/a;->j(JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    :cond_2
    :goto_0
    invoke-static {}, Lcom/beetalk/sdk/x/d;->k()I

    move-result v0

    add-int/lit16 v0, v0, -0xe10

    iget-object v2, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v2}, Lcom/beetalk/sdk/u/a;->d()I

    move-result v2

    if-gt v0, v2, :cond_3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lcom/beetalk/sdk/x/d;->k()I

    move-result v3

    iget-object v4, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v4}, Lcom/beetalk/sdk/u/a;->d()I

    move-result v4

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    const-string v2, "no need for another inspection - last %d minutes ago"

    invoke-static {v2, v0}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1, p0, v1}, Lcom/beetalk/sdk/g$n;->onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void

    :cond_3
    invoke-static {}, Lcom/beetalk/sdk/z/a;->a()Lcom/beetalk/sdk/z/a;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/g$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/g$a;-><init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/z/a;->b(Ljava/lang/Runnable;)V

    :cond_4
    return-void
.end method

.method private static M(Lcom/beetalk/sdk/g;)Z
    .locals 1

    if-eqz p0, :cond_1

    iget-object p0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    sget-object v0, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private O(Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/g;->a:Landroid/os/Handler;

    new-instance v1, Lcom/beetalk/sdk/g$j;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/beetalk/sdk/g$j;-><init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->d0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static P(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;
    .locals 7

    new-instance v6, Lcom/beetalk/sdk/d;

    sget-object v0, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/beetalk/sdk/d;-><init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;IZLjava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0, p1, v6}, Lcom/beetalk/sdk/g;->Q(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/g;

    move-result-object p0

    return-object p0
.end method

.method private static Q(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/g;
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v0

    const-string v1, "com.garena.msdk.app_platform_bind_token"

    if-eqz v0, :cond_0

    new-instance v2, Lcom/beetalk/sdk/t/j;

    invoke-direct {v2, p0, v1}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/g;->e0(Lcom/beetalk/sdk/t/k;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/beetalk/sdk/g$l;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object v0

    new-instance v2, Lcom/beetalk/sdk/t/j;

    invoke-direct {v2, p0, v1}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/g;->e0(Lcom/beetalk/sdk/t/k;)V

    invoke-static {v0}, Lcom/beetalk/sdk/g;->f0(Lcom/beetalk/sdk/g;)V

    :goto_0
    invoke-static {p0, p1, p2, p3, v0}, Lcom/beetalk/sdk/g;->V(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/g;

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object p0

    return-object p0
.end method

.method public static R(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;
    .locals 7

    new-instance v6, Lcom/beetalk/sdk/d;

    sget-object v0, Lcom/beetalk/sdk/p;->h:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/beetalk/sdk/d;-><init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;IZLjava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0, p1, v6}, Lcom/beetalk/sdk/g;->S(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/g;

    move-result-object p0

    return-object p0
.end method

.method private static S(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/g;
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    const-string v1, "com.garena.msdk.bind_token"

    if-eqz v0, :cond_0

    new-instance v2, Lcom/beetalk/sdk/t/j;

    invoke-direct {v2, p0, v1}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/g;->e0(Lcom/beetalk/sdk/t/k;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/beetalk/sdk/g$l;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object v0

    new-instance v2, Lcom/beetalk/sdk/t/j;

    invoke-direct {v2, p0, v1}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/g;->e0(Lcom/beetalk/sdk/t/k;)V

    invoke-static {v0}, Lcom/beetalk/sdk/g;->g0(Lcom/beetalk/sdk/g;)V

    :goto_0
    invoke-static {p0, p1, p2, p3, v0}, Lcom/beetalk/sdk/g;->V(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/g;

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object p0

    return-object p0
.end method

.method private static T(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/g;
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/beetalk/sdk/g$l;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/g;->h0(Lcom/beetalk/sdk/g;)V

    :cond_0
    invoke-static {p0, p1, p2, p3, v0}, Lcom/beetalk/sdk/g;->V(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/g;

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object p0

    return-object p0
.end method

.method public static U(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/d;

    invoke-direct {v0, p0, p2}, Lcom/beetalk/sdk/d;-><init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V

    invoke-static {p0, p1, p2, v0}, Lcom/beetalk/sdk/g;->T(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;)Lcom/beetalk/sdk/g;

    move-result-object p0

    return-object p0
.end method

.method private static V(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/d;Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/g;
    .locals 2

    invoke-static {p4}, Lcom/beetalk/sdk/g;->M(Lcom/beetalk/sdk/g;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/beetalk/sdk/g$d;->a:[I

    iget-object p1, p4, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-eq p0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p4, p2}, Lcom/beetalk/sdk/g;->K(Lcom/beetalk/sdk/g$n;)V

    return-object p4

    :cond_1
    new-instance p0, Lcom/beetalk/sdk/v/a;

    const-string p1, "Session is awaiting fulfillment. Please destroy before requesting for a new Session"

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/v/a;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p4, p0}, Lcom/beetalk/sdk/g$n;->onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_7

    if-nez p4, :cond_3

    new-instance p1, Lcom/beetalk/sdk/g$l;

    invoke-direct {p1, p0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object p4

    :cond_3
    iget-object p0, p4, Lcom/beetalk/sdk/g;->c:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-object p1, p4, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    sget-object v0, Lcom/beetalk/sdk/q;->a:Lcom/beetalk/sdk/q;

    if-ne p1, v0, :cond_4

    sget-object p1, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    iput-object p1, p4, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    :cond_4
    if-eqz p2, :cond_5

    iget-object p1, p4, Lcom/beetalk/sdk/g;->b:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    sget-object p1, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    invoke-direct {p4, v0, p1, v1}, Lcom/beetalk/sdk/g;->X(Lcom/beetalk/sdk/q;Lcom/beetalk/sdk/q;Ljava/lang/Exception;)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p4, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    if-ne p0, p1, :cond_6

    invoke-virtual {p3, p4}, Lcom/beetalk/sdk/d;->j(Lcom/beetalk/sdk/g;)V

    invoke-direct {p4, p3}, Lcom/beetalk/sdk/g;->q(Lcom/beetalk/sdk/d;)V

    :cond_6
    return-object p4

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_7
    :goto_0
    return-object v1
.end method

.method private X(Lcom/beetalk/sdk/q;Lcom/beetalk/sdk/q;Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->b:Ljava/util/List;

    monitor-enter v0

    if-ne p1, p2, :cond_0

    :try_start_0
    monitor-exit v0

    return-void

    :cond_0
    new-instance p1, Lcom/beetalk/sdk/g$c;

    invoke-direct {p1, p0, p3}, Lcom/beetalk/sdk/g$c;-><init>(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    iget-object p2, p0, Lcom/beetalk/sdk/g;->a:Landroid/os/Handler;

    invoke-static {p2, p1}, Lcom/beetalk/sdk/g;->d0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private Y(Lcom/beetalk/sdk/g$n;)Z
    .locals 9

    const-string v0, "open_id"

    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/g;->Z(Lcom/beetalk/sdk/g$n;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0}, Lcom/beetalk/sdk/g;->c0()V

    sget-object p1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    return v2

    :cond_1
    invoke-virtual {v1}, Lcom/facebook/a;->p()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    new-instance v0, Lcom/beetalk/sdk/g$b;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/g$b;-><init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V

    invoke-static {v0}, Lcom/facebook/a;->q(Lcom/facebook/a$a;)V

    return v4

    :cond_2
    invoke-virtual {v1}, Lcom/facebook/a;->m()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/beetalk/sdk/p;->k:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-virtual {v5}, Lcom/beetalk/sdk/g;->t()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "://auth/"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-virtual {v5}, Lcom/beetalk/sdk/g;->t()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-virtual {v6}, Lcom/beetalk/sdk/g;->u()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v3, v5, v6}, Lcom/beetalk/sdk/z/i/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_3

    :try_start_0
    sget-object p1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    sget-object p1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    :goto_0
    iput-object p1, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "access_token"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "expiry_time"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    const-string v7, "platform"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    new-instance v7, Lcom/beetalk/sdk/u/a;

    sget-object v8, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    invoke-direct {v7, v3, v8, v1}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    iput-object v7, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    if-ne v1, v4, :cond_4

    sget-object v1, Lcom/beetalk/sdk/u/l;->b:Lcom/beetalk/sdk/u/l;

    invoke-virtual {v7, v1}, Lcom/beetalk/sdk/u/a;->o(Lcom/beetalk/sdk/u/l;)V

    :cond_4
    iget-object v1, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v1, v6}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object v1, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v1, v0}, Lcom/beetalk/sdk/u/a;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-static {}, Lcom/beetalk/sdk/x/d;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/u/a;->l(I)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    iget-object v1, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    sget-object v0, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    iput-object v0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-direct {p0, p1, p0, v5}, Lcom/beetalk/sdk/g;->O(Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return v4

    :cond_5
    const-string p1, "error"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "invalid_grant"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/beetalk/sdk/g;->c0()V

    invoke-static {v5}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    sget-object p1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    goto :goto_2

    :cond_6
    sget-object p1, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :goto_2
    sget-object p1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :goto_3
    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_4
    return v2
.end method

.method private Z(Lcom/beetalk/sdk/g$n;)Z
    .locals 6

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/z/i/b;->p(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    return v1

    :cond_1
    const-string v2, "open_id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    :try_start_0
    iget-object v3, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    const-string v5, "access_token"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/beetalk/sdk/u/a;->j(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    const-string v5, "refresh_token"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/beetalk/sdk/u/a;->n(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    const-string v5, "expiry_time"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object v3, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/beetalk/sdk/u/a;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-static {}, Lcom/beetalk/sdk/x/d;->k()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/u/a;->l(I)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    iget-object v2, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v2}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    sget-object v0, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    iput-object v0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    const-string v0, "refresh token successful"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p0, v0}, Lcom/beetalk/sdk/g;->O(Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_2
    const-string p1, "error"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    :try_start_1
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "refresh error %s"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "invalid_grant"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/beetalk/sdk/g;->c0()V

    sget-object p1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    goto :goto_1

    :cond_3
    const-string v0, "error_user_ban"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/garena/pay/android/b;->j:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_5
    :goto_1
    return v1
.end method

.method static synthetic a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    return-object p0
.end method

.method private a0(Lcom/beetalk/sdk/g$n;)Z
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/beetalk/sdk/g;->Z(Lcom/beetalk/sdk/g$n;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lcom/beetalk/sdk/g;->Y(Lcom/beetalk/sdk/g$n;)Z

    move-result p1

    return p1
.end method

.method static synthetic b(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/g;->a0(Lcom/beetalk/sdk/g$n;)Z

    move-result p0

    return p0
.end method

.method public static b0()V
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {v0}, Lcom/beetalk/sdk/g;->c0()V

    return-void
.end method

.method static synthetic c(Lcom/beetalk/sdk/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/g;->c0()V

    return-void
.end method

.method private c0()V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/u/a;->j(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/u/a;->l(I)V

    sget-object v0, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    iput-object v0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    sget-object v0, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/beetalk/sdk/g;->l:I

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    if-eqz v0, :cond_1

    const-string v1, "com.garena.msdk.token"

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->j:Lcom/beetalk/sdk/g$o;

    sget-object v1, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->n()V

    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/beetalk/sdk/g;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/g;->b:Ljava/util/List;

    return-object p0
.end method

.method private static d0(Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    return-object p1
.end method

.method static synthetic f(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/beetalk/sdk/g;->O(Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void
.end method

.method public static declared-synchronized f0(Lcom/beetalk/sdk/g;)V
    .locals 1

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/beetalk/sdk/g;->q:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic g(Lcom/beetalk/sdk/g;I)I
    .locals 0

    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    return p1
.end method

.method public static declared-synchronized g0(Lcom/beetalk/sdk/g;)V
    .locals 1

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/beetalk/sdk/g;->p:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic h(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/t/k;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    return-object p0
.end method

.method public static declared-synchronized h0(Lcom/beetalk/sdk/g;)V
    .locals 1

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic i(Lcom/beetalk/sdk/g;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/g;->a:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic j(Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/beetalk/sdk/g;->d0(Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic k(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/g;->Y(Lcom/beetalk/sdk/g$n;)Z

    move-result p0

    return p0
.end method

.method private k0(Landroid/content/Intent;)Z
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private l(Lcom/beetalk/sdk/d;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->e()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-direct {v0, p1}, Lcom/beetalk/sdk/g;->A(Lcom/beetalk/sdk/d;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->e()Lcom/beetalk/sdk/g;

    move-result-object v1

    invoke-direct {v1, v0}, Lcom/beetalk/sdk/g;->k0(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->b()Lcom/beetalk/sdk/a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->d()I

    move-result p1

    invoke-interface {v1, v0, p1}, Lcom/beetalk/sdk/a;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static m()Z
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized n()Z
    .locals 2

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v1}, Lcom/beetalk/sdk/g;->o(Lcom/beetalk/sdk/g$m;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized o(Lcom/beetalk/sdk/g$m;)Z
    .locals 5

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    :try_start_1
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    if-nez v1, :cond_1

    monitor-exit v0

    return v2

    :cond_1
    :try_start_2
    invoke-static {}, Lcom/facebook/r;->x()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    if-eqz v1, :cond_2

    :try_start_3
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/beetalk/sdk/w/a;->a(Landroid/content/Context;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_4
    invoke-static {v1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    :cond_2
    :goto_0
    :try_start_5
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_4

    invoke-static {}, Lcom/vk/sdk/i;->m()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    sget-object v3, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v3}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v3

    sget-object v4, Lcom/beetalk/sdk/p;->l:Ljava/lang/String;

    invoke-static {v1, v3, v4}, Lcom/vk/sdk/i;->e(Landroid/content/Context;ILjava/lang/String;)Lcom/vk/sdk/i;

    :cond_3
    invoke-static {}, Lcom/vk/sdk/i;->o()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    :cond_4
    const/4 v1, 0x0

    :try_start_6
    sget-object v3, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-virtual {v3}, Lcom/beetalk/sdk/g;->N()V

    sget-object v3, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-virtual {v3}, Lcom/beetalk/sdk/g;->L()V

    sput-object v1, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    :try_start_7
    sget-object v3, Lcom/beetalk/sdk/g;->p:Lcom/beetalk/sdk/g;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/beetalk/sdk/g;->L()V

    sput-object v1, Lcom/beetalk/sdk/g;->p:Lcom/beetalk/sdk/g;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    :cond_5
    :try_start_8
    sget-object v3, Lcom/beetalk/sdk/g;->q:Lcom/beetalk/sdk/g;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/beetalk/sdk/g;->L()V

    sput-object v1, Lcom/beetalk/sdk/g;->q:Lcom/beetalk/sdk/g;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    :cond_6
    :try_start_9
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/beetalk/sdk/g$e;

    invoke-direct {v3}, Lcom/beetalk/sdk/g$e;-><init>()V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    :try_start_a
    invoke-static {}, Lcom/beetalk/sdk/t/e;->d()Lcom/beetalk/sdk/t/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/t/e;->c()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    :try_start_b
    new-instance v1, Lcom/beetalk/sdk/t/i;

    invoke-direct {v1}, Lcom/beetalk/sdk/t/i;-><init>()V

    invoke-virtual {v1}, Lcom/beetalk/sdk/t/i;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_5
    :try_start_c
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/beetalk/sdk/l;->j(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/c;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v3, "Start to sign out Google account."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v2}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/c;->q()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/beetalk/sdk/g$f;

    invoke-direct {v2, p0}, Lcom/beetalk/sdk/g$f;-><init>(Lcom/beetalk/sdk/g$m;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    :cond_7
    const/4 p0, 0x1

    monitor-exit v0

    return p0

    :catchall_7
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized p(Lcom/beetalk/sdk/g$m;)Z
    .locals 5

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/facebook/r;->x()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/beetalk/sdk/w/a;->a(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    :try_start_2
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    invoke-static {}, Lcom/vk/sdk/i;->m()Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    sget-object v3, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v3}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v3

    sget-object v4, Lcom/beetalk/sdk/p;->l:Ljava/lang/String;

    invoke-static {v1, v3, v4}, Lcom/vk/sdk/i;->e(Landroid/content/Context;ILjava/lang/String;)Lcom/vk/sdk/i;

    :cond_2
    invoke-static {}, Lcom/vk/sdk/i;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_3
    :try_start_3
    sget-object v1, Lcom/beetalk/sdk/g;->p:Lcom/beetalk/sdk/g;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->L()V

    const/4 v1, 0x0

    sput-object v1, Lcom/beetalk/sdk/g;->p:Lcom/beetalk/sdk/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_4
    :try_start_4
    invoke-static {}, Lcom/garena/pay/android/j/c;->a()Lcom/garena/pay/android/j/c;

    move-result-object v1

    new-instance v3, Lcom/beetalk/sdk/g$g;

    invoke-direct {v3}, Lcom/beetalk/sdk/g$g;-><init>()V

    invoke-virtual {v1, v3}, Lcom/garena/pay/android/j/c;->b(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    sget-object v1, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/beetalk/sdk/l;->j(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/c;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v3, "Start to sign out Google account."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v2}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/c;->q()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/beetalk/sdk/g$h;

    invoke-direct {v2, p0}, Lcom/beetalk/sdk/g$h;-><init>(Lcom/beetalk/sdk/g$m;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :cond_5
    const/4 p0, 0x1

    monitor-exit v0

    return p0

    :catchall_4
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private q(Lcom/beetalk/sdk/d;)V
    .locals 5

    iget-object v0, p0, Lcom/beetalk/sdk/g;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/d;->f(Ljava/lang/String;)V

    iget v0, p0, Lcom/beetalk/sdk/g;->m:I

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/d;->i(I)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/d;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/beetalk/sdk/g;->e:Lcom/beetalk/sdk/c;

    sget-object v1, Lcom/beetalk/sdk/c;->c:Lcom/beetalk/sdk/c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/d;->h(Z)V

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/g;->l(Lcom/beetalk/sdk/d;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->e()Lcom/beetalk/sdk/g;

    move-result-object v1

    iget-object v1, v1, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->e()Lcom/beetalk/sdk/g;

    move-result-object v2

    sget-object v3, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    iput-object v3, v2, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->e()Lcom/beetalk/sdk/g;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beetalk/sdk/d;->e()Lcom/beetalk/sdk/g;

    move-result-object p1

    iget-object p1, p1, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    new-instance v3, Lcom/beetalk/sdk/v/a;

    const-string v4, "Failed to Validate the authenticity of the internal package.Did you forget to include the BTLoginActivity in your AndroidManifest.xml"

    invoke-direct {v3, v4}, Lcom/beetalk/sdk/v/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v1, p1, v3}, Lcom/beetalk/sdk/g;->X(Lcom/beetalk/sdk/q;Lcom/beetalk/sdk/q;Ljava/lang/Exception;)V

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_1
    return-void
.end method

.method public static r(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;
    .locals 2

    new-instance v0, Lcom/beetalk/sdk/d;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/d;-><init>(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V

    sget-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-virtual {v0, p0}, Lcom/beetalk/sdk/d;->j(Lcom/beetalk/sdk/g;)V

    sget-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    iget-object p0, p0, Lcom/beetalk/sdk/g;->b:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    iget-object p0, p0, Lcom/beetalk/sdk/g;->b:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "[forceOpenSession] Callback Array Size"

    invoke-static {p0, p1, v1}, Lcom/beetalk/sdk/x/k;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    sget-object p1, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    iput-object p1, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    sget-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/g;->q(Lcom/beetalk/sdk/d;)V

    sget-object p0, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;

    return-object p0
.end method

.method public static s()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/g;->n:Landroid/content/Context;

    return-object v0
.end method

.method public static declared-synchronized w()Lcom/beetalk/sdk/g;
    .locals 2

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/g;->q:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized x()Lcom/beetalk/sdk/g;
    .locals 2

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/g;->p:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized y()Lcom/beetalk/sdk/g;
    .locals 2

    const-class v0, Lcom/beetalk/sdk/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/beetalk/sdk/g;->o:Lcom/beetalk/sdk/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public B()Lcom/beetalk/sdk/c;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->e:Lcom/beetalk/sdk/c;

    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public D()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->F()Lcom/beetalk/sdk/g$o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$o;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/g;->m:I

    return v0
.end method

.method public F()Lcom/beetalk/sdk/g$o;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->j:Lcom/beetalk/sdk/g$o;

    return-object v0
.end method

.method public G()Lcom/beetalk/sdk/q;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    return-object v0
.end method

.method public H()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public I()Lcom/beetalk/sdk/u/a;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    return-object v0
.end method

.method public L()V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->a()V

    :cond_0
    return-void
.end method

.method public N()V
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/q;->d:Lcom/beetalk/sdk/q;

    iput-object v0, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-static {}, Lcom/beetalk/sdk/z/a;->a()Lcom/beetalk/sdk/z/a;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/g$i;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/g$i;-><init>(Lcom/beetalk/sdk/g;)V

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/z/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method final W(Landroid/app/Activity;IILandroid/content/Intent;)Z
    .locals 4

    const-class v0, Lcom/beetalk/sdk/g;

    const-string v1, "currentActivity"

    invoke-static {p1, v1}, Lcom/beetalk/sdk/x/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onActivityResult"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/beetalk/sdk/g;->J(Landroid/content/Context;)V

    iget p1, p0, Lcom/beetalk/sdk/g;->m:I

    if-eq p2, p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    if-eqz p4, :cond_5

    const/4 p2, -0x1

    if-ne p3, p2, :cond_5

    monitor-enter v0

    :try_start_0
    const-string p2, "onActivityResult: success"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-virtual {p4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    if-nez p3, :cond_1

    monitor-exit v0

    return v2

    :cond_1
    const-string p4, "auth_result"

    invoke-virtual {p3, p4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p3

    check-cast p3, Lcom/beetalk/sdk/b$e;

    if-eqz p3, :cond_4

    iget-object p4, p3, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    if-nez p4, :cond_2

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    iget-object p3, p3, Lcom/beetalk/sdk/b$e;->d:Ljava/lang/String;

    invoke-virtual {p4, p3}, Lcom/beetalk/sdk/u/a;->m(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    iget-object p4, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {p3, p4}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    sget-object p3, Lcom/beetalk/sdk/g$d;->b:[I

    iget-object p4, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {p4}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p3, p3, p4

    packed-switch p3, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object p3, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    :goto_0
    iput-object p3, p0, Lcom/beetalk/sdk/g;->j:Lcom/beetalk/sdk/g$o;

    goto :goto_1

    :pswitch_1
    sget-object p3, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_2
    sget-object p3, Lcom/beetalk/sdk/g$o;->f:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_3
    sget-object p3, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_4
    sget-object p3, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_5
    sget-object p3, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_6
    sget-object p3, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :goto_1
    iget-object p3, p0, Lcom/beetalk/sdk/g;->j:Lcom/beetalk/sdk/g$o;

    sget-object p4, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    if-ne p3, p4, :cond_3

    iget-object p3, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    iget-object p4, p0, Lcom/beetalk/sdk/g;->k:Lcom/beetalk/sdk/u/a;

    invoke-virtual {p3, p4}, Lcom/beetalk/sdk/t/k;->k(Lcom/beetalk/sdk/u/a;)V

    :cond_3
    sget-object p3, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    iput-object p3, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-direct {p0, p2, p3, p1}, Lcom/beetalk/sdk/g;->X(Lcom/beetalk/sdk/q;Lcom/beetalk/sdk/q;Ljava/lang/Exception;)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_2
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_5
    if-nez p3, :cond_9

    monitor-enter v0

    :try_start_1
    iget-object p2, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    const-string p4, "auth_result"

    invoke-virtual {p3, p4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p3

    check-cast p3, Lcom/beetalk/sdk/b$e;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catch_0
    move-exception p3

    :try_start_3
    invoke-static {p3}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    move-object p3, p1

    :goto_3
    if-eqz p3, :cond_6

    iget p4, p3, Lcom/beetalk/sdk/b$e;->c:I

    if-nez p4, :cond_6

    sget-object p3, Lcom/beetalk/sdk/q;->d:Lcom/beetalk/sdk/q;

    :goto_4
    iput-object p3, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    goto :goto_6

    :cond_6
    if-nez p3, :cond_7

    sget-object p3, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {p3}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_5

    :cond_7
    iget p3, p3, Lcom/beetalk/sdk/b$e;->c:I

    :goto_5
    iput p3, p0, Lcom/beetalk/sdk/g;->l:I

    sget-object p4, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {p4}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    if-ne p3, p4, :cond_8

    invoke-direct {p0}, Lcom/beetalk/sdk/g;->c0()V

    :cond_8
    sget-object p3, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    goto :goto_4

    :goto_6
    iget-object p3, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    invoke-direct {p0, p2, p3, p1}, Lcom/beetalk/sdk/g;->X(Lcom/beetalk/sdk/q;Lcom/beetalk/sdk/q;Ljava/lang/Exception;)V

    monitor-exit v0

    goto :goto_7

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_9
    :goto_7
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e0(Lcom/beetalk/sdk/t/k;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    return-void
.end method

.method public i0(I)V
    .locals 0

    iput p1, p0, Lcom/beetalk/sdk/g;->l:I

    return-void
.end method

.method public j0(Lcom/beetalk/sdk/q;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/g;->f:Lcom/beetalk/sdk/q;

    return-void
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->g:Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->h:Ljava/lang/String;

    return-object v0
.end method

.method public v()Lcom/beetalk/sdk/t/k;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/g;->d:Lcom/beetalk/sdk/t/k;

    return-object v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/g;->l:I

    return v0
.end method
