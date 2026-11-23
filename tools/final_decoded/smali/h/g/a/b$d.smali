.class final Lh/g/a/b$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/b/a/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/g/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj/d/b/a/a/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lh/g/a/b$a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final b:Lh/g/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/g/a/a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lh/g/a/b$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/g/a/b$a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh/g/a/b$d$a;

    invoke-direct {v0, p0}, Lh/g/a/b$d$a;-><init>(Lh/g/a/b$d;)V

    iput-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lh/g/a/b$d;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0, p1, p2}, Lh/g/a/a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0, p1}, Lh/g/a/a;->p(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method c(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0, p1}, Lh/g/a/a;->q(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public cancel(Z)Z
    .locals 2

    iget-object v0, p0, Lh/g/a/b$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh/g/a/b$a;

    iget-object v1, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v1, p1}, Lh/g/a/a;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/g/a/b$a;->a()V

    :cond_0
    return p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0}, Lh/g/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lh/g/a/a;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0}, Lh/g/a/a;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0}, Lh/g/a/a;->isDone()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh/g/a/b$d;->b:Lh/g/a/a;

    invoke-virtual {v0}, Lh/g/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
