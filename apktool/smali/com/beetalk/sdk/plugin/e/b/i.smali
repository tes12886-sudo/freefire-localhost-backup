.class public Lcom/beetalk/sdk/plugin/e/b/i;
.super Lcom/beetalk/sdk/plugin/e/b/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/b/a<",
        "Ljava/lang/Void;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/e/b/a;-><init>()V

    return-void
.end method

.method static synthetic m(Lcom/beetalk/sdk/plugin/e/b/i;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/i;->o(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic n(Lcom/beetalk/sdk/plugin/e/b/i;Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/i;->p(Landroid/app/Activity;Lorg/json/JSONObject;)V

    return-void
.end method

.method private o(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/i$c;

    invoke-direct {v1, p0, p2}, Lcom/beetalk/sdk/plugin/e/b/i$c;-><init>(Lcom/beetalk/sdk/plugin/e/b/i;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/i;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method private p(Landroid/app/Activity;Lorg/json/JSONObject;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/i$b;

    invoke-direct {v1, p0, p2}, Lcom/beetalk/sdk/plugin/e/b/i$b;-><init>(Lcom/beetalk/sdk/plugin/e/b/i;Lorg/json/JSONObject;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/b/i;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "facebook.request.me"

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p$d;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public i(Ljava/lang/Exception;Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/beetalk/sdk/plugin/e/b/i;->o(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public k(Landroid/app/Activity;)V
    .locals 3

    invoke-static {}, Lcom/facebook/a;->d()Lcom/facebook/a;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/plugin/e/b/i$a;

    invoke-direct {v1, p0, p1}, Lcom/beetalk/sdk/plugin/e/b/i$a;-><init>(Lcom/beetalk/sdk/plugin/e/b/i;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/facebook/u;->A(Lcom/facebook/a;Lcom/facebook/u$d;)Lcom/facebook/u;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "fields"

    const-string v2, "id,name,email,birthday,first_name,last_name"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/facebook/u;->G(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Lcom/facebook/u;->j()Lcom/facebook/v;

    return-void
.end method
