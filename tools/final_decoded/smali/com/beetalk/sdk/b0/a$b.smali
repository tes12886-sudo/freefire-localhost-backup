.class Lcom/beetalk/sdk/b0/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/vk/sdk/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beetalk/sdk/b0/a;->e(ILandroid/content/Intent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/vk/sdk/g<",
        "Lcom/vk/sdk/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beetalk/sdk/b0/a;


# direct methods
.method constructor <init>(Lcom/beetalk/sdk/b0/a;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b0/a$b;->a:Lcom/beetalk/sdk/b0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/vk/sdk/k/c;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v1, "vk login error: %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/b0/a$b;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {v0}, Lcom/beetalk/sdk/b0/a;->d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/b0/a$b;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {v0}, Lcom/beetalk/sdk/b0/a;->d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beetalk/sdk/b0/a$d;->a(Lcom/vk/sdk/k/c;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/e;

    invoke-virtual {p0, p1}, Lcom/beetalk/sdk/b0/a$b;->c(Lcom/vk/sdk/e;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/e;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "vk login success: %s"

    invoke-static {p1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/beetalk/sdk/b0/a$b;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {p1}, Lcom/beetalk/sdk/b0/a;->d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/b0/a$b;->a:Lcom/beetalk/sdk/b0/a;

    invoke-static {p1}, Lcom/beetalk/sdk/b0/a;->d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/b0/a$d;->b()V

    :cond_0
    return-void
.end method
