.class public final Lo/m$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/m;->b(Lo/d;Ll/v/a;)Ljava/lang/Object;
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

    iput-object p1, p0, Lo/m$d;->a:Lkotlinx/coroutines/CancellableContinuation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/d;Lo/t;)V
    .locals 1
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

    const-string p1, "response"

    invoke-static {p2, p1}, Ll/y/c/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lo/t;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lo/m$d;->a:Lkotlinx/coroutines/CancellableContinuation;

    check-cast p1, Ll/v/a;

    invoke-virtual {p2}, Lo/t;->a()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Ll/m;->a:Ll/m$a;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lo/m$d;->a:Lkotlinx/coroutines/CancellableContinuation;

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

    iget-object p1, p0, Lo/m$d;->a:Lkotlinx/coroutines/CancellableContinuation;

    check-cast p1, Ll/v/a;

    sget-object v0, Ll/m;->a:Ll/m$a;

    invoke-static {p2}, Ll/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ll/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Ll/v/a;->b(Ljava/lang/Object;)V

    return-void
.end method
