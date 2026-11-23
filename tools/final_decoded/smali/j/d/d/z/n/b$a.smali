.class final Lj/d/d/z/n/b$a;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/d/z/n/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lj/d/d/w<",
        "Ljava/util/Collection<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final b:Lj/d/d/z/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/z/i<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj/d/d/e;Ljava/lang/reflect/Type;Lj/d/d/w;Lj/d/d/z/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/e;",
            "Ljava/lang/reflect/Type;",
            "Lj/d/d/w<",
            "TE;>;",
            "Lj/d/d/z/i<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    new-instance v0, Lj/d/d/z/n/m;

    invoke-direct {v0, p1, p3, p2}, Lj/d/d/z/n/m;-><init>(Lj/d/d/e;Lj/d/d/w;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lj/d/d/z/n/b$a;->a:Lj/d/d/w;

    iput-object p4, p0, Lj/d/d/z/n/b$a;->b:Lj/d/d/z/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj/d/d/z/n/b$a;->e(Lj/d/d/b0/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lj/d/d/z/n/b$a;->f(Lj/d/d/b0/c;Ljava/util/Collection;)V

    return-void
.end method

.method public e(Lj/d/d/b0/a;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")",
            "Ljava/util/Collection<",
            "TE;>;"
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
    iget-object v0, p0, Lj/d/d/z/n/b$a;->b:Lj/d/d/z/i;

    invoke-interface {v0}, Lj/d/d/z/i;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lj/d/d/b0/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->Z()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj/d/d/z/n/b$a;->a:Lj/d/d/w;

    invoke-virtual {v1, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lj/d/d/b0/a;->u()V

    return-object v0
.end method

.method public f(Lj/d/d/b0/c;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/c;",
            "Ljava/util/Collection<",
            "TE;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lj/d/d/b0/c;->f()Lj/d/d/b0/c;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lj/d/d/z/n/b$a;->a:Lj/d/d/w;

    invoke-virtual {v1, p1, v0}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lj/d/d/b0/c;->u()Lj/d/d/b0/c;

    return-void
.end method
