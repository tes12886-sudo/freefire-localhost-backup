.class Lcom/beetalk/sdk/plugin/e/i/d$d;
.super Lcom/vk/sdk/k/f$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/i/d;->l(Lcom/vk/sdk/k/k/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/plugin/e/i/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/i/d;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-direct {p0}, Lcom/vk/sdk/k/f$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/vk/sdk/k/g;)V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->f(Lcom/beetalk/sdk/plugin/e/i/d;Z)V

    iget-object p1, p1, Lcom/vk/sdk/k/g;->c:Ljava/lang/Object;

    check-cast p1, Lcom/vk/sdk/k/k/w;

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object v0

    iget p1, p1, Lcom/vk/sdk/k/k/w;->a:I

    invoke-interface {v0, p1}, Lcom/beetalk/sdk/plugin/e/i/c$a;->b(I)V

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {p1}, Lcom/beetalk/sdk/plugin/e/i/d;->a(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/d$f;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/plugin/e/i/d$f;->dismissAllowingStateLoss()V

    return-void
.end method

.method public c(Lcom/vk/sdk/k/c;)V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/d;->f(Lcom/beetalk/sdk/plugin/e/i/d;Z)V

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$d;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beetalk/sdk/plugin/e/i/c$a;->a(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method
