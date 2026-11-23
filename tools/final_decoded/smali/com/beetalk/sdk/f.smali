.class public Lcom/beetalk/sdk/f;
.super Lcom/beetalk/sdk/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/f$b;
    }
.end annotation


# instance fields
.field private final b:Lcom/facebook/j;


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/b;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/e;-><init>(Lcom/beetalk/sdk/b;)V

    invoke-static {}, Lcom/facebook/j$a;->a()Lcom/facebook/j;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/f;->b:Lcom/facebook/j;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->e()Lcom/beetalk/sdk/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/a;->a()Landroid/app/Activity;

    move-result-object p1

    invoke-static {}, Lcom/facebook/login/p;->e()Lcom/facebook/login/p;

    move-result-object v1

    new-instance v2, Lcom/beetalk/sdk/f$a;

    invoke-direct {v2, p0, p1}, Lcom/beetalk/sdk/f$a;-><init>(Lcom/beetalk/sdk/f;Landroid/app/Activity;)V

    invoke-virtual {v1, v0, v2}, Lcom/facebook/login/p;->o(Lcom/facebook/j;Lcom/facebook/l;)V

    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/f;->m()V

    return-void
.end method

.method static synthetic g(Lcom/beetalk/sdk/f;Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/f;->k(Ljava/lang/Exception;Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic h(Lcom/beetalk/sdk/f;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/f;->j(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lcom/beetalk/sdk/f;Lcom/beetalk/sdk/b$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/f;->l(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private j(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 8

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v0

    sget-object v1, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "://auth/"

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/beetalk/sdk/p;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/beetalk/sdk/z/i/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/beetalk/sdk/p;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/beetalk/sdk/z/i/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    :goto_0
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "FB login exchange token, result: "

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    sget-object p1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    :goto_1
    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_2

    :cond_1
    const-string v3, "open_id"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "access_token"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "expiry_time"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "platform"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    new-instance v6, Lcom/beetalk/sdk/u/a;

    sget-object v7, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    invoke-direct {v6, v4, v7, p1}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/beetalk/sdk/u/l;->b:Lcom/beetalk/sdk/u/l;

    invoke-virtual {v6, v0}, Lcom/beetalk/sdk/u/a;->o(Lcom/beetalk/sdk/u/l;)V

    :cond_2
    invoke-virtual {v6, v5}, Lcom/beetalk/sdk/u/a;->k(I)V

    invoke-static {p2, v6, v3, p1}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    goto :goto_2

    :cond_3
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "error_user_ban"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_4
    const-string v0, "invalid_grant"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v2}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    sget-object p1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_5
    sget-object p1, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    goto :goto_1

    :goto_2
    if-nez v2, :cond_6

    invoke-static {p2, v1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v2

    :cond_6
    return-object v2
.end method

.method private k(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 2

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-string v0, "FB login failed, exception: "

    invoke-static {v0, p2}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p2}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object p2

    instance-of v0, p1, Lcom/beetalk/sdk/v/a;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "user_cancelled"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    :goto_0
    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p2, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object p2, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private l(Lcom/beetalk/sdk/b$e;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->h:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->v()Lcom/beetalk/sdk/t/k;

    move-result-object v0

    iget-object v1, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    :cond_2
    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private m()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Starting Token Exchange for Facebook"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/beetalk/sdk/f$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/beetalk/sdk/f$b;-><init>(Lcom/beetalk/sdk/f;Lcom/beetalk/sdk/f$a;)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v1}, Lcom/facebook/a;->m()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v0

    invoke-virtual {v2, v3}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    sget-object v1, Lcom/garena/pay/android/b;->t:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1, v0}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    :goto_0
    return-void
.end method


# virtual methods
.method d(IILandroid/content/Intent;Lcom/beetalk/sdk/b$c;)Z
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/f;->b:Lcom/facebook/j;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/j;->a(IILandroid/content/Intent;)Z

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/garena/pay/android/b;->t:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p4, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/f;->l(Lcom/beetalk/sdk/b$e;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method e(Lcom/beetalk/sdk/b$c;)Z
    .locals 5

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "start FB Auth"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/a;->p()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/beetalk/sdk/f;->m()V

    return v1

    :cond_1
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->e()Lcom/beetalk/sdk/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/a;->a()Landroid/app/Activity;

    move-result-object p1

    invoke-static {}, Lcom/facebook/login/p;->e()Lcom/facebook/login/p;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "public_profile"

    aput-object v4, v3, v0

    const-string v0, "user_friends"

    aput-object v0, v3, v1

    const/4 v0, 0x2

    const-string v4, "email"

    aput-object v4, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Lcom/facebook/login/p;->j(Landroid/app/Activity;Ljava/util/Collection;)V

    return v1
.end method
