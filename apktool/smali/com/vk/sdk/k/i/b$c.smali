.class Lcom/vk/sdk/k/i/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/i/b;->b(Lcom/vk/sdk/k/i/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/i/c;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/i/c;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/i/b$c;->a:Lcom/vk/sdk/k/i/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/i/b$c;->a:Lcom/vk/sdk/k/i/c;

    invoke-virtual {v0}, Lcom/vk/sdk/k/i/c;->m()Lcom/vk/sdk/k/i/b$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vk/sdk/k/i/b$d;->a()V

    return-void
.end method
