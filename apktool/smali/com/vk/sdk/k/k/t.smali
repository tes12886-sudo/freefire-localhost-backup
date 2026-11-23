.class public Lcom/vk/sdk/k/k/t;
.super Lcom/vk/sdk/k/k/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/vk/sdk/k/k/s<",
        "Lcom/vk/sdk/k/k/i;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/k/k/s;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lorg/json/JSONObject;)Lcom/vk/sdk/k/k/g;
    .locals 1

    const-class v0, Lcom/vk/sdk/k/k/i;

    invoke-virtual {p0, p1, v0}, Lcom/vk/sdk/k/k/s;->n(Lorg/json/JSONObject;Ljava/lang/Class;)V

    return-object p0
.end method
