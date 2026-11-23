.class public Lcom/beetalk/sdk/plugin/e/d/c;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/a<",
        "Lcom/beetalk/sdk/j;",
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


# virtual methods
.method protected bridge synthetic b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/beetalk/sdk/j;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/d/c;->i(Landroid/app/Activity;Lcom/beetalk/sdk/j;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "gas.share.url"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    sget-object p2, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    :goto_0
    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string p3, ""

    invoke-virtual {p0, p1, p2, p3}, Lcom/beetalk/sdk/plugin/a;->h(Landroid/app/Activity;ILjava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected i(Landroid/app/Activity;Lcom/beetalk/sdk/j;)V
    .locals 3

    if-nez p2, :cond_0

    sget-object p2, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->g(Landroid/app/Activity;I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/beetalk/sdk/i;->e(Landroid/app/Activity;I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lcom/beetalk/sdk/x/d;->r(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.garena.gas"

    invoke-static {v1, p1}, Lcom/beetalk/sdk/x/d;->p(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "com.garena.gaslite"

    :goto_0
    const-string v2, "com.garena.gameauth.GPProxyCommonActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.garena.gas.intent.GAME_SHARE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/j;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.garena.msdk.share.MediaTagName"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/j;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.garena.msdk.share.Url"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.garena.msdk.share.OpenId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x2

    const-string v2, "com.garena.msdk.share.ItemType"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/j;->d()I

    move-result v1

    const-string v2, "com.garena.msdk.share.ShareTo"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/beetalk/sdk/j;->b()I

    move-result p2

    const-string v1, "com.garena.msdk.share.GameId"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p2, 0x0

    const-string v1, "com.garena.msdk.share.AutoAuth"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {}, Lcom/beetalk/sdk/i;->b()Ljava/lang/String;

    move-result-object p2

    const-string v1, "com.garena.msdk.share.SDKVer"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "com.garena.msdk.share.SDKEnv"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/d/c;->e()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_2

    :cond_2
    sget-object p2, Lcom/garena/pay/android/b;->e:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_3
    sget-object p2, Lcom/garena/pay/android/b;->d:Lcom/garena/pay/android/b;

    :goto_1
    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->g(Landroid/app/Activity;I)V

    :goto_2
    return-void
.end method
