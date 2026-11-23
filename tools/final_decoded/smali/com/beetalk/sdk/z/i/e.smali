.class public Lcom/beetalk/sdk/z/i/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "access_token"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/beetalk/sdk/z/h;->c()Lcom/beetalk/sdk/z/h;

    move-result-object v1

    invoke-static {}, Lcom/beetalk/sdk/p;->M()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Lcom/beetalk/sdk/z/h;->h(Ljava/lang/String;Ljava/util/Map;Z)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
