.class public final Lj/d/d/z/n/f;
.super Lj/d/d/b0/a;
.source ""


# static fields
.field private static final t:Ljava/io/Reader;

.field private static final u:Ljava/lang/Object;


# instance fields
.field private p:[Ljava/lang/Object;

.field private q:I

.field private r:[Ljava/lang/String;

.field private s:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/d/d/z/n/f$a;

    invoke-direct {v0}, Lj/d/d/z/n/f$a;-><init>()V

    sput-object v0, Lj/d/d/z/n/f;->t:Ljava/io/Reader;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj/d/d/z/n/f;->u:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj/d/d/k;)V
    .locals 2

    sget-object v0, Lj/d/d/z/n/f;->t:Ljava/io/Reader;

    invoke-direct {p0, v0}, Lj/d/d/b0/a;-><init>(Ljava/io/Reader;)V

    const/16 v0, 0x20

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lj/d/d/z/n/f;->q:I

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    new-array v0, v0, [I

    iput-object v0, p0, Lj/d/d/z/n/f;->s:[I

    invoke-direct {p0, p1}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    return-void
.end method

.method private B0()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method private C0()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lj/d/d/z/n/f;->q:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    aput-object v3, v0, v1

    return-object v2
.end method

.method private E0(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lj/d/d/z/n/f;->q:I

    iget-object v1, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    iget-object v1, p0, Lj/d/d/z/n/f;->s:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lj/d/d/z/n/f;->s:[I

    iget-object v1, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj/d/d/z/n/f;->q:I

    aput-object p1, v0, v1

    return-void
.end method

.method private T(Z)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lj/d/d/z/n/f;->q:I

    if-ge v1, v2, :cond_4

    iget-object v3, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    aget-object v4, v3, v1

    instance-of v4, v4, Lj/d/d/h;

    if-eqz v4, :cond_2

    add-int/lit8 v1, v1, 0x1

    if-ge v1, v2, :cond_3

    aget-object v3, v3, v1

    instance-of v3, v3, Ljava/util/Iterator;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lj/d/d/z/n/f;->s:[I

    aget v3, v3, v1

    if-eqz p1, :cond_1

    if-lez v3, :cond_1

    add-int/lit8 v4, v2, -0x1

    if-eq v1, v4, :cond_0

    add-int/lit8 v2, v2, -0x2

    if-ne v1, v2, :cond_1

    :cond_0
    add-int/lit8 v3, v3, -0x1

    :cond_1
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    aget-object v4, v3, v1

    instance-of v4, v4, Lj/d/d/n;

    if-eqz v4, :cond_3

    add-int/lit8 v1, v1, 0x1

    if-ge v1, v2, :cond_3

    aget-object v2, v3, v1

    instance-of v2, v2, Ljava/util/Iterator;

    if-eqz v2, :cond_3

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    aget-object v3, v2, v1

    if-eqz v3, :cond_3

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private c0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " at path "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj/d/d/z/n/f;->Q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private z0(Lj/d/d/b0/b;)V
    .locals 3

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but was "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lj/d/d/z/n/f;->c0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method A0()Lj/d/d/k;
    .locals 4

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->e:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Lj/d/d/b0/b;->b:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Lj/d/d/b0/b;->d:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Lj/d/d/b0/b;->j:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/k;

    invoke-virtual {p0}, Lj/d/d/z/n/f;->x0()V

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " when reading a JsonElement."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public D0()V
    .locals 2

    sget-object v0, Lj/d/d/b0/b;->e:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    new-instance v1, Lj/d/d/p;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lj/d/d/p;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    return-void
.end method

.method public F()V
    .locals 3

    sget-object v0, Lj/d/d/b0/b;->d:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v0, p0, Lj/d/d/z/n/f;->q:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_0
    return-void
.end method

.method public Q()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->T(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->T(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Z()Z
    .locals 2

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->d:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Lj/d/d/b0/b;->b:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Lj/d/d/b0/b;->j:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 3

    sget-object v0, Lj/d/d/b0/b;->a:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/h;

    invoke-virtual {v0}, Lj/d/d/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    iget-object v0, p0, Lj/d/d/z/n/f;->s:[I

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Lj/d/d/b0/b;->c:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/n;

    invoke-virtual {v0}, Lj/d/d/n;->s()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    return-void
.end method

.method public close()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    sget-object v2, Lj/d/d/z/n/f;->u:Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iput-object v1, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    iput v0, p0, Lj/d/d/z/n/f;->q:I

    return-void
.end method

.method public d0()Z
    .locals 4

    sget-object v0, Lj/d/d/b0/b;->h:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/p;

    invoke-virtual {v0}, Lj/d/d/p;->q()Z

    move-result v0

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    if-lez v1, :cond_0

    iget-object v2, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v1, v1, -0x1

    aget v3, v2, v1

    add-int/lit8 v3, v3, 0x1

    aput v3, v2, v1

    :cond_0
    return v0
.end method

.method public e0()D
    .locals 5

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->g:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Lj/d/d/b0/b;->f:Lj/d/d/b0/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lj/d/d/z/n/f;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/p;

    invoke-virtual {v0}, Lj/d/d/p;->r()D

    move-result-wide v0

    invoke-virtual {p0}, Lj/d/d/b0/a;->a0()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON forbids NaN and infinities: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_1
    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v2, p0, Lj/d/d/z/n/f;->q:I

    if-lez v2, :cond_4

    iget-object v3, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v2, v2, -0x1

    aget v4, v3, v2

    add-int/lit8 v4, v4, 0x1

    aput v4, v3, v2

    :cond_4
    return-wide v0
.end method

.method public f0()I
    .locals 5

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->g:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Lj/d/d/b0/b;->f:Lj/d/d/b0/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lj/d/d/z/n/f;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/p;

    invoke-virtual {v0}, Lj/d/d/p;->s()I

    move-result v0

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    if-lez v1, :cond_2

    iget-object v2, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v1, v1, -0x1

    aget v3, v2, v1

    add-int/lit8 v3, v3, 0x1

    aput v3, v2, v1

    :cond_2
    return v0
.end method

.method public g0()J
    .locals 5

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->g:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Lj/d/d/b0/b;->f:Lj/d/d/b0/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lj/d/d/z/n/f;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/p;

    invoke-virtual {v0}, Lj/d/d/p;->t()J

    move-result-wide v0

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v2, p0, Lj/d/d/z/n/f;->q:I

    if-lez v2, :cond_2

    iget-object v3, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v2, v2, -0x1

    aget v4, v3, v2

    add-int/lit8 v4, v4, 0x1

    aput v4, v3, v2

    :cond_2
    return-wide v0
.end method

.method public h0()Ljava/lang/String;
    .locals 4

    sget-object v0, Lj/d/d/b0/b;->e:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    iget v3, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v3, v3, -0x1

    aput-object v1, v2, v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    return-object v1
.end method

.method public j0()V
    .locals 3

    sget-object v0, Lj/d/d/b0/b;->i:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v0, p0, Lj/d/d/z/n/f;->q:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_0
    return-void
.end method

.method public l0()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->f:Lj/d/d/b0/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Lj/d/d/b0/b;->g:Lj/d/d/b0/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lj/d/d/z/n/f;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/p;

    invoke-virtual {v0}, Lj/d/d/p;->f()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    if-lez v1, :cond_2

    iget-object v2, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v1, v1, -0x1

    aget v3, v2, v1

    add-int/lit8 v3, v3, 0x1

    aput v3, v2, v1

    :cond_2
    return-object v0
.end method

.method public n0()Lj/d/d/b0/b;
    .locals 3

    iget v0, p0, Lj/d/d/z/n/f;->q:I

    if-nez v0, :cond_0

    sget-object v0, Lj/d/d/b0/b;->j:Lj/d/d/b0/b;

    return-object v0

    :cond_0
    invoke-direct {p0}, Lj/d/d/z/n/f;->B0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Iterator;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lj/d/d/z/n/f;->p:[Ljava/lang/Object;

    iget v2, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v2, v2, -0x2

    aget-object v1, v1, v2

    instance-of v1, v1, Lj/d/d/n;

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    sget-object v0, Lj/d/d/b0/b;->e:Lj/d/d/b0/b;

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->E0(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v1, :cond_3

    sget-object v0, Lj/d/d/b0/b;->d:Lj/d/d/b0/b;

    goto :goto_0

    :cond_3
    sget-object v0, Lj/d/d/b0/b;->b:Lj/d/d/b0/b;

    :goto_0
    return-object v0

    :cond_4
    instance-of v1, v0, Lj/d/d/n;

    if-eqz v1, :cond_5

    sget-object v0, Lj/d/d/b0/b;->c:Lj/d/d/b0/b;

    return-object v0

    :cond_5
    instance-of v1, v0, Lj/d/d/h;

    if-eqz v1, :cond_6

    sget-object v0, Lj/d/d/b0/b;->a:Lj/d/d/b0/b;

    return-object v0

    :cond_6
    instance-of v1, v0, Lj/d/d/p;

    if-eqz v1, :cond_a

    check-cast v0, Lj/d/d/p;

    invoke-virtual {v0}, Lj/d/d/p;->y()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Lj/d/d/b0/b;->f:Lj/d/d/b0/b;

    return-object v0

    :cond_7
    invoke-virtual {v0}, Lj/d/d/p;->v()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Lj/d/d/b0/b;->h:Lj/d/d/b0/b;

    return-object v0

    :cond_8
    invoke-virtual {v0}, Lj/d/d/p;->x()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lj/d/d/b0/b;->g:Lj/d/d/b0/b;

    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_a
    instance-of v1, v0, Lj/d/d/m;

    if-eqz v1, :cond_b

    sget-object v0, Lj/d/d/b0/b;->i:Lj/d/d/b0/b;

    return-object v0

    :cond_b
    sget-object v1, Lj/d/d/z/n/f;->u:Ljava/lang/Object;

    if-ne v0, v1, :cond_c

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lj/d/d/z/n/f;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lj/d/d/z/n/f;->c0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 3

    sget-object v0, Lj/d/d/b0/b;->b:Lj/d/d/b0/b;

    invoke-direct {p0, v0}, Lj/d/d/z/n/f;->z0(Lj/d/d/b0/b;)V

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v0, p0, Lj/d/d/z/n/f;->q:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_0
    return-void
.end method

.method public x0()V
    .locals 3

    invoke-virtual {p0}, Lj/d/d/z/n/f;->n0()Lj/d/d/b0/b;

    move-result-object v0

    sget-object v1, Lj/d/d/b0/b;->e:Lj/d/d/b0/b;

    const-string v2, "null"

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lj/d/d/z/n/f;->h0()Ljava/lang/String;

    iget-object v0, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    iget v1, p0, Lj/d/d/z/n/f;->q:I

    add-int/lit8 v1, v1, -0x2

    aput-object v2, v0, v1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj/d/d/z/n/f;->C0()Ljava/lang/Object;

    iget v0, p0, Lj/d/d/z/n/f;->q:I

    if-lez v0, :cond_1

    iget-object v1, p0, Lj/d/d/z/n/f;->r:[Ljava/lang/String;

    add-int/lit8 v0, v0, -0x1

    aput-object v2, v1, v0

    :cond_1
    :goto_0
    iget v0, p0, Lj/d/d/z/n/f;->q:I

    if-lez v0, :cond_2

    iget-object v1, p0, Lj/d/d/z/n/f;->s:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_2
    return-void
.end method
