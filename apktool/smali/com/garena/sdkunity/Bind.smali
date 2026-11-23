.class public Lcom/garena/sdkunity/Bind;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/g$m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/sdkunity/Bind$BindSessionRsp;
    }
.end annotation


# instance fields
.field private final OnGetPlatformBindingInfoComplete:Ljava/lang/String;

.field private final OnGetPlatformBindingSession:Ljava/lang/String;

.field private final OnPerformPlatformBindingComplete:Ljava/lang/String;

.field private final UnityOnBindSession:Ljava/lang/String;

.field private final UnityOnClearThirdPartySession:Ljava/lang/String;

.field sdkUnity:Lcom/garena/sdkunity/SdkUnity;


# direct methods
.method public constructor <init>(Lcom/garena/sdkunity/SdkUnity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "OnGetBindSession"

    iput-object v0, p0, Lcom/garena/sdkunity/Bind;->UnityOnBindSession:Ljava/lang/String;

    const-string v0, "OnClearThirdPartySession"

    iput-object v0, p0, Lcom/garena/sdkunity/Bind;->UnityOnClearThirdPartySession:Ljava/lang/String;

    const-string v0, "OnGetPlatformBindingInfoComplete"

    iput-object v0, p0, Lcom/garena/sdkunity/Bind;->OnGetPlatformBindingInfoComplete:Ljava/lang/String;

    const-string v0, "OnGetPlatformBindingSession"

    iput-object v0, p0, Lcom/garena/sdkunity/Bind;->OnGetPlatformBindingSession:Ljava/lang/String;

    const-string v0, "OnPerformPlatformBindingComplete"

    iput-object v0, p0, Lcom/garena/sdkunity/Bind;->OnPerformPlatformBindingComplete:Ljava/lang/String;

    iput-object p1, p0, Lcom/garena/sdkunity/Bind;->sdkUnity:Lcom/garena/sdkunity/SdkUnity;

    return-void
.end method


# virtual methods
.method public clearThirdPartySession()V
    .locals 0

    invoke-static {p0}, Lcom/beetalk/sdk/g;->p(Lcom/beetalk/sdk/g$m;)Z

    return-void
.end method

.method public getBindSession(I)V
    .locals 2

    const-string v0, "getBindSession"

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    new-instance v0, Lcom/beetalk/sdk/g$l;

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/beetalk/sdk/i;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->b(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    sget-object v1, Lcom/beetalk/sdk/c;->c:Lcom/beetalk/sdk/c;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->d(Lcom/beetalk/sdk/c;)Lcom/beetalk/sdk/g$l;

    invoke-static {p1}, Lcom/garena/sdkunity/Utility;->getProvider(I)Lcom/beetalk/sdk/g$o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/beetalk/sdk/p;->h:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/g$l;->e(I)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/garena/sdkunity/SdkUnity;->appKey:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/g$l;->c(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/i;->D(Lcom/beetalk/sdk/g;)V

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object p1

    new-instance v0, Lcom/garena/sdkunity/Bind$1;

    invoke-direct {v0, p0}, Lcom/garena/sdkunity/Bind$1;-><init>(Lcom/garena/sdkunity/Bind;)V

    invoke-static {p1, v0}, Lcom/beetalk/sdk/i;->d(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V

    return-void
.end method

.method public getPlatformBindingInfo()V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/garena/sdkunity/Bind$2;

    invoke-direct {v1, p0}, Lcom/garena/sdkunity/Bind$2;-><init>(Lcom/garena/sdkunity/Bind;)V

    invoke-static {v0, v1}, Lcom/beetalk/sdk/z/i/b;->l(Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object v0

    const-string v1, "OnGetPlatformBindingInfoComplete"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public getPlatformBindingSession(I)V
    .locals 2

    :try_start_0
    new-instance v0, Lcom/beetalk/sdk/g$l;

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/beetalk/sdk/i;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->b(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    sget-object v1, Lcom/garena/sdkunity/SdkUnity;->appKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->c(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    sget-object v1, Lcom/beetalk/sdk/c;->c:Lcom/beetalk/sdk/c;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->d(Lcom/beetalk/sdk/c;)Lcom/beetalk/sdk/g$l;

    invoke-static {p1}, Lcom/garena/sdkunity/Utility;->getProvider(I)Lcom/beetalk/sdk/g$o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/g$l;->e(I)Lcom/beetalk/sdk/g$l;

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/i;->C(Lcom/beetalk/sdk/g;)V

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object p1

    new-instance v0, Lcom/garena/sdkunity/Bind$3;

    invoke-direct {v0, p0}, Lcom/garena/sdkunity/Bind$3;-><init>(Lcom/garena/sdkunity/Bind;)V

    invoke-static {p1, v0}, Lcom/beetalk/sdk/i;->c(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Lcom/garena/sdkunity/Bind$BindSessionRsp;

    invoke-direct {v0, p0}, Lcom/garena/sdkunity/Bind$BindSessionRsp;-><init>(Lcom/garena/sdkunity/Bind;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/garena/sdkunity/Bind$BindSessionRsp;->exception:Ljava/lang/String;

    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p1

    const-string v1, "OnGetPlatformBindingSession"

    invoke-virtual {p1, v1, v0}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onComplete()V
    .locals 3

    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object v0

    const-string v1, "OnClearThirdPartySession"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public performPlatformBinding()V
    .locals 4

    const-string v0, "OnPerformPlatformBindingComplete"

    :try_start_0
    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, ""

    if-eqz v1, :cond_3

    :try_start_1
    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/garena/sdkunity/Bind$4;

    invoke-direct {v3, p0}, Lcom/garena/sdkunity/Bind$4;-><init>(Lcom/garena/sdkunity/Bind;)V

    invoke-static {v2, v1, v3}, Lcom/beetalk/sdk/z/i/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/z/e$h;)V

    goto :goto_2

    :cond_2
    :goto_0
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_1
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_2
    const-string v3, "error"

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Lorg/json/JSONObject;)V

    :goto_2
    return-void
.end method

.method public resetGuest()V
    .locals 1

    const-string v0, "Bind.resetGuest"

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/i;->h(Landroid/content/Context;)Ljava/lang/String;

    return-void
.end method
