.class Lcom/vk/sdk/k/h$b$b$a;
.super Lcom/vk/sdk/k/i/e$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/k/h$b$b;->b(Lcom/vk/sdk/k/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vk/sdk/k/h$b$b;


# direct methods
.method constructor <init>(Lcom/vk/sdk/k/h$b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    invoke-direct {p0}, Lcom/vk/sdk/k/i/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/vk/sdk/k/i/a;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/k/i/e;

    check-cast p2, Lorg/json/JSONObject;

    invoke-virtual {p0, p1, p2}, Lcom/vk/sdk/k/h$b$b$a;->c(Lcom/vk/sdk/k/i/e;Lorg/json/JSONObject;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/vk/sdk/k/i/a;Lcom/vk/sdk/k/c;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/k/i/e;

    invoke-virtual {p0, p1, p2}, Lcom/vk/sdk/k/h$b$b$a;->d(Lcom/vk/sdk/k/i/e;Lcom/vk/sdk/k/c;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/k/i/e;Lorg/json/JSONObject;)V
    .locals 0

    iget-object p1, p0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    invoke-virtual {p1, p2}, Lcom/vk/sdk/k/h;->F(Lorg/json/JSONObject;)Lcom/vk/sdk/k/f;

    move-result-object p1

    new-instance p2, Lcom/vk/sdk/k/h$b$b$a$a;

    invoke-direct {p2, p0}, Lcom/vk/sdk/k/h$b$b$a$a;-><init>(Lcom/vk/sdk/k/h$b$b$a;)V

    invoke-virtual {p1, p2}, Lcom/vk/sdk/k/f;->D(Lcom/vk/sdk/k/f$d;)V

    iget-object p2, p0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object p2, p2, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    invoke-virtual {p1}, Lcom/vk/sdk/k/f;->s()Lcom/vk/sdk/k/i/a;

    move-result-object p1

    iput-object p1, p2, Lcom/vk/sdk/k/h$b;->e:Lcom/vk/sdk/k/i/a;

    iget-object p1, p0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b;->e:Lcom/vk/sdk/k/i/a;

    invoke-static {p1}, Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V

    return-void
.end method

.method public d(Lcom/vk/sdk/k/i/e;Lcom/vk/sdk/k/c;)V
    .locals 0

    iget-object p1, p0, Lcom/vk/sdk/k/h$b$b$a;->a:Lcom/vk/sdk/k/h$b$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b$b;->a:Lcom/vk/sdk/k/h$b;

    iget-object p1, p1, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iget-object p1, p1, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method
