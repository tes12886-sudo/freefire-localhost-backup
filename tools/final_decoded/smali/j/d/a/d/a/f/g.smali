.class public final Lj/d/a/d/a/f/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/Object;)Lj/d/a/d/a/f/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(TResultT;)",
            "Lj/d/a/d/a/f/e<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, Lj/d/a/d/a/f/t;

    invoke-direct {v0}, Lj/d/a/d/a/f/t;-><init>()V

    invoke-virtual {v0, p0}, Lj/d/a/d/a/f/t;->h(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static b(Lj/d/a/d/a/f/e;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/a/d/a/f/e<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lj/d/a/d/a/b/r;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj/d/a/d/a/f/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lj/d/a/d/a/f/g;->d(Lj/d/a/d/a/f/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lj/d/a/d/a/f/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/d/a/d/a/f/u;-><init>([B)V

    invoke-static {p0, v0}, Lj/d/a/d/a/f/g;->e(Lj/d/a/d/a/f/e;Lj/d/a/d/a/f/u;)V

    invoke-virtual {v0}, Lj/d/a/d/a/f/u;->a()V

    invoke-static {p0}, Lj/d/a/d/a/f/g;->d(Lj/d/a/d/a/f/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Exception;)Lj/d/a/d/a/f/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lj/d/a/d/a/f/e<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, Lj/d/a/d/a/f/t;

    invoke-direct {v0}, Lj/d/a/d/a/f/t;-><init>()V

    invoke-virtual {v0, p0}, Lj/d/a/d/a/f/t;->j(Ljava/lang/Exception;)V

    return-object v0
.end method

.method private static d(Lj/d/a/d/a/f/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/a/d/a/f/e<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    invoke-virtual {p0}, Lj/d/a/d/a/f/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj/d/a/d/a/f/e;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lj/d/a/d/a/f/e;->d()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static e(Lj/d/a/d/a/f/e;Lj/d/a/d/a/f/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/a/d/a/f/e<",
            "*>;",
            "Lj/d/a/d/a/f/u;",
            ")V"
        }
    .end annotation

    sget-object v0, Lj/d/a/d/a/f/f;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lj/d/a/d/a/f/e;->c(Ljava/util/concurrent/Executor;Lj/d/a/d/a/f/c;)Lj/d/a/d/a/f/e;

    invoke-virtual {p0, v0, p1}, Lj/d/a/d/a/f/e;->b(Ljava/util/concurrent/Executor;Lj/d/a/d/a/f/b;)Lj/d/a/d/a/f/e;

    return-void
.end method
