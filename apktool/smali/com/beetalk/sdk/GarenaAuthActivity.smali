.class public Lcom/beetalk/sdk/GarenaAuthActivity;
.super Landroid/app/Activity;
.source ""


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Lcom/beetalk/sdk/b$c;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/GarenaAuthActivity;)Lcom/beetalk/sdk/b$c;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

    return-object p0
.end method

.method static synthetic b(Lcom/beetalk/sdk/GarenaAuthActivity;Lcom/beetalk/sdk/b$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/GarenaAuthActivity;->j(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method static synthetic c(Lcom/beetalk/sdk/GarenaAuthActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/beetalk/sdk/GarenaAuthActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/GarenaAuthActivity;->i(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/beetalk/sdk/GarenaAuthActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/GarenaAuthActivity;->h(I)V

    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/GarenaAuthActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/GarenaAuthActivity;->g()V

    return-void
.end method

.method private g()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private h(I)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onAuthFailed-failed"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

    invoke-static {v0, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    new-instance v1, Lcom/beetalk/sdk/GarenaAuthActivity$d;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/GarenaAuthActivity$d;-><init>(Lcom/beetalk/sdk/GarenaAuthActivity;Lcom/beetalk/sdk/b$e;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v1, "onAuthSuccess-user code %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

    invoke-direct {p0, p1, v0}, Lcom/beetalk/sdk/GarenaAuthActivity;->k(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    new-instance v1, Lcom/beetalk/sdk/GarenaAuthActivity$c;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/GarenaAuthActivity$c;-><init>(Lcom/beetalk/sdk/GarenaAuthActivity;Lcom/beetalk/sdk/b$e;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private j(Lcom/beetalk/sdk/b$e;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

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
    iget-object v1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

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
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "garena_auth_result"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object p1, p1, Lcom/beetalk/sdk/b$e;->a:Lcom/beetalk/sdk/b$e$a;

    invoke-static {p1}, Lcom/beetalk/sdk/b$e;->d(Lcom/beetalk/sdk/b$e$a;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    const/4 p1, -0x1

    :goto_1
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private k(Ljava/lang/String;Lcom/beetalk/sdk/b$c;)Lcom/beetalk/sdk/b$e;
    .locals 8

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->c:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/beetalk/sdk/b$c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/beetalk/sdk/z/i/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    sget-object v0, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    sget-object p1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    :goto_0
    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_0
    const-string v2, "open_id"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "access_token"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "refresh_token"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "expiry_time"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "platform"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    new-instance v6, Lcom/beetalk/sdk/u/a;

    sget-object v7, Lcom/beetalk/sdk/u/l;->c:Lcom/beetalk/sdk/u/l;

    invoke-direct {v6, v3, v7, p1}, Lcom/beetalk/sdk/u/a;-><init>(Ljava/lang/String;Lcom/beetalk/sdk/u/l;I)V

    const/4 v3, 0x3

    if-ne p1, v3, :cond_1

    sget-object v3, Lcom/beetalk/sdk/u/l;->e:Lcom/beetalk/sdk/u/l;

    invoke-virtual {v6, v3}, Lcom/beetalk/sdk/u/a;->o(Lcom/beetalk/sdk/u/l;)V

    :cond_1
    invoke-virtual {v6, v4}, Lcom/beetalk/sdk/u/a;->n(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lcom/beetalk/sdk/u/a;->k(I)V

    invoke-static {p2, v6, v2, p1}, Lcom/beetalk/sdk/b$e;->c(Lcom/beetalk/sdk/b$c;Lcom/beetalk/sdk/u/a;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/garena/pay/android/b;->m:Lcom/garena/pay/android/b;

    goto :goto_0

    :goto_1
    if-nez v1, :cond_3

    invoke-static {p2, v0}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v1

    :cond_3
    return-object v1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lcom/beetalk/sdk/i;->A(Landroid/app/Activity;)V

    new-instance p1, Landroid/webkit/WebView;

    invoke-direct {p1, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/CookieManager;->removeAllCookie()V

    invoke-static {}, Lcom/beetalk/sdk/i;->v()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lj/c/b/g;->a:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/i;->v()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :goto_0
    new-instance p1, Landroid/widget/LinearLayout;

    invoke-direct {p1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lj/c/b/b;->a:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    new-instance v0, Lcom/beetalk/sdk/GarenaAuthActivity$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/GarenaAuthActivity$a;-><init>(Lcom/beetalk/sdk/GarenaAuthActivity;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    new-instance v0, Lcom/beetalk/sdk/GarenaAuthActivity$b;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/GarenaAuthActivity$b;-><init>(Lcom/beetalk/sdk/GarenaAuthActivity;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "garena_request_info"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/b$c;

    iput-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/beetalk/sdk/p;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://auth/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/beetalk/sdk/z/d;

    iget-object v2, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->c:Ljava/lang/String;

    const-string v3, "redirect_uri"

    invoke-direct {v1, v3, v2}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/beetalk/sdk/z/d;

    invoke-static {}, Lcom/beetalk/sdk/i;->u()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "source"

    invoke-direct {v1, v3, v2}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/beetalk/sdk/z/d;

    const-string v2, "response_type"

    const-string v3, "code"

    invoke-direct {v1, v2, v3}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/beetalk/sdk/z/d;

    const-string v2, "client_id"

    invoke-direct {v1, v2, p1}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/beetalk/sdk/z/d;

    const-string v1, "display"

    const-string v2, "embedded"

    invoke-direct {p1, v1, v2}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->b:Lcom/beetalk/sdk/b$c;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result p1

    sget-object v1, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne p1, v1, :cond_1

    new-instance p1, Lcom/beetalk/sdk/z/d;

    const-string v1, "create_grant"

    const-string v2, "false"

    invoke-direct {p1, v1, v2}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/beetalk/sdk/z/d;

    const-string v1, "grant"

    const-string v2, "true"

    invoke-direct {p1, v1, v2}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/g;->e(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v1, Lcom/beetalk/sdk/z/d;

    invoke-static {p1}, Lcom/beetalk/sdk/x/g;->f(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "locale"

    invoke-direct {v1, v2, p1}, Lcom/beetalk/sdk/z/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :try_start_1
    iget-object p1, p0, Lcom/beetalk/sdk/GarenaAuthActivity;->a:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/beetalk/sdk/p;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/beetalk/sdk/x/j;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Lcom/beetalk/sdk/x/a;->b(Ljava/lang/Exception;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
