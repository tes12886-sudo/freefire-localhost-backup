.class Lcom/beetalk/sdk/plugin/e/i/d$c;
.super Lcom/vk/sdk/k/i/d$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/plugin/e/i/d;->k(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/beetalk/sdk/plugin/e/i/d;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/plugin/e/i/d;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$c;->c:Lcom/beetalk/sdk/plugin/e/i/d;

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/i/d$c;->a:Ljava/lang/String;

    iput p3, p0, Lcom/beetalk/sdk/plugin/e/i/d$c;->b:I

    invoke-direct {p0}, Lcom/vk/sdk/k/i/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/vk/sdk/k/i/a;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/k/i/d;

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/d$c;->c(Lcom/vk/sdk/k/i/d;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/vk/sdk/k/i/a;Lcom/vk/sdk/k/c;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/k/i/d;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/d$c;->d(Lcom/vk/sdk/k/i/d;Lcom/vk/sdk/k/c;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/k/i/d;Landroid/graphics/Bitmap;)V
    .locals 2

    if-nez p2, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lcom/beetalk/sdk/plugin/e/i/d$c$a;

    invoke-direct {p2, p0}, Lcom/beetalk/sdk/plugin/e/i/d$c$a;-><init>(Lcom/beetalk/sdk/plugin/e/i/d$c;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/d$c;->c:Lcom/beetalk/sdk/plugin/e/i/d;

    invoke-static {p1, p2}, Lcom/beetalk/sdk/plugin/e/i/d;->e(Lcom/beetalk/sdk/plugin/e/i/d;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public d(Lcom/vk/sdk/k/i/d;Lcom/vk/sdk/k/c;)V
    .locals 0

    return-void
.end method
