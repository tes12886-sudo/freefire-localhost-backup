.class Lcom/vk/sdk/k/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/f;->x(Lcom/vk/sdk/k/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/vk/sdk/k/c;

.field final synthetic c:Lcom/vk/sdk/k/f;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/f;ZLcom/vk/sdk/k/c;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/f$b;->c:Lcom/vk/sdk/k/f;

    iput-boolean p2, p0, Lcom/vk/sdk/k/f$b;->a:Z

    iput-object p3, p0, Lcom/vk/sdk/k/f$b;->b:Lcom/vk/sdk/k/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-boolean v0, p0, Lcom/vk/sdk/k/f$b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/vk/sdk/k/f$b;->c:Lcom/vk/sdk/k/f;

    iget-object v0, v0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/vk/sdk/k/f$b;->b:Lcom/vk/sdk/k/c;

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    iget-object v0, p0, Lcom/vk/sdk/k/f$b;->c:Lcom/vk/sdk/k/f;

    invoke-static {v0}, Lcom/vk/sdk/k/f;->k(Lcom/vk/sdk/k/f;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/vk/sdk/k/f$b;->c:Lcom/vk/sdk/k/f;

    invoke-static {v0}, Lcom/vk/sdk/k/f;->k(Lcom/vk/sdk/k/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/vk/sdk/k/f$b;->c:Lcom/vk/sdk/k/f;

    invoke-static {v0}, Lcom/vk/sdk/k/f;->k(Lcom/vk/sdk/k/f;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/vk/sdk/k/f;

    iget-object v1, v1, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/vk/sdk/k/f$b;->b:Lcom/vk/sdk/k/c;

    invoke-virtual {v1, v2}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    goto :goto_0

    :cond_2
    return-void
.end method
