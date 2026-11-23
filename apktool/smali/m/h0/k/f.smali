.class public final Lm/h0/k/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/k/f$a;,
        Lm/h0/k/f$d;,
        Lm/h0/k/f$c;,
        Lm/h0/k/f$b;
    }
.end annotation


# static fields
.field public static final L:Lm/h0/k/f$b;

.field private static final M:Lm/h0/k/m;


# instance fields
.field private F:J

.field private G:J

.field private final H:Ljava/net/Socket;

.field private final I:Lm/h0/k/j;

.field private final J:Lm/h0/k/f$d;

.field private final K:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Z

.field private final b:Lm/h0/k/f$c;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lm/h0/k/i;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z

.field private final h:Lm/h0/g/e;

.field private final i:Lm/h0/g/d;

.field private final j:Lm/h0/g/d;

.field private final k:Lm/h0/g/d;

.field private final l:Lm/h0/k/l;

.field private m:J

.field private n:J

.field private o:J

.field private p:J

.field private q:J

.field private r:J

.field private final s:Lm/h0/k/m;

.field private t:Lm/h0/k/m;

.field private u:J

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm/h0/k/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/h0/k/f$b;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/h0/k/f;->L:Lm/h0/k/f$b;

    new-instance v0, Lm/h0/k/m;

    invoke-direct {v0}, Lm/h0/k/m;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lm/h0/k/m;->h(II)Lm/h0/k/m;

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lm/h0/k/m;->h(II)Lm/h0/k/m;

    sput-object v0, Lm/h0/k/f;->M:Lm/h0/k/m;

    return-void
.end method

.method public constructor <init>(Lm/h0/k/f$a;)V
    .locals 6

    const-string v0, "builder"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lm/h0/k/f$a;->b()Z

    move-result v0

    iput-boolean v0, p0, Lm/h0/k/f;->a:Z

    invoke-virtual {p1}, Lm/h0/k/f$a;->d()Lm/h0/k/f$c;

    move-result-object v1

    iput-object v1, p0, Lm/h0/k/f;->b:Lm/h0/k/f$c;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lm/h0/k/f;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lm/h0/k/f$a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lm/h0/k/f$a;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    iput v2, p0, Lm/h0/k/f;->f:I

    invoke-virtual {p1}, Lm/h0/k/f$a;->j()Lm/h0/g/e;

    move-result-object v2

    iput-object v2, p0, Lm/h0/k/f;->h:Lm/h0/g/e;

    invoke-virtual {v2}, Lm/h0/g/e;->i()Lm/h0/g/d;

    move-result-object v3

    iput-object v3, p0, Lm/h0/k/f;->i:Lm/h0/g/d;

    invoke-virtual {v2}, Lm/h0/g/e;->i()Lm/h0/g/d;

    move-result-object v4

    iput-object v4, p0, Lm/h0/k/f;->j:Lm/h0/g/d;

    invoke-virtual {v2}, Lm/h0/g/e;->i()Lm/h0/g/d;

    move-result-object v2

    iput-object v2, p0, Lm/h0/k/f;->k:Lm/h0/g/d;

    invoke-virtual {p1}, Lm/h0/k/f$a;->f()Lm/h0/k/l;

    move-result-object v2

    iput-object v2, p0, Lm/h0/k/f;->l:Lm/h0/k/l;

    new-instance v2, Lm/h0/k/m;

    invoke-direct {v2}, Lm/h0/k/m;-><init>()V

    invoke-virtual {p1}, Lm/h0/k/f$a;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x7

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, Lm/h0/k/m;->h(II)Lm/h0/k/m;

    :cond_1
    iput-object v2, p0, Lm/h0/k/f;->s:Lm/h0/k/m;

    sget-object v2, Lm/h0/k/f;->M:Lm/h0/k/m;

    iput-object v2, p0, Lm/h0/k/f;->t:Lm/h0/k/m;

    invoke-virtual {v2}, Lm/h0/k/m;->c()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, Lm/h0/k/f;->G:J

    invoke-virtual {p1}, Lm/h0/k/f$a;->h()Ljava/net/Socket;

    move-result-object v2

    iput-object v2, p0, Lm/h0/k/f;->H:Ljava/net/Socket;

    new-instance v2, Lm/h0/k/j;

    invoke-virtual {p1}, Lm/h0/k/f$a;->g()Ln/c;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lm/h0/k/j;-><init>(Ln/c;Z)V

    iput-object v2, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    new-instance v2, Lm/h0/k/f$d;

    new-instance v4, Lm/h0/k/h;

    invoke-virtual {p1}, Lm/h0/k/f$a;->i()Ln/d;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lm/h0/k/h;-><init>(Ln/d;Z)V

    invoke-direct {v2, p0, v4}, Lm/h0/k/f$d;-><init>(Lm/h0/k/f;Lm/h0/k/h;)V

    iput-object v2, p0, Lm/h0/k/f;->J:Lm/h0/k/f$d;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lm/h0/k/f;->K:Ljava/util/Set;

    invoke-virtual {p1}, Lm/h0/k/f$a;->e()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lm/h0/k/f$a;->e()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    const-string p1, " ping"

    invoke-static {v1, p1}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lm/h0/k/f$j;

    invoke-direct {v0, p1, p0, v4, v5}, Lm/h0/k/f$j;-><init>(Ljava/lang/String;Lm/h0/k/f;J)V

    invoke-virtual {v3, v0, v4, v5}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    :cond_2
    return-void
.end method

.method public static final synthetic F(Lm/h0/k/f;)J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/f;->n:J

    return-wide v0
.end method

.method public static synthetic K0(Lm/h0/k/f;ZLm/h0/g/e;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lm/h0/g/e;->i:Lm/h0/g/e;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lm/h0/k/f;->J0(ZLm/h0/g/e;)V

    return-void
.end method

.method public static final synthetic O(Lm/h0/k/f;)Lm/h0/k/l;
    .locals 0

    iget-object p0, p0, Lm/h0/k/f;->l:Lm/h0/k/l;

    return-object p0
.end method

.method public static final synthetic Q(Lm/h0/k/f;)Lm/h0/g/d;
    .locals 0

    iget-object p0, p0, Lm/h0/k/f;->k:Lm/h0/g/d;

    return-object p0
.end method

.method public static final synthetic T(Lm/h0/k/f;)Lm/h0/g/e;
    .locals 0

    iget-object p0, p0, Lm/h0/k/f;->h:Lm/h0/g/e;

    return-object p0
.end method

.method public static final synthetic Y(Lm/h0/k/f;)Lm/h0/g/d;
    .locals 0

    iget-object p0, p0, Lm/h0/k/f;->i:Lm/h0/g/d;

    return-object p0
.end method

.method public static final synthetic Z(Lm/h0/k/f;)Z
    .locals 0

    iget-boolean p0, p0, Lm/h0/k/f;->g:Z

    return p0
.end method

.method public static final synthetic a0(Lm/h0/k/f;J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/f;->q:J

    return-void
.end method

.method public static final synthetic b(Lm/h0/k/f;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Lm/h0/k/f;->h0(Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic b0(Lm/h0/k/f;J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/f;->p:J

    return-void
.end method

.method public static final synthetic c(Lm/h0/k/f;)J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/f;->q:J

    return-wide v0
.end method

.method public static final synthetic c0(Lm/h0/k/f;J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/f;->m:J

    return-void
.end method

.method public static final synthetic d0(Lm/h0/k/f;J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/f;->n:J

    return-void
.end method

.method public static final synthetic e0(Lm/h0/k/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lm/h0/k/f;->g:Z

    return-void
.end method

.method public static final synthetic f(Lm/h0/k/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lm/h0/k/f;->K:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic f0(Lm/h0/k/f;J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/k/f;->G:J

    return-void
.end method

.method private final h0(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Lm/h0/k/b;->d:Lm/h0/k/b;

    invoke-virtual {p0, v0, v0, p1}, Lm/h0/k/f;->g0(Lm/h0/k/b;Lm/h0/k/b;Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic j()Lm/h0/k/m;
    .locals 1

    sget-object v0, Lm/h0/k/f;->M:Lm/h0/k/m;

    return-object v0
.end method

.method public static final synthetic l(Lm/h0/k/f;)J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/f;->p:J

    return-wide v0
.end method

.method public static final synthetic u(Lm/h0/k/f;)J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/f;->m:J

    return-wide v0
.end method

.method private final w0(ILjava/util/List;Z)Lm/h0/k/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;Z)",
            "Lm/h0/k/i;"
        }
    .end annotation

    xor-int/lit8 v6, p3, 0x1

    const/4 v4, 0x0

    iget-object v7, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    monitor-enter v7

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lm/h0/k/f;->m0()I

    move-result v0

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    sget-object v0, Lm/h0/k/b;->j:Lm/h0/k/b;

    invoke-virtual {p0, v0}, Lm/h0/k/f;->I0(Lm/h0/k/b;)V

    :cond_0
    iget-boolean v0, p0, Lm/h0/k/f;->g:Z

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lm/h0/k/f;->m0()I

    move-result v8

    invoke-virtual {p0}, Lm/h0/k/f;->m0()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lm/h0/k/f;->G0(I)V

    new-instance v9, Lm/h0/k/i;

    const/4 v5, 0x0

    move-object v0, v9

    move v1, v8

    move-object v2, p0

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lm/h0/k/i;-><init>(ILm/h0/k/f;ZZLm/u;)V

    const/4 v0, 0x1

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lm/h0/k/f;->t0()J

    move-result-wide v1

    invoke-virtual {p0}, Lm/h0/k/f;->s0()J

    move-result-wide v3

    cmp-long p3, v1, v3

    if-gez p3, :cond_2

    invoke-virtual {v9}, Lm/h0/k/i;->r()J

    move-result-wide v1

    invoke-virtual {v9}, Lm/h0/k/i;->q()J

    move-result-wide v3

    cmp-long p3, v1, v3

    if-ltz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x1

    :goto_1
    invoke-virtual {v9}, Lm/h0/k/i;->u()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v1, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object p1

    invoke-virtual {p1, v6, v8, p2}, Lm/h0/k/j;->F(ZILjava/util/List;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lm/h0/k/f;->i0()Z

    move-result v1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object v0

    invoke-virtual {v0, p1, v8, p2}, Lm/h0/k/j;->T(IILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit v7

    if-eqz p3, :cond_5

    iget-object p1, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {p1}, Lm/h0/k/j;->flush()V

    :cond_5
    return-object v9

    :cond_6
    :try_start_3
    const-string p1, "client streams shouldn\'t have associated stream IDs"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :try_start_4
    new-instance p1, Lm/h0/k/a;

    invoke-direct {p1}, Lm/h0/k/a;-><init>()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v7

    throw p1
.end method


# virtual methods
.method public final A0(ILjava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm/h0/k/f;->K:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lm/h0/k/b;->d:Lm/h0/k/b;

    invoke-virtual {p0, p1, p2}, Lm/h0/k/f;->Q0(ILm/h0/k/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lm/h0/k/f;->K:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v0, p0, Lm/h0/k/f;->j:Lm/h0/g/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onRequest"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v1, 0x0

    const/4 v5, 0x1

    new-instance v9, Lm/h0/k/f$g;

    move-object v3, v9

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lm/h0/k/f$g;-><init>(Ljava/lang/String;ZLm/h0/k/f;ILjava/util/List;)V

    invoke-virtual {v0, v9, v1, v2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final B0(ILm/h0/k/b;)V
    .locals 9

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f;->j:Lm/h0/g/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lm/h0/k/f$h;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lm/h0/k/f$h;-><init>(Ljava/lang/String;ZLm/h0/k/f;ILm/h0/k/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method

.method public final C0(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final declared-synchronized D0(I)Lm/h0/k/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm/h0/k/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/h0/k/i;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final E0()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lm/h0/k/f;->p:J

    iget-wide v2, p0, Lm/h0/k/f;->o:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    :try_start_1
    iput-wide v2, p0, Lm/h0/k/f;->o:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const v2, 0x3b9aca00

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lm/h0/k/f;->r:J

    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v0, p0, Lm/h0/k/f;->i:Lm/h0/g/d;

    iget-object v1, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    const-string v2, " ping"

    invoke-static {v1, v2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    new-instance v5, Lm/h0/k/f$i;

    invoke-direct {v5, v1, v4, p0}, Lm/h0/k/f$i;-><init>(Ljava/lang/String;ZLm/h0/k/f;)V

    invoke-virtual {v0, v5, v2, v3}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final F0(I)V
    .locals 0

    iput p1, p0, Lm/h0/k/f;->e:I

    return-void
.end method

.method public final G0(I)V
    .locals 0

    iput p1, p0, Lm/h0/k/f;->f:I

    return-void
.end method

.method public final H0(Lm/h0/k/m;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/h0/k/f;->t:Lm/h0/k/m;

    return-void
.end method

.method public final I0(Lm/h0/k/b;)V
    .locals 4

    const-string v0, "statusCode"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ll/y/c/k;

    invoke-direct {v1}, Ll/y/c/k;-><init>()V

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v2, p0, Lm/h0/k/f;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    :try_start_3
    iput-boolean v2, p0, Lm/h0/k/f;->g:Z

    invoke-virtual {p0}, Lm/h0/k/f;->k0()I

    move-result v2

    iput v2, v1, Ll/y/c/k;->a:I

    sget-object v2, Ll/s;->a:Ll/s;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit p0

    invoke-virtual {p0}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object v2

    iget v1, v1, Ll/y/c/k;->a:I

    sget-object v3, Lm/h0/d;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lm/h0/k/j;->u(ILm/h0/k/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final J0(ZLm/h0/g/e;)V
    .locals 5

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {p1}, Lm/h0/k/j;->c()V

    iget-object p1, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    iget-object v0, p0, Lm/h0/k/f;->s:Lm/h0/k/m;

    invoke-virtual {p1, v0}, Lm/h0/k/j;->Z(Lm/h0/k/m;)V

    iget-object p1, p0, Lm/h0/k/f;->s:Lm/h0/k/m;

    invoke-virtual {p1}, Lm/h0/k/m;->c()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    const/4 v2, 0x0

    sub-int/2addr p1, v0

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lm/h0/k/j;->a0(IJ)V

    :cond_0
    invoke-virtual {p2}, Lm/h0/g/e;->i()Lm/h0/g/d;

    move-result-object p1

    iget-object p2, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    iget-object v0, p0, Lm/h0/k/f;->J:Lm/h0/k/f$d;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    new-instance v4, Lm/h0/g/c;

    invoke-direct {v4, p2, v3, v0}, Lm/h0/g/c;-><init>(Ljava/lang/String;ZLl/y/b/a;)V

    invoke-virtual {p1, v4, v1, v2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method

.method public final declared-synchronized L0(J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lm/h0/k/f;->u:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lm/h0/k/f;->u:J

    iget-wide p1, p0, Lm/h0/k/f;->v:J

    sub-long/2addr v0, p1

    iget-object p1, p0, Lm/h0/k/f;->s:Lm/h0/k/m;

    invoke-virtual {p1}, Lm/h0/k/m;->c()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lm/h0/k/f;->R0(IJ)V

    iget-wide p1, p0, Lm/h0/k/f;->v:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lm/h0/k/f;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final M0(IZLn/b;J)V
    .locals 8

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    iget-object p4, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {p4, p2, p1, p3, v0}, Lm/h0/k/j;->f(ZILn/b;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v3, p4, v1

    if-lez v3, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    invoke-virtual {p0}, Lm/h0/k/f;->t0()J

    move-result-wide v3

    invoke-virtual {p0}, Lm/h0/k/f;->s0()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-ltz v7, :cond_2

    invoke-virtual {p0}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lm/h0/k/f;->s0()J

    move-result-wide v3

    invoke-virtual {p0}, Lm/h0/k/f;->t0()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    invoke-virtual {p0}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object v3

    invoke-virtual {v3}, Lm/h0/k/j;->O()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p0}, Lm/h0/k/f;->t0()J

    move-result-wide v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Lm/h0/k/f;->F:J

    sget-object v4, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v1

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v3}, Lm/h0/k/j;->f(ZILn/b;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final N0(IZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "alternating"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {v0, p2, p1, p3}, Lm/h0/k/j;->F(ZILjava/util/List;)V

    return-void
.end method

.method public final O0(ZII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {v0, p1, p2, p3}, Lm/h0/k/j;->Q(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lm/h0/k/f;->h0(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public final P0(ILm/h0/k/b;)V
    .locals 1

    const-string v0, "statusCode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {v0, p1, p2}, Lm/h0/k/j;->Y(ILm/h0/k/b;)V

    return-void
.end method

.method public final Q0(ILm/h0/k/b;)V
    .locals 9

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f;->i:Lm/h0/g/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] writeSynReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lm/h0/k/f$k;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lm/h0/k/f$k;-><init>(Ljava/lang/String;ZLm/h0/k/f;ILm/h0/k/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method

.method public final R0(IJ)V
    .locals 10

    iget-object v0, p0, Lm/h0/k/f;->i:Lm/h0/g/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] windowUpdate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lm/h0/k/f$l;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-wide v8, p2

    invoke-direct/range {v3 .. v9}, Lm/h0/k/f$l;-><init>(Ljava/lang/String;ZLm/h0/k/f;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method

.method public close()V
    .locals 3

    sget-object v0, Lm/h0/k/b;->c:Lm/h0/k/b;

    sget-object v1, Lm/h0/k/b;->k:Lm/h0/k/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lm/h0/k/f;->g0(Lm/h0/k/b;Lm/h0/k/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    invoke-virtual {v0}, Lm/h0/k/j;->flush()V

    return-void
.end method

.method public final g0(Lm/h0/k/b;Lm/h0/k/b;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "connectionCode"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Lm/h0/k/f;->I0(Lm/h0/k/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v0, v1, [Lm/h0/k/i;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lm/h0/k/f;->r0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    sget-object v0, Ll/s;->a:Ll/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    check-cast p1, [Lm/h0/k/i;

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    array-length v0, p1

    :goto_2
    if-ge v1, v0, :cond_5

    aget-object v2, p1, v1

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lm/h0/k/i;->d(Lm/h0/k/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    :try_start_3
    invoke-virtual {p0}, Lm/h0/k/f;->u0()Lm/h0/k/j;

    move-result-object p1

    invoke-virtual {p1}, Lm/h0/k/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    invoke-virtual {p0}, Lm/h0/k/f;->p0()Ljava/net/Socket;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lm/h0/k/f;->i:Lm/h0/g/d;

    invoke-virtual {p1}, Lm/h0/g/d;->o()V

    iget-object p1, p0, Lm/h0/k/f;->j:Lm/h0/g/d;

    invoke-virtual {p1}, Lm/h0/g/d;->o()V

    iget-object p1, p0, Lm/h0/k/f;->k:Lm/h0/g/d;

    invoke-virtual {p1}, Lm/h0/g/d;->o()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method

.method public final i0()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/k/f;->a:Z

    return v0
.end method

.method public final j0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final k0()I
    .locals 1

    iget v0, p0, Lm/h0/k/f;->e:I

    return v0
.end method

.method public final l0()Lm/h0/k/f$c;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->b:Lm/h0/k/f$c;

    return-object v0
.end method

.method public final m0()I
    .locals 1

    iget v0, p0, Lm/h0/k/f;->f:I

    return v0
.end method

.method public final n0()Lm/h0/k/m;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->s:Lm/h0/k/m;

    return-object v0
.end method

.method public final o0()Lm/h0/k/m;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->t:Lm/h0/k/m;

    return-object v0
.end method

.method public final p0()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->H:Ljava/net/Socket;

    return-object v0
.end method

.method public final declared-synchronized q0(I)Lm/h0/k/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm/h0/k/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/h0/k/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final r0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lm/h0/k/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/h0/k/f;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final s0()J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/f;->G:J

    return-wide v0
.end method

.method public final t0()J
    .locals 2

    iget-wide v0, p0, Lm/h0/k/f;->F:J

    return-wide v0
.end method

.method public final u0()Lm/h0/k/j;
    .locals 1

    iget-object v0, p0, Lm/h0/k/f;->I:Lm/h0/k/j;

    return-object v0
.end method

.method public final declared-synchronized v0(J)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lm/h0/k/f;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-wide v2, p0, Lm/h0/k/f;->p:J

    iget-wide v4, p0, Lm/h0/k/f;->o:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, Lm/h0/k/f;->r:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final x0(Ljava/util/List;Z)Lm/h0/k/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;Z)",
            "Lm/h0/k/i;"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lm/h0/k/f;->w0(ILjava/util/List;Z)Lm/h0/k/i;

    move-result-object p1

    return-object p1
.end method

.method public final y0(ILn/d;IZ)V
    .locals 9

    const-string v0, "source"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ln/b;

    invoke-direct {v6}, Ln/b;-><init>()V

    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Ln/d;->P(J)V

    invoke-interface {p2, v6, v0, v1}, Ln/x;->I(Ln/b;J)J

    iget-object p2, p0, Lm/h0/k/f;->j:Lm/h0/g/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] onData"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lm/h0/k/f$e;

    const/4 v3, 0x1

    move-object v1, v0

    move-object v4, p0

    move v5, p1

    move v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, Lm/h0/k/f$e;-><init>(Ljava/lang/String;ZLm/h0/k/f;ILn/b;IZ)V

    const-wide/16 p3, 0x0

    invoke-virtual {p2, v0, p3, p4}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method

.method public final z0(ILjava/util/List;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lm/h0/k/c;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/k/f;->j:Lm/h0/g/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lm/h0/k/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lm/h0/k/f$f;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    move v9, p3

    invoke-direct/range {v3 .. v9}, Lm/h0/k/f$f;-><init>(Ljava/lang/String;ZLm/h0/k/f;ILjava/util/List;Z)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lm/h0/g/d;->i(Lm/h0/g/a;J)V

    return-void
.end method
