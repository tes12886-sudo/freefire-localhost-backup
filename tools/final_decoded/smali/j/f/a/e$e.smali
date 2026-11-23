.class final Lj/f/a/e$e;
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
        "Ljava/lang/Integer;",
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

    invoke-virtual {p0, p1}, Lj/f/a/e$e;->n(Lj/f/a/f;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lj/f/a/g;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lj/f/a/e$e;->o(Lj/f/a/g;Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lj/f/a/e$e;->p(Ljava/lang/Integer;)I

    move-result p1

    return p1
.end method

.method public n(Lj/f/a/f;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p1}, Lj/f/a/f;->i()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public o(Lj/f/a/g;Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lj/f/a/g;->g(I)V

    return-void
.end method

.method public p(Ljava/lang/Integer;)I
    .locals 0

    const/4 p1, 0x4

    return p1
.end method
