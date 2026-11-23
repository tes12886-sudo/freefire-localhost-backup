.class Lcom/vk/sdk/k/k/u$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/vk/sdk/k/k/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/k/k/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/vk/sdk/k/k/s$a<",
        "Lcom/vk/sdk/k/k/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/k/u;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/k/u;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/k/u$a;->a:Lcom/vk/sdk/k/k/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/k/u$a;->b(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/k;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/k;
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/k/k/u$a;->a:Lcom/vk/sdk/k/k/u;

    invoke-static {v0}, Lcom/vk/sdk/k/k/u;->t(Lcom/vk/sdk/k/k/u;)I

    move-result v0

    iget-object v1, p0, Lcom/vk/sdk/k/k/u$a;->a:Lcom/vk/sdk/k/k/u;

    invoke-static {v1}, Lcom/vk/sdk/k/k/u;->u(Lcom/vk/sdk/k/k/u;)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/vk/sdk/k/k/k;->s(Lorg/json/JSONObject;II)Lcom/vk/sdk/k/k/k;

    move-result-object p1

    return-object p1
.end method
