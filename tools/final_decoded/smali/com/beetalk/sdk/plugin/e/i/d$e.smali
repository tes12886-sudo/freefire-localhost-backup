.class Lcom/beetalk/sdk/plugin/e/i/d$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beetalk/sdk/plugin/e/i/d;
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

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$e;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$e;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/beetalk/sdk/plugin/e/i/d;->f(Lcom/beetalk/sdk/plugin/e/i/d;Z)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$e;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {p1}, Lcom/beetalk/sdk/plugin/e/i/d;->g(Lcom/beetalk/sdk/plugin/e/i/d;)[Lcom/vk/sdk/k/l/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/vk/sdk/i;->g()Lcom/vk/sdk/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/vk/sdk/i;->g()Lcom/vk/sdk/e;

    move-result-object p1

    iget-object p1, p1, Lcom/vk/sdk/e;->c:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-instance v0, Lcom/vk/sdk/k/l/d;

    iget-object v1, p0, Lcom/beetalk/sdk/plugin/e/i/d$e;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {v1}, Lcom/beetalk/sdk/plugin/e/i/d;->g(Lcom/beetalk/sdk/plugin/e/i/d;)[Lcom/vk/sdk/k/l/b;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/vk/sdk/k/l/d;-><init>([Lcom/vk/sdk/k/l/b;JI)V

    new-instance p1, Lcom/beetalk/sdk/plugin/e/i/d$e$a;

    invoke-direct {p1, p0}, Lcom/beetalk/sdk/plugin/e/i/d$e$a;-><init>(Lcom/beetalk/sdk/plugin/e/i/d$e;)V

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f;->n(Lcom/vk/sdk/k/f$d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$e;->a:Lcom/beetalk/sdk/plugin/e/i/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/plugin/e/i/d;->h(Lcom/beetalk/sdk/plugin/e/i/d;Lcom/vk/sdk/k/k/r;)V

    :goto_0
    return-void
.end method
