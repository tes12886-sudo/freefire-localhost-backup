.class Lcom/twitter/sdk/android/core/identity/c$a;
.super Lj/g/a/a/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/identity/c;->m()Lj/g/a/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/g/a/a/a/c<",
        "Lj/g/a/a/a/y/j/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/twitter/sdk/android/core/identity/c;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/identity/c;)V
    .locals 0

    iput-object p1, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    invoke-direct {p0}, Lj/g/a/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lj/g/a/a/a/v;)V
    .locals 3

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Failed to get request token"

    invoke-interface {v0, v1, v2, p1}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    new-instance v0, Lj/g/a/a/a/q;

    invoke-direct {v0, v2}, Lj/g/a/a/a/q;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/twitter/sdk/android/core/identity/c;->i(ILj/g/a/a/a/q;)V

    return-void
.end method

.method public d(Lj/g/a/a/a/j;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/j<",
            "Lj/g/a/a/a/y/j/g;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    iget-object p1, p1, Lj/g/a/a/a/j;->a:Ljava/lang/Object;

    check-cast p1, Lj/g/a/a/a/y/j/g;

    iget-object p1, p1, Lj/g/a/a/a/y/j/g;->a:Lj/g/a/a/a/r;

    iput-object p1, v0, Lcom/twitter/sdk/android/core/identity/c;->b:Lj/g/a/a/a/r;

    invoke-static {v0}, Lcom/twitter/sdk/android/core/identity/c;->d(Lcom/twitter/sdk/android/core/identity/c;)Lj/g/a/a/a/y/j/d;

    move-result-object p1

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    iget-object v0, v0, Lcom/twitter/sdk/android/core/identity/c;->b:Lj/g/a/a/a/r;

    invoke-virtual {p1, v0}, Lj/g/a/a/a/y/j/d;->g(Lj/g/a/a/a/r;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Redirecting user to web view to complete authorization flow"

    invoke-interface {v0, v1, v2}, Lj/g/a/a/a/h;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    invoke-static {v0}, Lcom/twitter/sdk/android/core/identity/c;->e(Lcom/twitter/sdk/android/core/identity/c;)Landroid/webkit/WebView;

    move-result-object v1

    new-instance v2, Lcom/twitter/sdk/android/core/identity/f;

    iget-object v3, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    invoke-static {v3}, Lcom/twitter/sdk/android/core/identity/c;->d(Lcom/twitter/sdk/android/core/identity/c;)Lj/g/a/a/a/y/j/d;

    move-result-object v3

    iget-object v4, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    invoke-static {v4}, Lcom/twitter/sdk/android/core/identity/c;->f(Lcom/twitter/sdk/android/core/identity/c;)Lj/g/a/a/a/p;

    move-result-object v4

    invoke-virtual {v3, v4}, Lj/g/a/a/a/y/j/d;->e(Lj/g/a/a/a/p;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/twitter/sdk/android/core/identity/c$a;->a:Lcom/twitter/sdk/android/core/identity/c;

    invoke-direct {v2, v3, v4}, Lcom/twitter/sdk/android/core/identity/f;-><init>(Ljava/lang/String;Lcom/twitter/sdk/android/core/identity/f$a;)V

    new-instance v3, Lcom/twitter/sdk/android/core/identity/e;

    invoke-direct {v3}, Lcom/twitter/sdk/android/core/identity/e;-><init>()V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/twitter/sdk/android/core/identity/c;->n(Landroid/webkit/WebView;Landroid/webkit/WebViewClient;Ljava/lang/String;Landroid/webkit/WebChromeClient;)V

    return-void
.end method
