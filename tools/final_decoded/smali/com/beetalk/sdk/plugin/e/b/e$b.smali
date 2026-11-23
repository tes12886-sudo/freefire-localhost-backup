.class Lcom/beetalk/sdk/plugin/e/b/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/e;->k(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/l<",
        "Lcom/facebook/share/d/a$d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/e;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/e;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-virtual {v1}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    const-string v1, "Share cancelled"

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->a:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/facebook/n;)V
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-virtual {v1}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Share Failed"

    :goto_0
    iput-object p1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/facebook/share/d/a$d;)V
    .locals 3

    new-instance p1, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {p1}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-virtual {v0}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p1, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iput v0, p1, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    const-string v0, "Successfully shared"

    iput-object v0, p1, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/e$b;->b:Lcom/beetalk/sdk/plugin/e/b/e;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/share/d/a$d;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/e$b;->c(Lcom/facebook/share/d/a$d;)V

    return-void
.end method
