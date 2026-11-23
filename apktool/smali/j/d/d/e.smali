.class public final Lj/d/d/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/d/d/e$f;
    }
.end annotation


# static fields
.field static final m:Ljava/lang/String;

.field static final n:Lj/d/d/d;

.field static final o:Lj/d/d/v;

.field static final p:Lj/d/d/v;

.field private static final q:Lj/d/d/a0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d/d/a0/a<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Lj/d/d/a0/a<",
            "*>;",
            "Lj/d/d/e$f<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj/d/d/a0/a<",
            "*>;",
            "Lj/d/d/w<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Lj/d/d/z/c;

.field private final d:Lj/d/d/z/n/e;

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;"
        }
    .end annotation
.end field

.field final f:Z

.field final g:Z

.field final h:Z

.field final i:Z

.field final j:Z

.field final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;"
        }
    .end annotation
.end field

.field final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj/d/d/c;->a:Lj/d/d/c;

    sput-object v0, Lj/d/d/e;->n:Lj/d/d/d;

    sget-object v0, Lj/d/d/u;->a:Lj/d/d/u;

    sput-object v0, Lj/d/d/e;->o:Lj/d/d/v;

    sget-object v0, Lj/d/d/u;->b:Lj/d/d/u;

    sput-object v0, Lj/d/d/e;->p:Lj/d/d/v;

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lj/d/d/a0/a;->get(Ljava/lang/Class;)Lj/d/d/a0/a;

    move-result-object v0

    sput-object v0, Lj/d/d/e;->q:Lj/d/d/a0/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lj/d/d/z/d;->g:Lj/d/d/z/d;

    sget-object v2, Lj/d/d/e;->n:Lj/d/d/d;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    sget-object v12, Lj/d/d/t;->a:Lj/d/d/t;

    sget-object v13, Lj/d/d/e;->m:Ljava/lang/String;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v17

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v18

    sget-object v19, Lj/d/d/e;->o:Lj/d/d/v;

    sget-object v20, Lj/d/d/e;->p:Lj/d/d/v;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x2

    invoke-direct/range {v0 .. v20}, Lj/d/d/e;-><init>(Lj/d/d/z/d;Lj/d/d/d;Ljava/util/Map;ZZZZZZZZLj/d/d/t;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lj/d/d/v;Lj/d/d/v;)V

    return-void
.end method

.method constructor <init>(Lj/d/d/z/d;Lj/d/d/d;Ljava/util/Map;ZZZZZZZZLj/d/d/t;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lj/d/d/v;Lj/d/d/v;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/z/d;",
            "Lj/d/d/d;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lj/d/d/g<",
            "*>;>;ZZZZZZZZ",
            "Lj/d/d/t;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;",
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;",
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;",
            "Lj/d/d/v;",
            "Lj/d/d/v;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move/from16 v2, p10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/lang/ThreadLocal;

    invoke-direct {v3}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v3, v0, Lj/d/d/e;->a:Ljava/lang/ThreadLocal;

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v3, v0, Lj/d/d/e;->b:Ljava/util/Map;

    new-instance v3, Lj/d/d/z/c;

    move-object v4, p3

    move/from16 v5, p11

    invoke-direct {v3, p3, v5}, Lj/d/d/z/c;-><init>(Ljava/util/Map;Z)V

    iput-object v3, v0, Lj/d/d/e;->c:Lj/d/d/z/c;

    move v4, p4

    iput-boolean v4, v0, Lj/d/d/e;->f:Z

    move v4, p6

    iput-boolean v4, v0, Lj/d/d/e;->g:Z

    move/from16 v4, p7

    iput-boolean v4, v0, Lj/d/d/e;->h:Z

    move/from16 v4, p8

    iput-boolean v4, v0, Lj/d/d/e;->i:Z

    move/from16 v4, p9

    iput-boolean v4, v0, Lj/d/d/e;->j:Z

    move-object/from16 v4, p16

    iput-object v4, v0, Lj/d/d/e;->k:Ljava/util/List;

    move-object/from16 v4, p17

    iput-object v4, v0, Lj/d/d/e;->l:Ljava/util/List;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lj/d/d/z/n/n;->W:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p19 .. p19}, Lj/d/d/z/n/j;->e(Lj/d/d/v;)Lj/d/d/x;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, p18

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v5, Lj/d/d/z/n/n;->C:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lj/d/d/z/n/n;->m:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lj/d/d/z/n/n;->g:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lj/d/d/z/n/n;->i:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lj/d/d/z/n/n;->k:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p12 .. p12}, Lj/d/d/e;->p(Lj/d/d/t;)Lj/d/d/w;

    move-result-object v5

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Long;

    invoke-static {v6, v7, v5}, Lj/d/d/z/n/n;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Double;

    invoke-direct {p0, v2}, Lj/d/d/e;->e(Z)Lj/d/d/w;

    move-result-object v8

    invoke-static {v6, v7, v8}, Lj/d/d/z/n/n;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Float;

    invoke-direct {p0, v2}, Lj/d/d/e;->f(Z)Lj/d/d/w;

    move-result-object v2

    invoke-static {v6, v7, v2}, Lj/d/d/z/n/n;->c(Ljava/lang/Class;Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p20 .. p20}, Lj/d/d/z/n/i;->e(Lj/d/d/v;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->o:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->q:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v5}, Lj/d/d/e;->b(Lj/d/d/w;)Lj/d/d/w;

    move-result-object v6

    invoke-static {v2, v6}, Lj/d/d/z/n/n;->b(Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {v5}, Lj/d/d/e;->c(Lj/d/d/w;)Lj/d/d/w;

    move-result-object v5

    invoke-static {v2, v5}, Lj/d/d/z/n/n;->b(Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->s:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->x:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->E:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->G:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/math/BigDecimal;

    sget-object v5, Lj/d/d/z/n/n;->z:Lj/d/d/w;

    invoke-static {v2, v5}, Lj/d/d/z/n/n;->b(Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/math/BigInteger;

    sget-object v5, Lj/d/d/z/n/n;->A:Lj/d/d/w;

    invoke-static {v2, v5}, Lj/d/d/z/n/n;->b(Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Lj/d/d/z/g;

    sget-object v5, Lj/d/d/z/n/n;->B:Lj/d/d/w;

    invoke-static {v2, v5}, Lj/d/d/z/n/n;->b(Ljava/lang/Class;Lj/d/d/w;)Lj/d/d/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->I:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->K:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->O:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->Q:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->U:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->M:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->d:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/c;->b:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->S:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean v2, Lj/d/d/z/p/d;->a:Z

    if-eqz v2, :cond_0

    sget-object v2, Lj/d/d/z/p/d;->e:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/p/d;->d:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/p/d;->f:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v2, Lj/d/d/z/n/a;->c:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lj/d/d/z/n/n;->b:Lj/d/d/x;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lj/d/d/z/n/b;

    invoke-direct {v2, v3}, Lj/d/d/z/n/b;-><init>(Lj/d/d/z/c;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lj/d/d/z/n/h;

    move v5, p5

    invoke-direct {v2, v3, p5}, Lj/d/d/z/n/h;-><init>(Lj/d/d/z/c;Z)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lj/d/d/z/n/e;

    invoke-direct {v2, v3}, Lj/d/d/z/n/e;-><init>(Lj/d/d/z/c;)V

    iput-object v2, v0, Lj/d/d/e;->d:Lj/d/d/z/n/e;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lj/d/d/z/n/n;->X:Lj/d/d/x;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Lj/d/d/z/n/k;

    move-object v6, p2

    invoke-direct {v5, v3, p2, p1, v2}, Lj/d/d/z/n/k;-><init>(Lj/d/d/z/c;Lj/d/d/d;Lj/d/d/z/d;Lj/d/d/z/n/e;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lj/d/d/e;->e:Ljava/util/List;

    return-void
.end method

.method private static a(Ljava/lang/Object;Lj/d/d/b0/a;)V
    .locals 0

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    move-result-object p0

    sget-object p1, Lj/d/d/b0/b;->j:Lj/d/d/b0/b;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lj/d/d/l;

    const-string p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Lj/d/d/l;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lj/d/d/b0/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Lj/d/d/l;

    invoke-direct {p1, p0}, Lj/d/d/l;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Lj/d/d/s;

    invoke-direct {p1, p0}, Lj/d/d/s;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private static b(Lj/d/d/w;)Lj/d/d/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/w<",
            "Ljava/lang/Number;",
            ">;)",
            "Lj/d/d/w<",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj/d/d/e$d;

    invoke-direct {v0, p0}, Lj/d/d/e$d;-><init>(Lj/d/d/w;)V

    invoke-virtual {v0}, Lj/d/d/w;->a()Lj/d/d/w;

    move-result-object p0

    return-object p0
.end method

.method private static c(Lj/d/d/w;)Lj/d/d/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/w<",
            "Ljava/lang/Number;",
            ">;)",
            "Lj/d/d/w<",
            "Ljava/util/concurrent/atomic/AtomicLongArray;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj/d/d/e$e;

    invoke-direct {v0, p0}, Lj/d/d/e$e;-><init>(Lj/d/d/w;)V

    invoke-virtual {v0}, Lj/d/d/w;->a()Lj/d/d/w;

    move-result-object p0

    return-object p0
.end method

.method static d(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e(Z)Lj/d/d/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lj/d/d/w<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Lj/d/d/z/n/n;->v:Lj/d/d/w;

    return-object p1

    :cond_0
    new-instance p1, Lj/d/d/e$a;

    invoke-direct {p1, p0}, Lj/d/d/e$a;-><init>(Lj/d/d/e;)V

    return-object p1
.end method

.method private f(Z)Lj/d/d/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lj/d/d/w<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Lj/d/d/z/n/n;->u:Lj/d/d/w;

    return-object p1

    :cond_0
    new-instance p1, Lj/d/d/e$b;

    invoke-direct {p1, p0}, Lj/d/d/e$b;-><init>(Lj/d/d/e;)V

    return-object p1
.end method

.method private static p(Lj/d/d/t;)Lj/d/d/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/t;",
            ")",
            "Lj/d/d/w<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    sget-object v0, Lj/d/d/t;->a:Lj/d/d/t;

    if-ne p0, v0, :cond_0

    sget-object p0, Lj/d/d/z/n/n;->t:Lj/d/d/w;

    return-object p0

    :cond_0
    new-instance p0, Lj/d/d/e$c;

    invoke-direct {p0}, Lj/d/d/e$c;-><init>()V

    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lj/d/d/k;
    .locals 1

    new-instance v0, Lj/d/d/z/n/g;

    invoke-direct {v0}, Lj/d/d/z/n/g;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lj/d/d/e;->x(Ljava/lang/Object;Ljava/lang/reflect/Type;Lj/d/d/b0/c;)V

    invoke-virtual {v0}, Lj/d/d/z/n/g;->r0()Lj/d/d/k;

    move-result-object p1

    return-object p1
.end method

.method public g(Lj/d/d/k;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/k;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj/d/d/e;->h(Lj/d/d/k;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lj/d/d/z/k;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(Lj/d/d/k;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/k;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lj/d/d/z/n/f;

    invoke-direct {v0, p1}, Lj/d/d/z/n/f;-><init>(Lj/d/d/k;)V

    invoke-virtual {p0, v0, p2}, Lj/d/d/e;->i(Lj/d/d/b0/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lj/d/d/b0/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/b0/a;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lj/d/d/b0/a;->a0()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lj/d/d/b0/a;->s0(Z)V

    :try_start_0
    invoke-virtual {p1}, Lj/d/d/b0/a;->n0()Lj/d/d/b0/b;

    const/4 v1, 0x0

    invoke-static {p2}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p2

    invoke-virtual {p2, p1}, Lj/d/d/w;->b(Lj/d/d/b0/a;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lj/d/d/b0/a;->s0(Z)V

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_1
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssertionError (GSON 2.9.0): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1

    :catch_1
    move-exception p2

    new-instance v1, Lj/d/d/s;

    invoke-direct {v1, p2}, Lj/d/d/s;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception p2

    new-instance v1, Lj/d/d/s;

    invoke-direct {v1, p2}, Lj/d/d/s;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_3
    move-exception p2

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, v0}, Lj/d/d/b0/a;->s0(Z)V

    return-object p2

    :cond_0
    :try_start_2
    new-instance v1, Lj/d/d/s;

    invoke-direct {v1, p2}, Lj/d/d/s;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-virtual {p1, v0}, Lj/d/d/b0/a;->s0(Z)V

    throw p2
.end method

.method public j(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lj/d/d/e;->q(Ljava/io/Reader;)Lj/d/d/b0/a;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lj/d/d/e;->i(Lj/d/d/b0/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Lj/d/d/e;->a(Ljava/lang/Object;Lj/d/d/b0/a;)V

    return-object p2
.end method

.method public k(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj/d/d/e;->l(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lj/d/d/z/k;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lj/d/d/e;->j(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public m(Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/a0/a<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/e;->b:Ljava/util/Map;

    if-nez p1, :cond_0

    sget-object v1, Lj/d/d/e;->q:Lj/d/d/a0/a;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d/d/w;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lj/d/d/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lj/d/d/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/d/d/e$f;

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    :try_start_0
    new-instance v2, Lj/d/d/e$f;

    invoke-direct {v2}, Lj/d/d/e$f;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lj/d/d/e;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/d/d/x;

    invoke-interface {v4, p0, p1}, Lj/d/d/x;->a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v2, v4}, Lj/d/d/e$f;->e(Lj/d/d/w;)V

    iget-object v2, p0, Lj/d/d/e;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lj/d/d/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    return-object v4

    :cond_6
    :try_start_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GSON (2.9.0) cannot handle "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_7

    iget-object p1, p0, Lj/d/d/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_7
    goto :goto_2

    :goto_1
    throw v2

    :goto_2
    goto :goto_1
.end method

.method public n(Ljava/lang/Class;)Lj/d/d/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lj/d/d/a0/a;->get(Ljava/lang/Class;)Lj/d/d/a0/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p1

    return-object p1
.end method

.method public o(Lj/d/d/x;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/x;",
            "Lj/d/d/a0/a<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lj/d/d/e;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lj/d/d/e;->d:Lj/d/d/z/n/e;

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lj/d/d/e;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/d/d/x;

    if-nez v0, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Lj/d/d/x;->a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GSON cannot serialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public q(Ljava/io/Reader;)Lj/d/d/b0/a;
    .locals 1

    new-instance v0, Lj/d/d/b0/a;

    invoke-direct {v0, p1}, Lj/d/d/b0/a;-><init>(Ljava/io/Reader;)V

    iget-boolean p1, p0, Lj/d/d/e;->j:Z

    invoke-virtual {v0, p1}, Lj/d/d/b0/a;->s0(Z)V

    return-object v0
.end method

.method public r(Ljava/io/Writer;)Lj/d/d/b0/c;
    .locals 1

    iget-boolean v0, p0, Lj/d/d/e;->g:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lj/d/d/b0/c;

    invoke-direct {v0, p1}, Lj/d/d/b0/c;-><init>(Ljava/io/Writer;)V

    iget-boolean p1, p0, Lj/d/d/e;->i:Z

    if-eqz p1, :cond_1

    const-string p1, "  "

    invoke-virtual {v0, p1}, Lj/d/d/b0/c;->h0(Ljava/lang/String;)V

    :cond_1
    iget-boolean p1, p0, Lj/d/d/e;->h:Z

    invoke-virtual {v0, p1}, Lj/d/d/b0/c;->g0(Z)V

    iget-boolean p1, p0, Lj/d/d/e;->j:Z

    invoke-virtual {v0, p1}, Lj/d/d/b0/c;->i0(Z)V

    iget-boolean p1, p0, Lj/d/d/e;->f:Z

    invoke-virtual {v0, p1}, Lj/d/d/b0/c;->j0(Z)V

    return-object v0
.end method

.method public s(Lj/d/d/k;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lj/d/d/e;->w(Lj/d/d/k;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lj/d/d/m;->a:Lj/d/d/m;

    invoke-virtual {p0, p1}, Lj/d/d/e;->s(Lj/d/d/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lj/d/d/e;->u(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lj/d/d/e;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/d/d/e;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj/d/d/e;->c:Lj/d/d/z/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lj/d/d/e;->y(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public v(Lj/d/d/k;Lj/d/d/b0/c;)V
    .locals 6

    invoke-virtual {p2}, Lj/d/d/b0/c;->T()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lj/d/d/b0/c;->i0(Z)V

    invoke-virtual {p2}, Lj/d/d/b0/c;->Q()Z

    move-result v1

    iget-boolean v2, p0, Lj/d/d/e;->h:Z

    invoke-virtual {p2, v2}, Lj/d/d/b0/c;->g0(Z)V

    invoke-virtual {p2}, Lj/d/d/b0/c;->O()Z

    move-result v2

    iget-boolean v3, p0, Lj/d/d/e;->f:Z

    invoke-virtual {p2, v3}, Lj/d/d/b0/c;->j0(Z)V

    :try_start_0
    invoke-static {p1, p2}, Lj/d/d/z/l;->b(Lj/d/d/k;Lj/d/d/b0/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v0}, Lj/d/d/b0/c;->i0(Z)V

    invoke-virtual {p2, v1}, Lj/d/d/b0/c;->g0(Z)V

    invoke-virtual {p2, v2}, Lj/d/d/b0/c;->j0(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AssertionError (GSON 2.9.0): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v3

    :catch_1
    move-exception p1

    new-instance v3, Lj/d/d/l;

    invoke-direct {v3, p1}, Lj/d/d/l;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {p2, v0}, Lj/d/d/b0/c;->i0(Z)V

    invoke-virtual {p2, v1}, Lj/d/d/b0/c;->g0(Z)V

    invoke-virtual {p2, v2}, Lj/d/d/b0/c;->j0(Z)V

    throw p1
.end method

.method public w(Lj/d/d/k;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p2}, Lj/d/d/z/l;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p2}, Lj/d/d/e;->r(Ljava/io/Writer;)Lj/d/d/b0/c;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lj/d/d/e;->v(Lj/d/d/k;Lj/d/d/b0/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lj/d/d/l;

    invoke-direct {p2, p1}, Lj/d/d/l;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public x(Ljava/lang/Object;Ljava/lang/reflect/Type;Lj/d/d/b0/c;)V
    .locals 5

    invoke-static {p2}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p2

    invoke-virtual {p3}, Lj/d/d/b0/c;->T()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p3, v1}, Lj/d/d/b0/c;->i0(Z)V

    invoke-virtual {p3}, Lj/d/d/b0/c;->Q()Z

    move-result v1

    iget-boolean v2, p0, Lj/d/d/e;->h:Z

    invoke-virtual {p3, v2}, Lj/d/d/b0/c;->g0(Z)V

    invoke-virtual {p3}, Lj/d/d/b0/c;->O()Z

    move-result v2

    iget-boolean v3, p0, Lj/d/d/e;->f:Z

    invoke-virtual {p3, v3}, Lj/d/d/b0/c;->j0(Z)V

    :try_start_0
    invoke-virtual {p2, p3, p1}, Lj/d/d/w;->d(Lj/d/d/b0/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, v0}, Lj/d/d/b0/c;->i0(Z)V

    invoke-virtual {p3, v1}, Lj/d/d/b0/c;->g0(Z)V

    invoke-virtual {p3, v2}, Lj/d/d/b0/c;->j0(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AssertionError (GSON 2.9.0): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lj/d/d/l;

    invoke-direct {p2, p1}, Lj/d/d/l;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {p3, v0}, Lj/d/d/b0/c;->i0(Z)V

    invoke-virtual {p3, v1}, Lj/d/d/b0/c;->g0(Z)V

    invoke-virtual {p3, v2}, Lj/d/d/b0/c;->j0(Z)V

    throw p1
.end method

.method public y(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p3}, Lj/d/d/z/l;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p3

    invoke-virtual {p0, p3}, Lj/d/d/e;->r(Ljava/io/Writer;)Lj/d/d/b0/c;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lj/d/d/e;->x(Ljava/lang/Object;Ljava/lang/reflect/Type;Lj/d/d/b0/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lj/d/d/l;

    invoke-direct {p2, p1}, Lj/d/d/l;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public z(Ljava/lang/Object;)Lj/d/d/k;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lj/d/d/m;->a:Lj/d/d/m;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lj/d/d/e;->A(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lj/d/d/k;

    move-result-object p1

    return-object p1
.end method
