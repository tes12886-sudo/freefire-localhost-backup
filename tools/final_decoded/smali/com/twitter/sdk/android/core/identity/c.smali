.class Lcom/twitter/sdk/android/core/identity/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/twitter/sdk/android/core/identity/f$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/twitter/sdk/android/core/identity/c$c;
    }
.end annotation


# instance fields
.field final a:Lcom/twitter/sdk/android/core/identity/c$c;

.field b:Lj/g/a/a/a/r;

.field private final c:Landroid/widget/ProgressBar;

.field private final d:Landroid/webkit/WebView;

.field private final e:Lj/g/a/a/a/p;

.field private final f:Lj/g/a/a/a/y/j/d;


# direct methods
.method constructor <init>(Landroid/widget/ProgressBar;Landroid/webkit/WebView;Lj/g/a/a/a/p;Lj/g/a/a/a/y/j/d;Lcom/twitter/sdk/android/core/identity/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/identity/c;->c:Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/twitter/sdk/android/core/identity/c;->d:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/twitter/sdk/android/core/identity/c;->e:Lj/g/a/a/a/p;

    iput-object p4, p0, Lcom/twitter/sdk/android/core/identity/c;->f:Lj/g/a/a/a/y/j/d;

    iput-object p5, p0, Lcom/twitter/sdk/android/core/identity/c;->a:Lcom/twitter/sdk/android/core/identity/c$c;

    return-void
.end method

.method static synthetic d(Lcom/twitter/sdk/android/core/identity/c;)Lj/g/a/a/a/y/j/d;
    .locals 0

    iget-object p0, p0, Lcom/twitter/sdk/android/core/identity/c;->f:Lj/g/a/a/a/y/j/d;

    return-object p0
.end method

.method static synthetic e(Lcom/twitter/sdk/android/core/identity/c;)Landroid/webkit/WebView;
    .locals 0

    iget-object p0, p0, Lcom/twitter/sdk/android/core/identity/c;->d:Landroid/webkit/WebView;

    return-object p0
.end method

.method static synthetic f(Lcom/twitter/sdk/android/core/identity/c;)Lj/g/a/a/a/p;
    .locals 0

    iget-object p0, p0, Lcom/twitter/sdk/android/core/identity/c;->e:Lj/g/a/a/a/p;

    return-object p0
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/c;->c:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/c;->d:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/identity/c;->g()V

    return-void
.end method

.method private j(Lcom/twitter/sdk/android/core/identity/i;)V
    .locals 3

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "OAuth web view completed with an error"

    invoke-interface {v0, v1, v2, p1}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lj/g/a/a/a/q;

    invoke-direct {p1, v2}, Lj/g/a/a/a/q;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lcom/twitter/sdk/android/core/identity/c;->i(ILj/g/a/a/a/q;)V

    return-void
.end method

.method private k(Landroid/os/Bundle;)V
    .locals 4

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "OAuth web view completed successfully"

    invoke-interface {v0, v1, v2}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string v0, "oauth_verifier"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object p1

    const-string v2, "Converting the request token to an access token."

    invoke-interface {p1, v1, v2}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/c;->f:Lj/g/a/a/a/y/j/d;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/identity/c;->l()Lj/g/a/a/a/c;

    move-result-object v1

    iget-object v2, p0, Lcom/twitter/sdk/android/core/identity/c;->b:Lj/g/a/a/a/r;

    invoke-virtual {p1, v1, v2, v0}, Lj/g/a/a/a/y/j/d;->k(Lj/g/a/a/a/c;Lj/g/a/a/a/r;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to get authorization, bundle incomplete "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    new-instance v0, Lj/g/a/a/a/q;

    const-string v1, "Failed to get authorization, bundle incomplete"

    invoke-direct {v0, v1}, Lj/g/a/a/a/q;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/twitter/sdk/android/core/identity/c;->i(ILj/g/a/a/a/q;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/identity/c;->g()V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/twitter/sdk/android/core/identity/c;->k(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/identity/c;->h()V

    return-void
.end method

.method public c(Lcom/twitter/sdk/android/core/identity/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/twitter/sdk/android/core/identity/c;->j(Lcom/twitter/sdk/android/core/identity/i;)V

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/identity/c;->h()V

    return-void
.end method

.method protected i(ILj/g/a/a/a/q;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "auth_error"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object p2, p0, Lcom/twitter/sdk/android/core/identity/c;->a:Lcom/twitter/sdk/android/core/identity/c$c;

    invoke-interface {p2, p1, v0}, Lcom/twitter/sdk/android/core/identity/c$c;->a(ILandroid/content/Intent;)V

    return-void
.end method

.method l()Lj/g/a/a/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/y/j/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/twitter/sdk/android/core/identity/c$b;

    invoke-direct {v0, p0}, Lcom/twitter/sdk/android/core/identity/c$b;-><init>(Lcom/twitter/sdk/android/core/identity/c;)V

    return-object v0
.end method

.method m()Lj/g/a/a/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/y/j/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/twitter/sdk/android/core/identity/c$a;

    invoke-direct {v0, p0}, Lcom/twitter/sdk/android/core/identity/c$a;-><init>(Lcom/twitter/sdk/android/core/identity/c;)V

    return-object v0
.end method

.method n(Landroid/webkit/WebView;Landroid/webkit/WebViewClient;Ljava/lang/String;Landroid/webkit/WebChromeClient;)V
    .locals 3

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p1, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setVisibility(I)V

    invoke-virtual {p1, p4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method o()V
    .locals 3

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Obtaining request token to start the sign in flow"

    invoke-interface {v0, v1, v2}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/c;->f:Lj/g/a/a/a/y/j/d;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/identity/c;->m()Lj/g/a/a/a/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/g/a/a/a/y/j/d;->l(Lj/g/a/a/a/c;)V

    return-void
.end method
