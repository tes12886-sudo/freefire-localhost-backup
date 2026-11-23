.class public final Lj/d/d/z/n/l;
.super Lj/d/d/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/d/d/z/n/l$b;,
        Lj/d/d/z/n/l$c;
    }
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
.field private final a:Lj/d/d/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/r<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lj/d/d/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Lj/d/d/e;

.field private final d:Lj/d/d/a0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/a0/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final e:Lj/d/d/x;

.field private final f:Lj/d/d/z/n/l$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/z/n/l<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field private volatile g:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj/d/d/r;Lj/d/d/j;Lj/d/d/e;Lj/d/d/a0/a;Lj/d/d/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/r<",
            "TT;>;",
            "Lj/d/d/j<",
            "TT;>;",
            "Lj/d/d/e;",
            "Lj/d/d/a0/a<",
            "TT;>;",
            "Lj/d/d/x;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    new-instance v0, Lj/d/d/z/n/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lj/d/d/z/n/l$b;-><init>(Lj/d/d/z/n/l;Lj/d/d/z/n/l$a;)V

    iput-object v0, p0, Lj/d/d/z/n/l;->f:Lj/d/d/z/n/l$b;

    iput-object p1, p0, Lj/d/d/z/n/l;->a:Lj/d/d/r;

    iput-object p2, p0, Lj/d/d/z/n/l;->b:Lj/d/d/j;

    iput-object p3, p0, Lj/d/d/z/n/l;->c:Lj/d/d/e;

    iput-object p4, p0, Lj/d/d/z/n/l;->d:Lj/d/d/a0/a;

    iput-object p5, p0, Lj/d/d/z/n/l;->e:Lj/d/d/x;

    return-void
.end method

.method private e()Lj/d/d/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/z/n/l;->g:Lj/d/d/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/d/d/z/n/l;->c:Lj/d/d/e;

    iget-object v1, p0, Lj/d/d/z/n/l;->e:Lj/d/d/x;

    iget-object v2, p0, Lj/d/d/z/n/l;->d:Lj/d/d/a0/a;

    invoke-virtual {v0, v1, v2}, Lj/d/d/e;->o(Lj/d/d/x;Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v0

    iput-object v0, p0, Lj/d/d/z/n/l;->g:Lj/d/d/w;

    :goto_0
    return-object v0
.end method

.method public static f(Lj/d/d/a0/a;Ljava/lang/Object;)Lj/d/d/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/a0/a<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lj/d/d/x;"
        }
    .end annotation

    invoke-virtual {p0}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0}, Lj/d/d/a0/a;->getRawType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lj/d/d/z/n/l$c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v0, v2}, Lj/d/d/z/n/l$c;-><init>(Ljava/lang/Object;Lj/d/d/a0/a;ZLjava/lang/Class;)V

    return-object v1
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

    iget-object v0, p0, Lj/d/d/z/n/l;->b:Lj/d/d/j;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lj/d/d/z/n/l;->e()Lj/d/d/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lj/d/d/z/l;->a(Lj/d/d/b0/a;)Lj/d/d/k;

    move-result-object p1

    invoke-virtual {p1}, Lj/d/d/k;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Lj/d/d/z/n/l;->b:Lj/d/d/j;

    iget-object v1, p0, Lj/d/d/z/n/l;->d:Lj/d/d/a0/a;

    invoke-virtual {v1}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lj/d/d/z/n/l;->f:Lj/d/d/z/n/l$b;

    invoke-interface {v0, p1, v1, v2}, Lj/d/d/j;->a(Lj/d/d/k;Ljava/lang/reflect/Type;Lj/d/d/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lj/d/d/z/n/l;->a:Lj/d/d/r;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lj/d/d/z/n/l;->e()Lj/d/d/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1}, Lj/d/d/b0/c;->b0()Lj/d/d/b0/c;

    return-void

    :cond_1
    iget-object v1, p0, Lj/d/d/z/n/l;->d:Lj/d/d/a0/a;

    invoke-virtual {v1}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lj/d/d/z/n/l;->f:Lj/d/d/z/n/l$b;

    invoke-interface {v0, p2, v1, v2}, Lj/d/d/r;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;Lj/d/d/q;)Lj/d/d/k;

    move-result-object p2

    invoke-static {p2, p1}, Lj/d/d/z/l;->b(Lj/d/d/k;Lj/d/d/b0/c;)V

    return-void
.end method
