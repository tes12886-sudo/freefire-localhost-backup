.class public final Lj/d/d/z/n/g;
.super Lj/d/d/b0/c;
.source ""


# static fields
.field private static final p:Ljava/io/Writer;

.field private static final q:Lj/d/d/p;


# instance fields
.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/d/d/k;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/String;

.field private o:Lj/d/d/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/d/d/z/n/g$a;

    invoke-direct {v0}, Lj/d/d/z/n/g$a;-><init>()V

    sput-object v0, Lj/d/d/z/n/g;->p:Ljava/io/Writer;

    new-instance v0, Lj/d/d/p;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Lj/d/d/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj/d/d/z/n/g;->q:Lj/d/d/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lj/d/d/z/n/g;->p:Ljava/io/Writer;

    invoke-direct {p0, v0}, Lj/d/d/b0/c;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    sget-object v0, Lj/d/d/m;->a:Lj/d/d/m;

    iput-object v0, p0, Lj/d/d/z/n/g;->o:Lj/d/d/k;

    return-void
.end method

.method private s0()Lj/d/d/k;
    .locals 2

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/k;

    return-object v0
.end method

.method private t0(Lj/d/d/k;)V
    .locals 2

    iget-object v0, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lj/d/d/k;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj/d/d/b0/c;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lj/d/d/z/n/g;->s0()Lj/d/d/k;

    move-result-object v0

    check-cast v0, Lj/d/d/n;

    iget-object v1, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lj/d/d/n;->q(Ljava/lang/String;Lj/d/d/k;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lj/d/d/z/n/g;->o:Lj/d/d/k;

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lj/d/d/z/n/g;->s0()Lj/d/d/k;

    move-result-object v0

    instance-of v1, v0, Lj/d/d/h;

    if-eqz v1, :cond_4

    check-cast v0, Lj/d/d/h;

    invoke-virtual {v0, p1}, Lj/d/d/h;->q(Lj/d/d/k;)V

    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method


# virtual methods
.method public F()Lj/d/d/b0/c;
    .locals 2

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lj/d/d/z/n/g;->s0()Lj/d/d/k;

    move-result-object v0

    instance-of v0, v0, Lj/d/d/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public Z(Ljava/lang/String;)Lj/d/d/b0/c;
    .locals 1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lj/d/d/z/n/g;->s0()Lj/d/d/k;

    move-result-object v0

    instance-of v0, v0, Lj/d/d/n;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b0()Lj/d/d/b0/c;
    .locals 1

    sget-object v0, Lj/d/d/m;->a:Lj/d/d/m;

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    return-object p0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    sget-object v1, Lj/d/d/z/n/g;->q:Lj/d/d/p;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()Lj/d/d/b0/c;
    .locals 2

    new-instance v0, Lj/d/d/h;

    invoke-direct {v0}, Lj/d/d/h;-><init>()V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    iget-object v1, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public j()Lj/d/d/b0/c;
    .locals 2

    new-instance v0, Lj/d/d/n;

    invoke-direct {v0}, Lj/d/d/n;-><init>()V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    iget-object v1, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public l0(J)Lj/d/d/b0/c;
    .locals 1

    new-instance v0, Lj/d/d/p;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    return-object p0
.end method

.method public m0(Ljava/lang/Boolean;)Lj/d/d/b0/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lj/d/d/z/n/g;->b0()Lj/d/d/b0/c;

    return-object p0

    :cond_0
    new-instance v0, Lj/d/d/p;

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    return-object p0
.end method

.method public n0(Ljava/lang/Number;)Lj/d/d/b0/c;
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lj/d/d/z/n/g;->b0()Lj/d/d/b0/c;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lj/d/d/b0/c;->T()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    new-instance v0, Lj/d/d/p;

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    return-object p0
.end method

.method public o0(Ljava/lang/String;)Lj/d/d/b0/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lj/d/d/z/n/g;->b0()Lj/d/d/b0/c;

    return-object p0

    :cond_0
    new-instance v0, Lj/d/d/p;

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    return-object p0
.end method

.method public p0(Z)Lj/d/d/b0/c;
    .locals 1

    new-instance v0, Lj/d/d/p;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lj/d/d/p;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, v0}, Lj/d/d/z/n/g;->t0(Lj/d/d/k;)V

    return-object p0
.end method

.method public r0()Lj/d/d/k;
    .locals 3

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/d/d/z/n/g;->o:Lj/d/d/k;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected one JSON element but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public u()Lj/d/d/b0/c;
    .locals 2

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj/d/d/z/n/g;->n:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lj/d/d/z/n/g;->s0()Lj/d/d/k;

    move-result-object v0

    instance-of v0, v0, Lj/d/d/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/d/d/z/n/g;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
