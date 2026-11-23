.class public final Lcom/google/android/gms/internal/measurement/r4;
.super Lcom/google/android/gms/internal/measurement/v8;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/ea;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/v8<",
        "Lcom/google/android/gms/internal/measurement/s4;",
        "Lcom/google/android/gms/internal/measurement/r4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/ea;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s4;->L0()Lcom/google/android/gms/internal/measurement/s4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/v8;-><init>(Lcom/google/android/gms/internal/measurement/z8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/c4;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s4;->L0()Lcom/google/android/gms/internal/measurement/s4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/v8;-><init>(Lcom/google/android/gms/internal/measurement/z8;)V

    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->h0(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final A0(I)Lcom/google/android/gms/internal/measurement/d5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->v1(I)Lcom/google/android/gms/internal/measurement/d5;

    move-result-object p1

    return-object p1
.end method

.method public final B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->i0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B0(ILcom/google/android/gms/internal/measurement/d5;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->S0(Lcom/google/android/gms/internal/measurement/s4;ILcom/google/android/gms/internal/measurement/d5;)V

    return-object p0
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->x()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final C0(Lcom/google/android/gms/internal/measurement/d5;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->T0(Lcom/google/android/gms/internal/measurement/s4;Lcom/google/android/gms/internal/measurement/d5;)V

    return-object p0
.end method

.method public final D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->j0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final D0(Lcom/google/android/gms/internal/measurement/c5;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/v8;->p()Lcom/google/android/gms/internal/measurement/z8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/d5;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->T0(Lcom/google/android/gms/internal/measurement/s4;Lcom/google/android/gms/internal/measurement/d5;)V

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->k0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final E0(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->U0(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final F0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->V0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final G(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->l0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final G0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->z1()J

    move-result-wide v0

    return-wide v0
.end method

.method public final H(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 2

    iget-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast p1, Lcom/google/android/gms/internal/measurement/s4;

    const-wide/32 v0, 0xa414

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/s4;->m0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final H0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->W0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final I(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->n0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final I0()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->B1()J

    move-result-wide v0

    return-wide v0
.end method

.method public final J()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->o0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final J0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->X0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final K(Z)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->p0(Lcom/google/android/gms/internal/measurement/s4;Z)V

    return-object p0
.end method

.method public final K0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->Y0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final L()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->q0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final L0()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->Z0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final M(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->r0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final M0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->b0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final N()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->s0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final N0()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->c0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final P(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->t0(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final R(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->u0(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final S(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->v0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final U()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->w0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final V()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->N()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final W(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->x0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final X(Z)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->y0(Lcom/google/android/gms/internal/measurement/s4;Z)V

    return-object p0
.end method

.method public final Y(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/measurement/g4;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/r4;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->z0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final Z()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->A0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final a0(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast p1, Lcom/google/android/gms/internal/measurement/s4;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/s4;->M0(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final b0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->d1(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c0(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->e1(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final d0()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->f1(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final e0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->g1(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final f0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->h1(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final g0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 0

    iget-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast p1, Lcom/google/android/gms/internal/measurement/s4;

    sget p1, Lcom/google/android/gms/internal/measurement/s4;->zza:I

    const/4 p1, 0x0

    throw p1
.end method

.method public final h0()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->i1(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final i0(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->j1(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final j0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->k1(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final k0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/r4;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->l1(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final l0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->m1(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final m0(J)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->n1(Lcom/google/android/gms/internal/measurement/s4;J)V

    return-object p0
.end method

.method public final n0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->H0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final o0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->o1(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final p0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->p1(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final q0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/k4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->q1()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final r0()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->r1()I

    move-result v0

    return v0
.end method

.method public final s0(I)Lcom/google/android/gms/internal/measurement/k4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->s1(I)Lcom/google/android/gms/internal/measurement/k4;

    move-result-object p1

    return-object p1
.end method

.method public final t0(ILcom/google/android/gms/internal/measurement/j4;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/v8;->p()Lcom/google/android/gms/internal/measurement/z8;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/s4;->N0(Lcom/google/android/gms/internal/measurement/s4;ILcom/google/android/gms/internal/measurement/k4;)V

    return-object p0
.end method

.method public final u0(Lcom/google/android/gms/internal/measurement/j4;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/v8;->p()Lcom/google/android/gms/internal/measurement/z8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/k4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->O0(Lcom/google/android/gms/internal/measurement/s4;Lcom/google/android/gms/internal/measurement/k4;)V

    return-object p0
.end method

.method public final v0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/measurement/k4;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/r4;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->P0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast p1, Lcom/google/android/gms/internal/measurement/s4;

    const-string v0, "android"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/s4;->d0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final w0()Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s4;->Q0(Lcom/google/android/gms/internal/measurement/s4;)V

    return-object p0
.end method

.method public final x(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->e0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final x0(I)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->R0(Lcom/google/android/gms/internal/measurement/s4;I)V

    return-object p0
.end method

.method public final y(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->f0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final y0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/d5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->t1()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/v8;->s()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/v8;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s4;->g0(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final z0()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Lcom/google/android/gms/internal/measurement/z8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s4;->u1()I

    move-result v0

    return v0
.end method
