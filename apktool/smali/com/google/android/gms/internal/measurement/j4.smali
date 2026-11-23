.class public final Lcom/google/android/gms/internal/measurement/j4;
.super Lcom/google/android/gms/internal/measurement/v8;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/ea;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/v8<",
        "Lcom/google/android/gms/internal/measurement/k4;",
        "Lcom/google/android/gms/internal/measurement/j4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/ea;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->J()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/v8;-><init>(Lcom/google/android/gms/internal/measurement/z8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/c4;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/k4;->J()Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/v8;-><init>(Lcom/google/android/gms/internal/measurement/z8;)V

    return-void
.end method


# virtual methods
.method public final A(ILcom/google/android/gms/internal/measurement/n4;)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/v8;->p()Lcom/google/android/gms/internal/measurement/z8;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/o4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/k4;->K(Lcom/google/android/gms/internal/measurement/k4;ILcom/google/android/gms/internal/measurement/o4;)V

    return-object p0
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/o4;)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k4;->L(Lcom/google/android/gms/internal/measurement/k4;Lcom/google/android/gms/internal/measurement/o4;)V

    return-object p0
.end method

.method public final C(Lcom/google/android/gms/internal/measurement/n4;)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/v8;->p()Lcom/google/android/gms/internal/measurement/z8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/o4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k4;->L(Lcom/google/android/gms/internal/measurement/k4;Lcom/google/android/gms/internal/measurement/o4;)V

    return-object p0
.end method

.method public final D(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/measurement/o4;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/j4;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k4;->M(Lcom/google/android/gms/internal/measurement/k4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final E()Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/k4;->N(Lcom/google/android/gms/internal/measurement/k4;)V

    return-object p0
.end method

.method public final G(I)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k4;->P(Lcom/google/android/gms/internal/measurement/k4;I)V

    return-object p0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k4;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final I(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k4;->Q(Lcom/google/android/gms/internal/measurement/k4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final J()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k4;->C()J

    move-result-wide v0

    return-wide v0
.end method

.method public final K(J)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/k4;->R(Lcom/google/android/gms/internal/measurement/k4;J)V

    return-object p0
.end method

.method public final L()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k4;->E()J

    move-result-wide v0

    return-wide v0
.end method

.method public final M(J)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/k4;->S(Lcom/google/android/gms/internal/measurement/k4;J)V

    return-object p0
.end method

.method public final w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/o4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k4;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k4;->y()I

    move-result v0

    return v0
.end method

.method public final y(I)Lcom/google/android/gms/internal/measurement/o4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/k4;->z(I)Lcom/google/android/gms/internal/measurement/o4;

    move-result-object p1

    return-object p1
.end method

.method public final z(ILcom/google/android/gms/internal/measurement/o4;)Lcom/google/android/gms/internal/measurement/j4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/k4;->K(Lcom/google/android/gms/internal/measurement/k4;ILcom/google/android/gms/internal/measurement/o4;)V

    return-object p0
.end method
