.class Lj/d/a/e/a/a/c$b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/d/a/e/a/a/c$b;


# direct methods
.method constructor <init>(Lj/d/a/e/a/a/c$b;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/c$b$b;->a:Lj/d/a/e/a/a/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    iget-object p1, p0, Lj/d/a/e/a/a/c$b$b;->a:Lj/d/a/e/a/a/c$b;

    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    invoke-static {p1, v0}, Lj/d/a/e/a/a/c$b;->g(Lj/d/a/e/a/a/c$b;Landroid/os/Messenger;)Landroid/os/Messenger;

    iget-object p1, p0, Lj/d/a/e/a/a/c$b$b;->a:Lj/d/a/e/a/a/c$b;

    invoke-static {p1}, Lj/d/a/e/a/a/c$b;->e(Lj/d/a/e/a/a/c$b;)Lj/d/a/e/a/a/f;

    move-result-object p1

    iget-object p2, p0, Lj/d/a/e/a/a/c$b$b;->a:Lj/d/a/e/a/a/c$b;

    invoke-static {p2}, Lj/d/a/e/a/a/c$b;->f(Lj/d/a/e/a/a/c$b;)Landroid/os/Messenger;

    move-result-object p2

    invoke-interface {p1, p2}, Lj/d/a/e/a/a/f;->onServiceConnected(Landroid/os/Messenger;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lj/d/a/e/a/a/c$b$b;->a:Lj/d/a/e/a/a/c$b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lj/d/a/e/a/a/c$b;->g(Lj/d/a/e/a/a/c$b;Landroid/os/Messenger;)Landroid/os/Messenger;

    return-void
.end method
