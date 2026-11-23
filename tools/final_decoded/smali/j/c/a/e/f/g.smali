.class public Lj/c/a/e/f/g;
.super Landroid/os/Handler;
.source ""

# interfaces
.implements Lj/c/a/e/f/e;


# instance fields
.field private final a:Lj/c/a/e/f/e;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lj/c/a/e/f/e;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lj/c/a/e/f/g;->a:Lj/c/a/e/f/e;

    return-void
.end method


# virtual methods
.method public e(Lj/c/a/e/f/l/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public g(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lj/c/a/e/f/g;->a:Lj/c/a/e/f/e;

    invoke-interface {v0, p1}, Lj/c/a/e/f/e;->g(I)V

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz p1, :cond_2

    check-cast p1, Lj/c/a/e/f/l/b;

    iget-object v0, p0, Lj/c/a/e/f/g;->a:Lj/c/a/e/f/e;

    invoke-interface {v0, p1}, Lj/c/a/e/f/e;->e(Lj/c/a/e/f/l/b;)V

    :cond_2
    :goto_0
    return-void
.end method
