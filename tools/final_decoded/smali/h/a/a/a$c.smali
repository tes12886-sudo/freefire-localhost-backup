.class final Lh/a/a/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/a/a/a;->f(Ljava/util/concurrent/Future;Lh/g/a/b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Future;

.field final synthetic b:Lh/g/a/b$a;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Future;Lh/g/a/b$a;)V
    .locals 0

    iput-object p1, p0, Lh/a/a/a$c;->a:Ljava/util/concurrent/Future;

    iput-object p2, p0, Lh/a/a/a$c;->b:Lh/g/a/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lh/a/a/a$c;->a:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/a/a/a$c;->b:Lh/g/a/b$a;

    new-instance v1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    invoke-virtual {v0, v1}, Lh/g/a/b$a;->d(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lh/a/a/a$c;->a:Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method
