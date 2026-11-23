.class public Lcom/vk/sdk/k/k/o;
.super Lcom/vk/sdk/k/k/i;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/k/k/i;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/g;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/o;->j(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/o;

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "posted_photo"

    return-object v0
.end method

.method public bridge synthetic h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/i;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/o;->j(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/o;

    return-object p0
.end method

.method public j(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/o;
    .locals 0

    invoke-super {p0, p1}, Lcom/vk/sdk/k/k/i;->h(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/i;

    return-object p0
.end method
