.class Lcom/vk/sdk/VKServiceActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/vk/sdk/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vk/sdk/VKServiceActivity;->onActivityResult(IILandroid/content/Intent;)V
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
.field final synthetic a:Lcom/vk/sdk/VKServiceActivity;


# direct methods
.method constructor <init>(Lcom/vk/sdk/VKServiceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/vk/sdk/k/c;)V
    .locals 5

    iget-object v0, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    invoke-static {v0}, Lcom/vk/sdk/VKServiceActivity;->a(Lcom/vk/sdk/VKServiceActivity;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/vk/sdk/h;->a(J)Lcom/vk/sdk/h;

    move-result-object v0

    instance-of v1, v0, Lcom/vk/sdk/k/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/vk/sdk/k/c;

    iget-object v1, v0, Lcom/vk/sdk/k/c;->d:Lcom/vk/sdk/k/f;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/vk/sdk/k/f;->m()V

    iget-object v0, v0, Lcom/vk/sdk/k/c;->d:Lcom/vk/sdk/k/f;

    iget-object v0, v0, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/vk/sdk/k/f$d;->c(Lcom/vk/sdk/k/c;)V

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p1}, Lcom/vk/sdk/h;->b()J

    move-result-wide v3

    const-string p1, "vk_extra_error_id"

    invoke-virtual {v2, p1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    :goto_0
    iget-object p1, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/vk/sdk/e;

    invoke-virtual {p0, p1}, Lcom/vk/sdk/VKServiceActivity$a;->c(Lcom/vk/sdk/e;)V

    return-void
.end method

.method public c(Lcom/vk/sdk/e;)V
    .locals 1

    iget-object p1, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    iget-object p1, p0, Lcom/vk/sdk/VKServiceActivity$a;->a:Lcom/vk/sdk/VKServiceActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
