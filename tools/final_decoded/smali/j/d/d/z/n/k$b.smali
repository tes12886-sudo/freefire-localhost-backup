.class public final Lj/d/d/z/n/k$b;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/n/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lj/d/d/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/d/z/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/z/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj/d/d/z/n/k$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lj/d/d/z/i;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/z/i<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj/d/d/z/n/k$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/k$b;->a:Lj/d/d/z/i;

    iput-object p2, p0, Lj/d/d/z/n/k$b;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->i:Lj/d/d/b0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/a;->j0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lj/d/d/z/n/k$b;->a:Lj/d/d/z/i;

    invoke-interface {v0}, Lj/d/d/z/i;->a()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->c()V

    :goto_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->Z()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lj/d/d/b0/a;->h0()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lj/d/d/z/n/k$b;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/d/d/z/n/k$c;

    if-eqz v1, :cond_2

    iget-boolean v2, v1, Lj/d/d/z/n/k$c;->c:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1, v0}, Lj/d/d/z/n/k$c;->a(Lj/d/d/b0/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->x0()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lj/d/d/b0/a;->F()V

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Lj/d/d/s;

    invoke-direct {v0, p1}, Lj/d/d/s;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lj/d/d/b0/c;->j()Lj/d/d/b0/c;

    :try_start_0
    iget-object v0, p0, Lj/d/d/z/n/k$b;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/d/d/z/n/k$c;

    invoke-virtual {v1, p2}, Lj/d/d/z/n/k$c;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lj/d/d/z/n/k$c;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lj/d/d/b0/c;->Z(Ljava/lang/String;)Lj/d/d/b0/c;

    invoke-virtual {v1, p1, p2}, Lj/d/d/z/n/k$c;->b(Lj/d/d/b0/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lj/d/d/b0/c;->F()Lj/d/d/b0/c;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    throw p2

    :goto_2
    goto :goto_1
.end method
