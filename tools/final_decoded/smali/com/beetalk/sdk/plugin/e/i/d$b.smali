.class Lcom/beetalk/sdk/plugin/e/i/d$b;
.super Lcom/vk/sdk/k/f$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/i/d;->p()V
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

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-direct {p0}, Lcom/vk/sdk/k/f$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/vk/sdk/k/g;)V
    .locals 3

    iget-object p1, p1, Lcom/vk/sdk/k/g;->c:Ljava/lang/Object;

    check-cast p1, Lcom/vk/sdk/k/k/t;

    invoke-virtual {p1}, Lcom/vk/sdk/k/k/s;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/vk/sdk/k/k/i;

    iget-object v1, v0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    const/16 v2, 0x71

    invoke-virtual {v1, v2}, Lcom/vk/sdk/k/k/u;->w(C)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :goto_1
    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d$b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    iget-object v0, v0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    invoke-virtual {v0, v2}, Lcom/vk/sdk/k/k/u;->w(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beetalk/sdk/plugin/e/i/d;->c(Lcom/beetalk/sdk/plugin/e/i/d;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    const/16 v2, 0x70

    invoke-virtual {v1, v2}, Lcom/vk/sdk/k/k/u;->w(C)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lcom/vk/sdk/k/k/i;->n:Lcom/vk/sdk/k/k/u;

    const/16 v2, 0x6d

    invoke-virtual {v1, v2}, Lcom/vk/sdk/k/k/u;->w(C)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_3
    return-void
.end method

.method public c(Lcom/vk/sdk/k/c;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/d$b;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v0}, Lcom/beetalk/sdk/plugin/e/i/d;->b(Lcom/beetalk/sdk/plugin/e/i/d;)Lcom/beetalk/sdk/plugin/e/i/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beetalk/sdk/plugin/e/i/c$a;->a(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method
