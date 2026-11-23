.class public Lcom/vk/sdk/k/i/d;
.super Lcom/vk/sdk/k/i/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/i/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/vk/sdk/k/i/c<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public i:F


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/i/b$d;

    invoke-direct {v0, p1}, Lcom/vk/sdk/k/i/b$d;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/vk/sdk/k/i/c;-><init>(Lcom/vk/sdk/k/i/b$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/vk/sdk/k/i/d;->p()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public p()Landroid/graphics/Bitmap;
    .locals 4

    invoke-virtual {p0}, Lcom/vk/sdk/k/i/c;->j()[B

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v1, p0, Lcom/vk/sdk/k/i/d;->i:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/vk/sdk/k/i/d;->i:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/vk/sdk/k/i/d;->i:F

    mul-float v2, v2, v3

    float-to-int v2, v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public q(Lcom/vk/sdk/k/i/d$b;)V
    .locals 1

    new-instance v0, Lcom/vk/sdk/k/i/d$a;

    invoke-direct {v0, p0, p1}, Lcom/vk/sdk/k/i/d$a;-><init>(Lcom/vk/sdk/k/i/d;Lcom/vk/sdk/k/i/d$b;)V

    invoke-virtual {p0, v0}, Lcom/vk/sdk/k/i/a;->e(Lcom/vk/sdk/k/i/a$d;)V

    return-void
.end method
