.class Lcom/twitter/sdk/android/core/identity/d;
.super Lcom/twitter/sdk/android/core/identity/a;
.source ""


# direct methods
.method constructor <init>(Lj/g/a/a/a/p;Lj/g/a/a/a/c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/p;",
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/twitter/sdk/android/core/identity/a;-><init>(Lj/g/a/a/a/p;Lj/g/a/a/a/c;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/identity/d;->e(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    iget v1, p0, Lcom/twitter/sdk/android/core/identity/a;->a:I

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p1, 0x1

    return p1
.end method

.method e(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/twitter/sdk/android/core/identity/OAuthActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/identity/a;->b()Lj/g/a/a/a/p;

    move-result-object p1

    const-string v1, "auth_config"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
