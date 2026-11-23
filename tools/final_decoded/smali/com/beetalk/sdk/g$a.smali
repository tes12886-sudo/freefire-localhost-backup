.class Lcom/beetalk/sdk/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/g;->K(Lcom/beetalk/sdk/g$n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/g$n;

.field final synthetic b:Lcom/beetalk/sdk/g;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    iput-object p2, p0, Lcom/beetalk/sdk/g$a;->a:Lcom/beetalk/sdk/g$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v0}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->c()I

    move-result v0

    invoke-static {}, Lcom/beetalk/sdk/x/d;->k()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const v3, 0x2a300

    if-ge v0, v3, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    iget-object v3, p0, Lcom/beetalk/sdk/g$a;->a:Lcom/beetalk/sdk/g$n;

    invoke-static {v0, v3}, Lcom/beetalk/sdk/g;->b(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "refresh token ok - no need for inspection"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-array v3, v1, [Ljava/lang/Object;

    div-int/lit16 v0, v0, 0xe10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v2

    const-string v0, "%d hours until the token expires"

    invoke-static {v0, v3}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v0}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/z/i/b;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    sget-object v1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;

    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    sget-object v1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->g(Lcom/beetalk/sdk/g;I)I

    goto/16 :goto_2

    :cond_2
    const-string v3, "error"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    :try_start_0
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "inspection error %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-static {v3, v1}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "invalid_grant"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    iget-object v1, p0, Lcom/beetalk/sdk/g$a;->a:Lcom/beetalk/sdk/g$n;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->b(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)Z

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v1, "error_token_session"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/beetalk/sdk/g;->b0()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    sget-object v1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    invoke-static {v0, v1}, Lcom/beetalk/sdk/g;->e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;

    goto/16 :goto_2

    :cond_6
    const-string v3, "platform"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, "open_id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    :try_start_1
    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v4}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/beetalk/sdk/u/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    sget-object v5, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    invoke-virtual {v5}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v4, v5}, Lcom/beetalk/sdk/g;->g(Lcom/beetalk/sdk/g;I)I

    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    sget-object v5, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    invoke-static {v4, v5}, Lcom/beetalk/sdk/g;->e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;

    goto :goto_1

    :cond_7
    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    sget-object v5, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    invoke-static {v4, v5}, Lcom/beetalk/sdk/g;->e(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/q;)Lcom/beetalk/sdk/q;

    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v4}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v4

    const-string v5, "expiry_time"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/beetalk/sdk/u/a;->k(I)V

    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v4}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v4

    invoke-static {}, Lcom/beetalk/sdk/x/d;->k()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/beetalk/sdk/u/a;->l(I)V

    iget-object v4, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v4}, Lcom/beetalk/sdk/g;->h(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/t/k;

    move-result-object v4

    iget-object v5, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v5}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    :goto_1
    const-string v4, "verify the open id %s %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    invoke-static {v6}, Lcom/beetalk/sdk/g;->a(Lcom/beetalk/sdk/g;)Lcom/beetalk/sdk/u/a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/beetalk/sdk/u/a;->f()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-static {v4, v5}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-static {v0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/beetalk/sdk/g$a;->b:Lcom/beetalk/sdk/g;

    iget-object v1, p0, Lcom/beetalk/sdk/g$a;->a:Lcom/beetalk/sdk/g$n;

    const/4 v2, 0x0

    invoke-static {v0, v1, v0, v2}, Lcom/beetalk/sdk/g;->f(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    return-void
.end method
