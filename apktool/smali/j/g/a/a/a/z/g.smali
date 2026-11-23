.class public Lj/g/a/a/a/z/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/e;",
            "Lj/d/d/a0/a<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1, p0, p2}, Lj/d/d/e;->o(Lj/d/d/x;Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p1

    new-instance v0, Lj/g/a/a/a/z/g$a;

    invoke-direct {v0, p0, p1, p2}, Lj/g/a/a/a/z/g$a;-><init>(Lj/g/a/a/a/z/g;Lj/d/d/w;Lj/d/d/a0/a;)V

    return-object v0
.end method
