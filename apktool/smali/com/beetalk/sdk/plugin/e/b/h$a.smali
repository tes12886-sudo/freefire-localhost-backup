.class Lcom/beetalk/sdk/plugin/e/b/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/facebook/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/b/h;->k(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/l<",
        "Lcom/facebook/share/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/b/h;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/b/h;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    sget-object v2, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "User Cancelled."

    invoke-static {v1, v2, v3}, Lcom/beetalk/sdk/plugin/e/b/h;->n(Lcom/beetalk/sdk/plugin/e/b/h;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v1

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->a:Landroid/app/Activity;

    iget-object v3, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    invoke-virtual {v3}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/facebook/n;)V
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    sget-object v1, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    invoke-virtual {v1}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Unknown Error."

    :goto_0
    iput-object p1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/facebook/share/a;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    sget-object v1, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "Success"

    invoke-static {v0, v1, v2}, Lcom/beetalk/sdk/plugin/e/b/h;->m(Lcom/beetalk/sdk/plugin/e/b/h;ILjava/lang/String;)Lcom/beetalk/sdk/plugin/PluginResult;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/b/h$a;->b:Lcom/beetalk/sdk/plugin/e/b/h;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/b/h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/share/a;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/b/h$a;->c(Lcom/facebook/share/a;)V

    return-void
.end method
