.class public Lj/g/a/a/a/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/r;
.implements Lj/d/d/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj/d/d/r<",
        "Lj/g/a/a/a/a;",
        ">;",
        "Lj/d/d/j<",
        "Lj/g/a/a/a/a;",
        ">;"
    }
.end annotation


# static fields
.field static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lj/g/a/a/a/a;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lj/d/d/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lj/g/a/a/a/b;->b:Ljava/util/Map;

    const-class v1, Lj/g/a/a/a/r;

    const-string v2, "oauth1a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lj/g/a/a/a/y/j/f;

    const-string v2, "oauth2"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lj/g/a/a/a/y/j/a;

    const-string v2, "guest"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/d/d/e;

    invoke-direct {v0}, Lj/d/d/e;-><init>()V

    iput-object v0, p0, Lj/g/a/a/a/b;->a:Lj/d/d/e;

    return-void
.end method

.method static d(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lj/g/a/a/a/a;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Lj/g/a/a/a/b;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    const-string p0, ""

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lj/d/d/k;Ljava/lang/reflect/Type;Lj/d/d/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lj/g/a/a/a/b;->c(Lj/d/d/k;Ljava/lang/reflect/Type;Lj/d/d/i;)Lj/g/a/a/a/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/reflect/Type;Lj/d/d/q;)Lj/d/d/k;
    .locals 0

    check-cast p1, Lj/g/a/a/a/a;

    invoke-virtual {p0, p1, p2, p3}, Lj/g/a/a/a/b;->e(Lj/g/a/a/a/a;Ljava/lang/reflect/Type;Lj/d/d/q;)Lj/d/d/k;

    move-result-object p1

    return-object p1
.end method

.method public c(Lj/d/d/k;Ljava/lang/reflect/Type;Lj/d/d/i;)Lj/g/a/a/a/a;
    .locals 1

    invoke-virtual {p1}, Lj/d/d/k;->c()Lj/d/d/n;

    move-result-object p1

    const-string p2, "auth_type"

    invoke-virtual {p1, p2}, Lj/d/d/n;->u(Ljava/lang/String;)Lj/d/d/p;

    move-result-object p2

    invoke-virtual {p2}, Lj/d/d/p;->f()Ljava/lang/String;

    move-result-object p2

    const-string p3, "auth_token"

    invoke-virtual {p1, p3}, Lj/d/d/n;->t(Ljava/lang/String;)Lj/d/d/k;

    move-result-object p1

    iget-object p3, p0, Lj/g/a/a/a/b;->a:Lj/d/d/e;

    sget-object v0, Lj/g/a/a/a/b;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p3, p1, p2}, Lj/d/d/e;->g(Lj/d/d/k;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/g/a/a/a/a;

    return-object p1
.end method

.method public e(Lj/g/a/a/a/a;Ljava/lang/reflect/Type;Lj/d/d/q;)Lj/d/d/k;
    .locals 1

    new-instance p2, Lj/d/d/n;

    invoke-direct {p2}, Lj/d/d/n;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-static {p3}, Lj/g/a/a/a/b;->d(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "auth_type"

    invoke-virtual {p2, v0, p3}, Lj/d/d/n;->r(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lj/g/a/a/a/b;->a:Lj/d/d/e;

    invoke-virtual {p3, p1}, Lj/d/d/e;->z(Ljava/lang/Object;)Lj/d/d/k;

    move-result-object p1

    const-string p3, "auth_token"

    invoke-virtual {p2, p3, p1}, Lj/d/d/n;->q(Ljava/lang/String;Lj/d/d/k;)V

    return-object p2
.end method
