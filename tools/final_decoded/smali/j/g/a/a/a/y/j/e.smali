.class public Lj/g/a/a/a/y/j/e;
.super Lj/g/a/a/a/y/j/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/g/a/a/a/y/j/e$a;
    }
.end annotation


# instance fields
.field e:Lj/g/a/a/a/y/j/e$a;


# direct methods
.method public constructor <init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj/g/a/a/a/y/j/h;-><init>(Lj/g/a/a/a/u;Lj/g/a/a/a/y/g;)V

    invoke-virtual {p0}, Lj/g/a/a/a/y/j/h;->b()Lo/u;

    move-result-object p1

    const-class p2, Lj/g/a/a/a/y/j/e$a;

    invoke-virtual {p1, p2}, Lo/u;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/g/a/a/a/y/j/e$a;

    iput-object p1, p0, Lj/g/a/a/a/y/j/e;->e:Lj/g/a/a/a/y/j/e$a;

    return-void
.end method
