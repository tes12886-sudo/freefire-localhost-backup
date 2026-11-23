.class public final Lj/d/d/z/n/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/d/d/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/d/d/z/n/h$a;
    }
.end annotation


# instance fields
.field private final a:Lj/d/d/z/c;

.field final b:Z


# direct methods
.method public constructor <init>(Lj/d/d/z/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d/d/z/n/h;->a:Lj/d/d/z/c;

    iput-boolean p2, p0, Lj/d/d/z/n/h;->b:Z

    return-void
.end method

.method private b(Lj/d/d/e;Ljava/lang/reflect/Type;)Lj/d/d/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/d/d/e;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lj/d/d/w<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, Lj/d/d/z/n/n;->f:Lj/d/d/w;

    :goto_1
    return-object p1
.end method


# virtual methods
.method public a(Lj/d/d/e;Lj/d/d/a0/a;)Lj/d/d/w;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj/d/d/e;",
            "Lj/d/d/a0/a<",
            "TT;>;)",
            "Lj/d/d/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lj/d/d/a0/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lj/d/d/a0/a;->getRawType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0}, Lj/d/d/z/b;->k(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lj/d/d/z/b;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-direct {p0, p1, v2}, Lj/d/d/z/n/h;->b(Lj/d/d/e;Ljava/lang/reflect/Type;)Lj/d/d/w;

    move-result-object v7

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-static {v3}, Lj/d/d/a0/a;->get(Ljava/lang/reflect/Type;)Lj/d/d/a0/a;

    move-result-object v3

    invoke-virtual {p1, v3}, Lj/d/d/e;->m(Lj/d/d/a0/a;)Lj/d/d/w;

    move-result-object v9

    iget-object v3, p0, Lj/d/d/z/n/h;->a:Lj/d/d/z/c;

    invoke-virtual {v3, p2}, Lj/d/d/z/c;->a(Lj/d/d/a0/a;)Lj/d/d/z/i;

    move-result-object v10

    new-instance p2, Lj/d/d/z/n/h$a;

    aget-object v6, v0, v1

    aget-object v8, v0, v2

    move-object v3, p2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Lj/d/d/z/n/h$a;-><init>(Lj/d/d/z/n/h;Lj/d/d/e;Ljava/lang/reflect/Type;Lj/d/d/w;Ljava/lang/reflect/Type;Lj/d/d/w;Lj/d/d/z/i;)V

    return-object p2
.end method
