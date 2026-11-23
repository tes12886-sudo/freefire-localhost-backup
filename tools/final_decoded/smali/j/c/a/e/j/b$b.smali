.class Lj/c/a/e/j/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/j/b;


# direct methods
.method constructor <init>(Lj/c/a/e/j/b;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    invoke-static {v0}, Lj/c/a/e/j/b;->b(Lj/c/a/e/j/b;)I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "execute final check:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    invoke-static {v1}, Lj/c/a/e/j/b;->b(Lj/c/a/e/j/b;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lj/c/a/e/j/b;->c(Lj/c/a/e/j/b;I)I

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "status_is_running"

    invoke-virtual {v0, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object v1, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    invoke-static {v1}, Lj/c/a/e/j/b;->d(Lj/c/a/e/j/b;)I

    move-result v1

    const-string v2, "query_version"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    invoke-static {v2}, Lj/c/a/e/j/b;->e(Lj/c/a/e/j/b;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.garena.android.gpns.GNotificationService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "component"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object v1, p0, Lj/c/a/e/j/b$b;->a:Lj/c/a/e/j/b;

    invoke-static {v1}, Lj/c/a/e/j/b;->f(Lj/c/a/e/j/b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lj/c/a/e/j/b;->i(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
