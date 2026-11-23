.class Lcom/vk/sdk/k/h$b$b$a$a;
.super Lcom/vk/sdk/k/f$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/h$b$b$a;->c(Lcom/vk/sdk/k/i/e;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/h$b$b$a;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/h$b$b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/h$b$b$a$a;->a:Lcom/vk/sdk/k/h$b$b$a;

    invoke-direct {p0}, Lcom/vk/sdk/k/f$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/vk/sdk/k/g;)V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$b$a$a;->a:Lcom/vk/sdk/k/h$b$b$a;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iget-object v0, v0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f$d;->b(Lcom/vk/sdk/k/g;)V

    :cond_0
    iget-object p1, p0, Lcom/vk/sdk/k/h$b$b$a$a;->a:Lcom/vk/sdk/k/h$b$b$a;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    invoke-static {p1, v0}, Lcom/vk/sdk/k/h$b;->k(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/k/c;)V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/h$b$b$a$a;->a:Lcom/vk/sdk/k/h$b$b$a;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object v0, v0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iget-object v0, v0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method
