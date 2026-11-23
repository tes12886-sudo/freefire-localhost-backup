.class final Lj/f/a/e$b;
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
        "Ln/e;",
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

    invoke-virtual {p0, p1}, Lj/f/a/e$b;->n(Lj/f/a/f;)Ln/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lj/f/a/g;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ln/e;

    invoke-virtual {p0, p1, p2}, Lj/f/a/e$b;->o(Lj/f/a/g;Ln/e;)V

    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln/e;

    invoke-virtual {p0, p1}, Lj/f/a/e$b;->p(Ln/e;)I

    move-result p1

    return p1
.end method

.method public n(Lj/f/a/f;)Ln/e;
    .locals 0

    invoke-virtual {p1}, Lj/f/a/f;->h()Ln/e;

    move-result-object p1

    return-object p1
.end method

.method public o(Lj/f/a/g;Ln/e;)V
    .locals 0

    invoke-virtual {p1, p2}, Lj/f/a/g;->f(Ln/e;)V

    return-void
.end method

.method public p(Ln/e;)I
    .locals 0

    invoke-virtual {p1}, Ln/e;->t()I

    move-result p1

    return p1
.end method
