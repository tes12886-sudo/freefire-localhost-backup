.class public Lcom/beetalk/sdk/plugin/e/f/a;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/plugin/e/f/a$b;,
        Lcom/beetalk/sdk/plugin/e/f/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/a<",
        "Lcom/beetalk/sdk/plugin/e/f/a$b;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/a;-><init>()V

    return-void
.end method

.method static synthetic i(Lcom/beetalk/sdk/plugin/e/f/a;Lcom/beetalk/sdk/plugin/PluginResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/f/a;->k(Lcom/beetalk/sdk/plugin/PluginResult;)V

    return-void
.end method

.method private k(Lcom/beetalk/sdk/plugin/PluginResult;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/f/a;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected bridge synthetic b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/beetalk/sdk/plugin/e/f/a$b;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/f/a;->j(Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/f/a$b;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "app.feedback"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected j(Landroid/app/Activity;Lcom/beetalk/sdk/plugin/e/f/a$b;)V
    .locals 2

    iget-object v0, p2, Lcom/beetalk/sdk/plugin/e/f/a$b;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->o(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p2, Lcom/beetalk/sdk/plugin/e/f/a$b;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->o(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p2, Lcom/beetalk/sdk/plugin/e/f/a$b;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->o(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/beetalk/sdk/plugin/e/f/a$c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/beetalk/sdk/plugin/e/f/a$c;-><init>(Lcom/beetalk/sdk/plugin/e/f/a;Lcom/beetalk/sdk/plugin/e/f/a$a;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/beetalk/sdk/plugin/e/f/a$b;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p2

    new-instance v0, Lcom/beetalk/sdk/plugin/e/f/a$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/plugin/e/f/a$a;-><init>(Lcom/beetalk/sdk/plugin/e/f/a;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/f/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
