.class public final Lcom/facebook/j0/w/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/j0/w/b$a;
    }
.end annotation


# static fields
.field private static final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lcom/facebook/j0/w/b$a;


# instance fields
.field private final a:Lcom/facebook/j0/w/a;

.field private final b:Lcom/facebook/j0/w/a;

.field private final c:Lcom/facebook/j0/w/a;

.field private final d:Lcom/facebook/j0/w/a;

.field private final e:Lcom/facebook/j0/w/a;

.field private final f:Lcom/facebook/j0/w/a;

.field private final g:Lcom/facebook/j0/w/a;

.field private final h:Lcom/facebook/j0/w/a;

.field private final i:Lcom/facebook/j0/w/a;

.field private final j:Lcom/facebook/j0/w/a;

.field private final k:Lcom/facebook/j0/w/a;

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/j0/w/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/j0/w/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/j0/w/b$a;-><init>(Ll/y/c/f;)V

    sput-object v0, Lcom/facebook/j0/w/b;->n:Lcom/facebook/j0/w/b$a;

    const/4 v0, 0x7

    new-array v0, v0, [Ll/l;

    const-string v1, "embedding.weight"

    const-string v2, "embed.weight"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "dense1.weight"

    const-string v2, "fc1.weight"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "dense2.weight"

    const-string v2, "fc2.weight"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "dense3.weight"

    const-string v2, "fc3.weight"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "dense1.bias"

    const-string v2, "fc1.bias"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "dense2.bias"

    const-string v2, "fc2.bias"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "dense3.bias"

    const-string v2, "fc3.bias"

    invoke-static {v1, v2}, Ll/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ll/l;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/t/a0;->e([Ll/l;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/j0/w/b;->m:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/j0/w/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "embed.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_d

    check-cast v0, Lcom/facebook/j0/w/a;

    iput-object v0, p0, Lcom/facebook/j0/w/b;->a:Lcom/facebook/j0/w/a;

    const-string v0, "convs.0.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    check-cast v0, Lcom/facebook/j0/w/a;

    invoke-static {v0}, Lcom/facebook/j0/w/f;->l(Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/j0/w/b;->b:Lcom/facebook/j0/w/a;

    const-string v0, "convs.1.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    check-cast v0, Lcom/facebook/j0/w/a;

    invoke-static {v0}, Lcom/facebook/j0/w/f;->l(Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/j0/w/b;->c:Lcom/facebook/j0/w/a;

    const-string v0, "convs.2.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    check-cast v0, Lcom/facebook/j0/w/a;

    invoke-static {v0}, Lcom/facebook/j0/w/f;->l(Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/j0/w/b;->d:Lcom/facebook/j0/w/a;

    const-string v0, "convs.0.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, Lcom/facebook/j0/w/a;

    iput-object v0, p0, Lcom/facebook/j0/w/b;->e:Lcom/facebook/j0/w/a;

    const-string v0, "convs.1.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v0, Lcom/facebook/j0/w/a;

    iput-object v0, p0, Lcom/facebook/j0/w/b;->f:Lcom/facebook/j0/w/a;

    const-string v0, "convs.2.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Lcom/facebook/j0/w/a;

    iput-object v0, p0, Lcom/facebook/j0/w/b;->g:Lcom/facebook/j0/w/a;

    const-string v0, "fc1.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Lcom/facebook/j0/w/a;

    invoke-static {v0}, Lcom/facebook/j0/w/f;->k(Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/j0/w/b;->h:Lcom/facebook/j0/w/a;

    const-string v0, "fc2.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Lcom/facebook/j0/w/a;

    invoke-static {v0}, Lcom/facebook/j0/w/f;->k(Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/j0/w/b;->i:Lcom/facebook/j0/w/a;

    const-string v0, "fc1.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Lcom/facebook/j0/w/a;

    iput-object v0, p0, Lcom/facebook/j0/w/b;->j:Lcom/facebook/j0/w/a;

    const-string v0, "fc2.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Lcom/facebook/j0/w/a;

    iput-object v0, p0, Lcom/facebook/j0/w/b;->k:Lcom/facebook/j0/w/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/j0/w/b;->l:Ljava/util/Map;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/j0/w/d$a;->a:Lcom/facebook/j0/w/d$a;

    invoke-virtual {v2}, Lcom/facebook/j0/w/d$a;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/j0/w/d$a;->b:Lcom/facebook/j0/w/d$a;

    invoke-virtual {v2}, Lcom/facebook/j0/w/d$a;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/t/f0;->f([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".weight"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".bias"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/j0/w/a;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/j0/w/a;

    if-eqz v3, :cond_1

    invoke-static {v3}, Lcom/facebook/j0/w/f;->k(Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v3

    iget-object v5, p0, Lcom/facebook/j0/w/b;->l:Ljava/util/Map;

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v4, :cond_0

    iget-object v2, p0, Lcom/facebook/j0/w/b;->l:Ljava/util/Map;

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ll/y/c/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/j0/w/b;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/Map;
    .locals 3

    const-class v0, Lcom/facebook/j0/w/b;

    invoke-static {v0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/j0/w/b;->m:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public final b(Lcom/facebook/j0/w/a;[Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/j0/w/a;
    .locals 7

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v0, "dense"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "texts"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x80

    iget-object v2, p0, Lcom/facebook/j0/w/b;->a:Lcom/facebook/j0/w/a;

    invoke-static {p2, v0, v2}, Lcom/facebook/j0/w/f;->e([Ljava/lang/String;ILcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object p2

    iget-object v0, p0, Lcom/facebook/j0/w/b;->b:Lcom/facebook/j0/w/a;

    invoke-static {p2, v0}, Lcom/facebook/j0/w/f;->c(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object p2

    iget-object v0, p0, Lcom/facebook/j0/w/b;->e:Lcom/facebook/j0/w/a;

    invoke-static {p2, v0}, Lcom/facebook/j0/w/f;->a(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)V

    invoke-static {p2}, Lcom/facebook/j0/w/f;->i(Lcom/facebook/j0/w/a;)V

    iget-object v0, p0, Lcom/facebook/j0/w/b;->c:Lcom/facebook/j0/w/a;

    invoke-static {p2, v0}, Lcom/facebook/j0/w/f;->c(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/j0/w/b;->f:Lcom/facebook/j0/w/a;

    invoke-static {v0, v2}, Lcom/facebook/j0/w/f;->a(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)V

    invoke-static {v0}, Lcom/facebook/j0/w/f;->i(Lcom/facebook/j0/w/a;)V

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/facebook/j0/w/f;->g(Lcom/facebook/j0/w/a;I)Lcom/facebook/j0/w/a;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/j0/w/b;->d:Lcom/facebook/j0/w/a;

    invoke-static {v0, v3}, Lcom/facebook/j0/w/f;->c(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/j0/w/b;->g:Lcom/facebook/j0/w/a;

    invoke-static {v3, v4}, Lcom/facebook/j0/w/f;->a(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)V

    invoke-static {v3}, Lcom/facebook/j0/w/f;->i(Lcom/facebook/j0/w/a;)V

    const/4 v4, 0x1

    invoke-virtual {p2, v4}, Lcom/facebook/j0/w/a;->b(I)I

    move-result v5

    invoke-static {p2, v5}, Lcom/facebook/j0/w/f;->g(Lcom/facebook/j0/w/a;I)Lcom/facebook/j0/w/a;

    move-result-object p2

    invoke-virtual {v0, v4}, Lcom/facebook/j0/w/a;->b(I)I

    move-result v5

    invoke-static {v0, v5}, Lcom/facebook/j0/w/f;->g(Lcom/facebook/j0/w/a;I)Lcom/facebook/j0/w/a;

    move-result-object v0

    invoke-virtual {v3, v4}, Lcom/facebook/j0/w/a;->b(I)I

    move-result v5

    invoke-static {v3, v5}, Lcom/facebook/j0/w/f;->g(Lcom/facebook/j0/w/a;I)Lcom/facebook/j0/w/a;

    move-result-object v3

    invoke-static {p2, v4}, Lcom/facebook/j0/w/f;->f(Lcom/facebook/j0/w/a;I)V

    invoke-static {v0, v4}, Lcom/facebook/j0/w/f;->f(Lcom/facebook/j0/w/a;I)V

    invoke-static {v3, v4}, Lcom/facebook/j0/w/f;->f(Lcom/facebook/j0/w/a;I)V

    const/4 v5, 0x4

    new-array v5, v5, [Lcom/facebook/j0/w/a;

    const/4 v6, 0x0

    aput-object p2, v5, v6

    aput-object v0, v5, v4

    aput-object v3, v5, v2

    const/4 p2, 0x3

    aput-object p1, v5, p2

    invoke-static {v5}, Lcom/facebook/j0/w/f;->b([Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/j0/w/b;->h:Lcom/facebook/j0/w/a;

    iget-object v0, p0, Lcom/facebook/j0/w/b;->j:Lcom/facebook/j0/w/a;

    invoke-static {p1, p2, v0}, Lcom/facebook/j0/w/f;->d(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/j0/w/f;->i(Lcom/facebook/j0/w/a;)V

    iget-object p2, p0, Lcom/facebook/j0/w/b;->i:Lcom/facebook/j0/w/a;

    iget-object v0, p0, Lcom/facebook/j0/w/b;->k:Lcom/facebook/j0/w/a;

    invoke-static {p1, p2, v0}, Lcom/facebook/j0/w/f;->d(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/j0/w/f;->i(Lcom/facebook/j0/w/a;)V

    iget-object p2, p0, Lcom/facebook/j0/w/b;->l:Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".weight"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/j0/w/a;

    iget-object v0, p0, Lcom/facebook/j0/w/b;->l:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ".bias"

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/facebook/j0/w/a;

    if-eqz p2, :cond_2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2, p3}, Lcom/facebook/j0/w/f;->d(Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;Lcom/facebook/j0/w/a;)Lcom/facebook/j0/w/a;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/j0/w/f;->j(Lcom/facebook/j0/w/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :cond_2
    :goto_0
    return-object v1

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v1
.end method
