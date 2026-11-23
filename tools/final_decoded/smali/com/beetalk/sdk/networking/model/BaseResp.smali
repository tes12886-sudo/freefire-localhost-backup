.class public Lcom/beetalk/sdk/networking/model/BaseResp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected errorCode:I

.field protected resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/networking/model/BaseResp;->errorCode:I

    return v0
.end method

.method public getResultCode()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/networking/model/BaseResp;->resultCode:I

    return v0
.end method

.method parseErrorCode(Ljava/lang/String;)I
    .locals 1

    if-nez p1, :cond_0

    :goto_0
    sget-object p1, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    :goto_1
    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const-string v0, "error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "error_params"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_2
    const-string v0, "error_scope"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/garena/pay/android/b;->O:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_3
    const-string v0, "server_error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/garena/pay/android/b;->M:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_4
    const-string v0, "error_token"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcom/beetalk/sdk/g;->b0()V

    sget-object p1, Lcom/garena/pay/android/b;->N:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_5
    sget-object p1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    goto :goto_1
.end method

.method parseResultCode(Lorg/json/JSONObject;)I
    .locals 2

    sget-object v0, Lcom/beetalk/sdk/z/f;->c:Lcom/beetalk/sdk/z/f;

    invoke-virtual {v0}, Lcom/beetalk/sdk/z/f;->c()I

    move-result v0

    const-string v1, "result"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method
