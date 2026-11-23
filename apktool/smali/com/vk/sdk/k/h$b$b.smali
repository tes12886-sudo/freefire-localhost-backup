.class Lcom/vk/sdk/k/h$b$b;
.super Lcom/vk/sdk/k/f$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/k/h$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/h$b;


# direct methods
.method private constructor <init>(Lcom/vk/sdk/k/h$b;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    invoke-direct {p0}, Lcom/vk/sdk/k/f$d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/h$b$b;-><init>(Lcom/vk/sdk/k/h$b;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/vk/sdk/k/g;)V
    .locals 2

    :try_start_0
    iget-object p1, p1, Lcom/vk/sdk/k/g;->b:Lorg/json/JSONObject;

    const-string v0, "response"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "upload_url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/h;->H(Ljava/lang/String;)Lcom/vk/sdk/k/i/e;

    move-result-object p1

    new-instance v0, Lcom/vk/sdk/k/h$b$b$a;

    invoke-direct {v0, p0}, Lcom/vk/sdk/k/h$b$b$a;-><init>(Lcom/vk/sdk/k/h$b$b;)V

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/i/c;->o(Lcom/vk/sdk/k/i/a$c;)V

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iput-object p1, v0, Lcom/vk/sdk/k/h$b;->e:Lcom/vk/sdk/k/i/a;

    invoke-static {p1}, Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/vk/sdk/k/c;

    const/16 v1, -0x68

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/c;-><init>(I)V

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/vk/sdk/k/c;->f:Ljava/lang/String;

    iget-object p1, p0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iget-object p1, p1, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public c(Lcom/vk/sdk/k/c;)V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iget-object v0, v0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method
