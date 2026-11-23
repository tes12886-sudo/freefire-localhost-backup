.class Lcom/vk/sdk/k/i/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/vk/sdk/k/i/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/i/c;->o(Lcom/vk/sdk/k/i/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/i/a$c;

.field final synthetic b:Lcom/vk/sdk/k/i/c;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/i/c;Lcom/vk/sdk/k/i/a$c;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/i/c$a;->b:Lcom/vk/sdk/k/i/c;

    iput-object p2, p0, Lcom/vk/sdk/k/i/c$a;->a:Lcom/vk/sdk/k/i/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 3

    iget-object v0, p0, Lcom/vk/sdk/k/i/c$a;->b:Lcom/vk/sdk/k/i/c;

    invoke-virtual {v0}, Lcom/vk/sdk/k/i/a;->h()Lcom/vk/sdk/k/i/a$e;

    move-result-object v0

    sget-object v1, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/vk/sdk/k/i/c$a;->b:Lcom/vk/sdk/k/i/c;

    iget-object v1, v0, Lcom/vk/sdk/k/i/c;->f:Ljava/lang/Exception;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/vk/sdk/k/i/c$a;->a:Lcom/vk/sdk/k/i/a$c;

    invoke-virtual {v0}, Lcom/vk/sdk/k/i/c;->l()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/vk/sdk/k/i/a$c;->a(Lcom/vk/sdk/k/i/a;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/vk/sdk/k/i/c$a;->a:Lcom/vk/sdk/k/i/a$c;

    iget-object v1, p0, Lcom/vk/sdk/k/i/c$a;->b:Lcom/vk/sdk/k/i/c;

    iget-object v2, v1, Lcom/vk/sdk/k/i/c;->f:Ljava/lang/Exception;

    invoke-virtual {v1, v2}, Lcom/vk/sdk/k/i/c;->i(Ljava/lang/Exception;)Lcom/vk/sdk/k/c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/vk/sdk/k/i/a$c;->b(Lcom/vk/sdk/k/i/a;Lcom/vk/sdk/k/c;)V

    :goto_1
    return-void
.end method
