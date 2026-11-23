.class Lcom/vk/sdk/k/h$b$a;
.super Lcom/vk/sdk/k/f$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/h$b;->g(Ljava/util/concurrent/ExecutorService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/f$d;

.field final synthetic b:Lcom/vk/sdk/k/h$b;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/f$d;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/h$b$a;->b:Lcom/vk/sdk/k/h$b;

    iput-object p2, p0, Lcom/vk/sdk/k/h$b$a;->a:Lcom/vk/sdk/k/f$d;

    invoke-direct {p0}, Lcom/vk/sdk/k/f$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/vk/sdk/k/g;)V
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$a;->b:Lcom/vk/sdk/k/h$b;

    sget-object v1, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    invoke-static {v0, v1}, Lcom/vk/sdk/k/h$b;->i(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/i/a$e;)V

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$a;->b:Lcom/vk/sdk/k/h$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iput-object v0, p1, Lcom/vk/sdk/k/g;->a:Lcom/vk/sdk/k/f;

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$a;->a:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f$d;->b(Lcom/vk/sdk/k/g;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/vk/sdk/k/c;)V
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$a;->b:Lcom/vk/sdk/k/h$b;

    sget-object v1, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    invoke-static {v0, v1}, Lcom/vk/sdk/k/h$b;->j(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/i/a$e;)V

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$a;->b:Lcom/vk/sdk/k/h$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iput-object v0, p1, Lcom/vk/sdk/k/c;->d:Lcom/vk/sdk/k/f;

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$a;->a:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method
