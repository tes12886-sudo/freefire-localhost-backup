.class Lcom/beetalk/sdk/plugin/e/g/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/g/a;->i(Landroid/app/Activity;Lcom/beetalk/sdk/u/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/g<",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/g/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/g/a;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/g/a$a;->b:Lcom/beetalk/sdk/plugin/e/g/a;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/g/a$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Li/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/plugin/e/g/a$a;->b(Li/i;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Li/i;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i<",
            "Lcom/beetalk/sdk/plugin/PluginResult;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Li/i;->t()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beetalk/sdk/plugin/PluginResult;

    if-nez p1, :cond_0

    new-instance p1, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {p1}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/g/a$a;->b:Lcom/beetalk/sdk/plugin/e/g/a;

    invoke-virtual {v0}, Lcom/beetalk/sdk/plugin/e/g/a;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    sget-object v0, Lcom/garena/pay/android/b;->P:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/g/a$a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/g/a$a;->b:Lcom/beetalk/sdk/plugin/e/g/a;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/g/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
