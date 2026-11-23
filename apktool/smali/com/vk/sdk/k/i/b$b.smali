.class Lcom/vk/sdk/k/i/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V
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

    iput-object p1, p0, Lcom/vk/sdk/k/i/b$b;->a:Lcom/vk/sdk/k/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/k/i/b$b;->a:Lcom/vk/sdk/k/i/a;

    invoke-static {}, Lcom/vk/sdk/k/i/b;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vk/sdk/k/i/a;->g(Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method
