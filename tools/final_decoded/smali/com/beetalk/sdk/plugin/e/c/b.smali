.class public Lcom/beetalk/sdk/plugin/e/c/b;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/plugin/e/c/b$c;,
        Lcom/beetalk/sdk/plugin/e/c/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/a<",
        "Lcom/beetalk/sdk/plugin/e/c/b$c;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/a;-><init>()V

    return-void
.end method

.method private i(Lcom/beetalk/sdk/plugin/e/c/b$c;)I
    .locals 4

    invoke-static {p1}, Lcom/beetalk/sdk/z/i/d;->d(Lcom/beetalk/sdk/plugin/e/c/b$c;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/garena/pay/android/b;->n:Lcom/garena/pay/android/b;

    :goto_0
    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const-string v0, "result"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    const-string v1, "buddy request %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_1
    sget-object p1, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_1
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_1
    const-string v1, "error_token_session"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->b0()V

    sget-object p1, Lcom/garena/pay/android/b;->J:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return p1

    :catch_1
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :cond_2
    sget-object p1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    goto :goto_0
.end method

.method static synthetic j(Lcom/beetalk/sdk/plugin/e/c/b;Lcom/beetalk/sdk/plugin/e/c/b$c;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b;->i(Lcom/beetalk/sdk/plugin/e/c/b$c;)I

    move-result p0

    return p0
.end method

.method static synthetic k(Lcom/beetalk/sdk/plugin/e/c/b;Lcom/beetalk/sdk/plugin/PluginResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/c/b;->m(Lcom/beetalk/sdk/plugin/PluginResult;)V

    return-void
.end method

.method private m(Lcom/beetalk/sdk/plugin/PluginResult;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/c/b;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected bridge synthetic b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/beetalk/sdk/plugin/e/c/b$c;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/c/b;->l(Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/c/b$c;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "app.request.friend"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->r:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected l(Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/c/b$c;)V
    .locals 2

    new-instance p1, Lcom/beetalk/sdk/plugin/e/c/b$b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/beetalk/sdk/plugin/e/c/b$b;-><init>(Lcom/beetalk/sdk/plugin/e/c/b;Lcom/beetalk/sdk/plugin/e/c/b$a;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/beetalk/sdk/plugin/e/c/b$c;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
