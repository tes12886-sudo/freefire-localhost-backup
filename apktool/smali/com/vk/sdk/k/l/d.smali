.class public Lcom/vk/sdk/k/l/d;
.super Lcom/vk/sdk/k/l/c;
.source ""


# direct methods
.method public constructor <init>([Lcom/vk/sdk/k/l/b;JI)V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/k/l/c;-><init>()V

    iput-wide p2, p0, Lcom/vk/sdk/k/l/c;->v:J

    int-to-long p2, p4

    iput-wide p2, p0, Lcom/vk/sdk/k/l/c;->u:J

    array-length p2, p1

    new-array p2, p2, [Ljava/io/File;

    iput-object p2, p0, Lcom/vk/sdk/k/l/c;->F:[Ljava/io/File;

    const/4 p2, 0x0

    :goto_0
    array-length p3, p1

    if-ge p2, p3, :cond_0

    iget-object p3, p0, Lcom/vk/sdk/k/l/c;->F:[Ljava/io/File;

    aget-object p4, p1, p2

    invoke-virtual {p4}, Lcom/vk/sdk/k/l/b;->d()Ljava/io/File;

    move-result-object p4

    aput-object p4, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method protected F(Lorg/json/JSONObject;)Lcom/vk/sdk/k/f;
    .locals 9

    :try_start_0
    invoke-static {}, Lcom/vk/sdk/k/a;->a()Lcom/vk/sdk/k/j/b;

    move-result-object v0

    new-instance v1, Lcom/vk/sdk/k/d;

    invoke-static {p1}, Lcom/vk/sdk/m/a;->c(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/vk/sdk/k/d;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/j/b;->f(Lcom/vk/sdk/k/d;)Lcom/vk/sdk/k/f;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-wide v0, p0, Lcom/vk/sdk/k/l/c;->v:J

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-wide/16 v5, 0x0

    cmp-long v7, v0, v5

    if-eqz v7, :cond_0

    new-array v7, v4, [Ljava/lang/Object;

    const-string v8, "user_id"

    aput-object v8, v7, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v7, v2

    invoke-static {v7}, Lcom/vk/sdk/m/c;->i([Ljava/lang/Object;)Lcom/vk/sdk/k/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/f;->l(Lcom/vk/sdk/k/d;)V

    :cond_0
    iget-wide v0, p0, Lcom/vk/sdk/k/l/c;->u:J

    cmp-long v7, v0, v5

    if-eqz v7, :cond_1

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "group_id"

    aput-object v5, v4, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v2

    invoke-static {v4}, Lcom/vk/sdk/m/c;->i([Ljava/lang/Object;)Lcom/vk/sdk/k/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/f;->l(Lcom/vk/sdk/k/d;)V

    :cond_1
    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected G()Lcom/vk/sdk/k/f;
    .locals 5

    iget-wide v0, p0, Lcom/vk/sdk/k/l/c;->u:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    invoke-static {}, Lcom/vk/sdk/k/a;->a()Lcom/vk/sdk/k/j/b;

    move-result-object v0

    if-eqz v4, :cond_0

    iget-wide v1, p0, Lcom/vk/sdk/k/l/c;->u:J

    invoke-virtual {v0, v1, v2}, Lcom/vk/sdk/k/j/b;->e(J)Lcom/vk/sdk/k/f;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/vk/sdk/k/j/b;->d()Lcom/vk/sdk/k/f;

    move-result-object v0

    return-object v0
.end method
