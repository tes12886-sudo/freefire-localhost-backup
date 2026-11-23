.class Lcom/beetalk/sdk/plugin/e/i/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/plugin/e/i/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/i/e;->m(Landroid/app/Activity;Lcom/beetalk/sdk/b0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/beetalk/sdk/plugin/e/i/e;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/i/e;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->b:Lcom/beetalk/sdk/plugin/e/i/e;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/vk/sdk/k/c;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v1, "vk share failed: %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, p1, Lcom/vk/sdk/k/c;->e:I

    const/16 v0, -0x66

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->b:Lcom/beetalk/sdk/plugin/e/i/e;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->a:Landroid/app/Activity;

    sget-object v1, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->b:Lcom/beetalk/sdk/plugin/e/i/e;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->a:Landroid/app/Activity;

    sget-object v1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    :goto_0
    invoke-static {p1, v0, v1}, Lcom/beetalk/sdk/plugin/e/i/e;->l(Lcom/beetalk/sdk/plugin/e/i/e;Landroid/app/Activity;Lcom/garena/pay/android/b;)V

    return-void
.end method

.method public b(I)V
    .locals 3

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "vk share complete"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->b:Lcom/beetalk/sdk/plugin/e/i/e;

    invoke-virtual {v1}, Lcom/beetalk/sdk/plugin/e/i/e;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    iput p1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    sget-object p1, Lcom/garena/pay/android/b;->c:Lcom/garena/pay/android/b;

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    const-string p1, "Success"

    iput-object p1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p1

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->b:Lcom/beetalk/sdk/plugin/e/i/e;

    invoke-virtual {v2}, Lcom/beetalk/sdk/plugin/e/i/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "vk share canceled"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->b:Lcom/beetalk/sdk/plugin/e/i/e;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/e$a;->a:Landroid/app/Activity;

    sget-object v2, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-static {v0, v1, v2}, Lcom/beetalk/sdk/plugin/e/i/e;->l(Lcom/beetalk/sdk/plugin/e/i/e;Landroid/app/Activity;Lcom/garena/pay/android/b;)V

    return-void
.end method
