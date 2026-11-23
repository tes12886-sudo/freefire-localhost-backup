.class public final Lcom/google/firebase/messaging/cpp/e;
.super Lj/d/c/b;
.source ""


# direct methods
.method public static a(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static b(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static c(Lj/d/c/a;I)V
    .locals 2

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static d(Lj/d/c/a;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static e(Lj/d/c/a;I)V
    .locals 2

    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static f(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static g(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static h(Lj/d/c/a;I)V
    .locals 2

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static i(Lj/d/c/a;Z)V
    .locals 2

    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->a(IZZ)V

    return-void
.end method

.method public static j(Lj/d/c/a;I)V
    .locals 2

    const/16 v0, 0xf

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static k(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static l(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static m(Lj/d/c/a;J)V
    .locals 6

    const/16 v1, 0xe

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    invoke-virtual/range {v0 .. v5}, Lj/d/c/a;->g(IJJ)V

    return-void
.end method

.method public static n(Lj/d/c/a;I)V
    .locals 2

    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->f(III)V

    return-void
.end method

.method public static o(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static p(Lj/d/c/a;[I)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v1}, Lj/d/c/a;->G(III)V

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p1, v0

    invoke-virtual {p0, v1}, Lj/d/c/a;->i(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj/d/c/a;->o()I

    move-result p0

    return p0
.end method

.method public static q(Lj/d/c/a;)I
    .locals 0

    invoke-virtual {p0}, Lj/d/c/a;->n()I

    move-result p0

    return p0
.end method

.method public static r(Lj/d/c/a;)V
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lj/d/c/a;->F(I)V

    return-void
.end method
