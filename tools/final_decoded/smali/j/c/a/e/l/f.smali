.class public Lj/c/a/e/l/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lj/f/a/b;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lj/f/a/b;",
            ">(TT;)[B"
        }
    .end annotation

    invoke-virtual {p0}, Lj/f/a/b;->a()Lj/f/a/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lj/f/a/e;->h(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static b([BII)Lj/c/a/d/a/c;
    .locals 2

    sget-object v0, Lj/c/a/d/a/c;->f:Lj/f/a/e;

    new-instance v1, Ln/b;

    invoke-direct {v1}, Ln/b;-><init>()V

    invoke-virtual {v1, p0, p1, p2}, Ln/b;->x0([BII)Ln/b;

    invoke-virtual {v0, v1}, Lj/f/a/e;->d(Ln/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj/c/a/d/a/c;

    return-object p0
.end method

.method public static c([BII)Lj/c/a/d/a/d;
    .locals 2

    sget-object v0, Lj/c/a/d/a/d;->e:Lj/f/a/e;

    new-instance v1, Ln/b;

    invoke-direct {v1}, Ln/b;-><init>()V

    invoke-virtual {v1, p0, p1, p2}, Ln/b;->x0([BII)Ln/b;

    invoke-virtual {v0, v1}, Lj/f/a/e;->d(Ln/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj/c/a/d/a/d;

    return-object p0
.end method

.method public static d([BII)Lj/c/a/d/a/f;
    .locals 2

    sget-object v0, Lj/c/a/d/a/f;->f:Lj/f/a/e;

    new-instance v1, Ln/b;

    invoke-direct {v1}, Ln/b;-><init>()V

    invoke-virtual {v1, p0, p1, p2}, Ln/b;->x0([BII)Ln/b;

    invoke-virtual {v0, v1}, Lj/f/a/e;->d(Ln/d;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj/c/a/d/a/f;

    return-object p0
.end method
