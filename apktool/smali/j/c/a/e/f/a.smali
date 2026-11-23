.class public Lj/c/a/e/f/a;
.super Landroid/os/Handler;
.source ""

# interfaces
.implements Lj/c/a/e/f/b;


# instance fields
.field private final a:Lj/c/a/e/f/b;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lj/c/a/e/f/b;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lj/c/a/e/f/a;->a:Lj/c/a/e/f/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public c(Lj/c/a/e/f/l/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public d()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public f()V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    if-eq v0, p1, :cond_2

    const/4 p1, 0x2

    if-eq v0, p1, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "CONNECT_REGION_SERVER"

    invoke-static {p1}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lj/c/a/e/f/a;->a:Lj/c/a/e/f/b;

    invoke-interface {p1}, Lj/c/a/e/f/b;->f()V

    goto :goto_0

    :cond_1
    const-string p1, "AUTH_WITH_SERVER"

    invoke-static {p1}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lj/c/a/e/f/a;->a:Lj/c/a/e/f/b;

    invoke-interface {p1}, Lj/c/a/e/f/b;->d()V

    goto :goto_0

    :cond_2
    const-string p1, "SETUP_CONNECTION"

    invoke-static {p1}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lj/c/a/e/f/a;->a:Lj/c/a/e/f/b;

    invoke-interface {p1}, Lj/c/a/e/f/b;->a()V

    goto :goto_0

    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz p1, :cond_4

    check-cast p1, Lj/c/a/e/f/l/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ON_PACKET_SEND : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj/c/a/e/f/l/b;->b()I

    move-result v1

    invoke-static {v1}, Lj/c/a/e/l/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/f/a;->a:Lj/c/a/e/f/b;

    invoke-interface {v0, p1}, Lj/c/a/e/f/b;->c(Lj/c/a/e/f/l/b;)V

    :cond_4
    :goto_0
    return-void
.end method
