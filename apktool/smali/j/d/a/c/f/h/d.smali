.class final Lj/d/a/c/f/h/d;
.super Lj/d/a/c/f/h/f0;
.source ""


# instance fields
.field private final transient c:Lj/d/a/c/f/h/e0;

.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I


# direct methods
.method constructor <init>(Lj/d/a/c/f/h/e0;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lj/d/a/c/f/h/f0;-><init>()V

    iput-object p1, p0, Lj/d/a/c/f/h/d;->c:Lj/d/a/c/f/h/e0;

    iput-object p2, p0, Lj/d/a/c/f/h/d;->d:[Ljava/lang/Object;

    iput p4, p0, Lj/d/a/c/f/h/d;->e:I

    return-void
.end method

.method static synthetic q(Lj/d/a/c/f/h/d;)I
    .locals 0

    iget p0, p0, Lj/d/a/c/f/h/d;->e:I

    return p0
.end method

.method static synthetic r(Lj/d/a/c/f/h/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lj/d/a/c/f/h/d;->d:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lj/d/a/c/f/h/y;->f()Lj/d/a/c/f/h/b0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lj/d/a/c/f/h/y;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lj/d/a/c/f/h/d;->c:Lj/d/a/c/f/h/e0;

    invoke-virtual {v2, v0}, Lj/d/a/c/f/h/e0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final h()Lj/d/a/c/f/h/i;
    .locals 2

    invoke-virtual {p0}, Lj/d/a/c/f/h/y;->f()Lj/d/a/c/f/h/b0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/d/a/c/f/h/b0;->u(I)Lj/d/a/c/f/h/j;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lj/d/a/c/f/h/y;->f()Lj/d/a/c/f/h/b0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/d/a/c/f/h/b0;->u(I)Lj/d/a/c/f/h/j;

    move-result-object v0

    return-object v0
.end method

.method final n()Lj/d/a/c/f/h/b0;
    .locals 1

    new-instance v0, Lj/d/a/c/f/h/c;

    invoke-direct {v0, p0}, Lj/d/a/c/f/h/c;-><init>(Lj/d/a/c/f/h/d;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lj/d/a/c/f/h/d;->e:I

    return v0
.end method
