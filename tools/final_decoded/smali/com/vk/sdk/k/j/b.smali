.class public Lcom/vk/sdk/k/j/b;
.super Lcom/vk/sdk/k/j/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/k/j/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "photos"

    return-object v0
.end method

.method public d()Lcom/vk/sdk/k/f;
    .locals 2

    const-string v0, "getWallUploadServer"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/vk/sdk/k/j/a;->b(Ljava/lang/String;Lcom/vk/sdk/k/d;)Lcom/vk/sdk/k/f;

    move-result-object v0

    return-object v0
.end method

.method public e(J)Lcom/vk/sdk/k/f;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "group_id"

    aput-object v2, v0, v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    invoke-static {v0}, Lcom/vk/sdk/m/c;->i([Ljava/lang/Object;)Lcom/vk/sdk/k/d;

    move-result-object p1

    const-string p2, "getWallUploadServer"

    invoke-virtual {p0, p2, p1}, Lcom/vk/sdk/k/j/a;->b(Ljava/lang/String;Lcom/vk/sdk/k/d;)Lcom/vk/sdk/k/f;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/vk/sdk/k/d;)Lcom/vk/sdk/k/f;
    .locals 2

    const-class v0, Lcom/vk/sdk/k/k/t;

    const-string v1, "saveWallPhoto"

    invoke-virtual {p0, v1, p1, v0}, Lcom/vk/sdk/k/j/a;->c(Ljava/lang/String;Lcom/vk/sdk/k/d;Ljava/lang/Class;)Lcom/vk/sdk/k/f;

    move-result-object p1

    return-object p1
.end method
