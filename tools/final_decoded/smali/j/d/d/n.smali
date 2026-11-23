.class public final Lj/d/d/n;
.super Lj/d/d/k;
.source ""


# instance fields
.field private final a:Lj/d/d/z/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/z/h<",
            "Ljava/lang/String;",
            "Lj/d/d/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj/d/d/k;-><init>()V

    new-instance v0, Lj/d/d/z/h;

    invoke-direct {v0}, Lj/d/d/z/h;-><init>()V

    iput-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lj/d/d/n;

    if-eqz v0, :cond_0

    check-cast p1, Lj/d/d/n;

    iget-object p1, p1, Lj/d/d/n;->a:Lj/d/d/z/h;

    iget-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->hashCode()I

    move-result v0

    return v0
.end method

.method public q(Ljava/lang/String;Lj/d/d/k;)V
    .locals 1

    iget-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    if-nez p2, :cond_0

    sget-object p2, Lj/d/d/m;->a:Lj/d/d/m;

    :cond_0
    invoke-virtual {v0, p1, p2}, Lj/d/d/z/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    sget-object p2, Lj/d/d/m;->a:Lj/d/d/m;

    goto :goto_0

    :cond_0
    new-instance v0, Lj/d/d/p;

    invoke-direct {v0, p2}, Lj/d/d/p;-><init>(Ljava/lang/String;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p0, p1, p2}, Lj/d/d/n;->q(Ljava/lang/String;Lj/d/d/k;)V

    return-void
.end method

.method public s()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lj/d/d/k;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    invoke-virtual {v0}, Lj/d/d/z/h;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/lang/String;)Lj/d/d/k;
    .locals 1

    iget-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    invoke-virtual {v0, p1}, Lj/d/d/z/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/d/d/k;

    return-object p1
.end method

.method public u(Ljava/lang/String;)Lj/d/d/p;
    .locals 1

    iget-object v0, p0, Lj/d/d/n;->a:Lj/d/d/z/h;

    invoke-virtual {v0, p1}, Lj/d/d/z/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/d/d/p;

    return-object p1
.end method
