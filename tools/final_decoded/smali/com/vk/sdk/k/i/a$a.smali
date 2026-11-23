.class Lcom/vk/sdk/k/i/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/i/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/i/a;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/i/a;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/i/a$a;->a:Lcom/vk/sdk/k/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/i/a$a;->a:Lcom/vk/sdk/k/i/a;

    invoke-static {v0}, Lcom/vk/sdk/k/i/a;->a(Lcom/vk/sdk/k/i/a;)Lcom/vk/sdk/k/i/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/vk/sdk/k/i/a$a;->a:Lcom/vk/sdk/k/i/a;

    invoke-static {v0}, Lcom/vk/sdk/k/i/a;->a(Lcom/vk/sdk/k/i/a;)Lcom/vk/sdk/k/i/a$d;

    move-result-object v0

    invoke-interface {v0}, Lcom/vk/sdk/k/i/a$d;->onComplete()V

    :cond_0
    return-void
.end method
