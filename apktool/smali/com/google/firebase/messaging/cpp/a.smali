.class public final Lcom/google/firebase/messaging/cpp/a;
.super Lj/d/c/b;
.source ""


# direct methods
.method public static a(Lj/d/c/a;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static b(Lj/d/c/a;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lj/d/c/a;->j(III)V

    return-void
.end method

.method public static c(Lj/d/c/a;II)I
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lj/d/c/a;->F(I)V

    invoke-static {p0, p2}, Lcom/google/firebase/messaging/cpp/a;->b(Lj/d/c/a;I)V

    invoke-static {p0, p1}, Lcom/google/firebase/messaging/cpp/a;->a(Lj/d/c/a;I)V

    invoke-static {p0}, Lcom/google/firebase/messaging/cpp/a;->d(Lj/d/c/a;)I

    move-result p0

    return p0
.end method

.method public static d(Lj/d/c/a;)I
    .locals 0

    invoke-virtual {p0}, Lj/d/c/a;->n()I

    move-result p0

    return p0
.end method
