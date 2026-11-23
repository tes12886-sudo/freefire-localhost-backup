.class Lcom/vk/sdk/l/a$e;
.super Lcom/vk/sdk/k/i/d$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/l/a;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/l/a;


# direct methods
.method constructor <init>(Lcom/vk/sdk/l/a;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/l/a$e;->a:Lcom/vk/sdk/l/a;

    invoke-direct {p0}, Lcom/vk/sdk/k/i/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/vk/sdk/k/i/a;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/k/i/d;

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/vk/sdk/l/a$e;->c(Lcom/vk/sdk/k/i/d;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/vk/sdk/k/i/a;Lcom/vk/sdk/k/c;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/k/i/d;

    invoke-virtual {p0, p1, p2}, Lcom/vk/sdk/l/a$e;->d(Lcom/vk/sdk/k/i/d;Lcom/vk/sdk/k/c;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/k/i/d;Landroid/graphics/Bitmap;)V
    .locals 0

    iget-object p1, p0, Lcom/vk/sdk/l/a$e;->a:Lcom/vk/sdk/l/a;

    invoke-static {p1}, Lcom/vk/sdk/l/a;->c(Lcom/vk/sdk/l/a;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/vk/sdk/l/a$e;->a:Lcom/vk/sdk/l/a;

    invoke-static {p1}, Lcom/vk/sdk/l/a;->c(Lcom/vk/sdk/l/a;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/vk/sdk/l/a$e;->a:Lcom/vk/sdk/l/a;

    invoke-static {p1}, Lcom/vk/sdk/l/a;->d(Lcom/vk/sdk/l/a;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method public d(Lcom/vk/sdk/k/i/d;Lcom/vk/sdk/k/c;)V
    .locals 0

    iget-object p1, p0, Lcom/vk/sdk/l/a$e;->a:Lcom/vk/sdk/l/a;

    invoke-static {p1}, Lcom/vk/sdk/l/a;->e(Lcom/vk/sdk/l/a;)V

    return-void
.end method
