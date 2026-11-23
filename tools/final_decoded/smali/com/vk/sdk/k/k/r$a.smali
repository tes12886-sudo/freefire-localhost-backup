.class Lcom/vk/sdk/k/k/r$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/vk/sdk/k/k/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/k/k/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/vk/sdk/k/k/s$a<",
        "Lcom/vk/sdk/k/k/r$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/k/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/r$a;->b(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/r$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/r$b;
    .locals 3

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "photo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v0, Lcom/vk/sdk/k/k/i;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/i;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/i;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/i;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "video"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/vk/sdk/k/k/p;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/p;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/p;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/p;

    return-object v0

    :cond_1
    const-string v1, "audio"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v0, Lcom/vk/sdk/k/k/d;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/d;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/d;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/d;

    return-object v0

    :cond_2
    const-string v1, "doc"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v0, Lcom/vk/sdk/k/k/e;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/e;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/e;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/e;

    return-object v0

    :cond_3
    const-string v1, "wall"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v0, Lcom/vk/sdk/k/k/n;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/n;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/n;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/n;

    return-object v0

    :cond_4
    const-string v1, "posted_photo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v0, Lcom/vk/sdk/k/k/o;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/o;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/o;->j(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/o;

    return-object v0

    :cond_5
    const-string v1, "link"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v0, Lcom/vk/sdk/k/k/f;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/f;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/f;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/f;

    return-object v0

    :cond_6
    const-string v1, "note"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v0, Lcom/vk/sdk/k/k/h;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/h;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/h;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/h;

    return-object v0

    :cond_7
    const-string v1, "app"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v0, Lcom/vk/sdk/k/k/c;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/c;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/c;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/c;

    return-object v0

    :cond_8
    const-string v1, "poll"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance v0, Lcom/vk/sdk/k/k/m;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/m;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/m;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/m;

    return-object v0

    :cond_9
    const-string v1, "page"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    new-instance v0, Lcom/vk/sdk/k/k/q;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/q;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/q;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/q;

    return-object v0

    :cond_a
    const-string v1, "album"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Lcom/vk/sdk/k/k/j;

    invoke-direct {v0}, Lcom/vk/sdk/k/k/j;-><init>()V

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/k/j;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/j;

    return-object v0

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method
