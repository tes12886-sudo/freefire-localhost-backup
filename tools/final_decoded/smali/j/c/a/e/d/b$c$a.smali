.class Lj/c/a/e/d/b$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/c/a/e/d/b$c;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj/c/a/e/d/b$c;


# direct methods
.method constructor <init>(Lj/c/a/e/d/b$c;)V
    .locals 0

    iput-object p1, p0, Lj/c/a/e/d/b$c$a;->a:Lj/c/a/e/d/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lj/c/a/e/d/b$c$a;->a:Lj/c/a/e/d/b$c;

    iget-object v1, v1, Lj/c/a/e/d/b$c;->a:Lj/c/a/e/d/b;

    invoke-static {v1, v0}, Lj/c/a/e/d/b;->g(Lj/c/a/e/d/b;Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
