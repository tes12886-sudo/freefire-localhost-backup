.class public Lcom/vk/sdk/k/i/f;
.super Lcom/vk/sdk/k/i/e;
.source ""


# instance fields
.field protected final j:Lcom/vk/sdk/k/e;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/vk/sdk/k/i/b$d;Lcom/vk/sdk/k/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/i/e;-><init>(Lcom/vk/sdk/k/i/b$d;)V

    iput-object p2, p0, Lcom/vk/sdk/k/i/f;->j:Lcom/vk/sdk/k/e;

    return-void
.end method

.method public constructor <init>(Lcom/vk/sdk/k/i/b$d;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/vk/sdk/k/i/b$d;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/vk/sdk/k/k/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/i/e;-><init>(Lcom/vk/sdk/k/i/b$d;)V

    new-instance p1, Lcom/vk/sdk/k/b;

    invoke-direct {p1, p2}, Lcom/vk/sdk/k/b;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, Lcom/vk/sdk/k/i/f;->j:Lcom/vk/sdk/k/e;

    return-void
.end method


# virtual methods
.method protected n()Z
    .locals 3

    invoke-super {p0}, Lcom/vk/sdk/k/i/e;->n()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/vk/sdk/k/i/f;->j:Lcom/vk/sdk/k/e;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lcom/vk/sdk/k/i/e;->p()Lorg/json/JSONObject;

    move-result-object v0

    iget-object v2, p0, Lcom/vk/sdk/k/i/f;->j:Lcom/vk/sdk/k/e;

    invoke-virtual {v2, v0}, Lcom/vk/sdk/k/e;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/vk/sdk/k/i/f;->k:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_1
    return v1
.end method
