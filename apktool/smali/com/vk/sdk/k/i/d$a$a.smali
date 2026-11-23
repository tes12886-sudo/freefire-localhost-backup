.class Lcom/vk/sdk/k/i/d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/i/d$a;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/vk/sdk/k/i/d$a;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/i/d$a;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/i/d$a$a;->b:Lcom/vk/sdk/k/i/d$a;

    iput-object p2, p0, Lcom/vk/sdk/k/i/d$a$a;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/vk/sdk/k/i/d$a$a;->b:Lcom/vk/sdk/k/i/d$a;

    iget-object v1, v0, Lcom/vk/sdk/k/i/d$a;->a:Lcom/vk/sdk/k/i/d$b;

    iget-object v0, v0, Lcom/vk/sdk/k/i/d$a;->b:Lcom/vk/sdk/k/i/d;

    iget-object v2, p0, Lcom/vk/sdk/k/i/d$a$a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0, v2}, Lcom/vk/sdk/k/i/a$c;->a(Lcom/vk/sdk/k/i/a;Ljava/lang/Object;)V

    return-void
.end method
