.class Lj/g/a/a/a/y/a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g/a/a/a/y/a$a;->b(Lj/g/a/a/a/y/a$b;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/g/a/a/a/y/a$b;


# direct methods
.method constructor <init>(Lj/g/a/a/a/y/a$a;Lj/g/a/a/a/y/a$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1, p2}, Lj/g/a/a/a/y/a$b;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/y/a$b;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/y/a$b;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/y/a$b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1, p2}, Lj/g/a/a/a/y/a$b;->e(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/y/a$b;->f(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lj/g/a/a/a/y/a$a$a;->a:Lj/g/a/a/a/y/a$b;

    invoke-virtual {v0, p1}, Lj/g/a/a/a/y/a$b;->g(Landroid/app/Activity;)V

    return-void
.end method
