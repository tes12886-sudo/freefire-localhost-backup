.class Lj/c/a/e/d/b$c;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c/a/e/d/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/d/b;


# direct methods
.method public constructor <init>(Lj/c/a/e/d/b;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Receive connection ack, request service info"

    invoke-static {p1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-static {v0, p1}, Lj/c/a/e/d/b;->g(Lj/c/a/e/d/b;Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    const-string v1, "REGISTRATION_ID"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lj/c/a/e/d/b;->i(Lj/c/a/e/d/b;Ljava/lang/String;)Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Receive Notification Token "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-static {v0}, Lj/c/a/e/d/b;->h(Lj/c/a/e/d/b;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-static {p1}, Lj/c/a/e/d/b;->h(Lj/c/a/e/d/b;)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lj/c/a/e/d/b$c$a;

    invoke-direct {p1, p0}, Lj/c/a/e/d/b$c$a;-><init>(Lj/c/a/e/d/b$c;)V

    const-wide/16 v0, 0xbb8

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    monitor-enter p1

    :try_start_1
    iget-object v0, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-static {p1}, Lj/c/a/e/d/b;->j(Lj/c/a/e/d/b;)V

    :catch_0
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
