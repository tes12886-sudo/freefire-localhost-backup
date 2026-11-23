.class public final Lm/h0/k/f$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/h0/k/h$c;
.implements Ll/y/b/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/h0/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm/h0/k/h$c;",
        "Ll/y/b/a<",
        "Ll/s;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lm/h0/k/h;

.field final synthetic b:Lm/h0/k/f;


# direct methods
.method public constructor <init>(Lm/h0/k/f;Lm/h0/k/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/h0/k/h;",
            ")V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reader"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm/h0/k/f$d;->a:Lm/h0/k/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm/h0/k/f$d;->m()V

    sget-object v0, Ll/s;->a:Ll/s;

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(ZLm/h0/k/m;)V
    .locals 9

    const-string v0, "settings"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-static {v0}, Lm/h0/k/f;->Y(Lm/h0/k/f;)Lm/h0/g/d;

    move-result-object v0

    iget-object v1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v1}, Lm/h0/k/f;->j0()Ljava/lang/String;

    move-result-object v1

    const-string v2, " applyAndAckSettings"

    invoke-static {v1, v2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lm/h0/k/f$d$d;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lm/h0/k/f$d$d;-><init>(Ljava/lang/String;ZLm/h0/k/f$d;ZLm/h0/k/m;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method

.method public d(ZILn/d;I)V
    .locals 2

    const-string v0, "source"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p2}, Lm/h0/k/f;->C0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p2, p3, p4, p1}, Lm/h0/k/f;->y0(ILn/d;IZ)V

    return-void

    :cond_0
    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p2}, Lm/h0/k/f;->q0(I)Lm/h0/k/i;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    sget-object v0, Lm/h0/k/b;->d:Lm/h0/k/b;

    invoke-virtual {p1, p2, v0}, Lm/h0/k/f;->Q0(ILm/h0/k/b;)V

    iget-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    int-to-long v0, p4

    invoke-virtual {p1, v0, v1}, Lm/h0/k/f;->L0(J)V

    invoke-interface {p3, v0, v1}, Ln/d;->skip(J)V

    return-void

    :cond_1
    invoke-virtual {v0, p3, p4}, Lm/h0/k/i;->w(Ln/d;I)V

    if-eqz p1, :cond_2

    sget-object p1, Lm/h0/d;->b:Lm/u;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Lm/h0/k/i;->x(Lm/u;Z)V

    :cond_2
    return-void
.end method

.method public e(ZII)V
    .locals 9

    if-eqz p1, :cond_3

    iget-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    monitor-enter p1

    const/4 p3, 0x1

    const-wide/16 v0, 0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    :goto_0
    :try_start_0
    sget-object p2, Ll/s;->a:Ll/s;

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lm/h0/k/f;->c(Lm/h0/k/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lm/h0/k/f;->a0(Lm/h0/k/f;J)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lm/h0/k/f;->l(Lm/h0/k/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lm/h0/k/f;->b0(Lm/h0/k/f;J)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lm/h0/k/f;->F(Lm/h0/k/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lm/h0/k/f;->d0(Lm/h0/k/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_3
    iget-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-static {p1}, Lm/h0/k/f;->Y(Lm/h0/k/f;)Lm/h0/g/d;

    move-result-object p1

    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0}, Lm/h0/k/f;->j0()Ljava/lang/String;

    move-result-object v0

    const-string v1, " ping"

    invoke-static {v0, v1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    const-wide/16 v0, 0x0

    const/4 v4, 0x1

    new-instance v8, Lm/h0/k/f$d$c;

    move-object v2, v8

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lm/h0/k/f$d$c;-><init>(Ljava/lang/String;ZLm/h0/k/f;II)V

    invoke-virtual {p1, v8, v0, v1}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    :goto_2
    return-void
.end method

.method public f(IIIZ)V
    .locals 0

    return-void
.end method

.method public g(ILm/h0/k/b;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p1}, Lm/h0/k/f;->C0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p1, p2}, Lm/h0/k/f;->B0(ILm/h0/k/b;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p1}, Lm/h0/k/f;->D0(I)Lm/h0/k/i;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Lm/h0/k/i;->y(Lm/h0/k/b;)V

    :goto_0
    return-void
.end method

.method public h(ZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;)V"
        }
    .end annotation

    const-string p3, "headerBlock"

    invoke-static {p4, p3}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {p3, p2}, Lm/h0/k/f;->C0(I)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {p3, p2, p4, p1}, Lm/h0/k/f;->z0(ILjava/util/List;Z)V

    return-void

    :cond_0
    iget-object p3, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    monitor-enter p3

    :try_start_0
    invoke-virtual {p3, p2}, Lm/h0/k/f;->q0(I)Lm/h0/k/i;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p3}, Lm/h0/k/f;->Z(Lm/h0/k/f;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p3

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p3}, Lm/h0/k/f;->k0()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p2, v0, :cond_2

    monitor-exit p3

    return-void

    :cond_2
    :try_start_2
    rem-int/lit8 v0, p2, 0x2

    invoke-virtual {p3}, Lm/h0/k/f;->m0()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v0, v1, :cond_3

    monitor-exit p3

    return-void

    :cond_3
    :try_start_3
    invoke-static {p4}, Lm/h0/d;->O(Ljava/util/List;)Lm/u;

    move-result-object v5

    new-instance p4, Lm/h0/k/i;

    const/4 v3, 0x0

    move-object v0, p4

    move v1, p2

    move-object v2, p3

    move v4, p1

    invoke-direct/range {v0 .. v5}, Lm/h0/k/i;-><init>(ILm/h0/k/f;ZZLm/u;)V

    invoke-virtual {p3, p2}, Lm/h0/k/f;->F0(I)V

    invoke-virtual {p3}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lm/h0/k/f;->T(Lm/h0/k/f;)Lm/h0/g/e;

    move-result-object p1

    invoke-virtual {p1}, Lm/h0/g/e;->i()Lm/h0/g/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lm/h0/k/f;->j0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] onStream"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    new-instance v3, Lm/h0/k/f$d$b;

    invoke-direct {v3, p2, v2, p3, p4}, Lm/h0/k/f$d$b;-><init>(Ljava/lang/String;ZLm/h0/k/f;Lm/h0/k/i;)V

    invoke-virtual {p1, v3, v0, v1}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p3

    return-void

    :cond_4
    :try_start_4
    sget-object p2, Ll/s;->a:Ll/s;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p3

    invoke-static {p4}, Lm/h0/d;->O(Ljava/util/List;)Lm/u;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lm/h0/k/i;->x(Lm/u;Z)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3

    throw p1
.end method

.method public i(IJ)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lm/h0/k/f;->s0()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-static {p1, v0, v1}, Lm/h0/k/f;->f0(Lm/h0/k/f;J)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_0
    iget-object v0, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v0, p1}, Lm/h0/k/f;->q0(I)Lm/h0/k/i;

    move-result-object p1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1, p2, p3}, Lm/h0/k/i;->a(J)V

    sget-object p2, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    monitor-exit p1

    goto :goto_1

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    :goto_1
    return-void
.end method

.method public j(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;)V"
        }
    .end annotation

    const-string p1, "requestHeaders"

    invoke-static {p3, p1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {p1, p2, p3}, Lm/h0/k/f;->A0(ILjava/util/List;)V

    return-void
.end method

.method public k(ILm/h0/k/b;Ln/e;)V
    .locals 3

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "debugData"

    invoke-static {p3, p2}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ln/e;->t()I

    iget-object p2, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    monitor-enter p2

    :try_start_0
    invoke-virtual {p2}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    const/4 v0, 0x0

    new-array v1, v0, [Lm/h0/k/i;

    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    invoke-static {p2, v1}, Lm/h0/k/f;->e0(Lm/h0/k/f;Z)V

    sget-object v1, Ll/s;->a:Ll/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    check-cast p3, [Lm/h0/k/i;

    array-length p2, p3

    :cond_0
    :goto_0
    if-ge v0, p2, :cond_1

    aget-object v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1}, Lm/h0/k/i;->j()I

    move-result v2

    if-le v2, p1, :cond_0

    invoke-virtual {v1}, Lm/h0/k/i;->t()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lm/h0/k/b;->j:Lm/h0/k/b;

    invoke-virtual {v1, v2}, Lm/h0/k/i;->y(Lm/h0/k/b;)V

    iget-object v2, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v1}, Lm/h0/k/i;->j()I

    move-result v1

    invoke-virtual {v2, v1}, Lm/h0/k/f;->D0(I)Lm/h0/k/i;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p2

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final l(ZLm/h0/k/m;)V
    .locals 11

    const-string v0, "settings"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll/y/c/l;

    invoke-direct {v0}, Ll/y/c/l;-><init>()V

    iget-object v1, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v1}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object v1

    iget-object v2, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    monitor-enter v1

    :try_start_0
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {v2}, Lm/h0/k/f;->o0()Lm/h0/k/m;

    move-result-object v3

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lm/h0/k/m;

    invoke-direct {p1}, Lm/h0/k/m;-><init>()V

    invoke-virtual {p1, v3}, Lm/h0/k/m;->g(Lm/h0/k/m;)V

    invoke-virtual {p1, p2}, Lm/h0/k/m;->g(Lm/h0/k/m;)V

    move-object p2, p1

    :goto_0
    iput-object p2, v0, Ll/y/c/l;->a:Ljava/lang/Object;

    check-cast p2, Lm/h0/k/m;

    invoke-virtual {p2}, Lm/h0/k/m;->c()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v3}, Lm/h0/k/m;->c()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr p1, v3

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    cmp-long v6, p1, v4

    if-eqz v6, :cond_3

    invoke-virtual {v2}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    new-array v7, v3, [Lm/h0/k/i;

    invoke-interface {v6, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    check-cast v6, [Lm/h0/k/i;

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const/4 v6, 0x0

    :goto_2
    iget-object v7, v0, Ll/y/c/l;->a:Ljava/lang/Object;

    check-cast v7, Lm/h0/k/m;

    invoke-virtual {v2, v7}, Lm/h0/k/f;->H0(Lm/h0/k/m;)V

    invoke-static {v2}, Lm/h0/k/f;->Q(Lm/h0/k/f;)Lm/h0/g/d;

    move-result-object v7

    invoke-virtual {v2}, Lm/h0/k/f;->j0()Ljava/lang/String;

    move-result-object v8

    const-string v9, " onSettings"

    invoke-static {v8, v9}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lm/h0/k/f$d$a;

    const/4 v10, 0x1

    invoke-direct {v9, v8, v10, v2, v0}, Lm/h0/k/f$d$a;-><init>(Ljava/lang/String;ZLm/h0/k/f;Ll/y/c/l;)V

    invoke-virtual {v7, v9, v4, v5}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    sget-object v4, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v2}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object v4

    iget-object v0, v0, Ll/y/c/l;->a:Ljava/lang/Object;

    check-cast v0, Lm/h0/k/m;

    invoke-virtual {v4, v0}, Lm/h0/k/j;->b(Lm/h0/k/m;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_4
    invoke-static {v2, v0}, Lm/h0/k/f;->b(Lm/h0/k/f;Ljava/io/IOException;)V

    :goto_3
    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v1

    if-eqz v6, :cond_4

    array-length v0, v6

    :goto_4
    if-ge v3, v0, :cond_4

    aget-object v1, v6, v3

    add-int/lit8 v3, v3, 0x1

    monitor-enter v1

    :try_start_5
    invoke-virtual {v1, p1, p2}, Lm/h0/k/i;->a(J)V

    sget-object v2, Ll/s;->a:Ll/s;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v1

    goto :goto_4

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_4
    return-void

    :catchall_1
    move-exception p1

    :try_start_6
    monitor-exit v2

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    monitor-exit v1

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method public m()V
    .locals 5

    sget-object v0, Lm/h0/k/b;->e:Lm/h0/k/b;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lm/h0/k/f$d;->a:Lm/h0/k/h;

    invoke-virtual {v2, p0}, Lm/h0/k/h;->f(Lm/h0/k/h$c;)V

    :goto_0
    iget-object v2, p0, Lm/h0/k/f$d;->a:Lm/h0/k/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Lm/h0/k/h;->c(ZLm/h0/k/h$c;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lm/h0/k/b;->c:Lm/h0/k/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Lm/h0/k/b;->k:Lm/h0/k/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v3, v2, v0, v1}, Lm/h0/k/f;->g0(Lm/h0/k/b;Lm/h0/k/b;Ljava/io/IOException;)V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_0
    move-exception v3

    move-object v2, v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_1
    :try_start_2
    sget-object v0, Lm/h0/k/b;->d:Lm/h0/k/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v2, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v2, v0, v0, v1}, Lm/h0/k/f;->g0(Lm/h0/k/b;Lm/h0/k/b;Ljava/io/IOException;)V

    :goto_2
    iget-object v0, p0, Lm/h0/k/f$d;->a:Lm/h0/k/h;

    invoke-static {v0}, Lm/h0/d;->j(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v3

    :goto_3
    iget-object v4, p0, Lm/h0/k/f$d;->b:Lm/h0/k/f;

    invoke-virtual {v4, v2, v0, v1}, Lm/h0/k/f;->g0(Lm/h0/k/b;Lm/h0/k/b;Ljava/io/IOException;)V

    iget-object v0, p0, Lm/h0/k/f$d;->a:Lm/h0/k/h;

    invoke-static {v0}, Lm/h0/d;->j(Ljava/io/Closeable;)V

    goto :goto_5

    :goto_4
    throw v3

    :goto_5
    goto :goto_4
.end method
