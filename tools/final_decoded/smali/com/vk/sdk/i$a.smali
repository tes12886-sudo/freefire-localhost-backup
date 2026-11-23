.class Lcom/vk/sdk/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/i;->q(Lcom/vk/sdk/e;Lcom/vk/sdk/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/e;

.field final synthetic b:Lcom/vk/sdk/e;


# direct methods
.method constructor <init>(Lcom/vk/sdk/e;Lcom/vk/sdk/e;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/i$a;->a:Lcom/vk/sdk/e;

    iput-object p2, p0, Lcom/vk/sdk/i$a;->b:Lcom/vk/sdk/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lcom/vk/sdk/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/vk/sdk/f;

    iget-object v2, p0, Lcom/vk/sdk/i$a;->a:Lcom/vk/sdk/e;

    iget-object v3, p0, Lcom/vk/sdk/i$a;->b:Lcom/vk/sdk/e;

    invoke-virtual {v1, v2, v3}, Lcom/vk/sdk/f;->a(Lcom/vk/sdk/e;Lcom/vk/sdk/e;)V

    goto :goto_0

    :cond_0
    return-void
.end method
