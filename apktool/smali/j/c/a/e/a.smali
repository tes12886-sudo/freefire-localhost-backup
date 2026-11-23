.class public abstract Lj/c/a/e/a;
.super Landroid/app/Service;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/c/a/e/a$b;
    }
.end annotation


# static fields
.field protected static b:Landroid/content/Context;

.field protected static c:Lj/c/a/e/g/a;

.field protected static d:Lj/c/a/e/e/a;


# instance fields
.field final a:Landroid/os/Messenger;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lj/c/a/e/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lj/c/a/e/a$b;-><init>(Lj/c/a/e/a;Lj/c/a/e/a$a;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lj/c/a/e/a;->a:Landroid/os/Messenger;

    return-void
.end method

.method public static a()Lj/c/a/e/e/a;
    .locals 1

    sget-object v0, Lj/c/a/e/a;->d:Lj/c/a/e/e/a;

    return-object v0
.end method

.method public static b()Lj/c/a/e/g/a;
    .locals 1

    sget-object v0, Lj/c/a/e/a;->c:Lj/c/a/e/g/a;

    return-object v0
.end method

.method public static c()Landroid/content/Context;
    .locals 1

    sget-object v0, Lj/c/a/e/a;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public abstract d(Landroid/os/Message;)V
.end method

.method public abstract e()V
.end method

.method protected abstract f()V
.end method

.method protected abstract g()V
.end method

.method protected h(Landroid/os/Messenger;Landroid/os/Message;)V
    .locals 0

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method protected abstract i()V
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Lj/c/a/e/a;->a:Landroid/os/Messenger;

    invoke-virtual {p1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "======== OnCreated "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ============"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    sput-object p0, Lj/c/a/e/a;->b:Landroid/content/Context;

    new-instance v0, Lj/c/a/e/g/a;

    invoke-direct {v0}, Lj/c/a/e/g/a;-><init>()V

    sput-object v0, Lj/c/a/e/a;->c:Lj/c/a/e/g/a;

    new-instance v0, Lj/c/a/e/e/a;

    sget-object v1, Lj/c/a/e/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lj/c/a/e/e/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lj/c/a/e/a;->d:Lj/c/a/e/e/a;

    invoke-virtual {p0}, Lj/c/a/e/a;->e()V

    invoke-virtual {p0}, Lj/c/a/e/a;->f()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-virtual {p0}, Lj/c/a/e/a;->i()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "======== OnDestroy "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ============"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
