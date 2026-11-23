.class Lcom/facebook/login/d$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/login/d;->l2()Lcom/facebook/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/login/d;


# direct methods
.method constructor <init>(Lcom/facebook/login/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/x;)V
    .locals 5

    iget-object v0, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-static {v0}, Lcom/facebook/login/d;->a2(Lcom/facebook/login/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/x;->b()Lcom/facebook/q;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/facebook/q;->g()I

    move-result v0

    const v1, 0x149620

    if-eq v0, v1, :cond_2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-virtual {p1}, Lcom/facebook/x;->b()Lcom/facebook/q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/q;->e()Lcom/facebook/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/d;->p2(Lcom/facebook/n;)V

    goto :goto_0

    :cond_1
    :pswitch_0
    iget-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-virtual {p1}, Lcom/facebook/login/d;->o2()V

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-static {p1}, Lcom/facebook/login/d;->b2(Lcom/facebook/login/d;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-static {p1}, Lcom/facebook/login/d;->c2(Lcom/facebook/login/d;)Lcom/facebook/login/d$i;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-static {p1}, Lcom/facebook/login/d;->c2(Lcom/facebook/login/d;)Lcom/facebook/login/d$i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/login/d$i;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/k0/a/a;->a(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-static {p1}, Lcom/facebook/login/d;->d2(Lcom/facebook/login/d;)Lcom/facebook/login/l$d;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    invoke-static {p1}, Lcom/facebook/login/d;->d2(Lcom/facebook/login/d;)Lcom/facebook/login/l$d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/login/d;->v2(Lcom/facebook/login/l$d;)V

    :goto_0
    return-void

    :cond_4
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/x;->c()Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    const-string v1, "access_token"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "expires_in"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "data_access_expiration_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcom/facebook/login/d;->e2(Lcom/facebook/login/d;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/facebook/login/d$e;->a:Lcom/facebook/login/d;

    new-instance v1, Lcom/facebook/n;

    invoke-direct {v1, p1}, Lcom/facebook/n;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/facebook/login/d;->p2(Lcom/facebook/n;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x149634
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
