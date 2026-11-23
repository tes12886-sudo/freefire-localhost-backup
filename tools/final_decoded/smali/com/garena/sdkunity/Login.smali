.class public Lcom/garena/sdkunity/Login;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/g$n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/garena/sdkunity/Login$SAFResult;,
        Lcom/garena/sdkunity/Login$LoginRsp;
    }
.end annotation


# instance fields
.field private final UnityOnLogin:Ljava/lang/String;

.field private onSessionProcessedCallback:Ljava/lang/String;

.field sdkUnity:Lcom/garena/sdkunity/SdkUnity;


# direct methods
.method public constructor <init>(Lcom/garena/sdkunity/SdkUnity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "OnLogin"

    iput-object v0, p0, Lcom/garena/sdkunity/Login;->UnityOnLogin:Ljava/lang/String;

    iput-object p1, p0, Lcom/garena/sdkunity/Login;->sdkUnity:Lcom/garena/sdkunity/SdkUnity;

    return-void
.end method

.method public static onAutosaveGuestResult(ILandroid/content/Intent;)V
    .locals 3

    const-string p0, "KEY_SAF_PERMISSION_RET"

    new-instance v0, Lcom/garena/sdkunity/Login$SAFResult;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/garena/sdkunity/Login$SAFResult;-><init>(Lcom/garena/sdkunity/Login$1;)V

    const/4 v1, 0x3

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    iput p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "KEY_SAF_EXCEPTION"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    goto :goto_1

    :cond_0
    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "autosave returned null"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "autosave exception: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p0

    const-string p1, "OnAutosaveGuestResult"

    invoke-virtual {p0, p1, v0}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static onBackupGuestResult(ILandroid/content/Intent;)V
    .locals 3

    const-string p0, "KEY_SAF_PERMISSION_RET"

    new-instance v0, Lcom/garena/sdkunity/Login$SAFResult;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/garena/sdkunity/Login$SAFResult;-><init>(Lcom/garena/sdkunity/Login$1;)V

    const/4 v1, 0x3

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    iput p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "KEY_SAF_EXCEPTION"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    goto :goto_1

    :cond_0
    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "backup returned null"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "backup exception: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p0

    const-string p1, "OnBackupGuestResult"

    invoke-virtual {p0, p1, v0}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static onMigrateGuestResult(ILandroid/content/Intent;)V
    .locals 3

    const-string p0, "KEY_SAF_PERMISSION_RET"

    new-instance v0, Lcom/garena/sdkunity/Login$SAFResult;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/garena/sdkunity/Login$SAFResult;-><init>(Lcom/garena/sdkunity/Login$1;)V

    const/4 v1, 0x3

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    iput p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "KEY_SAF_EXCEPTION"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    goto :goto_1

    :cond_0
    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "migrate returned null"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "migrate exception: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p0

    const-string p1, "OnMigrateGuestResult"

    invoke-virtual {p0, p1, v0}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static onResetGuestResult(ILandroid/content/Intent;)V
    .locals 3

    const-string p0, "KEY_SAF_PERMISSION_RET"

    new-instance v0, Lcom/garena/sdkunity/Login$SAFResult;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/garena/sdkunity/Login$SAFResult;-><init>(Lcom/garena/sdkunity/Login$1;)V

    const/4 v1, 0x3

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    iput p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "KEY_SAF_EXCEPTION"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    goto :goto_1

    :cond_0
    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    const-string p0, "reset returned null"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    iput v1, v0, Lcom/garena/sdkunity/Login$SAFResult;->result:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reset exception: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/garena/sdkunity/Login$SAFResult;->msg:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p0

    const-string p1, "OnResetGuestResult"

    invoke-virtual {p0, p1, v0}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static stringIsNullOrEmpty(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public autosaveGuest()V
    .locals 1

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/account/b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public backupGuest()V
    .locals 1

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/account/b;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public getLoginRecord()I
    .locals 1

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/i;->y(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->D()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public login(IZ)V
    .locals 1

    const-string v0, "OnLogin"

    iput-object v0, p0, Lcom/garena/sdkunity/Login;->onSessionProcessedCallback:Ljava/lang/String;

    if-eqz p2, :cond_0

    :goto_0
    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/beetalk/sdk/i;->E(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V

    goto :goto_4

    :cond_0
    new-instance p2, Lcom/beetalk/sdk/g$l;

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    sget-object v0, Lcom/garena/sdkunity/SdkUnity;->appId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/beetalk/sdk/g$l;->b(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    sget-object v0, Lcom/garena/sdkunity/SdkUnity;->appKey:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/beetalk/sdk/g$l;->c(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    sget-object v0, Lcom/beetalk/sdk/c;->c:Lcom/beetalk/sdk/c;

    invoke-virtual {p2, v0}, Lcom/beetalk/sdk/g$l;->d(Lcom/beetalk/sdk/c;)Lcom/beetalk/sdk/g$l;

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/16 v0, 0x8

    if-eq p1, v0, :cond_5

    const/16 v0, 0xb

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    goto :goto_3

    :cond_1
    sget-object p1, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/beetalk/sdk/p;->e:Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    goto :goto_2

    :cond_3
    sget-object p1, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/beetalk/sdk/p;->d:Ljava/lang/Integer;

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/g$l;->e(I)Lcom/beetalk/sdk/g$l;

    goto :goto_3

    :cond_4
    sget-object p1, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/beetalk/sdk/p;->g:Ljava/lang/Integer;

    goto :goto_1

    :cond_5
    sget-object p1, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    sget-object p1, Lcom/beetalk/sdk/p;->f:Ljava/lang/Integer;

    goto :goto_1

    :cond_6
    sget-object p1, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    :goto_2
    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    :goto_3
    invoke-virtual {p2}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/i;->B(Lcom/beetalk/sdk/g;)V

    goto :goto_0

    :goto_4
    return-void
.end method

.method public logout()V
    .locals 2

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/garena/sdkunity/Login$1;

    invoke-direct {v1, p0}, Lcom/garena/sdkunity/Login$1;-><init>(Lcom/garena/sdkunity/Login;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public migrateGuest()V
    .locals 1

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/account/b;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public needGuestBackup()Z
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/i;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/Login;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/i;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/Login;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public needGuestMigration()Z
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/i;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/Login;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/i;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/Login;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V
    .locals 3

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/q;->b:Lcom/beetalk/sdk/q;

    if-ne v0, v1, :cond_0

    const-string p1, "opening new session"

    invoke-static {p1}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p2, :cond_4

    new-instance p2, Lcom/garena/sdkunity/Login$LoginRsp;

    invoke-direct {p2, p0}, Lcom/garena/sdkunity/Login$LoginRsp;-><init>(Lcom/garena/sdkunity/Login;)V

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    if-ne v0, v1, :cond_1

    const-string v0, "Login Success. Game can send the token to game server"

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/garena/sdkunity/Login$LoginRsp;->openID:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/garena/sdkunity/Login$LoginRsp;->accessToken:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "session.getPlatform(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->D()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "session.getTokenValue().getTokenProvider(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/l;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "session.getTokenValue().getMainPlatform(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/u/a;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/garena/sdkunity/SdkUnity;->Log(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->D()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p2, Lcom/garena/sdkunity/Login$LoginRsp;->platform:I

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beetalk/sdk/u/a;->e()I

    move-result p1

    iput p1, p2, Lcom/garena/sdkunity/Login$LoginRsp;->mainPlatform:I

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    const-string v2, "[GarenaMSDK]"

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/q;->d:Lcom/beetalk/sdk/q;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unprocess seesion status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_3
    :goto_0
    const-string v0, "Login fail"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcom/beetalk/sdk/g;->z()I

    move-result p1

    iput p1, p2, Lcom/garena/sdkunity/Login$LoginRsp;->errCode:I

    :goto_1
    invoke-static {}, Lcom/garena/sdkunity/UnityMessgae;->getInstance()Lcom/garena/sdkunity/UnityMessgae;

    move-result-object p1

    iget-object v0, p0, Lcom/garena/sdkunity/Login;->onSessionProcessedCallback:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/garena/sdkunity/UnityMessgae;->sendToUnity(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_2
    return-void
.end method

.method public resetGuest()V
    .locals 1

    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/account/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public setGoogleClientID(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/beetalk/sdk/l;->n(Ljava/lang/String;)V

    return-void
.end method

.method public supportGuestBackup()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public supportGuestMigration()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1e

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/garena/sdkunity/SdkUnity;->getGameActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Lcom/beetalk/sdk/account/MigrateGuestActivity;->g()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_1

    const/4 v1, 0x1

    :catchall_0
    :cond_1
    return v1
.end method
