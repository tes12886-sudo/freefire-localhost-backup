.class public abstract Lcom/beetalk/sdk/t/k;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/p$c;->b:Lcom/beetalk/sdk/p$c;

    if-ne v0, v1, :cond_0

    const-string v0, "com.garena.msdk.guest_token_sandbox"

    return-object v0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/p$c;->a:Lcom/beetalk/sdk/p$c;

    const-string v2, "com.garena.msdk.guest_token"

    return-object v2
.end method


# virtual methods
.method public a()V
    .locals 1

    const-string v0, "com.garena.msdk.token"

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    const-string v0, "com.garena.msdk.sessiontoken"

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    const-string v0, "com.garena.msdk.guest_token"

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    const-string v0, "com.garena.msdk.guest_token_sandbox"

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->i()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/p$c;->b:Lcom/beetalk/sdk/p$c;

    if-ne v0, v1, :cond_0

    const-string v0, "com.garena.msdk.guest_password_sandbox"

    return-object v0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/p$c;->a:Lcom/beetalk/sdk/p$c;

    const-string v2, "com.garena.msdk.guest_password"

    return-object v2
.end method

.method public f()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->i()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/p$c;->b:Lcom/beetalk/sdk/p$c;

    if-ne v0, v1, :cond_0

    const-string v0, "com.garena.msdk.guest_uid_sandbox"

    return-object v0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/p$c;->a:Lcom/beetalk/sdk/p$c;

    const-string v2, "com.garena.msdk.guest_uid"

    return-object v2
.end method

.method public h()Lcom/beetalk/sdk/u/a;
    .locals 2

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->i()Ljava/util/Map;

    move-result-object v0

    const-string v1, "com.garena.msdk.token"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/beetalk/sdk/u/a;->a(Ljava/lang/String;)Lcom/beetalk/sdk/u/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract i()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public j(JLjava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->o(Ljava/util/Map;)V

    return-void
.end method

.method public k(Lcom/beetalk/sdk/u/a;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0}, Lcom/beetalk/sdk/t/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/beetalk/sdk/u/a;->p(Lcom/beetalk/sdk/u/a;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->o(Ljava/util/Map;)V

    return-void
.end method

.method public l(Lcom/beetalk/sdk/u/a;)V
    .locals 2

    const-string v0, "com.garena.msdk.token"

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lcom/beetalk/sdk/u/a;->p(Lcom/beetalk/sdk/u/a;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lcom/beetalk/sdk/t/k;->o(Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public abstract m(Ljava/lang/String;)V
.end method

.method public n()V
    .locals 1

    invoke-direct {p0}, Lcom/beetalk/sdk/t/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/t/k;->m(Ljava/lang/String;)V

    return-void
.end method

.method public abstract o(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
