.class public Lcom/beetalk/sdk/o;
.super Lcom/beetalk/sdk/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/o$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/e;-><init>(Lcom/beetalk/sdk/b;)V

    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/o;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/o;->i(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lcom/beetalk/sdk/o;Lcom/beetalk/sdk/b$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/o;->h(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private h(Lcom/beetalk/sdk/b$e;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->p()V

    :goto_0
    return-void
.end method

.method private i(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 6

    invoke-static {p1}, Lcom/beetalk/sdk/z/i/b;->p(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "open_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "access_token"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "refresh_token"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "expiry_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "platform"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    new-instance v4, Lcom/beetalk/sdk/u/a;

    sget-object v5, Lcom/beetalk/sdk/u/l;->c:Lcom/beetalk/sdk/u/l;

    invoke-direct {v4, v1, v5, p1}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    invoke-virtual {v4, v2}, Lcom/beetalk/sdk/u/a;->n(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lcom/beetalk/sdk/u/a;->k(I)V

    invoke-virtual {v4, v0}, Lcom/beetalk/sdk/u/a;->m(Ljava/lang/String;)V

    invoke-static {p2, v4, v0, p1}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p2, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method e(Lcom/beetalk/sdk/b$c;)Z
    .locals 4

    new-instance v0, Lcom/beetalk/sdk/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/beetalk/sdk/o$b;-><init>(Lcom/beetalk/sdk/o;Lcom/beetalk/sdk/o$a;)V

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b$c;->d()Lcom/beetalk/sdk/u/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beetalk/sdk/u/a;->g()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return v1
.end method
