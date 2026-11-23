.class Lj/d/d/z/n/n$f;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/n/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj/d/d/w<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/d/d/z/n/n$f;->e(Lj/d/d/b0/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lj/d/d/z/n/n$f;->f(Lj/d/d/b0/c;Ljava/lang/String;)V

    return-void
.end method

.method public e(Lj/d/d/b0/a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->i:Lj/d/d/b0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/a;->j0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v1, Lj/d/d/b0/b;->h:Lj/d/d/b0/b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lj/d/d/b0/a;->d0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->l0()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Lj/d/d/b0/c;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lj/d/d/b0/c;->o0(Ljava/lang/String;)Lj/d/d/b0/c;

    return-void
.end method
