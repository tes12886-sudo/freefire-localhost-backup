.class final Lj/d/a/e/a/a/i/b$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lj/d/a/e/a/a/i/b;


# direct methods
.method public constructor <init>(Lj/d/a/e/a/a/i/b;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/i/b$a;->a:Lj/d/a/e/a/a/i/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p0, Lj/d/a/e/a/a/i/b$a;->a:Lj/d/a/e/a/a/i/b;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lj/d/a/e/a/a/i/b;->onHandleIntent(Landroid/content/Intent;)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/b$a;->a:Lj/d/a/e/a/a/i/b;

    invoke-virtual {v0}, Lj/d/a/e/a/a/i/b;->shouldStop()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CancellableIntentService"

    const-string v1, "stopSelf"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lj/d/a/e/a/a/i/b$a;->a:Lj/d/a/e/a/a/i/b;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, p1}, Landroid/app/Service;->stopSelf(I)V

    const-string p1, "afterStopSelf"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
