.class public Lcom/beetalk/sdk/BTLoginActivity;
.super Landroid/app/Activity;
.source ""


# instance fields
.field private a:Ljava/lang/String;

.field protected b:Lcom/beetalk/sdk/b;

.field private c:Lcom/beetalk/sdk/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/beetalk/sdk/BTLoginActivity;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/BTLoginActivity;Lcom/beetalk/sdk/b$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/BTLoginActivity;->b(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private b(Lcom/beetalk/sdk/b$e;)V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/beetalk/sdk/BTLoginActivity;->c:Lcom/beetalk/sdk/b$c;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/beetalk/sdk/b$e;->a:Lcom/beetalk/sdk/b$e$a;

    invoke-static {v1}, Lcom/beetalk/sdk/b$e;->d(Lcom/beetalk/sdk/b$e$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "auth_result"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const p1, 0x10a0001

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onActivityResult"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/beetalk/sdk/b;->l(IILandroid/content/Intent;)Z

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "BTLoginActivity onCreate"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    invoke-static {p0}, Lcom/beetalk/sdk/i;->A(Landroid/app/Activity;)V

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1

    if-nez v1, :cond_0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "recreate session"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lcom/beetalk/sdk/g$l;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object v1

    invoke-static {v1}, Lcom/beetalk/sdk/g;->h0(Lcom/beetalk/sdk/g;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string v1, "saved_auth_client"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/b;

    iput-object p1, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "BTLoginActivity onCreate, get authClient from savedInstanceState"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/beetalk/sdk/b;

    invoke-direct {p1}, Lcom/beetalk/sdk/b;-><init>()V

    iput-object p1, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "request_extra"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/b$c;

    iput-object p1, p0, Lcom/beetalk/sdk/BTLoginActivity;->c:Lcom/beetalk/sdk/b$c;

    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "BTLoginActivity onCreate, savedInstanceState is null, create authClient"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/BTLoginActivity;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    invoke-virtual {p1, p0}, Lcom/beetalk/sdk/b;->m(Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    new-instance v0, Lcom/beetalk/sdk/BTLoginActivity$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/BTLoginActivity$a;-><init>(Lcom/beetalk/sdk/BTLoginActivity;)V

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/b;->n(Lcom/beetalk/sdk/b$d;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "destroy"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->b()V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->stopSync()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->startSync()V

    iget-object v0, p0, Lcom/beetalk/sdk/BTLoginActivity;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Error Calling Package must be set"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    iget-object v1, p0, Lcom/beetalk/sdk/BTLoginActivity;->c:Lcom/beetalk/sdk/b$c;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/b;->o(Lcom/beetalk/sdk/b$c;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "save bundle"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/BTLoginActivity;->b:Lcom/beetalk/sdk/b;

    const-string v1, "saved_auth_client"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method
