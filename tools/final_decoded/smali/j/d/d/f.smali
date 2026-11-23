.class public final Lj/d/d/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lj/d/d/z/d;

.field private b:Lj/d/d/t;

.field private c:Lj/d/d/d;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lj/d/d/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Lj/d/d/v;

.field private s:Lj/d/d/v;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj/d/d/z/d;->g:Lj/d/d/z/d;

    iput-object v0, p0, Lj/d/d/f;->a:Lj/d/d/z/d;

    sget-object v0, Lj/d/d/t;->a:Lj/d/d/t;

    iput-object v0, p0, Lj/d/d/f;->b:Lj/d/d/t;

    sget-object v0, Lj/d/d/c;->a:Lj/d/d/c;

    iput-object v0, p0, Lj/d/d/f;->c:Lj/d/d/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj/d/d/f;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj/d/d/f;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj/d/d/f;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/d/d/f;->g:Z

    sget-object v1, Lj/d/d/e;->m:Ljava/lang/String;

    iput-object v1, p0, Lj/d/d/f;->h:Ljava/lang/String;

    const/4 v1, 0x2

    iput v1, p0, Lj/d/d/f;->i:I

    iput v1, p0, Lj/d/d/f;->j:I

    iput-boolean v0, p0, Lj/d/d/f;->k:Z

    iput-boolean v0, p0, Lj/d/d/f;->l:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lj/d/d/f;->m:Z

    iput-boolean v0, p0, Lj/d/d/f;->n:Z

    iput-boolean v0, p0, Lj/d/d/f;->o:Z

    iput-boolean v0, p0, Lj/d/d/f;->p:Z

    iput-boolean v1, p0, Lj/d/d/f;->q:Z

    sget-object v0, Lj/d/d/e;->o:Lj/d/d/v;

    iput-object v0, p0, Lj/d/d/f;->r:Lj/d/d/v;

    sget-object v0, Lj/d/d/e;->p:Lj/d/d/v;

    iput-object v0, p0, Lj/d/d/f;->s:Lj/d/d/v;

    return-void
.end method

.method private a(Ljava/lang/String;IILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lj/d/d/x;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lj/d/d/z/p/d;->a:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p2, Lj/d/d/z/n/d$b;->b:Lj/d/d/z/n/d$b;

    invoke-virtual {p2, p1}, Lj/d/d/z/n/d$b;->b(Ljava/lang/String;)Lj/d/d/x;

    move-result-object p2

    if-eqz v0, :cond_0

    sget-object p3, Lj/d/d/z/p/d;->c:Lj/d/d/z/n/d$b;

    invoke-virtual {p3, p1}, Lj/d/d/z/n/d$b;->b(Ljava/lang/String;)Lj/d/d/x;

    move-result-object v1

    sget-object p3, Lj/d/d/z/p/d;->b:Lj/d/d/z/n/d$b;

    invoke-virtual {p3, p1}, Lj/d/d/z/n/d$b;->b(Ljava/lang/String;)Lj/d/d/x;

    move-result-object p1

    goto :goto_1

    :cond_0
    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    if-eq p3, p1, :cond_3

    sget-object p1, Lj/d/d/z/n/d$b;->b:Lj/d/d/z/n/d$b;

    invoke-virtual {p1, p2, p3}, Lj/d/d/z/n/d$b;->a(II)Lj/d/d/x;

    move-result-object p1

    if-eqz v0, :cond_2

    sget-object v1, Lj/d/d/z/p/d;->c:Lj/d/d/z/n/d$b;

    invoke-virtual {v1, p2, p3}, Lj/d/d/z/n/d$b;->a(II)Lj/d/d/x;

    move-result-object v1

    sget-object v2, Lj/d/d/z/p/d;->b:Lj/d/d/z/n/d$b;

    invoke-virtual {v2, p2, p3}, Lj/d/d/z/n/d$b;->a(II)Lj/d/d/x;

    move-result-object p2

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_1

    :cond_2
    move-object p2, p1

    goto :goto_0

    :goto_1
    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_3

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public b()Lj/d/d/e;
    .locals 24

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v19, v1

    iget-object v2, v0, Lj/d/d/f;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Lj/d/d/f;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lj/d/d/f;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lj/d/d/f;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, Lj/d/d/f;->h:Ljava/lang/String;

    iget v3, v0, Lj/d/d/f;->i:I

    iget v4, v0, Lj/d/d/f;->j:I

    invoke-direct {v0, v2, v3, v4, v1}, Lj/d/d/f;->a(Ljava/lang/String;IILjava/util/List;)V

    new-instance v22, Lj/d/d/e;

    move-object/from16 v1, v22

    iget-object v2, v0, Lj/d/d/f;->a:Lj/d/d/z/d;

    iget-object v3, v0, Lj/d/d/f;->c:Lj/d/d/d;

    iget-object v4, v0, Lj/d/d/f;->d:Ljava/util/Map;

    iget-boolean v5, v0, Lj/d/d/f;->g:Z

    iget-boolean v6, v0, Lj/d/d/f;->k:Z

    iget-boolean v7, v0, Lj/d/d/f;->o:Z

    iget-boolean v8, v0, Lj/d/d/f;->m:Z

    iget-boolean v9, v0, Lj/d/d/f;->n:Z

    iget-boolean v10, v0, Lj/d/d/f;->p:Z

    iget-boolean v11, v0, Lj/d/d/f;->l:Z

    iget-boolean v12, v0, Lj/d/d/f;->q:Z

    iget-object v13, v0, Lj/d/d/f;->b:Lj/d/d/t;

    iget-object v14, v0, Lj/d/d/f;->h:Ljava/lang/String;

    iget v15, v0, Lj/d/d/f;->i:I

    move-object/from16 v23, v1

    iget v1, v0, Lj/d/d/f;->j:I

    move/from16 v16, v1

    iget-object v1, v0, Lj/d/d/f;->e:Ljava/util/List;

    move-object/from16 v17, v1

    iget-object v1, v0, Lj/d/d/f;->f:Ljava/util/List;

    move-object/from16 v18, v1

    iget-object v1, v0, Lj/d/d/f;->r:Lj/d/d/v;

    move-object/from16 v20, v1

    iget-object v1, v0, Lj/d/d/f;->s:Lj/d/d/v;

    move-object/from16 v21, v1

    move-object/from16 v1, v23

    invoke-direct/range {v1 .. v21}, Lj/d/d/e;-><init>(Lj/d/d/z/d;Lj/d/d/d;Ljava/util/Map;ZZZZZZZZLj/d/d/t;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lj/d/d/v;Lj/d/d/v;)V

    return-object v22
.end method

.method public c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lj/d/d/f;
    .locals 3

    instance-of v0, p2, Lj/d/d/r;

    if-nez v0, :cond_1

    instance-of v1, p2, Lj/d/d/j;

    if-nez v1, :cond_1

    instance-of v1, p2, Lj/d/d/g;

    if-nez v1, :cond_1

    instance-of v1, p2, Lj/d/d/w;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lj/d/d/z/a;->a(Z)V

    instance-of v1, p2, Lj/d/d/g;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lj/d/d/f;->d:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Lj/d/d/g;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    instance-of v0, p2, Lj/d/d/j;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p1}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object v0

    iget-object v1, p0, Lj/d/d/f;->e:Ljava/util/List;

    invoke-static {v0, p2}, Lj/d/d/z/n/l;->f(Lj/d/d/a0/a;Ljava/lang/Object;)Lj/d/d/x;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p2, Lj/d/d/w;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lj/d/d/f;->e:Ljava/util/List;

    invoke-static {p1}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object p1

    check-cast p2, Lj/d/d/w;

    invoke-static {p1, p2}, Lj/d/d/z/n/n;->a(Lj/d/d/a0/a;Lj/d/d/w;)Lj/d/d/x;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0
.end method

.method public d(Lj/d/d/x;)Lj/d/d/f;
    .locals 1

    iget-object v0, p0, Lj/d/d/f;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
