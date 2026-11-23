.class Lcom/vk/sdk/i$b;
.super Lcom/vk/sdk/k/f$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/i;->B(Landroid/content/Context;Lcom/vk/sdk/g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/vk/sdk/g;

.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/vk/sdk/g;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/i$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/vk/sdk/i$b;->b:Lcom/vk/sdk/g;

    iput-object p3, p0, Lcom/vk/sdk/i$b;->c:Landroid/content/Context;

    invoke-direct {p0}, Lcom/vk/sdk/k/f$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/vk/sdk/k/g;)V
    .locals 1

    iget-object p1, p0, Lcom/vk/sdk/i$b;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/vk/sdk/i$b;->b:Lcom/vk/sdk/g;

    invoke-static {p1, v0}, Lcom/vk/sdk/i;->b(Landroid/content/Context;Lcom/vk/sdk/g;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/k/c;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/vk/sdk/k/c;->c:Lcom/vk/sdk/k/c;

    if-eqz p1, :cond_0

    iget p1, p1, Lcom/vk/sdk/k/c;->e:I

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/vk/sdk/i$b;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/vk/sdk/i;->c(Landroid/content/Context;)V

    :cond_0
    iget-object p1, p0, Lcom/vk/sdk/i$b;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/vk/sdk/i$b;->b:Lcom/vk/sdk/g;

    invoke-static {p1, v0}, Lcom/vk/sdk/i;->b(Landroid/content/Context;Lcom/vk/sdk/g;)V

    return-void
.end method
