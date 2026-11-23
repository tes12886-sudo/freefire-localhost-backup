.class final Lj/f/a/e$f;
.super Lj/f/a/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/f/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/f/a/e<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lj/f/a/a;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj/f/a/e;-><init>(Lj/f/a/a;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lj/f/a/f;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/f/a/e$f;->n(Lj/f/a/f;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lj/f/a/g;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lj/f/a/e$f;->o(Lj/f/a/g;Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lj/f/a/e$f;->p(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method

.method public n(Lj/f/a/f;)Ljava/lang/Long;
    .locals 2

    invoke-virtual {p1}, Lj/f/a/f;->m()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public o(Lj/f/a/g;Ljava/lang/Long;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lj/f/a/g;->l(J)V

    return-void
.end method

.method public p(Ljava/lang/Long;)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lj/f/a/g;->e(J)I

    move-result p1

    return p1
.end method
