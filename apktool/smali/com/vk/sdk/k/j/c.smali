.class public Lcom/vk/sdk/k/j/c;
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

    const-string v0, "wall"

    return-object v0
.end method

.method public d(Lcom/vk/sdk/k/d;)Lcom/vk/sdk/k/f;
    .locals 2

    const-class v0, Lcom/vk/sdk/k/k/w;

    const-string v1, "post"

    invoke-virtual {p0, v1, p1, v0}, Lcom/vk/sdk/k/j/a;->c(Ljava/lang/String;Lcom/vk/sdk/k/d;Ljava/lang/Class;)Lcom/vk/sdk/k/f;

    move-result-object p1

    return-object p1
.end method
