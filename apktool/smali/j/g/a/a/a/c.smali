.class public abstract Lj/g/a/a/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo/f<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo/d;Lo/t;)V
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

    invoke-virtual {p2}, Lo/t;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lj/g/a/a/a/j;

    invoke-virtual {p2}, Lo/t;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Lj/g/a/a/a/j;-><init>(Ljava/lang/Object;Lo/t;)V

    invoke-virtual {p0, p1}, Lj/g/a/a/a/c;->d(Lj/g/a/a/a/j;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lj/g/a/a/a/o;

    invoke-direct {p1, p2}, Lj/g/a/a/a/o;-><init>(Lo/t;)V

    invoke-virtual {p0, p1}, Lj/g/a/a/a/c;->c(Lj/g/a/a/a/v;)V

    :goto_0
    return-void
.end method

.method public final b(Lo/d;Ljava/lang/Throwable;)V
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

    new-instance p1, Lj/g/a/a/a/v;

    const-string v0, "Request Failure"

    invoke-direct {p1, v0, p2}, Lj/g/a/a/a/v;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lj/g/a/a/a/c;->c(Lj/g/a/a/a/v;)V

    return-void
.end method

.method public abstract c(Lj/g/a/a/a/v;)V
.end method

.method public abstract d(Lj/g/a/a/a/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/g/a/a/a/j<",
            "TT;>;)V"
        }
    .end annotation
.end method
