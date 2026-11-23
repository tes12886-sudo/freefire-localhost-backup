.class public Lj/c/a/e/b;
.super Lj/c/a/e/a;
.source ""


# static fields
.field private static f:Lj/c/a/e/e/c;

.field public static g:Z


# instance fields
.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lj/c/a/e/a;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lj/c/a/e/b;->e:J

    return-void
.end method

.method private j()V
    .locals 1

    sget-object v0, Lj/c/a/e/b;->f:Lj/c/a/e/e/c;

    invoke-virtual {v0}, Lj/c/a/e/e/c;->t()V

    const/4 v0, 0x0

    sput-object v0, Lj/c/a/e/b;->f:Lj/c/a/e/e/c;

    const/4 v0, 0x0

    sput-boolean v0, Lj/c/a/e/b;->g:Z

    return-void
.end method


# virtual methods
.method public d(Landroid/os/Message;)V
    .locals 4

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lj/c/a/e/i/a;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "REGISTRATION_ID"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x4

    const-string v2, "key_service_version"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    sget-boolean v1, Lj/c/a/e/b;->g:Z

    const-string v2, "key_is_running"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "generate the reply "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "  device:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lj/c/a/e/i/a;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {p0, p1, v0}, Lj/c/a/e/a;->h(Landroid/os/Messenger;Landroid/os/Message;)V

    :goto_0
    return-void
.end method

.method public e()V
    .locals 3

    invoke-static {}, Lj/c/a/e/f/f;->b()V

    sget-object v0, Lj/c/a/e/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/c;->a(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lj/c/a/e/b;->e:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DEVICE_ID : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lj/c/a/e/b;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    sget-object v0, Lj/c/a/e/b;->f:Lj/c/a/e/e/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/c/a/e/e/c;->t()V

    :cond_0
    new-instance v0, Lj/c/a/e/e/c;

    sget-object v1, Lj/c/a/e/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lj/c/a/e/e/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lj/c/a/e/b;->f:Lj/c/a/e/e/c;

    sget-object v0, Lj/c/a/e/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/c;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lj/c/a/e/b;->f:Lj/c/a/e/e/c;

    invoke-virtual {v0}, Lj/c/a/e/e/c;->E()V

    goto :goto_0

    :cond_1
    sget-object v0, Lj/c/a/e/a;->d:Lj/c/a/e/e/a;

    invoke-virtual {v0}, Lj/c/a/e/e/a;->b()V

    :goto_0
    sget-object v0, Lj/c/a/e/a;->d:Lj/c/a/e/e/a;

    new-instance v1, Lj/c/a/e/b$a;

    invoke-direct {v1, p0}, Lj/c/a/e/b$a;-><init>(Lj/c/a/e/b;)V

    invoke-virtual {v0, v1}, Lj/c/a/e/e/a;->a(Landroid/content/BroadcastReceiver;)V

    const-string v0, "Current Service Version: 4"

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected f()V
    .locals 0

    return-void
.end method

.method protected g()V
    .locals 1

    sget-object v0, Lj/c/a/e/b;->f:Lj/c/a/e/e/c;

    invoke-virtual {v0}, Lj/c/a/e/e/c;->p()V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method

.method protected i()V
    .locals 1

    sget-object v0, Lj/c/a/e/a;->d:Lj/c/a/e/e/a;

    invoke-virtual {v0}, Lj/c/a/e/e/a;->d()V

    sget-object v0, Lj/c/a/e/a;->d:Lj/c/a/e/e/a;

    invoke-virtual {v0}, Lj/c/a/e/e/a;->c()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Lj/c/a/e/a;->onDestroy()V

    invoke-direct {p0}, Lj/c/a/e/b;->j()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lj/c/a/e/b;->g:Z

    invoke-super {p0, p1, p2, p3}, Lj/c/a/e/a;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method
