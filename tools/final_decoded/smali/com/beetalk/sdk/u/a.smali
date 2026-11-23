.class public Lcom/beetalk/sdk/u/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Integer;

.field private e:Lcom/beetalk/sdk/u/l;

.field private f:Ljava/lang/Integer;

.field private g:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/beetalk/sdk/u/a;->e:Lcom/beetalk/sdk/u/l;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->g:Ljava/lang/Integer;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/beetalk/sdk/u/a;
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "authToken"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "tokenProvider"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lcom/beetalk/sdk/u/l;->d(I)Lcom/beetalk/sdk/u/l;

    move-result-object v1

    const-string v2, "mainPlatform"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    new-instance v3, Lcom/beetalk/sdk/u/a;

    invoke-direct {v3, p0, v1, v2}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    const-string p0, "refreshToken"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/beetalk/sdk/u/a;->n(Ljava/lang/String;)V

    const-string p0, "openId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/beetalk/sdk/u/a;->m(Ljava/lang/String;)V

    const-string p0, "expiryTimestamp"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v3, p0}, Lcom/beetalk/sdk/u/a;->k(I)V

    const-string p0, "lastInspectTime"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v3, p0}, Lcom/beetalk/sdk/u/a;->l(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static p(Lcom/beetalk/sdk/u/a;)Ljava/lang/String;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "authToken"

    iget-object v2, p0, Lcom/beetalk/sdk/u/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "tokenProvider"

    iget-object v2, p0, Lcom/beetalk/sdk/u/a;->e:Lcom/beetalk/sdk/u/l;

    invoke-virtual {v2}, Lcom/beetalk/sdk/u/l;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "expiryTimestamp"

    iget-object v2, p0, Lcom/beetalk/sdk/u/a;->d:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "refreshToken"

    iget-object v2, p0, Lcom/beetalk/sdk/u/a;->b:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    :try_start_1
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "openId"

    iget-object v2, p0, Lcom/beetalk/sdk/u/a;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    move-object v3, v2

    :cond_1
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "lastInspectTime"

    iget-object v2, p0, Lcom/beetalk/sdk/u/a;->f:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mainPlatform"

    iget-object p0, p0, Lcom/beetalk/sdk/u/a;->g:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->g:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lcom/beetalk/sdk/u/l;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->e:Lcom/beetalk/sdk/u/l;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->o(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->o(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/u/a;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->a:Ljava/lang/String;

    return-void
.end method

.method public k(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->d:Ljava/lang/Integer;

    return-void
.end method

.method public l(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->f:Ljava/lang/Integer;

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->c:Ljava/lang/String;

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->b:Ljava/lang/String;

    return-void
.end method

.method public o(Lcom/beetalk/sdk/u/l;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/u/a;->e:Lcom/beetalk/sdk/u/l;

    return-void
.end method
