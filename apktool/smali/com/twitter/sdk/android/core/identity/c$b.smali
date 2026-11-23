.class Lcom/twitter/sdk/android/core/identity/c$b;
.super Lj/g/a/a/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/identity/c;->l()Lj/g/a/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/g/a/a/a/c<",
        "Lj/g/a/a/a/y/j/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/twitter/sdk/android/core/identity/c;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/identity/c;)V
    .locals 0

    iput-object p1, p0, Lcom/twitter/sdk/android/core/identity/c$b;->a:Lcom/twitter/sdk/android/core/identity/c;

    invoke-direct {p0}, Lj/g/a/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lj/g/a/a/a/v;)V
    .locals 3

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Failed to get access token"

    invoke-interface {v0, v1, v2, p1}, Lj/g/a/a/a/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/c$b;->a:Lcom/twitter/sdk/android/core/identity/c;

    new-instance v0, Lj/g/a/a/a/q;

    invoke-direct {v0, v2}, Lj/g/a/a/a/q;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/twitter/sdk/android/core/identity/c;->i(ILj/g/a/a/a/q;)V

    return-void
.end method

.method public d(Lj/g/a/a/a/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/j<",
            "Lj/g/a/a/a/y/j/g;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object p1, p1, Lj/g/a/a/a/j;->a:Ljava/lang/Object;

    check-cast p1, Lj/g/a/a/a/y/j/g;

    iget-object v1, p1, Lj/g/a/a/a/y/j/g;->b:Ljava/lang/String;

    const-string v2, "screen_name"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-wide v1, p1, Lj/g/a/a/a/y/j/g;->c:J

    const-string v3, "user_id"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-object v1, p1, Lj/g/a/a/a/y/j/g;->a:Lj/g/a/a/a/r;

    iget-object v1, v1, Lj/g/a/a/a/r;->a:Ljava/lang/String;

    const-string v2, "tk"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p1, Lj/g/a/a/a/y/j/g;->a:Lj/g/a/a/a/r;

    iget-object p1, p1, Lj/g/a/a/a/r;->b:Ljava/lang/String;

    const-string v1, "ts"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/c$b;->a:Lcom/twitter/sdk/android/core/identity/c;

    iget-object p1, p1, Lcom/twitter/sdk/android/core/identity/c;->a:Lcom/twitter/sdk/android/core/identity/c$c;

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lcom/twitter/sdk/android/core/identity/c$c;->a(ILandroid/content/Intent;)V

    return-void
.end method
