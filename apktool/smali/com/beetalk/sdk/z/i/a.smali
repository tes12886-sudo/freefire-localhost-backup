.class public Lcom/beetalk/sdk/z/i/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/String;II)Lorg/json/JSONObject;
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/p$a;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/16 p1, 0x1100

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/p;->p()Lcom/beetalk/sdk/p$c;

    move-result-object p1

    sget-object v0, Lcom/beetalk/sdk/p$c;->a:Lcom/beetalk/sdk/p$c;

    if-ne p1, v0, :cond_1

    const/16 p1, 0x1101

    goto :goto_0

    :cond_1
    const/16 p1, 0x1102

    :goto_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "app_id"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "client_type"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "client_version"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object p0

    invoke-static {}, Lcom/beetalk/sdk/p;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/beetalk/sdk/z/h;->g(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, p0, v1}, Lcom/beetalk/sdk/z/h;->g(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/z/i/a$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/beetalk/sdk/z/i/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object p0

    invoke-static {}, Lcom/beetalk/sdk/p;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/beetalk/sdk/z/h;->n(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
