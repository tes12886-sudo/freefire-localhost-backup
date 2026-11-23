.class final Lj/d/d/z/n/m;
.super Lj/d/d/w;
.source ""


# annotations
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
.field private final a:Lj/d/d/e;

.field private final b:Lj/d/d/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Lj/d/d/e;Lj/d/d/w;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/e;",
            "Lj/d/d/w<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lj/d/d/w;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/m;->a:Lj/d/d/e;

    iput-object p2, p0, Lj/d/d/z/n/m;->b:Lj/d/d/w;

    iput-object p3, p0, Lj/d/d/z/n/m;->c:Ljava/lang/reflect/Type;

    return-void
.end method

.method private e(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
    .locals 1

    if-eqz p2, :cond_1

    const-class v0, Ljava/lang/Object;

    if-eq p1, v0, :cond_0

    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public b(Lj/d/d/b0/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/b0/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/z/n/m;->b:Lj/d/d/w;

    invoke-virtual {v0, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

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

    iget-object v0, p0, Lj/d/d/z/n/m;->b:Lj/d/d/w;

    iget-object v1, p0, Lj/d/d/z/n/m;->c:Ljava/lang/reflect/Type;

    invoke-direct {p0, v1, p2}, Lj/d/d/z/n/m;->e(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lj/d/d/z/n/m;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_1

    iget-object v0, p0, Lj/d/d/z/n/m;->a:Lj/d/d/e;

    invoke-static {v1}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v0

    instance-of v1, v0, Lj/d/d/z/n/k$b;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lj/d/d/z/n/m;->b:Lj/d/d/w;

    instance-of v2, v1, Lj/d/d/z/n/k$b;

    if-nez v2, :cond_1

    move-object v0, v1

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V

    return-void
.end method
