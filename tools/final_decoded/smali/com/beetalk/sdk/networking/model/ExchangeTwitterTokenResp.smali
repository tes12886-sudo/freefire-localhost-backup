.class public Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;
.super Lcom/beetalk/sdk/networking/model/BaseResp;
.source ""


# instance fields
.field private accessToken:Ljava/lang/String;

.field private expireTime:J

.field private openId:Ljava/lang/String;

.field private platform:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/beetalk/sdk/networking/model/BaseResp;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->openId:Ljava/lang/String;

    iput-object v0, p0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->accessToken:Ljava/lang/String;

    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;
    .locals 4

    new-instance v0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;

    invoke-direct {v0}, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;-><init>()V

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string p0, "error"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v1, "error_user_ban"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    :goto_0
    invoke-virtual {p0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    iput p0, v0, Lcom/beetalk/sdk/networking/model/BaseResp;->errorCode:I

    goto :goto_1

    :cond_0
    const-string v1, "invalid_grant"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-static {p0}, Lcom/facebook/a;->r(Lcom/facebook/a;)V

    sget-object p0, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    goto :goto_0

    :goto_1
    return-object v0

    :cond_2
    sget-object p0, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {p0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    iput p0, v0, Lcom/beetalk/sdk/networking/model/BaseResp;->errorCode:I

    const-string p0, "open_id"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->openId:Ljava/lang/String;

    const-string p0, "access_token"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->accessToken:Ljava/lang/String;

    const-string p0, "expiry_time"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->expireTime:J

    const-string p0, "platform"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->platform:I

    return-object v0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    sget-object p0, Lcom/garena/pay/android/b;->K:Lcom/garena/pay/android/b;

    invoke-virtual {p0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    iput p0, v0, Lcom/beetalk/sdk/networking/model/BaseResp;->errorCode:I

    return-object v0
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireTime()I
    .locals 2

    iget-wide v0, p0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->expireTime:J

    long-to-int v1, v0

    return v1
.end method

.method public getOpenId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->openId:Ljava/lang/String;

    return-object v0
.end method

.method public getPlatform()I
    .locals 1

    iget v0, p0, Lcom/beetalk/sdk/networking/model/ExchangeTwitterTokenResp;->platform:I

    return v0
.end method
