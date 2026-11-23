.class Lcom/beetalk/sdk/s$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/s;->f(Ljava/lang/String;)Li/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/beetalk/sdk/b$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/b$c;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/s;Lcom/beetalk/sdk/b$c;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/beetalk/sdk/s$c;->a:Lcom/beetalk/sdk/b$c;

    iput-object p3, p0, Lcom/beetalk/sdk/s$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/beetalk/sdk/b$e;
    .locals 8

    sget-object v0, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/beetalk/sdk/s$c;->a:Lcom/beetalk/sdk/b$c;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/beetalk/sdk/s$c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/beetalk/sdk/s$c;->a:Lcom/beetalk/sdk/b$c;

    invoke-virtual {v2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beetalk/sdk/z/i/b;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/beetalk/sdk/s$c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/beetalk/sdk/s$c;->a:Lcom/beetalk/sdk/b$c;

    invoke-virtual {v2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beetalk/sdk/z/i/b;->j(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    if-nez v1, :cond_1

    sget-object v0, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    :goto_1
    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_1
    const-string v3, "open_id"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    :try_start_0
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "access_token"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "expiry_time"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "platform"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    new-instance v6, Lcom/beetalk/sdk/u/a;

    sget-object v7, Lcom/beetalk/sdk/u/l;->h:Lcom/beetalk/sdk/u/l;

    invoke-direct {v6, v4, v7, v1}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    invoke-virtual {v6, v5}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object v4, p0, Lcom/beetalk/sdk/s$c;->a:Lcom/beetalk/sdk/b$c;

    invoke-static {v4, v6, v3, v1}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    goto :goto_2

    :cond_2
    const-string v0, "error"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "error_user_ban"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_3
    const-string v1, "invalid_grant"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v2}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    sget-object v0, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    goto :goto_1

    :goto_2
    if-nez v2, :cond_5

    iget-object v1, p0, Lcom/beetalk/sdk/s$c;->a:Lcom/beetalk/sdk/b$c;

    invoke-static {v1, v0}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v2

    :cond_5
    return-object v2
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/beetalk/sdk/s$c;->a()Lcom/beetalk/sdk/b$e;

    move-result-object v0

    return-object v0
.end method
