.class public final Lo/m;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lo/d;Ll/v/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/d<",
            "TT;>;",
            "Ll/v/a<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p1}, Ll/v/d/b;->a(Ll/v/a;)Ll/v/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Ll/v/a;I)V

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    new-instance v2, Lo/m$a;

    invoke-direct {v2, p0}, Lo/m$a;-><init>(Lo/d;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Ll/y/b/l;)V

    new-instance v2, Lo/m$c;

    invoke-direct {v2, v1}, Lo/m$c;-><init>(Lkotlinx/coroutines/CancellableContinuation;)V

    invoke-interface {p0, v2}, Lo/d;->Q(Lo/f;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ll/v/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Ll/v/e/a/f;->b(Ll/v/a;)V

    :cond_0
    return-object p0
.end method

.method public static final b(Lo/d;Ll/v/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/d<",
            "TT;>;",
            "Ll/v/a<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p1}, Ll/v/d/b;->a(Ll/v/a;)Ll/v/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Ll/v/a;I)V

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    new-instance v2, Lo/m$b;

    invoke-direct {v2, p0}, Lo/m$b;-><init>(Lo/d;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Ll/y/b/l;)V

    new-instance v2, Lo/m$d;

    invoke-direct {v2, v1}, Lo/m$d;-><init>(Lkotlinx/coroutines/CancellableContinuation;)V

    invoke-interface {p0, v2}, Lo/d;->Q(Lo/f;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ll/v/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Ll/v/e/a/f;->b(Ll/v/a;)V

    :cond_0
    return-object p0
.end method

.method public static final c(Lo/d;Ll/v/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/d<",
            "TT;>;",
            "Ll/v/a<",
            "-",
            "Lo/t<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p1}, Ll/v/d/b;->a(Ll/v/a;)Ll/v/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Ll/v/a;I)V

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    new-instance v2, Lo/m$e;

    invoke-direct {v2, p0}, Lo/m$e;-><init>(Lo/d;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Ll/y/b/l;)V

    new-instance v2, Lo/m$f;

    invoke-direct {v2, v1}, Lo/m$f;-><init>(Lkotlinx/coroutines/CancellableContinuation;)V

    invoke-interface {p0, v2}, Lo/d;->Q(Lo/f;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ll/v/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Ll/v/e/a/f;->b(Ll/v/a;)V

    :cond_0
    return-object p0
.end method

.method public static final d(Ljava/lang/Exception;Ll/v/a;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Ll/v/a<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo/m$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo/m$h;

    iget v1, v0, Lo/m$h;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo/m$h;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo/m$h;

    invoke-direct {v0, p1}, Lo/m$h;-><init>(Ll/v/a;)V

    :goto_0
    iget-object p1, v0, Lo/m$h;->d:Ljava/lang/Object;

    invoke-static {}, Ll/v/d/b;->b()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo/m$h;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lo/m$h;->f:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Exception;

    invoke-static {p1}, Ll/n;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ll/n;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Lo/m$h;->f:Ljava/lang/Object;

    iput v3, v0, Lo/m$h;->e:I

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    invoke-interface {v0}, Ll/v/a;->a()Ll/v/c;

    move-result-object v2

    new-instance v3, Lo/m$g;

    invoke-direct {v3, v0, p0}, Lo/m$g;-><init>(Ll/v/a;Ljava/lang/Exception;)V

    invoke-virtual {p1, v2, v3}, Lkotlinx/coroutines/CoroutineDispatcher;->dispatch(Ll/v/c;Ljava/lang/Runnable;)V

    invoke-static {}, Ll/v/d/b;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ll/v/d/b;->b()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Ll/v/e/a/f;->b(Ll/v/a;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p0, Ll/s;->a:Ll/s;

    return-object p0
.end method
