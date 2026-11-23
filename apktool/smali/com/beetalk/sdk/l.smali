.class public Lcom/beetalk/sdk/l;
.super Lcom/beetalk/sdk/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/l$b;
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private b:Lcom/google/android/gms/auth/api/signin/c;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/e;-><init>(Lcom/beetalk/sdk/b;)V

    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/l;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/l;->h(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lcom/beetalk/sdk/l;Lcom/beetalk/sdk/b$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/l;->l(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private h(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 8

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v0

    sget-object v1, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/beetalk/sdk/z/i/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/beetalk/sdk/z/i/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    :goto_0
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "Google login exchange token, result: "

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    sget-object v2, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez p1, :cond_1

    sget-object p1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    :goto_1
    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_2

    :cond_1
    const-string v3, "open_id"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "access_token"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "expiry_time"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "platform"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    new-instance v6, Lcom/beetalk/sdk/u/a;

    sget-object v7, Lcom/beetalk/sdk/u/l;->j:Lcom/beetalk/sdk/u/l;

    invoke-direct {v6, v4, v7, p1}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/beetalk/sdk/u/l;->b:Lcom/beetalk/sdk/u/l;

    invoke-virtual {v6, v0}, Lcom/beetalk/sdk/u/a;->o(Lcom/beetalk/sdk/u/l;)V

    :cond_2
    invoke-virtual {v6, v5}, Lcom/beetalk/sdk/u/a;->k(I)V

    invoke-static {p2, v6, v3, p1}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    goto :goto_2

    :cond_3
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "error_user_ban"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/garena/pay/android/b;->f0:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_4
    const-string v0, "invalid_grant"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/beetalk/sdk/l;->b:Lcom/google/android/gms/auth/api/signin/c;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/c;->q()Lcom/google/android/gms/tasks/Task;

    sget-object p1, Lcom/garena/pay/android/b;->e0:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_5
    sget-object p1, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    goto :goto_1

    :goto_2
    if-nez v1, :cond_6

    invoke-static {p2, v2}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v1

    :cond_6
    return-object v1
.end method

.method private static i(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    sget-object v1, Lcom/beetalk/sdk/l;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    sget-object p0, Lcom/beetalk/sdk/l;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x80

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v1, "com.garena.sdk.google_client_id"

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    :cond_1
    return-object v0
.end method

.method public static j(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/c;
    .locals 3

    invoke-static {p0}, Lcom/beetalk/sdk/l;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "Google client ID is not configured."

    invoke-static {v0, p0}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->k:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {v1, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->d(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/auth/api/signin/a;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/c;

    move-result-object p0

    return-object p0
.end method

.method private k(Lcom/garena/pay/android/b;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private l(Lcom/beetalk/sdk/b$e;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->h:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->v()Lcom/beetalk/sdk/t/k;

    move-result-object v0

    iget-object v1, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    :cond_2
    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private m(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Starting Token Exchange for Google"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/beetalk/sdk/l$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/beetalk/sdk/l$b;-><init>(Lcom/beetalk/sdk/l;Lcom/beetalk/sdk/l$a;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    aput-object p1, v2, v0

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object p1

    sget-object v0, Lcom/garena/pay/android/b;->t:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    :goto_0
    return-void
.end method

.method public static n(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/beetalk/sdk/l;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method d(IILandroid/content/Intent;Lcom/beetalk/sdk/b$c;)Z
    .locals 1

    const/4 p4, 0x0

    const/16 v0, 0x7372

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    if-ne p2, p1, :cond_2

    invoke-static {p3}, Lcom/google/android/gms/auth/api/signin/a;->c(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :try_start_0
    const-class p2, Lcom/google/android/gms/common/api/b;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->u()Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "Google login success"

    new-array p3, p4, [Ljava/lang/Object;

    invoke-static {p2, p3}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->q()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/l;->m(Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    const-string p1, "Google login failed"

    new-array p2, p4, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/l;->k(Lcom/garena/pay/android/b;)V
    :try_end_0
    .catch Lcom/google/android/gms/common/api/b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "signInResult:failed code="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/b;->b()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, p4, [Ljava/lang/Object;

    invoke-static {p2, p3}, Lcom/beetalk/sdk/x/a;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/b;->b()I

    move-result p1

    const/16 p2, 0x30d5

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    :goto_1
    invoke-direct {p0, p1}, Lcom/beetalk/sdk/l;->k(Lcom/garena/pay/android/b;)V

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_3
    return p4
.end method

.method e(Lcom/beetalk/sdk/b$c;)Z
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "start Google Auth"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->f()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/l;->j(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/c;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/l;->b:Lcom/google/android/gms/auth/api/signin/c;

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->f()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->u()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->q()Ljava/lang/String;

    move-result-object v1

    new-array p1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_2

    const-string v2, "already login"

    invoke-static {v2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/beetalk/sdk/l;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v2, "got token failed"

    invoke-static {v2, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_0
    if-nez v1, :cond_4

    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "starting google sign in page"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/beetalk/sdk/l;->b:Lcom/google/android/gms/auth/api/signin/c;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/c;->p()Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->e()Lcom/beetalk/sdk/a;

    move-result-object v0

    const/16 v1, 0x7372

    invoke-interface {v0, p1, v1}, Lcom/beetalk/sdk/a;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_4
    const/4 p1, 0x1

    return p1
.end method
