.class public Lcom/beetalk/sdk/m;
.super Lcom/beetalk/sdk/e;
.source ""


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/e;-><init>(Lcom/beetalk/sdk/b;)V

    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/m;Lorg/json/JSONObject;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/m;->k(Lorg/json/JSONObject;)Z

    move-result p0

    return p0
.end method

.method static synthetic g(Lcom/beetalk/sdk/m;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/beetalk/sdk/m;->j(JLjava/lang/String;)V

    return-void
.end method

.method static synthetic h(Lcom/beetalk/sdk/m;Lorg/json/JSONObject;)Lcom/beetalk/sdk/b$e;
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/m;->i(Lorg/json/JSONObject;)Lcom/beetalk/sdk/b$e;

    move-result-object p0

    return-object p0
.end method

.method private i(Lorg/json/JSONObject;)Lcom/beetalk/sdk/b$e;
    .locals 8

    const-string v0, "error"

    const-string v1, "open_id"

    sget-object v2, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x0

    if-nez p1, :cond_0

    :try_start_0
    sget-object p1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    move v2, p1

    goto/16 :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "access_token"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "refresh_token"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "expiry_time"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    new-instance v5, Lcom/beetalk/sdk/u/a;

    sget-object v6, Lcom/beetalk/sdk/u/l;->g:Lcom/beetalk/sdk/u/l;

    const/4 v7, 0x4

    invoke-direct {v5, v1, v6, v7}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    invoke-virtual {v5, v4}, Lcom/beetalk/sdk/u/a;->n(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object p1

    invoke-static {p1, v5, v0, v7}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    move-object v3, p1

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "invalid_grant"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string v0, "error_user_ban"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/garena/pay/android/b;->g0:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_2
    if-nez v3, :cond_5

    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object p1

    invoke-static {p1, v2}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v3

    :cond_5
    return-object v3
.end method

.method private j(JLjava/lang/String;)V
    .locals 6

    sget-object v3, Lcom/beetalk/sdk/a0/a;->c:Lcom/beetalk/sdk/a0/a;

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/beetalk/sdk/m$b;

    invoke-direct {v5, p0}, Lcom/beetalk/sdk/m$b;-><init>(Lcom/beetalk/sdk/m;)V

    move-wide v0, p1

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lcom/beetalk/sdk/z/i/b;->m(JLjava/lang/String;Lcom/beetalk/sdk/a0/a;Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V

    return-void
.end method

.method private k(Lorg/json/JSONObject;)Z
    .locals 1

    if-eqz p1, :cond_1

    const-string v0, "error"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method e(Lcom/beetalk/sdk/b$c;)Z
    .locals 4

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/t/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {p0, v2, v3, v1}, Lcom/beetalk/sdk/m;->j(JLjava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/beetalk/sdk/u/i;

    invoke-direct {v0}, Lcom/beetalk/sdk/u/i;-><init>()V

    invoke-static {}, Lcom/beetalk/sdk/x/i;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/u/i;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/u/i;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b$c;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/beetalk/sdk/u/i;->d:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->H()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lcom/beetalk/sdk/u/i;->c:I

    new-instance p1, Lcom/beetalk/sdk/m$a;

    invoke-direct {p1, p0, v0}, Lcom/beetalk/sdk/m$a;-><init>(Lcom/beetalk/sdk/m;Lcom/beetalk/sdk/u/i;)V

    invoke-static {v0, p1}, Lcom/beetalk/sdk/z/i/b;->q(Lcom/beetalk/sdk/u/i;Lcom/beetalk/sdk/z/e$h;)V

    goto :goto_1

    :cond_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beetalk/sdk/t/k;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v2

    invoke-virtual {v2, v0, v1, p1}, Lcom/beetalk/sdk/t/a;->j(JLjava/lang/String;)V

    :try_start_0
    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object v2

    invoke-virtual {v2, v0, v1, p1}, Lcom/beetalk/sdk/t/k;->j(JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-static {v2}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_0
    invoke-direct {p0, v0, v1, p1}, Lcom/beetalk/sdk/m;->j(JLjava/lang/String;)V

    :goto_1
    const/4 p1, 0x1

    return p1
.end method
