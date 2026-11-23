.class public final Lo/m$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/m;->a(Lo/d;Ll/v/a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlinx/coroutines/CancellableContinuation;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/CancellableContinuation;)V
    .locals 0

    iput-object p1, p0, Lo/m$c;->a:Lkotlinx/coroutines/CancellableContinuation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/d;Lo/t;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/d<",
            "TT;>;",
            "Lo/t<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Ll/y/c/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Ll/y/c/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lo/t;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lo/t;->a()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-interface {p1}, Lo/d;->c()Lm/b0;

    move-result-object p1

    const-class p2, Lo/l;

    invoke-virtual {p1, p2}, Lm/b0;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "call.request().tag(Invocation::class.java)!!"

    invoke-static {p1, p2}, Ll/y/c/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lo/l;

    invoke-virtual {p1}, Lo/l;->a()Ljava/lang/reflect/Method;

    move-result-object p1

    new-instance p2, Ll/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "method"

    invoke-static {p1, v1}, Ll/y/c/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "method.declaringClass"

    invoke-static {v1, v2}, Ll/y/c/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " was null but response body type was declared as non-null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/d;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lo/m$c;->a:Lkotlinx/coroutines/CancellableContinuation;

    check-cast p1, Ll/v/a;

    sget-object v0, Ll/m;->a:Ll/m$a;

    invoke-static {p2}, Ll/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/y/c/i;->m()V

    const/4 p1, 0x0

    throw p1

    :cond_1
    iget-object p1, p0, Lo/m$c;->a:Lkotlinx/coroutines/CancellableContinuation;

    check-cast p1, Ll/v/a;

    sget-object v0, Ll/m;->a:Ll/m$a;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lo/m$c;->a:Lkotlinx/coroutines/CancellableContinuation;

    check-cast p1, Ll/v/a;

    new-instance v0, Lo/j;

    invoke-direct {v0, p2}, Lo/j;-><init>(Lo/t;)V

    sget-object p2, Ll/m;->a:Ll/m$a;

    invoke-static {v0}, Ll/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Ll/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Ll/v/a;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lo/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/d<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Ll/y/c/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Ll/y/c/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lo/m$c;->a:Lkotlinx/coroutines/CancellableContinuation;

    check-cast p1, Ll/v/a;

    sget-object v0, Ll/m;->a:Ll/m$a;

    invoke-static {p2}, Ll/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ll/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Ll/v/a;->b(Ljava/lang/Object;)V

    return-void
.end method
