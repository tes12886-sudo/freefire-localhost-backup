.class public abstract Lcom/vk/sdk/k/h;
.super Lcom/vk/sdk/k/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/h$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/vk/sdk/k/f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected abstract F(Lorg/json/JSONObject;)Lcom/vk/sdk/k/f;
.end method

.method protected abstract G()Lcom/vk/sdk/k/f;
.end method

.method protected abstract H(Ljava/lang/String;)Lcom/vk/sdk/k/i/e;
.end method

.method public s()Lcom/vk/sdk/k/i/a;
    .locals 2

    new-instance v0, Lcom/vk/sdk/k/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/vk/sdk/k/h$b;-><init>(Lcom/vk/sdk/k/h;Lcom/vk/sdk/k/h$a;)V

    return-object v0
.end method
